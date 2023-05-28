package p015cm.aptoide.p016pt.app;

import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;

/* renamed from: cm.aptoide.pt.app.CampaignAnalytics */
public class CampaignAnalytics {
    private final AnalyticsManager analyticsManager;
    private final Map<String, CampaignEvent> cache;

    /* renamed from: cm.aptoide.pt.app.CampaignAnalytics$CampaignEvent */
    public static class CampaignEvent {
        private String packageName;
        private String url;
        private int vercode;

        public CampaignEvent(String str, String str2, int i) {
            this.url = str;
            this.packageName = str2;
            this.vercode = i;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getUrl() {
            return this.url;
        }

        public int getVercode() {
            return this.vercode;
        }
    }

    public CampaignAnalytics(Map<String, CampaignEvent> map, AnalyticsManager analyticsManager2) {
        this.cache = map;
        this.analyticsManager = analyticsManager2;
    }

    public void convertCampaignEvent(String str, int i) {
        String str2 = str + String.valueOf(i);
        if (this.cache.containsKey(str2)) {
            this.analyticsManager.logEvent(this.cache.get(str2).getUrl());
        }
    }

    public void sendCampaignConversionEvent(String str, String str2, int i) {
        CampaignEvent campaignEvent = new CampaignEvent(str, str2, i);
        Map<String, CampaignEvent> map = this.cache;
        map.put(str2 + String.valueOf(i), campaignEvent);
    }
}
