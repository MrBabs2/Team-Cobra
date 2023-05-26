package com.bumptech.glide.load.p150n.p151y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.p149o.C6053b;
import com.bumptech.glide.load.p148m.p149o.C6054c;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.load.p150n.C6103o;
import com.bumptech.glide.load.p150n.C6109r;
import com.bumptech.glide.load.p152o.p153c.C6187y;
import com.bumptech.glide.p165q.C6301c;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.y.d */
/* compiled from: MediaStoreVideoThumbLoader */
public class C6139d implements C6101n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f11238a;

    /* renamed from: com.bumptech.glide.load.n.y.d$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C6140a implements C6103o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f11239a;

        public C6140a(Context context) {
            this.f11239a = context;
        }

        /* renamed from: a */
        public C6101n<Uri, InputStream> mo20366a(C6109r rVar) {
            return new C6139d(this.f11239a);
        }
    }

    public C6139d(Context context) {
        this.f11238a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C6101n.C6102a<InputStream> mo20362a(Uri uri, int i, int i2, C6027i iVar) {
        if (!C6053b.m12152a(i, i2) || !m12371a(iVar)) {
            return null;
        }
        return new C6101n.C6102a<>(new C6301c(uri), C6054c.m12159b(this.f11238a, uri));
    }

    /* renamed from: a */
    private boolean m12371a(C6027i iVar) {
        Long l = (Long) iVar.mo20316a(C6187y.f11312d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: a */
    public boolean mo20364a(Uri uri) {
        return C6053b.m12155c(uri);
    }
}
