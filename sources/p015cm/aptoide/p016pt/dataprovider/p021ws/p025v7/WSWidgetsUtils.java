package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListFullReviews;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.TimelineStats;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHomeMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreDisplays;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.GetAdsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppCoinsCampaignsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.BonusAppcBundle;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.EditorialActionItem;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.GetActionItemRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetHomeMetaRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetMyStoreListRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetMyStoreMetaRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreDisplaysRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.ListStoresRequest;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.WSWidgetsUtils */
public class WSWidgetsUtils {
    private static final String USER_DONT_HAVE_STORE_ERROR = "MYSTORE-1";
    private static final String USER_NOT_LOGGED_ERROR = "AUTH-5";

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.WSWidgetsUtils$1 */
    static /* synthetic */ class C21861 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Type[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type = r0
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPCOINS_FEATURED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPS_TOP_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPS_GROUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.STORES_GROUP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.DISPLAYS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.ADS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPCOINS_ADS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.ESKILLS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x006c }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.HOME_META     // Catch:{ NoSuchFieldError -> 0x006c }
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
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0084 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.REVIEWS_GROUP     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0090 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.MY_STORES_SUBSCRIBED     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x009c }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.STORES_RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00a8 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.MY_STORE_META     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00b4 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.STORE_META     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00c0 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.NEW_APP_VERSION     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00cc }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.NEW_APP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00d8 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.NEWS_ITEM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00e4 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.IN_GAME_EVENT     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00f0 }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.ACTION_ITEM     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x00fc }
                cm.aptoide.pt.dataprovider.model.v7.Type r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APP_COMING_SOON     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.WSWidgetsUtils.C21861.<clinit>():void");
        }
    }

    /* renamed from: a */
    static /* synthetic */ GetStoreWidgets.WSWidget m5282a(GetStoreWidgets.WSWidget wSWidget, ListComments listComments) {
        return wSWidget;
    }

    /* renamed from: a */
    static /* synthetic */ GetStoreWidgets.WSWidget m5283a(GetStoreWidgets.WSWidget wSWidget, AppPromoItem appPromoItem) {
        return wSWidget;
    }

    /* renamed from: a */
    static /* synthetic */ BonusAppcBundle m5286a(ListApps listApps, BonusAppcModel bonusAppcModel) {
        return new BonusAppcBundle(listApps, bonusAppcModel);
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5302b(GetStoreWidgets.WSWidget wSWidget, GetAdsResponse getAdsResponse) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5303b(GetStoreWidgets.WSWidget wSWidget, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5304b(GetStoreWidgets.WSWidget wSWidget, ListApps listApps) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5305b(GetStoreWidgets.WSWidget wSWidget, ListFullReviews listFullReviews) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5306b(GetStoreWidgets.WSWidget wSWidget, GetHomeMeta getHomeMeta) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5307b(GetStoreWidgets.WSWidget wSWidget, GetStoreDisplays getStoreDisplays) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5308b(GetStoreWidgets.WSWidget wSWidget, GetStoreMeta getStoreMeta) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5309b(GetStoreWidgets.WSWidget wSWidget, ListStores listStores) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5310b(GetStoreWidgets.WSWidget wSWidget, MyStore myStore) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5311b(GetStoreWidgets.WSWidget wSWidget, NewAppCoinsAppPromoItem newAppCoinsAppPromoItem) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5312b(GetStoreWidgets.WSWidget wSWidget, ActionItemResponse actionItemResponse) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5313b(GetStoreWidgets.WSWidget wSWidget, BonusAppcBundle bonusAppcBundle) {
        return wSWidget;
    }

    /* renamed from: b */
    static /* synthetic */ GetStoreWidgets.WSWidget m5314b(GetStoreWidgets.WSWidget wSWidget, EditorialActionItem editorialActionItem) {
        return wSWidget;
    }

    private TimelineStats createErrorTimelineStatus() {
        TimelineStats timelineStats = new TimelineStats();
        TimelineStats.StatusData statusData = new TimelineStats.StatusData();
        statusData.setFollowers(0);
        statusData.setFollowing(0);
        timelineStats.setData(statusData);
        return timelineStats;
    }

    /* renamed from: d */
    static /* synthetic */ GetStoreWidgets.WSWidget m5319d(GetStoreWidgets.WSWidget wSWidget, ListApps listApps) {
        return wSWidget;
    }

    /* renamed from: d */
    static /* synthetic */ GetStoreWidgets.WSWidget m5320d(GetStoreWidgets.WSWidget wSWidget, ListStores listStores) {
        return wSWidget;
    }

    /* renamed from: d */
    static /* synthetic */ GetStoreWidgets.WSWidget m5321d(GetStoreWidgets.WSWidget wSWidget, ActionItemResponse actionItemResponse) {
        return wSWidget;
    }

    private C5368e<ActionItemResponse> loadActionItem(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, boolean z, boolean z2) {
        return GetActionItemRequest.ofAction(str, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z, z2).mo18644a(Schedulers.m10352io());
    }

    private C5368e<BonusAppcModel> loadAppcBonusModel(AppCoinsManager appCoinsManager) {
        return C10832d.m36727a(appCoinsManager.getBonusAppc()).mo18567c().mo18649a((C5378b<? super Throwable>) C2208h.f4903f);
    }

    private C5368e<ListApps> loadListApps(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, AppBundlesVisibilityManager appBundlesVisibilityManager, boolean z, boolean z2) {
        return ListAppsRequest.ofAction(str, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, appBundlesVisibilityManager).observe(z, z2);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo10271b(Throwable th) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(USER_NOT_LOGGED_ERROR);
        linkedList.add(USER_DONT_HAVE_STORE_ERROR);
        if (shouldAddObjectView(linkedList, th)) {
            return C5368e.m10257c(null);
        }
        return C5368e.m10238a(th);
    }

    public C5368e<GetStoreWidgets.WSWidget> loadWidgetNode(GetStoreWidgets.WSWidget wSWidget, BaseRequestWithStore.StoreCredentials storeCredentials, boolean z, String str, boolean z2, String str2, boolean z3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, String str3, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, boolean z4, int i, List<String> list, AppBundlesVisibilityManager appBundlesVisibilityManager, AppCoinsManager appCoinsManager) {
        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
        boolean z5 = z;
        boolean z6 = z4;
        AppCoinsManager appCoinsManager2 = appCoinsManager;
        if (wSWidget.getType() == null) {
            return C5368e.m10265n();
        }
        String str4 = null;
        if (wSWidget.getView() != null) {
            str4 = wSWidget.getView().replace(C2185V7.getHost(sharedPreferences), "");
        }
        String str5 = str4;
        if (wSWidget.getTag().equals("appcoins-iab-featured")) {
            wSWidget2.setType(Type.APPCOINS_FEATURED);
        }
        switch (C21861.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[wSWidget.getType().ordinal()]) {
            case 1:
                BaseRequestWithStore.StoreCredentials storeCredentials2 = storeCredentials;
                BodyInterceptor<BaseBody> bodyInterceptor2 = bodyInterceptor;
                Converter.Factory factory2 = factory;
                TokenInvalidator tokenInvalidator2 = tokenInvalidator;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                return C5368e.m10256b(loadListApps(str5, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, appBundlesVisibilityManager, z, z4), loadAppcBonusModel(appCoinsManager2), C2248r1.f4952f).mo18644a(Schedulers.m10352io()).mo18664b(new C2245q1(wSWidget2)).mo18697k(C2236n1.f4938f).mo18694j(new C2272z0(wSWidget2));
            case 2:
            case 3:
                BaseRequestWithStore.StoreCredentials storeCredentials3 = storeCredentials;
                BodyInterceptor<BaseBody> bodyInterceptor3 = bodyInterceptor;
                Converter.Factory factory3 = factory;
                TokenInvalidator tokenInvalidator3 = tokenInvalidator;
                SharedPreferences sharedPreferences3 = sharedPreferences;
                return loadListApps(str5, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, appBundlesVisibilityManager, z, z4).mo18644a(Schedulers.m10352io()).mo18664b(new C2206g0(wSWidget2)).mo18697k(C2212i.f4910f).mo18694j(new C2269y(wSWidget2));
            case 4:
                BodyInterceptor<BaseBody> bodyInterceptor4 = bodyInterceptor;
                OkHttpClient okHttpClient2 = okHttpClient;
                Converter.Factory factory4 = factory;
                TokenInvalidator tokenInvalidator4 = tokenInvalidator;
                SharedPreferences sharedPreferences4 = sharedPreferences;
                return ListStoresRequest.ofAction(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2234n(wSWidget2)).mo18697k(C2214i1.f4912f).mo18694j(new C2268x0(wSWidget2));
            case 5:
                BaseRequestWithStore.StoreCredentials storeCredentials4 = storeCredentials;
                BodyInterceptor<BaseBody> bodyInterceptor5 = bodyInterceptor;
                Converter.Factory factory5 = factory;
                TokenInvalidator tokenInvalidator5 = tokenInvalidator;
                SharedPreferences sharedPreferences5 = sharedPreferences;
                return GetStoreDisplaysRequest.ofAction(str5, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2246r(wSWidget2)).mo18697k(C2261u.f4967f).mo18694j(new C2270y0(wSWidget2));
            case 6:
                OkHttpClient okHttpClient3 = okHttpClient;
                Converter.Factory factory6 = factory;
                SharedPreferences sharedPreferences6 = sharedPreferences;
                int i2 = i;
                return GetAdsRequest.ofHomepage(str, z2, str2, z3, okHttpClient, factory, str3, sharedPreferences, resources, connectivityManager, adsApplicationVersionCodeProvider, i).observe(z5).mo18644a(Schedulers.m10352io()).mo18664b(new C2221l(wSWidget2)).mo18697k(C2216j0.f4914f).mo18694j(new C2192b1(wSWidget2));
            case 7:
                OkHttpClient okHttpClient4 = okHttpClient;
                Converter.Factory factory7 = factory;
                TokenInvalidator tokenInvalidator6 = tokenInvalidator;
                SharedPreferences sharedPreferences7 = sharedPreferences;
                return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(0, i), okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2259t(wSWidget2)).mo18697k(C2262u0.f4968f).mo18694j(new C2194c0(wSWidget2));
            case 8:
                OkHttpClient okHttpClient5 = okHttpClient;
                Converter.Factory factory8 = factory;
                TokenInvalidator tokenInvalidator7 = tokenInvalidator;
                SharedPreferences sharedPreferences8 = sharedPreferences;
                return new GetEskillsAppsRequest(str5, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2232m0(wSWidget2)).mo18697k(C2247r0.f4951f).mo18694j(new C2260t0(wSWidget2));
            case 9:
                BaseRequestWithStore.StoreCredentials storeCredentials5 = storeCredentials;
                BodyInterceptor<BaseBody> bodyInterceptor6 = bodyInterceptor;
                Converter.Factory factory9 = factory;
                TokenInvalidator tokenInvalidator8 = tokenInvalidator;
                SharedPreferences sharedPreferences9 = sharedPreferences;
                return GetHomeMetaRequest.ofAction(str5, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2266w0(wSWidget2)).mo18697k(C2244q0.f4948f).mo18694j(new C2191b0(wSWidget2));
            case 10:
                BodyInterceptor<BaseBody> bodyInterceptor7 = bodyInterceptor;
                Converter.Factory factory10 = factory;
                TokenInvalidator tokenInvalidator9 = tokenInvalidator;
                SharedPreferences sharedPreferences10 = sharedPreferences;
                return ListCommentsRequest.ofStoreAction(str5, z, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2243q(wSWidget2, storeCredentials)).mo18697k(C2207g1.f4902f).mo18694j(new C2195c1(wSWidget2));
            case 11:
                BodyInterceptor<BaseBody> bodyInterceptor8 = bodyInterceptor;
                Converter.Factory factory11 = factory;
                TokenInvalidator tokenInvalidator10 = tokenInvalidator;
                SharedPreferences sharedPreferences11 = sharedPreferences;
                return ListFullReviewsRequest.ofAction(str5, z, storeCredentials, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2238o0(wSWidget2)).mo18697k(C2217j1.f4915f).mo18694j(new C2271z(wSWidget2));
            case 12:
            case 13:
                BodyInterceptor<BaseBody> bodyInterceptor9 = bodyInterceptor;
                OkHttpClient okHttpClient6 = okHttpClient;
                Converter.Factory factory12 = factory;
                TokenInvalidator tokenInvalidator11 = tokenInvalidator;
                SharedPreferences sharedPreferences12 = sharedPreferences;
                return GetMyStoreListRequest.m5363of(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18664b(new C2198d1(wSWidget2)).mo18649a((C5378b<? super Throwable>) new C2241p0(this, wSWidget2)).mo18697k(C2213i0.f4911f).mo18694j(new C2267x(wSWidget2));
            case 14:
                return C5368e.m10256b(GetTimelineStatsRequest.m5256of(bodyInterceptor, (Long) null, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18699l(new C2189a1(this)), GetMyStoreMetaRequest.m5365of(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18694j(C2233m1.f4935f).mo18697k(new C2237o(this)), new C2218k(this)).mo18664b(new C2265w(wSWidget2)).mo18697k(C2223l1.f4921f).mo18694j(new C2201e1(wSWidget2));
            case 15:
                return GetStoreMetaRequest.ofAction(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18664b(new C2231m(wSWidget2)).mo18697k(C2219k0.f4917f).mo18694j(new C2264v0(wSWidget2));
            case 16:
                C5368e j = GetAppMetaRequest.ofAction(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6).mo18644a(Schedulers.m10352io()).mo18694j(C2190b.f4883f);
                wSWidget.getClass();
                return j.mo18664b(new C2187a(wSWidget2)).mo18697k(C2203f0.f4898f).mo18694j(new C2242p1(wSWidget2));
            case 17:
                return C5368e.m10256b(GetAppMetaRequest.ofAction(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences).observe(z5, z6), loadAppcBonusModel(appCoinsManager2), C2188a0.f4881f).mo18644a(Schedulers.m10352io()).mo18664b(new C2239o1(wSWidget2)).mo18697k(C2249s.f4953f).mo18694j(new C2235n0(wSWidget2));
            case 18:
            case 19:
            case 20:
                if (wSWidget.getData().getLayout().equals(Layout.CURATION_1) || wSWidget.getData().getLayout().equals(Layout.PROMO_GRAPHIC)) {
                    return C5368e.m10256b(loadActionItem(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, z, z4), loadAppcBonusModel(appCoinsManager2), C2215j.f4913f).mo18644a(Schedulers.m10352io()).mo18664b(new C2210h1(wSWidget2)).mo18697k(C2220k1.f4918f).mo18649a((C5378b<? super Throwable>) C2222l0.f4920f).mo18694j(new C2209h0(wSWidget2));
                }
                return loadActionItem(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, z, z4).mo18644a(Schedulers.m10352io()).mo18664b(new C2200e0(wSWidget2)).mo18697k(C2250s0.f4954f).mo18694j(new C2197d0(wSWidget2));
            case 21:
                return loadActionItem(str5, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, z, z4).mo18644a(Schedulers.m10352io()).mo18664b(new C2240p(wSWidget2)).mo18697k(C2204f1.f4899f).mo18694j(new C2263v(wSWidget2));
            default:
                return C5368e.m10265n();
        }
    }

    @Deprecated
    public boolean shouldAddObjectView(List<String> list, Throwable th) {
        if (!(th instanceof AptoideWsV7Exception)) {
            return false;
        }
        for (BaseV7Response.Error code : ((AptoideWsV7Exception) th).getBaseResponse().getErrors()) {
            if (list.contains(code.getCode())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ void mo10270a(GetStoreWidgets.WSWidget wSWidget, Throwable th) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(USER_NOT_LOGGED_ERROR);
        if ((th instanceof AptoideWsV7Exception) && shouldAddObjectView(linkedList, th)) {
            wSWidget.setViewObject(((AptoideWsV7Exception) th).getBaseResponse());
        }
    }

    /* renamed from: a */
    public /* synthetic */ TimelineStats mo10268a(Throwable th) {
        return createErrorTimelineStatus();
    }

    /* renamed from: a */
    static /* synthetic */ GetHomeMeta m5284a(GetStoreMeta getStoreMeta) {
        GetHomeMeta.Data data = new GetHomeMeta.Data();
        data.setStore(getStoreMeta.getData());
        GetHomeMeta getHomeMeta = new GetHomeMeta();
        getHomeMeta.setData(data);
        return getHomeMeta;
    }

    /* renamed from: a */
    public /* synthetic */ MyStore mo10269a(TimelineStats timelineStats, GetHomeMeta getHomeMeta) {
        if (timelineStats.getData() == null) {
            return new MyStore(createErrorTimelineStatus(), getHomeMeta);
        }
        return new MyStore(timelineStats, getHomeMeta);
    }

    /* renamed from: a */
    static /* synthetic */ NewAppCoinsAppPromoItem m5285a(GetApp getApp, BonusAppcModel bonusAppcModel) {
        return new NewAppCoinsAppPromoItem(getApp, bonusAppcModel);
    }

    /* renamed from: a */
    static /* synthetic */ EditorialActionItem m5287a(ActionItemResponse actionItemResponse, BonusAppcModel bonusAppcModel) {
        return new EditorialActionItem(actionItemResponse, bonusAppcModel);
    }
}
