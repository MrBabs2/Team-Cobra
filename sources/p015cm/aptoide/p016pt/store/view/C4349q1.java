package p015cm.aptoide.p016pt.store.view;

import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.store.view.StoreGridHeaderDisplayable;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.q1 */
/* compiled from: lambda */
public final /* synthetic */ class C4349q1 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ GetStoreWidgets.WSWidget f7459f;

    /* renamed from: g */
    private final /* synthetic */ StoreGridHeaderDisplayable.Model f7460g;

    /* renamed from: h */
    private final /* synthetic */ SharedPreferences f7461h;

    /* renamed from: i */
    private final /* synthetic */ StoreGridHeaderDisplayable f7462i;

    public /* synthetic */ C4349q1(GetStoreWidgets.WSWidget wSWidget, StoreGridHeaderDisplayable.Model model, SharedPreferences sharedPreferences, StoreGridHeaderDisplayable storeGridHeaderDisplayable) {
        this.f7459f = wSWidget;
        this.f7460g = model;
        this.f7461h = sharedPreferences;
        this.f7462i = storeGridHeaderDisplayable;
    }

    public final void call(Object obj) {
        StoreGridHeaderWidget.m7347a(this.f7459f, this.f7460g, this.f7461h, this.f7462i, (Void) obj);
    }
}
