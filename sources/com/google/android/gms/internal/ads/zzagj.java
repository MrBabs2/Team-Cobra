package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzard
public final class zzagj extends UnifiedNativeAd {

    /* renamed from: a */
    private final zzagg f18079a;

    /* renamed from: b */
    private final List<NativeAd.Image> f18080b = new ArrayList();

    /* renamed from: c */
    private final zzael f18081c;

    /* renamed from: d */
    private final VideoController f18082d = new VideoController();

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f18083e;

    /* renamed from: f */
    private final List<MuteThisAdReason> f18084f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae A[Catch:{ RemoteException -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9 A[Catch:{ RemoteException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzagj(com.google.android.gms.internal.ads.zzagg r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f18080b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f18082d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f18084f = r1
            r5.f18079a = r6
            r1 = 0
            java.util.List r6 = r6.mo27288f()     // Catch:{ RemoteException -> 0x005a }
            if (r6 == 0) goto L_0x005e
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005a }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005a }
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005a }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005a }
            if (r3 == 0) goto L_0x004c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005a }
            if (r2 == 0) goto L_0x004c
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005a }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzaei     // Catch:{ RemoteException -> 0x005a }
            if (r4 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzaei r3 = (com.google.android.gms.internal.ads.zzaei) r3     // Catch:{ RemoteException -> 0x005a }
            goto L_0x004d
        L_0x0046:
            com.google.android.gms.internal.ads.zzaek r3 = new com.google.android.gms.internal.ads.zzaek     // Catch:{ RemoteException -> 0x005a }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005a }
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            if (r3 == 0) goto L_0x0027
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f18080b     // Catch:{ RemoteException -> 0x005a }
            com.google.android.gms.internal.ads.zzael r4 = new com.google.android.gms.internal.ads.zzael     // Catch:{ RemoteException -> 0x005a }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005a }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005a }
            goto L_0x0027
        L_0x005a:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x005e:
            com.google.android.gms.internal.ads.zzagg r6 = r5.f18079a     // Catch:{ RemoteException -> 0x008d }
            java.util.List r6 = r6.mo27273E0()     // Catch:{ RemoteException -> 0x008d }
            if (r6 == 0) goto L_0x0091
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008d }
        L_0x006a:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008d }
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008d }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008d }
            if (r3 == 0) goto L_0x007f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008d }
            com.google.android.gms.internal.ads.zzaak r2 = com.google.android.gms.internal.ads.zzaal.m18710a(r2)     // Catch:{ RemoteException -> 0x008d }
            goto L_0x0080
        L_0x007f:
            r2 = r1
        L_0x0080:
            if (r2 == 0) goto L_0x006a
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.f18084f     // Catch:{ RemoteException -> 0x008d }
            com.google.android.gms.internal.ads.zzaan r4 = new com.google.android.gms.internal.ads.zzaan     // Catch:{ RemoteException -> 0x008d }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008d }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008d }
            goto L_0x006a
        L_0x008d:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x0091:
            com.google.android.gms.internal.ads.zzagg r6 = r5.f18079a     // Catch:{ RemoteException -> 0x009f }
            com.google.android.gms.internal.ads.zzaei r6 = r6.mo27293h()     // Catch:{ RemoteException -> 0x009f }
            if (r6 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.zzael r2 = new com.google.android.gms.internal.ads.zzael     // Catch:{ RemoteException -> 0x009f }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x009f }
            goto L_0x00a4
        L_0x009f:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x00a3:
            r2 = r1
        L_0x00a4:
            r5.f18081c = r2
            com.google.android.gms.internal.ads.zzagg r6 = r5.f18079a     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.zzaea r6 = r6.mo27274a()     // Catch:{ RemoteException -> 0x00bb }
            if (r6 == 0) goto L_0x00bf
            com.google.android.gms.internal.ads.zzaed r6 = new com.google.android.gms.internal.ads.zzaed     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.zzagg r2 = r5.f18079a     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.zzaea r2 = r2.mo27274a()     // Catch:{ RemoteException -> 0x00bb }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00bb }
            r1 = r6
            goto L_0x00bf
        L_0x00bb:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x00bf:
            r5.f18083e = r1
            com.google.android.gms.internal.ads.zzagg r6 = r5.f18079a     // Catch:{ RemoteException -> 0x00d5 }
            com.google.android.gms.internal.ads.zzaee r6 = r6.mo27284d0()     // Catch:{ RemoteException -> 0x00d5 }
            if (r6 == 0) goto L_0x00d9
            com.google.android.gms.internal.ads.zzaeh r6 = new com.google.android.gms.internal.ads.zzaeh     // Catch:{ RemoteException -> 0x00d5 }
            com.google.android.gms.internal.ads.zzagg r1 = r5.f18079a     // Catch:{ RemoteException -> 0x00d5 }
            com.google.android.gms.internal.ads.zzaee r1 = r1.mo27284d0()     // Catch:{ RemoteException -> 0x00d5 }
            r6.<init>(r1)     // Catch:{ RemoteException -> 0x00d5 }
            goto L_0x00d9
        L_0x00d5:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r6)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.<init>(com.google.android.gms.internal.ads.zzagg):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final IObjectWrapper zzkq() {
        try {
            return this.f18079a.mo27296j();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.f18079a.mo27299u();
        } catch (RemoteException e) {
            zzbad.m20520b("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final void destroy() {
        try {
            this.f18079a.destroy();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.f18079a.mo27300w();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f18083e;
    }

    public final String getAdvertiser() {
        try {
            return this.f18079a.mo27298l();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.f18079a.mo27283d();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.f18079a.mo27281c();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle extras = this.f18079a.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            return this.f18079a.mo27279b();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.f18081c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.f18080b;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.f18079a.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f18084f;
    }

    public final String getPrice() {
        try {
            return this.f18079a.mo27295i();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double k = this.f18079a.mo27297k();
            if (k == -1.0d) {
                return null;
            }
            return Double.valueOf(k);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.f18079a.getStore();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f18079a.getVideoController() != null) {
                this.f18082d.zza(this.f18079a.getVideoController());
            }
        } catch (RemoteException e) {
            zzbad.m20520b("Exception occurred while getting video controller", e);
        }
        return this.f18082d;
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f18079a.mo27287e0();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return false;
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzbad.m20519b("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.f18079a.mo27277a((zzaak) null);
            } else if (muteThisAdReason instanceof zzaan) {
                this.f18079a.mo27277a(((zzaan) muteThisAdReason).mo26926a());
            } else {
                zzbad.m20519b("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f18079a.mo27275a(bundle);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.f18079a.mo27294h1();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f18079a.mo27280b(bundle);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f18079a.mo27282c(bundle);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f18079a.mo27276a((zzaag) new zzaaj(muteThisAdListener));
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f18079a.mo27278a((zzagd) new zzagt(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzbad.m20520b("Failed to setUnconfirmedClickListener", e);
        }
    }

    public final Object zzkv() {
        try {
            IObjectWrapper e = this.f18079a.mo27286e();
            if (e != null) {
                return ObjectWrapper.m16390H(e);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m20520b("", e2);
            return null;
        }
    }
}
