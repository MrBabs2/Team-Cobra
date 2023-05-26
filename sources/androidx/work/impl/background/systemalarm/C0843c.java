package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C0834i;
import androidx.work.impl.background.systemalarm.C0845e;
import androidx.work.impl.p009k.C0876c;
import androidx.work.impl.p009k.C0877d;
import androidx.work.impl.p012l.C0911j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* compiled from: ConstraintsCommandHandler */
class C0843c {

    /* renamed from: e */
    private static final String f3019e = C0834i.m3721a("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f3020a;

    /* renamed from: b */
    private final int f3021b;

    /* renamed from: c */
    private final C0845e f3022c;

    /* renamed from: d */
    private final C0877d f3023d;

    C0843c(Context context, int i, C0845e eVar) {
        this.f3020a = context;
        this.f3021b = i;
        this.f3022c = eVar;
        this.f3023d = new C0877d(this.f3020a, eVar.mo4755c(), (C0876c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4745a() {
        List<C0911j> a = this.f3022c.mo4756d().mo4808f().mo4734d().mo4892a();
        ConstraintProxy.m3758a(this.f3020a, a);
        this.f3023d.mo4834c(a);
        ArrayList<C0911j> arrayList = new ArrayList<>(a.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C0911j next : a) {
            String str = next.f3204a;
            if (currentTimeMillis >= next.mo4879a() && (!next.mo4882b() || this.f3023d.mo4832a(str))) {
                arrayList.add(next);
            }
        }
        for (C0911j jVar : arrayList) {
            String str2 = jVar.f3204a;
            Intent a2 = C0842b.m3767a(this.f3020a, str2);
            C0834i.m3720a().mo4726a(f3019e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            C0845e eVar = this.f3022c;
            eVar.mo4752a((Runnable) new C0845e.C0847b(eVar, a2, this.f3021b));
        }
        this.f3023d.mo4830a();
    }
}
