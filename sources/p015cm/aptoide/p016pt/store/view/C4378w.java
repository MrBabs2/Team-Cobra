package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.view.View;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;

/* renamed from: cm.aptoide.pt.store.view.w */
/* compiled from: lambda */
public final /* synthetic */ class C4378w implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ BadgeDialogFactory f7524f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaWidget.HomeMeta.Badge f7525g;

    /* renamed from: h */
    private final /* synthetic */ Resources f7526h;

    /* renamed from: i */
    private final /* synthetic */ View f7527i;

    /* renamed from: j */
    private final /* synthetic */ boolean f7528j;

    public /* synthetic */ C4378w(BadgeDialogFactory badgeDialogFactory, GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z) {
        this.f7524f = badgeDialogFactory;
        this.f7525g = badge;
        this.f7526h = resources;
        this.f7527i = view;
        this.f7528j = z;
    }

    public final void onClick(View view) {
        this.f7524f.mo14618e(this.f7525g, this.f7526h, this.f7527i, this.f7528j, view);
    }
}
