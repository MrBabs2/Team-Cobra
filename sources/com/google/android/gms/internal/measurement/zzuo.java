package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import com.google.android.gms.internal.measurement.zzuo.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzuo<MessageType extends zzuo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzsx<MessageType, BuilderType> {
    private static Map<Object, zzuo<?, ?>> zzbyh = new ConcurrentHashMap();
    protected zzxe zzbyf = zzxe.m26723d();
    private int zzbyg = -1;

    public static class zzb<T extends zzuo<T, ?>> extends zzsz<T> {
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzuo<MessageType, BuilderType> implements zzvx {
        protected C8361x0<Object> zzbyl = C8361x0.m26278i();
    }

    public static class zzd<ContainingType extends zzvv, Type> extends zztz<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    public static final class zze {

        /* renamed from: a */
        public static final int f23499a = 1;

        /* renamed from: b */
        public static final int f23500b = 2;

        /* renamed from: c */
        public static final int f23501c = 3;

        /* renamed from: d */
        public static final int f23502d = 4;

        /* renamed from: e */
        public static final int f23503e = 5;

        /* renamed from: f */
        public static final int f23504f = 6;

        /* renamed from: g */
        public static final int f23505g = 1;

        /* renamed from: h */
        public static final int f23506h = 2;

        /* renamed from: i */
        public static final int f23507i = 1;

        /* renamed from: j */
        public static final int f23508j = 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo30367a() {
        return this.zzbyg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo30423a(int i, Object obj, Object obj2);

    /* renamed from: b */
    public final int mo30425b() {
        if (this.zzbyg == -1) {
            this.zzbyg = C8263b2.m25892a().mo30065a(this).mo30092c(this);
        }
        return this.zzbyg;
    }

    /* renamed from: c */
    public final /* synthetic */ zzvw mo30426c() {
        zza zza2 = (zza) mo30423a(zze.f23503e, (Object) null, (Object) null);
        zza2.mo30370a(this);
        return zza2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzuo) mo30423a(zze.f23504f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C8263b2.m25892a().mo30065a(this).mo30091b(this, (zzuo) obj);
    }

    /* renamed from: f */
    public final /* synthetic */ zzvv mo30428f() {
        return (zzuo) mo30423a(zze.f23504f, (Object) null, (Object) null);
    }

    public int hashCode() {
        int i = this.zzbtk;
        if (i != 0) {
            return i;
        }
        int a = C8263b2.m25892a().mo30065a(this).mo30087a(this);
        this.zzbtk = a;
        return a;
    }

    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo30423a(zze.f23499a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C8263b2.m25892a().mo30065a(this).mo30093d(this);
        if (booleanValue) {
            mo30423a(zze.f23500b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    public String toString() {
        return C8350u1.m26193a(this, super.toString());
    }

    public static abstract class zza<MessageType extends zzuo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzsy<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f23496f;

        /* renamed from: g */
        protected MessageType f23497g;

        /* renamed from: h */
        private boolean f23498h;

        /* renamed from: a */
        public final BuilderType mo30370a(MessageType messagetype) {
            mo30433h();
            m26663a(this.f23497g, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) this.f23496f.mo30423a(zze.f23503e, (Object) null, (Object) null);
            zza.mo30370a((zzuo) mo30437v());
            return zza;
        }

        /* renamed from: f */
        public final /* synthetic */ zzvv mo30428f() {
            return this.f23496f;
        }

        /* renamed from: g */
        public final /* synthetic */ zzsy mo30373g() {
            return (zza) clone();
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo30433h() {
            if (this.f23498h) {
                MessageType messagetype = (zzuo) this.f23497g.mo30423a(zze.f23502d, (Object) null, (Object) null);
                m26663a(messagetype, this.f23497g);
                this.f23497g = messagetype;
                this.f23498h = false;
            }
        }

        /* renamed from: i */
        public MessageType mo30437v() {
            if (this.f23498h) {
                return this.f23497g;
            }
            MessageType messagetype = this.f23497g;
            C8263b2.m25892a().mo30065a(messagetype).mo30090b(messagetype);
            this.f23498h = true;
            return this.f23497g;
        }

        public final boolean isInitialized() {
            return zzuo.m26655a(this.f23497g, false);
        }

        /* renamed from: j */
        public final MessageType mo30436p() {
            MessageType messagetype = (zzuo) mo30437v();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo30423a(zze.f23499a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C8263b2.m25892a().mo30065a(messagetype).mo30093d(messagetype);
                    if (booleanValue) {
                        messagetype.mo30423a(zze.f23500b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzxc(messagetype);
        }

        /* renamed from: a */
        private static void m26663a(MessageType messagetype, MessageType messagetype2) {
            C8263b2.m25892a().mo30065a(messagetype).mo30089a(messagetype, messagetype2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30368a(int i) {
        this.zzbyg = i;
    }

    /* renamed from: a */
    public final void mo30424a(zztv zztv) throws IOException {
        C8263b2.m25892a().mo30064a(getClass()).mo30088a(this, (C8309k3) C8341s0.m26133a(zztv));
    }

    /* renamed from: a */
    static <T extends zzuo<?, ?>> T m26653a(Class<T> cls) {
        T t = (zzuo) zzbyh.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzuo) zzbyh.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzuo) ((zzuo) C8367y2.m26291a(cls)).mo30423a(zze.f23504f, (Object) null, (Object) null);
            if (t != null) {
                zzbyh.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    static Object m26654a(Method method, Object obj, Object... objArr) {
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
    protected static final <T extends zzuo<T, ?>> boolean m26655a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo30423a(zze.f23499a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C8263b2.m25892a().mo30065a(t).mo30093d(t);
    }
}
