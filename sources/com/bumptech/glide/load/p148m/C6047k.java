package com.bumptech.glide.load.p148m;

import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.p148m.C6036e;
import com.bumptech.glide.load.p152o.p153c.C6177s;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.k */
/* compiled from: InputStreamRewinder */
public final class C6047k implements C6036e<InputStream> {

    /* renamed from: a */
    private final C6177s f11126a;

    /* renamed from: com.bumptech.glide.load.m.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C6048a implements C6036e.C6037a<InputStream> {

        /* renamed from: a */
        private final C5999b f11127a;

        public C6048a(C5999b bVar) {
            this.f11127a = bVar;
        }

        /* renamed from: a */
        public C6036e<InputStream> mo20339a(InputStream inputStream) {
            return new C6047k(inputStream, this.f11127a);
        }

        /* renamed from: a */
        public Class<InputStream> mo20340a() {
            return InputStream.class;
        }
    }

    C6047k(InputStream inputStream, C5999b bVar) {
        C6177s sVar = new C6177s(inputStream, bVar);
        this.f11126a = sVar;
        sVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo20338b() {
        this.f11126a.mo20466b();
    }

    /* renamed from: a */
    public InputStream m12127a() throws IOException {
        this.f11126a.reset();
        return this.f11126a;
    }
}
