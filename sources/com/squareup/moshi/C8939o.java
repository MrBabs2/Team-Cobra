package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import p413s.C12909g;

/* renamed from: com.squareup.moshi.o */
/* compiled from: JsonWriter */
public abstract class C8939o implements Closeable, Flushable {

    /* renamed from: f */
    int f25388f = 0;

    /* renamed from: g */
    int[] f25389g = new int[32];

    /* renamed from: h */
    String[] f25390h = new String[32];

    /* renamed from: i */
    int[] f25391i = new int[32];

    /* renamed from: j */
    String f25392j;

    /* renamed from: k */
    boolean f25393k;

    /* renamed from: l */
    boolean f25394l;

    /* renamed from: m */
    boolean f25395m;

    /* renamed from: n */
    int f25396n = -1;

    C8939o() {
    }

    /* renamed from: a */
    public static C8939o m29444a(C12909g gVar) {
        return new C8935l(gVar);
    }

    /* renamed from: a */
    public abstract C8939o mo32889a() throws IOException;

    /* renamed from: a */
    public abstract C8939o mo32890a(double d) throws IOException;

    /* renamed from: a */
    public abstract C8939o mo32891a(Number number) throws IOException;

    /* renamed from: a */
    public abstract C8939o mo32892a(String str) throws IOException;

    /* renamed from: b */
    public abstract C8939o mo32893b() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo32914b(int i) {
        this.f25389g[this.f25388f - 1] = i;
    }

    /* renamed from: c */
    public abstract C8939o mo32894c(boolean z) throws IOException;

    /* renamed from: d */
    public abstract C8939o mo32896d(long j) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo32916d() {
        int i = this.f25388f;
        int[] iArr = this.f25389g;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f25389g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f25390h;
            this.f25390h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f25391i;
            this.f25391i = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof C8938n)) {
                return true;
            }
            C8938n nVar = (C8938n) this;
            Object[] objArr = nVar.f25386o;
            nVar.f25386o = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
    }

    /* renamed from: e */
    public abstract C8939o mo32898e(String str) throws IOException;

    public final String getPath() {
        return C8933j.m29358a(this.f25388f, this.f25389g, this.f25390h, this.f25391i);
    }

    /* renamed from: i */
    public abstract C8939o mo32900i() throws IOException;

    /* renamed from: l */
    public abstract C8939o mo32901l() throws IOException;

    /* renamed from: m */
    public final String mo32918m() {
        String str = this.f25392j;
        return str != null ? str : "";
    }

    /* renamed from: o */
    public final boolean mo32919o() {
        return this.f25394l;
    }

    /* renamed from: p */
    public final boolean mo32920p() {
        return this.f25393k;
    }

    /* renamed from: q */
    public abstract C8939o mo32902q() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final int mo32921t() {
        int i = this.f25388f;
        if (i != 0) {
            return this.f25389g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo32922u() throws IOException {
        int t = mo32921t();
        if (t == 5 || t == 3) {
            this.f25395m = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32912a(int i) {
        int[] iArr = this.f25389g;
        int i2 = this.f25388f;
        this.f25388f = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    public final void mo32915b(boolean z) {
        this.f25394l = z;
    }

    /* renamed from: a */
    public final void mo32913a(boolean z) {
        this.f25393k = z;
    }

    /* renamed from: d */
    public void mo32897d(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f25392j = str;
    }
}
