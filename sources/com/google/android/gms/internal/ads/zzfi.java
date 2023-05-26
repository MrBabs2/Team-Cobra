package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class zzfi {

    /* renamed from: a */
    private final zzdy f21846a;

    /* renamed from: b */
    private final String f21847b;

    /* renamed from: c */
    private final String f21848c;

    /* renamed from: d */
    private volatile Method f21849d = null;

    /* renamed from: e */
    private final Class<?>[] f21850e;

    /* renamed from: f */
    private CountDownLatch f21851f = new CountDownLatch(1);

    public zzfi(zzdy zzdy, String str, String str2, Class<?>... clsArr) {
        this.f21846a = zzdy;
        this.f21847b = str;
        this.f21848c = str2;
        this.f21850e = clsArr;
        zzdy.mo29244d().submit(new C8156xy(this));
    }

    /* renamed from: a */
    private final String m24330a(byte[] bArr, String str) throws zzdk, UnsupportedEncodingException {
        return new String(this.f21846a.mo29246f().mo29053a(bArr, str), "UTF-8");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m24332b() {
        try {
            Class loadClass = this.f21846a.mo29245e().loadClass(m24330a(this.f21846a.mo29247g(), this.f21847b));
            if (loadClass != null) {
                this.f21849d = loadClass.getMethod(m24330a(this.f21846a.mo29247g(), this.f21848c), this.f21850e);
                if (this.f21849d == null) {
                    this.f21851f.countDown();
                } else {
                    this.f21851f.countDown();
                }
            }
        } catch (zzdk unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.f21851f.countDown();
        }
    }

    /* renamed from: a */
    public final Method mo29275a() {
        if (this.f21849d != null) {
            return this.f21849d;
        }
        try {
            if (!this.f21851f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f21849d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
