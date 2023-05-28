package p015cm.aptoide.p016pt.store.view.p028my;

import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.store.view.my.MyStoresView */
public interface MyStoresView extends View {
    C5368e<Void> imageClick();

    void scrollToTop();

    void setDefaultUserImage();

    void setUserImage(String str);

    void showAvatar();
}
