package androidx.work.impl.p009k.p010e;

import android.content.Context;
import androidx.work.C0961j;
import androidx.work.impl.p009k.C0875b;
import androidx.work.impl.p009k.p011f.C0897g;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.utils.p014k.C0956a;

/* renamed from: androidx.work.impl.k.e.g */
/* compiled from: NetworkUnmeteredController */
public class C0885g extends C0880c<C0875b> {
    public C0885g(Context context, C0956a aVar) {
        super(C0897g.m3966a(context, aVar).mo4864c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4835a(C0911j jVar) {
        return jVar.f3213j.mo4689b() == C0961j.UNMETERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4837b(C0875b bVar) {
        return !bVar.mo4823a() || bVar.mo4824b();
    }
}
