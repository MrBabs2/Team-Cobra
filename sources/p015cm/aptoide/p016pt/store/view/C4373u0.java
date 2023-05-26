package p015cm.aptoide.p016pt.store.view;

import android.view.View;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;

/* renamed from: cm.aptoide.pt.store.view.u0 */
/* compiled from: lambda */
public final /* synthetic */ class C4373u0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ GridStoreMetaWidget f7511f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaWidget.HomeMeta.Badge f7512g;

    /* renamed from: h */
    private final /* synthetic */ boolean f7513h;

    public /* synthetic */ C4373u0(GridStoreMetaWidget gridStoreMetaWidget, GridStoreMetaWidget.HomeMeta.Badge badge, boolean z) {
        this.f7511f = gridStoreMetaWidget;
        this.f7512g = badge;
        this.f7513h = z;
    }

    public final void onClick(View view) {
        this.f7511f.mo14675a(this.f7512g, this.f7513h, view);
    }
}
