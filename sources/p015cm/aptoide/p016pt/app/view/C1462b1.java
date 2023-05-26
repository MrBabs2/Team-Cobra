package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C1462b1 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f3968f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f3969g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f3970h;

    public /* synthetic */ C1462b1(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f3968f = appViewFragment;
        this.f3969g = promotion;
        this.f3970h = walletApp;
    }

    public final void onClick(View view) {
        this.f3968f.mo7244h(this.f3969g, this.f3970h, view);
    }
}
