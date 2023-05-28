package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.v0 */
/* compiled from: lambda */
public final /* synthetic */ class C1848v0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4443f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f4444g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f4445h;

    public /* synthetic */ C1848v0(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f4443f = appViewFragment;
        this.f4444g = promotion;
        this.f4445h = walletApp;
    }

    public final void onClick(View view) {
        this.f4443f.mo7195b(this.f4444g, this.f4445h, view);
    }
}
