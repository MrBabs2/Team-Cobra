package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static C0550c read(VersionedParcel versionedParcel) {
        C0550c cVar = new C0550c();
        cVar.f2213a = versionedParcel.mo4484a(cVar.f2213a, 1);
        cVar.f2214b = versionedParcel.mo4484a(cVar.f2214b, 2);
        cVar.f2215c = versionedParcel.mo4484a(cVar.f2215c, 3);
        cVar.f2216d = versionedParcel.mo4484a(cVar.f2216d, 4);
        return cVar;
    }

    public static void write(C0550c cVar, VersionedParcel versionedParcel) {
        versionedParcel.mo4497a(false, false);
        versionedParcel.mo4504b(cVar.f2213a, 1);
        versionedParcel.mo4504b(cVar.f2214b, 2);
        versionedParcel.mo4504b(cVar.f2215c, 3);
        versionedParcel.mo4504b(cVar.f2216d, 4);
    }
}
