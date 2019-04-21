package ru.fix.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.fix.service.models.User;
import ru.fix.service.repositories.UsersRepository;

import java.util.Optional;

@Service(value = "customUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userCandidate = usersRepository.findFirstByEmail(email);
        if (userCandidate.isPresent()) {
            return new UserDetailsImpl(userCandidate.get());
        }
        throw new SecurityException("User not found with email <" + email + ">");
    }
}
