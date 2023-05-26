package com.google.gson.p191t;

import com.google.gson.C8659a;
import com.google.gson.C8660b;
import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.p033s.C4741a;
import com.google.gson.p033s.C4744d;
import com.google.gson.p033s.C4745e;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.gson.t.d */
/* compiled from: Excluder */
public final class C8715d implements C8690r, Cloneable {

    /* renamed from: l */
    public static final C8715d f24808l = new C8715d();

    /* renamed from: f */
    private double f24809f = -1.0d;

    /* renamed from: g */
    private int f24810g = 136;

    /* renamed from: h */
    private boolean f24811h = true;

    /* renamed from: i */
    private boolean f24812i;

    /* renamed from: j */
    private List<C8659a> f24813j = Collections.emptyList();

    /* renamed from: k */
    private List<C8659a> f24814k = Collections.emptyList();

    /* renamed from: b */
    private boolean m28478b(Class<?> cls) {
        return cls.isMemberClass() && !m28479c(cls);
    }

    /* renamed from: c */
    private boolean m28479c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean a = mo32419a((Class<?>) rawType, true);
        boolean a2 = mo32419a((Class<?>) rawType, false);
        if (a || a2) {
            return new C8716a(a2, a, eVar, aVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public C8715d clone() {
        try {
            return (C8715d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: com.google.gson.t.d$a */
    /* compiled from: Excluder */
    class C8716a extends C8688q<T> {

        /* renamed from: a */
        private C8688q<T> f24815a;

        /* renamed from: b */
        final /* synthetic */ boolean f24816b;

        /* renamed from: c */
        final /* synthetic */ boolean f24817c;

        /* renamed from: d */
        final /* synthetic */ C8668e f24818d;

        /* renamed from: e */
        final /* synthetic */ C8805a f24819e;

        C8716a(boolean z, boolean z2, C8668e eVar, C8805a aVar) {
            this.f24816b = z;
            this.f24817c = z2;
            this.f24818d = eVar;
            this.f24819e = aVar;
        }

        /* renamed from: b */
        private C8688q<T> m28483b() {
            C8688q<T> qVar = this.f24815a;
            if (qVar != null) {
                return qVar;
            }
            C8688q<T> a = this.f24818d.mo32298a((C8690r) C8715d.this, this.f24819e);
            this.f24815a = a;
            return a;
        }

        /* renamed from: a */
        public T mo32314a(C8691a aVar) throws IOException {
            if (!this.f24816b) {
                return m28483b().mo32314a(aVar);
            }
            aVar.mo32379z();
            return null;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, T t) throws IOException {
            if (this.f24817c) {
                cVar.mo32400p();
            } else {
                m28483b().mo32316a(cVar, t);
            }
        }
    }

    /* renamed from: a */
    public boolean mo32420a(Field field, boolean z) {
        C4741a aVar;
        if ((this.f24810g & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f24809f != -1.0d && !m28475a((C4744d) field.getAnnotation(C4744d.class), (C4745e) field.getAnnotation(C4745e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f24812i && ((aVar = (C4741a) field.getAnnotation(C4741a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f24811h && m28478b(field.getType())) || m28477a(field.getType())) {
            return true;
        }
        List<C8659a> list = z ? this.f24813j : this.f24814k;
        if (list.isEmpty()) {
            return false;
        }
        C8660b bVar = new C8660b(field);
        for (C8659a a : list) {
            if (a.mo32295a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo32419a(Class<?> cls, boolean z) {
        if (this.f24809f != -1.0d && !m28475a((C4744d) cls.getAnnotation(C4744d.class), (C4745e) cls.getAnnotation(C4745e.class))) {
            return true;
        }
        if ((!this.f24811h && m28478b(cls)) || m28477a(cls)) {
            return true;
        }
        for (C8659a a : z ? this.f24813j : this.f24814k) {
            if (a.mo32296a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m28477a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: a */
    private boolean m28475a(C4744d dVar, C4745e eVar) {
        return m28474a(dVar) && m28476a(eVar);
    }

    /* renamed from: a */
    private boolean m28474a(C4744d dVar) {
        return dVar == null || dVar.value() <= this.f24809f;
    }

    /* renamed from: a */
    private boolean m28476a(C4745e eVar) {
        return eVar == null || eVar.value() > this.f24809f;
    }
}
