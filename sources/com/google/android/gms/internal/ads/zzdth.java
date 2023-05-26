package com.google.android.gms.internal.ads;

public final class zzdth<T> implements zzdte<T>, zzdtu<T> {

    /* renamed from: c */
    private static final Object f21754c = new Object();

    /* renamed from: a */
    private volatile zzdtu<T> f21755a;

    /* renamed from: b */
    private volatile Object f21756b = f21754c;

    private zzdth(zzdtu<T> zzdtu) {
        this.f21755a = zzdtu;
    }

    /* renamed from: a */
    public static <P extends zzdtu<T>, T> zzdtu<T> m24229a(P p) {
        zzdto.m24235a(p);
        if (p instanceof zzdth) {
            return p;
        }
        return new zzdth(p);
    }

    /* renamed from: b */
    public static <P extends zzdtu<T>, T> zzdte<T> m24230b(P p) {
        if (p instanceof zzdte) {
            return (zzdte) p;
        }
        zzdto.m24235a(p);
        return new zzdth((zzdtu) p);
    }

    public final T get() {
        T t = this.f21756b;
        if (t == f21754c) {
            synchronized (this) {
                t = this.f21756b;
                if (t == f21754c) {
                    t = this.f21755a.get();
                    T t2 = this.f21756b;
                    if (t2 != f21754c && !(t2 instanceof zzdtn)) {
                        if (t2 != t) {
                            String valueOf = String.valueOf(t2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f21756b = t;
                    this.f21755a = null;
                }
            }
        }
        return t;
    }
}
