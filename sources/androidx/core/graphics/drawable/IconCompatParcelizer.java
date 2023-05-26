package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1798a = versionedParcel.mo4484a(iconCompat.f1798a, 1);
        iconCompat.f1800c = versionedParcel.mo4501a(iconCompat.f1800c, 2);
        iconCompat.f1801d = versionedParcel.mo4485a(iconCompat.f1801d, 3);
        iconCompat.f1802e = versionedParcel.mo4484a(iconCompat.f1802e, 4);
        iconCompat.f1803f = versionedParcel.mo4484a(iconCompat.f1803f, 5);
        iconCompat.f1804g = (ColorStateList) versionedParcel.mo4485a(iconCompat.f1804g, 6);
        iconCompat.f1806i = versionedParcel.mo4489a(iconCompat.f1806i, 7);
        iconCompat.mo2325e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo4497a(true, true);
        iconCompat.mo2321a(versionedParcel.mo4512c());
        int i = iconCompat.f1798a;
        if (-1 != i) {
            versionedParcel.mo4504b(i, 1);
        }
        byte[] bArr = iconCompat.f1800c;
        if (bArr != null) {
            versionedParcel.mo4510b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1801d;
        if (parcelable != null) {
            versionedParcel.mo4505b(parcelable, 3);
        }
        int i2 = iconCompat.f1802e;
        if (i2 != 0) {
            versionedParcel.mo4504b(i2, 4);
        }
        int i3 = iconCompat.f1803f;
        if (i3 != 0) {
            versionedParcel.mo4504b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1804g;
        if (colorStateList != null) {
            versionedParcel.mo4505b((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.f1806i;
        if (str != null) {
            versionedParcel.mo4508b(str, 7);
        }
    }
}
