package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesShortcutManagerFactory */
public final class ApplicationModule_ProvidesShortcutManagerFactory implements C10824b<AptoideShortcutManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesShortcutManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesShortcutManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesShortcutManagerFactory(applicationModule);
    }

    public static AptoideShortcutManager providesShortcutManager(ApplicationModule applicationModule) {
        AptoideShortcutManager providesShortcutManager = applicationModule.providesShortcutManager();
        C10825c.m36718a(providesShortcutManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesShortcutManager;
    }

    public AptoideShortcutManager get() {
        return providesShortcutManager(this.module);
    }
}
