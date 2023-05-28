package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.s0 */
/* compiled from: lambda */
public final /* synthetic */ class C1789s0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4370f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f4371g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f4372h;

    public /* synthetic */ C1789s0(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f4370f = appViewFragment;
        this.f4371g = promotion;
        this.f4372h = walletApp;
    }

    public final void onClick(View view) {
        this.f4370f.mo7241g(this.f4371g, this.f4372h, view);
    }
}
