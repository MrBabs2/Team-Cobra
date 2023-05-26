package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.WindowManager;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablesFactory;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.store.view.StoreTabWidgetsGridRecyclerFragment */
public abstract class StoreTabWidgetsGridRecyclerFragment extends StoreTabGridRecyclerFragment {
    protected AptoideAccountManager accountManager;
    @Inject
    AnalyticsManager analyticsManager;
    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    @Inject
    @Named
    String marketName;
    protected NavigationTracker navigationTracker;
    protected StoreAnalytics storeAnalytics;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    @Inject
    RoomStoreRepository storeRepository;
    private StoreTabNavigator storeTabNavigator;
    @Inject
    StoreUtilsProxy storeUtilsProxy;
    @Inject
    ThemeManager themeManager;

    /* renamed from: a */
    public /* synthetic */ C5368e mo14755a(GetStoreWidgets.WSWidget wSWidget) {
        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        String str = this.marketName;
        String str2 = this.storeTheme;
        Resources resources = getContext().getResources();
        AptoideInstalledAppsRepository aptoideInstalledAppsRepository2 = this.aptoideInstalledAppsRepository;
        StoreAnalytics storeAnalytics2 = this.storeAnalytics;
        StoreTabNavigator storeTabNavigator2 = this.storeTabNavigator;
        NavigationTracker navigationTracker2 = this.navigationTracker;
        String str3 = str;
        BadgeDialogFactory badgeDialogFactory = r1;
        BadgeDialogFactory badgeDialogFactory2 = new BadgeDialogFactory(getActivity(), this.themeManager);
        return DisplayablesFactory.parse(str3, wSWidget2, str2, this.storeRepository, this.storeCredentialsProvider, this.storeContext, getContext(), this.accountManager, this.storeUtilsProxy, (WindowManager) getContext().getSystemService("window"), resources, aptoideInstalledAppsRepository2, storeAnalytics2, storeTabNavigator2, navigationTracker2, badgeDialogFactory, ((ActivityResultNavigator) getContext()).getFragmentNavigator(), aptoideApplication.getBodyInterceptorPoolV7(), aptoideApplication.getDefaultClient(), WebService.getDefaultConverter(), aptoideApplication.getTokenInvalidator(), aptoideApplication.getDefaultSharedPreferences(), this.themeManager);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.navigationTracker = ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        this.storeTabNavigator = new StoreTabNavigator(getFragmentNavigator());
    }

    public C5368e<List<Displayable>> parseDisplayables(GetStoreWidgets getStoreWidgets) {
        int i = getContext().getResources().getConfiguration().uiMode & 48;
        return C5368e.m10234a(getStoreWidgets.getDataList().getList()).mo18665b(new C4369t1(this)).mo18698l().mo18669c();
    }
}
