package p015cm.aptoide.p016pt.home;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoFragment;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.link.CustomTabsHelper;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.promotions.PromotionsFragment;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.HomeNavigator */
public class HomeNavigator {
    private static final String TAG = "HomeNavigator";
    private final AccountNavigator accountNavigator;
    private final ActivityNavigator activityNavigator;
    private final AppNavigator appNavigator;
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final FragmentNavigator fragmentNavigator;
    private final ThemeManager themeManager;

    public HomeNavigator(FragmentNavigator fragmentNavigator2, AptoideBottomNavigator aptoideBottomNavigator2, BottomNavigationMapper bottomNavigationMapper2, AppNavigator appNavigator2, ActivityNavigator activityNavigator2, AccountNavigator accountNavigator2, ThemeManager themeManager2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.aptoideBottomNavigator = aptoideBottomNavigator2;
        this.bottomNavigationMapper = bottomNavigationMapper2;
        this.appNavigator = appNavigator2;
        this.activityNavigator = activityNavigator2;
        this.accountNavigator = accountNavigator2;
        this.themeManager = themeManager2;
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11710a(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.HOME));
    }

    public C5368e<Integer> bottomNavigation() {
        return this.aptoideBottomNavigator.navigationEvent().mo18681d(new C3107o4(this));
    }

    public void navigateToAppCoinsInformationView() {
        this.fragmentNavigator.navigateTo(AppCoinsInfoFragment.newInstance(false), true);
    }

    public void navigateToAppView(long j, String str, String str2) {
        this.appNavigator.navigateWithAppId(j, str, AppViewFragment.OpenType.OPEN_ONLY, str2);
    }

    public void navigateToESkillsSectionInAppCoinsInfoView() {
        this.fragmentNavigator.navigateTo(AppCoinsInfoFragment.newInstance(true), true);
    }

    public void navigateToEditorial(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("cardId", str);
        bundle.putBoolean(EditorialFragment.FROM_HOME, true);
        EditorialFragment editorialFragment = new EditorialFragment();
        editorialFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(editorialFragment, true);
    }

    public void navigateToEskillsAppView(long j, String str, String str2) {
        this.appNavigator.navigateWithAppIdFromEskills(j, str, AppViewFragment.OpenType.OPEN_ONLY, str2);
    }

    public void navigateToEskillsBundle(long j) {
        Event event = new Event();
        event.setAction((String) null);
        event.setData((GetStoreWidgets.WSWidget.Data) null);
        event.setType((Event.Type) null);
        event.setName(Event.Name.eSkills);
        Fragment newInstance = StoreTabGridRecyclerFragment.newInstance(event, HomeEvent.Type.ESKILLS, "e-Skills", BuildConfig.APTOIDE_THEME, "eskills", StoreContext.home, true);
        newInstance.getArguments().putLong(StoreTabGridRecyclerFragment.BundleCons.GROUP_ID, j);
        this.fragmentNavigator.navigateTo(newInstance, true);
    }

    public void navigateToLogIn() {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.EDITORIAL);
    }

    public void navigateToMyAccount() {
        this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
    }

    public void navigateToPrivacyPolicy() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1086R.string.all_url_privacy_policy), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    public void navigateToPromotions() {
        this.fragmentNavigator.navigateTo(new PromotionsFragment(), true);
    }

    public void navigateToTermsAndConditions() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1086R.string.all_url_terms_conditions), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    public void navigateWithAction(HomeEvent homeEvent) {
        String tag = homeEvent.getBundle().getTag();
        if (homeEvent.getBundle() instanceof AppBundle) {
            tag = ((AppBundle) homeEvent.getBundle()).getActionTag();
        }
        this.fragmentNavigator.navigateTo(StoreTabGridRecyclerFragment.newInstance(homeEvent.getBundle().getEvent(), homeEvent.getType(), homeEvent.getBundle().getTitle(), BuildConfig.APTOIDE_THEME, tag, StoreContext.home, true), true);
    }

    public void navigateWithDownloadUrlAndReward(long j, String str, String str2, String str3, float f) {
        this.appNavigator.navigateWithDownloadUrlAndReward(j, str, str2, str3, f);
    }

    public void navigateWithEditorsPosition(long j, String str, String str2, String str3, String str4, String str5) {
        this.appNavigator.navigatewithEditorsPosition(j, str, str2, str3, str4, str5);
    }

    public void navigateToAppView(String str, SearchAdResult searchAdResult) {
        this.appNavigator.navigateWithAdAndTag(searchAdResult, str);
    }
}
