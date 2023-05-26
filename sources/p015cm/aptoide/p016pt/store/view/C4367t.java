package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.view.View;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;

/* renamed from: cm.aptoide.pt.store.view.t */
/* compiled from: lambda */
public final /* synthetic */ class C4367t implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ BadgeDialogFactory f7492f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaWidget.HomeMeta.Badge f7493g;

    /* renamed from: h */
    private final /* synthetic */ Resources f7494h;

    /* renamed from: i */
    private final /* synthetic */ View f7495i;

    /* renamed from: j */
    private final /* synthetic */ boolean f7496j;

    public /* synthetic */ C4367t(BadgeDialogFactory badgeDialogFactory, GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z) {
        this.f7492f = badgeDialogFactory;
        this.f7493g = badge;
        this.f7494h = resources;
        this.f7495i = view;
        this.f7496j = z;
    }

    public final void onClick(View view) {
        this.f7492f.mo14613a(this.f7493g, this.f7494h, this.f7495i, this.f7496j, view);
    }
}
