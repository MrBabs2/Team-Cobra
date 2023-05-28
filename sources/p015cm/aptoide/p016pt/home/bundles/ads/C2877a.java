package p015cm.aptoide.p016pt.home.bundles.ads;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.home.bundles.ads.a */
/* compiled from: lambda */
public final /* synthetic */ class C2877a implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AdInBundleViewHolder f5726f;

    /* renamed from: g */
    private final /* synthetic */ AdClick f5727g;

    /* renamed from: h */
    private final /* synthetic */ int f5728h;

    /* renamed from: i */
    private final /* synthetic */ HomeBundle f5729i;

    /* renamed from: j */
    private final /* synthetic */ int f5730j;

    public /* synthetic */ C2877a(AdInBundleViewHolder adInBundleViewHolder, AdClick adClick, int i, HomeBundle homeBundle, int i2) {
        this.f5726f = adInBundleViewHolder;
        this.f5727g = adClick;
        this.f5728h = i;
        this.f5729i = homeBundle;
        this.f5730j = i2;
    }

    public final void onClick(View view) {
        this.f5726f.mo12234a(this.f5727g, this.f5728h, this.f5729i, this.f5730j, view);
    }
}
