package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.view.View;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;

/* renamed from: cm.aptoide.pt.store.view.u */
/* compiled from: lambda */
public final /* synthetic */ class C4372u implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ BadgeDialogFactory f7506f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaWidget.HomeMeta.Badge f7507g;

    /* renamed from: h */
    private final /* synthetic */ Resources f7508h;

    /* renamed from: i */
    private final /* synthetic */ View f7509i;

    /* renamed from: j */
    private final /* synthetic */ boolean f7510j;

    public /* synthetic */ C4372u(BadgeDialogFactory badgeDialogFactory, GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z) {
        this.f7506f = badgeDialogFactory;
        this.f7507g = badge;
        this.f7508h = resources;
        this.f7509i = view;
        this.f7510j = z;
    }

    public final void onClick(View view) {
        this.f7506f.mo14615c(this.f7507g, this.f7508h, this.f7509i, this.f7510j, view);
    }
}
