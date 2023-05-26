package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;

/* renamed from: cm.aptoide.pt.app.view.r0 */
/* compiled from: lambda */
public final /* synthetic */ class C1771r0 implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ AppViewFragment f4348f;

    /* renamed from: g */
    private final /* synthetic */ Promotion f4349g;

    /* renamed from: h */
    private final /* synthetic */ WalletApp f4350h;

    public /* synthetic */ C1771r0(AppViewFragment appViewFragment, Promotion promotion, WalletApp walletApp) {
        this.f4348f = appViewFragment;
        this.f4349g = promotion;
        this.f4350h = walletApp;
    }

    public final void onClick(View view) {
        this.f4348f.mo7228d(this.f4349g, this.f4350h, view);
    }
}
