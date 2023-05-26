package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p413s.C12905f;
import p413s.C12910h;
import p413s.C12911i;
import p413s.C12920q;

/* renamed from: com.squareup.moshi.i */
/* compiled from: JsonReader */
public abstract class C8930i implements Closeable {

    /* renamed from: f */
    int f25347f;

    /* renamed from: g */
    int[] f25348g = new int[32];

    /* renamed from: h */
    String[] f25349h = new String[32];

    /* renamed from: i */
    int[] f25350i = new int[32];

    /* renamed from: j */
    boolean f25351j;

    /* renamed from: k */
    boolean f25352k;

    /* renamed from: com.squareup.moshi.i$a */
    /* compiled from: JsonReader */
    public static final class C8931a {

        /* renamed from: a */
        final String[] f25353a;

        /* renamed from: b */
        final C12920q f25354b;

        private C8931a(String[] strArr, C12920q qVar) {
            this.f25353a = strArr;
            this.f25354b = qVar;
        }

        /* renamed from: a */
        public static C8931a m29357a(String... strArr) {
            try {
                C12911i[] iVarArr = new C12911i[strArr.length];
                C12905f fVar = new C12905f();
                for (int i = 0; i < strArr.length; i++) {
                    C8935l.m29392a(fVar, strArr[i]);
                    fVar.readByte();
                    iVarArr[i] = fVar.mo41179k();
                }
                return new C8931a((String[]) strArr.clone(), C12920q.m41685a(iVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.squareup.moshi.i$b */
    /* compiled from: JsonReader */
    public enum C8932b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    C8930i() {
    }

    /* renamed from: a */
    public static C8930i m29333a(C12910h hVar) {
        return new C8934k(hVar);
    }

    /* renamed from: a */
    public abstract int mo32861a(C8931a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32864a() throws IOException;

    /* renamed from: b */
    public abstract int mo32867b(C8931a aVar) throws IOException;

    /* renamed from: b */
    public abstract void mo32868b() throws IOException;

    /* renamed from: b */
    public final void mo32869b(boolean z) {
        this.f25351j = z;
    }

    /* renamed from: d */
    public abstract void mo32870d() throws IOException;

    public final String getPath() {
        return C8933j.m29358a(this.f25347f, this.f25348g, this.f25349h, this.f25350i);
    }

    /* renamed from: i */
    public abstract void mo32872i() throws IOException;

    /* renamed from: l */
    public final boolean mo32873l() {
        return this.f25352k;
    }

    /* renamed from: m */
    public abstract boolean mo32874m() throws IOException;

    /* renamed from: o */
    public final boolean mo32875o() {
        return this.f25351j;
    }

    /* renamed from: p */
    public abstract boolean mo32876p() throws IOException;

    public abstract C8932b peek() throws IOException;

    /* renamed from: q */
    public abstract double mo32878q() throws IOException;

    /* renamed from: t */
    public abstract int mo32879t() throws IOException;

    /* renamed from: u */
    public abstract long mo32880u() throws IOException;

    /* renamed from: v */
    public abstract <T> T mo32881v() throws IOException;

    /* renamed from: w */
    public abstract String mo32882w() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo32883x() throws IOException;

    /* renamed from: y */
    public abstract void mo32884y() throws IOException;

    /* renamed from: z */
    public abstract void mo32885z() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32865a(int i) {
        int i2 = this.f25347f;
        int[] iArr = this.f25348g;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f25348g = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f25349h;
                this.f25349h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f25350i;
                this.f25350i = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f25348g;
        int i3 = this.f25347f;
        this.f25347f = i3 + 1;
        iArr3[i3] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JsonEncodingException mo32863a(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JsonDataException mo32862a(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    /* renamed from: a */
    public final void mo32866a(boolean z) {
        this.f25352k = z;
    }
}
