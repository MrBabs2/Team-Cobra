package p112n.p312h.p313a;

import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: n.h.a.i */
/* compiled from: FileDownloadListener */
public abstract class C10776i {
    public C10776i() {
    }

    /* access modifiers changed from: protected */
    public void blockComplete(C10722a aVar) throws Throwable {
    }

    /* access modifiers changed from: protected */
    public abstract void completed(C10722a aVar);

    /* access modifiers changed from: protected */
    public abstract void connected(C10722a aVar, String str, boolean z, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void error(C10722a aVar, Throwable th);

    /* access modifiers changed from: protected */
    public boolean isInvalid() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void paused(C10722a aVar, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void pending(C10722a aVar, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void progress(C10722a aVar, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void retry(C10722a aVar, Throwable th, int i, int i2);

    /* access modifiers changed from: protected */
    public void started(C10722a aVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void warn(C10722a aVar);

    public C10776i(int i) {
        C10767d.m36495e(this, "not handle priority any more", new Object[0]);
    }
}
