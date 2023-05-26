package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesCrashReportsFactory */
public final class ApplicationModule_ProvidesCrashReportsFactory implements C10824b<CrashReport> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCrashReportsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesCrashReportsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesCrashReportsFactory(applicationModule);
    }

    public static CrashReport providesCrashReports(ApplicationModule applicationModule) {
        CrashReport providesCrashReports = applicationModule.providesCrashReports();
        C10825c.m36718a(providesCrashReports, "Cannot return null from a non-@Nullable @Provides method");
        return providesCrashReports;
    }

    public CrashReport get() {
        return providesCrashReports(this.module);
    }
}
