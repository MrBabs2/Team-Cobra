package p015cm.aptoide.p016pt;

import android.content.Context;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;

/* renamed from: cm.aptoide.pt.GmsStatusValueProvider */
public class GmsStatusValueProvider {
    private static final String HAS_GMS = "Has GMS";
    private static final String NO_GMS = "No GMS";
    private Context context;
    private String gmsValue = "";

    public GmsStatusValueProvider(Context context2) {
        this.context = context2;
    }

    public String getGmsValue() {
        String str = this.gmsValue;
        if (str == null || str.isEmpty()) {
            this.gmsValue = AdNetworkUtils.isGooglePlayServicesAvailable(this.context) ? HAS_GMS : NO_GMS;
        }
        return this.gmsValue;
    }
}
