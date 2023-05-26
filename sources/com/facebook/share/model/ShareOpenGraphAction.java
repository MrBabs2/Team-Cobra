package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C6559b> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new C6558a();

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    static class C6558a implements Parcelable.Creator<ShareOpenGraphAction> {
        C6558a() {
        }

        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$b */
    public static final class C6559b extends ShareOpenGraphValueContainer.C6562a<ShareOpenGraphAction, C6559b> {
        /* renamed from: a */
        public C6559b mo21281a(String str) {
            mo21295a("og:type", str);
            return this;
        }

        /* renamed from: a */
        public ShareOpenGraphAction mo21282a() {
            return new ShareOpenGraphAction(this, (C6558a) null);
        }

        /* renamed from: a */
        public C6559b mo21280a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            super.mo21294a(shareOpenGraphAction);
            C6559b bVar = this;
            bVar.mo21281a(shareOpenGraphAction.mo21276c());
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6559b mo21279a(Parcel parcel) {
            return mo21280a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    /* synthetic */ ShareOpenGraphAction(C6559b bVar, C6558a aVar) {
        this(bVar);
    }

    /* renamed from: c */
    public String mo21276c() {
        return mo21290b("og:type");
    }

    private ShareOpenGraphAction(C6559b bVar) {
        super(bVar);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}
