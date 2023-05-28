package p015cm.aptoide.p016pt.view.swipe;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10483v;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.util.ErrorUtils;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.LoadInterface;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.swipe.LoaderLayoutHandler */
public class LoaderLayoutHandler {
    private ErrorView errorView;
    final LoadInterface loadInterface;
    protected ProgressBar progressBar;
    private List<View> viewsToShowAfterLoading = new ArrayList();
    private final List<Integer> viewsToShowAfterLoadingId = new ArrayList();

    public LoaderLayoutHandler(LoadInterface loadInterface2, int i) {
        this.viewsToShowAfterLoadingId.add(Integer.valueOf(i));
        this.loadInterface = loadInterface2;
    }

    /* renamed from: a */
    static /* synthetic */ void m10505a(Object obj) {
    }

    private void hideViewsToShowAfterLoading() {
        for (View next : this.viewsToShowAfterLoading) {
            if (next != null) {
                next.setVisibility(8);
            }
        }
    }

    private void showViewsToShowAfterLoading() {
        for (View visibility : this.viewsToShowAfterLoading) {
            visibility.setVisibility(0);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C10483v mo18891b() {
        restoreState();
        this.loadInterface.load(true, false, (Bundle) null);
        return null;
    }

    public void bindViews(View view) {
        for (Integer intValue : this.viewsToShowAfterLoadingId) {
            this.viewsToShowAfterLoading.add(view.findViewById(intValue.intValue()));
        }
        hideViewsToShowAfterLoading();
        ProgressBar progressBar2 = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.progressBar = progressBar2;
        progressBar2.setVisibility(0);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
    }

    public void finishLoading(Throwable th) {
        CrashReport.getInstance().log(th);
        AptoideUtils.ThreadU.runOnUiThread(new C5533c(this, th));
    }

    /* access modifiers changed from: protected */
    /* renamed from: onFinishLoading */
    public void mo18890a(Throwable th) {
        this.progressBar.setVisibility(8);
        hideViewsToShowAfterLoading();
        if (ErrorUtils.isNoNetworkConnection(th)) {
            this.errorView.setError(ErrorView.Error.NO_NETWORK);
        } else {
            this.errorView.setError(ErrorView.Error.GENERIC);
        }
        this.errorView.setVisibility(0);
        this.errorView.setRetryAction(new C5531a(this));
    }

    /* access modifiers changed from: protected */
    public void restoreState() {
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    public void unbindViews() {
        this.errorView = null;
        this.progressBar = null;
    }

    /* renamed from: a */
    public /* synthetic */ Object mo18889a() throws Exception {
        onFinishLoading();
        return null;
    }

    public void finishLoading() {
        C5368e.m10240a(new C5535e(this)).mo18662b(C5376a.m10346b()).mo18655a(C5534d.f9801f, (C5378b<Throwable>) C5532b.f9798f);
    }

    public LoaderLayoutHandler(LoadInterface loadInterface2, int... iArr) {
        for (int valueOf : iArr) {
            this.viewsToShowAfterLoadingId.add(Integer.valueOf(valueOf));
        }
        this.loadInterface = loadInterface2;
    }

    /* access modifiers changed from: protected */
    public void onFinishLoading() {
        this.progressBar.setVisibility(8);
        showViewsToShowAfterLoading();
    }
}
