package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.view.View;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;

/* renamed from: cm.aptoide.pt.store.view.v */
/* compiled from: lambda */
public final /* synthetic */ class C4375v implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ BadgeDialogFactory f7516f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaWidget.HomeMeta.Badge f7517g;

    /* renamed from: h */
    private final /* synthetic */ Resources f7518h;

    /* renamed from: i */
    private final /* synthetic */ View f7519i;

    /* renamed from: j */
    private final /* synthetic */ boolean f7520j;

    public /* synthetic */ C4375v(BadgeDialogFactory badgeDialogFactory, GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z) {
        this.f7516f = badgeDialogFactory;
        this.f7517g = badge;
        this.f7518h = resources;
        this.f7519i = view;
        this.f7520j = z;
    }

    public final void onClick(View view) {
        this.f7516f.mo14617d(this.f7517g, this.f7518h, this.f7519i, this.f7520j, view);
    }
}
