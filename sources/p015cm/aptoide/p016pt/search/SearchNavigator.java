package p015cm.aptoide.p016pt.search;

import java.util.ArrayList;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenshotsViewerFragment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.search.model.SearchQueryModel;
import p015cm.aptoide.p016pt.search.view.SearchResultFragment;
import p015cm.aptoide.p016pt.view.settings.SettingsFragment;

/* renamed from: cm.aptoide.pt.search.SearchNavigator */
public class SearchNavigator {
    private final AppNavigator appNavigator;
    private final FragmentNavigator navigator;
    private final String storeName;
    private final String storeTheme;

    public SearchNavigator(FragmentNavigator fragmentNavigator, AppNavigator appNavigator2) {
        this(fragmentNavigator, "", "", appNavigator2);
    }

    public void goToAppView(long j, String str, String str2, String str3) {
        this.appNavigator.navigateWithStore(j, str, str2, str3);
    }

    public void goToSearchFragment(SearchQueryModel searchQueryModel) {
        this.navigator.navigateTo(SearchResultFragment.newInstance(searchQueryModel), true);
    }

    public void goToSettings() {
        this.navigator.navigateTo(new SettingsFragment(), true);
    }

    public void navigate(SearchQueryModel searchQueryModel) {
        this.navigator.navigateTo(resolveFragment(searchQueryModel), true);
    }

    public void navigateToScreenshots(ArrayList<String> arrayList, int i) {
        this.navigator.navigateTo(ScreenshotsViewerFragment.newInstance(arrayList, i), true);
    }

    public SearchResultFragment resolveFragment(SearchQueryModel searchQueryModel) {
        String str = this.storeName;
        if (str == null || str.length() <= 0) {
            return SearchResultFragment.newInstance(searchQueryModel);
        }
        return SearchResultFragment.newInstance(searchQueryModel, this.storeName, this.storeTheme);
    }

    public SearchNavigator(FragmentNavigator fragmentNavigator, String str, String str2, AppNavigator appNavigator2) {
        this.navigator = fragmentNavigator;
        this.storeName = str;
        this.storeTheme = str2;
        this.appNavigator = appNavigator2;
    }

    public void goToAppView(SearchAdResult searchAdResult) {
        this.appNavigator.navigateWithAd(searchAdResult, (String) null);
    }
}
