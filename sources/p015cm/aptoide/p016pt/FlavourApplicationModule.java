package p015cm.aptoide.p016pt;

import com.google.android.gms.common.GoogleApiAvailability;
import javax.inject.Named;
import javax.inject.Singleton;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.p016pt.account.LoginPreferences;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferCardManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p015cm.aptoide.p016pt.preferences.AdultContentManager;
import p015cm.aptoide.p016pt.preferences.LocalPersistenceAdultContent;
import p015cm.aptoide.p016pt.preferences.Preferences;
import p015cm.aptoide.p016pt.preferences.SecurePreferences;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule */
public class FlavourApplicationModule {
    private final AptoideApplication application;

    public FlavourApplicationModule(AptoideApplication aptoideApplication) {
        this.application = aptoideApplication;
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public AdultContent provideAdultContent(LocalPersistenceAdultContent localPersistenceAdultContent, AccountService accountService) {
        return new AdultContentManager(localPersistenceAdultContent, accountService);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String provideAutoUpdateStoreName() {
        return "v9";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public LocalPersistenceAdultContent provideLocalAdultContent(Preferences preferences, @Named("secure") SecurePreferences securePreferences) {
        return new LocalPersistenceAdultContent(preferences, securePreferences);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public LoginPreferences provideLoginPreferences() {
        return new LoginPreferences(this.application, GoogleApiAvailability.m15256a());
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providePartnerID() {
        return "";
    }

    /* access modifiers changed from: package-private */
    @Singleton
    @Named
    public String providesSupportEmail() {
        return this.application.getString(C1086R.string.aptoide_email);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public WalletAdsOfferCardManager providesWalletAdsOfferCardManager(BlacklistManager blacklistManager, PackageRepository packageRepository) {
        return new WalletAdsOfferCardManager(blacklistManager, packageRepository);
    }

    /* access modifiers changed from: package-private */
    @Singleton
    public WalletAdsOfferManager providesWalletAdsOfferManager() {
        return new WalletAdsOfferManager(this.application.getApplicationContext().getPackageManager());
    }
}
