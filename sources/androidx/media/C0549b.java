package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: androidx.media.b */
/* compiled from: AudioAttributesImplApi21 */
class C0549b implements C0548a {

    /* renamed from: a */
    AudioAttributes f2211a;

    /* renamed from: b */
    int f2212b = -1;

    C0549b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0549b)) {
            return false;
        }
        return this.f2211a.equals(((C0549b) obj).f2211a);
    }

    public int hashCode() {
        return this.f2211a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2211a;
    }
}
