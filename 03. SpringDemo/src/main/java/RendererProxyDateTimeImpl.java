import java.time.LocalDateTime;

/**
 * 29.03.2019
 * RendererProxyDateTimeImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RendererProxyDateTimeImpl implements RendererProxy {

    private MessagesRenderer renderer;

    public void setRenderer(MessagesRenderer renderer) {
        this.renderer = renderer;
    }

    public void render() {
        System.out.println(LocalDateTime.now().getNano());
        renderer.show();
        System.out.println(LocalDateTime.now().getNano());
    }
}
