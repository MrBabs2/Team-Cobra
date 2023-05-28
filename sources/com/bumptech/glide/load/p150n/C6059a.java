package com.bumptech.glide.load.p150n;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p148m.C6042h;
import com.bumptech.glide.load.p148m.C6050m;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.a */
/* compiled from: AssetUriLoader */
public class C6059a<Data> implements C6101n<Uri, Data> {

    /* renamed from: c */
    private static final int f11145c = 22;

    /* renamed from: a */
    private final AssetManager f11146a;

    /* renamed from: b */
    private final C6060a<Data> f11147b;

    /* renamed from: com.bumptech.glide.load.n.a$a */
    /* compiled from: AssetUriLoader */
    public interface C6060a<Data> {
        /* renamed from: a */
        C6034d<Data> mo20365a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.n.a$b */
    /* compiled from: AssetUriLoader */
    public static class C6061b implements C6103o<Uri, ParcelFileDescriptor>, C6060a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f11148a;

        public C6061b(AssetManager assetManager) {
            this.f11148a = assetManager;
        }

        /* renamed from: a */
        public C6101n<Uri, ParcelFileDescriptor> mo20366a(C6109r rVar) {
            return new C6059a(this.f11148a, this);
        }

        /* renamed from: a */
        public C6034d<ParcelFileDescriptor> mo20365a(AssetManager assetManager, String str) {
            return new C6042h(assetManager, str);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a$c */
    /* compiled from: AssetUriLoader */
    public static class C6062c implements C6103o<Uri, InputStream>, C6060a<InputStream> {

        /* renamed from: a */
        private final AssetManager f11149a;

        public C6062c(AssetManager assetManager) {
            this.f11149a = assetManager;
        }

        /* renamed from: a */
        public C6101n<Uri, InputStream> mo20366a(C6109r rVar) {
            return new C6059a(this.f11149a, this);
        }

        /* renamed from: a */
        public C6034d<InputStream> mo20365a(AssetManager assetManager, String str) {
            return new C6050m(assetManager, str);
        }
    }

    public C6059a(AssetManager assetManager, C6060a<Data> aVar) {
        this.f11146a = assetManager;
        this.f11147b = aVar;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(Uri uri, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(uri), this.f11147b.mo20365a(this.f11146a, uri.toString().substring(f11145c)));
    }

    /* renamed from: a */
    public boolean mo20364a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
