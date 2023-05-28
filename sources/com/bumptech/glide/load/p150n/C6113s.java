package com.bumptech.glide.load.p150n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p150n.C6101n;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.s */
/* compiled from: ResourceLoader */
public class C6113s<Data> implements C6101n<Integer, Data> {

    /* renamed from: a */
    private final C6101n<Uri, Data> f11213a;

    /* renamed from: b */
    private final Resources f11214b;

    /* renamed from: com.bumptech.glide.load.n.s$a */
    /* compiled from: ResourceLoader */
    public static final class C6114a implements C6103o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f11215a;

        public C6114a(Resources resources) {
            this.f11215a = resources;
        }

        /* renamed from: a */
        public C6101n<Integer, AssetFileDescriptor> mo20366a(C6109r rVar) {
            return new C6113s(this.f11215a, rVar.mo20414a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.n.s$b */
    /* compiled from: ResourceLoader */
    public static class C6115b implements C6103o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f11216a;

        public C6115b(Resources resources) {
            this.f11216a = resources;
        }

        /* renamed from: a */
        public C6101n<Integer, ParcelFileDescriptor> mo20366a(C6109r rVar) {
            return new C6113s(this.f11216a, rVar.mo20414a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.n.s$c */
    /* compiled from: ResourceLoader */
    public static class C6116c implements C6103o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f11217a;

        public C6116c(Resources resources) {
            this.f11217a = resources;
        }

        /* renamed from: a */
        public C6101n<Integer, InputStream> mo20366a(C6109r rVar) {
            return new C6113s(this.f11217a, rVar.mo20414a(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.n.s$d */
    /* compiled from: ResourceLoader */
    public static class C6117d implements C6103o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f11218a;

        public C6117d(Resources resources) {
            this.f11218a = resources;
        }

        /* renamed from: a */
        public C6101n<Integer, Uri> mo20366a(C6109r rVar) {
            return new C6113s(this.f11218a, C6123v.m12331a());
        }
    }

    public C6113s(Resources resources, C6101n<Uri, Data> nVar) {
        this.f11214b = resources;
        this.f11213a = nVar;
    }

    /* renamed from: b */
    private Uri m12311b(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f11214b.getResourcePackageName(num.intValue()) + '/' + this.f11214b.getResourceTypeName(num.intValue()) + '/' + this.f11214b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo20364a(Integer num) {
        return true;
    }

    /* renamed from: a */
    public C6101n.C6102a<Data> mo20362a(Integer num, int i, int i2, C6027i iVar) {
        Uri b = m12311b(num);
        if (b == null) {
            return null;
        }
        return this.f11213a.mo20362a(b, i, i2, iVar);
    }
}
