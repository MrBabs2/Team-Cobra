package p015cm.aptoide.p016pt.dataprovider;

import android.telephony.TelephonyManager;

/* renamed from: cm.aptoide.pt.dataprovider.NetworkOperatorManager */
public class NetworkOperatorManager {
    private final TelephonyManager telephonyManager;

    public NetworkOperatorManager(TelephonyManager telephonyManager2) {
        this.telephonyManager = telephonyManager2;
    }

    private int codePortionLength(String str) {
        return Math.min(3, str.length());
    }

    public String getMobileCountryCode() {
        String networkOperator = this.telephonyManager.getNetworkOperator();
        if (networkOperator == null) {
            return "";
        }
        return networkOperator.substring(0, codePortionLength(networkOperator));
    }

    public String getMobileNetworkCode() {
        String networkOperator = this.telephonyManager.getNetworkOperator();
        if (networkOperator == null) {
            return "";
        }
        return networkOperator.substring(codePortionLength(networkOperator));
    }

    public String getSimCountryISO() {
        return this.telephonyManager.getSimCountryIso();
    }

    public boolean isSimStateReady() {
        return this.telephonyManager.getSimState() == 5;
    }
}
