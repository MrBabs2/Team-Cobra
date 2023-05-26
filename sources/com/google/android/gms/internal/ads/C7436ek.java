package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.ek */
final class C7436ek implements Runnable {
    private C7436ek() {
    }

    public final void run() {
        try {
            MessageDigest unused = C7582ij.f15667b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } finally {
            C7582ij.f15670e.countDown();
        }
    }
}
