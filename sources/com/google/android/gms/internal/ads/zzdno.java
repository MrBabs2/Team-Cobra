package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

public class zzdno {

    /* renamed from: b */
    private static volatile zzdno f21512b;

    /* renamed from: c */
    static final zzdno f21513c = new zzdno(true);

    /* renamed from: a */
    private final Map<C8241a, zzdob.zzd<?, ?>> f21514a;

    /* renamed from: com.google.android.gms.internal.ads.zzdno$a */
    static final class C8241a {

        /* renamed from: a */
        private final Object f21515a;

        /* renamed from: b */
        private final int f21516b;

        C8241a(Object obj, int i) {
            this.f21515a = obj;
            this.f21516b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C8241a)) {
                return false;
            }
            C8241a aVar = (C8241a) obj;
            if (this.f21515a == aVar.f21515a && this.f21516b == aVar.f21516b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f21515a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f21516b;
        }
    }

    static {
        m23984b();
    }

    zzdno() {
        this.f21514a = new HashMap();
    }

    /* renamed from: a */
    static zzdno m23983a() {
        return C7447ev.m16898a(zzdno.class);
    }

    /* renamed from: b */
    private static Class<?> m23984b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static zzdno m23985c() {
        return C8078vu.m18330b();
    }

    /* renamed from: d */
    public static zzdno m23986d() {
        zzdno zzdno = f21512b;
        if (zzdno == null) {
            synchronized (zzdno.class) {
                zzdno = f21512b;
                if (zzdno == null) {
                    zzdno = C8078vu.m18331c();
                    f21512b = zzdno;
                }
            }
        }
        return zzdno;
    }

    /* renamed from: a */
    public final <ContainingType extends zzdpk> zzdob.zzd<ContainingType, ?> mo29117a(ContainingType containingtype, int i) {
        return this.f21514a.get(new C8241a(containingtype, i));
    }

    private zzdno(boolean z) {
        this.f21514a = Collections.emptyMap();
    }
}
