package p015cm.aptoide.p016pt.home;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;

/* renamed from: cm.aptoide.pt.home.HomeAnalytics */
public class HomeAnalytics {
    private static final String ACTION = "action";
    private static final String BUNDLE_TAG = "bundle_tag";
    static final String CHIP_CLICK = "chip";
    static final String CHIP_TAG = "chip_tag";
    private static final String CLICK = "click";
    private static final String CURATION_CARD = "curation_card";
    public static final String CURATION_CARD_CLICK = "Curation_Card_Click";
    public static final String CURATION_CARD_IMPRESSION = "Curation_Card_Impression";
    public static final String HOME_CHIP_INTERACT = "Home_Chip_Interact";
    public static final String HOME_INTERACT = "Home_Interact";

    /* renamed from: ID */
    private static final String f5544ID = "id";
    static final String IMPRESSION = "impression";
    private static final String PACKAGE_NAME = "package_name";
    private static final String PROMOTION_DIALOG = "promotion-dialog";
    private static final String PROMOTION_ICON = "promotion-icon";
    static final String PULL_REFRESH = "pull refresh";
    static final String PUSH_LOAD_MORE = "push load more";
    static final String SCROLL_RIGHT = "scroll right";
    static final String TAP = "tap";
    static final String TAP_ON_APP = "tap on app";
    static final String TAP_ON_CARD = "tap on card";
    static final String TAP_ON_CARD_DISMISS = "tap on card dismiss";
    private static final String TAP_ON_CHIP = "tap on chip";
    static final String TAP_ON_MORE = "tap on more";
    private static final String TYPE = "type";
    public static final String VANILLA_PROMOTIONAL_CARDS = "vanilla_promotional_cards";
    static final String VIEW_CARD = "view card";
    private static final String WHERE = "where";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public HomeAnalytics(NavigationTracker navigationTracker2, AnalyticsManager analyticsManager2) {
        this.navigationTracker = navigationTracker2;
        this.analyticsManager = analyticsManager2;
    }

    private AnalyticsManager.Action parseAction(HomeEvent.Type type) {
        if (type.equals(HomeEvent.Type.AD)) {
            return AnalyticsManager.Action.OPEN;
        }
        throw new IllegalStateException("TYPE " + type.name() + " NOT VALID");
    }

    private void sendAdInteractEvent(String str, int i, String str2, int i2, String str3, HomeEvent.Type type, ApplicationAd.Network network) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("app_rating", Integer.valueOf(i));
        hashMap.put("package_name", str2);
        hashMap.put(BUNDLE_TAG, str3);
        hashMap.put("bundle_position", Integer.valueOf(i2));
        hashMap.put("network", network.getName());
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, parseAction(type), this.navigationTracker.getViewName(true));
    }

    public void convertAppcAdClick(String str) {
        this.analyticsManager.logEvent(str);
    }

    public Map<String, Object> createChipTapInteractMap(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put(BUNDLE_TAG, str2);
        hashMap.put(CHIP_TAG, str3);
        return hashMap;
    }

    public void sendActionItemDismissInteractEvent(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CARD_DISMISS);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.DISMISS, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemEditorialImpressionEvent(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", VIEW_CARD);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        hashMap.put("card_id", str2);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemImpressionEvent(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", VIEW_CARD);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemTapOnCardInteractEvent(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CARD);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }

    public void sendAdClickEvent(int i, String str, int i2, String str2, HomeEvent.Type type, ApplicationAd.Network network) {
        sendAdInteractEvent(TAP_ON_APP, i, str, i2, str2, type, network);
    }

    public void sendChipHomeInteractEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", CHIP_CLICK);
        hashMap.put(BUNDLE_TAG, str);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendChipInteractEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CHIP);
        hashMap.put(CHIP_TAG, str);
        this.analyticsManager.logEvent(hashMap, HOME_CHIP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendChipTapOnApp(String str, String str2, String str3) {
        Map<String, Object> createChipTapInteractMap = createChipTapInteractMap(TAP_ON_APP, str, str3);
        createChipTapInteractMap.put("package_name", str2);
        this.analyticsManager.logEvent(createChipTapInteractMap, HOME_CHIP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendChipTapOnMore(String str, String str2) {
        this.analyticsManager.logEvent(createChipTapInteractMap(TAP_ON_MORE, str, str2), HOME_CHIP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendDeleteEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "delete_reaction");
        hashMap.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(hashMap, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialImpressionEvent(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", IMPRESSION);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("card_id", str2);
        hashMap.put("bundle_position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, CURATION_CARD_IMPRESSION, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialInteractEvent(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CARD);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("card_id", str2);
        hashMap.put("bundle_position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, CURATION_CARD_CLICK, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }

    public void sendLoadMoreInteractEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", PUSH_LOAD_MORE);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.ENDLESS_SCROLL, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalAppClickEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", CLICK);
        hashMap.put("type", str);
        hashMap.put("package_name", str2);
        this.analyticsManager.logEvent(hashMap, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalAppHomeInteractImpressionEvent(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", VIEW_CARD);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalAppImpressionEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", IMPRESSION);
        hashMap.put("type", str);
        hashMap.put("package_name", str2);
        this.analyticsManager.logEvent(hashMap, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalArticleClickEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", CLICK);
        hashMap.put("type", str);
        hashMap.put("id", str2);
        this.analyticsManager.logEvent(hashMap, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalArticleImpressionEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", IMPRESSION);
        hashMap.put("type", str);
        hashMap.put("id", str2);
        this.analyticsManager.logEvent(hashMap, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsDialogDismissEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CARD_DISMISS);
        hashMap.put(BUNDLE_TAG, PROMOTION_DIALOG);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.DISMISS, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsDialogImpressionEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", IMPRESSION);
        hashMap.put(BUNDLE_TAG, PROMOTION_DIALOG);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsDialogNavigateEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CARD);
        hashMap.put(BUNDLE_TAG, PROMOTION_DIALOG);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsIconClickEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP);
        hashMap.put(BUNDLE_TAG, PROMOTION_ICON);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsImpressionEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", IMPRESSION);
        hashMap.put(BUNDLE_TAG, PROMOTION_ICON);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPullRefreshInteractEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", PULL_REFRESH);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.PULL_REFRESH, this.navigationTracker.getViewName(true));
    }

    public void sendReactedEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "click_to_react");
        hashMap.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(hashMap, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendReactionButtonClickEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "view_reactions");
        hashMap.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(hashMap, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendScrollRightInteractEvent(int i, String str, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", SCROLL_RIGHT);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        hashMap.put("bundle_total_items", Integer.valueOf(i2));
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.SCROLL, this.navigationTracker.getViewName(true));
    }

    public void sendTapOnAppInteractEvent(double d, String str, int i, int i2, String str2, int i3) {
        sendTapOnAppInteractEvent(d, str, i, i2, str2, i3, (String) null);
    }

    public void sendTapOnMoreInteractEvent(int i, String str, int i2) {
        sendTapOnMoreInteractEvent(i, str, i2, (String) null);
    }

    public void sendTapOnAppInteractEvent(double d, String str, int i, int i2, String str2, int i3, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_APP);
        hashMap.put("app_rating", Double.valueOf(d));
        hashMap.put("package_name", str);
        hashMap.put("app_position", Integer.valueOf(i));
        hashMap.put(BUNDLE_TAG, str2);
        hashMap.put("bundle_position", Integer.valueOf(i2));
        hashMap.put("bundle_total_items", Integer.valueOf(i3));
        if (str3 != null) {
            hashMap.put(CHIP_TAG, str3);
        }
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendTapOnMoreInteractEvent(int i, String str, int i2, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_MORE);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        hashMap.put("bundle_total_items", Integer.valueOf(i2));
        if (str2 != null) {
            hashMap.put(CHIP_TAG, str2);
        }
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemTapOnCardInteractEvent(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CARD);
        hashMap.put(BUNDLE_TAG, str);
        hashMap.put("bundle_position", Integer.valueOf(i));
        hashMap.put("card_id", str2);
        this.analyticsManager.logEvent(hashMap, HOME_INTERACT, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }
}
