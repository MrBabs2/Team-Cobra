package com.facebook.p032t;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.t.n */
/* compiled from: PersistedEvents */
class C6597n implements Serializable {

    /* renamed from: f */
    private HashMap<C6564a, List<C6570c>> f12251f;

    /* renamed from: com.facebook.t.n$b */
    /* compiled from: PersistedEvents */
    static class C6599b implements Serializable {

        /* renamed from: f */
        private final HashMap<C6564a, List<C6570c>> f12252f;

        private Object readResolve() {
            return new C6597n(this.f12252f);
        }

        private C6599b(HashMap<C6564a, List<C6570c>> hashMap) {
            this.f12252f = hashMap;
        }
    }

    public C6597n() {
        this.f12251f = new HashMap<>();
    }

    private Object writeReplace() {
        return new C6599b(this.f12251f);
    }

    /* renamed from: a */
    public Set<C6564a> mo21343a() {
        return this.f12251f.keySet();
    }

    /* renamed from: b */
    public List<C6570c> mo21346b(C6564a aVar) {
        return this.f12251f.get(aVar);
    }

    /* renamed from: a */
    public boolean mo21345a(C6564a aVar) {
        return this.f12251f.containsKey(aVar);
    }

    public C6597n(HashMap<C6564a, List<C6570c>> hashMap) {
        HashMap<C6564a, List<C6570c>> hashMap2 = new HashMap<>();
        this.f12251f = hashMap2;
        hashMap2.putAll(hashMap);
    }

    /* renamed from: a */
    public void mo21344a(C6564a aVar, List<C6570c> list) {
        if (!this.f12251f.containsKey(aVar)) {
            this.f12251f.put(aVar, list);
        } else {
            this.f12251f.get(aVar).addAll(list);
        }
    }
}
