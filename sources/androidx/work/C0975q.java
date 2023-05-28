package androidx.work;

import android.content.Context;
import androidx.work.impl.C0868h;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.q */
/* compiled from: WorkManager */
public abstract class C0975q {
    protected C0975q() {
    }

    /* renamed from: a */
    public static C0975q m4144a(Context context) {
        return C0868h.m3846a(context);
    }

    /* renamed from: a */
    public abstract C0964l mo4795a(String str);

    /* renamed from: a */
    public abstract C0964l mo4796a(String str, C0831f fVar, C0970m mVar);

    /* renamed from: a */
    public abstract C0964l mo4797a(String str, C0832g gVar, List<C0962k> list);

    /* renamed from: b */
    public abstract C0964l mo4802b(String str);

    /* renamed from: a */
    public static void m4145a(Context context, C0822b bVar) {
        C0868h.m3847a(context, bVar);
    }

    /* renamed from: a */
    public C0964l mo4978a(String str, C0832g gVar, C0962k kVar) {
        return mo4797a(str, gVar, (List<C0962k>) Collections.singletonList(kVar));
    }
}
