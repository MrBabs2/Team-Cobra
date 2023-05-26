package p015cm.aptoide.p016pt.view;

import android.os.Bundle;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.CatappultNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

/* renamed from: cm.aptoide.pt.view.AppCoinsInfoNavigator */
public class AppCoinsInfoNavigator {
    static final String APPC_WALLET_PACKAGE_NAME = "com.appcoins.wallet";
    private final CatappultNavigator catappultNavigator;
    private final FragmentNavigator fragmentNavigator;
    private final SocialMediaNavigator socialMediaNavigator;

    public AppCoinsInfoNavigator(FragmentNavigator fragmentNavigator2, SocialMediaNavigator socialMediaNavigator2, CatappultNavigator catappultNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.socialMediaNavigator = socialMediaNavigator2;
        this.catappultNavigator = catappultNavigator2;
    }

    public void navigateToAppCoinsWallet() {
        AppViewFragment appViewFragment = new AppViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), APPC_WALLET_PACKAGE_NAME);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), "catappult");
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateToCatappultWebsite() {
        this.catappultNavigator.navigateToCatappultWebsite();
    }

    public void navigateToESkills() {
        Event event = new Event();
        event.setAction((String) null);
        event.setData((GetStoreWidgets.WSWidget.Data) null);
        event.setType((Event.Type) null);
        event.setName(Event.Name.eSkills);
        this.fragmentNavigator.navigateTo(StoreTabGridRecyclerFragment.newInstance(event, HomeEvent.Type.ESKILLS, "e-Skills", BuildConfig.APTOIDE_THEME, "eskills", StoreContext.home, true), true);
    }

    public void navigateToSocialMedia(SocialMediaView.SocialMediaType socialMediaType) {
        this.socialMediaNavigator.navigateToSocialMediaWebsite(socialMediaType);
    }
}
