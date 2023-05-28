package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.view.View;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;

/* renamed from: cm.aptoide.pt.store.view.t0 */
/* compiled from: lambda */
public final /* synthetic */ class C4368t0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ GridStoreMetaWidget f7497f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaDisplayable f7498g;

    /* renamed from: h */
    private final /* synthetic */ FragmentNavigator f7499h;

    /* renamed from: i */
    private final /* synthetic */ Resources f7500i;

    public /* synthetic */ C4368t0(GridStoreMetaWidget gridStoreMetaWidget, GridStoreMetaDisplayable gridStoreMetaDisplayable, FragmentNavigator fragmentNavigator, Resources resources) {
        this.f7497f = gridStoreMetaWidget;
        this.f7498g = gridStoreMetaDisplayable;
        this.f7499h = fragmentNavigator;
        this.f7500i = resources;
    }

    public final void onClick(View view) {
        this.f7497f.mo14673a(this.f7498g, this.f7499h, this.f7500i, view);
    }
}
