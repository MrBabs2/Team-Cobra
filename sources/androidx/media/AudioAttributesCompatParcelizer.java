package androidx.media;

import androidx.versionedparcelable.C0793b;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2210a = (C0548a) versionedParcel.mo4486a(audioAttributesCompat.f2210a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo4497a(false, false);
        versionedParcel.mo4506b((C0793b) audioAttributesCompat.f2210a, 1);
    }
}
