package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.d */
/* compiled from: MediaDescriptionCompatApi21 */
class C0012d {

    /* renamed from: android.support.v4.media.d$a */
    /* compiled from: MediaDescriptionCompatApi21 */
    static class C0013a {
        /* renamed from: a */
        public static Object m36a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: b */
        public static void m43b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m44c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* renamed from: a */
        public static void m42a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: a */
        public static void m41a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m38a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m39a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m40a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static Object m37a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }
    }

    /* renamed from: a */
    public static CharSequence m27a(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: b */
    public static Bundle m30b(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: c */
    public static Bitmap m31c(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: d */
    public static Uri m32d(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: e */
    public static String m33e(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: f */
    public static CharSequence m34f(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: g */
    public static CharSequence m35g(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: a */
    public static void m29a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public static Object m28a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }
}
