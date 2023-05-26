package p015cm.aptoide.p016pt.bottomNavigation;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.editorialList.EditorialListFragment;
import p015cm.aptoide.p016pt.home.HomeContainerFragment;
import p015cm.aptoide.p016pt.home.apps.AppsFragment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.analytics.SearchSource;
import p015cm.aptoide.p016pt.search.view.SearchResultFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresFragment;
import p015cm.aptoide.p016pt.themes.ThemeManager;

/* renamed from: cm.aptoide.pt.bottomNavigation.BottomNavigationNavigator */
public class BottomNavigationNavigator {
    private static final String EVENT_ACTION = "https://ws75.aptoide.com/api/7/getStoreWidgets/store_id=15/context=stores";
    private final BottomNavigationAnalytics bottomNavigationAnalytics;
    private ArrayList<Integer> bottomNavigationItems = new ArrayList<>();
    private final FragmentNavigator fragmentNavigator;
    private final SearchAnalytics searchAnalytics;
    private final ThemeManager themeManager;

    public BottomNavigationNavigator(FragmentNavigator fragmentNavigator2, BottomNavigationAnalytics bottomNavigationAnalytics2, SearchAnalytics searchAnalytics2, ThemeManager themeManager2) {
        this.bottomNavigationAnalytics = bottomNavigationAnalytics2;
        this.searchAnalytics = searchAnalytics2;
        this.fragmentNavigator = fragmentNavigator2;
        this.themeManager = themeManager2;
    }

    private Event getStoreEvent() {
        Event event = new Event();
        event.setAction(EVENT_ACTION);
        event.setData((GetStoreWidgets.WSWidget.Data) null);
        event.setName(Event.Name.myStores);
        event.setType(Event.Type.CLIENT);
        return event;
    }

    private void navigateBackToBottomNavigationItem(int i) {
        Fragment fragment;
        if (i == 0) {
            fragment = new HomeContainerFragment();
        } else if (i == 1) {
            fragment = new EditorialListFragment();
        } else if (i == 2) {
            fragment = SearchResultFragment.newInstance(true);
        } else if (i != 3) {
            fragment = i != 4 ? null : new AppsFragment();
        } else {
            fragment = MyStoresFragment.newInstance(getStoreEvent(), "", "stores", StoreContext.home);
        }
        if (fragment != null) {
            this.fragmentNavigator.navigateToCleaningBackStack(fragment, true);
        }
    }

    private void navigateToSelectedFragment(int i, Fragment fragment) {
        Fragment fragment2 = this.fragmentNavigator.getFragment();
        if (fragment2 == null || fragment2.getClass() != fragment.getClass()) {
            if (this.bottomNavigationItems.size() <= 0 || this.bottomNavigationItems.get(0).intValue() != i) {
                this.fragmentNavigator.cleanBackStack();
                this.fragmentNavigator.navigateToWithoutBackSave(fragment, true);
            } else {
                this.fragmentNavigator.cleanBackStack();
            }
            updateBottomNavigationItemsList(i);
            Collections.rotate(this.bottomNavigationItems, 1);
        }
    }

    private void updateBottomNavigationItemsList(int i) {
        int indexOf = this.bottomNavigationItems.indexOf(Integer.valueOf(i));
        if (indexOf != -1) {
            this.bottomNavigationItems.remove(indexOf);
        }
        this.bottomNavigationItems.add(Integer.valueOf(i));
    }

    public boolean canNavigateBack() {
        return this.bottomNavigationItems.size() > 1;
    }

    public ArrayList<Integer> getBottomNavigationItems() {
        return this.bottomNavigationItems;
    }

    public void navigateBack() {
        int intValue = this.bottomNavigationItems.get(1).intValue();
        this.bottomNavigationItems.remove(0);
        navigateBackToBottomNavigationItem(intValue);
    }

    public void navigateToApps() {
        navigateToSelectedFragment(4, new AppsFragment());
    }

    public void navigateToBottomNavigationItem(int i) {
        if (i == 0) {
            this.bottomNavigationAnalytics.sendNavigateToHomeClickEvent();
            navigateToHome();
        } else if (i == 1) {
            this.bottomNavigationAnalytics.sendNavigateToCurationClickEvent();
            navigateToCuration();
        } else if (i == 2) {
            this.bottomNavigationAnalytics.sendNavigateToSearchClickEvent();
            this.searchAnalytics.searchStart(SearchSource.BOTTOM_NAVIGATION, true);
            navigateToSearch(SearchResultFragment.newInstance(true));
        } else if (i == 3) {
            this.bottomNavigationAnalytics.sendNavigateToStoresClickEvent();
            navigateToStore();
        } else if (i == 4) {
            this.bottomNavigationAnalytics.sendNavigateToAppsClickEvent();
            navigateToApps();
        }
    }

    public void navigateToCuration() {
        navigateToSelectedFragment(1, new EditorialListFragment());
    }

    public void navigateToHome() {
        navigateToSelectedFragment(0, new HomeContainerFragment());
    }

    public void navigateToSearch(SearchResultFragment searchResultFragment) {
        navigateToSelectedFragment(2, searchResultFragment);
    }

    public void navigateToStore() {
        navigateToSelectedFragment(3, MyStoresFragment.newInstance(getStoreEvent(), this.themeManager.getBaseTheme().getThemeName(), "stores", StoreContext.home));
    }

    public void setBottomNavigationItems(ArrayList<Integer> arrayList) {
        this.bottomNavigationItems = arrayList;
    }
}
