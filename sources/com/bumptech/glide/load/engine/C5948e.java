package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5904d;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.engine.p144a0.C5913a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.e */
/* compiled from: DataCacheWriter */
class C5948e<DataType> implements C5913a.C5915b {

    /* renamed from: a */
    private final C5904d<DataType> f10859a;

    /* renamed from: b */
    private final DataType f10860b;

    /* renamed from: c */
    private final C6027i f10861c;

    C5948e(C5904d<DataType> dVar, DataType datatype, C6027i iVar) {
        this.f10859a = dVar;
        this.f10860b = datatype;
        this.f10861c = iVar;
    }

    /* renamed from: a */
    public boolean mo20097a(File file) {
        return this.f10859a.mo20068a(this.f10860b, file, this.f10861c);
    }
}
