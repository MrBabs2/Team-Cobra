package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.AptoideBottomNavigator */
public interface AptoideBottomNavigator {
    void hideBottomNavigation();

    C5368e<Integer> navigationEvent();

    void requestFocus(BottomNavigationItem bottomNavigationItem);

    void showFragment(Integer num);

    void toggleBottomNavigation();
}
