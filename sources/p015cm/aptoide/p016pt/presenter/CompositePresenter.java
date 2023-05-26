package p015cm.aptoide.p016pt.presenter;

import java.util.List;

/* renamed from: cm.aptoide.pt.presenter.CompositePresenter */
public final class CompositePresenter implements Presenter {
    private final List<Presenter> presenters;

    public CompositePresenter(List<Presenter> list) {
        this.presenters = list;
    }

    public void present() {
        for (Presenter present : this.presenters) {
            present.present();
        }
    }
}
