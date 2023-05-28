package com.bumptech.glide.load.p150n;

import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.n.b */
/* compiled from: ByteArrayLoader */
public class C6063b<Data> implements C6101n<byte[], Data> {

    /* renamed from: a */
    private final C6066b<Data> f11150a;

    /* renamed from: com.bumptech.glide.load.n.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C6064a implements C6103o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.n.b$a$a */
        /* compiled from: ByteArrayLoader */
        class C6065a implements C6066b<ByteBuffer> {
            C6065a(C6064a aVar) {
            }

            /* renamed from: a */
            public ByteBuffer m12188a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo20369a() {
                return ByteBuffer.class;
            }
        }

        /* renamed from: a */
        public C6101n<byte[], ByteBuffer> mo20366a(C6109r rVar) {
            return new C6063b(new C6065a(this));
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C6066b<Data> {
        /* renamed from: a */
        Class<Data> mo20369a();

        /* renamed from: a */
        Data mo20370a(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.n.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C6068d implements C6103o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.n.b$d$a */
        /* compiled from: ByteArrayLoader */
        class C6069a implements C6066b<InputStream> {
            C6069a(C6068d dVar) {
            }

            /* renamed from: a */
            public InputStream m12198a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            /* renamed from: a */
            public Class<InputStream> mo20369a() {
                return InputStream.class;
            }
        }

        /* renamed from: a */
        public C6101n<byte[], InputStream> mo20366a(C6109r rVar) {
            return new C6063b(new C6069a(this));
        }
    }

    public C6063b(C6066b<Data> bVar) {
        this.f11150a = bVar;
    }

    /* renamed from: a */
    public boolean mo20364a(byte[] bArr) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.n.b$c */
    /* compiled from: ByteArrayLoader */
    private static class C6067c<Data> implements C6034d<Data> {

        /* renamed from: f */
        private final byte[] f11151f;

        /* renamed from: g */
        private final C6066b<Data> f11152g;

        C6067c(byte[] bArr, C6066b<Data> bVar) {
            this.f11151f = bArr;
            this.f11152g = bVar;
        }

        /* renamed from: a */
        public void mo20327a(C5878g gVar, C6034d.C6035a<? super Data> aVar) {
            aVar.mo20141a(this.f11152g.mo20370a(this.f11151f));
        }

        /* renamed from: b */
        public void mo20329b() {
        }

        /* renamed from: c */
        public C5901a mo20330c() {
            return C5901a.LOCAL;
        }

        public void cancel() {
        }

        /* renamed from: a */
        public Class<Data> mo20323a() {
            return this.f11152g.mo20369a();
        }
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(byte[] bArr, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(bArr), new C6067c(bArr, this.f11150a));
    }
}
