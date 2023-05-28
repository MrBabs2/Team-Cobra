package p015cm.aptoide.p016pt.home.bundles.editorial;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.home.bundles.editorial.e */
/* compiled from: lambda */
public final /* synthetic */ class C2901e implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ EditorialBundleViewHolder f5782f;

    /* renamed from: g */
    private final /* synthetic */ String f5783g;

    /* renamed from: h */
    private final /* synthetic */ String f5784h;

    /* renamed from: i */
    private final /* synthetic */ HomeBundle f5785i;

    /* renamed from: j */
    private final /* synthetic */ int f5786j;

    public /* synthetic */ C2901e(EditorialBundleViewHolder editorialBundleViewHolder, String str, String str2, HomeBundle homeBundle, int i) {
        this.f5782f = editorialBundleViewHolder;
        this.f5783g = str;
        this.f5784h = str2;
        this.f5785i = homeBundle;
        this.f5786j = i;
    }

    public final void onClick(View view) {
        this.f5782f.mo12363a(this.f5783g, this.f5784h, this.f5785i, this.f5786j, view);
    }
}
