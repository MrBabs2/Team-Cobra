package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.g */
/* compiled from: lambda */
public final /* synthetic */ class C1572g implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4101f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f4102g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f4103h;

    public /* synthetic */ C1572g(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f4101f = appViewFragment;
        this.f4102g = promotion;
        this.f4103h = walletApp;
    }

    public final void onClick(View view) {
        this.f4101f.mo7236e(this.f4102g, this.f4103h, view);
    }
}
