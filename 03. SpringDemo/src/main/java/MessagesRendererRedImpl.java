/**
 * 29.03.2019
 * MessagesRendererRedImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessagesRendererRedImpl implements MessagesRenderer {
    private Message message;

    public MessagesRendererRedImpl(Message message) {
        this.message = message;
    }
    public void show() {
        System.err.println(message.getText());
    }
}
