package com.bumptech.glide.load.p152o.p158h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.p152o.p153c.C6148d;
import com.bumptech.glide.load.p152o.p157g.C6209c;

/* renamed from: com.bumptech.glide.load.o.h.c */
/* compiled from: DrawableBytesTranscoder */
public final class C6224c implements C6226e<Drawable, byte[]> {

    /* renamed from: a */
    private final C6004e f11377a;

    /* renamed from: b */
    private final C6226e<Bitmap, byte[]> f11378b;

    /* renamed from: c */
    private final C6226e<C6209c, byte[]> f11379c;

    public C6224c(C6004e eVar, C6226e<Bitmap, byte[]> eVar2, C6226e<C6209c, byte[]> eVar3) {
        this.f11377a = eVar;
        this.f11378b = eVar2;
        this.f11379c = eVar3;
    }

    /* renamed from: a */
    private static C5992u<C6209c> m12653a(C5992u<Drawable> uVar) {
        return uVar;
    }

    /* renamed from: a */
    public C5992u<byte[]> mo20552a(C5992u<Drawable> uVar, C6027i iVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f11378b.mo20552a(C6148d.m12395a(((BitmapDrawable) drawable).getBitmap(), this.f11377a), iVar);
        }
        if (!(drawable instanceof C6209c)) {
            return null;
        }
        C6226e<C6209c, byte[]> eVar = this.f11379c;
        m12653a(uVar);
        return eVar.mo20552a(uVar, iVar);
    }
}
