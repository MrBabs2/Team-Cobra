package p015cm.aptoide.p016pt.promotions;

import android.content.Intent;
import android.net.Uri;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;

/* renamed from: cm.aptoide.pt.promotions.ClaimPromotionsNavigator */
public class ClaimPromotionsNavigator {
    private final ActivityResultNavigator activityResultNavigator;
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;

    public ClaimPromotionsNavigator(FragmentNavigator fragmentNavigator2, ActivityResultNavigator activityResultNavigator2, AppNavigator appNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.activityResultNavigator = activityResultNavigator2;
        this.appNavigator = appNavigator2;
    }

    public void fetchWalletAddressByIntent(String str, int i, String str2, String str3) {
        this.activityResultNavigator.navigateForResult("android.intent.action.VIEW", Uri.parse(str), i, str2, str3);
    }

    public void navigateToWalletAppView() {
        this.appNavigator.navigateWithPackageName("com.appcoins.wallet", AppViewFragment.OpenType.OPEN_AND_INSTALL);
    }

    public void popDialogWithResult(String str, int i) {
        this.fragmentNavigator.popDialogWithResult(new Result(6666, i, new Intent().setPackage(str)));
    }

    public void validateWallet(String str, int i) {
        this.activityResultNavigator.navigateForResult("android.intent.action.VIEW", Uri.parse(str), i);
    }
}
