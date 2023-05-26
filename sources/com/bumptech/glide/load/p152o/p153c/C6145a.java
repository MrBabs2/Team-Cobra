package com.bumptech.glide.load.p152o.p153c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.p166r.C6315j;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.o.c.a */
/* compiled from: BitmapDrawableDecoder */
public class C6145a<DataType> implements C6028j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C6028j<DataType, Bitmap> f11243a;

    /* renamed from: b */
    private final Resources f11244b;

    public C6145a(Resources resources, C6028j<DataType, Bitmap> jVar) {
        C6315j.m12978a(resources);
        this.f11244b = resources;
        C6315j.m12978a(jVar);
        this.f11243a = jVar;
    }

    /* renamed from: a */
    public boolean mo20320a(DataType datatype, C6027i iVar) throws IOException {
        return this.f11243a.mo20320a(datatype, iVar);
    }

    /* renamed from: a */
    public C5992u<BitmapDrawable> mo20319a(DataType datatype, int i, int i2, C6027i iVar) throws IOException {
        return C6176r.m12483a(this.f11244b, this.f11243a.mo20319a(datatype, i, i2, iVar));
    }
}
