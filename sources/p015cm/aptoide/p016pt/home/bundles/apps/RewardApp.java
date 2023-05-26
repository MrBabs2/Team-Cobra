package p015cm.aptoide.p016pt.home.bundles.apps;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.view.app.Application;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cBs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "Lcm/aptoide/pt/view/app/Application;", "appName", "", "appIcon", "ratingAverage", "", "downloadsNumber", "", "packageName", "appId", "", "tag", "hasBilling", "", "clickUrl", "downloadUrl", "reward", "Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;", "featureGraphic", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;Ljava/lang/String;)V", "getClickUrl", "()Ljava/lang/String;", "getDownloadUrl", "getFeatureGraphic", "getReward", "()Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;", "Fiat", "Reward", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.apps.RewardApp */
/* compiled from: RewardApp.kt */
public final class RewardApp extends Application {
    private final String clickUrl;
    private final String downloadUrl;
    private final String featureGraphic;
    private final Reward reward;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;", "", "amount", "", "currency", "", "symbol", "(DLjava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "setAmount", "(D)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.bundles.apps.RewardApp$Fiat */
    /* compiled from: RewardApp.kt */
    public static final class Fiat {
        private double amount;
        private String currency;
        private String symbol;

        public Fiat() {
            this(0.0d, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public Fiat(double d, String str, String str2) {
            C10202j.m34178b(str, "currency");
            C10202j.m34178b(str2, "symbol");
            this.amount = d;
            this.currency = str;
            this.symbol = str2;
        }

        public static /* synthetic */ Fiat copy$default(Fiat fiat, double d, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = fiat.amount;
            }
            if ((i & 2) != 0) {
                str = fiat.currency;
            }
            if ((i & 4) != 0) {
                str2 = fiat.symbol;
            }
            return fiat.copy(d, str, str2);
        }

        public final double component1() {
            return this.amount;
        }

        public final String component2() {
            return this.currency;
        }

        public final String component3() {
            return this.symbol;
        }

        public final Fiat copy(double d, String str, String str2) {
            C10202j.m34178b(str, "currency");
            C10202j.m34178b(str2, "symbol");
            return new Fiat(d, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fiat)) {
                return false;
            }
            Fiat fiat = (Fiat) obj;
            return Double.compare(this.amount, fiat.amount) == 0 && C10202j.m34176a((Object) this.currency, (Object) fiat.currency) && C10202j.m34176a((Object) this.symbol, (Object) fiat.symbol);
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            int a = Double.doubleToLongBits(this.amount) * 31;
            String str = this.currency;
            int i = 0;
            int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.symbol;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final void setAmount(double d) {
            this.amount = d;
        }

        public final void setCurrency(String str) {
            C10202j.m34178b(str, "<set-?>");
            this.currency = str;
        }

        public final void setSymbol(String str) {
            C10202j.m34178b(str, "<set-?>");
            this.symbol = str;
        }

        public String toString() {
            return "Fiat(amount=" + this.amount + ", currency=" + this.currency + ", symbol=" + this.symbol + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Fiat(double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? -1.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/apps/RewardApp$Reward;", "", "appc", "", "fiat", "Lcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;", "(DLcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;)V", "getAppc", "()D", "getFiat", "()Lcm/aptoide/pt/home/bundles/apps/RewardApp$Fiat;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.bundles.apps.RewardApp$Reward */
    /* compiled from: RewardApp.kt */
    public static final class Reward {
        private final double appc;
        private final Fiat fiat;

        public Reward(double d, Fiat fiat2) {
            C10202j.m34178b(fiat2, "fiat");
            this.appc = d;
            this.fiat = fiat2;
        }

        public static /* synthetic */ Reward copy$default(Reward reward, double d, Fiat fiat2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = reward.appc;
            }
            if ((i & 2) != 0) {
                fiat2 = reward.fiat;
            }
            return reward.copy(d, fiat2);
        }

        public final double component1() {
            return this.appc;
        }

        public final Fiat component2() {
            return this.fiat;
        }

        public final Reward copy(double d, Fiat fiat2) {
            C10202j.m34178b(fiat2, "fiat");
            return new Reward(d, fiat2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reward)) {
                return false;
            }
            Reward reward = (Reward) obj;
            return Double.compare(this.appc, reward.appc) == 0 && C10202j.m34176a((Object) this.fiat, (Object) reward.fiat);
        }

        public final double getAppc() {
            return this.appc;
        }

        public final Fiat getFiat() {
            return this.fiat;
        }

        public int hashCode() {
            int a = Double.doubleToLongBits(this.appc) * 31;
            Fiat fiat2 = this.fiat;
            return a + (fiat2 != null ? fiat2.hashCode() : 0);
        }

        public String toString() {
            return "Reward(appc=" + this.appc + ", fiat=" + this.fiat + ")";
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RewardApp(java.lang.String r18, java.lang.String r19, float r20, int r21, java.lang.String r22, long r23, java.lang.String r25, boolean r26, java.lang.String r27, java.lang.String r28, p015cm.aptoide.p016pt.home.bundles.apps.RewardApp.Reward r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 256(0x100, float:3.59E-43)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r13 = r2
            goto L_0x000c
        L_0x000a:
            r13 = r27
        L_0x000c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0012
            r14 = r2
            goto L_0x0014
        L_0x0012:
            r14 = r28
        L_0x0014:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x001b
            r16 = r2
            goto L_0x001d
        L_0x001b:
            r16 = r30
        L_0x001d:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r25
            r12 = r26
            r15 = r29
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.home.bundles.apps.RewardApp.<init>(java.lang.String, java.lang.String, float, int, java.lang.String, long, java.lang.String, boolean, java.lang.String, java.lang.String, cm.aptoide.pt.home.bundles.apps.RewardApp$Reward, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getFeatureGraphic() {
        return this.featureGraphic;
    }

    public final Reward getReward() {
        return this.reward;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RewardApp(String str, String str2, float f, int i, String str3, long j, String str4, boolean z, String str5, String str6, Reward reward2, String str7) {
        super(str, str2, f, i, str3, j, str4, z);
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, "appIcon");
        C10202j.m34178b(str3, "packageName");
        C10202j.m34178b(str4, StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.clickUrl = str5;
        this.downloadUrl = str6;
        this.reward = reward2;
        this.featureGraphic = str7;
    }
}
