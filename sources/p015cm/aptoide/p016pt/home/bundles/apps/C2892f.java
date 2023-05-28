package p015cm.aptoide.p016pt.home.bundles.apps;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.home.bundles.apps.f */
/* compiled from: lambda */
public final /* synthetic */ class C2892f implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ RewardAppInBundleViewHolder f5751f;

    /* renamed from: g */
    private final /* synthetic */ Application f5752g;

    /* renamed from: h */
    private final /* synthetic */ HomeBundle f5753h;

    /* renamed from: i */
    private final /* synthetic */ int f5754i;

    public /* synthetic */ C2892f(RewardAppInBundleViewHolder rewardAppInBundleViewHolder, Application application, HomeBundle homeBundle, int i) {
        this.f5751f = rewardAppInBundleViewHolder;
        this.f5752g = application;
        this.f5753h = homeBundle;
        this.f5754i = i;
    }

    public final void onClick(View view) {
        this.f5751f.mo12317a(this.f5752g, this.f5753h, this.f5754i, view);
    }
}
