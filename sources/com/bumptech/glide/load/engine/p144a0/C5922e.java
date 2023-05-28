package com.bumptech.glide.load.engine.p144a0;

import android.util.Log;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.p144a0.C5913a;
import com.bumptech.glide.p142k.C5886a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.engine.a0.e */
/* compiled from: DiskLruCacheWrapper */
public class C5922e implements C5913a {

    /* renamed from: a */
    private final C5932j f10811a;

    /* renamed from: b */
    private final File f10812b;

    /* renamed from: c */
    private final long f10813c;

    /* renamed from: d */
    private final C5917c f10814d = new C5917c();

    /* renamed from: e */
    private C5886a f10815e;

    @Deprecated
    protected C5922e(File file, long j) {
        this.f10812b = file;
        this.f10813c = j;
        this.f10811a = new C5932j();
    }

    /* renamed from: a */
    public static C5913a m11709a(File file, long j) {
        return new C5922e(file, j);
    }

    /* renamed from: a */
    private synchronized C5886a m11708a() throws IOException {
        if (this.f10815e == null) {
            this.f10815e = C5886a.m11564a(this.f10812b, 1, 1, this.f10813c);
        }
        return this.f10815e;
    }

    /* renamed from: a */
    public File mo20094a(C6022f fVar) {
        String a = this.f10811a.mo20119a(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a + " for for Key: " + fVar);
        }
        try {
            C5886a.C5891e d = m11708a().mo20023d(a);
            if (d != null) {
                return d.mo20034a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo20095a(C6022f fVar, C5913a.C5915b bVar) {
        C5886a.C5889c a;
        String a2 = this.f10811a.mo20119a(fVar);
        this.f10814d.mo20098a(a2);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a2 + " for for Key: " + fVar);
            }
            try {
                C5886a a3 = m11708a();
                if (a3.mo20023d(a2) == null) {
                    a = a3.mo20020a(a2);
                    if (a != null) {
                        if (bVar.mo20097a(a.mo20027a(0))) {
                            a.mo20030c();
                        }
                        a.mo20029b();
                        this.f10814d.mo20099b(a2);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + a2);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                a.mo20029b();
                throw th;
            }
        } finally {
            this.f10814d.mo20099b(a2);
        }
    }
}
