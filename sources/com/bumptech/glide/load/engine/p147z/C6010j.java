package com.bumptech.glide.load.engine.p147z;

import android.util.Log;
import com.bumptech.glide.p166r.C6315j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.z.j */
/* compiled from: LruArrayPool */
public final class C6010j implements C5999b {

    /* renamed from: a */
    private final C6007h<C6011a, Object> f11065a = new C6007h<>();

    /* renamed from: b */
    private final C6012b f11066b = new C6012b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f11067c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C5998a<?>> f11068d = new HashMap();

    /* renamed from: e */
    private final int f11069e;

    /* renamed from: f */
    private int f11070f;

    /* renamed from: com.bumptech.glide.load.engine.z.j$b */
    /* compiled from: LruArrayPool */
    private static final class C6012b extends C6003d<C6011a> {
        C6012b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6011a mo20298a(int i, Class<?> cls) {
            C6011a aVar = (C6011a) mo20279b();
            aVar.mo20294a(i, cls);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C6011a m12018a() {
            return new C6011a(this);
        }
    }

    public C6010j(int i) {
        this.f11069e = i;
    }

    /* renamed from: c */
    private boolean m12008c(int i) {
        return i <= this.f11069e / 2;
    }

    /* renamed from: a */
    public synchronized <T> void mo20262a(T t) {
        Class<?> cls = t.getClass();
        C5998a<?> a = m11998a(cls);
        int a2 = a.mo20256a(t);
        int a3 = a.mo20255a() * a2;
        if (m12008c(a3)) {
            C6011a a4 = this.f11066b.mo20298a(a2, cls);
            this.f11065a.mo20288a(a4, t);
            NavigableMap<Integer, Integer> b = m12003b(cls);
            Integer num = (Integer) b.get(Integer.valueOf(a4.f11072b));
            Integer valueOf = Integer.valueOf(a4.f11072b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            b.put(valueOf, Integer.valueOf(i));
            this.f11070f += a3;
            m12004b();
        }
    }

    /* renamed from: b */
    public synchronized <T> T mo20263b(int i, Class<T> cls) {
        C6011a aVar;
        Integer ceilingKey = m12003b((Class<?>) cls).ceilingKey(Integer.valueOf(i));
        if (m12001a(i, ceilingKey)) {
            aVar = this.f11066b.mo20298a(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f11066b.mo20298a(i, cls);
        }
        return m12000a(aVar, cls);
    }

    /* renamed from: com.bumptech.glide.load.engine.z.j$a */
    /* compiled from: LruArrayPool */
    private static final class C6011a implements C6017m {

        /* renamed from: a */
        private final C6012b f11071a;

        /* renamed from: b */
        int f11072b;

        /* renamed from: c */
        private Class<?> f11073c;

        C6011a(C6012b bVar) {
            this.f11071a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20294a(int i, Class<?> cls) {
            this.f11072b = i;
            this.f11073c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6011a)) {
                return false;
            }
            C6011a aVar = (C6011a) obj;
            if (this.f11072b == aVar.f11072b && this.f11073c == aVar.f11073c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f11072b * 31;
            Class<?> cls = this.f11073c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f11072b + "array=" + this.f11073c + '}';
        }

        /* renamed from: a */
        public void mo20271a() {
            this.f11071a.mo20278a(this);
        }
    }

    /* renamed from: c */
    private boolean m12007c() {
        int i = this.f11070f;
        return i == 0 || this.f11069e / i >= 2;
    }

    /* renamed from: c */
    private void m12006c(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> b = m12003b(cls);
        Integer num = (Integer) b.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            b.remove(Integer.valueOf(i));
        } else {
            b.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: b */
    private void m12004b() {
        m12005b(this.f11069e);
    }

    /* renamed from: b */
    private void m12005b(int i) {
        while (this.f11070f > i) {
            Object a = this.f11065a.mo20286a();
            C6315j.m12978a(a);
            C5998a b = m12002b(a);
            this.f11070f -= b.mo20256a(a) * b.mo20255a();
            m12006c(b.mo20256a(a), a.getClass());
            if (Log.isLoggable(b.getTag(), 2)) {
                Log.v(b.getTag(), "evicted: " + b.mo20256a(a));
            }
        }
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m12003b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f11067c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11067c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public synchronized <T> T mo20259a(int i, Class<T> cls) {
        return m12000a(this.f11066b.mo20298a(i, cls), cls);
    }

    /* renamed from: a */
    private <T> T m12000a(C6011a aVar, Class<T> cls) {
        C5998a<T> a = m11998a(cls);
        T a2 = m11999a(aVar);
        if (a2 != null) {
            this.f11070f -= a.mo20256a(a2) * a.mo20255a();
            m12006c(a.mo20256a(a2), cls);
        }
        if (a2 != null) {
            return a2;
        }
        if (Log.isLoggable(a.getTag(), 2)) {
            Log.v(a.getTag(), "Allocated " + aVar.f11072b + " bytes");
        }
        return a.newArray(aVar.f11072b);
    }

    /* renamed from: b */
    private <T> C5998a<T> m12002b(T t) {
        return m11998a(t.getClass());
    }

    /* renamed from: a */
    private <T> T m11999a(C6011a aVar) {
        return this.f11065a.mo20287a(aVar);
    }

    /* renamed from: a */
    private boolean m12001a(int i, Integer num) {
        return num != null && (m12007c() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo20260a() {
        m12005b(0);
    }

    /* renamed from: a */
    public synchronized void mo20261a(int i) {
        if (i >= 40) {
            try {
                mo20260a();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m12005b(this.f11069e / 2);
        }
    }

    /* renamed from: a */
    private <T> C5998a<T> m11998a(Class<T> cls) {
        C5998a<T> aVar = this.f11068d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C6009i();
            } else if (cls.equals(byte[].class)) {
                aVar = new C6006g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f11068d.put(cls, aVar);
        }
        return aVar;
    }
}
