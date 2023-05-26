package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListConfiguration;", "", "title", "", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListConfiguration */
/* compiled from: EarnAppcListConfiguration.kt */
public final class EarnAppcListConfiguration {
    private final String tag;
    private final String title;

    public EarnAppcListConfiguration(String str, String str2) {
        this.title = str;
        this.tag = str2;
    }

    public static /* synthetic */ EarnAppcListConfiguration copy$default(EarnAppcListConfiguration earnAppcListConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earnAppcListConfiguration.title;
        }
        if ((i & 2) != 0) {
            str2 = earnAppcListConfiguration.tag;
        }
        return earnAppcListConfiguration.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.tag;
    }

    public final EarnAppcListConfiguration copy(String str, String str2) {
        return new EarnAppcListConfiguration(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarnAppcListConfiguration)) {
            return false;
        }
        EarnAppcListConfiguration earnAppcListConfiguration = (EarnAppcListConfiguration) obj;
        return C10202j.m34176a((Object) this.title, (Object) earnAppcListConfiguration.title) && C10202j.m34176a((Object) this.tag, (Object) earnAppcListConfiguration.tag);
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tag;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EarnAppcListConfiguration(title=" + this.title + ", tag=" + this.tag + ")";
    }
}
