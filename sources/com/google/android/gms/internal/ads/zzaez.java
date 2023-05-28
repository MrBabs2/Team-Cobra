package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzard
public final class zzaez extends NativeAppInstallAd {

    /* renamed from: a */
    private final zzaew f18059a;

    /* renamed from: b */
    private final List<NativeAd.Image> f18060b = new ArrayList();

    /* renamed from: c */
    private final zzael f18061c;

    /* renamed from: d */
    private final VideoController f18062d = new VideoController();

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f18063e;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074 A[Catch:{ RemoteException -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzaez(com.google.android.gms.internal.ads.zzaew r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f18060b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f18062d = r1
            r5.f18059a = r6
            r1 = 0
            java.util.List r6 = r6.mo27223f()     // Catch:{ RemoteException -> 0x0053 }
            if (r6 == 0) goto L_0x0057
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0053 }
        L_0x0020:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0053 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0053 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0053 }
            if (r3 == 0) goto L_0x0045
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0053 }
            if (r2 == 0) goto L_0x0045
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x0053 }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzaei     // Catch:{ RemoteException -> 0x0053 }
            if (r4 == 0) goto L_0x003f
            com.google.android.gms.internal.ads.zzaei r3 = (com.google.android.gms.internal.ads.zzaei) r3     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0046
        L_0x003f:
            com.google.android.gms.internal.ads.zzaek r3 = new com.google.android.gms.internal.ads.zzaek     // Catch:{ RemoteException -> 0x0053 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0046
        L_0x0045:
            r3 = r1
        L_0x0046:
            if (r3 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f18060b     // Catch:{ RemoteException -> 0x0053 }
            com.google.android.gms.internal.ads.zzael r4 = new com.google.android.gms.internal.ads.zzael     // Catch:{ RemoteException -> 0x0053 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x0053 }
            r2.add(r4)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0020
        L_0x0053:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x0057:
            com.google.android.gms.internal.ads.zzaew r6 = r5.f18059a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.internal.ads.zzaei r6 = r6.mo27228h()     // Catch:{ RemoteException -> 0x0065 }
            if (r6 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzael r2 = new com.google.android.gms.internal.ads.zzael     // Catch:{ RemoteException -> 0x0065 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x0069:
            r2 = r1
        L_0x006a:
            r5.f18061c = r2
            com.google.android.gms.internal.ads.zzaew r6 = r5.f18059a     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.internal.ads.zzaea r6 = r6.mo27214a()     // Catch:{ RemoteException -> 0x0081 }
            if (r6 == 0) goto L_0x0085
            com.google.android.gms.internal.ads.zzaed r6 = new com.google.android.gms.internal.ads.zzaed     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.internal.ads.zzaew r2 = r5.f18059a     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.internal.ads.zzaea r2 = r2.mo27214a()     // Catch:{ RemoteException -> 0x0081 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x0081 }
            r1 = r6
            goto L_0x0085
        L_0x0081:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x0085:
            r5.f18063e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaez.<init>(com.google.android.gms.internal.ads.zzaew):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final IObjectWrapper zzkq() {
        try {
            return this.f18059a.mo27230j();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f18059a.destroy();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f18063e;
    }

    public final CharSequence getBody() {
        try {
            return this.f18059a.mo27220d();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f18059a.mo27218c();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.f18059a.getExtras();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f18059a.mo27216b();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.f18061c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f18060b;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.f18059a.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final CharSequence getPrice() {
        try {
            return this.f18059a.mo27229i();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double k = this.f18059a.mo27231k();
            if (k == -1.0d) {
                return null;
            }
            return Double.valueOf(k);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final CharSequence getStore() {
        try {
            return this.f18059a.getStore();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f18059a.getVideoController() != null) {
                this.f18062d.zza(this.f18059a.getVideoController());
            }
        } catch (RemoteException e) {
            zzbad.m20520b("Exception occurred while getting video controller", e);
        }
        return this.f18062d;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f18059a.mo27215a(bundle);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f18059a.mo27217b(bundle);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f18059a.mo27219c(bundle);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
