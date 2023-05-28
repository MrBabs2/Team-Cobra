package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.view.View;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;

/* renamed from: cm.aptoide.pt.store.view.r */
/* compiled from: lambda */
public final /* synthetic */ class C4350r implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ BadgeDialogFactory f7463f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaWidget.HomeMeta.Badge f7464g;

    /* renamed from: h */
    private final /* synthetic */ Resources f7465h;

    /* renamed from: i */
    private final /* synthetic */ View f7466i;

    /* renamed from: j */
    private final /* synthetic */ boolean f7467j;

    public /* synthetic */ C4350r(BadgeDialogFactory badgeDialogFactory, GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z) {
        this.f7463f = badgeDialogFactory;
        this.f7464g = badge;
        this.f7465h = resources;
        this.f7466i = view;
        this.f7467j = z;
    }

    public final void onClick(View view) {
        this.f7463f.mo14614b(this.f7464g, this.f7465h, this.f7466i, this.f7467j, view);
    }
}
