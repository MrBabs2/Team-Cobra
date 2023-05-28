package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.home.ChipManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesChipManagerFactory */
public final class ApplicationModule_ProvidesChipManagerFactory implements C10824b<ChipManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesChipManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesChipManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesChipManagerFactory(applicationModule);
    }

    public static ChipManager providesChipManager(ApplicationModule applicationModule) {
        ChipManager providesChipManager = applicationModule.providesChipManager();
        C10825c.m36718a(providesChipManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesChipManager;
    }

    public ChipManager get() {
        return providesChipManager(this.module);
    }
}
