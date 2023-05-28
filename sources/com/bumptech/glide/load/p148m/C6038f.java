package com.bumptech.glide.load.p148m;

import com.bumptech.glide.load.p148m.C6036e;
import com.bumptech.glide.p166r.C6315j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.m.f */
/* compiled from: DataRewinderRegistry */
public class C6038f {

    /* renamed from: b */
    private static final C6036e.C6037a<?> f11111b = new C6039a();

    /* renamed from: a */
    private final Map<Class<?>, C6036e.C6037a<?>> f11112a = new HashMap();

    /* renamed from: com.bumptech.glide.load.m.f$a */
    /* compiled from: DataRewinderRegistry */
    class C6039a implements C6036e.C6037a<Object> {
        C6039a() {
        }

        /* renamed from: a */
        public C6036e<Object> mo20339a(Object obj) {
            return new C6040b(obj);
        }

        /* renamed from: a */
        public Class<Object> mo20340a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.bumptech.glide.load.m.f$b */
    /* compiled from: DataRewinderRegistry */
    private static final class C6040b implements C6036e<Object> {

        /* renamed from: a */
        private final Object f11113a;

        C6040b(Object obj) {
            this.f11113a = obj;
        }

        /* renamed from: a */
        public Object mo20337a() {
            return this.f11113a;
        }

        /* renamed from: b */
        public void mo20338b() {
        }
    }

    /* renamed from: a */
    public synchronized void mo20342a(C6036e.C6037a<?> aVar) {
        this.f11112a.put(aVar.mo20340a(), aVar);
    }

    /* renamed from: a */
    public synchronized <T> C6036e<T> mo20341a(T t) {
        C6036e.C6037a<?> aVar;
        C6315j.m12978a(t);
        aVar = this.f11112a.get(t.getClass());
        if (aVar == null) {
            Iterator<C6036e.C6037a<?>> it = this.f11112a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6036e.C6037a<?> next = it.next();
                if (next.mo20340a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f11111b;
        }
        return aVar.mo20339a(t);
    }
}
