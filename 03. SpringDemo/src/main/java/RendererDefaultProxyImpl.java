/**
 * 29.03.2019
 * RendererDefaultProxyImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class RendererDefaultProxyImpl implements RendererProxy {

    private MessagesRenderer renderer;

    @Override
    public void setRenderer(MessagesRenderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void render() {
        System.out.println(System.nanoTime());
        renderer.show();
        System.out.println(System.nanoTime());
    }
}
