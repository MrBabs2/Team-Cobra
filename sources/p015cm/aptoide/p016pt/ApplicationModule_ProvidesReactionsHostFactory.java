package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReactionsHostFactory */
public final class ApplicationModule_ProvidesReactionsHostFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesReactionsHostFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesReactionsHostFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesReactionsHostFactory(applicationModule);
    }

    public static String providesReactionsHost(ApplicationModule applicationModule) {
        String providesReactionsHost = applicationModule.providesReactionsHost();
        C10825c.m36718a(providesReactionsHost, "Cannot return null from a non-@Nullable @Provides method");
        return providesReactionsHost;
    }

    public String get() {
        return providesReactionsHost(this.module);
    }
}
