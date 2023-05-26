package p015cm.aptoide.p016pt.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, mo16641d2 = {"Lcm/aptoide/pt/search/model/SearchQueryModel;", "Landroid/os/Parcelable;", "userQuery", "", "finalQuery", "source", "Lcm/aptoide/pt/search/model/Source;", "(Ljava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/search/model/Source;)V", "getFinalQuery", "()Ljava/lang/String;", "getSource", "()Lcm/aptoide/pt/search/model/Source;", "getUserQuery", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.model.SearchQueryModel */
/* compiled from: SearchQueryModel.kt */
public final class SearchQueryModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String finalQuery;
    private final Source source;
    private final String userQuery;

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.search.model.SearchQueryModel$Creator */
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            C10202j.m34178b(parcel, "in");
            return new SearchQueryModel(parcel.readString(), parcel.readString(), (Source) Enum.valueOf(Source.class, parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new SearchQueryModel[i];
        }
    }

    public SearchQueryModel() {
        this((String) null, (String) null, (Source) null, 7, (DefaultConstructorMarker) null);
    }

    public SearchQueryModel(String str) {
        this(str, (String) null, (Source) null, 6, (DefaultConstructorMarker) null);
    }

    public SearchQueryModel(String str, String str2) {
        this(str, str2, (Source) null, 4, (DefaultConstructorMarker) null);
    }

    public SearchQueryModel(String str, String str2, Source source2) {
        C10202j.m34178b(str, "userQuery");
        C10202j.m34178b(str2, "finalQuery");
        C10202j.m34178b(source2, "source");
        this.userQuery = str;
        this.finalQuery = str2;
        this.source = source2;
    }

    public static /* synthetic */ SearchQueryModel copy$default(SearchQueryModel searchQueryModel, String str, String str2, Source source2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchQueryModel.userQuery;
        }
        if ((i & 2) != 0) {
            str2 = searchQueryModel.finalQuery;
        }
        if ((i & 4) != 0) {
            source2 = searchQueryModel.source;
        }
        return searchQueryModel.copy(str, str2, source2);
    }

    public final String component1() {
        return this.userQuery;
    }

    public final String component2() {
        return this.finalQuery;
    }

    public final Source component3() {
        return this.source;
    }

    public final SearchQueryModel copy(String str, String str2, Source source2) {
        C10202j.m34178b(str, "userQuery");
        C10202j.m34178b(str2, "finalQuery");
        C10202j.m34178b(source2, "source");
        return new SearchQueryModel(str, str2, source2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchQueryModel)) {
            return false;
        }
        SearchQueryModel searchQueryModel = (SearchQueryModel) obj;
        return C10202j.m34176a((Object) this.userQuery, (Object) searchQueryModel.userQuery) && C10202j.m34176a((Object) this.finalQuery, (Object) searchQueryModel.finalQuery) && C10202j.m34176a((Object) this.source, (Object) searchQueryModel.source);
    }

    public final String getFinalQuery() {
        return this.finalQuery;
    }

    public final Source getSource() {
        return this.source;
    }

    public final String getUserQuery() {
        return this.userQuery;
    }

    public int hashCode() {
        String str = this.userQuery;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.finalQuery;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Source source2 = this.source;
        if (source2 != null) {
            i = source2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SearchQueryModel(userQuery=" + this.userQuery + ", finalQuery=" + this.finalQuery + ", source=" + this.source + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C10202j.m34178b(parcel, "parcel");
        parcel.writeString(this.userQuery);
        parcel.writeString(this.finalQuery);
        parcel.writeString(this.source.name());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchQueryModel(java.lang.String r1, java.lang.String r2, p015cm.aptoide.p016pt.search.model.Source r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = ""
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000b
            r2 = r1
        L_0x000b:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0011
            cm.aptoide.pt.search.model.Source r3 = p015cm.aptoide.p016pt.search.model.Source.MANUAL
        L_0x0011:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.search.model.SearchQueryModel.<init>(java.lang.String, java.lang.String, cm.aptoide.pt.search.model.Source, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
