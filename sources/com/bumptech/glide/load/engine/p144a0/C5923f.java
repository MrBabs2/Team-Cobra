package com.bumptech.glide.load.engine.p144a0;

import android.content.Context;
import com.bumptech.glide.load.engine.p144a0.C5920d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.a0.f */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C5923f extends C5920d {

    /* renamed from: com.bumptech.glide.load.engine.a0.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C5924a implements C5920d.C5921a {

        /* renamed from: a */
        final /* synthetic */ Context f10816a;

        /* renamed from: b */
        final /* synthetic */ String f10817b;

        C5924a(Context context, String str) {
            this.f10816a = context;
            this.f10817b = str;
        }

        /* renamed from: a */
        public File mo20102a() {
            File cacheDir = this.f10816a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f10817b != null ? new File(cacheDir, this.f10817b) : cacheDir;
        }
    }

    public C5923f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C5923f(Context context, String str, long j) {
        super(new C5924a(context, str), j);
    }
}
