package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.ReloadInterface;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.swipe.LoaderLayoutHandler;
import p015cm.aptoide.p016pt.view.swipe.SwipeLoaderLayoutHandler;

/* renamed from: cm.aptoide.pt.view.fragment.GridRecyclerSwipeFragment */
public abstract class GridRecyclerSwipeFragment<T extends BaseAdapter> extends GridRecyclerFragmentWithDecorator<T> implements ReloadInterface {
    protected String storeTheme;

    /* renamed from: cm.aptoide.pt.view.fragment.GridRecyclerSwipeFragment$BundleCons */
    protected static class BundleCons {
        public static final String STORE_THEME = "storeTheme";

        protected BundleCons() {
        }
    }

    /* access modifiers changed from: protected */
    public LoaderLayoutHandler createLoaderLayoutHandler() {
        if (getViewsToShowAfterLoadingId().length > 0) {
            return new SwipeLoaderLayoutHandler(getViewsToShowAfterLoadingId(), this);
        }
        return new SwipeLoaderLayoutHandler(getViewToShowAfterLoadingId(), (ReloadInterface) this);
    }

    public int getContentViewId() {
        return C1086R.layout.recycler_swipe_fragment;
    }

    public void reload() {
        load(false, true, (Bundle) null);
    }
}
