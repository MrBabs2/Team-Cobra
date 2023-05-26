package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdky;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class zzdkx<T_WRAPPER extends zzdky<T_ENGINE>, T_ENGINE> {

    /* renamed from: d */
    private static final Logger f21462d = Logger.getLogger(zzdkx.class.getName());

    /* renamed from: e */
    private static final List<Provider> f21463e;

    /* renamed from: f */
    public static final zzdkx<zzdkz, Cipher> f21464f = new zzdkx<>(new zzdkz());

    /* renamed from: g */
    public static final zzdkx<zzdld, Mac> f21465g = new zzdkx<>(new zzdld());

    /* renamed from: h */
    public static final zzdkx<zzdla, KeyAgreement> f21466h = new zzdkx<>(new zzdla());

    /* renamed from: i */
    public static final zzdkx<zzdlc, KeyPairGenerator> f21467i = new zzdkx<>(new zzdlc());

    /* renamed from: j */
    public static final zzdkx<zzdlb, KeyFactory> f21468j = new zzdkx<>(new zzdlb());

    /* renamed from: a */
    private T_WRAPPER f21469a;

    /* renamed from: b */
    private List<Provider> f21470b = f21463e;

    /* renamed from: c */
    private boolean f21471c = true;

    static {
        if (zzdlv.m23740a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f21462d.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f21463e = arrayList;
        } else {
            f21463e = new ArrayList();
        }
        new zzdkx(new zzdlf());
        new zzdkx(new zzdle());
    }

    private zzdkx(T_WRAPPER t_wrapper) {
        this.f21469a = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE mo29057a(String str) throws GeneralSecurityException {
        for (Provider next : this.f21470b) {
            if (m23721a(str, next)) {
                return this.f21469a.mo29058a(str, next);
            }
        }
        if (this.f21471c) {
            return this.f21469a.mo29058a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }

    /* renamed from: a */
    private final boolean m23721a(String str, Provider provider) {
        try {
            this.f21469a.mo29058a(str, provider);
            return true;
        } catch (Exception e) {
            zzdmb.m23745a(e);
            return false;
        }
    }
}
