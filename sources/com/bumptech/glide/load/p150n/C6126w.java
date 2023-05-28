package com.bumptech.glide.load.p150n;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6031a;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p148m.C6043i;
import com.bumptech.glide.load.p148m.C6051n;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.n.w */
/* compiled from: UriLoader */
public class C6126w<Data> implements C6101n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f11224b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C6129c<Data> f11225a;

    /* renamed from: com.bumptech.glide.load.n.w$a */
    /* compiled from: UriLoader */
    public static final class C6127a implements C6103o<Uri, AssetFileDescriptor>, C6129c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f11226a;

        public C6127a(ContentResolver contentResolver) {
            this.f11226a = contentResolver;
        }

        /* renamed from: a */
        public C6101n<Uri, AssetFileDescriptor> mo20366a(C6109r rVar) {
            return new C6126w(this);
        }

        /* renamed from: a */
        public C6034d<AssetFileDescriptor> mo20428a(Uri uri) {
            return new C6031a(this.f11226a, uri);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.w$b */
    /* compiled from: UriLoader */
    public static class C6128b implements C6103o<Uri, ParcelFileDescriptor>, C6129c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f11227a;

        public C6128b(ContentResolver contentResolver) {
            this.f11227a = contentResolver;
        }

        /* renamed from: a */
        public C6034d<ParcelFileDescriptor> mo20428a(Uri uri) {
            return new C6043i(this.f11227a, uri);
        }

        /* renamed from: a */
        public C6101n<Uri, ParcelFileDescriptor> mo20366a(C6109r rVar) {
            return new C6126w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.w$c */
    /* compiled from: UriLoader */
    public interface C6129c<Data> {
        /* renamed from: a */
        C6034d<Data> mo20428a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.n.w$d */
    /* compiled from: UriLoader */
    public static class C6130d implements C6103o<Uri, InputStream>, C6129c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f11228a;

        public C6130d(ContentResolver contentResolver) {
            this.f11228a = contentResolver;
        }

        /* renamed from: a */
        public C6034d<InputStream> mo20428a(Uri uri) {
            return new C6051n(this.f11228a, uri);
        }

        /* renamed from: a */
        public C6101n<Uri, InputStream> mo20366a(C6109r rVar) {
            return new C6126w(this);
        }
    }

    public C6126w(C6129c<Data> cVar) {
        this.f11225a = cVar;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(Uri uri, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(uri), this.f11225a.mo20428a(uri));
    }

    /* renamed from: a */
    public boolean mo20364a(Uri uri) {
        return f11224b.contains(uri.getScheme());
    }
}
