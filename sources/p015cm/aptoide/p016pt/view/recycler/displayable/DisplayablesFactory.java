package p015cm.aptoide.p016pt.view.recycler.displayable;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.MyStoreManager;
import p015cm.aptoide.p016pt.account.view.LoginDisplayable;
import p015cm.aptoide.p016pt.account.view.user.CreateStoreDisplayable;
import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.app.view.GridAppDisplayable;
import p015cm.aptoide.p016pt.app.view.GridAppListDisplayable;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.TimelineStats;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHomeMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreDisplays;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.MyStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.BadgeDialogFactory;
import p015cm.aptoide.p016pt.store.view.GridDisplayDisplayable;
import p015cm.aptoide.p016pt.store.view.GridStoreDisplayable;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreAddCommentDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreGridHeaderDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreLatestCommentsDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreTabNavigator;
import p015cm.aptoide.p016pt.store.view.featured.AppBrickDisplayable;
import p015cm.aptoide.p016pt.store.view.p028my.StoreDisplayable;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoreDisplayable;
import p015cm.aptoide.p016pt.themes.StoreTheme;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.DisplayablesFactory */
public class DisplayablesFactory {

    /* renamed from: cm.aptoide.pt.view.recycler.displayable.DisplayablesFactory$1 */
    static /* synthetic */ class C46621 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Type[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type = r0
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPS_GROUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.MY_STORES_SUBSCRIBED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.STORES_GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.DISPLAYS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.ADS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.HOME_META     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.MY_STORE_META     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.STORE_META     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x006c }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.STORES_RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0078 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.COMMENTS_GROUP     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablesFactory.C46621.<clinit>():void");
        }
    }

    /* renamed from: a */
    static /* synthetic */ Displayable m7667a(GetStoreWidgets.WSWidget wSWidget, StoreAnalytics storeAnalytics, String str, String str2, StoreContext storeContext, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager, WindowManager windowManager, Resources resources, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        if (wSWidget.getViewObject() instanceof ListStores) {
            ListStores listStores = (ListStores) wSWidget.getViewObject();
            list2.addAll(listStores.getDataList().getList());
            if (listStores.getDataList().getLimit().intValue() > list.size()) {
                size = list.size();
            } else {
                size = listStores.getDataList().getLimit().intValue();
            }
        }
        Collections.sort(list2, C4666d.f7938f);
        for (int i = 0; i < list.size() && arrayList.size() < size; i++) {
            if (i == 0 || ((Store) list2.get(i - 1)).getId() != ((Store) list2.get(i)).getId()) {
                StoreAnalytics storeAnalytics2 = storeAnalytics;
                arrayList.add(new GridStoreDisplayable((Store) list2.get(i), "Open a Followed Store", storeAnalytics));
            } else {
                StoreAnalytics storeAnalytics3 = storeAnalytics;
            }
        }
        if (arrayList.size() > 0) {
            String str3 = str2;
            StoreGridHeaderDisplayable storeGridHeaderDisplayable = new StoreGridHeaderDisplayable(str, wSWidget, str3, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str3, C1086R.attr.themeTextColor).data);
            if (list.size() <= size) {
                storeGridHeaderDisplayable.getModel().setMoreVisible(false);
            }
            arrayList.add(0, storeGridHeaderDisplayable);
        }
        return new DisplayableGroup(arrayList, windowManager, resources);
    }

    private static List<Displayable> createCommentsGroup(String str, GetStoreWidgets.WSWidget wSWidget, StoreTheme storeTheme, String str2, StoreContext storeContext, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        ThemeManager themeManager2 = themeManager;
        LinkedList linkedList = new LinkedList();
        Pair pair = (Pair) wSWidget.getViewObject();
        ListComments listComments = (ListComments) pair.first;
        linkedList.add(new StoreGridHeaderDisplayable(str, wSWidget, storeTheme.getThemeName(), str2, storeContext, storeTabNavigator, navigationTracker, themeManager2.getAttributeForTheme(storeTheme.getThemeName(), C1086R.attr.themeTextColor).data));
        if (listComments == null || listComments.getDataList() == null || listComments.getDataList().getList().size() <= 0) {
            linkedList.add(new StoreAddCommentDisplayable(((BaseRequestWithStore.StoreCredentials) pair.second).getId().longValue(), ((BaseRequestWithStore.StoreCredentials) pair.second).getName(), storeTheme, themeManager2.getAttributeForTheme(storeTheme.getThemeName(), C1086R.attr.raisedButtonSecondaryBackground).resourceId));
        } else {
            linkedList.add(new StoreLatestCommentsDisplayable(((BaseRequestWithStore.StoreCredentials) pair.second).getId().longValue(), ((BaseRequestWithStore.StoreCredentials) pair.second).getName(), listComments.getDataList().getList(), themeManager));
        }
        return linkedList;
    }

    private static List<Displayable> createMyStoreDisplayables(Object obj, StoreAnalytics storeAnalytics, StoreContext storeContext, AptoideAccountManager aptoideAccountManager, Context context, String str, ThemeManager themeManager) {
        Object obj2 = obj;
        ThemeManager themeManager2 = themeManager;
        LinkedList linkedList = new LinkedList();
        if (obj2 instanceof MyStore) {
            MyStore myStore = (MyStore) obj2;
            if (!myStore.isCreateStore()) {
                TimelineStats.StatusData data = myStore.getTimelineStats().getData();
                Store store = myStore.getGetHomeMeta().getData().getStore();
                long following = data.getFollowing();
                long followers = data.getFollowers();
                String storeDescriptionMessage = getStoreDescriptionMessage(context, myStore.getGetHomeMeta().getData().getStore());
                StoreDisplayable storeDisplayable = r5;
                StoreDisplayable storeDisplayable2 = new StoreDisplayable(store, storeContext, following, followers, C1086R.string.storetab_short_followings, C1086R.string.storetab_short_followers, true, storeDescriptionMessage, themeManager2.getAttributeForTheme(str, C1086R.attr.themeTextColor).data);
                linkedList.add(storeDisplayable);
            } else if (!aptoideAccountManager.isLoggedIn()) {
                linkedList.add(new LoginDisplayable());
            } else if (MyStoreManager.shouldShowCreateStore()) {
                linkedList.add(new CreateStoreDisplayable(storeAnalytics, myStore.getTimelineStats(), themeManager2.getAttributeForTheme(C1086R.attr.themeTextColor).data));
            }
        }
        return linkedList;
    }

    private static Displayable createRecommendedStores(String str, GetStoreWidgets.WSWidget wSWidget, String str2, RoomStoreRepository roomStoreRepository, StoreCredentialsProvider storeCredentialsProvider, StoreContext storeContext, Context context, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy, WindowManager windowManager, Resources resources, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        ListStores listStores = (ListStores) wSWidget.getViewObject();
        if (listStores == null) {
            return new EmptyDisplayable();
        }
        List<Store> list = listStores.getDataList().getList();
        LinkedList linkedList = new LinkedList();
        String str3 = str;
        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
        linkedList.add(new StoreGridHeaderDisplayable(str3, wSWidget2, str2, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1086R.attr.themeTextColor).data));
        for (Store store : list) {
            if (wSWidget.getData().getLayout() == Layout.LIST) {
                linkedList.add(new RecommendedStoreDisplayable(store, roomStoreRepository, aptoideAccountManager, storeUtilsProxy, storeCredentialsProvider));
            } else {
                linkedList.add(new GridStoreDisplayable(store));
            }
        }
        return new DisplayableGroup(linkedList, windowManager, resources);
    }

    private static List<Displayable> createStoreDisplayables(Object obj, StoreContext storeContext, String str, ThemeManager themeManager) {
        Object obj2 = obj;
        ArrayList arrayList = new ArrayList();
        if (obj2 instanceof GetStoreMeta) {
            Store data = ((GetStoreMeta) obj2).getData();
            StoreContext storeContext2 = storeContext;
            arrayList.add(new StoreDisplayable(data, storeContext2, (long) data.getStats().getApps(), data.getStats().getDownloads(), C1086R.string.storehometab_short_apps, C1086R.string.storehometab_short_downloads, false, data.getAppearance().getDescription(), themeManager.getAttributeForTheme(str, C1086R.attr.themeTextColor).data));
        }
        return arrayList;
    }

    private static List<Displayable> getAds(GetStoreWidgets.WSWidget wSWidget, MinimalAdMapper minimalAdMapper, NavigationTracker navigationTracker) {
        GetAdsResponse getAdsResponse = (GetAdsResponse) wSWidget.getViewObject();
        if (getAdsResponse == null || getAdsResponse.getAds() == null || getAdsResponse.getAds().size() <= 0) {
            return Collections.emptyList();
        }
        List<GetAdsResponse.C2176Ad> ads = getAdsResponse.getAds();
        ArrayList arrayList = new ArrayList(ads.size());
        for (GetAdsResponse.C2176Ad map : ads) {
            arrayList.add(new GridAdDisplayable(minimalAdMapper.map(map), wSWidget.getTag(), navigationTracker));
        }
        return arrayList;
    }

    private static Displayable getApps(String str, GetStoreWidgets.WSWidget wSWidget, String str2, StoreContext storeContext, Resources resources, WindowManager windowManager, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        String str3 = str2;
        Resources resources2 = resources;
        NavigationTracker navigationTracker2 = navigationTracker;
        ThemeManager themeManager2 = themeManager;
        ListApps listApps = (ListApps) wSWidget.getViewObject();
        if (listApps == null) {
            return new EmptyDisplayable();
        }
        List<App> list = listApps.getDataList().getList();
        ArrayList arrayList = new ArrayList(list.size());
        for (App store : list) {
            store.getStore().setAppearance(new Store.Appearance(str3, (String) null));
        }
        if (Layout.BRICK.equals(wSWidget.getData().getLayout())) {
            if (list.size() > 0) {
                int i = resources2.getBoolean(C1086R.bool.use_big_app_brick);
                int min = Math.min(resources2.getInteger(C1086R.integer.nr_small_app_bricks), list.size());
                if (list.size() == 1) {
                    i = 1;
                } else if (list.size() == 2) {
                    i = 0;
                }
                if (i != 0) {
                    arrayList.add(new AppBrickDisplayable((App) list.get(0), wSWidget.getTag(), navigationTracker2).setFullRow());
                    min++;
                }
                if (list.size() > 1) {
                    while (i < min) {
                        arrayList.add(new AppBrickDisplayable((App) list.get(i), wSWidget.getTag(), navigationTracker2));
                        i++;
                    }
                }
            }
        } else if (Layout.LIST.equals(wSWidget.getData().getLayout())) {
            if (list.size() > 0) {
                arrayList.add(new StoreGridHeaderDisplayable(str, wSWidget, storeTabNavigator, navigationTracker, themeManager2.getAttributeForTheme(str3, C1086R.attr.themeTextColor).data));
            }
            for (App gridAppListDisplayable : list) {
                arrayList.add(new GridAppListDisplayable(gridAppListDisplayable, wSWidget.getTag()));
            }
        } else {
            if (list.size() > 0) {
                arrayList.add(new StoreGridHeaderDisplayable(str, wSWidget, str2, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager2.getAttributeForTheme(str3, C1086R.attr.themeTextColor).data));
            }
            for (App gridAppDisplayable : list) {
                arrayList.add(new GridAppDisplayable(gridAppDisplayable, wSWidget.getTag(), navigationTracker2, storeContext));
            }
        }
        return new DisplayableGroup(arrayList, windowManager, resources2);
    }

    private static Displayable getDisplays(GetStoreWidgets.WSWidget wSWidget, String str, StoreContext storeContext, WindowManager windowManager, Resources resources, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        GetStoreDisplays getStoreDisplays = (GetStoreDisplays) wSWidget.getViewObject();
        if (getStoreDisplays == null) {
            return new EmptyDisplayable();
        }
        List<GetStoreDisplays.EventImage> list = getStoreDisplays.getList();
        ArrayList arrayList = new ArrayList(list.size());
        for (GetStoreDisplays.EventImage gridDisplayDisplayable : list) {
            GridDisplayDisplayable gridDisplayDisplayable2 = new GridDisplayDisplayable(gridDisplayDisplayable, str, wSWidget.getTag(), storeContext, aptoideInstalledAppsRepository);
            Event.Name name = ((GetStoreDisplays.EventImage) gridDisplayDisplayable2.getPojo()).getEvent().getName();
            if (Event.Name.facebook.equals(name) || Event.Name.twitch.equals(name) || Event.Name.youtube.equals(name)) {
                gridDisplayDisplayable2.setFullRow();
            }
            arrayList.add(gridDisplayDisplayable2);
        }
        return new DisplayableGroup(arrayList, windowManager, resources);
    }

    private static C5368e<Displayable> getMyStores(String str, GetStoreWidgets.WSWidget wSWidget, RoomStoreRepository roomStoreRepository, String str2, StoreContext storeContext, WindowManager windowManager, Resources resources, Context context, StoreAnalytics storeAnalytics, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        return loadLocalSubscribedStores(roomStoreRepository).mo18694j(new C4665c(wSWidget, storeAnalytics, str, str2, storeContext, storeTabNavigator, navigationTracker, themeManager, windowManager, resources));
    }

    private static String getStoreDescriptionMessage(Context context, Store store) {
        if (TextUtils.isEmpty(store.getAppearance().getDescription())) {
            return context.getString(C1086R.string.create_store_displayable_empty_description_message);
        }
        return store.getAppearance().getDescription();
    }

    private static Displayable getStores(String str, GetStoreWidgets.WSWidget wSWidget, String str2, StoreContext storeContext, WindowManager windowManager, Resources resources, Context context, StoreAnalytics storeAnalytics, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager) {
        ListStores listStores = (ListStores) wSWidget.getViewObject();
        if (listStores == null) {
            return new EmptyDisplayable();
        }
        List<Store> list = listStores.getDataList().getList();
        ArrayList arrayList = new ArrayList(list.size());
        String str3 = str;
        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
        arrayList.add(new StoreGridHeaderDisplayable(str3, wSWidget2, str2, wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager.getAttributeForTheme(str2, C1086R.attr.themeTextColor).data));
        for (Store gridStoreDisplayable : list) {
            arrayList.add(new GridStoreDisplayable(gridStoreDisplayable, "Home", storeAnalytics));
        }
        return new DisplayableGroup(arrayList, windowManager, resources);
    }

    public static C5368e<List<Store>> loadLocalSubscribedStores(RoomStoreRepository roomStoreRepository) {
        return roomStoreRepository.getAll().mo18669c().mo18644a(Schedulers.computation()).mo18687f(C4663a.f7926f);
    }

    public static C5368e<Displayable> parse(String str, GetStoreWidgets.WSWidget wSWidget, String str2, RoomStoreRepository roomStoreRepository, StoreCredentialsProvider storeCredentialsProvider, StoreContext storeContext, Context context, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy, WindowManager windowManager, Resources resources, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, StoreAnalytics storeAnalytics, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, BadgeDialogFactory badgeDialogFactory, FragmentNavigator fragmentNavigator, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, ThemeManager themeManager) {
        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
        String str3 = str2;
        ThemeManager themeManager2 = themeManager;
        LinkedList linkedList = new LinkedList();
        if (!(wSWidget.getType() == null || wSWidget.getViewObject() == null)) {
            switch (C46621.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[wSWidget.getType().ordinal()]) {
                case 1:
                    StoreContext storeContext2 = storeContext;
                    NavigationTracker navigationTracker2 = navigationTracker;
                    return C5368e.m10257c(getApps(str, wSWidget, str2, storeContext, context.getApplicationContext().getResources(), windowManager, storeTabNavigator, navigationTracker, themeManager));
                case 2:
                    return getMyStores(str, wSWidget, roomStoreRepository, str2, storeContext, windowManager, resources, context, storeAnalytics, storeTabNavigator, navigationTracker, themeManager);
                case 3:
                    StoreContext storeContext3 = storeContext;
                    WindowManager windowManager2 = windowManager;
                    Resources resources2 = resources;
                    NavigationTracker navigationTracker3 = navigationTracker;
                    return C5368e.m10257c(getStores(str, wSWidget, str2, storeContext, windowManager, resources, context, storeAnalytics, storeTabNavigator, navigationTracker, themeManager));
                case 4:
                    StoreContext storeContext4 = storeContext;
                    WindowManager windowManager3 = windowManager;
                    Resources resources3 = resources;
                    return C5368e.m10257c(getDisplays(wSWidget, str2, storeContext, windowManager, resources, aptoideInstalledAppsRepository));
                case 5:
                    List<Displayable> ads = getAds(wSWidget2, new MinimalAdMapper(), navigationTracker);
                    if (ads.size() <= 0) {
                        return C5368e.m10265n();
                    }
                    DisplayableGroup displayableGroup = new DisplayableGroup(ads, windowManager, resources);
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(new GetStoreWidgets.WSWidget.Action().setEvent(new Event().setName(Event.Name.getAds)));
                    wSWidget2.setActions(linkedList2);
                    linkedList.add(new StoreGridHeaderDisplayable(str, wSWidget, (String) null, wSWidget.getTag(), StoreContext.meta, storeTabNavigator, navigationTracker, themeManager2.getAttributeForTheme(str3, C1086R.attr.themeTextColor).data));
                    linkedList.add(displayableGroup);
                    return C5368e.m10234a(linkedList);
                case 6:
                    return C5368e.m10257c(new GridStoreMetaDisplayable((GetHomeMeta) wSWidget.getViewObject(), storeCredentialsProvider, storeAnalytics, badgeDialogFactory, fragmentNavigator, roomStoreRepository, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, themeManager, storeUtilsProxy, aptoideAccountManager));
                case 7:
                    StoreContext storeContext5 = storeContext;
                    return C5368e.m10234a(createMyStoreDisplayables(wSWidget.getViewObject(), storeAnalytics, storeContext, aptoideAccountManager, context, str2, themeManager));
                case 8:
                    return C5368e.m10234a(createStoreDisplayables(wSWidget.getViewObject(), storeContext, str3, themeManager2));
                case 9:
                    return C5368e.m10257c(createRecommendedStores(str, wSWidget, str2, roomStoreRepository, storeCredentialsProvider, storeContext, context, aptoideAccountManager, storeUtilsProxy, windowManager, resources, storeTabNavigator, navigationTracker, themeManager));
                case 10:
                    return C5368e.m10234a(createCommentsGroup(str, wSWidget, themeManager2.getStoreTheme(str3), wSWidget.getTag(), storeContext, storeTabNavigator, navigationTracker, themeManager));
            }
        }
        return C5368e.m10265n();
    }

    /* renamed from: a */
    static /* synthetic */ Store m7666a(RoomStore roomStore) {
        Store store = new Store();
        store.setName(roomStore.getStoreName());
        store.setId(roomStore.getStoreId());
        store.setAvatar(roomStore.getIconPath());
        Store.Appearance appearance = new Store.Appearance();
        appearance.setTheme(roomStore.getTheme());
        store.setAppearance(appearance);
        return store;
    }
}
