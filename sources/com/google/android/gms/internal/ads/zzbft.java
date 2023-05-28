package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;

@zzard
public abstract class zzbft implements Releasable {

    /* renamed from: f */
    protected Context f18929f;

    /* renamed from: g */
    protected String f18930g;

    /* renamed from: h */
    protected WeakReference<zzbdf> f18931h;

    public zzbft(zzbdf zzbdf) {
        this.f18929f = zzbdf.getContext();
        this.f18930g = zzk.zzlg().mo27794a(this.f18929f, zzbdf.mo25672b().f18742f);
        this.f18931h = new WeakReference<>(zzbdf);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String mo28093c(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1947652542: goto L_0x007d;
                case -1396664534: goto L_0x0072;
                case -1347010958: goto L_0x0068;
                case -918817863: goto L_0x005d;
                case -659376217: goto L_0x0053;
                case -642208130: goto L_0x0049;
                case -354048396: goto L_0x003e;
                case -32082395: goto L_0x0033;
                case 3387234: goto L_0x0029;
                case 96784904: goto L_0x001f;
                case 580119100: goto L_0x0014;
                case 725497484: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0087
        L_0x0009:
            java.lang.String r0 = "noCacheDir"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 7
            goto L_0x0088
        L_0x0014:
            java.lang.String r0 = "expireFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 6
            goto L_0x0088
        L_0x001f:
            java.lang.String r0 = "error"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0029:
            java.lang.String r0 = "noop"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 4
            goto L_0x0088
        L_0x0033:
            java.lang.String r0 = "externalAbort"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 10
            goto L_0x0088
        L_0x003e:
            java.lang.String r0 = "sizeExceeded"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 11
            goto L_0x0088
        L_0x0049:
            java.lang.String r0 = "playerFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 5
            goto L_0x0088
        L_0x0053:
            java.lang.String r0 = "contentLengthMissing"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 0
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "downloadTimeout"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 9
            goto L_0x0088
        L_0x0068:
            java.lang.String r0 = "inProgress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 2
            goto L_0x0088
        L_0x0072:
            java.lang.String r0 = "badUrl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 8
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "interrupted"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 3
            goto L_0x0088
        L_0x0087:
            r1 = -1
        L_0x0088:
            java.lang.String r0 = "internal"
            switch(r1) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0096;
                case 2: goto L_0x0096;
                case 3: goto L_0x0096;
                case 4: goto L_0x0096;
                case 5: goto L_0x0096;
                case 6: goto L_0x0094;
                case 7: goto L_0x0094;
                case 8: goto L_0x0091;
                case 9: goto L_0x0091;
                case 10: goto L_0x008e;
                case 11: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0096
        L_0x008e:
            java.lang.String r0 = "policy"
            goto L_0x0096
        L_0x0091:
            java.lang.String r0 = "network"
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = "io"
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbft.mo28093c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public void mo24917a() {
    }

    /* renamed from: a */
    public abstract boolean mo28077a(String str);

    /* renamed from: a */
    public boolean mo28078a(String str, String[] strArr) {
        return mo28077a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28079b(String str) {
        zzyt.m25666a();
        return zzazt.m20468a(str);
    }

    /* renamed from: b */
    public abstract void mo28080b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28081b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo28082c(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo28083d(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28084e(int i) {
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo28072a(String str, String str2, int i, int i2, boolean z, int i3, int i4) {
        zzazt.f18727b.post(new C7278aa(this, str, str2, i, 0, z, i3, i4));
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo28074a(String str, String str2, long j, long j2, boolean z) {
        zzazt.f18727b.post(new C7315ba(this, str, str2, j, j2, z));
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo28075a(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        zzazt.f18727b.post(new C7352ca(this, str, str2, j, j2, z, i, i2));
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo28071a(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzazt.f18727b.post(new C7389da(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28070a(String str, String str2, int i) {
        zzazt.f18727b.post(new C7426ea(this, str, str2, i));
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo28073a(String str, String str2, long j) {
        zzazt.f18727b.post(new C7463fa(this, str, str2, j));
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo28076a(String str, String str2, String str3, String str4) {
        zzazt.f18727b.post(new C7499ga(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20819a(String str, Map<String, String> map) {
        zzbdf zzbdf = (zzbdf) this.f18931h.get();
        if (zzbdf != null) {
            zzbdf.mo25665a(str, (Map<String, ?>) map);
        }
    }
}
