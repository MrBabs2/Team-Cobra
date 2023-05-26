package p015cm.aptoide.p016pt.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C12412a;
import org.parceler.C12413b;
import org.parceler.C12419d;
import org.parceler.ParcelerRuntimeException;
import p015cm.aptoide.aptoideviews.filters.Filter;
import p015cm.aptoide.aptoideviews.filters.Filter$$Parcelable;

/* renamed from: cm.aptoide.pt.search.model.SearchViewModel$$Parcelable */
public class SearchViewModel$$Parcelable implements Parcelable, C12419d<SearchViewModel> {
    public static final Parcelable.Creator<SearchViewModel$$Parcelable> CREATOR = new Parcelable.Creator<SearchViewModel$$Parcelable>() {
        public SearchViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new SearchViewModel$$Parcelable(SearchViewModel$$Parcelable.read(parcel, new C12412a()));
        }

        public SearchViewModel$$Parcelable[] newArray(int i) {
            return new SearchViewModel$$Parcelable[i];
        }
    };
    private SearchViewModel searchViewModel$$0;

    public SearchViewModel$$Parcelable(SearchViewModel searchViewModel) {
        this.searchViewModel$$0 = searchViewModel;
    }

    public static SearchViewModel read(Parcel parcel, C12412a aVar) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo40463a(readInt)) {
            int a = aVar.mo40460a();
            SearchViewModel searchViewModel = new SearchViewModel();
            aVar.mo40462a(a, searchViewModel);
            searchViewModel.searchQueryModel = (SearchQueryModel) parcel.readParcelable(SearchViewModel$$Parcelable.class.getClassLoader());
            searchViewModel.storeName = parcel.readString();
            boolean z = false;
            searchViewModel.onlyTrustedApps = parcel.readInt() == 1;
            C12413b.m40836a((Class<?>) SearchViewModel.class, (Object) searchViewModel, "storeTheme", (Object) parcel.readString());
            searchViewModel.loadedAds = parcel.readInt() == 1;
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add(Filter$$Parcelable.read(parcel, aVar));
                }
                arrayList = arrayList2;
            }
            searchViewModel.filters = arrayList;
            if (parcel.readInt() == 1) {
                z = true;
            }
            searchViewModel.loadedResults = z;
            aVar.mo40462a(readInt, searchViewModel);
            return searchViewModel;
        } else if (!aVar.mo40466c(readInt)) {
            return (SearchViewModel) aVar.mo40465b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(SearchViewModel searchViewModel, Parcel parcel, int i, C12412a aVar) {
        int a = aVar.mo40461a((Object) searchViewModel);
        if (a != -1) {
            parcel.writeInt(a);
            return;
        }
        parcel.writeInt(aVar.mo40464b((Object) searchViewModel));
        parcel.writeParcelable(searchViewModel.searchQueryModel, i);
        parcel.writeString(searchViewModel.storeName);
        parcel.writeInt(searchViewModel.onlyTrustedApps ? 1 : 0);
        parcel.writeString((String) C12413b.m40835a(String.class, (Class<?>) SearchViewModel.class, (Object) searchViewModel, "storeTheme"));
        parcel.writeInt(searchViewModel.loadedAds ? 1 : 0);
        List<Filter> list = searchViewModel.filters;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            for (Filter write : searchViewModel.filters) {
                Filter$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        parcel.writeInt(searchViewModel.loadedResults ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.searchViewModel$$0, parcel, i, new C12412a());
    }

    public SearchViewModel getParcel() {
        return this.searchViewModel$$0;
    }
}
