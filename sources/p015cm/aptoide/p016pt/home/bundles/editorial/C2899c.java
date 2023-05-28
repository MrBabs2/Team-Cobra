package p015cm.aptoide.p016pt.home.bundles.editorial;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.home.bundles.editorial.c */
/* compiled from: lambda */
public final /* synthetic */ class C2899c implements View.OnLongClickListener {

    /* renamed from: f */
    private final /* synthetic */ EditorialBundleViewHolder f5772f;

    /* renamed from: g */
    private final /* synthetic */ String f5773g;

    /* renamed from: h */
    private final /* synthetic */ String f5774h;

    /* renamed from: i */
    private final /* synthetic */ HomeBundle f5775i;

    /* renamed from: j */
    private final /* synthetic */ int f5776j;

    public /* synthetic */ C2899c(EditorialBundleViewHolder editorialBundleViewHolder, String str, String str2, HomeBundle homeBundle, int i) {
        this.f5772f = editorialBundleViewHolder;
        this.f5773g = str;
        this.f5774h = str2;
        this.f5775i = homeBundle;
        this.f5776j = i;
    }

    public final boolean onLongClick(View view) {
        return this.f5772f.mo12364b(this.f5773g, this.f5774h, this.f5775i, this.f5776j, view);
    }
}
