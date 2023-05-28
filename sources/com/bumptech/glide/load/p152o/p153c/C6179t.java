package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.p152o.p155e.C6201e;

/* renamed from: com.bumptech.glide.load.o.c.t */
/* compiled from: ResourceBitmapDecoder */
public class C6179t implements C6028j<Uri, Bitmap> {

    /* renamed from: a */
    private final C6201e f11298a;

    /* renamed from: b */
    private final C6004e f11299b;

    public C6179t(C6201e eVar, C6004e eVar2) {
        this.f11298a = eVar;
        this.f11299b = eVar2;
    }

    /* renamed from: a */
    public boolean mo20320a(Uri uri, C6027i iVar) {
        return "android.resource".equals(uri.getScheme());
    }

    /* renamed from: a */
    public C5992u<Bitmap> mo20319a(Uri uri, int i, int i2, C6027i iVar) {
        C5992u<Drawable> a = this.f11298a.mo20319a(uri, i, i2, iVar);
        if (a == null) {
            return null;
        }
        return C6170m.m12472a(this.f11299b, a.get(), i, i2);
    }
}
