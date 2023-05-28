package com.bumptech.glide;

import com.bumptech.glide.C5885j;
import com.bumptech.glide.p162p.p164m.C6294c;
import com.bumptech.glide.p162p.p164m.C6298e;
import com.bumptech.glide.p166r.C6315j;

/* renamed from: com.bumptech.glide.j */
/* compiled from: TransitionOptions */
public abstract class C5885j<CHILD extends C5885j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: f */
    private C6298e<? super TranscodeType> f10684f = C6294c.m12936b();

    /* renamed from: c */
    private CHILD mo20495c() {
        return this;
    }

    /* renamed from: a */
    public final CHILD mo20017a(C6298e<? super TranscodeType> eVar) {
        C6315j.m12978a(eVar);
        this.f10684f = eVar;
        mo20495c();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6298e<? super TranscodeType> mo20018b() {
        return this.f10684f;
    }

    public final CHILD clone() {
        try {
            return (C5885j) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
