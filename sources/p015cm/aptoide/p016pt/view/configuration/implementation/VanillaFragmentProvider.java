package p015cm.aptoide.p016pt.view.configuration.implementation;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import org.parceler.C12420e;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.reviews.LatestReviewsFragment;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowersFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowingFragment;
import p015cm.aptoide.p016pt.view.FragmentProvider;
import p015cm.aptoide.p016pt.view.fragment.DescriptionFragment;
import p015cm.aptoide.p016pt.view.settings.SettingsFragment;

/* renamed from: cm.aptoide.pt.view.configuration.implementation.VanillaFragmentProvider */
public class VanillaFragmentProvider implements FragmentProvider {
    public Fragment newAppViewFragment(long j, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), AppViewFragment.OpenType.OPEN_ONLY);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    public Fragment newDescriptionFragment(String str, String str2, boolean z) {
        return DescriptionFragment.newInstance(str, str2, z);
    }

    public Fragment newLatestReviewsFragment(long j, StoreContext storeContext) {
        return LatestReviewsFragment.newInstance(j, storeContext);
    }

    public Fragment newRateAndReviewsFragment(long j, String str, String str2, String str3, long j2) {
        return RateAndReviewsFragment.newInstance(j, str, str2, str3, j2);
    }

    public Fragment newSettingsFragment() {
        return SettingsFragment.newInstance();
    }

    public Fragment newStoreFragment(String str, String str2) {
        return StoreFragment.newInstance(str, str2);
    }

    public Fragment newStoreTabGridRecyclerFragment(Event event, String str, String str2, StoreContext storeContext, boolean z, boolean z2) {
        return StoreTabGridRecyclerFragment.newInstance(event, str, str2, storeContext, z2);
    }

    public Fragment newSubscribedStoresFragment(Event event, String str, String str2, StoreContext storeContext) {
        return MyStoresFragment.newInstance(event, str, str2, storeContext);
    }

    public Fragment newTimeLineFollowersFragment(String str, String str2, StoreContext storeContext) {
        return TimeLineFollowersFragment.newInstanceUsingUser(str, str2, storeContext);
    }

    public Fragment newTimeLineFollowersUsingStoreIdFragment(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowersFragment.newInstanceUsingStore(l, str, str2, storeContext);
    }

    public Fragment newTimeLineFollowersUsingUserIdFragment(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowersFragment.newInstanceUsingUser(l, str, str2, storeContext);
    }

    public Fragment newTimeLineFollowingFragmentUsingStoreId(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowingFragment.newInstanceUsingStoreId(l, str, str2, storeContext);
    }

    public Fragment newTimeLineFollowingFragmentUsingUserId(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowingFragment.newInstanceUsingUserId(l, str, str2, storeContext);
    }

    public Fragment newStoreFragment(String str, String str2, StoreFragment.OpenType openType) {
        return StoreFragment.newInstance(str, str2, openType);
    }

    public Fragment newStoreTabGridRecyclerFragment(Event event, String str, String str2, String str3, StoreContext storeContext, boolean z, boolean z2) {
        return StoreTabGridRecyclerFragment.newInstance(event, str, str2, str3, storeContext, z2);
    }

    public Fragment newStoreFragment(long j, String str, StoreFragment.OpenType openType) {
        return StoreFragment.newInstance(j, str, openType);
    }

    public Fragment newAppViewFragment(long j, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    public Fragment newAppViewFragment(long j, String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putString(AppViewFragment.BundleKeys.EDITORS_CHOICE_POSITION.name(), str5);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    public Fragment newAppViewFragment(SearchAdResult searchAdResult, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C12420e.m40843a(searchAdResult));
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    public Fragment newAppViewFragment(String str, AppViewFragment.OpenType openType) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        }
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), openType);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), (String) null);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }
}
