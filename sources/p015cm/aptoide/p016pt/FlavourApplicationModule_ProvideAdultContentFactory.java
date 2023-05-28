package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.p016pt.preferences.LocalPersistenceAdultContent;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.FlavourApplicationModule_ProvideAdultContentFactory */
public final class FlavourApplicationModule_ProvideAdultContentFactory implements C10824b<AdultContent> {
    private final Provider<AccountService> accountServiceProvider;
    private final Provider<LocalPersistenceAdultContent> localAdultContentProvider;
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvideAdultContentFactory(FlavourApplicationModule flavourApplicationModule, Provider<LocalPersistenceAdultContent> provider, Provider<AccountService> provider2) {
        this.module = flavourApplicationModule;
        this.localAdultContentProvider = provider;
        this.accountServiceProvider = provider2;
    }

    public static FlavourApplicationModule_ProvideAdultContentFactory create(FlavourApplicationModule flavourApplicationModule, Provider<LocalPersistenceAdultContent> provider, Provider<AccountService> provider2) {
        return new FlavourApplicationModule_ProvideAdultContentFactory(flavourApplicationModule, provider, provider2);
    }

    public static AdultContent provideAdultContent(FlavourApplicationModule flavourApplicationModule, LocalPersistenceAdultContent localPersistenceAdultContent, AccountService accountService) {
        AdultContent provideAdultContent = flavourApplicationModule.provideAdultContent(localPersistenceAdultContent, accountService);
        C10825c.m36718a(provideAdultContent, "Cannot return null from a non-@Nullable @Provides method");
        return provideAdultContent;
    }

    public AdultContent get() {
        return provideAdultContent(this.module, this.localAdultContentProvider.get(), this.accountServiceProvider.get());
    }
}
