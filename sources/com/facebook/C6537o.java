package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.o */
/* compiled from: ProgressNoopOutputStream */
class C6537o extends OutputStream implements C6540q {

    /* renamed from: f */
    private final Map<GraphRequest, C6541r> f12117f = new HashMap();

    /* renamed from: g */
    private final Handler f12118g;

    /* renamed from: h */
    private GraphRequest f12119h;

    /* renamed from: i */
    private C6541r f12120i;

    /* renamed from: j */
    private int f12121j;

    C6537o(Handler handler) {
        this.f12118g = handler;
    }

    /* renamed from: a */
    public void mo21230a(GraphRequest graphRequest) {
        this.f12119h = graphRequest;
        this.f12120i = graphRequest != null ? this.f12117f.get(graphRequest) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<GraphRequest, C6541r> mo21231b() {
        return this.f12117f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo21232d(long j) {
        if (this.f12120i == null) {
            C6541r rVar = new C6541r(this.f12118g, this.f12119h);
            this.f12120i = rVar;
            this.f12117f.put(this.f12119h, rVar);
        }
        this.f12120i.mo21243b(j);
        this.f12121j = (int) (((long) this.f12121j) + j);
    }

    public void write(byte[] bArr) {
        mo21232d((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo21232d((long) i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo21229a() {
        return this.f12121j;
    }

    public void write(int i) {
        mo21232d(1);
    }
}
