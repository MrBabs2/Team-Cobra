package androidx.media;

import java.util.Arrays;

/* renamed from: androidx.media.c */
/* compiled from: AudioAttributesImplBase */
class C0550c implements C0548a {

    /* renamed from: a */
    int f2213a = 0;

    /* renamed from: b */
    int f2214b = 0;

    /* renamed from: c */
    int f2215c = 0;

    /* renamed from: d */
    int f2216d = -1;

    C0550c() {
    }

    /* renamed from: a */
    public int mo3106a() {
        return this.f2214b;
    }

    /* renamed from: b */
    public int mo3107b() {
        int i = this.f2215c;
        int c = mo3108c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo3108c() {
        int i = this.f2216d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m2641a(false, this.f2215c, this.f2213a);
    }

    /* renamed from: d */
    public int mo3109d() {
        return this.f2213a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0550c)) {
            return false;
        }
        C0550c cVar = (C0550c) obj;
        if (this.f2214b == cVar.mo3106a() && this.f2215c == cVar.mo3107b() && this.f2213a == cVar.mo3109d() && this.f2216d == cVar.f2216d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2214b), Integer.valueOf(this.f2215c), Integer.valueOf(this.f2213a), Integer.valueOf(this.f2216d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2216d != -1) {
            sb.append(" stream=");
            sb.append(this.f2216d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m2642a(this.f2213a));
        sb.append(" content=");
        sb.append(this.f2214b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2215c).toUpperCase());
        return sb.toString();
    }
}
