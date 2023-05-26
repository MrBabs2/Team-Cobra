package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.p152o.p153c.C6167l;
import com.bumptech.glide.p166r.C6307d;
import com.bumptech.glide.p166r.C6313h;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.c.v */
/* compiled from: StreamBitmapDecoder */
public class C6181v implements C6028j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C6167l f11302a;

    /* renamed from: b */
    private final C5999b f11303b;

    /* renamed from: com.bumptech.glide.load.o.c.v$a */
    /* compiled from: StreamBitmapDecoder */
    static class C6182a implements C6167l.C6169b {

        /* renamed from: a */
        private final C6177s f11304a;

        /* renamed from: b */
        private final C6307d f11305b;

        C6182a(C6177s sVar, C6307d dVar) {
            this.f11304a = sVar;
            this.f11305b = dVar;
        }

        /* renamed from: a */
        public void mo20460a() {
            this.f11304a.mo20464a();
        }

        /* renamed from: a */
        public void mo20461a(C6004e eVar, Bitmap bitmap) throws IOException {
            IOException a = this.f11305b.mo20742a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo20283a(bitmap);
                }
                throw a;
            }
        }
    }

    public C6181v(C6167l lVar, C5999b bVar) {
        this.f11302a = lVar;
        this.f11303b = bVar;
    }

    /* renamed from: a */
    public boolean mo20320a(InputStream inputStream, C6027i iVar) {
        return this.f11302a.mo20458a(inputStream);
    }

    /* renamed from: a */
    public C5992u<Bitmap> mo20319a(InputStream inputStream, int i, int i2, C6027i iVar) throws IOException {
        C6177s sVar;
        boolean z;
        if (inputStream instanceof C6177s) {
            sVar = (C6177s) inputStream;
            z = false;
        } else {
            sVar = new C6177s(inputStream, this.f11303b);
            z = true;
        }
        C6307d b = C6307d.m12958b(sVar);
        try {
            return this.f11302a.mo20457a((InputStream) new C6313h(b), i, i2, iVar, (C6167l.C6169b) new C6182a(sVar, b));
        } finally {
            b.mo20745b();
            if (z) {
                sVar.mo20466b();
            }
        }
    }
}
