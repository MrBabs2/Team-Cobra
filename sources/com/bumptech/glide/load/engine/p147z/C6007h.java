package com.bumptech.glide.load.engine.p147z;

import com.bumptech.glide.load.engine.p147z.C6017m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.z.h */
/* compiled from: GroupedLinkedMap */
class C6007h<K extends C6017m, V> {

    /* renamed from: a */
    private final C6008a<K, V> f11059a = new C6008a<>();

    /* renamed from: b */
    private final Map<K, C6008a<K, V>> f11060b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.z.h$a */
    /* compiled from: GroupedLinkedMap */
    private static class C6008a<K, V> {

        /* renamed from: a */
        final K f11061a;

        /* renamed from: b */
        private List<V> f11062b;

        /* renamed from: c */
        C6008a<K, V> f11063c;

        /* renamed from: d */
        C6008a<K, V> f11064d;

        C6008a() {
            this((Object) null);
        }

        /* renamed from: a */
        public V mo20290a() {
            int b = mo20292b();
            if (b > 0) {
                return this.f11062b.remove(b - 1);
            }
            return null;
        }

        /* renamed from: b */
        public int mo20292b() {
            List<V> list = this.f11062b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C6008a(K k) {
            this.f11064d = this;
            this.f11063c = this;
            this.f11061a = k;
        }

        /* renamed from: a */
        public void mo20291a(V v) {
            if (this.f11062b == null) {
                this.f11062b = new ArrayList();
            }
            this.f11062b.add(v);
        }
    }

    C6007h() {
    }

    /* renamed from: b */
    private void m11986b(C6008a<K, V> aVar) {
        m11987c(aVar);
        C6008a<K, V> aVar2 = this.f11059a;
        aVar.f11064d = aVar2.f11064d;
        aVar.f11063c = aVar2;
        m11988d(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m11987c(C6008a<K, V> aVar) {
        C6008a<K, V> aVar2 = aVar.f11064d;
        aVar2.f11063c = aVar.f11063c;
        aVar.f11063c.f11064d = aVar2;
    }

    /* renamed from: d */
    private static <K, V> void m11988d(C6008a<K, V> aVar) {
        aVar.f11063c.f11064d = aVar;
        aVar.f11064d.f11063c = aVar;
    }

    /* renamed from: a */
    public void mo20288a(K k, V v) {
        C6008a aVar = this.f11060b.get(k);
        if (aVar == null) {
            aVar = new C6008a(k);
            m11986b(aVar);
            this.f11060b.put(k, aVar);
        } else {
            k.mo20271a();
        }
        aVar.mo20291a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C6008a<K, V> aVar = this.f11059a.f11063c; !aVar.equals(this.f11059a); aVar = aVar.f11063c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f11061a);
            sb.append(':');
            sb.append(aVar.mo20292b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: a */
    public V mo20287a(K k) {
        C6008a aVar = this.f11060b.get(k);
        if (aVar == null) {
            aVar = new C6008a(k);
            this.f11060b.put(k, aVar);
        } else {
            k.mo20271a();
        }
        m11985a(aVar);
        return aVar.mo20290a();
    }

    /* renamed from: a */
    public V mo20286a() {
        for (C6008a<K, V> aVar = this.f11059a.f11064d; !aVar.equals(this.f11059a); aVar = aVar.f11064d) {
            V a = aVar.mo20290a();
            if (a != null) {
                return a;
            }
            m11987c(aVar);
            this.f11060b.remove(aVar.f11061a);
            ((C6017m) aVar.f11061a).mo20271a();
        }
        return null;
    }

    /* renamed from: a */
    private void m11985a(C6008a<K, V> aVar) {
        m11987c(aVar);
        C6008a<K, V> aVar2 = this.f11059a;
        aVar.f11064d = aVar2;
        aVar.f11063c = aVar2.f11063c;
        m11988d(aVar);
    }
}
