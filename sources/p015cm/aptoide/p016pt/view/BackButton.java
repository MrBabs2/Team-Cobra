package p015cm.aptoide.p016pt.view;

/* renamed from: cm.aptoide.pt.view.BackButton */
public interface BackButton {

    /* renamed from: cm.aptoide.pt.view.BackButton$ClickHandler */
    public interface ClickHandler {
        boolean handle();
    }

    void registerClickHandler(ClickHandler clickHandler);

    void unregisterClickHandler(ClickHandler clickHandler);
}
