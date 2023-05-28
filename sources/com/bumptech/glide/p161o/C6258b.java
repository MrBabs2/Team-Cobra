package com.bumptech.glide.p161o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.o.b */
/* compiled from: ImageHeaderParserRegistry */
public final class C6258b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f11422a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> mo20609a() {
        return this.f11422a;
    }

    /* renamed from: a */
    public synchronized void mo20610a(ImageHeaderParser imageHeaderParser) {
        this.f11422a.add(imageHeaderParser);
    }
}
