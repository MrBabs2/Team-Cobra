package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSettingsManagerFactory */
public final class ApplicationModule_ProvidesSettingsManagerFactory implements C10824b<SettingsManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSettingsManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesSettingsManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesSettingsManagerFactory(applicationModule);
    }

    public static SettingsManager providesSettingsManager(ApplicationModule applicationModule) {
        SettingsManager providesSettingsManager = applicationModule.providesSettingsManager();
        C10825c.m36718a(providesSettingsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesSettingsManager;
    }

    public SettingsManager get() {
        return providesSettingsManager(this.module);
    }
}
