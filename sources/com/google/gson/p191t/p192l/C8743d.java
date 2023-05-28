package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.p033s.C4742b;
import com.google.gson.p191t.C8700c;
import com.google.gson.p194u.C8805a;

/* renamed from: com.google.gson.t.l.d */
/* compiled from: JsonAdapterAnnotationTypeAdapterFactory */
public final class C8743d implements C8690r {

    /* renamed from: f */
    private final C8700c f24863f;

    public C8743d(C8700c cVar) {
        this.f24863f = cVar;
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
        C4742b bVar = (C4742b) aVar.getRawType().getAnnotation(C4742b.class);
        if (bVar == null) {
            return null;
        }
        return mo32477a(this.f24863f, eVar, aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.google.gson.q<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.gson.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.t.l.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.t.l.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.t.l.l} */
    /* JADX WARNING: type inference failed for: r9v3, types: [com.google.gson.q<?>, com.google.gson.q] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.C8688q<?> mo32477a(com.google.gson.p191t.C8700c r9, com.google.gson.C8668e r10, com.google.gson.p194u.C8805a<?> r11, com.google.gson.p033s.C4742b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.google.gson.u.a r0 = com.google.gson.p194u.C8805a.get(r0)
            com.google.gson.t.h r9 = r9.mo32416a(r0)
            java.lang.Object r9 = r9.mo32418a()
            boolean r0 = r9 instanceof com.google.gson.C8688q
            if (r0 == 0) goto L_0x0017
            com.google.gson.q r9 = (com.google.gson.C8688q) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.C8690r
            if (r0 == 0) goto L_0x0022
            com.google.gson.r r9 = (com.google.gson.C8690r) r9
            com.google.gson.q r9 = r9.mo32358a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.C8684o
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.google.gson.C8678i
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.google.gson.o r0 = (com.google.gson.C8684o) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.google.gson.C8678i
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.google.gson.i r1 = (com.google.gson.C8678i) r1
        L_0x006b:
            r4 = r1
            com.google.gson.t.l.l r9 = new com.google.gson.t.l.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.google.gson.q r9 = r9.mo32357a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p191t.p192l.C8743d.mo32477a(com.google.gson.t.c, com.google.gson.e, com.google.gson.u.a, com.google.gson.s.b):com.google.gson.q");
    }
}
