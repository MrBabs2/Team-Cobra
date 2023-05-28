package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.view.LoadInterface;
import p015cm.aptoide.p016pt.view.swipe.LoaderLayoutHandler;

/* renamed from: cm.aptoide.pt.view.fragment.BaseLoaderFragment */
public abstract class BaseLoaderFragment extends UIComponentFragment implements LoadInterface {
    private boolean create = true;
    private LoaderLayoutHandler loaderLayoutHandler;

    public void bindViews(View view) {
        LoaderLayoutHandler loaderLayoutHandler2 = this.loaderLayoutHandler;
        if (loaderLayoutHandler2 != null) {
            loaderLayoutHandler2.bindViews(view);
        }
        if (!this.create) {
            finishLoading();
        }
    }

    /* access modifiers changed from: protected */
    public LoaderLayoutHandler createLoaderLayoutHandler() {
        if (getViewsToShowAfterLoadingId().length > 0) {
            return new LoaderLayoutHandler((LoadInterface) this, getViewsToShowAfterLoadingId());
        }
        return new LoaderLayoutHandler((LoadInterface) this, getViewToShowAfterLoadingId());
    }

    /* access modifiers changed from: protected */
    public void finishLoading() {
        LoaderLayoutHandler loaderLayoutHandler2 = this.loaderLayoutHandler;
        if (loaderLayoutHandler2 != null) {
            loaderLayoutHandler2.finishLoading();
        }
    }

    /* access modifiers changed from: protected */
    public abstract int getViewToShowAfterLoadingId();

    /* access modifiers changed from: protected */
    public abstract int[] getViewsToShowAfterLoadingId();

    public boolean isCreate() {
        return this.create;
    }

    public abstract void load(boolean z, boolean z2, Bundle bundle);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.loaderLayoutHandler = createLoaderLayoutHandler();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        LoaderLayoutHandler loaderLayoutHandler2 = this.loaderLayoutHandler;
        if (loaderLayoutHandler2 != null) {
            loaderLayoutHandler2.unbindViews();
            this.loaderLayoutHandler = null;
        }
    }

    public void onStop() {
        super.onStop();
        this.create = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        load(this.create, false, bundle);
    }

    /* access modifiers changed from: protected */
    public void finishLoading(Throwable th) {
        LoaderLayoutHandler loaderLayoutHandler2 = this.loaderLayoutHandler;
        if (loaderLayoutHandler2 != null) {
            loaderLayoutHandler2.finishLoading(th);
        }
        CrashReport.getInstance().log(th);
    }
}
