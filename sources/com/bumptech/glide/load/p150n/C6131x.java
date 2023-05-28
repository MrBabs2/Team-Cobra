package com.bumptech.glide.load.p150n;

import android.net.Uri;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p150n.C6101n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

/* renamed from: com.bumptech.glide.load.n.x */
/* compiled from: UrlUriLoader */
public class C6131x<Data> implements C6101n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f11229b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME})));

    /* renamed from: a */
    private final C6101n<C6087g, Data> f11230a;

    /* renamed from: com.bumptech.glide.load.n.x$a */
    /* compiled from: UrlUriLoader */
    public static class C6132a implements C6103o<Uri, InputStream> {
        /* renamed from: a */
        public C6101n<Uri, InputStream> mo20366a(C6109r rVar) {
            return new C6131x(rVar.mo20414a(C6087g.class, InputStream.class));
        }
    }

    public C6131x(C6101n<C6087g, Data> nVar) {
        this.f11230a = nVar;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(Uri uri, int i, int i2, C6027i iVar) {
        return this.f11230a.mo20362a(new C6087g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo20364a(Uri uri) {
        return f11229b.contains(uri.getScheme());
    }
}
