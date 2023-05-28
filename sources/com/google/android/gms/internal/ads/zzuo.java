package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;

@zzard
public final class zzuo {

    /* renamed from: a */
    private final int f22777a;

    /* renamed from: b */
    private final int f22778b;

    /* renamed from: c */
    private final int f22779c;

    /* renamed from: d */
    private final boolean f22780d;

    /* renamed from: e */
    private final zzvb f22781e;

    /* renamed from: f */
    private final zzvk f22782f;

    /* renamed from: g */
    private final Object f22783g = new Object();

    /* renamed from: h */
    private ArrayList<String> f22784h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<String> f22785i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<zzuz> f22786j = new ArrayList<>();

    /* renamed from: k */
    private int f22787k = 0;

    /* renamed from: l */
    private int f22788l = 0;

    /* renamed from: m */
    private int f22789m = 0;

    /* renamed from: n */
    private int f22790n;

    /* renamed from: o */
    private String f22791o = "";

    /* renamed from: p */
    private String f22792p = "";

    /* renamed from: q */
    private String f22793q = "";

    public zzuo(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f22777a = i;
        this.f22778b = i2;
        this.f22779c = i3;
        this.f22780d = z;
        this.f22781e = new zzvb(i4);
        this.f22782f = new zzvk(i5, i6, i7);
    }

    /* renamed from: a */
    public final void mo29793a(String str, boolean z, float f, float f2, float f3, float f4) {
        m25377c(str, z, f, f2, f3, f4);
        synchronized (this.f22783g) {
            if (this.f22789m < 0) {
                zzbad.m20516a("ActivityContent: negative number of WebViews.");
            }
            mo29805j();
        }
    }

    /* renamed from: b */
    public final boolean mo29795b() {
        boolean z;
        synchronized (this.f22783g) {
            z = this.f22789m == 0;
        }
        return z;
    }

    /* renamed from: c */
    public final String mo29796c() {
        return this.f22791o;
    }

    /* renamed from: d */
    public final String mo29797d() {
        return this.f22792p;
    }

    /* renamed from: e */
    public final String mo29798e() {
        return this.f22793q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzuo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzuo) obj).f22791o;
        return str != null && str.equals(this.f22791o);
    }

    /* renamed from: f */
    public final void mo29800f() {
        synchronized (this.f22783g) {
            this.f22790n -= 100;
        }
    }

    /* renamed from: g */
    public final void mo29801g() {
        synchronized (this.f22783g) {
            this.f22789m--;
        }
    }

    /* renamed from: h */
    public final void mo29802h() {
        synchronized (this.f22783g) {
            this.f22789m++;
        }
    }

    public final int hashCode() {
        return this.f22791o.hashCode();
    }

    /* renamed from: i */
    public final void mo29804i() {
        synchronized (this.f22783g) {
            int a = m25375a(this.f22787k, this.f22788l);
            if (a > this.f22790n) {
                this.f22790n = a;
            }
        }
    }

    /* renamed from: j */
    public final void mo29805j() {
        synchronized (this.f22783g) {
            int a = m25375a(this.f22787k, this.f22788l);
            if (a > this.f22790n) {
                this.f22790n = a;
                if (!zzk.zzlk().mo27743i().mo27784g()) {
                    this.f22791o = this.f22781e.mo29834a(this.f22784h);
                    this.f22792p = this.f22781e.mo29834a(this.f22785i);
                }
                if (!zzk.zzlk().mo27743i().mo27781d()) {
                    this.f22793q = this.f22782f.mo29840a(this.f22785i, this.f22786j);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: k */
    public final int mo29806k() {
        return this.f22787k;
    }

    public final String toString() {
        int i = this.f22788l;
        int i2 = this.f22790n;
        int i3 = this.f22787k;
        String a = m25376a(this.f22784h, 100);
        String a2 = m25376a(this.f22785i, 100);
        String str = this.f22791o;
        String str2 = this.f22792p;
        String str3 = this.f22793q;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 165 + String.valueOf(a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(a);
        sb.append("\n viewableText");
        sb.append(a2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: c */
    private final void m25377c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f22779c) {
            synchronized (this.f22783g) {
                this.f22784h.add(str);
                this.f22787k += str.length();
                if (z) {
                    this.f22785i.add(str);
                    this.f22786j.add(new zzuz(f, f2, f3, f4, this.f22785i.size() - 1));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo29794b(String str, boolean z, float f, float f2, float f3, float f4) {
        m25377c(str, z, f, f2, f3, f4);
    }

    @VisibleForTesting
    /* renamed from: a */
    private final int m25375a(int i, int i2) {
        if (this.f22780d) {
            return this.f22778b;
        }
        return (i * this.f22777a) + (i2 * this.f22778b);
    }

    /* renamed from: a */
    public final int mo29791a() {
        return this.f22790n;
    }

    /* renamed from: a */
    public final void mo29792a(int i) {
        this.f22788l = i;
    }

    /* renamed from: a */
    private static String m25376a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList.get(i2);
            i2++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }
}
