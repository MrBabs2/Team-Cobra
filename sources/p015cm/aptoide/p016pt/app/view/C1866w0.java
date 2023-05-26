package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.w0 */
/* compiled from: lambda */
public final /* synthetic */ class C1866w0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4463f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f4464g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f4465h;

    public /* synthetic */ C1866w0(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f4463f = appViewFragment;
        this.f4464g = promotion;
        this.f4465h = walletApp;
    }

    public final void onClick(View view) {
        this.f4463f.mo7197c(this.f4464g, this.f4465h, view);
    }
}
