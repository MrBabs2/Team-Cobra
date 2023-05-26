package com.facebook;

import android.os.Handler;
import com.facebook.C6368h;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.p */
/* compiled from: ProgressOutputStream */
class C6538p extends FilterOutputStream implements C6540q {

    /* renamed from: f */
    private final Map<GraphRequest, C6541r> f12122f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6368h f12123g;

    /* renamed from: h */
    private final long f12124h = C4716f.m7709r();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f12125i;

    /* renamed from: j */
    private long f12126j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f12127k;

    /* renamed from: l */
    private C6541r f12128l;

    /* renamed from: com.facebook.p$a */
    /* compiled from: ProgressOutputStream */
    class C6539a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6368h.C6370b f12129f;

        C6539a(C6368h.C6370b bVar) {
            this.f12129f = bVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    this.f12129f.mo20917a(C6538p.this.f12123g, C6538p.this.f12125i, C6538p.this.f12127k);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    C6538p(OutputStream outputStream, C6368h hVar, Map<GraphRequest, C6541r> map, long j) {
        super(outputStream);
        this.f12123g = hVar;
        this.f12122f = map;
        this.f12127k = j;
    }

    /* renamed from: d */
    private void m13841d(long j) {
        C6541r rVar = this.f12128l;
        if (rVar != null) {
            rVar.mo21242a(j);
        }
        long j2 = this.f12125i + j;
        this.f12125i = j2;
        if (j2 >= this.f12126j + this.f12124h || j2 >= this.f12127k) {
            m13838a();
        }
    }

    public void close() throws IOException {
        super.close();
        for (C6541r a : this.f12122f.values()) {
            a.mo21241a();
        }
        m13838a();
    }

    public void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        m13841d((long) bArr.length);
    }

    /* renamed from: a */
    private void m13838a() {
        if (this.f12125i > this.f12126j) {
            for (C6368h.C6369a next : this.f12123g.mo20910h()) {
                if (next instanceof C6368h.C6370b) {
                    Handler g = this.f12123g.mo20908g();
                    C6368h.C6370b bVar = (C6368h.C6370b) next;
                    if (g == null) {
                        bVar.mo20917a(this.f12123g, this.f12125i, this.f12127k);
                    } else {
                        g.post(new C6539a(bVar));
                    }
                }
            }
            this.f12126j = this.f12125i;
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        m13841d((long) i2);
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        m13841d(1);
    }

    /* renamed from: a */
    public void mo21230a(GraphRequest graphRequest) {
        this.f12128l = graphRequest != null ? this.f12122f.get(graphRequest) : null;
    }
}
