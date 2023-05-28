package p015cm.aptoide.p016pt.view.recycler;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p123rx.C5375k;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.view.recycler.RecyclerViewHolder */
public abstract class RecyclerViewHolder<T> extends RecyclerView.C0629c0 {
    private C5383b compositeSubscription = new C5383b();
    private Context context;
    private T viewModel;

    protected RecyclerViewHolder(View view) {
        super(view);
        this.context = view.getContext();
    }

    /* access modifiers changed from: protected */
    public void addSubscription(C5375k kVar) {
        this.compositeSubscription.mo18721a(kVar);
    }

    /* access modifiers changed from: protected */
    public T getViewModel() {
        return this.viewModel;
    }

    public abstract int getViewResource();

    public final void releaseSubscriptions() {
        if (this.compositeSubscription.mo18723b() && !this.compositeSubscription.isUnsubscribed()) {
            this.compositeSubscription.unsubscribe();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void update(Context context2, T t);

    public final void updateViewModel(T t) {
        this.viewModel = t;
        update(this.context, t);
    }
}
