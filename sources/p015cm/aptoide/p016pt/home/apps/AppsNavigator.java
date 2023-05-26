package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.home.AptoideBottomNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.apps.AppsNavigator */
public class AppsNavigator {
    private final AppNavigator appNavigator;
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final FragmentNavigator fragmentNavigator;

    public AppsNavigator(FragmentNavigator fragmentNavigator2, AptoideBottomNavigator aptoideBottomNavigator2, BottomNavigationMapper bottomNavigationMapper2, AppNavigator appNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.aptoideBottomNavigator = aptoideBottomNavigator2;
        this.bottomNavigationMapper = bottomNavigationMapper2;
        this.appNavigator = appNavigator2;
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11920a(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.APPS));
    }

    public C5368e<Integer> bottomNavigation() {
        return this.aptoideBottomNavigator.navigationEvent().mo18681d(new C2840w0(this));
    }

    public void navigateToAppView(long j, String str) {
        this.appNavigator.navigateWithAppId(j, str, AppViewFragment.OpenType.OPEN_ONLY, "");
    }

    public void navigateToMyAccount() {
        this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
    }

    public void navigateToAppView(String str) {
        this.appNavigator.navigateWithMd5(str);
    }
}
