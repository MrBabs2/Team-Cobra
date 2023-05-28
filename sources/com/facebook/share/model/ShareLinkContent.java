package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C6557a();
    @Deprecated

    /* renamed from: l */
    private final String f12174l;
    @Deprecated

    /* renamed from: m */
    private final String f12175m;
    @Deprecated

    /* renamed from: n */
    private final Uri f12176n;

    /* renamed from: o */
    private final String f12177o;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    static class C6557a implements Parcelable.Creator<ShareLinkContent> {
        C6557a() {
        }

        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f12174l = parcel.readString();
        this.f12175m = parcel.readString();
        this.f12176n = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f12177o = parcel.readString();
    }

    /* renamed from: c */
    public String mo21272c() {
        return this.f12177o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f12174l);
        parcel.writeString(this.f12175m);
        parcel.writeParcelable(this.f12176n, 0);
        parcel.writeString(this.f12177o);
    }
}
