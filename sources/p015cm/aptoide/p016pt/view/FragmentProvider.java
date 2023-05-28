package p015cm.aptoide.p016pt.view;

import androidx.fragment.app.Fragment;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.store.view.StoreFragment;

/* renamed from: cm.aptoide.pt.view.FragmentProvider */
public interface FragmentProvider {
    @Deprecated
    Fragment newAppViewFragment(long j, String str, String str2);

    @Deprecated
    Fragment newAppViewFragment(long j, String str, String str2, String str3, String str4);

    @Deprecated
    Fragment newAppViewFragment(long j, String str, String str2, String str3, String str4, String str5);

    @Deprecated
    Fragment newAppViewFragment(SearchAdResult searchAdResult, String str);

    @Deprecated
    Fragment newAppViewFragment(String str, AppViewFragment.OpenType openType);

    @Deprecated
    Fragment newDescriptionFragment(String str, String str2, boolean z);

    @Deprecated
    Fragment newLatestReviewsFragment(long j, StoreContext storeContext);

    @Deprecated
    Fragment newRateAndReviewsFragment(long j, String str, String str2, String str3, long j2);

    @Deprecated
    Fragment newSettingsFragment();

    @Deprecated
    Fragment newStoreFragment(long j, String str, StoreFragment.OpenType openType);

    @Deprecated
    Fragment newStoreFragment(String str, String str2);

    @Deprecated
    Fragment newStoreFragment(String str, String str2, StoreFragment.OpenType openType);

    @Deprecated
    Fragment newStoreTabGridRecyclerFragment(Event event, String str, String str2, StoreContext storeContext, boolean z, boolean z2);

    @Deprecated
    Fragment newStoreTabGridRecyclerFragment(Event event, String str, String str2, String str3, StoreContext storeContext, boolean z, boolean z2);

    @Deprecated
    Fragment newSubscribedStoresFragment(Event event, String str, String str2, StoreContext storeContext);

    @Deprecated
    Fragment newTimeLineFollowersFragment(String str, String str2, StoreContext storeContext);

    @Deprecated
    Fragment newTimeLineFollowersUsingStoreIdFragment(Long l, String str, String str2, StoreContext storeContext);

    @Deprecated
    Fragment newTimeLineFollowersUsingUserIdFragment(Long l, String str, String str2, StoreContext storeContext);

    @Deprecated
    Fragment newTimeLineFollowingFragmentUsingStoreId(Long l, String str, String str2, StoreContext storeContext);

    @Deprecated
    Fragment newTimeLineFollowingFragmentUsingUserId(Long l, String str, String str2, StoreContext storeContext);
}
