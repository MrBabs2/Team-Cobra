package p015cm.aptoide.p016pt.home.bundles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferCardManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.AppCoinsCampaign;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.AppCoinsInfo;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.AppPromoItem;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemData;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemResponse;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationManager;
import p015cm.aptoide.p016pt.home.bundles.apps.EskillsApp;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.bundles.base.ActionItem;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.view.app.Application;
import p015cm.aptoide.p016pt.view.app.ApplicationGraphic;
import p015cm.aptoide.p016pt.view.app.FeatureGraphicApplication;

/* renamed from: cm.aptoide.pt.home.bundles.BundlesResponseMapper */
public class BundlesResponseMapper {
    private final AppComingSoonRegistrationManager appComingSoonRegistrationManager;
    private final BlacklistManager blacklistManager;
    private final DownloadStateParser downloadStateParser;
    private final InstallManager installManager;
    private final WalletAdsOfferCardManager walletAdsOfferCardManager;

    /* renamed from: cm.aptoide.pt.home.bundles.BundlesResponseMapper$1 */
    static /* synthetic */ class C28731 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Type[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type = r0
                r1 = 1
                cm.aptoide.pt.dataprovider.model.v7.Type r2 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPS_GROUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Type r3 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPCOINS_ADS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.Type r4 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.ESKILLS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPCOINS_FEATURED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.ADS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APPS_TOP_GROUP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.NEW_APP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.NEW_APP_VERSION     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                cm.aptoide.pt.dataprovider.model.v7.Layout[] r4 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout = r4
                cm.aptoide.pt.dataprovider.model.v7.Layout r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout.APPC_INFO     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout     // Catch:{ NoSuchFieldError -> 0x007b }
                cm.aptoide.pt.dataprovider.model.v7.Layout r4 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout.CURATION_1     // Catch:{ NoSuchFieldError -> 0x007b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout     // Catch:{ NoSuchFieldError -> 0x0085 }
                cm.aptoide.pt.dataprovider.model.v7.Layout r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout.WALLET_ADS_OFFER     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout     // Catch:{ NoSuchFieldError -> 0x008f }
                cm.aptoide.pt.dataprovider.model.v7.Layout r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout.PROMO_GRAPHIC     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.home.bundles.BundlesResponseMapper.C28731.<clinit>():void");
        }
    }

    public BundlesResponseMapper(InstallManager installManager2, WalletAdsOfferCardManager walletAdsOfferCardManager2, BlacklistManager blacklistManager2, DownloadStateParser downloadStateParser2, AppComingSoonRegistrationManager appComingSoonRegistrationManager2) {
        this.installManager = installManager2;
        this.walletAdsOfferCardManager = walletAdsOfferCardManager2;
        this.blacklistManager = blacklistManager2;
        this.downloadStateParser = downloadStateParser2;
        this.appComingSoonRegistrationManager = appComingSoonRegistrationManager2;
    }

    private HomeBundle.BundleType actionItemTypeMapper(GetStoreWidgets.WSWidget wSWidget) {
        if (wSWidget.getData() != null) {
            int i = C28731.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout[wSWidget.getData().getLayout().ordinal()];
            if (i == 1) {
                return HomeBundle.BundleType.INFO_BUNDLE;
            }
            if (i == 2) {
                return HomeBundle.BundleType.EDITORIAL;
            }
            if (i == 3) {
                return HomeBundle.BundleType.WALLET_ADS_OFFER;
            }
            if (i == 4) {
                if (wSWidget.getType().equals(Type.NEWS_ITEM)) {
                    return HomeBundle.BundleType.NEWS_ITEM;
                }
                if (wSWidget.getType().equals(Type.IN_GAME_EVENT)) {
                    return HomeBundle.BundleType.IN_GAME_EVENT;
                }
                if (wSWidget.getType().equals(Type.APP_COMING_SOON)) {
                    return HomeBundle.BundleType.APP_COMING_SOON;
                }
            }
        }
        return HomeBundle.BundleType.UNKNOWN;
    }

    private HomeBundle.BundleType bundleTypeMapper(Type type, GetStoreWidgets.WSWidget.Data data) {
        if (type == null) {
            return HomeBundle.BundleType.UNKNOWN;
        }
        if (data != null && data.isEskills()) {
            type = Type.ESKILLS;
        }
        switch (C28731.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[type.ordinal()]) {
            case 1:
                if (data == null) {
                    return HomeBundle.BundleType.UNKNOWN;
                }
                if (data.getLayout().equals(Layout.BRICK)) {
                    return HomeBundle.BundleType.EDITORS;
                }
                return HomeBundle.BundleType.APPS;
            case 2:
                return HomeBundle.BundleType.APPCOINS_ADS;
            case 3:
                return HomeBundle.BundleType.ESKILLS;
            case 4:
                return HomeBundle.BundleType.FEATURED_BONUS_APPC;
            case 5:
                return HomeBundle.BundleType.ADS;
            case 6:
                return HomeBundle.BundleType.TOP;
            case 7:
                return HomeBundle.BundleType.NEW_APP;
            case 8:
                return HomeBundle.BundleType.NEW_APP_VERSION;
            default:
                return HomeBundle.BundleType.APPS;
        }
    }

    private Event getEvent(GetStoreWidgets.WSWidget wSWidget) {
        if (wSWidget.getActions() == null || wSWidget.getActions().size() <= 0) {
            return null;
        }
        return wSWidget.getActions().get(0).getEvent();
    }

    private Install getInstall(AppPromoItem appPromoItem, ApplicationGraphic applicationGraphic) {
        return this.installManager.getInstall(appPromoItem.getGetApp().getNodes().getMeta().getData().getMd5(), applicationGraphic.getPackageName(), appPromoItem.getGetApp().getNodes().getMeta().getData().getFile().getVercode()).mo18695j().mo41034a();
    }

    private String getWidgetActionTag(GetStoreWidgets.WSWidget wSWidget) {
        return wSWidget.hasActions() ? wSWidget.getActions().get(0).getTag() : "";
    }

    private ApplicationGraphic map(GetAppMeta.App app, String str) {
        return new ApplicationGraphic(app.getName(), app.getIcon(), app.getStats().getGlobalRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, app.hasBilling(), app.getGraphic());
    }

    private RewardApp.Reward mapReward(AppCoinsCampaign.Reward reward) {
        AppCoinsCampaign.Fiat fiat = reward.getFiat();
        return new RewardApp.Reward(reward.getAppc(), new RewardApp.Fiat(fiat.getAmount(), fiat.getCurrency(), fiat.getSymbol()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[Catch:{ Exception -> 0x03a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[Catch:{ Exception -> 0x03a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p015cm.aptoide.p016pt.home.bundles.base.HomeBundle> fromWidgetsToBundles(java.util.List<p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets.WSWidget> r23) {
        /*
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r23.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03c8
            java.lang.Object r0 = r3.next()
            cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets$WSWidget r0 = (p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets.WSWidget) r0
            cm.aptoide.pt.dataprovider.model.v7.Type r4 = r0.getType()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.ACTION_ITEM     // Catch:{ Exception -> 0x03a0 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x03a0 }
            if (r4 != 0) goto L_0x0055
            cm.aptoide.pt.dataprovider.model.v7.Type r4 = r0.getType()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.NEWS_ITEM     // Catch:{ Exception -> 0x03a0 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x03a0 }
            if (r4 != 0) goto L_0x0055
            cm.aptoide.pt.dataprovider.model.v7.Type r4 = r0.getType()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.IN_GAME_EVENT     // Catch:{ Exception -> 0x03a0 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x03a0 }
            if (r4 != 0) goto L_0x0055
            cm.aptoide.pt.dataprovider.model.v7.Type r4 = r0.getType()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Type r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type.APP_COMING_SOON     // Catch:{ Exception -> 0x03a0 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x03a0 }
            if (r4 == 0) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            cm.aptoide.pt.dataprovider.model.v7.Type r4 = r0.getType()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets$WSWidget$Data r5 = r0.getData()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r4 = r1.bundleTypeMapper(r4, r5)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x0059
        L_0x0055:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r4 = r1.actionItemTypeMapper(r0)     // Catch:{ Exception -> 0x03a0 }
        L_0x0059:
            r8 = r4
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r4 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.UNKNOWN     // Catch:{ Exception -> 0x03a0 }
            boolean r4 = r8.equals(r4)     // Catch:{ Exception -> 0x03a0 }
            if (r4 == 0) goto L_0x0063
            goto L_0x000b
        L_0x0063:
            cm.aptoide.pt.dataprovider.model.v7.Event r13 = r1.getEvent(r0)     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r4 = r0.getTag()     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r20 = r1.getWidgetActionTag(r0)     // Catch:{ Exception -> 0x03a0 }
            java.lang.Object r5 = r0.getViewObject()     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r15 = r0.getTitle()     // Catch:{ Exception -> 0x03a0 }
            if (r13 == 0) goto L_0x008a
            cm.aptoide.pt.dataprovider.model.v7.Event$Name r0 = r13.getName()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event$Name r6 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getStoreWidgets     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x008a
            cm.aptoide.pt.dataprovider.model.v7.Event$Name r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getMoreBundle     // Catch:{ Exception -> 0x03a0 }
            r13.setName(r0)     // Catch:{ Exception -> 0x03a0 }
        L_0x008a:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APPS     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            r6 = 0
            if (r0 != 0) goto L_0x037d
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.EDITORS     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 != 0) goto L_0x037d
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.TOP     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x00a5
            goto L_0x037d
        L_0x00a5:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.FEATURED_BONUS_APPC     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x00fe
            r0 = -1
            r7 = 1
            boolean r9 = r5 instanceof p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.BonusAppcBundle     // Catch:{ Exception -> 0x03a0 }
            if (r9 == 0) goto L_0x00d8
            cm.aptoide.pt.dataprovider.ws.v7.home.BonusAppcBundle r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.BonusAppcBundle) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.bonus.BonusAppcModel r0 = r5.getBonusAppcModel()     // Catch:{ Exception -> 0x03a0 }
            boolean r7 = r0.getHasBonusAppc()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.ListApps r0 = r5.getListApps()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.DataList r0 = r0.getDataList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r1.map(r0, r8, r4)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.bonus.BonusAppcModel r5 = r5.getBonusAppcModel()     // Catch:{ Exception -> 0x03a0 }
            int r5 = r5.getBonusPercentage()     // Catch:{ Exception -> 0x03a0 }
            r11 = r0
            r12 = r5
            goto L_0x00da
        L_0x00d8:
            r11 = r6
            r12 = -1
        L_0x00da:
            if (r7 == 0) goto L_0x00ed
            cm.aptoide.pt.home.bundles.base.FeaturedAppcBundle r0 = new cm.aptoide.pt.home.bundles.base.FeaturedAppcBundle     // Catch:{ Exception -> 0x03a0 }
            r5 = r0
            r6 = r15
            r7 = r11
            r9 = r13
            r10 = r4
            r11 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x00ed:
            cm.aptoide.pt.home.bundles.base.AppBundle r0 = new cm.aptoide.pt.home.bundles.base.AppBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r12 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APPS     // Catch:{ Exception -> 0x03a0 }
            r9 = r0
            r10 = r15
            r14 = r4
            r15 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x00fe:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APPCOINS_ADS     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x013d
            if (r5 == 0) goto L_0x0119
            cm.aptoide.pt.dataprovider.model.v7.ListAppCoinsCampaigns r5 = (p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.DataList r0 = r5.getDataList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r1.map((java.util.List<p015cm.aptoide.p016pt.dataprovider.model.p020v7.AppCoinsCampaign>) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x03a0 }
            r16 = r0
            goto L_0x011b
        L_0x0119:
            r16 = r6
        L_0x011b:
            if (r16 == 0) goto L_0x0123
            boolean r0 = r16.isEmpty()     // Catch:{ Exception -> 0x03a0 }
            if (r0 != 0) goto L_0x000b
        L_0x0123:
            cm.aptoide.pt.home.bundles.base.AppBundle r0 = new cm.aptoide.pt.home.bundles.base.AppBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r17 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APPCOINS_ADS     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event r5 = new cm.aptoide.pt.dataprovider.model.v7.Event     // Catch:{ Exception -> 0x03a0 }
            r5.<init>()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event$Name r6 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getAppCoinsAds     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event r18 = r5.setName(r6)     // Catch:{ Exception -> 0x03a0 }
            r14 = r0
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x013d:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.ESKILLS     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x0177
            if (r5 == 0) goto L_0x0158
            cm.aptoide.pt.dataprovider.model.v7.ListApps r5 = (p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.DataList r0 = r5.getDataList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r1.map(r0, r8, r4)     // Catch:{ Exception -> 0x03a0 }
            r16 = r0
            goto L_0x015a
        L_0x0158:
            r16 = r6
        L_0x015a:
            if (r16 == 0) goto L_0x0162
            boolean r0 = r16.isEmpty()     // Catch:{ Exception -> 0x03a0 }
            if (r0 != 0) goto L_0x000b
        L_0x0162:
            cm.aptoide.pt.home.bundles.base.AppBundle r0 = new cm.aptoide.pt.home.bundles.base.AppBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r17 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.ESKILLS     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event$Name r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.eSkills     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event r18 = r13.setName(r5)     // Catch:{ Exception -> 0x03a0 }
            r14 = r0
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x0177:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.ADS     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x01a1
            if (r5 == 0) goto L_0x0187
            cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse r5 = (p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse) r5     // Catch:{ Exception -> 0x03a0 }
            java.util.List r6 = r5.getAds()     // Catch:{ Exception -> 0x03a0 }
        L_0x0187:
            cm.aptoide.pt.home.bundles.ads.AdBundle r0 = new cm.aptoide.pt.home.bundles.ads.AdBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.ads.AdsTagWrapper r5 = new cm.aptoide.pt.home.bundles.ads.AdsTagWrapper     // Catch:{ Exception -> 0x03a0 }
            r5.<init>(r6, r4)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event r6 = new cm.aptoide.pt.dataprovider.model.v7.Event     // Catch:{ Exception -> 0x03a0 }
            r6.<init>()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event$Name r7 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event.Name.getAds     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.Event r6 = r6.setName(r7)     // Catch:{ Exception -> 0x03a0 }
            r0.<init>(r15, r5, r6, r4)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x01a1:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.EDITORIAL     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 != 0) goto L_0x0347
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.NEWS_ITEM     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 != 0) goto L_0x0347
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.IN_GAME_EVENT     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x01bb
            goto L_0x0347
        L_0x01bb:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.INFO_BUNDLE     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x01ea
            cm.aptoide.pt.dataprovider.ws.v7.home.ActionItemResponse r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemResponse) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.ActionItem r10 = r1.map(r5)     // Catch:{ Exception -> 0x03a0 }
            if (r10 == 0) goto L_0x01db
            cm.aptoide.pt.blacklist.BlacklistManager r0 = r1.blacklistManager     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r6 = r10.getCardId()     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r0.isBlacklisted(r5, r6)     // Catch:{ Exception -> 0x03a0 }
            if (r0 != 0) goto L_0x000b
        L_0x01db:
            cm.aptoide.pt.home.bundles.base.ActionBundle r0 = new cm.aptoide.pt.home.bundles.base.ActionBundle     // Catch:{ Exception -> 0x03a0 }
            r5 = r0
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x01ea:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.WALLET_ADS_OFFER     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x0219
            cm.aptoide.pt.dataprovider.ws.v7.home.ActionItemResponse r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemResponse) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.ActionItem r10 = r1.map(r5)     // Catch:{ Exception -> 0x03a0 }
            if (r10 == 0) goto L_0x020a
            cm.aptoide.pt.ads.WalletAdsOfferCardManager r0 = r1.walletAdsOfferCardManager     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r6 = r10.getCardId()     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r0.shouldShowWalletOfferCard(r5, r6)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x000b
        L_0x020a:
            cm.aptoide.pt.home.bundles.base.ActionBundle r0 = new cm.aptoide.pt.home.bundles.base.ActionBundle     // Catch:{ Exception -> 0x03a0 }
            r5 = r0
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x0219:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.NEW_APP     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            r6 = 0
            if (r0 == 0) goto L_0x028e
            cm.aptoide.pt.dataprovider.ws.v7.NewAppCoinsAppPromoItem r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.NewAppCoinsAppPromoItem) r5     // Catch:{ Exception -> 0x03a0 }
            if (r5 == 0) goto L_0x027c
            cm.aptoide.pt.dataprovider.model.v7.GetApp r0 = r5.getGetApp()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetApp$Nodes r0 = r0.getNodes()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetAppMeta r0 = r0.getMeta()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$App r0 = r0.getData()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.view.app.ApplicationGraphic r10 = r1.map((p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.App) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.install.Install r0 = r1.getInstall(r5, r10)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.BonusPromotionalBundle r14 = new cm.aptoide.pt.home.bundles.base.BonusPromotionalBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadModel r11 = new cm.aptoide.pt.app.DownloadModel     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadStateParser r7 = r1.downloadStateParser     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.install.Install$InstallationType r9 = r0.getType()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadModel$Action r17 = r7.parseDownloadType(r9, r6)     // Catch:{ Exception -> 0x03a0 }
            int r18 = r0.getProgress()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadStateParser r6 = r1.downloadStateParser     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.install.Install$InstallationStatus r7 = r0.getState()     // Catch:{ Exception -> 0x03a0 }
            boolean r9 = r0.isIndeterminate()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadModel$DownloadState r19 = r6.parseDownloadState(r7, r9)     // Catch:{ Exception -> 0x03a0 }
            long r20 = r0.getAppSize()     // Catch:{ Exception -> 0x03a0 }
            r16 = r11
            r16.<init>(r17, r18, r19, r20)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.bonus.BonusAppcModel r0 = r5.getBonusAppcModel()     // Catch:{ Exception -> 0x03a0 }
            int r12 = r0.getBonusPercentage()     // Catch:{ Exception -> 0x03a0 }
            r5 = r14
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r14)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x027c:
            cm.aptoide.pt.home.bundles.base.BonusPromotionalBundle r0 = new cm.aptoide.pt.home.bundles.base.BonusPromotionalBundle     // Catch:{ Exception -> 0x03a0 }
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r0
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x028e:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.NEW_APP_VERSION     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x0312
            cm.aptoide.pt.dataprovider.ws.v7.AppPromoItem r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.AppPromoItem) r5     // Catch:{ Exception -> 0x03a0 }
            if (r5 == 0) goto L_0x0300
            cm.aptoide.pt.dataprovider.model.v7.GetApp r0 = r5.getGetApp()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetApp$Nodes r0 = r0.getNodes()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetAppMeta r0 = r0.getMeta()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$App r0 = r0.getData()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.view.app.ApplicationGraphic r10 = r1.map((p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.App) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.install.Install r0 = r1.getInstall(r5, r10)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.VersionPromotionalBundle r14 = new cm.aptoide.pt.home.bundles.base.VersionPromotionalBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetApp r5 = r5.getGetApp()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetApp$Nodes r5 = r5.getNodes()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetAppMeta r5 = r5.getMeta()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$App r5 = r5.getData()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile r5 = r5.getFile()     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r11 = r5.getVername()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadModel r12 = new cm.aptoide.pt.app.DownloadModel     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadStateParser r5 = r1.downloadStateParser     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.install.Install$InstallationType r7 = r0.getType()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadModel$Action r17 = r5.parseDownloadType(r7, r6)     // Catch:{ Exception -> 0x03a0 }
            int r18 = r0.getProgress()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadStateParser r5 = r1.downloadStateParser     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.install.Install$InstallationStatus r6 = r0.getState()     // Catch:{ Exception -> 0x03a0 }
            boolean r7 = r0.isIndeterminate()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.app.DownloadModel$DownloadState r19 = r5.parseDownloadState(r6, r7)     // Catch:{ Exception -> 0x03a0 }
            long r20 = r0.getAppSize()     // Catch:{ Exception -> 0x03a0 }
            r16 = r12
            r16.<init>(r17, r18, r19, r20)     // Catch:{ Exception -> 0x03a0 }
            r5 = r14
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r14)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x0300:
            cm.aptoide.pt.home.bundles.base.VersionPromotionalBundle r0 = new cm.aptoide.pt.home.bundles.base.VersionPromotionalBundle     // Catch:{ Exception -> 0x03a0 }
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r0
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x0312:
            cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APP_COMING_SOON     // Catch:{ Exception -> 0x03a0 }
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x000b
            cm.aptoide.pt.dataprovider.ws.v7.home.ActionItemResponse r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemResponse) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.ActionItem r10 = r1.map(r5)     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.AppComingSoonRegistrationManager r0 = r1.appComingSoonRegistrationManager     // Catch:{ Exception -> 0x03a0 }
            java.lang.String r5 = r10.getPackageName()     // Catch:{ Exception -> 0x03a0 }
            rx.e r0 = r0.isNotificationScheduled(r5)     // Catch:{ Exception -> 0x03a0 }
            rx.o.a r0 = r0.mo18695j()     // Catch:{ Exception -> 0x03a0 }
            java.lang.Object r0 = r0.mo41034a()     // Catch:{ Exception -> 0x03a0 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x03a0 }
            boolean r11 = r0.booleanValue()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.AppComingSoonPromotionalBundle r0 = new cm.aptoide.pt.home.bundles.base.AppComingSoonPromotionalBundle     // Catch:{ Exception -> 0x03a0 }
            r5 = r0
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x0347:
            boolean r0 = r5 instanceof p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.EditorialActionItem     // Catch:{ Exception -> 0x03a0 }
            if (r0 == 0) goto L_0x0368
            cm.aptoide.pt.dataprovider.ws.v7.home.EditorialActionItem r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.EditorialActionItem) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.bonus.BonusAppcModel r11 = r5.getBonusAppcModel()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.EditorialActionBundle r0 = new cm.aptoide.pt.home.bundles.base.EditorialActionBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.ws.v7.home.ActionItemResponse r5 = r5.getActionItemResponse()     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.ActionItem r10 = r1.map(r5)     // Catch:{ Exception -> 0x03a0 }
            r5 = r0
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x0368:
            cm.aptoide.pt.home.bundles.base.ActionBundle r0 = new cm.aptoide.pt.home.bundles.base.ActionBundle     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.ws.v7.home.ActionItemResponse r5 = (p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemResponse) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.home.bundles.base.ActionItem r10 = r1.map(r5)     // Catch:{ Exception -> 0x03a0 }
            r5 = r0
            r6 = r15
            r7 = r8
            r8 = r13
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x037d:
            if (r5 == 0) goto L_0x038f
            cm.aptoide.pt.dataprovider.model.v7.ListApps r5 = (p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps) r5     // Catch:{ Exception -> 0x03a0 }
            cm.aptoide.pt.dataprovider.model.v7.DataList r0 = r5.getDataList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x03a0 }
            java.util.List r0 = r1.map(r0, r8, r4)     // Catch:{ Exception -> 0x03a0 }
            r7 = r0
            goto L_0x0390
        L_0x038f:
            r7 = r6
        L_0x0390:
            cm.aptoide.pt.home.bundles.base.AppBundle r0 = new cm.aptoide.pt.home.bundles.base.AppBundle     // Catch:{ Exception -> 0x03a0 }
            r5 = r0
            r6 = r15
            r9 = r13
            r10 = r4
            r11 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x03a0 }
            r2.add(r0)     // Catch:{ Exception -> 0x03a0 }
            goto L_0x000b
        L_0x03a0:
            r0 = move-exception
            r0.printStackTrace()
            cm.aptoide.pt.logger.Logger r4 = p015cm.aptoide.p016pt.logger.Logger.getInstance()
            java.lang.Class<cm.aptoide.pt.home.bundles.BundlesResponseMapper> r5 = p015cm.aptoide.p016pt.home.bundles.BundlesResponseMapper.class
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Something went wrong with widget to bundle mapping : "
            r6.append(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.mo12975d((java.lang.String) r5, (java.lang.String) r0)
            goto L_0x000b
        L_0x03c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.home.bundles.BundlesResponseMapper.fromWidgetsToBundles(java.util.List):java.util.List");
    }

    private ActionItem map(ActionItemResponse actionItemResponse) {
        String str;
        String str2;
        if (actionItemResponse == null) {
            return null;
        }
        ActionItemData actionItemData = (ActionItemData) actionItemResponse.getDataList().getList().get(0);
        String id = actionItemData.getId();
        String type = actionItemData.getType() != null ? actionItemData.getType() : "";
        String title = actionItemData.getTitle();
        String caption = actionItemData.getCaption();
        String icon = actionItemData.getIcon();
        String url = actionItemData.getUrl();
        String views = actionItemData.getViews();
        String date = actionItemData.getDate();
        if (actionItemData.getAppearance() != null) {
            str = actionItemData.getAppearance().getCaption().getTheme();
        } else {
            str = "";
        }
        if (actionItemData.getFlair() != null) {
            str2 = actionItemData.getFlair();
        } else {
            str2 = "";
        }
        return new ActionItem(id, type, title, caption, icon, url, views, date, str, str2, actionItemData.getSummary(), actionItemData.getPackageName(), actionItemData.getGraphic());
    }

    private List<Application> map(List<App> list, HomeBundle.BundleType bundleType, String str) {
        HomeBundle.BundleType bundleType2 = bundleType;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (App next : list) {
            try {
                if (bundleType2.equals(HomeBundle.BundleType.EDITORS)) {
                    AppCoinsInfo appcoins = next.getAppcoins();
                    String name = next.getName();
                    String icon = next.getIcon();
                    float avg = next.getStats().getRating().getAvg();
                    int pdownloads = next.getStats().getPdownloads();
                    String packageName = next.getPackageName();
                    long id = next.getId();
                    String graphic = next.getGraphic();
                    boolean z = appcoins != null && appcoins.hasBilling();
                    boolean z2 = appcoins != null && appcoins.hasAdvertising();
                    FeatureGraphicApplication featureGraphicApplication = r7;
                    FeatureGraphicApplication featureGraphicApplication2 = new FeatureGraphicApplication(name, icon, avg, pdownloads, packageName, id, graphic, str, z, z2);
                    arrayList.add(featureGraphicApplication);
                } else if (bundleType2.equals(HomeBundle.BundleType.ESKILLS)) {
                    AppCoinsInfo appcoins2 = next.getAppcoins();
                    String name2 = next.getName();
                    String icon2 = next.getIcon();
                    float avg2 = next.getStats().getRating().getAvg();
                    int pdownloads2 = next.getStats().getPdownloads();
                    String packageName2 = next.getPackageName();
                    long id2 = next.getId();
                    boolean z3 = appcoins2 != null && appcoins2.hasBilling();
                    String graphic2 = next.getGraphic();
                    EskillsApp eskillsApp = r7;
                    EskillsApp eskillsApp2 = new EskillsApp(name2, icon2, avg2, pdownloads2, packageName2, id2, str, z3, graphic2);
                    arrayList.add(eskillsApp);
                } else {
                    AppCoinsInfo appcoins3 = next.getAppcoins();
                    String name3 = next.getName();
                    String icon3 = next.getIcon();
                    float avg3 = next.getStats().getRating().getAvg();
                    int pdownloads3 = next.getStats().getPdownloads();
                    String packageName3 = next.getPackageName();
                    long id3 = next.getId();
                    Application application = r7;
                    Application application2 = new Application(name3, icon3, avg3, pdownloads3, packageName3, id3, str, appcoins3 != null && appcoins3.hasBilling());
                    arrayList.add(application);
                }
            } catch (Exception e) {
                Logger instance = Logger.getInstance();
                String name4 = BundlesResponseMapper.class.getName();
                instance.mo12975d(name4, "Something went wrong while parsing apps to applications: " + e.getMessage());
            }
        }
        return arrayList;
    }

    private List<Application> map(List<AppCoinsCampaign> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (AppCoinsCampaign next : list) {
            AppCoinsCampaign.CampaignApp app = next.getApp();
            if (!this.installManager.wasAppEverInstalled(app.getPackageName())) {
                arrayList.add(new RewardApp(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, app.getAppcoins() != null, app.getAppcoins().getClicks().getClick(), app.getAppcoins().getClicks().getInstall(), mapReward(next.getReward()), app.getGraphic()));
            }
        }
        return arrayList;
    }
}
