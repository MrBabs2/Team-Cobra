package p015cm.aptoide.p016pt.home;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.MoreBundleFragment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.HomeContainerNavigator */
public class HomeContainerNavigator {
    private String appsTag;
    private FragmentNavigator childFragmentNavigator;
    private String gamesTag;
    private String homeTag;

    public HomeContainerNavigator(FragmentNavigator fragmentNavigator) {
        this.childFragmentNavigator = fragmentNavigator;
    }

    public void loadAppsHomeContent() {
        MoreBundleFragment moreBundleFragment = new MoreBundleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", this.childFragmentNavigator.getFragment().getString(C1086R.string.home_chip_apps));
        bundle.putString("action", "https://ws75.aptoide.com/api/7/getStoreWidgets/store_id=15/context=apps/widget=apps_list%3A0%261%3Apdownloads7d");
        bundle.putBoolean(StoreTabGridRecyclerFragment.BundleCons.TOOLBAR, false);
        moreBundleFragment.setArguments(bundle);
        Fragment fragment = this.childFragmentNavigator.getFragment(this.appsTag);
        if (fragment != null) {
            this.childFragmentNavigator.navigateToWithoutBackSave(fragment, true);
        } else {
            this.appsTag = this.childFragmentNavigator.navigateTo(moreBundleFragment, true);
        }
    }

    public void loadGamesHomeContent() {
        MoreBundleFragment moreBundleFragment = new MoreBundleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", this.childFragmentNavigator.getFragment().getString(C1086R.string.home_chip_games));
        bundle.putString("action", "https://ws75.aptoide.com/api/7/getStoreWidgets/store_id=15/context=games/widget=apps_list%3A0%262%3Adownloads7d");
        bundle.putBoolean(StoreTabGridRecyclerFragment.BundleCons.TOOLBAR, false);
        moreBundleFragment.setArguments(bundle);
        Fragment fragment = this.childFragmentNavigator.getFragment(this.gamesTag);
        if (fragment != null) {
            this.childFragmentNavigator.navigateToWithoutBackSave(fragment, true);
        } else {
            this.gamesTag = this.childFragmentNavigator.navigateTo(moreBundleFragment, true);
        }
    }

    public void loadMainHomeContent() {
        Fragment fragment = this.childFragmentNavigator.getFragment(this.homeTag);
        if (fragment != null) {
            this.childFragmentNavigator.navigateToWithoutBackSave(fragment, true);
        } else {
            this.homeTag = this.childFragmentNavigator.navigateTo(new HomeFragment(), true);
        }
    }

    public C5368e<Boolean> navigateHome() {
        Fragment fragment = this.childFragmentNavigator.getFragment();
        if (fragment instanceof ScrollableView) {
            ScrollableView scrollableView = (ScrollableView) fragment;
            if (scrollableView.isAtTop() && (fragment instanceof MoreBundleFragment)) {
                return C5368e.m10257c(true);
            }
            scrollableView.scrollToTop();
        }
        return C5368e.m10257c(false);
    }
}
