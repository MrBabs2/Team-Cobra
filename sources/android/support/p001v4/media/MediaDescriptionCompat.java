package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.C0012d;
import android.support.p001v4.media.C0014e;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0005a();

    /* renamed from: f */
    private final String f12f;

    /* renamed from: g */
    private final CharSequence f13g;

    /* renamed from: h */
    private final CharSequence f14h;

    /* renamed from: i */
    private final CharSequence f15i;

    /* renamed from: j */
    private final Bitmap f16j;

    /* renamed from: k */
    private final Uri f17k;

    /* renamed from: l */
    private final Bundle f18l;

    /* renamed from: m */
    private final Uri f19m;

    /* renamed from: n */
    private Object f20n;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0005a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0005a() {
        }

        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m8a(C0012d.m28a(parcel));
        }

        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0006b {

        /* renamed from: a */
        private String f21a;

        /* renamed from: b */
        private CharSequence f22b;

        /* renamed from: c */
        private CharSequence f23c;

        /* renamed from: d */
        private CharSequence f24d;

        /* renamed from: e */
        private Bitmap f25e;

        /* renamed from: f */
        private Uri f26f;

        /* renamed from: g */
        private Bundle f27g;

        /* renamed from: h */
        private Uri f28h;

        /* renamed from: a */
        public C0006b mo19a(String str) {
            this.f21a = str;
            return this;
        }

        /* renamed from: b */
        public C0006b mo22b(CharSequence charSequence) {
            this.f23c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0006b mo23c(CharSequence charSequence) {
            this.f22b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0006b mo18a(CharSequence charSequence) {
            this.f24d = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0006b mo21b(Uri uri) {
            this.f28h = uri;
            return this;
        }

        /* renamed from: a */
        public C0006b mo15a(Bitmap bitmap) {
            this.f25e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0006b mo16a(Uri uri) {
            this.f26f = uri;
            return this;
        }

        /* renamed from: a */
        public C0006b mo17a(Bundle bundle) {
            this.f27g = bundle;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo20a() {
            return new MediaDescriptionCompat(this.f21a, this.f22b, this.f23c, this.f24d, this.f25e, this.f26f, this.f27g, this.f28h);
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f12f = str;
        this.f13g = charSequence;
        this.f14h = charSequence2;
        this.f15i = charSequence3;
        this.f16j = bitmap;
        this.f17k = uri;
        this.f18l = bundle;
        this.f19m = uri2;
    }

    /* renamed from: a */
    public Object mo9a() {
        if (this.f20n != null || Build.VERSION.SDK_INT < 21) {
            return this.f20n;
        }
        Object a = C0012d.C0013a.m36a();
        C0012d.C0013a.m42a(a, this.f12f);
        C0012d.C0013a.m44c(a, this.f13g);
        C0012d.C0013a.m43b(a, this.f14h);
        C0012d.C0013a.m41a(a, this.f15i);
        C0012d.C0013a.m38a(a, this.f16j);
        C0012d.C0013a.m39a(a, this.f17k);
        Bundle bundle = this.f18l;
        if (Build.VERSION.SDK_INT < 23 && this.f19m != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f19m);
        }
        C0012d.C0013a.m40a(a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0014e.C0015a.m46a(a, this.f19m);
        }
        Object a2 = C0012d.C0013a.m37a(a);
        this.f20n = a2;
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f13g + ", " + this.f14h + ", " + this.f15i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f12f);
            TextUtils.writeToParcel(this.f13g, parcel, i);
            TextUtils.writeToParcel(this.f14h, parcel, i);
            TextUtils.writeToParcel(this.f15i, parcel, i);
            parcel.writeParcelable(this.f16j, i);
            parcel.writeParcelable(this.f17k, i);
            parcel.writeBundle(this.f18l);
            parcel.writeParcelable(this.f19m, i);
            return;
        }
        C0012d.m29a(mo9a(), parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f12f = parcel.readString();
        this.f13g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f16j = (Bitmap) parcel.readParcelable(classLoader);
        this.f17k = (Uri) parcel.readParcelable(classLoader);
        this.f18l = parcel.readBundle(classLoader);
        this.f19m = (Uri) parcel.readParcelable(classLoader);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.media.MediaDescriptionCompat m8a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p001v4.media.C0012d.m33e(r8)
            r1.mo19a((java.lang.String) r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0012d.m35g(r8)
            r1.mo23c(r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0012d.m34f(r8)
            r1.mo22b((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = android.support.p001v4.media.C0012d.m27a((java.lang.Object) r8)
            r1.mo18a((java.lang.CharSequence) r2)
            android.graphics.Bitmap r2 = android.support.p001v4.media.C0012d.m31c(r8)
            r1.mo15a((android.graphics.Bitmap) r2)
            android.net.Uri r2 = android.support.p001v4.media.C0012d.m32d(r8)
            r1.mo16a((android.net.Uri) r2)
            android.os.Bundle r2 = android.support.p001v4.media.C0012d.m30b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.p001v4.media.session.MediaSessionCompat.m55a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.mo17a((android.os.Bundle) r0)
            if (r4 == 0) goto L_0x006d
            r1.mo21b((android.net.Uri) r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = android.support.p001v4.media.C0014e.m45a(r8)
            r1.mo21b((android.net.Uri) r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo20a()
            r0.f20n = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.m8a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }
}
