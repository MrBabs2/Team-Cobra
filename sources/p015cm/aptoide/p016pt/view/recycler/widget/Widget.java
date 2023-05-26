package p015cm.aptoide.p016pt.view.recycler.widget;

import android.view.View;
import androidx.fragment.app.C0456c;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.view.recycler.widget.Widget */
public abstract class Widget<T extends Displayable> extends RecyclerView.C0629c0 {
    private ActivityNavigator activityNavigator = ((ActivityResultNavigator) getContext()).getActivityNavigator();
    protected C5383b compositeSubscription;
    private final FragmentNavigator fragmentNavigator = ((ActivityResultNavigator) getContext()).getFragmentNavigator();

    public Widget(View view) {
        super(view);
        try {
            assignViews(view);
        } catch (Exception e) {
            CrashReport.getInstance().log(e);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void assignViews(View view);

    public abstract void bindView(T t, int i);

    /* access modifiers changed from: protected */
    public ActivityNavigator getActivityNavigator() {
        return this.activityNavigator;
    }

    public C0456c getContext() {
        return (C0456c) this.itemView.getContext();
    }

    /* access modifiers changed from: protected */
    public FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public View getRootView() {
        return getFragmentNavigator().peekLast().getView();
    }

    public void internalBindView(T t, int i) {
        if (this.compositeSubscription == null) {
            this.compositeSubscription = new C5383b();
        }
        t.setVisible(true);
        bindView(t, i);
    }

    public void unbindView() {
        C5383b bVar = this.compositeSubscription;
        if (bVar != null && !bVar.isUnsubscribed()) {
            this.compositeSubscription.mo18720a();
        }
    }
}
