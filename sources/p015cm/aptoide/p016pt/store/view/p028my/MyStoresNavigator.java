package p015cm.aptoide.p016pt.store.view.p028my;

import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.home.AptoideBottomNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.store.view.my.MyStoresNavigator */
public class MyStoresNavigator {
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final FragmentNavigator fragmentNavigator;

    public MyStoresNavigator(FragmentNavigator fragmentNavigator2, AptoideBottomNavigator aptoideBottomNavigator2, BottomNavigationMapper bottomNavigationMapper2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.aptoideBottomNavigator = aptoideBottomNavigator2;
        this.bottomNavigationMapper = bottomNavigationMapper2;
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14785a(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.STORES));
    }

    public C5368e<Integer> bottomNavigationEvent() {
        return this.aptoideBottomNavigator.navigationEvent().mo18681d(new C4317f(this));
    }

    public void navigateToMyAccount() {
        this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
    }
}
