package p015cm.aptoide.p016pt.home.more.apps;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;", "", "title", "", "tag", "action", "eventName", "groupId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAction", "()Ljava/lang/String;", "getEventName", "getGroupId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTag", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsConfiguration */
/* compiled from: ListAppsConfiguration.kt */
public final class ListAppsConfiguration {
    private final String action;
    private final String eventName;
    private final Long groupId;
    private final String tag;
    private final String title;

    public ListAppsConfiguration(String str, String str2, String str3, String str4, Long l) {
        this.title = str;
        this.tag = str2;
        this.action = str3;
        this.eventName = str4;
        this.groupId = l;
    }

    public static /* synthetic */ ListAppsConfiguration copy$default(ListAppsConfiguration listAppsConfiguration, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listAppsConfiguration.title;
        }
        if ((i & 2) != 0) {
            str2 = listAppsConfiguration.tag;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = listAppsConfiguration.action;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = listAppsConfiguration.eventName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            l = listAppsConfiguration.groupId;
        }
        return listAppsConfiguration.copy(str, str5, str6, str7, l);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.tag;
    }

    public final String component3() {
        return this.action;
    }

    public final String component4() {
        return this.eventName;
    }

    public final Long component5() {
        return this.groupId;
    }

    public final ListAppsConfiguration copy(String str, String str2, String str3, String str4, Long l) {
        return new ListAppsConfiguration(str, str2, str3, str4, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListAppsConfiguration)) {
            return false;
        }
        ListAppsConfiguration listAppsConfiguration = (ListAppsConfiguration) obj;
        return C10202j.m34176a((Object) this.title, (Object) listAppsConfiguration.title) && C10202j.m34176a((Object) this.tag, (Object) listAppsConfiguration.tag) && C10202j.m34176a((Object) this.action, (Object) listAppsConfiguration.action) && C10202j.m34176a((Object) this.eventName, (Object) listAppsConfiguration.eventName) && C10202j.m34176a((Object) this.groupId, (Object) listAppsConfiguration.groupId);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Long getGroupId() {
        return this.groupId;
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
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.action;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.eventName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.groupId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "ListAppsConfiguration(title=" + this.title + ", tag=" + this.tag + ", action=" + this.action + ", eventName=" + this.eventName + ", groupId=" + this.groupId + ")";
    }
}
