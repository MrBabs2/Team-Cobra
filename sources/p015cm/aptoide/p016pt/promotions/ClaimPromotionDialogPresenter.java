package p015cm.aptoide.p016pt.promotions;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import java.util.List;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.promotions.ClaimStatusWrapper;
import p112n.p118g.p301a.p311d.C10708b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.promotions.ClaimPromotionDialogPresenter */
public class ClaimPromotionDialogPresenter implements Presenter {
    private static final String WALLET_ADDRESS = "WALLET_ADDRESS";
    private static final int WALLET_VERIFICATION_RESULT_CANCELED = 1;
    private static final int WALLET_VERIFICATION_RESULT_FAILED = 2;
    private static final int WALLET_VERIFICATION_RESULT_OK = 0;
    private ClaimPromotionsManager claimPromotionsManager;
    private ClaimPromotionsNavigator navigator;
    private PromotionsAnalytics promotionsAnalytics;
    private boolean shouldSendIntent = true;
    private C5383b subscriptions;
    private ClaimPromotionDialogView view;
    private C5373h viewScheduler;

    public ClaimPromotionDialogPresenter(ClaimPromotionDialogView claimPromotionDialogView, C5383b bVar, C5373h hVar, ClaimPromotionsManager claimPromotionsManager2, PromotionsAnalytics promotionsAnalytics2, ClaimPromotionsNavigator claimPromotionsNavigator) {
        this.view = claimPromotionDialogView;
        this.subscriptions = bVar;
        this.viewScheduler = hVar;
        this.claimPromotionsManager = claimPromotionsManager2;
        this.promotionsAnalytics = promotionsAnalytics2;
        this.navigator = claimPromotionsNavigator;
    }

    /* renamed from: b */
    static /* synthetic */ void m6803b(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6804b(C10708b bVar) {
    }

    /* renamed from: c */
    static /* synthetic */ void m6806c(Result result) {
    }

    /* renamed from: c */
    static /* synthetic */ void m6807c(String str) {
    }

    private Single<String> claimPromotion() {
        return this.claimPromotionsManager.claimPromotion().mo18556a(this.viewScheduler).mo18559a(new C3872r(this));
    }

    /* renamed from: d */
    static /* synthetic */ void m6809d(String str) {
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m6810e(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: e */
    static /* synthetic */ void m6811e(String str) {
    }

    /* renamed from: e */
    static /* synthetic */ void m6812e(Void voidR) {
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m6813f(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* renamed from: f */
    static /* synthetic */ void m6814f(String str) {
    }

    /* renamed from: f */
    static /* synthetic */ void m6815f(Void voidR) {
    }

    /* renamed from: g */
    static /* synthetic */ void m6816g(View.LifecycleEvent lifecycleEvent) {
    }

    /* renamed from: g */
    static /* synthetic */ void m6817g(Void voidR) {
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m6818h(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: h */
    static /* synthetic */ void m6819h(Throwable th) {
    }

    private void handleContinueClick() {
        this.subscriptions.mo18721a(this.view.continueWalletClick().mo18664b(new C3929y0(this)).mo18692i(new C3920x(this)).mo18655a(C3817k0.f6881f, (C5378b<Throwable>) C3784g.f6841f));
    }

    private void handleDismissGenericError() {
        this.subscriptions.mo18721a(this.view.dismissGenericErrorClick().mo18664b(new C3896u(this)).mo18655a(C3880s.f6955f, (C5378b<Throwable>) new C3904v(this)));
    }

    private void handleDismissGenericMessage() {
        this.subscriptions.mo18721a(this.view.dismissGenericMessage().mo18664b(new C3808j(this)).mo18655a(C3816k.f6880f, (C5378b<Throwable>) new C3785g0(this)));
    }

    private String handleErrors(List<ClaimStatusWrapper.Error> list) {
        if (list.contains(ClaimStatusWrapper.Error.PROMOTION_CLAIMED)) {
            this.view.showPromotionAlreadyClaimed();
            return "error";
        } else if (list.contains(ClaimStatusWrapper.Error.WRONG_ADDRESS)) {
            this.view.showInvalidWalletAddress();
            return "error";
        } else if (list.contains(ClaimStatusWrapper.Error.WALLET_NOT_VERIFIED)) {
            this.view.verifyWallet();
            return "error";
        } else {
            this.view.showGenericError();
            return "error";
        }
    }

    private void handleFindAddressClick() {
        this.view.getLifecycleEvent().mo18681d(C3905v0.f6984f).mo18644a(this.viewScheduler).mo18687f(new C3744b0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3881s0.f6956f, (C5378b<Throwable>) C3841n0.f6911f);
    }

    private void handleOnEditTextChanged() {
        this.subscriptions.mo18721a(this.view.editTextChanges().mo18664b(new C3936z(this)).mo18655a(C3913w0.f6992f, (C5378b<Throwable>) new C3777f0(this)));
    }

    private void handleOnResumeEvent() {
        this.view.getLifecycleEvent().mo18681d(C3937z0.f7019f).mo18664b(new C3873r0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3848o.f6918f, (C5378b<Throwable>) C3833m0.f6900f);
    }

    private void handleUpdateWallet() {
        this.view.getLifecycleEvent().mo18681d(C3761d0.f6811f).mo18644a(this.viewScheduler).mo18687f(new C3793h0(this)).mo18664b(new C3897u0(this)).mo18664b(new C3824l(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3921x0.f7000f, (C5378b<Throwable>) C3742a7.f6788f);
    }

    private void handleUpdateWalletCancelClick() {
        this.view.getLifecycleEvent().mo18681d(C3888t.f6965f).mo18644a(this.viewScheduler).mo18687f(new C3849o0(this)).mo18664b(new C3792h(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3809j0.f6871f, (C5378b<Throwable>) C3742a7.f6788f);
    }

    private void handleWalletCancelClick() {
        this.subscriptions.mo18721a(this.view.walletCancelClick().mo18664b(new C3865q0(this)).mo18655a(C3801i0.f6860f, (C5378b<Throwable>) new C3856p(this)));
    }

    private void handleWalletPermissionsResult() {
        this.view.getActivityResults().mo18681d(C3753c0.f6802f).mo18664b(new C3735a0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3832m.f6899f, (C5378b<Throwable>) new C3825l0(this));
    }

    /* access modifiers changed from: private */
    public void handleWalletVerificationErrors(Integer num) {
        if (num.intValue() == 1) {
            this.view.showCanceledVerificationError();
        } else if (num.equals(2)) {
            this.view.showGenericError();
        }
    }

    private void handleWalletVerificationResult() {
        this.view.getActivityResults().mo18681d(C3912w.f6991f).mo18694j(C3943z6.f7026f).mo18664b(new C3776f(this)).mo18681d(C3840n.f6910f).mo18664b(new C3889t0(this)).mo18692i(new C3857p0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3864q.f6939f, (C5378b<Throwable>) new C3928y(this));
    }

    /* renamed from: i */
    static /* synthetic */ Boolean m6820i(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: i */
    static /* synthetic */ void m6821i(Throwable th) {
    }

    /* renamed from: j */
    static /* synthetic */ void m6822j(Throwable th) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo13549a(Integer num) {
        this.view.showLoading();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13559b(Void voidR) {
        this.navigator.navigateToWalletAppView();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo13560c(View.LifecycleEvent lifecycleEvent) {
        return this.view.onUpdateWalletClick();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo13563d(View.LifecycleEvent lifecycleEvent) {
        return this.view.onCancelWalletUpdate();
    }

    public void dispose() {
        this.subscriptions.mo18720a();
    }

    /* renamed from: g */
    public /* synthetic */ void mo13569g(Throwable th) {
        if (th instanceof ActivityNotFoundException) {
            this.view.showUpdateWalletDialog();
        }
        th.printStackTrace();
    }

    public void present() {
        handleOnResumeEvent();
        handleWalletPermissionsResult();
        handleFindAddressClick();
        handleContinueClick();
        handleOnEditTextChanged();
        handleDismissGenericError();
        handleWalletCancelClick();
        handleDismissGenericMessage();
        handleWalletVerificationResult();
        handleUpdateWalletCancelClick();
        handleUpdateWallet();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13546a(Result result) {
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            if (data == null || data.getExtras() == null) {
                this.shouldSendIntent = false;
                this.view.sendWalletIntent();
                return;
            }
            this.view.updateWalletText(data.getExtras().getString(WALLET_ADDRESS));
        } else if (result.getResultCode() != 0) {
            this.shouldSendIntent = false;
            this.view.sendWalletIntent();
        }
    }

    /* renamed from: b */
    public /* synthetic */ Single mo13555b(Integer num) {
        return claimPromotion();
    }

    /* renamed from: c */
    public /* synthetic */ void mo13562c(Void voidR) {
        this.view.dismissDialog();
    }

    /* renamed from: d */
    public /* synthetic */ void mo13565d(Void voidR) {
        this.view.dismissDialog();
    }

    /* renamed from: e */
    public /* synthetic */ void mo13567e(Throwable th) {
        this.view.showGenericError();
    }

    /* renamed from: f */
    public /* synthetic */ void mo13568f(Throwable th) {
        this.shouldSendIntent = false;
        this.view.sendWalletIntent();
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m6805c(Integer num) {
        return Boolean.valueOf(num.intValue() == 0);
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m6808d(Result result) {
        return Boolean.valueOf(result.getRequestCode() == 124);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13556b(View.LifecycleEvent lifecycleEvent) {
        if (!this.shouldSendIntent) {
            this.view.fetchWalletAddressByClipboard();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo13561c(Throwable th) {
        this.shouldSendIntent = false;
        this.view.sendWalletIntent();
    }

    /* renamed from: d */
    public /* synthetic */ void mo13564d(Throwable th) {
        this.view.showGenericError();
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m6802b(Result result) {
        return Boolean.valueOf(result.getRequestCode() == 123);
    }

    /* renamed from: b */
    public /* synthetic */ Single mo13554b(ClaimPromotionsClickWrapper claimPromotionsClickWrapper) {
        return claimPromotion();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13557b(String str) {
        this.promotionsAnalytics.sendClickOnWalletDialogCancel(str);
        this.navigator.popDialogWithResult(str, 0);
        this.view.dismissDialog();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13558b(Throwable th) {
        this.view.showGenericError();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13545a(View.LifecycleEvent lifecycleEvent) {
        return this.view.getWalletClick().mo18664b(new C3769e0(this)).mo18649a((C5378b<? super Throwable>) new C3800i(this)).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13550a(String str) {
        this.promotionsAnalytics.sendClickOnWalletDialogFindWallet(str);
        this.view.fetchWalletAddressByIntent();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13548a(ClaimPromotionsClickWrapper claimPromotionsClickWrapper) {
        this.promotionsAnalytics.sendClickOnWalletDialogNext(claimPromotionsClickWrapper.getPackageName());
        this.claimPromotionsManager.saveWalletAddress(claimPromotionsClickWrapper.getWalletAddress());
        this.view.showLoading();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13544a(ClaimStatusWrapper claimStatusWrapper) {
        if (!claimStatusWrapper.getStatus().equals(ClaimStatusWrapper.Status.OK)) {
            return Single.m10119a(handleErrors(claimStatusWrapper.getErrors()));
        }
        this.view.showClaimSuccess();
        return Single.m10119a(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13553a(C10708b bVar) {
        this.view.handleEmptyEditText(bVar.mo36358b());
    }

    /* renamed from: a */
    public /* synthetic */ void mo13552a(Void voidR) {
        this.view.dismissDialog();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13551a(Throwable th) {
        this.view.showGenericError();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13547a(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.navigator.popDialogWithResult(claimDialogResultWrapper.getPackageName(), claimDialogResultWrapper.isOk() ? -1 : 0);
        this.view.dismissDialog();
    }
}
