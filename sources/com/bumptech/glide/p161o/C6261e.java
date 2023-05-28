package com.bumptech.glide.p161o;

import com.bumptech.glide.load.C6028j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.o.e */
/* compiled from: ResourceDecoderRegistry */
public class C6261e {

    /* renamed from: a */
    private final List<String> f11428a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C6262a<?, ?>>> f11429b = new HashMap();

    /* renamed from: com.bumptech.glide.o.e$a */
    /* compiled from: ResourceDecoderRegistry */
    private static class C6262a<T, R> {

        /* renamed from: a */
        private final Class<T> f11430a;

        /* renamed from: b */
        final Class<R> f11431b;

        /* renamed from: c */
        final C6028j<T, R> f11432c;

        public C6262a(Class<T> cls, Class<R> cls2, C6028j<T, R> jVar) {
            this.f11430a = cls;
            this.f11431b = cls2;
            this.f11432c = jVar;
        }

        /* renamed from: a */
        public boolean mo20620a(Class<?> cls, Class<?> cls2) {
            return this.f11430a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11431b);
        }
    }

    /* renamed from: a */
    public synchronized void mo20618a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f11428a);
        this.f11428a.clear();
        this.f11428a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f11428a.add(str);
            }
        }
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> mo20619b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f11428a) {
            List<C6262a> list = this.f11429b.get(str);
            if (list != null) {
                for (C6262a aVar : list) {
                    if (aVar.mo20620a(cls, cls2) && !arrayList.contains(aVar.f11431b)) {
                        arrayList.add(aVar.f11431b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> List<C6028j<T, R>> mo20616a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f11428a) {
            List<C6262a> list = this.f11429b.get(str);
            if (list != null) {
                for (C6262a aVar : list) {
                    if (aVar.mo20620a(cls, cls2)) {
                        arrayList.add(aVar.f11432c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo20617a(String str, C6028j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        m12741a(str).add(new C6262a(cls, cls2, jVar));
    }

    /* renamed from: a */
    private synchronized List<C6262a<?, ?>> m12741a(String str) {
        List<C6262a<?, ?>> list;
        if (!this.f11428a.contains(str)) {
            this.f11428a.add(str);
        }
        list = this.f11429b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f11429b.put(str, list);
        }
        return list;
    }
}
