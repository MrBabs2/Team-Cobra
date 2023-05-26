package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.app.AppViewSimilarApp;
import p015cm.aptoide.p016pt.app.view.AppViewSimilarAppsAdapter;

/* renamed from: cm.aptoide.pt.app.view.ae */
/* compiled from: lambda */
public final /* synthetic */ class C1456ae implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewSimilarAppViewHolder f3960f;

    /* renamed from: g */
    private final /* synthetic */ AppViewSimilarApp f3961g;

    /* renamed from: h */
    private final /* synthetic */ AppViewSimilarAppsAdapter.SimilarAppType f3962h;

    public /* synthetic */ C1456ae(AppViewSimilarAppViewHolder appViewSimilarAppViewHolder, AppViewSimilarApp appViewSimilarApp, AppViewSimilarAppsAdapter.SimilarAppType similarAppType) {
        this.f3960f = appViewSimilarAppViewHolder;
        this.f3961g = appViewSimilarApp;
        this.f3962h = similarAppType;
    }

    public final void onClick(View view) {
        this.f3960f.mo7515a(this.f3961g, this.f3962h, view);
    }
}
