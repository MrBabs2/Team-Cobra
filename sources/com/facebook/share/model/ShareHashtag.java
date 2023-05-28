package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C6555a();

    /* renamed from: f */
    private final String f12172f;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    static class C6555a implements Parcelable.Creator<ShareHashtag> {
        C6555a() {
        }

        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$b */
    public static class C6556b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f12173a;

        /* renamed from: a */
        public C6556b mo21270a(String str) {
            this.f12173a = str;
            return this;
        }

        /* renamed from: a */
        public C6556b mo21269a(ShareHashtag shareHashtag) {
            if (shareHashtag == null) {
                return this;
            }
            mo21270a(shareHashtag.mo21263a());
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6556b mo21268a(Parcel parcel) {
            mo21269a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
            return this;
        }

        /* renamed from: a */
        public ShareHashtag mo21271a() {
            return new ShareHashtag(this, (C6555a) null);
        }
    }

    /* synthetic */ ShareHashtag(C6556b bVar, C6555a aVar) {
        this(bVar);
    }

    /* renamed from: a */
    public String mo21263a() {
        return this.f12172f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12172f);
    }

    private ShareHashtag(C6556b bVar) {
        this.f12172f = bVar.f12173a;
    }

    ShareHashtag(Parcel parcel) {
        this.f12172f = parcel.readString();
    }
}
