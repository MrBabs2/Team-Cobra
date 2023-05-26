package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C6562a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C6562a> implements ShareModel {

    /* renamed from: f */
    private final Bundle f12181f;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C6562a<P extends ShareOpenGraphValueContainer, E extends C6562a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f12182a = new Bundle();

        /* renamed from: a */
        public E mo21295a(String str, String str2) {
            this.f12182a.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public E mo21294a(P p) {
            if (p != null) {
                this.f12182a.putAll(p.mo21288a());
            }
            return this;
        }
    }

    protected ShareOpenGraphValueContainer(C6562a<P, E> aVar) {
        this.f12181f = (Bundle) aVar.f12182a.clone();
    }

    /* renamed from: a */
    public Object mo21289a(String str) {
        return this.f12181f.get(str);
    }

    /* renamed from: b */
    public String mo21290b(String str) {
        return this.f12181f.getString(str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f12181f);
    }

    /* renamed from: a */
    public Bundle mo21288a() {
        return (Bundle) this.f12181f.clone();
    }

    /* renamed from: b */
    public Set<String> mo21291b() {
        return this.f12181f.keySet();
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f12181f = parcel.readBundle(C6562a.class.getClassLoader());
    }
}
