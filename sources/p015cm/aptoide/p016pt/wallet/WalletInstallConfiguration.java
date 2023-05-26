package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/pt/wallet/WalletInstallConfiguration;", "", "appPackageName", "", "walletPackageName", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppPackageName", "()Ljava/lang/String;", "getWalletPackageName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallConfiguration */
/* compiled from: WalletInstallConfiguration.kt */
public final class WalletInstallConfiguration {
    private final String appPackageName;
    private final String walletPackageName;

    public WalletInstallConfiguration(String str, String str2) {
        C10202j.m34178b(str2, "walletPackageName");
        this.appPackageName = str;
        this.walletPackageName = str2;
    }

    public static /* synthetic */ WalletInstallConfiguration copy$default(WalletInstallConfiguration walletInstallConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletInstallConfiguration.appPackageName;
        }
        if ((i & 2) != 0) {
            str2 = walletInstallConfiguration.walletPackageName;
        }
        return walletInstallConfiguration.copy(str, str2);
    }

    public final String component1() {
        return this.appPackageName;
    }

    public final String component2() {
        return this.walletPackageName;
    }

    public final WalletInstallConfiguration copy(String str, String str2) {
        C10202j.m34178b(str2, "walletPackageName");
        return new WalletInstallConfiguration(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletInstallConfiguration)) {
            return false;
        }
        WalletInstallConfiguration walletInstallConfiguration = (WalletInstallConfiguration) obj;
        return C10202j.m34176a((Object) this.appPackageName, (Object) walletInstallConfiguration.appPackageName) && C10202j.m34176a((Object) this.walletPackageName, (Object) walletInstallConfiguration.walletPackageName);
    }

    public final String getAppPackageName() {
        return this.appPackageName;
    }

    public final String getWalletPackageName() {
        return this.walletPackageName;
    }

    public int hashCode() {
        String str = this.appPackageName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.walletPackageName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "WalletInstallConfiguration(appPackageName=" + this.appPackageName + ", walletPackageName=" + this.walletPackageName + ")";
    }
}
