package p015cm.aptoide.p016pt.app;

import android.os.Bundle;
import android.text.TextUtils;
import org.parceler.C12420e;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoFragment;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;

/* renamed from: cm.aptoide.pt.app.AppNavigator */
public class AppNavigator {
    private final FragmentNavigator fragmentNavigator;

    public AppNavigator(FragmentNavigator fragmentNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
    }

    public void navigateToESkillsSectionOfAppCoinsInfoView() {
        this.fragmentNavigator.navigateTo(AppCoinsInfoFragment.newInstance(true), true);
    }

    public void navigateWithAd(SearchAdResult searchAdResult, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C12420e.m40843a(searchAdResult));
        if (str != null) {
            bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str);
        }
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAdAndStoreTheme(SearchAdResult searchAdResult, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C12420e.m40843a(searchAdResult));
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAdAndTag(SearchAdResult searchAdResult, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C12420e.m40843a(searchAdResult));
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAppId(long j, String str, AppViewFragment.OpenType openType, String str2) {
        navigateWithAppId(j, str, openType, str2, (String) null, false);
    }

    public void navigateWithAppIdFromEskills(long j, String str, AppViewFragment.OpenType openType, String str2) {
        navigateWithAppId(j, str, openType, str2, (String) null, true);
    }

    public void navigateWithDownloadUrlAndReward(long j, String str, String str2, String str3, float f) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putFloat(AppViewFragment.BundleKeys.APPC.name(), f);
        bundle.putString(AppViewFragment.BundleKeys.DOWNLOAD_CONVERSION_URL.name(), str3);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithMd5(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.MD5.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithPackageAndStoreNames(String str, String str2, AppViewFragment.OpenType openType) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        }
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), openType);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithPackageName(String str, AppViewFragment.OpenType openType) {
        navigateWithPackageAndStoreNames(str, (String) null, openType);
    }

    public void navigateWithStore(long j, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithStoreAndTag(long j, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithUname(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.UNAME.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigatewithEditorsPosition(long j, String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putString(AppViewFragment.BundleKeys.EDITORS_CHOICE_POSITION.name(), str5);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAppId(long j, String str, AppViewFragment.OpenType openType, String str2, String str3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), openType);
        if (openType == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP && str3 != null) {
            bundle.putString(AppViewFragment.BundleKeys.OEM_ID.name(), str3);
        }
        bundle.putBoolean(AppViewFragment.BundleKeys.ESKILLS.name(), z);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }
}
