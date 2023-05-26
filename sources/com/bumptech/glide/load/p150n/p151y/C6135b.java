package com.bumptech.glide.load.p150n.p151y;

import android.net.Uri;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p150n.C6087g;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.load.p150n.C6103o;
import com.bumptech.glide.load.p150n.C6109r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

/* renamed from: com.bumptech.glide.load.n.y.b */
/* compiled from: HttpUriLoader */
public class C6135b implements C6101n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f11234b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME})));

    /* renamed from: a */
    private final C6101n<C6087g, InputStream> f11235a;

    /* renamed from: com.bumptech.glide.load.n.y.b$a */
    /* compiled from: HttpUriLoader */
    public static class C6136a implements C6103o<Uri, InputStream> {
        /* renamed from: a */
        public C6101n<Uri, InputStream> mo20366a(C6109r rVar) {
            return new C6135b(rVar.mo20414a(C6087g.class, InputStream.class));
        }
    }

    public C6135b(C6101n<C6087g, InputStream> nVar) {
        this.f11235a = nVar;
    }

    /* renamed from: a */
    public C6101n.C6102a<InputStream> mo20362a(Uri uri, int i, int i2, C6027i iVar) {
        return this.f11235a.mo20362a(new C6087g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo20364a(Uri uri) {
        return f11234b.contains(uri.getScheme());
    }
}
