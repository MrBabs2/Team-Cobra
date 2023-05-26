package p015cm.aptoide.p016pt.aab;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006&"}, mo16641d2 = {"Lcm/aptoide/pt/aab/DynamicSplit;", "", "name", "", "type", "md5Sum", "path", "fileSize", "", "deliveryTypes", "", "configSplits", "Lcm/aptoide/pt/aab/Split;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;)V", "getConfigSplits", "()Ljava/util/List;", "getDeliveryTypes", "getFileSize", "()J", "getMd5Sum", "()Ljava/lang/String;", "getName", "getPath", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.aab.DynamicSplit */
/* compiled from: DynamicSplit.kt */
public final class DynamicSplit {
    private final List<Split> configSplits;
    private final List<String> deliveryTypes;
    private final long fileSize;
    private final String md5Sum;
    private final String name;
    private final String path;
    private final String type;

    public DynamicSplit(String str, String str2, String str3, String str4, long j, List<String> list, List<Split> list2) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, "type");
        C10202j.m34178b(str3, "md5Sum");
        C10202j.m34178b(str4, "path");
        C10202j.m34178b(list, "deliveryTypes");
        C10202j.m34178b(list2, "configSplits");
        this.name = str;
        this.type = str2;
        this.md5Sum = str3;
        this.path = str4;
        this.fileSize = j;
        this.deliveryTypes = list;
        this.configSplits = list2;
    }

    public static /* synthetic */ DynamicSplit copy$default(DynamicSplit dynamicSplit, String str, String str2, String str3, String str4, long j, List list, List list2, int i, Object obj) {
        DynamicSplit dynamicSplit2 = dynamicSplit;
        return dynamicSplit.copy((i & 1) != 0 ? dynamicSplit2.name : str, (i & 2) != 0 ? dynamicSplit2.type : str2, (i & 4) != 0 ? dynamicSplit2.md5Sum : str3, (i & 8) != 0 ? dynamicSplit2.path : str4, (i & 16) != 0 ? dynamicSplit2.fileSize : j, (i & 32) != 0 ? dynamicSplit2.deliveryTypes : list, (i & 64) != 0 ? dynamicSplit2.configSplits : list2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.md5Sum;
    }

    public final String component4() {
        return this.path;
    }

    public final long component5() {
        return this.fileSize;
    }

    public final List<String> component6() {
        return this.deliveryTypes;
    }

    public final List<Split> component7() {
        return this.configSplits;
    }

    public final DynamicSplit copy(String str, String str2, String str3, String str4, long j, List<String> list, List<Split> list2) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, "type");
        C10202j.m34178b(str3, "md5Sum");
        C10202j.m34178b(str4, "path");
        List<String> list3 = list;
        C10202j.m34178b(list3, "deliveryTypes");
        List<Split> list4 = list2;
        C10202j.m34178b(list4, "configSplits");
        return new DynamicSplit(str, str2, str3, str4, j, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSplit)) {
            return false;
        }
        DynamicSplit dynamicSplit = (DynamicSplit) obj;
        return C10202j.m34176a((Object) this.name, (Object) dynamicSplit.name) && C10202j.m34176a((Object) this.type, (Object) dynamicSplit.type) && C10202j.m34176a((Object) this.md5Sum, (Object) dynamicSplit.md5Sum) && C10202j.m34176a((Object) this.path, (Object) dynamicSplit.path) && this.fileSize == dynamicSplit.fileSize && C10202j.m34176a((Object) this.deliveryTypes, (Object) dynamicSplit.deliveryTypes) && C10202j.m34176a((Object) this.configSplits, (Object) dynamicSplit.configSplits);
    }

    public final List<Split> getConfigSplits() {
        return this.configSplits;
    }

    public final List<String> getDeliveryTypes() {
        return this.deliveryTypes;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getMd5Sum() {
        return this.md5Sum;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.md5Sum;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.path;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + C4755f.m7799a(this.fileSize)) * 31;
        List<String> list = this.deliveryTypes;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<Split> list2 = this.configSplits;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "DynamicSplit(name=" + this.name + ", type=" + this.type + ", md5Sum=" + this.md5Sum + ", path=" + this.path + ", fileSize=" + this.fileSize + ", deliveryTypes=" + this.deliveryTypes + ", configSplits=" + this.configSplits + ")";
    }
}
