package p015cm.aptoide.p016pt.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C12412a;
import org.parceler.C12419d;
import org.parceler.ParcelerRuntimeException;
import p015cm.aptoide.p016pt.ads.data.Payout$$Parcelable;

/* renamed from: cm.aptoide.pt.search.model.SearchAdResult$$Parcelable */
public class SearchAdResult$$Parcelable implements Parcelable, C12419d<SearchAdResult> {
    public static final Parcelable.Creator<SearchAdResult$$Parcelable> CREATOR = new Parcelable.Creator<SearchAdResult$$Parcelable>() {
        public SearchAdResult$$Parcelable createFromParcel(Parcel parcel) {
            return new SearchAdResult$$Parcelable(SearchAdResult$$Parcelable.read(parcel, new C12412a()));
        }

        public SearchAdResult$$Parcelable[] newArray(int i) {
            return new SearchAdResult$$Parcelable[i];
        }
    };
    private SearchAdResult searchAdResult$$0;

    public SearchAdResult$$Parcelable(SearchAdResult searchAdResult) {
        this.searchAdResult$$0 = searchAdResult;
    }

    public static SearchAdResult read(Parcel parcel, C12412a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo40463a(readInt)) {
            int a = aVar.mo40460a();
            SearchAdResult searchAdResult = new SearchAdResult();
            aVar.mo40462a(a, searchAdResult);
            searchAdResult.clickUrl = parcel.readString();
            searchAdResult.totalDownloads = parcel.readLong();
            searchAdResult.appName = parcel.readString();
            searchAdResult.icon = parcel.readString();
            searchAdResult.payout = Payout$$Parcelable.read(parcel, aVar);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            searchAdResult.isAppc = z;
            searchAdResult.cpcUrl = parcel.readString();
            searchAdResult.adId = parcel.readLong();
            searchAdResult.appId = parcel.readLong();
            searchAdResult.modifiedDate = parcel.readLong();
            searchAdResult.networkId = parcel.readLong();
            searchAdResult.packageName = parcel.readString();
            searchAdResult.clickPerInstallUrl = parcel.readString();
            searchAdResult.starRating = parcel.readFloat();
            searchAdResult.clickPerDownloadUrl = parcel.readString();
            aVar.mo40462a(readInt, searchAdResult);
            return searchAdResult;
        } else if (!aVar.mo40466c(readInt)) {
            return (SearchAdResult) aVar.mo40465b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(SearchAdResult searchAdResult, Parcel parcel, int i, C12412a aVar) {
        int a = aVar.mo40461a((Object) searchAdResult);
        if (a != -1) {
            parcel.writeInt(a);
            return;
        }
        parcel.writeInt(aVar.mo40464b((Object) searchAdResult));
        parcel.writeString(searchAdResult.clickUrl);
        parcel.writeLong(searchAdResult.totalDownloads);
        parcel.writeString(searchAdResult.appName);
        parcel.writeString(searchAdResult.icon);
        Payout$$Parcelable.write(searchAdResult.payout, parcel, i, aVar);
        parcel.writeInt(searchAdResult.isAppc ? 1 : 0);
        parcel.writeString(searchAdResult.cpcUrl);
        parcel.writeLong(searchAdResult.adId);
        parcel.writeLong(searchAdResult.appId);
        parcel.writeLong(searchAdResult.modifiedDate);
        parcel.writeLong(searchAdResult.networkId);
        parcel.writeString(searchAdResult.packageName);
        parcel.writeString(searchAdResult.clickPerInstallUrl);
        parcel.writeFloat(searchAdResult.starRating);
        parcel.writeString(searchAdResult.clickPerDownloadUrl);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.searchAdResult$$0, parcel, i, new C12412a());
    }

    public SearchAdResult getParcel() {
        return this.searchAdResult$$0;
    }
}
