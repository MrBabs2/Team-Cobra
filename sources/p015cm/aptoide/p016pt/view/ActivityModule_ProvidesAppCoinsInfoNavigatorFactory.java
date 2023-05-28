package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.CatappultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesAppCoinsInfoNavigatorFactory */
public final class ActivityModule_ProvidesAppCoinsInfoNavigatorFactory implements C10824b<AppCoinsInfoNavigator> {
    private final Provider<CatappultNavigator> catappultNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;
    private final Provider<SocialMediaNavigator> socialMediaNavigatorProvider;

    public ActivityModule_ProvidesAppCoinsInfoNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<SocialMediaNavigator> provider2, Provider<CatappultNavigator> provider3) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.socialMediaNavigatorProvider = provider2;
        this.catappultNavigatorProvider = provider3;
    }

    public static ActivityModule_ProvidesAppCoinsInfoNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<SocialMediaNavigator> provider2, Provider<CatappultNavigator> provider3) {
        return new ActivityModule_ProvidesAppCoinsInfoNavigatorFactory(activityModule, provider, provider2, provider3);
    }

    public static AppCoinsInfoNavigator providesAppCoinsInfoNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, SocialMediaNavigator socialMediaNavigator, CatappultNavigator catappultNavigator) {
        AppCoinsInfoNavigator providesAppCoinsInfoNavigator = activityModule.providesAppCoinsInfoNavigator(fragmentNavigator, socialMediaNavigator, catappultNavigator);
        C10825c.m36718a(providesAppCoinsInfoNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppCoinsInfoNavigator;
    }

    public AppCoinsInfoNavigator get() {
        return providesAppCoinsInfoNavigator(this.module, this.fragmentNavigatorProvider.get(), this.socialMediaNavigatorProvider.get(), this.catappultNavigatorProvider.get());
    }
}
