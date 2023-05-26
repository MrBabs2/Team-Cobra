package p015cm.aptoide.p016pt.editorial;

import android.view.View;

/* renamed from: cm.aptoide.pt.editorial.f0 */
/* compiled from: lambda */
public final /* synthetic */ class C2432f0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ EditorialItemsViewHolder f5201f;

    /* renamed from: g */
    private final /* synthetic */ long f5202g;

    /* renamed from: h */
    private final /* synthetic */ String f5203h;

    public /* synthetic */ C2432f0(EditorialItemsViewHolder editorialItemsViewHolder, long j, String str) {
        this.f5201f = editorialItemsViewHolder;
        this.f5202g = j;
        this.f5203h = str;
    }

    public final void onClick(View view) {
        this.f5201f.mo11104a(this.f5202g, this.f5203h, view);
    }
}
