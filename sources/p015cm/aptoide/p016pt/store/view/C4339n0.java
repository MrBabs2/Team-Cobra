package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.view.View;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;

/* renamed from: cm.aptoide.pt.store.view.n0 */
/* compiled from: lambda */
public final /* synthetic */ class C4339n0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ GridStoreMetaWidget f7439f;

    /* renamed from: g */
    private final /* synthetic */ GridStoreMetaDisplayable f7440g;

    /* renamed from: h */
    private final /* synthetic */ Resources f7441h;

    /* renamed from: i */
    private final /* synthetic */ FragmentNavigator f7442i;

    public /* synthetic */ C4339n0(GridStoreMetaWidget gridStoreMetaWidget, GridStoreMetaDisplayable gridStoreMetaDisplayable, Resources resources, FragmentNavigator fragmentNavigator) {
        this.f7439f = gridStoreMetaWidget;
        this.f7440g = gridStoreMetaDisplayable;
        this.f7441h = resources;
        this.f7442i = fragmentNavigator;
    }

    public final void onClick(View view) {
        this.f7439f.mo14672a(this.f7440g, this.f7441h, this.f7442i, view);
    }
}
