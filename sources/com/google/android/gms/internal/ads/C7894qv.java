package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* renamed from: com.google.android.gms.internal.ads.qv */
final class C7894qv implements C7821ow {

    /* renamed from: b */
    private static final C8227zv f16680b = new C7968sv();

    /* renamed from: a */
    private final C8227zv f16681a;

    public C7894qv() {
        this(new C8005tv(C7520gv.m17024a(), m18051a()));
    }

    /* renamed from: a */
    public final <T> C7784nw<T> mo26378a(Class<T> cls) {
        Class<zzdob> cls2 = zzdob.class;
        C7858pw.m17934a((Class<?>) cls);
        C8190yv a = this.f16681a.mo25977a(cls);
        if (a.mo25604a()) {
            if (cls2.isAssignableFrom(cls)) {
                return C7411dw.m16844a(C7858pw.m17946c(), C8189yu.m18554b(), a.mo25605b());
            }
            return C7411dw.m16844a(C7858pw.m17924a(), C8189yu.m18555c(), a.mo25605b());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m18052a(a)) {
                return C7337bw.m16655a(cls, a, C7521gw.m17028b(), C7709lv.m17517b(), C7858pw.m17946c(), C8189yu.m18554b(), C8153xv.m18473b());
            }
            return C7337bw.m16655a(cls, a, C7521gw.m17028b(), C7709lv.m17517b(), C7858pw.m17946c(), (C8115wu<?>) null, C8153xv.m18473b());
        } else if (m18052a(a)) {
            return C7337bw.m16655a(cls, a, C7521gw.m17027a(), C7709lv.m17516a(), C7858pw.m17924a(), C8189yu.m18555c(), C8153xv.m18472a());
        } else {
            return C7337bw.m16655a(cls, a, C7521gw.m17027a(), C7709lv.m17516a(), C7858pw.m17940b(), (C8115wu<?>) null, C8153xv.m18472a());
        }
    }

    private C7894qv(C8227zv zvVar) {
        zzdod.m24036a(zvVar, "messageInfoFactory");
        this.f16681a = zvVar;
    }

    /* renamed from: a */
    private static boolean m18052a(C8190yv yvVar) {
        return yvVar.mo25606c() == zzdob.zze.f21582i;
    }

    /* renamed from: a */
    private static C8227zv m18051a() {
        try {
            return (C8227zv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f16680b;
        }
    }
}
