import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * 29.03.2019
 * Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Application {
    public static void main(String[] args) {
//        Message message = new MessageSuffixImpl("BYE");
//        message.setText("Hello World!");
//        MessagesRenderer renderer = new MessagesRendererStandardImpl(message);
//        RendererProxy proxy = new RendererProxyDateTimeImpl();
//        proxy.setRenderer(renderer);
//        proxy.render();

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        RendererProxy proxy = context.getBean(RendererProxy.class);
        proxy.render();
    }
}
