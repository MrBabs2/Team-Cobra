package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDefaultSharedPerefencesFactory */
public final class ApplicationModule_ProvidesDefaultSharedPerefencesFactory implements C10824b<SharedPreferences> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDefaultSharedPerefencesFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDefaultSharedPerefencesFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDefaultSharedPerefencesFactory(applicationModule);
    }

    public static SharedPreferences providesDefaultSharedPerefences(ApplicationModule applicationModule) {
        SharedPreferences providesDefaultSharedPerefences = applicationModule.providesDefaultSharedPerefences();
        C10825c.m36718a(providesDefaultSharedPerefences, "Cannot return null from a non-@Nullable @Provides method");
        return providesDefaultSharedPerefences;
    }

    public SharedPreferences get() {
        return providesDefaultSharedPerefences(this.module);
    }
}
