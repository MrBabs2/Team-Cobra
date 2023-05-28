package p015cm.aptoide.p016pt.account.view.store;

import android.content.Intent;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;

/* renamed from: cm.aptoide.pt.account.view.store.ManageStoreNavigator */
public class ManageStoreNavigator {
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final FragmentNavigator fragmentNavigator;

    public ManageStoreNavigator(FragmentNavigator fragmentNavigator2, BottomNavigationNavigator bottomNavigationNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.bottomNavigationNavigator = bottomNavigationNavigator2;
    }

    public void goToHome() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    public void popViewWithResult(int i, boolean z) {
        this.fragmentNavigator.popWithResult(new Result(i, z ? -1 : 0, (Intent) null));
    }
}
