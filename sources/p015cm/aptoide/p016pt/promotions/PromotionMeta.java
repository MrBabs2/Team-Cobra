package p015cm.aptoide.p016pt.promotions;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, mo16641d2 = {"Lcm/aptoide/pt/promotions/PromotionMeta;", "", "title", "", "promotionId", "type", "background", "dialogDescription", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Ljava/lang/String;", "getDescription", "getDialogDescription", "getPromotionId", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.promotions.PromotionMeta */
/* compiled from: PromotionMeta.kt */
public final class PromotionMeta {
    private final String background;
    private final String description;
    private final String dialogDescription;
    private final String promotionId;
    private final String title;
    private final String type;

    public PromotionMeta() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public PromotionMeta(String str, String str2, String str3, String str4, String str5, String str6) {
        C10202j.m34178b(str, "title");
        C10202j.m34178b(str2, "promotionId");
        C10202j.m34178b(str3, "type");
        C10202j.m34178b(str4, "background");
        C10202j.m34178b(str5, "dialogDescription");
        C10202j.m34178b(str6, "description");
        this.title = str;
        this.promotionId = str2;
        this.type = str3;
        this.background = str4;
        this.dialogDescription = str5;
        this.description = str6;
    }

    public static /* synthetic */ PromotionMeta copy$default(PromotionMeta promotionMeta, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionMeta.title;
        }
        if ((i & 2) != 0) {
            str2 = promotionMeta.promotionId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = promotionMeta.type;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = promotionMeta.background;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = promotionMeta.dialogDescription;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = promotionMeta.description;
        }
        return promotionMeta.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.promotionId;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.background;
    }

    public final String component5() {
        return this.dialogDescription;
    }

    public final String component6() {
        return this.description;
    }

    public final PromotionMeta copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C10202j.m34178b(str, "title");
        C10202j.m34178b(str2, "promotionId");
        C10202j.m34178b(str3, "type");
        C10202j.m34178b(str4, "background");
        C10202j.m34178b(str5, "dialogDescription");
        C10202j.m34178b(str6, "description");
        return new PromotionMeta(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionMeta)) {
            return false;
        }
        PromotionMeta promotionMeta = (PromotionMeta) obj;
        return C10202j.m34176a((Object) this.title, (Object) promotionMeta.title) && C10202j.m34176a((Object) this.promotionId, (Object) promotionMeta.promotionId) && C10202j.m34176a((Object) this.type, (Object) promotionMeta.type) && C10202j.m34176a((Object) this.background, (Object) promotionMeta.background) && C10202j.m34176a((Object) this.dialogDescription, (Object) promotionMeta.dialogDescription) && C10202j.m34176a((Object) this.description, (Object) promotionMeta.description);
    }

    public final String getBackground() {
        return this.background;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDialogDescription() {
        return this.dialogDescription;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.promotionId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.background;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.dialogDescription;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.description;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "PromotionMeta(title=" + this.title + ", promotionId=" + this.promotionId + ", type=" + this.type + ", background=" + this.background + ", dialogDescription=" + this.dialogDescription + ", description=" + this.description + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PromotionMeta(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            java.lang.String r0 = ""
            if (r13 == 0) goto L_0x0008
            r13 = r0
            goto L_0x0009
        L_0x0008:
            r13 = r6
        L_0x0009:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r7
        L_0x0010:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r9
        L_0x001e:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r10
        L_0x0025:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002b
            r12 = r0
            goto L_0x002c
        L_0x002b:
            r12 = r11
        L_0x002c:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.promotions.PromotionMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
