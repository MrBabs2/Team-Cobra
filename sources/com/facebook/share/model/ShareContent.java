package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E> implements ShareModel {

    /* renamed from: f */
    private final Uri f12166f;

    /* renamed from: g */
    private final List<String> f12167g;

    /* renamed from: h */
    private final String f12168h;

    /* renamed from: i */
    private final String f12169i;

    /* renamed from: j */
    private final String f12170j;

    /* renamed from: k */
    private final ShareHashtag f12171k;

    protected ShareContent(Parcel parcel) {
        this.f12166f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f12167g = m13897a(parcel);
        this.f12168h = parcel.readString();
        this.f12169i = parcel.readString();
        this.f12170j = parcel.readString();
        ShareHashtag.C6556b bVar = new ShareHashtag.C6556b();
        bVar.mo21268a(parcel);
        this.f12171k = bVar.mo21271a();
    }

    /* renamed from: a */
    public Uri mo21259a() {
        return this.f12166f;
    }

    /* renamed from: b */
    public ShareHashtag mo21260b() {
        return this.f12171k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12166f, 0);
        parcel.writeStringList(this.f12167g);
        parcel.writeString(this.f12168h);
        parcel.writeString(this.f12169i);
        parcel.writeString(this.f12170j);
        parcel.writeParcelable(this.f12171k, 0);
    }

    /* renamed from: a */
    private List<String> m13897a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }
}
