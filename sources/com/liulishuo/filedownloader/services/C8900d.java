package com.liulishuo.filedownloader.services;

import p112n.p312h.p313a.p314b0.C10733b;
import p112n.p312h.p313a.p317e0.C10755b;
import p112n.p312h.p313a.p318f0.C10763c;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10768e;

/* renamed from: com.liulishuo.filedownloader.services.d */
/* compiled from: DownloadMgrInitialParams */
public class C8900d {

    /* renamed from: a */
    private final C8901a f25277a;

    /* renamed from: com.liulishuo.filedownloader.services.d$a */
    /* compiled from: DownloadMgrInitialParams */
    public static class C8901a {

        /* renamed from: a */
        C10763c.C10765b f25278a;

        /* renamed from: b */
        Integer f25279b;

        /* renamed from: c */
        C10763c.C10766c f25280c;

        /* renamed from: d */
        C10763c.C10764a f25281d;

        /* renamed from: a */
        public C8901a mo32783a(C10763c.C10764a aVar) {
            this.f25281d = aVar;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m29207a() {
            C10763c.C10766c cVar = this.f25280c;
            if (cVar != null && !cVar.mo36500a() && !C10768e.m36497a().f28832f) {
                throw new IllegalArgumentException("Since the provided FileDownloadOutputStream does not support the seek function, if FileDownloader pre-allocates file size at the beginning of the download, it will can not be resumed from the breakpoint. If you need to ensure that the resumption is available, please add and set the value of 'file.non-pre-allocation' field to 'true' in the 'filedownloader.properties' file which is in your application assets folder manually for resolving this problem.");
            }
        }
    }

    public C8900d(C8901a aVar) {
        this.f25277a = aVar;
        if (aVar != null) {
            aVar.m29207a();
        }
    }

    /* renamed from: e */
    private C10763c.C10764a m29199e() {
        return new C10733b.C10735b();
    }

    /* renamed from: f */
    private C8905g m29200f() {
        return new C8898b();
    }

    /* renamed from: g */
    private C10763c.C10766c m29201g() {
        return new C10755b.C10756a();
    }

    /* renamed from: h */
    private int m29202h() {
        return C10768e.m36497a().f28831e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10763c.C10764a mo32779a() {
        C8901a aVar = this.f25277a;
        if (aVar == null) {
            return m29199e();
        }
        C10763c.C10764a aVar2 = aVar.f25281d;
        if (aVar2 == null) {
            return m29199e();
        }
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "initial FileDownloader manager with the customize connection creator: %s", aVar2);
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8905g mo32780b() {
        C10763c.C10765b bVar;
        C8901a aVar = this.f25277a;
        if (aVar == null || (bVar = aVar.f25278a) == null) {
            return m29200f();
        }
        C8905g a = bVar.mo36502a();
        if (a == null) {
            return m29200f();
        }
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "initial FileDownloader manager with the customize database: %s", a);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10763c.C10766c mo32781c() {
        C8901a aVar = this.f25277a;
        if (aVar == null) {
            return m29201g();
        }
        C10763c.C10766c cVar = aVar.f25280c;
        if (cVar == null) {
            return m29201g();
        }
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "initial FileDownloader manager with the customize output stream: %s", cVar);
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo32782d() {
        C8901a aVar = this.f25277a;
        if (aVar == null) {
            return m29202h();
        }
        Integer num = aVar.f25279b;
        if (num == null) {
            return m29202h();
        }
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
        }
        return C10768e.m36496a(num.intValue());
    }
}
