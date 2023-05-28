package p015cm.aptoide.p016pt.promotions;

import android.os.Bundle;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.home.HomeContainerFragment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.promotions.PromotionsNavigator */
public class PromotionsNavigator {
    static final int CLAIM_REQUEST_CODE = 6666;
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;

    public PromotionsNavigator(FragmentNavigator fragmentNavigator2, AppNavigator appNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.appNavigator = appNavigator2;
    }

    /* renamed from: a */
    static /* synthetic */ ClaimDialogResultWrapper m6897a(Result result) {
        return new ClaimDialogResultWrapper(result.getData() != null ? result.getData().getPackage() : "", result.getResultCode() == -1);
    }

    /* renamed from: b */
    static /* synthetic */ OutOfSpaceNavigatorWrapper m6898b(Result result) {
        return new OutOfSpaceNavigatorWrapper(result.getResultCode() == -1, result.getData() != null ? result.getData().getPackage() : "");
    }

    public C5368e<ClaimDialogResultWrapper> claimDialogResults() {
        return this.fragmentNavigator.results(CLAIM_REQUEST_CODE).mo18694j(C3923x2.f7003f);
    }

    public void navigateToAppView(long j, String str) {
        this.appNavigator.navigateWithAppId(j, str, AppViewFragment.OpenType.OPEN_ONLY, "");
    }

    public void navigateToClaimDialog(String str, String str2) {
        ClaimPromotionDialogFragment claimPromotionDialogFragment = new ClaimPromotionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        bundle.putString("promotion_id", str2);
        claimPromotionDialogFragment.setArguments(bundle);
        this.fragmentNavigator.navigateToDialogForResult(claimPromotionDialogFragment, CLAIM_REQUEST_CODE);
    }

    public void navigateToHome() {
        this.fragmentNavigator.navigateToCleaningBackStack(new HomeContainerFragment(), true);
    }

    public void navigateToOutOfSpaceDialog(long j, String str) {
        this.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.Companion.newInstance(j, str), 1994);
    }

    public C5368e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        return this.fragmentNavigator.results(1994).mo18694j(C3931y2.f7013f);
    }
}
