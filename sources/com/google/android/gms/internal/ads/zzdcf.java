package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdha;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzdcf {

    /* renamed from: a */
    private static final Logger f21335a = Logger.getLogger(zzdcf.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, zzdbs> f21336b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f21337c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, zzdbk> f21338d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<Class<?>, zzdcc<?>> f21339e = new ConcurrentHashMap();

    /* renamed from: a */
    public static synchronized void m23304a(String str, zzdbk<?> zzdbk) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            if (!f21338d.containsKey(str.toLowerCase()) || zzdbk.getClass().equals(((zzdbk) f21338d.get(str.toLowerCase())).getClass())) {
                f21338d.put(str.toLowerCase(), zzdbk);
            } else {
                Logger logger = f21335a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    /* renamed from: b */
    public static synchronized zzdpk m23305b(zzdgw zzdgw) throws GeneralSecurityException {
        zzdpk b;
        synchronized (zzdcf.class) {
            zzdbs a = m23292a(zzdgw.mo29002j(), (Class) null);
            if (((Boolean) f21337c.get(zzdgw.mo29002j())).booleanValue()) {
                b = a.mo28905b(zzdgw.mo29003k());
            } else {
                String valueOf = String.valueOf(zzdgw.mo29002j());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return b;
    }

    /* renamed from: a */
    public static zzdbk<?> m23291a(String str) throws GeneralSecurityException {
        if (str != null) {
            zzdbk<?> zzdbk = (zzdbk) f21338d.get(str.toLowerCase());
            if (zzdbk != null) {
                return zzdbk;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: a */
    private static <T> T m23297a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static synchronized <P> void m23301a(zzdbs<P> zzdbs) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            m23302a(zzdbs, true);
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m23302a(zzdbs<P> zzdbs, boolean z) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            if (zzdbs != null) {
                String b = zzdbs.mo28907b();
                if (f21336b.containsKey(b)) {
                    zzdbs a = m23292a(b, (Class) null);
                    boolean booleanValue = ((Boolean) f21337c.get(b)).booleanValue();
                    if (!zzdbs.getClass().equals(a.getClass()) || (!booleanValue && z)) {
                        Logger logger = f21335a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(b);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{b, a.getClass().getName(), zzdbs.getClass().getName()}));
                    }
                }
                f21336b.put(b, zzdbs);
                f21337c.put(b, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized <P> void m23303a(zzdcc<P> zzdcc) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            if (zzdcc != null) {
                Class<P> a = zzdcc.mo28921a();
                if (f21339e.containsKey(a)) {
                    zzdcc zzdcc2 = (zzdcc) f21339e.get(a);
                    if (!zzdcc.getClass().equals(zzdcc2.getClass())) {
                        Logger logger = f21335a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(a.toString());
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{a.getName(), zzdcc2.getClass().getName(), zzdcc.getClass().getName()}));
                    }
                }
                f21339e.put(a, zzdcc);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: a */
    private static <P> zzdbs<P> m23292a(String str, Class<P> cls) throws GeneralSecurityException {
        zzdbs<P> zzdbs = (zzdbs) f21336b.get(str);
        if (zzdbs == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("No key manager found for key type: ");
            sb.append(str);
            sb.append(".  Check the configuration of the registry.");
            throw new GeneralSecurityException(sb.toString());
        } else if (cls == null || zzdbs.mo28904a().equals(cls)) {
            return zzdbs;
        } else {
            String name = zzdbs.mo28904a().getName();
            String name2 = cls.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 80 + String.valueOf(str).length() + String.valueOf(name2).length());
            sb2.append("Primitive type ");
            sb2.append(name);
            sb2.append(" of keymanager for type ");
            sb2.append(str);
            sb2.append(" does not match requested primitive type ");
            sb2.append(name2);
            throw new GeneralSecurityException(sb2.toString());
        }
    }

    /* renamed from: a */
    public static synchronized zzdgr m23294a(zzdgw zzdgw) throws GeneralSecurityException {
        zzdgr a;
        synchronized (zzdcf.class) {
            zzdbs a2 = m23292a(zzdgw.mo29002j(), (Class) null);
            if (((Boolean) f21337c.get(zzdgw.mo29002j())).booleanValue()) {
                a = a2.mo28902a(zzdgw.mo29003k());
            } else {
                String valueOf = String.valueOf(zzdgw.mo29002j());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized zzdpk m23295a(String str, zzdpk zzdpk) throws GeneralSecurityException {
        zzdpk a;
        synchronized (zzdcf.class) {
            zzdbs a2 = m23292a(str, (Class) null);
            if (((Boolean) f21337c.get(str)).booleanValue()) {
                a = a2.mo28903a(zzdpk);
            } else {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a;
    }

    /* renamed from: a */
    public static <P> P m23299a(String str, zzdpk zzdpk, Class<P> cls) throws GeneralSecurityException {
        m23297a(cls);
        return m23292a(str, cls).mo28906b(zzdpk);
    }

    /* renamed from: a */
    private static <P> P m23298a(String str, zzdmr zzdmr, Class<P> cls) throws GeneralSecurityException {
        return m23292a(str, cls).mo28908c(zzdmr);
    }

    /* renamed from: a */
    public static <P> P m23300a(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        zzdmr b = zzdmr.m23767b(bArr);
        m23297a(cls);
        return m23298a(str, b, cls);
    }

    /* renamed from: a */
    public static <P> zzdca<P> m23293a(zzdbu zzdbu, zzdbs<P> zzdbs, Class<P> cls) throws GeneralSecurityException {
        m23297a(cls);
        Class cls2 = cls;
        C7369cr.m16743b(zzdbu.mo28909a());
        zzdca<P> a = zzdca.m23281a(cls2);
        for (zzdha.zzb next : zzdbu.mo28909a().mo29020k()) {
            if (next.mo29025m() == zzdgu.ENABLED) {
                zzdcb<P> a2 = a.mo28914a(m23298a(next.mo29024l().mo28996j(), next.mo29024l().mo28997k(), cls2), next);
                if (next.mo29026n() == zzdbu.mo28909a().mo29019j()) {
                    a.mo28916a(a2);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static <P> P m23296a(zzdca<P> zzdca) throws GeneralSecurityException {
        zzdcc zzdcc = (zzdcc) f21339e.get(zzdca.mo28915a());
        if (zzdcc != null) {
            return zzdcc.mo28922a(zzdca);
        }
        String valueOf = String.valueOf(zzdca.mo28915a().getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
    }
}
