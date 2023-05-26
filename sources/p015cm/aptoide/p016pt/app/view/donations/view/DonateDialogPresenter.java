package p015cm.aptoide.p016pt.app.view.donations.view;

import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.app.view.donations.WalletService;
import p015cm.aptoide.p016pt.app.view.donations.model.DonationsDialogResult;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.app.view.donations.view.DonateDialogPresenter */
public class DonateDialogPresenter implements Presenter {
    private AppNavigator appNavigator;
    private DonationsAnalytics donationsAnalytics;
    private C5383b subscriptions;
    private DonateDialogView view;
    private C5373h viewScheduler;
    private WalletService walletService;

    public DonateDialogPresenter(DonateDialogView donateDialogView, WalletService walletService2, C5383b bVar, C5373h hVar, AppNavigator appNavigator2, DonationsAnalytics donationsAnalytics2) {
        this.view = donateDialogView;
        this.walletService = walletService2;
        this.subscriptions = bVar;
        this.viewScheduler = hVar;
        this.appNavigator = appNavigator2;
        this.donationsAnalytics = donationsAnalytics2;
    }

    /* renamed from: a */
    static /* synthetic */ void m5069a(String str) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5070b(Void voidR) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5071d(DonationsDialogResult donationsDialogResult) {
    }

    private void handleCancelClick() {
        this.subscriptions.mo18721a(this.view.cancelClick().mo18664b(new C1533o(this)).mo18655a(C1529k.f4050f, (C5378b<Throwable>) new C1527i(this)));
    }

    private void handleDonateClick() {
        this.subscriptions.mo18721a(this.view.donateClick().mo18664b(new C1526h(this)).mo18687f(new C1525g(this)).mo18655a(C1534p.f4056f, (C5378b<Throwable>) new C1532n(this)));
    }

    private void handleNoWalletContinueClick() {
        this.subscriptions.mo18721a(this.view.noWalletContinueClick().mo18664b(new C1531m(this)).mo18655a(C1535q.f4057f, (C5378b<Throwable>) new C1528j(this)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7678a(DonationsDialogResult donationsDialogResult, String str) {
        this.donationsAnalytics.sendDonateInteractEvent(donationsDialogResult.getPackageName(), donationsDialogResult.getValue(), !donationsDialogResult.getNickname().isEmpty());
        this.view.sendWalletIntent(donationsDialogResult.getValue(), str, donationsDialogResult.getPackageName(), donationsDialogResult.getNickname());
    }

    /* renamed from: b */
    public /* synthetic */ void mo7681b(DonationsDialogResult donationsDialogResult) {
        this.view.showLoading();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo7683c(DonationsDialogResult donationsDialogResult) {
        return this.walletService.getWalletAddress(donationsDialogResult.getPackageName()).mo18567c().mo18644a(this.viewScheduler).mo18664b(new C1530l(this, donationsDialogResult));
    }

    public void dispose() {
        this.subscriptions.mo18720a();
    }

    public void present() {
        handleDonateClick();
        handleNoWalletContinueClick();
        handleCancelClick();
    }

    /* renamed from: b */
    public /* synthetic */ void mo7682b(Throwable th) {
        th.printStackTrace();
        this.view.showErrorMessage();
    }

    /* renamed from: c */
    public /* synthetic */ void mo7684c(Throwable th) {
        th.printStackTrace();
        this.view.showErrorMessage();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7677a(DonationsDialogResult donationsDialogResult) {
        this.donationsAnalytics.sendCancelInteractEvent(donationsDialogResult.getPackageName(), donationsDialogResult.getValue(), !donationsDialogResult.getNickname().isEmpty());
        this.view.dismissDialog();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7679a(Throwable th) {
        th.printStackTrace();
        this.view.showErrorMessage();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7680a(Void voidR) {
        this.appNavigator.navigateWithPackageName("com.appcoins.wallet", AppViewFragment.OpenType.OPEN_ONLY);
        this.view.dismissDialog();
    }
}
