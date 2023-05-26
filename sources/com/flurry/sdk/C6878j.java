package com.flurry.sdk;

import android.os.Build;
import android.text.TextUtils;
import com.flurry.sdk.C6756b7;
import com.flurry.sdk.C6856i;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.flurry.sdk.j */
public final class C6878j {

    /* renamed from: a */
    private C6895k f12864a = null;

    /* renamed from: b */
    byte[] f12865b = null;

    /* renamed from: c */
    private final C6756b7<byte[]> f12866c = new C6756b7<>(new C7003r1());

    /* renamed from: d */
    private C6777c7<C6856i> f12867d = null;

    /* renamed from: com.flurry.sdk.j$a */
    class C6879a implements C7089y1<C6856i> {
        C6879a(C6878j jVar) {
        }

        /* renamed from: a */
        public final C7048v1<C6856i> mo23619a(int i) {
            return new C6856i.C6857a();
        }
    }

    C6878j() {
    }

    /* renamed from: c */
    private static File m14615c() {
        return new File(C6749b2.m14392b().getPath() + File.separator + "installationNum");
    }

    /* renamed from: d */
    private static SecretKey m14616d() {
        C6896k0 c = C6896k0.m14646c();
        C6792d1.m14476a(3, "APIKeyProvider", "Getting legacy apikey: " + c.f12902b);
        String str = c.f12902b;
        if (str == null) {
            return null;
        }
        long j = Long.MIN_VALUE;
        String a = C6737a2.m14372a(C6747b0.m14386a());
        if (!TextUtils.isEmpty(a)) {
            j = C6766c2.m14424d(a);
        }
        try {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithSHA256And256BitAES-CBC-BC").generateSecret(new PBEKeySpec(str.toCharArray(), ByteBuffer.allocate(8).putLong(j).array(), 1000, 256)).getEncoded(), "AES");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            C6792d1.m14477a(4, "InstallationIdProvider", "Error in generate secret key", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo23615a() {
        if (this.f12867d == null) {
            this.f12867d = new C6777c7<>(m14615c(), "installationNum", 1, new C6879a(this));
            byte[] a = mo23617a(mo23618b());
            if (a != null && Build.VERSION.SDK_INT >= 23) {
                C6749b2.m14393b(m14615c());
                mo23616a(a, C6756b7.C6757a.CRYPTO_ALGO_PADDING_7);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Key mo23618b() {
        if (Build.VERSION.SDK_INT < 23) {
            return m14616d();
        }
        if (this.f12864a == null) {
            this.f12864a = new C6895k();
        }
        return this.f12864a.mo23629a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo23616a(byte[] bArr, C6756b7.C6757a aVar) {
        C6856i iVar;
        try {
            C6749b2.m14393b(m14615c());
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            byte[] a = this.f12866c.mo23545a(bArr, mo23618b(), new IvParameterSpec(bArr2), aVar);
            if (a != null) {
                iVar = new C6856i(a, bArr2, true, aVar.ordinal());
            } else {
                iVar = new C6856i(bArr, new byte[0], false, aVar.ordinal());
            }
            this.f12867d.mo23568a(iVar);
            return true;
        } catch (IOException e) {
            C6792d1.m14477a(5, "InstallationIdProvider", "Error while generating UUID" + e.getMessage(), e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo23617a(Key key) {
        try {
            C6856i a = this.f12867d.mo23567a();
            if (a == null) {
                return null;
            }
            if (!a.f12827a) {
                return a.f12829c;
            }
            byte[] bArr = a.f12828b;
            byte[] bArr2 = a.f12829c;
            C6756b7.C6757a a2 = C6756b7.C6757a.m14405a(a.f12830d);
            if (bArr == null || bArr2 == null) {
                return null;
            }
            return this.f12866c.mo23544a(bArr2, key, new IvParameterSpec(bArr), a2);
        } catch (IOException unused) {
            C6792d1.m14476a(5, "InstallationIdProvider", "Error while reading Android Install Id. Deleting file.");
            return null;
        }
    }
}
