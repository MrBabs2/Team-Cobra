package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.AgentPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAgentPersistenceFactory */
public final class ApplicationModule_ProvidesAgentPersistenceFactory implements C10824b<AgentPersistence> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> secureSharedPreferencesProvider;

    public ApplicationModule_ProvidesAgentPersistenceFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.secureSharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesAgentPersistenceFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesAgentPersistenceFactory(applicationModule, provider);
    }

    public static AgentPersistence providesAgentPersistence(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        AgentPersistence providesAgentPersistence = applicationModule.providesAgentPersistence(sharedPreferences);
        C10825c.m36718a(providesAgentPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesAgentPersistence;
    }

    public AgentPersistence get() {
        return providesAgentPersistence(this.module, this.secureSharedPreferencesProvider.get());
    }
}
