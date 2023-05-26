package com.google.gson.p191t.p192l;

import com.google.gson.C8667d;
import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p033s.C4742b;
import com.google.gson.p033s.C4743c;
import com.google.gson.p191t.C8696b;
import com.google.gson.p191t.C8700c;
import com.google.gson.p191t.C8715d;
import com.google.gson.p191t.C8727h;
import com.google.gson.p191t.C8728i;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.t.l.i */
/* compiled from: ReflectiveTypeAdapterFactory */
public final class C8753i implements C8690r {

    /* renamed from: f */
    private final C8700c f24883f;

    /* renamed from: g */
    private final C8667d f24884g;

    /* renamed from: h */
    private final C8715d f24885h;

    /* renamed from: i */
    private final C8743d f24886i;

    /* renamed from: com.google.gson.t.l.i$c */
    /* compiled from: ReflectiveTypeAdapterFactory */
    static abstract class C8756c {

        /* renamed from: a */
        final String f24895a;

        /* renamed from: b */
        final boolean f24896b;

        /* renamed from: c */
        final boolean f24897c;

        protected C8756c(String str, boolean z, boolean z2) {
            this.f24895a = str;
            this.f24896b = z;
            this.f24897c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo32487a(C8691a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo32488a(C8694c cVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo32489a(Object obj) throws IOException, IllegalAccessException;
    }

    public C8753i(C8700c cVar, C8667d dVar, C8715d dVar2, C8743d dVar3) {
        this.f24883f = cVar;
        this.f24884g = dVar;
        this.f24885h = dVar2;
        this.f24886i = dVar3;
    }

    /* renamed from: a */
    public boolean mo32486a(Field field, boolean z) {
        return m28575a(field, z, this.f24885h);
    }

    /* renamed from: a */
    static boolean m28575a(Field field, boolean z, C8715d dVar) {
        return !dVar.mo32419a(field.getType(), z) && !dVar.mo32420a(field, z);
    }

    /* renamed from: a */
    private List<String> m28573a(Field field) {
        C4743c cVar = (C4743c) field.getAnnotation(C4743c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f24884g.mo32297a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: com.google.gson.t.l.i$a */
    /* compiled from: ReflectiveTypeAdapterFactory */
    class C8754a extends C8756c {

        /* renamed from: d */
        final /* synthetic */ Field f24887d;

        /* renamed from: e */
        final /* synthetic */ boolean f24888e;

        /* renamed from: f */
        final /* synthetic */ C8688q f24889f;

        /* renamed from: g */
        final /* synthetic */ C8668e f24890g;

        /* renamed from: h */
        final /* synthetic */ C8805a f24891h;

        /* renamed from: i */
        final /* synthetic */ boolean f24892i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8754a(C8753i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C8688q qVar, C8668e eVar, C8805a aVar, boolean z4) {
            super(str, z, z2);
            this.f24887d = field;
            this.f24888e = z3;
            this.f24889f = qVar;
            this.f24890g = eVar;
            this.f24891h = aVar;
            this.f24892i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32488a(C8694c cVar, Object obj) throws IOException, IllegalAccessException {
            C8688q qVar;
            Object obj2 = this.f24887d.get(obj);
            if (this.f24888e) {
                qVar = this.f24889f;
            } else {
                qVar = new C8764m(this.f24890g, this.f24889f, this.f24891h.getType());
            }
            qVar.mo32316a(cVar, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32487a(C8691a aVar, Object obj) throws IOException, IllegalAccessException {
            Object a = this.f24889f.mo32314a(aVar);
            if (a != null || !this.f24892i) {
                this.f24887d.set(obj, a);
            }
        }

        /* renamed from: a */
        public boolean mo32489a(Object obj) throws IOException, IllegalAccessException {
            if (this.f24896b && this.f24887d.get(obj) != obj) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.gson.t.l.i$b */
    /* compiled from: ReflectiveTypeAdapterFactory */
    public static final class C8755b<T> extends C8688q<T> {

        /* renamed from: a */
        private final C8727h<T> f24893a;

        /* renamed from: b */
        private final Map<String, C8756c> f24894b;

        C8755b(C8727h<T> hVar, Map<String, C8756c> map) {
            this.f24893a = hVar;
            this.f24894b = map;
        }

        /* renamed from: a */
        public T mo32314a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            T a = this.f24893a.mo32418a();
            try {
                aVar.mo32361b();
                while (aVar.mo32367m()) {
                    C8756c cVar = this.f24894b.get(aVar.mo32376w());
                    if (cVar != null) {
                        if (cVar.f24897c) {
                            cVar.mo32487a(aVar, (Object) a);
                        }
                    }
                    aVar.mo32379z();
                }
                aVar.mo32366l();
                return a;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo32400p();
                return;
            }
            cVar.mo32386b();
            try {
                for (C8756c next : this.f24894b.values()) {
                    if (next.mo32489a(t)) {
                        cVar.mo32384a(next.f24895a);
                        next.mo32488a(cVar, (Object) t);
                    }
                }
                cVar.mo32396i();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new C8755b(this.f24883f.mo32416a(aVar), m28574a(eVar, (C8805a<?>) aVar, (Class<?>) rawType));
    }

    /* renamed from: a */
    private C8756c m28572a(C8668e eVar, Field field, String str, C8805a<?> aVar, boolean z, boolean z2) {
        C8668e eVar2 = eVar;
        C8805a<?> aVar2 = aVar;
        boolean a = C8728i.m28503a(aVar.getRawType());
        Field field2 = field;
        C4742b bVar = (C4742b) field.getAnnotation(C4742b.class);
        C8688q<?> a2 = bVar != null ? this.f24886i.mo32477a(this.f24883f, eVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = eVar.mo32299a(aVar2);
        }
        return new C8754a(this, str, z, z2, field, z3, a2, eVar, aVar, a);
    }

    /* renamed from: a */
    private Map<String, C8756c> m28574a(C8668e eVar, C8805a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        C8805a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo32486a(field, true);
                boolean a2 = mo32486a(field, z);
                if (a || a2) {
                    field.setAccessible(true);
                    Type a3 = C8696b.m28442a(aVar2.getType(), (Class<?>) cls2, field.getGenericType());
                    List<String> a4 = m28573a(field);
                    int size = a4.size();
                    C8756c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        int i3 = i2;
                        C8756c cVar2 = cVar;
                        int i4 = size;
                        List<String> list = a4;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C8756c) linkedHashMap.put(str2, m28572a(eVar, field, str2, C8805a.get(a3), z2, a2)) : cVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C8756c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.f24895a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C8805a.get(C8696b.m28442a(aVar2.getType(), (Class<?>) cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }
}
