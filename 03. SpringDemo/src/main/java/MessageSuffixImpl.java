/**
 * 29.03.2019
 * MessageSuffixImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessageSuffixImpl implements Message {
    private String text;
    private String suffix;

    public MessageSuffixImpl(String suffix) {
        this.suffix = suffix;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return  this.text + " " + this.suffix;
    }
}
