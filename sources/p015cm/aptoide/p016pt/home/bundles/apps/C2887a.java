package p015cm.aptoide.p016pt.home.bundles.apps;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.home.bundles.apps.a */
/* compiled from: lambda */
public final /* synthetic */ class C2887a implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppInBundleViewHolder f5737f;

    /* renamed from: g */
    private final /* synthetic */ Application f5738g;

    /* renamed from: h */
    private final /* synthetic */ HomeBundle f5739h;

    /* renamed from: i */
    private final /* synthetic */ int f5740i;

    public /* synthetic */ C2887a(AppInBundleViewHolder appInBundleViewHolder, Application application, HomeBundle homeBundle, int i) {
        this.f5737f = appInBundleViewHolder;
        this.f5738g = application;
        this.f5739h = homeBundle;
        this.f5740i = i;
    }

    public final void onClick(View view) {
        this.f5737f.mo12283a(this.f5738g, this.f5739h, this.f5740i, view);
    }
}
