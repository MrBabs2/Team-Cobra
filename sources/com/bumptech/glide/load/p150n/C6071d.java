package com.bumptech.glide.load.p150n;

import android.util.Log;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;
import com.bumptech.glide.p166r.C6302a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.n.d */
/* compiled from: ByteBufferFileLoader */
public class C6071d implements C6101n<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.n.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C6073b implements C6103o<File, ByteBuffer> {
        /* renamed from: a */
        public C6101n<File, ByteBuffer> mo20366a(C6109r rVar) {
            return new C6071d();
        }
    }

    /* renamed from: a */
    public boolean mo20364a(File file) {
        return true;
    }

    /* renamed from: a */
    public C6101n.C6102a<ByteBuffer> mo20362a(File file, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(file), new C6072a(file));
    }

    /* renamed from: com.bumptech.glide.load.n.d$a */
    /* compiled from: ByteBufferFileLoader */
    private static final class C6072a implements C6034d<ByteBuffer> {

        /* renamed from: f */
        private final File f11153f;

        C6072a(File file) {
            this.f11153f = file;
        }

        /* renamed from: a */
        public void mo20327a(C5878g gVar, C6034d.C6035a<? super ByteBuffer> aVar) {
            try {
                aVar.mo20141a(C6302a.m12949a(this.f11153f));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo20140a((Exception) e);
            }
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
        public Class<ByteBuffer> mo20323a() {
            return ByteBuffer.class;
        }
    }
}
