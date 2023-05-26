package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.p191t.C8719g;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.gson.t.l.h */
/* compiled from: ObjectTypeAdapter */
public final class C8750h extends C8688q<Object> {

    /* renamed from: b */
    public static final C8690r f24880b = new C8751a();

    /* renamed from: a */
    private final C8668e f24881a;

    /* renamed from: com.google.gson.t.l.h$a */
    /* compiled from: ObjectTypeAdapter */
    static class C8751a implements C8690r {
        C8751a() {
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            if (aVar.getRawType() == Object.class) {
                return new C8750h(eVar);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.t.l.h$b */
    /* compiled from: ObjectTypeAdapter */
    static /* synthetic */ class C8752b {

        /* renamed from: a */
        static final /* synthetic */ int[] f24882a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.b[] r0 = com.google.gson.stream.C8693b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24882a = r0
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24882a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24882a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24882a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f24882a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f24882a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C8693b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.p192l.C8750h.C8752b.<clinit>():void");
        }
    }

    C8750h(C8668e eVar) {
        this.f24881a = eVar;
    }

    /* renamed from: a */
    public Object mo32314a(C8691a aVar) throws IOException {
        switch (C8752b.f24882a[aVar.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo32359a();
                while (aVar.mo32367m()) {
                    arrayList.add(mo32314a(aVar));
                }
                aVar.mo32365i();
                return arrayList;
            case 2:
                C8719g gVar = new C8719g();
                aVar.mo32361b();
                while (aVar.mo32367m()) {
                    gVar.put(aVar.mo32376w(), mo32314a(aVar));
                }
                aVar.mo32366l();
                return gVar;
            case 3:
                return aVar.mo32378y();
            case 4:
                return Double.valueOf(aVar.mo32372t());
            case 5:
                return Boolean.valueOf(aVar.mo32371q());
            case 6:
                aVar.mo32377x();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo32316a(C8694c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo32400p();
            return;
        }
        C8688q<?> a = this.f24881a.mo32300a(obj.getClass());
        if (a instanceof C8750h) {
            cVar.mo32386b();
            cVar.mo32396i();
            return;
        }
        a.mo32316a(cVar, obj);
    }
}
