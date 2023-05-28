package p015cm.aptoide.p016pt.app;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, mo16641d2 = {"Lcm/aptoide/pt/app/AppCoinsAdvertisingModel;", "", "appcReward", "", "hasAdvertising", "", "fiatReward", "fiatCurrency", "", "appcBudget", "endDate", "(DZDLjava/lang/String;DLjava/lang/String;)V", "getAppcBudget", "()D", "getAppcReward", "getEndDate", "()Ljava/lang/String;", "getFiatCurrency", "getFiatReward", "getHasAdvertising", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.AppCoinsAdvertisingModel */
/* compiled from: AppCoinsAdvertisingModel.kt */
public final class AppCoinsAdvertisingModel {
    private final double appcBudget;
    private final double appcReward;
    private final String endDate;
    private final String fiatCurrency;
    private final double fiatReward;
    private final boolean hasAdvertising;

    public AppCoinsAdvertisingModel() {
        this(0.0d, false, 0.0d, (String) null, 0.0d, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public AppCoinsAdvertisingModel(double d, boolean z, double d2, String str, double d3, String str2) {
        C10202j.m34178b(str, "fiatCurrency");
        C10202j.m34178b(str2, "endDate");
        this.appcReward = d;
        this.hasAdvertising = z;
        this.fiatReward = d2;
        this.fiatCurrency = str;
        this.appcBudget = d3;
        this.endDate = str2;
    }

    public static /* synthetic */ AppCoinsAdvertisingModel copy$default(AppCoinsAdvertisingModel appCoinsAdvertisingModel, double d, boolean z, double d2, String str, double d3, String str2, int i, Object obj) {
        AppCoinsAdvertisingModel appCoinsAdvertisingModel2 = appCoinsAdvertisingModel;
        return appCoinsAdvertisingModel.copy((i & 1) != 0 ? appCoinsAdvertisingModel2.appcReward : d, (i & 2) != 0 ? appCoinsAdvertisingModel2.hasAdvertising : z, (i & 4) != 0 ? appCoinsAdvertisingModel2.fiatReward : d2, (i & 8) != 0 ? appCoinsAdvertisingModel2.fiatCurrency : str, (i & 16) != 0 ? appCoinsAdvertisingModel2.appcBudget : d3, (i & 32) != 0 ? appCoinsAdvertisingModel2.endDate : str2);
    }

    public final double component1() {
        return this.appcReward;
    }

    public final boolean component2() {
        return this.hasAdvertising;
    }

    public final double component3() {
        return this.fiatReward;
    }

    public final String component4() {
        return this.fiatCurrency;
    }

    public final double component5() {
        return this.appcBudget;
    }

    public final String component6() {
        return this.endDate;
    }

    public final AppCoinsAdvertisingModel copy(double d, boolean z, double d2, String str, double d3, String str2) {
        String str3 = str;
        C10202j.m34178b(str3, "fiatCurrency");
        String str4 = str2;
        C10202j.m34178b(str4, "endDate");
        return new AppCoinsAdvertisingModel(d, z, d2, str3, d3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppCoinsAdvertisingModel)) {
            return false;
        }
        AppCoinsAdvertisingModel appCoinsAdvertisingModel = (AppCoinsAdvertisingModel) obj;
        return Double.compare(this.appcReward, appCoinsAdvertisingModel.appcReward) == 0 && this.hasAdvertising == appCoinsAdvertisingModel.hasAdvertising && Double.compare(this.fiatReward, appCoinsAdvertisingModel.fiatReward) == 0 && C10202j.m34176a((Object) this.fiatCurrency, (Object) appCoinsAdvertisingModel.fiatCurrency) && Double.compare(this.appcBudget, appCoinsAdvertisingModel.appcBudget) == 0 && C10202j.m34176a((Object) this.endDate, (Object) appCoinsAdvertisingModel.endDate);
    }

    public final double getAppcBudget() {
        return this.appcBudget;
    }

    public final double getAppcReward() {
        return this.appcReward;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    public final double getFiatReward() {
        return this.fiatReward;
    }

    public final boolean getHasAdvertising() {
        return this.hasAdvertising;
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.appcReward) * 31;
        boolean z = this.hasAdvertising;
        if (z) {
            z = true;
        }
        int a2 = (((a + (z ? 1 : 0)) * 31) + Double.doubleToLongBits(this.fiatReward)) * 31;
        String str = this.fiatCurrency;
        int i = 0;
        int hashCode = (((a2 + (str != null ? str.hashCode() : 0)) * 31) + Double.doubleToLongBits(this.appcBudget)) * 31;
        String str2 = this.endDate;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppCoinsAdvertisingModel(appcReward=" + this.appcReward + ", hasAdvertising=" + this.hasAdvertising + ", fiatReward=" + this.fiatReward + ", fiatCurrency=" + this.fiatCurrency + ", appcBudget=" + this.appcBudget + ", endDate=" + this.endDate + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppCoinsAdvertisingModel(double r11, boolean r13, double r14, java.lang.String r16, double r17, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20 & 1
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r11
        L_0x0009:
            r0 = r20 & 2
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = r13
        L_0x0010:
            r5 = r20 & 4
            if (r5 == 0) goto L_0x0016
            r5 = r1
            goto L_0x0017
        L_0x0016:
            r5 = r14
        L_0x0017:
            r7 = r20 & 8
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x001f
            r7 = r8
            goto L_0x0021
        L_0x001f:
            r7 = r16
        L_0x0021:
            r9 = r20 & 16
            if (r9 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r17
        L_0x0028:
            r9 = r20 & 32
            if (r9 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r8 = r19
        L_0x002f:
            r11 = r10
            r12 = r3
            r14 = r0
            r15 = r5
            r17 = r7
            r18 = r1
            r20 = r8
            r11.<init>(r12, r14, r15, r17, r18, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.AppCoinsAdvertisingModel.<init>(double, boolean, double, java.lang.String, double, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
