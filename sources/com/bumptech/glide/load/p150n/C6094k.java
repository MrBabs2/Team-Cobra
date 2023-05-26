package com.bumptech.glide.load.p150n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p148m.p149o.C6053b;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.n.k */
/* compiled from: MediaStoreFileLoader */
public final class C6094k implements C6101n<Uri, File> {

    /* renamed from: a */
    private final Context f11178a;

    /* renamed from: com.bumptech.glide.load.n.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C6095a implements C6103o<Uri, File> {

        /* renamed from: a */
        private final Context f11179a;

        public C6095a(Context context) {
            this.f11179a = context;
        }

        /* renamed from: a */
        public C6101n<Uri, File> mo20366a(C6109r rVar) {
            return new C6094k(this.f11179a);
        }
    }

    public C6094k(Context context) {
        this.f11178a = context;
    }

    /* renamed from: a */
    public C6101n.C6102a<File> mo20362a(Uri uri, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(uri), new C6096b(this.f11178a, uri));
    }

    /* renamed from: a */
    public boolean mo20364a(Uri uri) {
        return C6053b.m12154b(uri);
    }

    /* renamed from: com.bumptech.glide.load.n.k$b */
    /* compiled from: MediaStoreFileLoader */
    private static class C6096b implements C6034d<File> {

        /* renamed from: h */
        private static final String[] f11180h = {"_data"};

        /* renamed from: f */
        private final Context f11181f;

        /* renamed from: g */
        private final Uri f11182g;

        C6096b(Context context, Uri uri) {
            this.f11181f = context;
            this.f11182g = uri;
        }

        /* renamed from: a */
        public void mo20327a(C5878g gVar, C6034d.C6035a<? super File> aVar) {
            Cursor query = this.f11181f.getContentResolver().query(this.f11182g, f11180h, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo20140a((Exception) new FileNotFoundException("Failed to find file path for: " + this.f11182g));
                return;
            }
            aVar.mo20141a(new File(str));
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
        public Class<File> mo20323a() {
            return File.class;
        }
    }
}
