package com.airbnb.lottie.p137t;

import p015cm.aptoide.p016pt.utils.MultiDexHelper;

/* renamed from: com.airbnb.lottie.t.a */
/* compiled from: FileExtension */
public enum C5783a {
    Json(".json"),
    Zip(MultiDexHelper.EXTRACTED_SUFFIX);
    

    /* renamed from: f */
    public final String f10462f;

    private C5783a(String str) {
        this.f10462f = str;
    }

    /* renamed from: a */
    public String mo19689a() {
        return ".temp" + this.f10462f;
    }

    public String toString() {
        return this.f10462f;
    }
}
