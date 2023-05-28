package p015cm.aptoide.p016pt.bonus;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/bonus/BonusAppcResponse;", "", "result", "", "Lcm/aptoide/pt/bonus/BonusAppcResponse$Result;", "status", "", "update_date", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getUpdate_date", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Result", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.bonus.BonusAppcResponse */
/* compiled from: BonusAppcResponse.kt */
public final class BonusAppcResponse {
    private final List<Result> result;
    private final String status;
    private final String update_date;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo16641d2 = {"Lcm/aptoide/pt/bonus/BonusAppcResponse$Result;", "", "amount", "", "bonus", "level", "(III)V", "getAmount", "()I", "getBonus", "getLevel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.bonus.BonusAppcResponse$Result */
    /* compiled from: BonusAppcResponse.kt */
    public static final class Result {
        private final int amount;
        private final int bonus;
        private final int level;

        public Result() {
            this(0, 0, 0, 7, (DefaultConstructorMarker) null);
        }

        public Result(int i, int i2, int i3) {
            this.amount = i;
            this.bonus = i2;
            this.level = i3;
        }

        public static /* synthetic */ Result copy$default(Result result, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = result.amount;
            }
            if ((i4 & 2) != 0) {
                i2 = result.bonus;
            }
            if ((i4 & 4) != 0) {
                i3 = result.level;
            }
            return result.copy(i, i2, i3);
        }

        public final int component1() {
            return this.amount;
        }

        public final int component2() {
            return this.bonus;
        }

        public final int component3() {
            return this.level;
        }

        public final Result copy(int i, int i2, int i3) {
            return new Result(i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return this.amount == result.amount && this.bonus == result.bonus && this.level == result.level;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final int getBonus() {
            return this.bonus;
        }

        public final int getLevel() {
            return this.level;
        }

        public int hashCode() {
            return (((this.amount * 31) + this.bonus) * 31) + this.level;
        }

        public String toString() {
            return "Result(amount=" + this.amount + ", bonus=" + this.bonus + ", level=" + this.level + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Result(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    public BonusAppcResponse() {
        this((List) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public BonusAppcResponse(List<Result> list, String str, String str2) {
        C10202j.m34178b(list, "result");
        this.result = list;
        this.status = str;
        this.update_date = str2;
    }

    public static /* synthetic */ BonusAppcResponse copy$default(BonusAppcResponse bonusAppcResponse, List<Result> list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bonusAppcResponse.result;
        }
        if ((i & 2) != 0) {
            str = bonusAppcResponse.status;
        }
        if ((i & 4) != 0) {
            str2 = bonusAppcResponse.update_date;
        }
        return bonusAppcResponse.copy(list, str, str2);
    }

    public final List<Result> component1() {
        return this.result;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.update_date;
    }

    public final BonusAppcResponse copy(List<Result> list, String str, String str2) {
        C10202j.m34178b(list, "result");
        return new BonusAppcResponse(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusAppcResponse)) {
            return false;
        }
        BonusAppcResponse bonusAppcResponse = (BonusAppcResponse) obj;
        return C10202j.m34176a((Object) this.result, (Object) bonusAppcResponse.result) && C10202j.m34176a((Object) this.status, (Object) bonusAppcResponse.status) && C10202j.m34176a((Object) this.update_date, (Object) bonusAppcResponse.update_date);
    }

    public final List<Result> getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUpdate_date() {
        return this.update_date;
    }

    public int hashCode() {
        List<Result> list = this.result;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.update_date;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "BonusAppcResponse(result=" + this.result + ", status=" + this.status + ", update_date=" + this.update_date + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusAppcResponse(java.util.List r2, java.lang.String r3, java.lang.String r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r1 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L_0x000d
            java.util.List r2 = java.util.Collections.emptyList()
            java.lang.String r6 = "Collections.emptyList()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r6)
        L_0x000d:
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L_0x0013
            r3 = r0
        L_0x0013:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0018
            r4 = r0
        L_0x0018:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.bonus.BonusAppcResponse.<init>(java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
