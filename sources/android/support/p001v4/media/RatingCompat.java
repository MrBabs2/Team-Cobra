package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0008a();

    /* renamed from: f */
    private final int f32f;

    /* renamed from: g */
    private final float f33g;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0008a implements Parcelable.Creator<RatingCompat> {
        C0008a() {
        }

        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f32f = i;
        this.f33g = f;
    }

    public int describeContents() {
        return this.f32f;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f32f);
        sb.append(" rating=");
        float f = this.f33g;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32f);
        parcel.writeFloat(this.f33g);
    }
}
