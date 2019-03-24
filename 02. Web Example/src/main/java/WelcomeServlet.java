import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) {
        try {
            PrintWriter writer = response.getWriter();
            writer.print("<h1>Hello<h1>");
            writer.print("<h2>Marsel<h2>");
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }
}
