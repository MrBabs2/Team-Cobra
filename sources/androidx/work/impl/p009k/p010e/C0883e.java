package androidx.work.impl.p009k.p010e;

import android.content.Context;
import android.os.Build;
import androidx.work.C0834i;
import androidx.work.C0961j;
import androidx.work.impl.p009k.C0875b;
import androidx.work.impl.p009k.p011f.C0897g;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.utils.p014k.C0956a;

/* renamed from: androidx.work.impl.k.e.e */
/* compiled from: NetworkMeteredController */
public class C0883e extends C0880c<C0875b> {

    /* renamed from: e */
    private static final String f3163e = C0834i.m3721a("NetworkMeteredCtrlr");

    public C0883e(Context context, C0956a aVar) {
        super(C0897g.m3966a(context, aVar).mo4864c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4835a(C0911j jVar) {
        return jVar.f3213j.mo4689b() == C0961j.METERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4837b(C0875b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            C0834i.m3720a().mo4726a(f3163e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.mo4823a();
        } else if (!bVar.mo4823a() || !bVar.mo4824b()) {
            return true;
        } else {
            return false;
        }
    }
}
