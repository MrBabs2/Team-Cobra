package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: f */
    private final Bundle f12178f;

    ShareMedia(Parcel parcel) {
        this.f12178f = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f12178f);
    }
}
