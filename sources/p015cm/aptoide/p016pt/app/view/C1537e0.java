package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C1537e0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4059f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f4060g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f4061h;

    public /* synthetic */ C1537e0(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f4059f = appViewFragment;
        this.f4060g = promotion;
        this.f4061h = walletApp;
    }

    public final void onClick(View view) {
        this.f4059f.mo7240f(this.f4060g, this.f4061h, view);
    }
}
