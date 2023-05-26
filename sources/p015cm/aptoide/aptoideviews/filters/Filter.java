package p015cm.aptoide.aptoideviews.filters;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/Filter;", "", "name", "", "selected", "", "identifier", "(Ljava/lang/String;ZLjava/lang/String;)V", "id", "", "getId$aptoide_views_prodRelease", "()I", "setId$aptoide_views_prodRelease", "(I)V", "getIdentifier", "()Ljava/lang/String;", "getName", "getSelected", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.Filter */
/* compiled from: Filter.kt */
public final class Filter {

    /* renamed from: id */
    private int f3447id;
    private final String identifier;
    private final String name;
    private final boolean selected;

    public Filter() {
        this((String) null, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public Filter(String str) {
        this(str, false, (String) null, 6, (DefaultConstructorMarker) null);
    }

    public Filter(String str, boolean z) {
        this(str, z, (String) null, 4, (DefaultConstructorMarker) null);
    }

    public Filter(String str, boolean z, String str2) {
        C10202j.m34178b(str, "name");
        this.name = str;
        this.selected = z;
        this.identifier = str2;
        this.f3447id = -1;
    }

    public static /* synthetic */ Filter copy$default(Filter filter, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filter.name;
        }
        if ((i & 2) != 0) {
            z = filter.selected;
        }
        if ((i & 4) != 0) {
            str2 = filter.identifier;
        }
        return filter.copy(str, z, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.selected;
    }

    public final String component3() {
        return this.identifier;
    }

    public final Filter copy(String str, boolean z, String str2) {
        C10202j.m34178b(str, "name");
        return new Filter(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) obj;
        return C10202j.m34176a((Object) this.name, (Object) filter.name) && this.selected == filter.selected && C10202j.m34176a((Object) this.identifier, (Object) filter.identifier);
    }

    public final int getId$aptoide_views_prodRelease() {
        return this.f3447id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.selected;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.identifier;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final void setId$aptoide_views_prodRelease(int i) {
        this.f3447id = i;
    }

    public String toString() {
        return "Filter(name=" + this.name + ", selected=" + this.selected + ", identifier=" + this.identifier + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Filter(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }
}
