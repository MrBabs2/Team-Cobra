package p015cm.aptoide.p016pt.promotions;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001&B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010!\u001a\u00020\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0006\u0010$\u001a\u00020\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006'"}, mo16641d2 = {"Lcm/aptoide/pt/promotions/Promotion;", "", "isClaimed", "", "appc", "", "packageName", "", "promotionId", "claimActions", "", "Lcm/aptoide/pt/promotions/Promotion$ClaimAction;", "(ZFLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAppc", "()F", "getClaimActions", "()Ljava/util/List;", "setClaimActions", "(Ljava/util/List;)V", "()Z", "setClaimed", "(Z)V", "getPackageName", "()Ljava/lang/String;", "getPromotionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "exists", "hashCode", "", "isClaimable", "toString", "ClaimAction", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.promotions.Promotion */
/* compiled from: Promotion.kt */
public final class Promotion {
    private final float appc;
    private List<? extends ClaimAction> claimActions;
    private boolean isClaimed;
    private final String packageName;
    private final String promotionId;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/pt/promotions/Promotion$ClaimAction;", "", "(Ljava/lang/String;I)V", "INSTALL", "MIGRATE", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.promotions.Promotion$ClaimAction */
    /* compiled from: Promotion.kt */
    public enum ClaimAction {
        INSTALL,
        MIGRATE
    }

    public Promotion() {
        this(false, 0.0f, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public Promotion(boolean z, float f, String str, String str2, List<? extends ClaimAction> list) {
        C10202j.m34178b(str, "packageName");
        C10202j.m34178b(str2, "promotionId");
        C10202j.m34178b(list, "claimActions");
        this.isClaimed = z;
        this.appc = f;
        this.packageName = str;
        this.promotionId = str2;
        this.claimActions = list;
    }

    public static /* synthetic */ Promotion copy$default(Promotion promotion, boolean z, float f, String str, String str2, List<? extends ClaimAction> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = promotion.isClaimed;
        }
        if ((i & 2) != 0) {
            f = promotion.appc;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            str = promotion.packageName;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = promotion.promotionId;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = promotion.claimActions;
        }
        return promotion.copy(z, f2, str3, str4, list);
    }

    public final boolean component1() {
        return this.isClaimed;
    }

    public final float component2() {
        return this.appc;
    }

    public final String component3() {
        return this.packageName;
    }

    public final String component4() {
        return this.promotionId;
    }

    public final List<ClaimAction> component5() {
        return this.claimActions;
    }

    public final Promotion copy(boolean z, float f, String str, String str2, List<? extends ClaimAction> list) {
        C10202j.m34178b(str, "packageName");
        C10202j.m34178b(str2, "promotionId");
        C10202j.m34178b(list, "claimActions");
        return new Promotion(z, f, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) obj;
        return this.isClaimed == promotion.isClaimed && Float.compare(this.appc, promotion.appc) == 0 && C10202j.m34176a((Object) this.packageName, (Object) promotion.packageName) && C10202j.m34176a((Object) this.promotionId, (Object) promotion.promotionId) && C10202j.m34176a((Object) this.claimActions, (Object) promotion.claimActions);
    }

    public final boolean exists() {
        return !(this.promotionId.length() == 0);
    }

    public final float getAppc() {
        return this.appc;
    }

    public final List<ClaimAction> getClaimActions() {
        return this.claimActions;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public int hashCode() {
        boolean z = this.isClaimed;
        if (z) {
            z = true;
        }
        int floatToIntBits = (((z ? 1 : 0) * true) + Float.floatToIntBits(this.appc)) * 31;
        String str = this.packageName;
        int i = 0;
        int hashCode = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.promotionId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<? extends ClaimAction> list = this.claimActions;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final boolean isClaimable() {
        return exists() && !this.isClaimed;
    }

    public final boolean isClaimed() {
        return this.isClaimed;
    }

    public final void setClaimActions(List<? extends ClaimAction> list) {
        C10202j.m34178b(list, "<set-?>");
        this.claimActions = list;
    }

    public final void setClaimed(boolean z) {
        this.isClaimed = z;
    }

    public String toString() {
        return "Promotion(isClaimed=" + this.isClaimed + ", appc=" + this.appc + ", packageName=" + this.packageName + ", promotionId=" + this.promotionId + ", claimActions=" + this.claimActions + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Promotion(boolean r4, float r5, java.lang.String r6, java.lang.String r7, java.util.List r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000e
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x000f
        L_0x000e:
            r10 = r5
        L_0x000f:
            r5 = r9 & 4
            java.lang.String r0 = ""
            if (r5 == 0) goto L_0x0017
            r1 = r0
            goto L_0x0018
        L_0x0017:
            r1 = r6
        L_0x0018:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r7
        L_0x001e:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0026
            java.util.List r8 = kotlin.p262y.C10529o.m35736a()
        L_0x0026:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.promotions.Promotion.<init>(boolean, float, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
