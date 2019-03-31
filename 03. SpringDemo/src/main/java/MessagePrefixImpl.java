/**
 * 29.03.2019
 * MessagePrefixImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessagePrefixImpl implements Message {

    private String text;
    private String prefix;

    public MessagePrefixImpl(String prefix) {
        this.prefix = prefix;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.prefix + " " + this.text;
    }
}
