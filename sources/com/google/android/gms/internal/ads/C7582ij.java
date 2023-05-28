package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ij */
final class C7582ij {

    /* renamed from: a */
    private static boolean f15666a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MessageDigest f15667b;

    /* renamed from: c */
    private static final Object f15668c = new Object();

    /* renamed from: d */
    private static final Object f15669d = new Object();

    /* renamed from: e */
    static CountDownLatch f15670e = new CountDownLatch(1);

    /* renamed from: a */
    static void m17183a() {
        synchronized (f15669d) {
            if (!f15666a) {
                f15666a = true;
                new Thread(new C7436ek()).start();
            }
        }
    }

    /* renamed from: b */
    private static MessageDigest m17186b() {
        boolean z;
        MessageDigest messageDigest;
        m17183a();
        try {
            z = f15670e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f15667b) != null) {
            return messageDigest;
        }
        return null;
    }

    /* renamed from: a */
    static String m17180a(zzbp.zza zza, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] g = zza.mo29065g();
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17967t1)).booleanValue()) {
            Vector<byte[]> a = m17182a(g, 255);
            if (a == null || a.size() == 0) {
                bArr = m17185a(m17179a(zzbp.zza.zzd.PSN_ENCODE_SIZE_FAIL).mo29065g(), str, true);
            } else {
                zzbp.zzg.zza j = zzbp.zzg.m21738j();
                Iterator<byte[]> it = a.iterator();
                while (it.hasNext()) {
                    j.mo28382a(zzdmr.m23767b(m17185a(it.next(), str, false)));
                }
                j.mo28383b(zzdmr.m23767b(m17184a(g)));
                bArr = ((zzbp.zzg) ((zzdob) j.mo29143t())).mo29065g();
            }
        } else if (C7971sy.f16870a != null) {
            byte[] a2 = C7971sy.f16870a.mo26525a(g, str != null ? str.getBytes() : new byte[0]);
            zzbp.zzg.zza j2 = zzbp.zzg.m21738j();
            j2.mo28382a(zzdmr.m23767b(a2));
            j2.mo28381a(zzbw.TINK_HYBRID);
            bArr = ((zzbp.zzg) ((zzdob) j2.mo29143t())).mo29065g();
        } else {
            throw new GeneralSecurityException();
        }
        return zzcg.m22509a(bArr, true);
    }

    /* renamed from: a */
    private static Vector<byte[]> m17182a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    private static zzbp.zza m17179a(zzbp.zza.zzd zzd) {
        zzbp.zza.C12966zza p = zzbp.zza.m21530p();
        p.mo28328j((long) zzd.mo28259c());
        return (zzbp.zza) ((zzdob) p.mo29143t());
    }

    /* renamed from: a */
    private static byte[] m17185a(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = m17179a(zzbp.zza.zzd.PSN_ENCODE_SIZE_FAIL).mo29065g();
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(m17184a(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        for (C7847pl a : new zzcl().f20401N2) {
            a.mo25738a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzdmh(str.getBytes("UTF-8")).mo29061a(bArr4);
        }
        return bArr4;
    }

    /* renamed from: a */
    public static byte[] m17184a(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f15668c) {
            MessageDigest b = m17186b();
            if (b != null) {
                b.reset();
                b.update(bArr);
                digest = f15667b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }
}
