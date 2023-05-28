package p015cm.aptoide.p016pt.home;

import java.util.List;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel;
import p015cm.aptoide.p016pt.home.bundles.base.ActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.ActionItem;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.notification.ComingSoonNotificationManager;
import p015cm.aptoide.p016pt.promotions.PromotionApp;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsModel;
import p015cm.aptoide.p016pt.promotions.PromotionsPreferencesManager;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p015cm.aptoide.p016pt.reactions.network.LoadReactionModel;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.home.Home */
public class Home {
    private final BlacklistManager blacklistManager;
    private final BundlesRepository bundlesRepository;
    private final ComingSoonNotificationManager comingSoonNotificationManager;
    private final String promotionType;
    private final PromotionsManager promotionsManager;
    private final PromotionsPreferencesManager promotionsPreferencesManager;
    private final ReactionsManager reactionsManager;

    public Home(BundlesRepository bundlesRepository2, PromotionsManager promotionsManager2, PromotionsPreferencesManager promotionsPreferencesManager2, BlacklistManager blacklistManager2, String str, ReactionsManager reactionsManager2, ComingSoonNotificationManager comingSoonNotificationManager2) {
        this.bundlesRepository = bundlesRepository2;
        this.promotionsManager = promotionsManager2;
        this.promotionsPreferencesManager = promotionsPreferencesManager2;
        this.promotionType = str;
        this.blacklistManager = blacklistManager2;
        this.reactionsManager = reactionsManager2;
        this.comingSoonNotificationManager = comingSoonNotificationManager2;
    }

    /* access modifiers changed from: private */
    /* renamed from: getUpdatedCards */
    public Single<List<HomeBundle>> mo11533a(HomeBundlesModel homeBundlesModel, LoadReactionModel loadReactionModel, String str) {
        ActionItem actionItem;
        List<HomeBundle> list = homeBundlesModel.getList();
        for (HomeBundle next : list) {
            if (next.getType() == HomeBundle.BundleType.EDITORIAL && (next instanceof ActionBundle) && (actionItem = ((ActionBundle) next).getActionItem()) != null && actionItem.getCardId().equals(str)) {
                actionItem.setReactions(loadReactionModel.getTopReactionList());
                actionItem.setNumberOfReactions(loadReactionModel.getTotal());
                actionItem.setUserReaction(loadReactionModel.getMyReaction());
            }
        }
        return Single.m10119a(list);
    }

    /* access modifiers changed from: private */
    public HomePromotionsWrapper mapPromotions(PromotionsModel promotionsModel) {
        float f;
        int i;
        List<PromotionApp> appsList = promotionsModel.getAppsList();
        if (appsList.size() > 0) {
            int i2 = 0;
            float f2 = 0.0f;
            for (PromotionApp next : appsList) {
                if (!next.isClaimed()) {
                    i2++;
                    f2 += next.getAppcValue();
                }
            }
            i = i2;
            f = f2;
        } else {
            i = 0;
            f = 0.0f;
        }
        return new HomePromotionsWrapper(promotionsModel.getTitle(), promotionsModel.getFeatureGraphic(), !appsList.isEmpty(), i, f, this.promotionsPreferencesManager.shouldShowPromotionsDialog() && f > 0.0f, promotionsModel.getDialogDescription());
    }

    private void setLoadMoreError() {
        this.bundlesRepository.setHomeLoadMoreError();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11535a(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            setLoadMoreError();
        }
    }

    public C5328b actionBundleImpression(ActionBundle actionBundle) {
        return C5328b.m10169d(new C3049l(this, actionBundle));
    }

    /* renamed from: b */
    public /* synthetic */ void mo11538b(ActionBundle actionBundle) {
        this.blacklistManager.blacklist(actionBundle.getType().toString(), actionBundle.getActionItem().getCardId());
    }

    public C5328b cancelAppComingSoonNotification(String str) {
        return this.comingSoonNotificationManager.cancelScheduledNotification(str);
    }

    public Single<ReactionsResponse> deleteReaction(String str, String str2) {
        return this.reactionsManager.deleteReaction(str, str2);
    }

    public boolean hasMore() {
        return this.bundlesRepository.hasMore();
    }

    public Single<HomePromotionsWrapper> hasPromotionApps() {
        return this.promotionsManager.getPromotionsModel(this.promotionType).mo18569d(new C3023j(this));
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return this.reactionsManager.isFirstReaction(str, str2);
    }

    public C5368e<HomeBundlesModel> loadFreshHomeBundles() {
        return this.bundlesRepository.loadFreshHomeBundles();
    }

    public C5368e<HomeBundlesModel> loadHomeBundles() {
        return this.bundlesRepository.loadHomeBundles();
    }

    public C5368e<HomeBundlesModel> loadNextHomeBundles() {
        return this.bundlesRepository.loadNextHomeBundles(false).mo18664b(new C3036k(this));
    }

    public Single<List<HomeBundle>> loadReactionModel(String str, String str2, HomeBundlesModel homeBundlesModel) {
        return this.reactionsManager.loadReactionModel(str, str2).mo18567c().mo18681d(new C3010i(homeBundlesModel)).mo18700m().mo18559a(new C2984g(this, homeBundlesModel, str));
    }

    public C5328b remove(ActionBundle actionBundle) {
        return C5328b.m10169d(new C2971f(this, actionBundle)).mo18587a(this.bundlesRepository.remove(actionBundle));
    }

    public void setPromotionsDialogShown() {
        this.promotionsPreferencesManager.setPromotionsDialogShown();
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.reactionsManager.setReaction(str, str2, str3);
    }

    public C5328b setupAppComingSoonNotification(String str) {
        return this.comingSoonNotificationManager.setupNotification(str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11536a(ActionBundle actionBundle) {
        this.blacklistManager.addImpression(actionBundle.getType().toString(), actionBundle.getActionItem().getCardId());
    }

    public Single<List<HomeBundle>> loadReactionModel(String str, String str2) {
        return this.reactionsManager.loadReactionModel(str, str2).mo18559a(new C3062m(this, str));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11534a(String str, LoadReactionModel loadReactionModel) {
        return this.bundlesRepository.loadHomeBundles().mo18700m().mo18559a(new C2997h(this, loadReactionModel, str));
    }
}
