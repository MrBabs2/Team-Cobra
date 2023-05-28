package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.navigator.ExternalNavigator;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesSocialMediaNavigatorFactory */
public final class ActivityModule_ProvidesSocialMediaNavigatorFactory implements C10824b<SocialMediaNavigator> {
    private final Provider<ExternalNavigator> externalNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesSocialMediaNavigatorFactory(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        this.module = activityModule;
        this.externalNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesSocialMediaNavigatorFactory create(ActivityModule activityModule, Provider<ExternalNavigator> provider) {
        return new ActivityModule_ProvidesSocialMediaNavigatorFactory(activityModule, provider);
    }

    public static SocialMediaNavigator providesSocialMediaNavigator(ActivityModule activityModule, ExternalNavigator externalNavigator) {
        SocialMediaNavigator providesSocialMediaNavigator = activityModule.providesSocialMediaNavigator(externalNavigator);
        C10825c.m36718a(providesSocialMediaNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesSocialMediaNavigator;
    }

    public SocialMediaNavigator get() {
        return providesSocialMediaNavigator(this.module, this.externalNavigatorProvider.get());
    }
}
