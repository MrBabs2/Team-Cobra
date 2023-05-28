package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdpk;
import java.security.GeneralSecurityException;

public abstract class zzdbt<P, KeyProto extends zzdpk, KeyFormatProto extends zzdpk> implements zzdbs<P> {

    /* renamed from: a */
    private final Class<P> f21322a;

    /* renamed from: b */
    private final Class<KeyProto> f21323b;

    /* renamed from: c */
    private final Class<KeyFormatProto> f21324c;

    /* renamed from: d */
    private final String f21325d;

    protected zzdbt(Class<P> cls, Class<KeyProto> cls2, Class<KeyFormatProto> cls3, String str) {
        this.f21322a = cls;
        this.f21323b = cls2;
        this.f21324c = cls3;
        this.f21325d = str;
    }

    /* renamed from: a */
    private static <Casted> Casted m23256a(Object obj, String str, Class<Casted> cls) throws GeneralSecurityException {
        if (cls.isInstance(obj)) {
            return obj;
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: g */
    private final P m23257g(KeyProto keyproto) throws GeneralSecurityException {
        mo25927c(keyproto);
        return mo25931e(keyproto);
    }

    /* renamed from: h */
    private final KeyProto m23258h(KeyFormatProto keyformatproto) throws GeneralSecurityException {
        mo25929d(keyformatproto);
        KeyProto f = mo25932f(keyformatproto);
        mo25927c(f);
        return f;
    }

    /* renamed from: b */
    public final P mo28906b(zzdpk zzdpk) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.f21323b.getName());
        m23256a(zzdpk, valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type "), this.f21323b);
        return m23257g(zzdpk);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract zzdgr.zzb mo25926c();

    /* renamed from: c */
    public final P mo28908c(zzdmr zzdmr) throws GeneralSecurityException {
        try {
            return m23257g(mo25928d(zzdmr));
        } catch (zzdok e) {
            String valueOf = String.valueOf(this.f21323b.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo25927c(KeyProto keyproto) throws GeneralSecurityException;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract KeyProto mo25928d(zzdmr zzdmr) throws zzdok;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo25929d(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract KeyFormatProto mo25930e(zzdmr zzdmr) throws zzdok;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract P mo25931e(KeyProto keyproto) throws GeneralSecurityException;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract KeyProto mo25932f(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    /* renamed from: a */
    public final zzdpk mo28903a(zzdpk zzdpk) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.f21324c.getName());
        m23256a(zzdpk, valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type "), this.f21324c);
        return m23258h(zzdpk);
    }

    /* renamed from: b */
    public final zzdpk mo28905b(zzdmr zzdmr) throws GeneralSecurityException {
        try {
            return m23258h(mo25930e(zzdmr));
        } catch (zzdok e) {
            String valueOf = String.valueOf(this.f21324c.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: a */
    public final zzdgr mo28902a(zzdmr zzdmr) throws GeneralSecurityException {
        try {
            zzdpk h = m23258h(mo25930e(zzdmr));
            zzdgr.zza m = zzdgr.m23541m();
            m.mo29001a(this.f21325d);
            m.mo29000a(h.mo29064e());
            m.mo28999a(mo25926c());
            return (zzdgr) ((zzdob) m.mo29143t());
        } catch (zzdok e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: b */
    public final String mo28907b() {
        return this.f21325d;
    }

    /* renamed from: a */
    public final Class<P> mo28904a() {
        return this.f21322a;
    }
}
