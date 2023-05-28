package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.view.app.AppMedia;

/* renamed from: cm.aptoide.pt.app.view.m0 */
/* compiled from: lambda */
public final /* synthetic */ class C1681m0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4237f;

    /* renamed from: g */
    private final /* synthetic */ String f4238g;

    /* renamed from: h */
    private final /* synthetic */ AppMedia f4239h;

    /* renamed from: i */
    private final /* synthetic */ Store f4240i;

    /* renamed from: j */
    private final /* synthetic */ boolean f4241j;

    public /* synthetic */ C1681m0(AppViewFragment appViewFragment, String str, AppMedia appMedia, Store store, boolean z) {
        this.f4237f = appViewFragment;
        this.f4238g = str;
        this.f4239h = appMedia;
        this.f4240i = store;
        this.f4241j = z;
    }

    public final void onClick(View view) {
        this.f4237f.mo7189a(this.f4238g, this.f4239h, this.f4240i, this.f4241j, view);
    }
}
