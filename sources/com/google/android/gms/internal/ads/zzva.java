package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@zzard
public abstract class zzva {

    /* renamed from: b */
    private static MessageDigest f22832b;

    /* renamed from: a */
    protected Object f22833a = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo29832a() {
        synchronized (this.f22833a) {
            if (f22832b != null) {
                MessageDigest messageDigest = f22832b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f22832b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f22832b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract byte[] mo29833a(String str);
}
