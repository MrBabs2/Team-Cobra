package p015cm.aptoide.aptoideviews.filters;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C12412a;
import org.parceler.C12419d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: cm.aptoide.aptoideviews.filters.Filter$$Parcelable */
public class Filter$$Parcelable implements Parcelable, C12419d<Filter> {
    public static final Parcelable.Creator<Filter$$Parcelable> CREATOR = new Parcelable.Creator<Filter$$Parcelable>() {
        public Filter$$Parcelable createFromParcel(Parcel parcel) {
            return new Filter$$Parcelable(Filter$$Parcelable.read(parcel, new C12412a()));
        }

        public Filter$$Parcelable[] newArray(int i) {
            return new Filter$$Parcelable[i];
        }
    };
    private Filter filter$$0;

    public Filter$$Parcelable(Filter filter) {
        this.filter$$0 = filter;
    }

    public static Filter read(Parcel parcel, C12412a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo40463a(readInt)) {
            int a = aVar.mo40460a();
            Filter filter = new Filter();
            aVar.mo40462a(a, filter);
            filter.setId$aptoide_views_prodRelease(parcel.readInt());
            aVar.mo40462a(readInt, filter);
            return filter;
        } else if (!aVar.mo40466c(readInt)) {
            return (Filter) aVar.mo40465b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(Filter filter, Parcel parcel, int i, C12412a aVar) {
        int a = aVar.mo40461a((Object) filter);
        if (a != -1) {
            parcel.writeInt(a);
            return;
        }
        parcel.writeInt(aVar.mo40464b((Object) filter));
        parcel.writeInt(filter.getId$aptoide_views_prodRelease());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.filter$$0, parcel, i, new C12412a());
    }

    public Filter getParcel() {
        return this.filter$$0;
    }
}
