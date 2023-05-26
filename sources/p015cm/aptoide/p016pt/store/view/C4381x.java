package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.account.view.user.CreateStoreDisplayable;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.x */
/* compiled from: lambda */
public final /* synthetic */ class C4381x implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ CreateStoreDisplayable f7532f;

    public /* synthetic */ C4381x(CreateStoreDisplayable createStoreDisplayable) {
        this.f7532f = createStoreDisplayable;
    }

    public final void call(Object obj) {
        this.f7532f.getStoreAnalytics().sendStoreTabInteractEvent("Login", false);
    }
}
