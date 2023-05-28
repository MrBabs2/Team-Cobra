package p015cm.aptoide.p016pt.ads.data;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C12412a;
import org.parceler.C12419d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: cm.aptoide.pt.ads.data.Payout$$Parcelable */
public class Payout$$Parcelable implements Parcelable, C12419d<Payout> {
    public static final Parcelable.Creator<Payout$$Parcelable> CREATOR = new Parcelable.Creator<Payout$$Parcelable>() {
        public Payout$$Parcelable createFromParcel(Parcel parcel) {
            return new Payout$$Parcelable(Payout$$Parcelable.read(parcel, new C12412a()));
        }

        public Payout$$Parcelable[] newArray(int i) {
            return new Payout$$Parcelable[i];
        }
    };
    private Payout payout$$0;

    public Payout$$Parcelable(Payout payout) {
        this.payout$$0 = payout;
    }

    public static Payout read(Parcel parcel, C12412a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo40463a(readInt)) {
            int a = aVar.mo40460a();
            Payout payout = new Payout();
            aVar.mo40462a(a, payout);
            payout.fiatAmount = parcel.readDouble();
            payout.fiatCurrency = parcel.readString();
            payout.fiatSymbol = parcel.readString();
            payout.appcAmount = parcel.readDouble();
            aVar.mo40462a(readInt, payout);
            return payout;
        } else if (!aVar.mo40466c(readInt)) {
            return (Payout) aVar.mo40465b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(Payout payout, Parcel parcel, int i, C12412a aVar) {
        int a = aVar.mo40461a((Object) payout);
        if (a != -1) {
            parcel.writeInt(a);
            return;
        }
        parcel.writeInt(aVar.mo40464b((Object) payout));
        parcel.writeDouble(payout.fiatAmount);
        parcel.writeString(payout.fiatCurrency);
        parcel.writeString(payout.fiatSymbol);
        parcel.writeDouble(payout.appcAmount);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.payout$$0, parcel, i, new C12412a());
    }

    public Payout getParcel() {
        return this.payout$$0;
    }
}
