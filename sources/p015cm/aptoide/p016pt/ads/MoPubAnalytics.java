package p015cm.aptoide.p016pt.ads;

import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.p032t.C4728g;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.logger.Logger;
import p036io.rakam.api.C4759f;
import p112n.p113d.p114a.C10562b;
import p112n.p115f.p116a.p117a.C5299a;

/* renamed from: cm.aptoide.pt.ads.MoPubAnalytics */
public class MoPubAnalytics {
    private static final String ADS_STATUS_USER_PROPERTY = "ads";

    /* renamed from: cm.aptoide.pt.ads.MoPubAnalytics$1 */
    static /* synthetic */ class C13361 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$ads$WalletAdsOfferManager$OfferResponseStatus */
        static final /* synthetic */ int[] f3775x788a6a9d;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                cm.aptoide.pt.ads.WalletAdsOfferManager$OfferResponseStatus[] r0 = p015cm.aptoide.p016pt.ads.WalletAdsOfferManager.OfferResponseStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3775x788a6a9d = r0
                cm.aptoide.pt.ads.WalletAdsOfferManager$OfferResponseStatus r1 = p015cm.aptoide.p016pt.ads.WalletAdsOfferManager.OfferResponseStatus.NO_ADS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3775x788a6a9d     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.ads.WalletAdsOfferManager$OfferResponseStatus r1 = p015cm.aptoide.p016pt.ads.WalletAdsOfferManager.OfferResponseStatus.ADS_HIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3775x788a6a9d     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.ads.WalletAdsOfferManager$OfferResponseStatus r1 = p015cm.aptoide.p016pt.ads.WalletAdsOfferManager.OfferResponseStatus.ADS_SHOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.ads.MoPubAnalytics.C13361.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.ads.MoPubAnalytics$AdsVisibility */
    private enum AdsVisibility {
        ADS_BLOCKED_BY_OFFER("ads blocked by offer"),
        CONTROL("control"),
        HAS_ADS("has ads");
        
        private final String type;

        private AdsVisibility(String str) {
            this.type = str;
        }

        public String getType() {
            return this.type;
        }
    }

    private JSONObject addAdsSuperProperty(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(ADS_STATUS_USER_PROPERTY, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private String mapAdsVisibilityToAnalyticsValues(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        int i = C13361.f3775x788a6a9d[offerResponseStatus.ordinal()];
        if (i == 1) {
            return "no_ads";
        }
        if (i == 2) {
            return "ads_block_by_offer";
        }
        if (i == 3) {
            return "with_ads";
        }
        throw new IllegalStateException("Invalid OfferResponseStatus");
    }

    private AdsVisibility mapToAdsVisibility(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        int i = C13361.f3775x788a6a9d[offerResponseStatus.ordinal()];
        if (i == 1) {
            return AdsVisibility.CONTROL;
        }
        if (i == 2) {
            return AdsVisibility.ADS_BLOCKED_BY_OFFER;
        }
        if (i == 3) {
            return AdsVisibility.HAS_ADS;
        }
        throw new IllegalStateException("Invalid OfferResponseStatus");
    }

    public void setAdsVisibilityUserProperty(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        Bundle bundle = new Bundle();
        String type = mapToAdsVisibility(offerResponseStatus).getType();
        bundle.putString(ADS_STATUS_USER_PROPERTY, type);
        C4728g.m7727a(bundle, (GraphRequest.C6344f) C1349f0.f3793a);
        C10562b.C10563b.m35860a(ADS_STATUS_USER_PROPERTY, type);
        String mapAdsVisibilityToAnalyticsValues = mapAdsVisibilityToAnalyticsValues(offerResponseStatus);
        C4759f.m7803a().mo16567a(addAdsSuperProperty(mapAdsVisibilityToAnalyticsValues, C4759f.m7803a().mo16579b()));
        C5299a.m10019a(ADS_STATUS_USER_PROPERTY, mapAdsVisibilityToAnalyticsValues);
    }

    public void setMoPubAbTestGroup(boolean z) {
        Bundle bundle = new Bundle();
        String str = "a_without_mopub";
        bundle.putString("ASV-1377-MoPub-Ads", z ? str : "b_with_mopub");
        C4728g.m7727a(bundle, (GraphRequest.C6344f) C1347e0.f3791a);
        if (!z) {
            str = "b_with_mopub";
        }
        C10562b.C10563b.m35860a("ASV-1377-MoPub-Ads", str);
    }

    /* access modifiers changed from: package-private */
    public void setUserId(String str) {
        C4759f.m7803a().mo16587d(str);
        C5299a.m10035e(str);
        Logger.getInstance().mo12975d("RAKAM", "set user");
        Logger.getInstance().mo12975d("INDICATIVE", "set user");
    }
}
