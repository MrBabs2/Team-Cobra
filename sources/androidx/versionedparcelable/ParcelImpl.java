package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0791a();

    /* renamed from: f */
    private final C0793b f2886f;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0791a implements Parcelable.Creator<ParcelImpl> {
        C0791a() {
        }

        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f2886f = new C0792a(parcel).mo4519j();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0792a(parcel).mo4492a(this.f2886f);
    }
}
