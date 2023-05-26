package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.l0 */
/* compiled from: lambda */
public final /* synthetic */ class C1663l0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4215f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f4216g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f4217h;

    public /* synthetic */ C1663l0(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f4215f = appViewFragment;
        this.f4216g = promotion;
        this.f4217h = walletApp;
    }

    public final void onClick(View view) {
        this.f4215f.mo7186a(this.f4216g, this.f4217h, view);
    }
}
