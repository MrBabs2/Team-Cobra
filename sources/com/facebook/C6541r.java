package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;
import com.facebook.internal.p168a0.p170f.C6391a;

/* renamed from: com.facebook.r */
/* compiled from: RequestProgress */
class C6541r {

    /* renamed from: a */
    private final GraphRequest f12131a;

    /* renamed from: b */
    private final Handler f12132b;

    /* renamed from: c */
    private final long f12133c = C4716f.m7709r();

    /* renamed from: d */
    private long f12134d;

    /* renamed from: e */
    private long f12135e;

    /* renamed from: f */
    private long f12136f;

    /* renamed from: com.facebook.r$a */
    /* compiled from: RequestProgress */
    class C6542a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ GraphRequest.C6347i f12137f;

        /* renamed from: g */
        final /* synthetic */ long f12138g;

        /* renamed from: h */
        final /* synthetic */ long f12139h;

        C6542a(C6541r rVar, GraphRequest.C6347i iVar, long j, long j2) {
            this.f12137f = iVar;
            this.f12138g = j;
            this.f12139h = j2;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    this.f12137f.mo20855a(this.f12138g, this.f12139h);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    C6541r(Handler handler, GraphRequest graphRequest) {
        this.f12131a = graphRequest;
        this.f12132b = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21242a(long j) {
        long j2 = this.f12134d + j;
        this.f12134d = j2;
        if (j2 >= this.f12135e + this.f12133c || j2 >= this.f12136f) {
            mo21241a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21243b(long j) {
        this.f12136f += j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21241a() {
        if (this.f12134d > this.f12135e) {
            GraphRequest.C6344f d = this.f12131a.mo20834d();
            long j = this.f12136f;
            if (j > 0 && (d instanceof GraphRequest.C6347i)) {
                long j2 = this.f12134d;
                GraphRequest.C6347i iVar = (GraphRequest.C6347i) d;
                Handler handler = this.f12132b;
                if (handler == null) {
                    iVar.mo20855a(j2, j);
                } else {
                    handler.post(new C6542a(this, iVar, j2, j));
                }
                this.f12135e = this.f12134d;
            }
        }
    }
}
