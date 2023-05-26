package com.bumptech.glide.load.p152o.p157g;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p147z.C5999b;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.p143l.C5895a;

/* renamed from: com.bumptech.glide.load.o.g.b */
/* compiled from: GifBitmapProvider */
public final class C6208b implements C5895a.C5896a {

    /* renamed from: a */
    private final C6004e f11333a;

    /* renamed from: b */
    private final C5999b f11334b;

    public C6208b(C6004e eVar, C5999b bVar) {
        this.f11333a = eVar;
        this.f11334b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo20049a(int i, int i2, Bitmap.Config config) {
        return this.f11333a.mo20284b(i, i2, config);
    }

    /* renamed from: b */
    public byte[] mo20054b(int i) {
        C5999b bVar = this.f11334b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo20263b(i, byte[].class);
    }

    /* renamed from: a */
    public void mo20050a(Bitmap bitmap) {
        this.f11333a.mo20283a(bitmap);
    }

    /* renamed from: a */
    public void mo20051a(byte[] bArr) {
        C5999b bVar = this.f11334b;
        if (bVar != null) {
            bVar.mo20262a(bArr);
        }
    }

    /* renamed from: a */
    public int[] mo20053a(int i) {
        C5999b bVar = this.f11334b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo20263b(i, int[].class);
    }

    /* renamed from: a */
    public void mo20052a(int[] iArr) {
        C5999b bVar = this.f11334b;
        if (bVar != null) {
            bVar.mo20262a(iArr);
        }
    }
}
