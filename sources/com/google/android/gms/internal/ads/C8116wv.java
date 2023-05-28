package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wv */
final class C8116wv implements C8079vv {
    C8116wv() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo26704a(Object obj) {
        return (zzdpe) obj;
    }

    /* renamed from: b */
    public final Object mo26705b(Object obj) {
        ((zzdpe) obj).mo29163c();
        return obj;
    }

    /* renamed from: c */
    public final Object mo26706c(Object obj) {
        return zzdpe.m24075f().mo29165e();
    }

    /* renamed from: d */
    public final C8042uv<?, ?> mo26707d(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: e */
    public final boolean mo26708e(Object obj) {
        return !((zzdpe) obj).mo29162b();
    }

    /* renamed from: f */
    public final Map<?, ?> mo26709f(Object obj) {
        return (zzdpe) obj;
    }

    /* renamed from: a */
    public final Object mo26703a(Object obj, Object obj2) {
        zzdpe zzdpe = (zzdpe) obj;
        zzdpe zzdpe2 = (zzdpe) obj2;
        if (!zzdpe2.isEmpty()) {
            if (!zzdpe.mo29162b()) {
                zzdpe = zzdpe.mo29165e();
            }
            zzdpe.mo29161a(zzdpe2);
        }
        return zzdpe;
    }

    /* renamed from: a */
    public final int mo26702a(int i, Object obj, Object obj2) {
        zzdpe zzdpe = (zzdpe) obj;
        if (zzdpe.isEmpty()) {
            return 0;
        }
        Iterator it = zzdpe.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
