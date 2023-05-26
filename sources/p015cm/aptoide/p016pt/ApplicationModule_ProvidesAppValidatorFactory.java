package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.AppValidationAnalytics;
import p015cm.aptoide.p016pt.download.AppValidator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppValidatorFactory */
public final class ApplicationModule_ProvidesAppValidatorFactory implements C10824b<AppValidator> {
    private final Provider<AppValidationAnalytics> appValidationAnalyticsProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppValidatorFactory(ApplicationModule applicationModule, Provider<AppValidationAnalytics> provider) {
        this.module = applicationModule;
        this.appValidationAnalyticsProvider = provider;
    }

    public static ApplicationModule_ProvidesAppValidatorFactory create(ApplicationModule applicationModule, Provider<AppValidationAnalytics> provider) {
        return new ApplicationModule_ProvidesAppValidatorFactory(applicationModule, provider);
    }

    public static AppValidator providesAppValidator(ApplicationModule applicationModule, AppValidationAnalytics appValidationAnalytics) {
        AppValidator providesAppValidator = applicationModule.providesAppValidator(appValidationAnalytics);
        C10825c.m36718a(providesAppValidator, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppValidator;
    }

    public AppValidator get() {
        return providesAppValidator(this.module, this.appValidationAnalyticsProvider.get());
    }
}
