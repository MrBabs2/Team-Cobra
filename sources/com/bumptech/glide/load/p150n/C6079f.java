package com.bumptech.glide.load.p150n;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.f */
/* compiled from: FileLoader */
public class C6079f<Data> implements C6101n<File, Data> {

    /* renamed from: a */
    private final C6084d<Data> f11159a;

    /* renamed from: com.bumptech.glide.load.n.f$a */
    /* compiled from: FileLoader */
    public static class C6080a<Data> implements C6103o<File, Data> {

        /* renamed from: a */
        private final C6084d<Data> f11160a;

        public C6080a(C6084d<Data> dVar) {
            this.f11160a = dVar;
        }

        /* renamed from: a */
        public final C6101n<File, Data> mo20366a(C6109r rVar) {
            return new C6079f(this.f11160a);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.f$b */
    /* compiled from: FileLoader */
    public static class C6081b extends C6080a<ParcelFileDescriptor> {
        public C6081b() {
            super(new C6082a());
        }

        /* renamed from: com.bumptech.glide.load.n.f$b$a */
        /* compiled from: FileLoader */
        class C6082a implements C6084d<ParcelFileDescriptor> {
            C6082a() {
            }

            /* renamed from: a */
            public ParcelFileDescriptor m12232a(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* renamed from: a */
            public void mo20383a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo20381a() {
                return ParcelFileDescriptor.class;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.f$d */
    /* compiled from: FileLoader */
    public interface C6084d<Data> {
        /* renamed from: a */
        Class<Data> mo20381a();

        /* renamed from: a */
        Data mo20380a(File file) throws FileNotFoundException;

        /* renamed from: a */
        void mo20383a(Data data) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.n.f$e */
    /* compiled from: FileLoader */
    public static class C6085e extends C6080a<InputStream> {
        public C6085e() {
            super(new C6086a());
        }

        /* renamed from: com.bumptech.glide.load.n.f$e$a */
        /* compiled from: FileLoader */
        class C6086a implements C6084d<InputStream> {
            C6086a() {
            }

            /* renamed from: a */
            public InputStream m12244a(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            /* renamed from: a */
            public void mo20383a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: a */
            public Class<InputStream> mo20381a() {
                return InputStream.class;
            }
        }
    }

    public C6079f(C6084d<Data> dVar) {
        this.f11159a = dVar;
    }

    /* renamed from: a */
    public boolean mo20364a(File file) {
        return true;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(File file, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(file), new C6083c(file, this.f11159a));
    }

    /* renamed from: com.bumptech.glide.load.n.f$c */
    /* compiled from: FileLoader */
    private static final class C6083c<Data> implements C6034d<Data> {

        /* renamed from: f */
        private final File f11161f;

        /* renamed from: g */
        private final C6084d<Data> f11162g;

        /* renamed from: h */
        private Data f11163h;

        C6083c(File file, C6084d<Data> dVar) {
            this.f11161f = file;
            this.f11162g = dVar;
        }

        /* renamed from: a */
        public void mo20327a(C5878g gVar, C6034d.C6035a<? super Data> aVar) {
            try {
                Data a = this.f11162g.mo20380a(this.f11161f);
                this.f11163h = a;
                aVar.mo20141a(a);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo20140a((Exception) e);
            }
        }

        /* renamed from: b */
        public void mo20329b() {
            Data data = this.f11163h;
            if (data != null) {
                try {
                    this.f11162g.mo20383a(data);
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public C5901a mo20330c() {
            return C5901a.LOCAL;
        }

        public void cancel() {
        }

        /* renamed from: a */
        public Class<Data> mo20323a() {
            return this.f11162g.mo20381a();
        }
    }
}
