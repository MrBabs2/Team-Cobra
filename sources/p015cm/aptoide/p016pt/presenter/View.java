package p015cm.aptoide.p016pt.presenter;

import com.trello.rxlifecycle.C4749b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.presenter.View */
public interface View {

    /* renamed from: cm.aptoide.pt.presenter.View$LifecycleEvent */
    public enum LifecycleEvent {
        CREATE,
        START,
        RESUME,
        PAUSE,
        STOP,
        DESTROY
    }

    void attachPresenter(Presenter presenter);

    <T> C4749b<T> bindUntilEvent(LifecycleEvent lifecycleEvent);

    C5368e<LifecycleEvent> getLifecycleEvent();
}
