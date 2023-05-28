package p015cm.aptoide.p016pt.view.swipe;

import android.view.View;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.LoadInterface;
import p015cm.aptoide.p016pt.view.ReloadInterface;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeFragment;
import p050l.p106r.p107a.C5189c;

/* renamed from: cm.aptoide.pt.view.swipe.SwipeLoaderLayoutHandler */
public class SwipeLoaderLayoutHandler extends LoaderLayoutHandler {
    private C5189c swipeContainer;

    public SwipeLoaderLayoutHandler(int i, ReloadInterface reloadInterface) {
        super((LoadInterface) reloadInterface, i);
    }

    public void bindViews(View view) {
        super.bindViews(view);
        C5189c cVar = (C5189c) view.findViewById(C1086R.C1088id.swipe_container);
        this.swipeContainer = cVar;
        cVar.setOnRefreshListener(new C5536f(this));
    }

    /* renamed from: c */
    public /* synthetic */ void mo18899c() {
        ((ReloadInterface) this.loadInterface).reload();
    }

    public void onFinishLoading(Throwable th) {
        super.mo18890a(th);
        this.swipeContainer.setRefreshing(false);
        this.swipeContainer.setEnabled(false);
    }

    public void restoreState() {
        super.restoreState();
        this.swipeContainer.setEnabled(true);
    }

    public void unbindViews() {
        this.swipeContainer.setOnRefreshListener((C5189c.C5199j) null);
        super.unbindViews();
    }

    public SwipeLoaderLayoutHandler(int[] iArr, GridRecyclerSwipeFragment gridRecyclerSwipeFragment) {
        super((LoadInterface) gridRecyclerSwipeFragment, iArr);
    }

    /* access modifiers changed from: protected */
    public void onFinishLoading() {
        super.onFinishLoading();
        this.swipeContainer.setRefreshing(false);
        this.swipeContainer.setEnabled(true);
    }
}
