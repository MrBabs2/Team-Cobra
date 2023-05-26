package com.bumptech.glide.load.p150n;

import android.util.Base64;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.e */
/* compiled from: DataUrlLoader */
public final class C6074e<Model, Data> implements C6101n<Model, Data> {

    /* renamed from: a */
    private final C6075a<Data> f11154a;

    /* renamed from: com.bumptech.glide.load.n.e$a */
    /* compiled from: DataUrlLoader */
    public interface C6075a<Data> {
        /* renamed from: a */
        Class<Data> mo20374a();

        /* renamed from: a */
        Data mo20375a(String str) throws IllegalArgumentException;

        /* renamed from: a */
        void mo20376a(Data data) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.n.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C6077c<Model> implements C6103o<Model, InputStream> {

        /* renamed from: a */
        private final C6075a<InputStream> f11158a = new C6078a(this);

        /* renamed from: a */
        public C6101n<Model, InputStream> mo20366a(C6109r rVar) {
            return new C6074e(this.f11158a);
        }

        /* renamed from: com.bumptech.glide.load.n.e$c$a */
        /* compiled from: DataUrlLoader */
        class C6078a implements C6075a<InputStream> {
            C6078a(C6077c cVar) {
            }

            /* renamed from: a */
            public InputStream m12222a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }

            /* renamed from: a */
            public void mo20376a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: a */
            public Class<InputStream> mo20374a() {
                return InputStream.class;
            }
        }
    }

    public C6074e(C6075a<Data> aVar) {
        this.f11154a = aVar;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(Model model, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(model), new C6076b(model.toString(), this.f11154a));
    }

    /* renamed from: com.bumptech.glide.load.n.e$b */
    /* compiled from: DataUrlLoader */
    private static final class C6076b<Data> implements C6034d<Data> {

        /* renamed from: f */
        private final String f11155f;

        /* renamed from: g */
        private final C6075a<Data> f11156g;

        /* renamed from: h */
        private Data f11157h;

        C6076b(String str, C6075a<Data> aVar) {
            this.f11155f = str;
            this.f11156g = aVar;
        }

        /* renamed from: a */
        public void mo20327a(C5878g gVar, C6034d.C6035a<? super Data> aVar) {
            try {
                Data a = this.f11156g.mo20375a(this.f11155f);
                this.f11157h = a;
                aVar.mo20141a(a);
            } catch (IllegalArgumentException e) {
                aVar.mo20140a((Exception) e);
            }
        }

        /* renamed from: b */
        public void mo20329b() {
            try {
                this.f11156g.mo20376a(this.f11157h);
            } catch (IOException unused) {
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
            return this.f11156g.mo20374a();
        }
    }

    /* renamed from: a */
    public boolean mo20364a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
