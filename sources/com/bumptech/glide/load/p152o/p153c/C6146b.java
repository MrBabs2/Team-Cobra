package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C5903c;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6029k;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.c.b */
/* compiled from: BitmapDrawableEncoder */
public class C6146b implements C6029k<BitmapDrawable> {

    /* renamed from: a */
    private final C6004e f11245a;

    /* renamed from: b */
    private final C6029k<Bitmap> f11246b;

    public C6146b(C6004e eVar, C6029k<Bitmap> kVar) {
        this.f11245a = eVar;
        this.f11246b = kVar;
    }

    /* renamed from: a */
    public boolean mo20068a(C5992u<BitmapDrawable> uVar, File file, C6027i iVar) {
        return this.f11246b.mo20068a(new C6148d(uVar.get().getBitmap(), this.f11245a), file, iVar);
    }

    /* renamed from: a */
    public C5903c mo20321a(C6027i iVar) {
        return this.f11246b.mo20321a(iVar);
    }
}
