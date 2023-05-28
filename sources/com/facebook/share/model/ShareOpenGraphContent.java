package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphAction;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new C6560a();

    /* renamed from: l */
    private final ShareOpenGraphAction f12179l;

    /* renamed from: m */
    private final String f12180m;

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$a */
    static class C6560a implements Parcelable.Creator<ShareOpenGraphContent> {
        C6560a() {
        }

        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f12179l = new ShareOpenGraphAction.C6559b().mo21279a(parcel).mo21282a();
        this.f12180m = parcel.readString();
    }

    /* renamed from: c */
    public ShareOpenGraphAction mo21283c() {
        return this.f12179l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f12179l, 0);
        parcel.writeString(this.f12180m);
    }
}
