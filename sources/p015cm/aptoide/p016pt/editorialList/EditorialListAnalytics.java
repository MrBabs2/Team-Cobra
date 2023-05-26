package p015cm.aptoide.p016pt.editorialList;

import java.util.HashMap;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListAnalytics */
public class EditorialListAnalytics {
    private static final String ACTION = "action";
    private static final String CARD_ID = "card_id";
    private static final String CURATION_CARD = "curation_card";
    public static final String EDITORIAL_BN_CURATION_CARD_CLICK = "Editorial_BN_Curation_Card_Click";
    public static final String EDITORIAL_BN_CURATION_CARD_IMPRESSION = "Editorial_BN_Curation_Card_Impression";
    static final String IMPRESSION = "impression";
    private static final String POSITION = "position";
    static final String TAP_ON_CARD = "tap on card";
    private static final String WHERE = "where";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public EditorialListAnalytics(NavigationTracker navigationTracker2, AnalyticsManager analyticsManager2) {
        this.navigationTracker = navigationTracker2;
        this.analyticsManager = analyticsManager2;
    }

    public void sendDeleteEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "delete_reaction");
        hashMap.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(hashMap, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialImpressionEvent(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", IMPRESSION);
        hashMap.put(CARD_ID, str);
        hashMap.put(POSITION, Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, EDITORIAL_BN_CURATION_CARD_IMPRESSION, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialInteractEvent(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", TAP_ON_CARD);
        hashMap.put(CARD_ID, str);
        hashMap.put(POSITION, Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, EDITORIAL_BN_CURATION_CARD_CLICK, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
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
}
