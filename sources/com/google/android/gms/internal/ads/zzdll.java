package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class zzdll implements zzdby {

    /* renamed from: a */
    private Mac f21479a;

    /* renamed from: b */
    private final int f21480b;

    /* renamed from: c */
    private final String f21481c;

    /* renamed from: d */
    private final Key f21482d;

    public zzdll(String str, Key key, int i) throws GeneralSecurityException {
        if (i >= 10) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        String valueOf = String.valueOf(str);
                        throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
            this.f21481c = str;
            this.f21480b = i;
            this.f21482d = key;
            Mac a = zzdkx.f21465g.mo29057a(str);
            this.f21479a = a;
            a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo28913a(byte[] bArr) throws GeneralSecurityException {
        Mac mac;
        try {
            mac = (Mac) this.f21479a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = zzdkx.f21465g.mo29057a(this.f21481c);
            mac.init(this.f21482d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f21480b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f21480b);
        return bArr2;
    }
}
