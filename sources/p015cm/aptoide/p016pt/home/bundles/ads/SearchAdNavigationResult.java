package p015cm.aptoide.p016pt.home.bundles.ads;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/ads/SearchAdNavigationResult;", "", "tag", "", "searchAdResult", "Lcm/aptoide/pt/search/model/SearchAdResult;", "(Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchAdResult;)V", "getSearchAdResult", "()Lcm/aptoide/pt/search/model/SearchAdResult;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.ads.SearchAdNavigationResult */
/* compiled from: SearchAdNavigationResult.kt */
public final class SearchAdNavigationResult {
    private final SearchAdResult searchAdResult;
    private final String tag;

    public SearchAdNavigationResult(String str, SearchAdResult searchAdResult2) {
        C10202j.m34178b(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
        C10202j.m34178b(searchAdResult2, "searchAdResult");
        this.tag = str;
        this.searchAdResult = searchAdResult2;
    }

    public static /* synthetic */ SearchAdNavigationResult copy$default(SearchAdNavigationResult searchAdNavigationResult, String str, SearchAdResult searchAdResult2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchAdNavigationResult.tag;
        }
        if ((i & 2) != 0) {
            searchAdResult2 = searchAdNavigationResult.searchAdResult;
        }
        return searchAdNavigationResult.copy(str, searchAdResult2);
    }

    public final String component1() {
        return this.tag;
    }

    public final SearchAdResult component2() {
        return this.searchAdResult;
    }

    public final SearchAdNavigationResult copy(String str, SearchAdResult searchAdResult2) {
        C10202j.m34178b(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
        C10202j.m34178b(searchAdResult2, "searchAdResult");
        return new SearchAdNavigationResult(str, searchAdResult2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAdNavigationResult)) {
            return false;
        }
        SearchAdNavigationResult searchAdNavigationResult = (SearchAdNavigationResult) obj;
        return C10202j.m34176a((Object) this.tag, (Object) searchAdNavigationResult.tag) && C10202j.m34176a((Object) this.searchAdResult, (Object) searchAdNavigationResult.searchAdResult);
    }

    public final SearchAdResult getSearchAdResult() {
        return this.searchAdResult;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.tag;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SearchAdResult searchAdResult2 = this.searchAdResult;
        if (searchAdResult2 != null) {
            i = searchAdResult2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SearchAdNavigationResult(tag=" + this.tag + ", searchAdResult=" + this.searchAdResult + ")";
    }
}
