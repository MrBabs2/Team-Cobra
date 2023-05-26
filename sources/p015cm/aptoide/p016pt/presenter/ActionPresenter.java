package p015cm.aptoide.p016pt.presenter;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H$J\u001c\u0010\u0010\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\n\u001a\u00020\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/pt/presenter/ActionPresenter;", "T", "", "()V", "eventObservable", "Lrx/Observable;", "getEventObservable", "()Lrx/Observable;", "setEventObservable", "(Lrx/Observable;)V", "lifecycleView", "Lcm/aptoide/pt/presenter/View;", "getLifecycleView", "()Lcm/aptoide/pt/presenter/View;", "setLifecycleView", "(Lcm/aptoide/pt/presenter/View;)V", "present", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.presenter.ActionPresenter */
/* compiled from: ActionPresenter.kt */
public abstract class ActionPresenter<T> {
    protected C5368e<T> eventObservable;
    protected View lifecycleView;

    /* access modifiers changed from: protected */
    public final C5368e<T> getEventObservable() {
        C5368e<T> eVar = this.eventObservable;
        if (eVar != null) {
            return eVar;
        }
        C10202j.m34181d("eventObservable");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final View getLifecycleView() {
        View view = this.lifecycleView;
        if (view != null) {
            return view;
        }
        C10202j.m34181d("lifecycleView");
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract void present();

    public final void present(C5368e<T> eVar, View view) {
        C10202j.m34178b(eVar, "eventObservable");
        C10202j.m34178b(view, "lifecycleView");
        this.eventObservable = eVar;
        this.lifecycleView = view;
        present();
    }

    /* access modifiers changed from: protected */
    public final void setEventObservable(C5368e<T> eVar) {
        C10202j.m34178b(eVar, "<set-?>");
        this.eventObservable = eVar;
    }

    /* access modifiers changed from: protected */
    public final void setLifecycleView(View view) {
        C10202j.m34178b(view, "<set-?>");
        this.lifecycleView = view;
    }
}
