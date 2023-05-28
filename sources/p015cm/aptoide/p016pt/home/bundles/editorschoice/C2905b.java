package p015cm.aptoide.p016pt.home.bundles.editorschoice;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.FeatureGraphicApplication;

/* renamed from: cm.aptoide.pt.home.bundles.editorschoice.b */
/* compiled from: lambda */
public final /* synthetic */ class C2905b implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ FeatureGraphicInBundleViewHolder f5789f;

    /* renamed from: g */
    private final /* synthetic */ FeatureGraphicApplication f5790g;

    /* renamed from: h */
    private final /* synthetic */ int f5791h;

    /* renamed from: i */
    private final /* synthetic */ HomeBundle f5792i;

    /* renamed from: j */
    private final /* synthetic */ int f5793j;

    public /* synthetic */ C2905b(FeatureGraphicInBundleViewHolder featureGraphicInBundleViewHolder, FeatureGraphicApplication featureGraphicApplication, int i, HomeBundle homeBundle, int i2) {
        this.f5789f = featureGraphicInBundleViewHolder;
        this.f5790g = featureGraphicApplication;
        this.f5791h = i;
        this.f5792i = homeBundle;
        this.f5793j = i2;
    }

    public final void onClick(View view) {
        this.f5789f.mo12378a(this.f5790g, this.f5791h, this.f5792i, this.f5793j, view);
    }
}
