package p015cm.aptoide.p016pt.analytics;

import p015cm.aptoide.analytics.implementation.tracking.Tracking;
import p015cm.aptoide.analytics.implementation.tracking.UTM;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BiUtmAnalyticsRequestBody;

/* renamed from: cm.aptoide.pt.analytics.UTMTrackingBuilder */
public class UTMTrackingBuilder {
    private final Tracking tracking;
    private final UTM utm;

    public UTMTrackingBuilder(Tracking tracking2, UTM utm2) {
        this.tracking = tracking2;
        this.utm = utm2;
    }

    public BiUtmAnalyticsRequestBody.Data getUTMTrackingData() {
        BiUtmAnalyticsRequestBody.Data data = new BiUtmAnalyticsRequestBody.Data();
        data.setEntryPoint(this.utm.getEntryPoint());
        data.setSiteVersion(this.tracking.getSiteVersion());
        data.setUserAgent(this.tracking.getUserAgent());
        BiUtmAnalyticsRequestBody.App app = new BiUtmAnalyticsRequestBody.App();
        app.setPackageName(this.tracking.getPackageName());
        app.setUrl(this.tracking.getUrl());
        data.setApp(app);
        BiUtmAnalyticsRequestBody.UTM utm2 = new BiUtmAnalyticsRequestBody.UTM();
        utm2.setCampaign(this.utm.getUtmCampaign());
        utm2.setContent(this.utm.getUtmContent());
        utm2.setMedium(this.utm.getUtmMedium());
        utm2.setSource(this.utm.getUtmSource());
        data.setUtm(utm2);
        return data;
    }
}
