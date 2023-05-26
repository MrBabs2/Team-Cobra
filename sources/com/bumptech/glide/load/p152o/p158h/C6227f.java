package com.bumptech.glide.load.p152o.p158h;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.h.f */
/* compiled from: TranscoderRegistry */
public class C6227f {

    /* renamed from: a */
    private final List<C6228a<?, ?>> f11380a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.o.h.f$a */
    /* compiled from: TranscoderRegistry */
    private static final class C6228a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f11381a;

        /* renamed from: b */
        private final Class<R> f11382b;

        /* renamed from: c */
        final C6226e<Z, R> f11383c;

        C6228a(Class<Z> cls, Class<R> cls2, C6226e<Z, R> eVar) {
            this.f11381a = cls;
            this.f11382b = cls2;
            this.f11383c = eVar;
        }

        /* renamed from: a */
        public boolean mo20556a(Class<?> cls, Class<?> cls2) {
            return this.f11381a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11382b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> void mo20554a(Class<Z> cls, Class<R> cls2, C6226e<Z, R> eVar) {
        this.f11380a.add(new C6228a(cls, cls2, eVar));
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo20555b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C6228a<?, ?> a : this.f11380a) {
            if (a.mo20556a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Z, R> C6226e<Z, R> mo20553a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C6229g.m12661a();
        }
        for (C6228a next : this.f11380a) {
            if (next.mo20556a(cls, cls2)) {
                return next.f11383c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }
}
