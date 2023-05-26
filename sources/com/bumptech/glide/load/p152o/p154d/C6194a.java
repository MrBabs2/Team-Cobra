package com.bumptech.glide.load.p152o.p154d;

import com.bumptech.glide.load.p148m.C6036e;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.d.a */
/* compiled from: ByteBufferRewinder */
public class C6194a implements C6036e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f11320a;

    /* renamed from: com.bumptech.glide.load.o.d.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C6195a implements C6036e.C6037a<ByteBuffer> {
        /* renamed from: a */
        public C6036e<ByteBuffer> mo20339a(ByteBuffer byteBuffer) {
            return new C6194a(byteBuffer);
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo20340a() {
            return ByteBuffer.class;
        }
    }

    public C6194a(ByteBuffer byteBuffer) {
        this.f11320a = byteBuffer;
    }

    /* renamed from: b */
    public void mo20338b() {
    }

    /* renamed from: a */
    public ByteBuffer m12543a() {
        this.f11320a.position(0);
        return this.f11320a;
    }
}
