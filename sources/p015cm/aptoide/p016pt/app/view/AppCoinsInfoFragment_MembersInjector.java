package p015cm.aptoide.p016pt.app.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.view.AppCoinsInfoPresenter;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.app.view.AppCoinsInfoFragment_MembersInjector */
public final class AppCoinsInfoFragment_MembersInjector implements C10822a<AppCoinsInfoFragment> {
    private final Provider<AppCoinsInfoPresenter> appCoinsInfoPresenterProvider;
    private final Provider<Float> screenHeightProvider;
    private final Provider<Float> screenWidthProvider;

    public AppCoinsInfoFragment_MembersInjector(Provider<AppCoinsInfoPresenter> provider, Provider<Float> provider2, Provider<Float> provider3) {
        this.appCoinsInfoPresenterProvider = provider;
        this.screenWidthProvider = provider2;
        this.screenHeightProvider = provider3;
    }

    public static C10822a<AppCoinsInfoFragment> create(Provider<AppCoinsInfoPresenter> provider, Provider<Float> provider2, Provider<Float> provider3) {
        return new AppCoinsInfoFragment_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAppCoinsInfoPresenter(AppCoinsInfoFragment appCoinsInfoFragment, AppCoinsInfoPresenter appCoinsInfoPresenter) {
        appCoinsInfoFragment.appCoinsInfoPresenter = appCoinsInfoPresenter;
    }

    public static void injectScreenHeight(AppCoinsInfoFragment appCoinsInfoFragment, float f) {
        appCoinsInfoFragment.screenHeight = f;
    }

    public static void injectScreenWidth(AppCoinsInfoFragment appCoinsInfoFragment, float f) {
        appCoinsInfoFragment.screenWidth = f;
    }

    public void injectMembers(AppCoinsInfoFragment appCoinsInfoFragment) {
        injectAppCoinsInfoPresenter(appCoinsInfoFragment, this.appCoinsInfoPresenterProvider.get());
        injectScreenWidth(appCoinsInfoFragment, this.screenWidthProvider.get().floatValue());
        injectScreenHeight(appCoinsInfoFragment, this.screenHeightProvider.get().floatValue());
    }
}
