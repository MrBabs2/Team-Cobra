package p015cm.aptoide.p016pt.search.model;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bBu\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0013HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u00102\u001a\u00020\u0013J\u0006\u00103\u001a\u00020\u0013J\t\u00104\u001a\u00020\u000fHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00066"}, mo16641d2 = {"Lcm/aptoide/pt/search/model/SearchResult;", "", "query", "", "error", "Lcm/aptoide/pt/search/model/SearchResultError;", "(Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchResultError;)V", "specificStore", "(Ljava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchResultError;)V", "searchResultsList", "", "Lcm/aptoide/pt/search/model/SearchAppResult;", "filters", "Lcm/aptoide/pt/search/model/SearchFilters;", "currentOffset", "", "nextOffset", "total", "loading", "", "isFreshResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcm/aptoide/pt/search/model/SearchFilters;IIIZZLcm/aptoide/pt/search/model/SearchResultError;)V", "getCurrentOffset", "()I", "getError", "()Lcm/aptoide/pt/search/model/SearchResultError;", "getFilters", "()Lcm/aptoide/pt/search/model/SearchFilters;", "()Z", "getLoading", "getNextOffset", "getQuery", "()Ljava/lang/String;", "getSearchResultsList", "()Ljava/util/List;", "getSpecificStore", "getTotal", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hasError", "hasMore", "hashCode", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.model.SearchResult */
/* compiled from: SearchResult.kt */
public final class SearchResult {
    private final int currentOffset;
    private final SearchResultError error;
    private final SearchFilters filters;
    private final boolean isFreshResult;
    private final boolean loading;
    private final int nextOffset;
    private final String query;
    private final List<SearchAppResult> searchResultsList;
    private final String specificStore;
    private final int total;

    public SearchResult(String str) {
        this(str, (String) null, (List) null, (SearchFilters) null, 0, 0, 0, false, false, (SearchResultError) null, 1022, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2) {
        this(str, str2, (List) null, (SearchFilters) null, 0, 0, 0, false, false, (SearchResultError) null, 1020, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list) {
        this(str, str2, list, (SearchFilters) null, 0, 0, 0, false, false, (SearchResultError) null, 1016, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters) {
        this(str, str2, list, searchFilters, 0, 0, 0, false, false, (SearchResultError) null, 1008, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i) {
        this(str, str2, list, searchFilters, i, 0, 0, false, false, (SearchResultError) null, 992, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i, int i2) {
        this(str, str2, list, searchFilters, i, i2, 0, false, false, (SearchResultError) null, 960, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i, int i2, int i3) {
        this(str, str2, list, searchFilters, i, i2, i3, false, false, (SearchResultError) null, 896, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i, int i2, int i3, boolean z) {
        this(str, str2, list, searchFilters, i, i2, i3, z, false, (SearchResultError) null, 768, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i, int i2, int i3, boolean z, boolean z2) {
        this(str, str2, list, searchFilters, i, i2, i3, z, z2, (SearchResultError) null, AdRequest.MAX_CONTENT_URL_LENGTH, (DefaultConstructorMarker) null);
    }

    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i, int i2, int i3, boolean z, boolean z2, SearchResultError searchResultError) {
        C10202j.m34178b(str, "query");
        C10202j.m34178b(list, "searchResultsList");
        this.query = str;
        this.specificStore = str2;
        this.searchResultsList = list;
        this.filters = searchFilters;
        this.currentOffset = i;
        this.nextOffset = i2;
        this.total = i3;
        this.loading = z;
        this.isFreshResult = z2;
        this.error = searchResultError;
    }

    public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, String str, String str2, List list, SearchFilters searchFilters, int i, int i2, int i3, boolean z, boolean z2, SearchResultError searchResultError, int i4, Object obj) {
        SearchResult searchResult2 = searchResult;
        int i5 = i4;
        return searchResult.copy((i5 & 1) != 0 ? searchResult2.query : str, (i5 & 2) != 0 ? searchResult2.specificStore : str2, (i5 & 4) != 0 ? searchResult2.searchResultsList : list, (i5 & 8) != 0 ? searchResult2.filters : searchFilters, (i5 & 16) != 0 ? searchResult2.currentOffset : i, (i5 & 32) != 0 ? searchResult2.nextOffset : i2, (i5 & 64) != 0 ? searchResult2.total : i3, (i5 & 128) != 0 ? searchResult2.loading : z, (i5 & 256) != 0 ? searchResult2.isFreshResult : z2, (i5 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? searchResult2.error : searchResultError);
    }

    public final String component1() {
        return this.query;
    }

    public final SearchResultError component10() {
        return this.error;
    }

    public final String component2() {
        return this.specificStore;
    }

    public final List<SearchAppResult> component3() {
        return this.searchResultsList;
    }

    public final SearchFilters component4() {
        return this.filters;
    }

    public final int component5() {
        return this.currentOffset;
    }

    public final int component6() {
        return this.nextOffset;
    }

    public final int component7() {
        return this.total;
    }

    public final boolean component8() {
        return this.loading;
    }

    public final boolean component9() {
        return this.isFreshResult;
    }

    public final SearchResult copy(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i, int i2, int i3, boolean z, boolean z2, SearchResultError searchResultError) {
        C10202j.m34178b(str, "query");
        C10202j.m34178b(list, "searchResultsList");
        return new SearchResult(str, str2, list, searchFilters, i, i2, i3, z, z2, searchResultError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) obj;
        return C10202j.m34176a((Object) this.query, (Object) searchResult.query) && C10202j.m34176a((Object) this.specificStore, (Object) searchResult.specificStore) && C10202j.m34176a((Object) this.searchResultsList, (Object) searchResult.searchResultsList) && C10202j.m34176a((Object) this.filters, (Object) searchResult.filters) && this.currentOffset == searchResult.currentOffset && this.nextOffset == searchResult.nextOffset && this.total == searchResult.total && this.loading == searchResult.loading && this.isFreshResult == searchResult.isFreshResult && C10202j.m34176a((Object) this.error, (Object) searchResult.error);
    }

    public final int getCurrentOffset() {
        return this.currentOffset;
    }

    public final SearchResultError getError() {
        return this.error;
    }

    public final SearchFilters getFilters() {
        return this.filters;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getNextOffset() {
        return this.nextOffset;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<SearchAppResult> getSearchResultsList() {
        return this.searchResultsList;
    }

    public final String getSpecificStore() {
        return this.specificStore;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean hasError() {
        return this.error != null;
    }

    public final boolean hasMore() {
        return this.nextOffset < this.total && !this.loading && !hasError();
    }

    public int hashCode() {
        String str = this.query;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.specificStore;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<SearchAppResult> list = this.searchResultsList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        SearchFilters searchFilters = this.filters;
        int hashCode4 = (((((((hashCode3 + (searchFilters != null ? searchFilters.hashCode() : 0)) * 31) + this.currentOffset) * 31) + this.nextOffset) * 31) + this.total) * 31;
        boolean z = this.loading;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isFreshResult;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        SearchResultError searchResultError = this.error;
        if (searchResultError != null) {
            i = searchResultError.hashCode();
        }
        return i3 + i;
    }

    public final boolean isFreshResult() {
        return this.isFreshResult;
    }

    public String toString() {
        return "SearchResult(query=" + this.query + ", specificStore=" + this.specificStore + ", searchResultsList=" + this.searchResultsList + ", filters=" + this.filters + ", currentOffset=" + this.currentOffset + ", nextOffset=" + this.nextOffset + ", total=" + this.total + ", loading=" + this.loading + ", isFreshResult=" + this.isFreshResult + ", error=" + this.error + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchResult(java.lang.String r12, java.lang.String r13, java.util.List r14, p015cm.aptoide.p016pt.search.model.SearchFilters r15, int r16, int r17, int r18, boolean r19, boolean r20, p015cm.aptoide.p016pt.search.model.SearchResultError r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0018
            java.util.List r3 = java.util.Collections.emptyList()
            java.lang.String r4 = "Collections.emptyList()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r4)
            goto L_0x0019
        L_0x0018:
            r3 = r14
        L_0x0019:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r15
        L_0x0020:
            r5 = r0 & 16
            r6 = -1
            if (r5 == 0) goto L_0x0027
            r5 = -1
            goto L_0x0029
        L_0x0027:
            r5 = r16
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = -1
            goto L_0x0031
        L_0x002f:
            r7 = r17
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r6 = r18
        L_0x0038:
            r8 = r0 & 128(0x80, float:1.794E-43)
            r9 = 0
            if (r8 == 0) goto L_0x003f
            r8 = 0
            goto L_0x0041
        L_0x003f:
            r8 = r19
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r9 = r20
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r2 = r21
        L_0x004f:
            r13 = r11
            r14 = r12
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r7
            r20 = r6
            r21 = r8
            r22 = r9
            r23 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.search.model.SearchResult.<init>(java.lang.String, java.lang.String, java.util.List, cm.aptoide.pt.search.model.SearchFilters, int, int, int, boolean, boolean, cm.aptoide.pt.search.model.SearchResultError, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, SearchResultError searchResultError) {
        this(str, (String) null, searchResultError);
        C10202j.m34178b(str, "query");
        C10202j.m34178b(searchResultError, "error");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchResult(java.lang.String r13, java.lang.String r14, p015cm.aptoide.p016pt.search.model.SearchResultError r15) {
        /*
            r12 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.C10202j.m34178b(r13, r0)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.C10202j.m34178b(r15, r0)
            java.util.List r4 = java.util.Collections.emptyList()
            java.lang.String r0 = "Collections.emptyList()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r4, (java.lang.String) r0)
            r5 = 0
            r6 = -1
            r7 = -1
            r8 = -1
            r9 = 0
            r10 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r11 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.search.model.SearchResult.<init>(java.lang.String, java.lang.String, cm.aptoide.pt.search.model.SearchResultError):void");
    }
}
