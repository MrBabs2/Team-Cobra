package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.C0868h;

/* renamed from: androidx.work.impl.utils.g */
/* compiled from: StartWorkRunnable */
public class C0940g implements Runnable {

    /* renamed from: f */
    private C0868h f3264f;

    /* renamed from: g */
    private String f3265g;

    /* renamed from: h */
    private WorkerParameters.C0820a f3266h;

    public C0940g(C0868h hVar, String str, WorkerParameters.C0820a aVar) {
        this.f3264f = hVar;
        this.f3265g = str;
        this.f3266h = aVar;
    }

    public void run() {
        this.f3264f.mo4805d().mo4777a(this.f3265g, this.f3266h);
    }
}
