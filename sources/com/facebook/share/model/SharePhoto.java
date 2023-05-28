package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C6563a();

    /* renamed from: g */
    private final Bitmap f12183g;

    /* renamed from: h */
    private final Uri f12184h;

    /* renamed from: i */
    private final boolean f12185i;

    /* renamed from: j */
    private final String f12186j;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    static class C6563a implements Parcelable.Creator<SharePhoto> {
        C6563a() {
        }

        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f12183g = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f12184h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f12185i = parcel.readByte() != 0;
        this.f12186j = parcel.readString();
    }

    /* renamed from: a */
    public Uri mo21296a() {
        return this.f12184h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f12183g, 0);
        parcel.writeParcelable(this.f12184h, 0);
        parcel.writeByte(this.f12185i ? (byte) 1 : 0);
        parcel.writeString(this.f12186j);
    }
}
