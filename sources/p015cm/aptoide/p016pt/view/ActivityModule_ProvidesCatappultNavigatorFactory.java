package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.CatappultNavigator;
import p015cm.aptoide.p016pt.navigator.ExternalNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesCatappultNavigatorFactory */
public final class ActivityModule_ProvidesCatappultNavigatorFactory implements C10824b<CatappultNavigator> {
    private final Provider<ExternalNavigator> externalNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesCatappultNavigatorFactory(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        this.module = activityModule;
        this.externalNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesCatappultNavigatorFactory create(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        return new ActivityModule_ProvidesCatappultNavigatorFactory(activityModule, provider);
    }

    public static CatappultNavigator providesCatappultNavigator(ActivityModule activityModule, ExternalNavigator externalNavigator) {
        CatappultNavigator providesCatappultNavigator = activityModule.providesCatappultNavigator(externalNavigator);
        C10825c.m36718a(providesCatappultNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesCatappultNavigator;
    }

    public CatappultNavigator get() {
        return providesCatappultNavigator(this.module, this.externalNavigatorProvider.get());
    }
}
