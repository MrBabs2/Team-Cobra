package p015cm.aptoide.p016pt.view.app;

import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;

/* renamed from: cm.aptoide.pt.view.app.ListStoreAppsNavigator */
public class ListStoreAppsNavigator {
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;

    public ListStoreAppsNavigator(FragmentNavigator fragmentNavigator2, AppNavigator appNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.appNavigator = appNavigator2;
    }

    public void navigateToAppView(long j, String str) {
        this.appNavigator.navigateWithAppId(j, str, AppViewFragment.OpenType.OPEN_ONLY, "");
    }
}
