package p015cm.aptoide.p016pt.themes;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo16641d2 = {"Lcm/aptoide/pt/themes/NewFeature;", "", "id", "", "title", "description", "actionId", "actionStringRes", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getActionId", "()Ljava/lang/String;", "getActionStringRes", "()I", "getDescription", "getId", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.themes.NewFeature */
/* compiled from: NewFeature.kt */
public final class NewFeature {
    private final String actionId;
    private final int actionStringRes;
    private final String description;

    /* renamed from: id */
    private final String f7556id;
    private final String title;

    public NewFeature(String str, String str2, String str3, String str4, int i) {
        C10202j.m34178b(str, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        C10202j.m34178b(str2, "title");
        C10202j.m34178b(str3, "description");
        C10202j.m34178b(str4, "actionId");
        this.f7556id = str;
        this.title = str2;
        this.description = str3;
        this.actionId = str4;
        this.actionStringRes = i;
    }

    public static /* synthetic */ NewFeature copy$default(NewFeature newFeature, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = newFeature.f7556id;
        }
        if ((i2 & 2) != 0) {
            str2 = newFeature.title;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = newFeature.description;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = newFeature.actionId;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = newFeature.actionStringRes;
        }
        return newFeature.copy(str, str5, str6, str7, i);
    }

    public final String component1() {
        return this.f7556id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.actionId;
    }

    public final int component5() {
        return this.actionStringRes;
    }

    public final NewFeature copy(String str, String str2, String str3, String str4, int i) {
        C10202j.m34178b(str, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        C10202j.m34178b(str2, "title");
        C10202j.m34178b(str3, "description");
        C10202j.m34178b(str4, "actionId");
        return new NewFeature(str, str2, str3, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewFeature)) {
            return false;
        }
        NewFeature newFeature = (NewFeature) obj;
        return C10202j.m34176a((Object) this.f7556id, (Object) newFeature.f7556id) && C10202j.m34176a((Object) this.title, (Object) newFeature.title) && C10202j.m34176a((Object) this.description, (Object) newFeature.description) && C10202j.m34176a((Object) this.actionId, (Object) newFeature.actionId) && this.actionStringRes == newFeature.actionStringRes;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final int getActionStringRes() {
        return this.actionStringRes;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f7556id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.f7556id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.actionId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.actionStringRes;
    }

    public String toString() {
        return "NewFeature(id=" + this.f7556id + ", title=" + this.title + ", description=" + this.description + ", actionId=" + this.actionId + ", actionStringRes=" + this.actionStringRes + ")";
    }
}
