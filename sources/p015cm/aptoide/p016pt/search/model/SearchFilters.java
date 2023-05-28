package p015cm.aptoide.p016pt.search.model;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/pt/search/model/SearchFilters;", "", "onlyFollowedStores", "", "onlyTrustedApps", "onlyBetaApps", "onlyAppcApps", "(ZZZZ)V", "getOnlyAppcApps", "()Z", "getOnlyBetaApps", "getOnlyFollowedStores", "getOnlyTrustedApps", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.model.SearchFilters */
/* compiled from: SearchFilters.kt */
public final class SearchFilters {
    private final boolean onlyAppcApps;
    private final boolean onlyBetaApps;
    private final boolean onlyFollowedStores;
    private final boolean onlyTrustedApps;

    public SearchFilters(boolean z, boolean z2, boolean z3, boolean z4) {
        this.onlyFollowedStores = z;
        this.onlyTrustedApps = z2;
        this.onlyBetaApps = z3;
        this.onlyAppcApps = z4;
    }

    public static /* synthetic */ SearchFilters copy$default(SearchFilters searchFilters, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchFilters.onlyFollowedStores;
        }
        if ((i & 2) != 0) {
            z2 = searchFilters.onlyTrustedApps;
        }
        if ((i & 4) != 0) {
            z3 = searchFilters.onlyBetaApps;
        }
        if ((i & 8) != 0) {
            z4 = searchFilters.onlyAppcApps;
        }
        return searchFilters.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.onlyFollowedStores;
    }

    public final boolean component2() {
        return this.onlyTrustedApps;
    }

    public final boolean component3() {
        return this.onlyBetaApps;
    }

    public final boolean component4() {
        return this.onlyAppcApps;
    }

    public final SearchFilters copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new SearchFilters(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFilters)) {
            return false;
        }
        SearchFilters searchFilters = (SearchFilters) obj;
        return this.onlyFollowedStores == searchFilters.onlyFollowedStores && this.onlyTrustedApps == searchFilters.onlyTrustedApps && this.onlyBetaApps == searchFilters.onlyBetaApps && this.onlyAppcApps == searchFilters.onlyAppcApps;
    }

    public final boolean getOnlyAppcApps() {
        return this.onlyAppcApps;
    }

    public final boolean getOnlyBetaApps() {
        return this.onlyBetaApps;
    }

    public final boolean getOnlyFollowedStores() {
        return this.onlyFollowedStores;
    }

    public final boolean getOnlyTrustedApps() {
        return this.onlyTrustedApps;
    }

    public int hashCode() {
        boolean z = this.onlyFollowedStores;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.onlyTrustedApps;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.onlyBetaApps;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.onlyAppcApps;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "SearchFilters(onlyFollowedStores=" + this.onlyFollowedStores + ", onlyTrustedApps=" + this.onlyTrustedApps + ", onlyBetaApps=" + this.onlyBetaApps + ", onlyAppcApps=" + this.onlyAppcApps + ")";
    }
}
