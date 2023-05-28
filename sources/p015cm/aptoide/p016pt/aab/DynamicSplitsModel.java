package p015cm.aptoide.p016pt.aab;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsModel;", "", "dynamicSplitsList", "", "Lcm/aptoide/pt/aab/DynamicSplit;", "(Ljava/util/List;)V", "getDynamicSplitsList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.aab.DynamicSplitsModel */
/* compiled from: DynamicSplitsModel.kt */
public final class DynamicSplitsModel {
    private final List<DynamicSplit> dynamicSplitsList;

    public DynamicSplitsModel(List<DynamicSplit> list) {
        C10202j.m34178b(list, "dynamicSplitsList");
        this.dynamicSplitsList = list;
    }

    public static /* synthetic */ DynamicSplitsModel copy$default(DynamicSplitsModel dynamicSplitsModel, List<DynamicSplit> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dynamicSplitsModel.dynamicSplitsList;
        }
        return dynamicSplitsModel.copy(list);
    }

    public final List<DynamicSplit> component1() {
        return this.dynamicSplitsList;
    }

    public final DynamicSplitsModel copy(List<DynamicSplit> list) {
        C10202j.m34178b(list, "dynamicSplitsList");
        return new DynamicSplitsModel(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DynamicSplitsModel) && C10202j.m34176a((Object) this.dynamicSplitsList, (Object) ((DynamicSplitsModel) obj).dynamicSplitsList);
        }
        return true;
    }

    public final List<DynamicSplit> getDynamicSplitsList() {
        return this.dynamicSplitsList;
    }

    public int hashCode() {
        List<DynamicSplit> list = this.dynamicSplitsList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "DynamicSplitsModel(dynamicSplitsList=" + this.dynamicSplitsList + ")";
    }
}
