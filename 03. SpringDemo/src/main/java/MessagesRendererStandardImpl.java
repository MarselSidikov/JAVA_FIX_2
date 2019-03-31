/**
 * 29.03.2019
 * MessagesRendererStandardImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessagesRendererStandardImpl implements MessagesRenderer {
    private Message message;

    public MessagesRendererStandardImpl(Message message) {
        this.message = message;
    }

    public void show() {
        System.out.println(message.getText());
    }
}
