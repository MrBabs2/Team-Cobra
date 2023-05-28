package android.support.p001v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0021a();

    /* renamed from: f */
    public int f46f;

    /* renamed from: g */
    public int f47g;

    /* renamed from: h */
    public int f48h;

    /* renamed from: i */
    public int f49i;

    /* renamed from: j */
    public int f50j;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0021a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0021a() {
        }

        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f46f = parcel.readInt();
        this.f48h = parcel.readInt();
        this.f49i = parcel.readInt();
        this.f50j = parcel.readInt();
        this.f47g = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f46f);
        parcel.writeInt(this.f48h);
        parcel.writeInt(this.f49i);
        parcel.writeInt(this.f50j);
        parcel.writeInt(this.f47g);
    }
}
