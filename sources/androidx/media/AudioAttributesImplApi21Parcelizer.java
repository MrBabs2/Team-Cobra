package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0549b read(VersionedParcel versionedParcel) {
        C0549b bVar = new C0549b();
        bVar.f2211a = (AudioAttributes) versionedParcel.mo4485a(bVar.f2211a, 1);
        bVar.f2212b = versionedParcel.mo4484a(bVar.f2212b, 2);
        return bVar;
    }

    public static void write(C0549b bVar, VersionedParcel versionedParcel) {
        versionedParcel.mo4497a(false, false);
        versionedParcel.mo4505b((Parcelable) bVar.f2211a, 1);
        versionedParcel.mo4504b(bVar.f2212b, 2);
    }
}
