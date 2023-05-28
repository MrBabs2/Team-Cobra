package p015cm.aptoide.p016pt.store.view;

import android.view.View;
import p015cm.aptoide.p016pt.themes.StoreTheme;

/* renamed from: cm.aptoide.pt.store.view.q0 */
/* compiled from: lambda */
public final /* synthetic */ class C4348q0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ GridStoreMetaWidget f7452f;

    /* renamed from: g */
    private final /* synthetic */ long f7453g;

    /* renamed from: h */
    private final /* synthetic */ StoreTheme f7454h;

    /* renamed from: i */
    private final /* synthetic */ String f7455i;

    /* renamed from: j */
    private final /* synthetic */ String f7456j;

    /* renamed from: k */
    private final /* synthetic */ String f7457k;

    /* renamed from: l */
    private final /* synthetic */ int f7458l;

    public /* synthetic */ C4348q0(GridStoreMetaWidget gridStoreMetaWidget, long j, StoreTheme storeTheme, String str, String str2, String str3, int i) {
        this.f7452f = gridStoreMetaWidget;
        this.f7453g = j;
        this.f7454h = storeTheme;
        this.f7455i = str;
        this.f7456j = str2;
        this.f7457k = str3;
        this.f7458l = i;
    }

    public final void onClick(View view) {
        this.f7452f.mo14670a(this.f7453g, this.f7454h, this.f7455i, this.f7456j, this.f7457k, this.f7458l, view);
    }
}
