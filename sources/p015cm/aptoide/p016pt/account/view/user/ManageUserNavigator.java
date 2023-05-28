package p015cm.aptoide.p016pt.account.view.user;

import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;

/* renamed from: cm.aptoide.pt.account.view.user.ManageUserNavigator */
public class ManageUserNavigator {
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final FragmentNavigator navigator;

    public ManageUserNavigator(FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator2) {
        this.navigator = fragmentNavigator;
        this.bottomNavigationNavigator = bottomNavigationNavigator2;
    }

    public void goBack() {
        this.navigator.popBackStack();
    }

    public void goToHome() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    public void toProfileStepOne() {
        this.navigator.cleanBackStack();
        this.navigator.navigateTo(ProfileStepOneFragment.newInstance(), true);
    }
}
