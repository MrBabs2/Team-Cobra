package com.bumptech.glide.load.engine.p144a0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p144a0.C5926h;
import com.bumptech.glide.p166r.C6312g;

/* renamed from: com.bumptech.glide.load.engine.a0.g */
/* compiled from: LruResourceCache */
public class C5925g extends C6312g<C6022f, C5992u<?>> implements C5926h {

    /* renamed from: d */
    private C5926h.C5927a f10818d;

    public C5925g(long j) {
        super(j);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C5992u mo20105a(C6022f fVar, C5992u uVar) {
        return (C5992u) super.mo20760b(fVar, uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20108a(C6022f fVar, C5992u<?> uVar) {
        C5926h.C5927a aVar = this.f10818d;
        if (aVar != null && uVar != null) {
            aVar.mo20112a(uVar);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C5992u mo20104a(C6022f fVar) {
        return (C5992u) super.mo20761c(fVar);
    }

    /* renamed from: a */
    public void mo20107a(C5926h.C5927a aVar) {
        this.f10818d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo20109b(C5992u<?> uVar) {
        if (uVar == null) {
            return super.mo20109b(null);
        }
        return uVar.mo20238c();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo20106a(int i) {
        if (i >= 40) {
            mo20757a();
        } else if (i >= 20 || i == 15) {
            mo20758a(mo20759b() / 2);
        }
    }
}
