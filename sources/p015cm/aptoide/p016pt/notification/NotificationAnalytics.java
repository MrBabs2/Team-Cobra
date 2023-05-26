package p015cm.aptoide.p016pt.notification;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.downloadmanager.Constants;
import p015cm.aptoide.p016pt.link.AptoideInstall;
import p015cm.aptoide.p016pt.link.AptoideInstallParser;

/* renamed from: cm.aptoide.pt.notification.NotificationAnalytics */
public class NotificationAnalytics {
    private static final String AB_TESTING_GROUP = "ab_testing_group";
    private static final String CAMPAIGN_ID = "campaign_id";
    public static final String NOTIFICATION_EVENT_NAME = "NOTIFICATION";
    public static final String NOTIFICATION_IMPRESSION = "Aptoide_Push_Notification_Impression";
    public static final String NOTIFICATION_PRESSED = "Aptoide_Push_Notification_Click";
    public static final String NOTIFICATION_RECEIVED = "Aptoide_Push_Notification_Received";
    private static final String PACKAGE_NAME = "package_name";
    private static final String TYPE = "type";
    private String abTestingGroup;
    private final AnalyticsManager analyticsManager;
    private AptoideInstall aptoideInstall;
    private final AptoideInstallParser aptoideInstallParser;
    private int campaignId;
    private final NavigationTracker navigationTracker;

    /* renamed from: cm.aptoide.pt.notification.NotificationAnalytics$NotificationTypes */
    private enum NotificationTypes {
        CAMPAIGN,
        LIKE,
        COMMENT,
        POPULAR,
        NEW_FOLLOWER,
        NEW_SHARE,
        NEW_ACTIVITY,
        OTHER,
        UPDATES
    }

    public NotificationAnalytics(AptoideInstallParser aptoideInstallParser2, AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.aptoideInstallParser = aptoideInstallParser2;
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private Map<String, Object> addToMapIfNotNull(Map<String, Object> map, String str, String str2) {
        if (str != null && !str.isEmpty()) {
            map.put(AB_TESTING_GROUP, str);
        }
        if (str2 != null && !str2.isEmpty()) {
            map.put("package_name", getPackageNameFromUrl(str2));
        }
        return map;
    }

    private Map<String, Object> createCampaignNotificationMap(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(CAMPAIGN_ID, i != 0 ? String.valueOf(i) : null);
        hashMap.put(AB_TESTING_GROUP, str);
        return hashMap;
    }

    private Map<String, Object> createPushNotificationEventMap(int i, String str, int i2, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(CAMPAIGN_ID, i2 != 0 ? String.valueOf(i2) : null);
        hashMap.put("type", matchNotificationTypeToString(i).toString().toLowerCase());
        return addToMapIfNotNull(hashMap, str, getPackageNameFromUrl(str2));
    }

    private Map<String, Object> createUpdateNotificationEventsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", NotificationTypes.UPDATES.toString().toLowerCase());
        return hashMap;
    }

    private String getPackageNameFromUrl(String str) {
        for (String str2 : str.split("&")) {
            if (str2.contains(Constants.PACKAGE)) {
                return str2.split("=")[1];
            }
        }
        return "";
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private boolean isSameApp(String str, long j) {
        AptoideInstall aptoideInstall2 = this.aptoideInstall;
        return aptoideInstall2 != null && (aptoideInstall2.getPackageName().equals(str) || this.aptoideInstall.getAppId() == j);
    }

    private NotificationTypes matchNotificationTypeToString(int i) {
        switch (i) {
            case 0:
                return NotificationTypes.CAMPAIGN;
            case 1:
                return NotificationTypes.LIKE;
            case 2:
                return NotificationTypes.COMMENT;
            case 3:
                return NotificationTypes.POPULAR;
            case 4:
                return NotificationTypes.NEW_FOLLOWER;
            case 5:
                return NotificationTypes.NEW_SHARE;
            case 6:
                return NotificationTypes.NEW_ACTIVITY;
            default:
                return NotificationTypes.OTHER;
        }
    }

    public String getAbTestingGroup(String str, long j) {
        if (!isSameApp(str, j)) {
            return "";
        }
        String str2 = this.abTestingGroup;
        this.abTestingGroup = null;
        return str2;
    }

    public int getCampaignId(String str, long j) {
        if (!isSameApp(str, j)) {
            return 0;
        }
        int i = this.campaignId;
        this.campaignId = 0;
        return i;
    }

    public void sendNotificationTouchEvent(String str) {
        this.analyticsManager.logEvent(str);
    }

    public void sendPushNotficationImpressionEvent(int i, String str, int i2, String str2) {
        if (i == 0) {
            this.analyticsManager.logEvent(createCampaignNotificationMap(str, i2), NOTIFICATION_EVENT_NAME, AnalyticsManager.Action.IMPRESSION, getViewName(true));
        }
        this.analyticsManager.logEvent(createPushNotificationEventMap(i, str, i2, str2), NOTIFICATION_IMPRESSION, AnalyticsManager.Action.IMPRESSION, getViewName(true));
    }

    public void sendPushNotificationPressedEvent(int i, String str, int i2, String str2) {
        if (i == 0) {
            this.analyticsManager.logEvent(createCampaignNotificationMap(str, i2), NOTIFICATION_EVENT_NAME, AnalyticsManager.Action.CLICK, getViewName(true));
        }
        this.analyticsManager.logEvent(createPushNotificationEventMap(i, str, i2, str2), NOTIFICATION_PRESSED, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPushNotificationReceivedEvent(int i, String str, int i2, String str2) {
        this.analyticsManager.logEvent(createPushNotificationEventMap(i, str, i2, str2), NOTIFICATION_RECEIVED, AnalyticsManager.Action.VIEW, getViewName(true));
    }

    public void sendUpdatesNotificationClickEvent() {
        this.analyticsManager.logEvent(createUpdateNotificationEventsMap(), NOTIFICATION_PRESSED, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendUpdatesNotificationImpressionEvent() {
        this.analyticsManager.logEvent(createUpdateNotificationEventsMap(), NOTIFICATION_IMPRESSION, AnalyticsManager.Action.IMPRESSION, getViewName(true));
    }

    public void sendUpdatesNotificationReceivedEvent() {
        this.analyticsManager.logEvent(createUpdateNotificationEventsMap(), NOTIFICATION_RECEIVED, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void sendNotificationTouchEvent(String str, int i, String str2, int i2, String str3) {
        sendNotificationTouchEvent(str);
        if (i == 0) {
            AptoideInstall parse = this.aptoideInstallParser.parse(str2);
            if (parse.getAppId() > 0 || (parse.getPackageName() != null && !parse.getPackageName().isEmpty())) {
                this.aptoideInstall = parse;
                this.campaignId = i2;
                this.abTestingGroup = str3;
            }
        }
    }
}
