package com.bumptech.glide.load.p150n.p151y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.p149o.C6053b;
import com.bumptech.glide.load.p148m.p149o.C6054c;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.load.p150n.C6103o;
import com.bumptech.glide.load.p150n.C6109r;
import com.bumptech.glide.p165q.C6301c;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.y.c */
/* compiled from: MediaStoreImageThumbLoader */
public class C6137c implements C6101n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f11236a;

    /* renamed from: com.bumptech.glide.load.n.y.c$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C6138a implements C6103o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f11237a;

        public C6138a(Context context) {
            this.f11237a = context;
        }

        /* renamed from: a */
        public C6101n<Uri, InputStream> mo20366a(C6109r rVar) {
            return new C6137c(this.f11237a);
        }
    }

    public C6137c(Context context) {
        this.f11236a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C6101n.C6102a<InputStream> mo20362a(Uri uri, int i, int i2, C6027i iVar) {
        if (C6053b.m12152a(i, i2)) {
            return new C6101n.C6102a<>(new C6301c(uri), C6054c.m12157a(this.f11236a, uri));
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo20364a(Uri uri) {
        return C6053b.m12153a(uri);
    }
}
