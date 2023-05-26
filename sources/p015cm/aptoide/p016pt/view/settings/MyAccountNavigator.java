package p015cm.aptoide.p016pt.view.settings;

import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreViewModel;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.settings.MyAccountNavigator */
public class MyAccountNavigator {
    private final String BACKUP_APPS_UNAME = "aptoide-backup-apps";
    private final String UPLOADER_UNAME = "aptoide-uploader";
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;
    private final AccountNavigator navigator;
    private final SocialMediaNavigator socialMediaNavigator;
    private final ThemeManager themeManager;

    public MyAccountNavigator(FragmentNavigator fragmentNavigator2, AccountNavigator accountNavigator, AppNavigator appNavigator2, ThemeManager themeManager2, SocialMediaNavigator socialMediaNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.navigator = accountNavigator;
        this.appNavigator = appNavigator2;
        this.themeManager = themeManager2;
        this.socialMediaNavigator = socialMediaNavigator2;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m10362a(Result result) {
        return Boolean.valueOf(result.getResultCode() == -1);
    }

    public C5368e<Boolean> editStoreResult(int i) {
        return this.fragmentNavigator.results(i).mo18694j(C5398c.f9660f);
    }

    public void navigateToAppView(String str) {
        this.appNavigator.navigateWithUname(str);
    }

    public void navigateToBackupApps() {
        this.appNavigator.navigateWithUname("aptoide-backup-apps");
    }

    public void navigateToCreateStore() {
        this.fragmentNavigator.navigateTo(ManageStoreFragment.newInstance(new ManageStoreViewModel(), false), true);
    }

    public void navigateToEditProfileView() {
        this.fragmentNavigator.navigateTo(ManageUserFragment.newInstanceToEdit(), true);
    }

    public void navigateToEditStoreView(Store store, int i) {
        this.fragmentNavigator.navigateForResult(ManageStoreFragment.newInstance(new ManageStoreViewModel(store.getId(), this.themeManager.getStoreTheme(store.getAppearance().getTheme()), store.getName(), store.getAppearance().getDescription(), store.getAvatar()), false), i, true);
    }

    public void navigateToLoginView(AccountAnalytics.AccountOrigins accountOrigins) {
        this.navigator.navigateToAccountView(accountOrigins);
    }

    public void navigateToSettings() {
        this.fragmentNavigator.navigateTo(SettingsFragment.newInstance(), true);
    }

    public void navigateToSocialMedia(SocialMediaView.SocialMediaType socialMediaType) {
        this.socialMediaNavigator.navigateToSocialMediaWebsite(socialMediaType);
    }

    public void navigateToStoreView(String str, String str2) {
        this.fragmentNavigator.navigateTo(StoreFragment.newInstance(str, str2, StoreFragment.OpenType.GetStore), true);
    }

    public void navigateToUploader() {
        this.appNavigator.navigateWithUname("aptoide-uploader");
    }

    public void navigateToUserView(String str, String str2) {
        this.fragmentNavigator.navigateTo(StoreFragment.newInstance(str, str2, StoreFragment.OpenType.GetHome), true);
    }
}
