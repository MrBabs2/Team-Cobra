package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import com.google.android.gms.internal.ads.zzdob.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzdob<MessageType extends zzdob<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdmi<MessageType, BuilderType> {
    private static Map<Object, zzdob<?, ?>> zzhhf = new ConcurrentHashMap();
    protected zzdqu zzhhd = zzdqu.m24095d();
    private int zzhhe = -1;

    public static class zzb<T extends zzdob<T, ?>> extends zzdmk<T> {
        public zzb(T t) {
        }
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzdob<MessageType, BuilderType> implements zzdpm {
        protected C8226zu<Object> zzhhj = C8226zu.m18667i();
    }

    public static class zzd<ContainingType extends zzdpk, Type> extends zzdnm<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    public static final class zze {

        /* renamed from: a */
        public static final int f21574a = 1;

        /* renamed from: b */
        public static final int f21575b = 2;

        /* renamed from: c */
        public static final int f21576c = 3;

        /* renamed from: d */
        public static final int f21577d = 4;

        /* renamed from: e */
        public static final int f21578e = 5;

        /* renamed from: f */
        public static final int f21579f = 6;

        /* renamed from: g */
        public static final int f21580g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f21581h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f21582i = 1;

        /* renamed from: j */
        public static final int f21583j = 2;

        /* renamed from: k */
        public static final int f21584k = 1;

        /* renamed from: l */
        public static final int f21585l = 2;

        /* renamed from: a */
        public static int[] m24029a() {
            return (int[]) f21581h.clone();
        }
    }

    /* renamed from: d */
    protected static zzdoh m24007d() {
        return C7557hv.m17128b();
    }

    /* renamed from: i */
    protected static <E> zzdoj<E> m24008i() {
        return C7636jw.m17355b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo29062a() {
        return this.zzhhe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo28168a(int i, Object obj, Object obj2);

    /* renamed from: b */
    public final /* synthetic */ zzdpl mo29129b() {
        zza zza2 = (zza) mo28168a(zze.f21578e, (Object) null, (Object) null);
        zza2.mo29139a(this);
        return zza2;
    }

    /* renamed from: c */
    public final /* synthetic */ zzdpl mo29130c() {
        return (zza) mo28168a(zze.f21578e, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzdob) mo28168a(zze.f21579f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C7595iw.m17197a().mo26089a(this).mo25750b(this, (zzdob) obj);
    }

    /* renamed from: f */
    public final /* synthetic */ zzdpk mo29132f() {
        return (zzdob) mo28168a(zze.f21579f, (Object) null, (Object) null);
    }

    /* renamed from: h */
    public final int mo29133h() {
        if (this.zzhhe == -1) {
            this.zzhhe = C7595iw.m17197a().mo26089a(this).mo25751c(this);
        }
        return this.zzhhe;
    }

    public int hashCode() {
        int i = this.zzhcf;
        if (i != 0) {
            return i;
        }
        int a = C7595iw.m17197a().mo26089a(this).mo25742a(this);
        this.zzhcf = a;
        return a;
    }

    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo28168a(zze.f21574a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C7595iw.m17197a().mo26089a(this).mo25752d(this);
        if (booleanValue) {
            mo28168a(zze.f21575b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    public String toString() {
        return C7300aw.m16509a(this, super.toString());
    }

    public static abstract class zza<MessageType extends zzdob<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdmj<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f21571f;

        /* renamed from: g */
        protected MessageType f21572g;

        /* renamed from: h */
        private boolean f21573h = false;

        protected zza(MessageType messagetype) {
            this.f21571f = messagetype;
            this.f21572g = (zzdob) messagetype.mo28168a(zze.f21577d, (Object) null, (Object) null);
        }

        /* renamed from: b */
        private final BuilderType m24018b(byte[] bArr, int i, int i2, zzdno zzdno) throws zzdok {
            mo29140j();
            try {
                C7595iw.m17197a().mo26089a(this.f21572g).mo25748a(this.f21572g, bArr, 0, i2 + 0, new C7335bu(zzdno));
                return this;
            } catch (zzdok e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzdok.m24047a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: a */
        public final BuilderType mo29139a(MessageType messagetype) {
            mo29140j();
            m24017a(this.f21572g, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) this.f21571f.mo28168a(zze.f21578e, (Object) null, (Object) null);
            zza.mo29139a((zzdob) mo29137D());
            return zza;
        }

        /* renamed from: f */
        public final /* synthetic */ zzdpk mo29132f() {
            return this.f21571f;
        }

        /* renamed from: i */
        public final /* synthetic */ zzdmj mo29069i() {
            return (zza) clone();
        }

        public final boolean isInitialized() {
            return zzdob.m24006a(this.f21572g, false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public final void mo29140j() {
            if (this.f21573h) {
                MessageType messagetype = (zzdob) this.f21572g.mo28168a(zze.f21577d, (Object) null, (Object) null);
                m24017a(messagetype, this.f21572g);
                this.f21572g = messagetype;
                this.f21573h = false;
            }
        }

        /* renamed from: k */
        public MessageType mo29137D() {
            if (this.f21573h) {
                return this.f21572g;
            }
            MessageType messagetype = this.f21572g;
            C7595iw.m17197a().mo26089a(messagetype).mo25749b(messagetype);
            this.f21573h = true;
            return this.f21572g;
        }

        /* renamed from: l */
        public final MessageType mo29143t() {
            MessageType messagetype = (zzdob) mo29137D();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo28168a(zze.f21574a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C7595iw.m17197a().mo26089a(messagetype).mo25752d(messagetype);
                    if (booleanValue) {
                        messagetype.mo28168a(zze.f21575b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzdqs(messagetype);
        }

        /* renamed from: a */
        private static void m24017a(MessageType messagetype, MessageType messagetype2) {
            C7595iw.m17197a().mo26089a(messagetype).mo25747a(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ zzdmj mo29066a(zzdmi zzdmi) {
            mo29139a((zzdob) zzdmi);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ zzdmj mo29138a(byte[] bArr, int i, int i2, zzdno zzdno) throws zzdok {
            m24018b(bArr, 0, i2, zzdno);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29063a(int i) {
        this.zzhhe = i;
    }

    /* renamed from: a */
    public final void mo29128a(zzdni zzdni) throws IOException {
        C7595iw.m17197a().mo26088a(getClass()).mo25746a(this, (C8118wx) C8004tu.m18208a(zzdni));
    }

    /* renamed from: a */
    static <T extends zzdob<?, ?>> T m24002a(Class<T> cls) {
        T t = (zzdob) zzhhf.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzdob) zzhhf.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzdob) ((zzdob) C7596ix.m17203a(cls)).mo28168a(zze.f21579f, (Object) null, (Object) null);
            if (t != null) {
                zzhhf.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends zzdob<?, ?>> void m24005a(Class<T> cls, T t) {
        zzhhf.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m24003a(zzdpk zzdpk, String str, Object[] objArr) {
        return new C7673kw(zzdpk, str, objArr);
    }

    /* renamed from: a */
    static Object m24004a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends zzdob<T, ?>> boolean m24006a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo28168a(zze.f21574a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C7595iw.m17197a().mo26089a(t).mo25752d(t);
    }

    /* renamed from: a */
    private static <T extends zzdob<T, ?>> T m23998a(T t, zzdnd zzdnd, zzdno zzdno) throws zzdok {
        T t2 = (zzdob) t.mo28168a(zze.f21577d, (Object) null, (Object) null);
        try {
            C7595iw.m17197a().mo26089a(t2).mo25745a(t2, C7893qu.m18003a(zzdnd), zzdno);
            C7595iw.m17197a().mo26089a(t2).mo25749b(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzdok) {
                throw ((zzdok) e.getCause());
            }
            zzdok zzdok = new zzdok(e.getMessage());
            zzdok.mo29144a(t2);
            throw zzdok;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzdok) {
                throw ((zzdok) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    private static <T extends zzdob<T, ?>> T m24000a(T t, byte[] bArr, int i, int i2, zzdno zzdno) throws zzdok {
        T t2 = (zzdob) t.mo28168a(zze.f21577d, (Object) null, (Object) null);
        try {
            C7595iw.m17197a().mo26089a(t2).mo25748a(t2, bArr, 0, i2, new C7335bu(zzdno));
            C7595iw.m17197a().mo26089a(t2).mo25749b(t2);
            if (t2.zzhcf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzdok) {
                throw ((zzdok) e.getCause());
            }
            zzdok zzdok = new zzdok(e.getMessage());
            zzdok.mo29144a(t2);
            throw zzdok;
        } catch (IndexOutOfBoundsException unused) {
            zzdok a = zzdok.m24047a();
            a.mo29144a(t2);
            throw a;
        }
    }

    /* renamed from: a */
    protected static <T extends zzdob<T, ?>> T m23996a(T t, zzdmr zzdmr) throws zzdok {
        boolean z;
        T a = m23997a(t, zzdmr, zzdno.m23985c());
        boolean z2 = false;
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo28168a(zze.f21574a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = C7595iw.m17197a().mo26089a(a).mo25752d(a);
                if (booleanValue) {
                    a.mo28168a(zze.f21575b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                zzdok a2 = new zzdqs(a).mo29173a();
                a2.mo29144a(a);
                throw a2;
            }
        }
        if (a != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a.mo28168a(zze.f21574a, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = C7595iw.m17197a().mo26089a(a).mo25752d(a);
                if (booleanValue2) {
                    a.mo28168a(zze.f21575b, (Object) z2 ? a : null, (Object) null);
                }
            }
            if (!z2) {
                zzdok a3 = new zzdqs(a).mo29173a();
                a3.mo29144a(a);
                throw a3;
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends zzdob<T, ?>> T m23997a(T t, zzdmr zzdmr, zzdno zzdno) throws zzdok {
        T a;
        try {
            zzdnd d = zzdmr.mo26254d();
            a = m23998a(t, d, zzdno);
            d.mo26414a(0);
            return a;
        } catch (zzdok e) {
            e.mo29144a(a);
            throw e;
        } catch (zzdok e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends zzdob<T, ?>> T m23999a(T t, byte[] bArr) throws zzdok {
        boolean z = false;
        T a = m24000a(t, bArr, 0, bArr.length, zzdno.m23985c());
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo28168a(zze.f21574a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = C7595iw.m17197a().mo26089a(a).mo25752d(a);
                if (booleanValue) {
                    a.mo28168a(zze.f21575b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                zzdok a2 = new zzdqs(a).mo29173a();
                a2.mo29144a(a);
                throw a2;
            }
        }
        return a;
    }

    /* renamed from: a */
    protected static <T extends zzdob<T, ?>> T m24001a(T t, byte[] bArr, zzdno zzdno) throws zzdok {
        boolean z = false;
        T a = m24000a(t, bArr, 0, bArr.length, zzdno);
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo28168a(zze.f21574a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = C7595iw.m17197a().mo26089a(a).mo25752d(a);
                if (booleanValue) {
                    a.mo28168a(zze.f21575b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                zzdok a2 = new zzdqs(a).mo29173a();
                a2.mo29144a(a);
                throw a2;
            }
        }
        return a;
    }
}
