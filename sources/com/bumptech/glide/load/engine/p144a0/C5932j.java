package com.bumptech.glide.load.engine.p144a0;

import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.p166r.C6312g;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import com.bumptech.glide.p166r.p167l.C6318a;
import com.bumptech.glide.p166r.p167l.C6327c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.engine.a0.j */
/* compiled from: SafeKeyGenerator */
public class C5932j {

    /* renamed from: a */
    private final C6312g<C6022f, String> f10833a = new C6312g<>(1000);

    /* renamed from: b */
    private final C5005e<C5934b> f10834b = C6318a.m13006a(10, new C5933a(this));

    /* renamed from: com.bumptech.glide.load.engine.a0.j$a */
    /* compiled from: SafeKeyGenerator */
    class C5933a implements C6318a.C6322d<C5934b> {
        C5933a(C5932j jVar) {
        }

        /* renamed from: a */
        public C5934b m11741a() {
            try {
                return new C5934b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a0.j$b */
    /* compiled from: SafeKeyGenerator */
    private static final class C5934b implements C6318a.C6324f {

        /* renamed from: f */
        final MessageDigest f10835f;

        /* renamed from: g */
        private final C6327c f10836g = C6327c.m13024b();

        C5934b(MessageDigest messageDigest) {
            this.f10835f = messageDigest;
        }

        /* renamed from: i */
        public C6327c mo20121i() {
            return this.f10836g;
        }
    }

    /* renamed from: b */
    private String m11738b(C6022f fVar) {
        C5934b a = this.f10834b.mo17456a();
        C6315j.m12978a(a);
        C5934b bVar = a;
        try {
            fVar.updateDiskCacheKey(bVar.f10835f);
            return C6316k.m12991a(bVar.f10835f.digest());
        } finally {
            this.f10834b.mo17457a(bVar);
        }
    }

    /* renamed from: a */
    public String mo20119a(C6022f fVar) {
        String a;
        synchronized (this.f10833a) {
            a = this.f10833a.mo20756a(fVar);
        }
        if (a == null) {
            a = m11738b(fVar);
        }
        synchronized (this.f10833a) {
            this.f10833a.mo20760b(fVar, a);
        }
        return a;
    }
}
