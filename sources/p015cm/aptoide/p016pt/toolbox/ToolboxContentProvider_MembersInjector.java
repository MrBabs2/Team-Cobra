package p015cm.aptoide.p016pt.toolbox;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.toolbox.ToolboxContentProvider_MembersInjector */
public final class ToolboxContentProvider_MembersInjector implements C10822a<ToolboxContentProvider> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ToolboxContentProvider_MembersInjector(Provider<AuthenticationPersistence> provider, Provider<SharedPreferences> provider2, Provider<AptoideAccountManager> provider3) {
        this.authenticationPersistenceProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.accountManagerProvider = provider3;
    }

    public static C10822a<ToolboxContentProvider> create(Provider<AuthenticationPersistence> provider, Provider<SharedPreferences> provider2, Provider<AptoideAccountManager> provider3) {
        return new ToolboxContentProvider_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAccountManager(ToolboxContentProvider toolboxContentProvider, AptoideAccountManager aptoideAccountManager) {
        toolboxContentProvider.accountManager = aptoideAccountManager;
    }

    public static void injectAuthenticationPersistence(ToolboxContentProvider toolboxContentProvider, AuthenticationPersistence authenticationPersistence) {
        toolboxContentProvider.authenticationPersistence = authenticationPersistence;
    }

    public static void injectSharedPreferences(ToolboxContentProvider toolboxContentProvider, SharedPreferences sharedPreferences) {
        toolboxContentProvider.sharedPreferences = sharedPreferences;
    }

    public void injectMembers(ToolboxContentProvider toolboxContentProvider) {
        injectAuthenticationPersistence(toolboxContentProvider, this.authenticationPersistenceProvider.get());
        injectSharedPreferences(toolboxContentProvider, this.sharedPreferencesProvider.get());
        injectAccountManager(toolboxContentProvider, this.accountManagerProvider.get());
    }
}
