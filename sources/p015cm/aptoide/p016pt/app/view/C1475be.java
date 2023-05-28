package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.app.AppViewSimilarApp;
import p015cm.aptoide.p016pt.app.view.AppViewSimilarAppsAdapter;

/* renamed from: cm.aptoide.pt.app.view.be */
/* compiled from: lambda */
public final /* synthetic */ class C1475be implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewSimilarAppViewHolder f3984f;

    /* renamed from: g */
    private final /* synthetic */ AppViewSimilarApp f3985g;

    /* renamed from: h */
    private final /* synthetic */ AppViewSimilarAppsAdapter.SimilarAppType f3986h;

    public /* synthetic */ C1475be(AppViewSimilarAppViewHolder appViewSimilarAppViewHolder, AppViewSimilarApp appViewSimilarApp, AppViewSimilarAppsAdapter.SimilarAppType similarAppType) {
        this.f3984f = appViewSimilarAppViewHolder;
        this.f3985g = appViewSimilarApp;
        this.f3986h = similarAppType;
    }

    public final void onClick(View view) {
        this.f3984f.mo7516b(this.f3985g, this.f3986h, view);
    }
}
