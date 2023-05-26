package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.WeakHashMap;

@zzard
public final class zzafh implements NativeCustomTemplateAd {

    /* renamed from: d */
    private static WeakHashMap<IBinder, zzafh> f18069d = new WeakHashMap<>();

    /* renamed from: a */
    private final zzafe f18070a;

    /* renamed from: b */
    private final MediaView f18071b;

    /* renamed from: c */
    private final VideoController f18072c = new VideoController();

    @VisibleForTesting
    private zzafh(zzafe zzafe) {
        Context context;
        this.f18070a = zzafe;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.m16390H(zzafe.mo27249L0());
        } catch (RemoteException | NullPointerException e) {
            zzbad.m20520b("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f18070a.mo27258r(ObjectWrapper.m16391a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzbad.m20520b("", e2);
            }
        }
        this.f18071b = mediaView;
    }

    /* renamed from: a */
    public static zzafh m19139a(zzafe zzafe) {
        synchronized (f18069d) {
            zzafh zzafh = f18069d.get(zzafe.asBinder());
            if (zzafh != null) {
                return zzafh;
            }
            zzafh zzafh2 = new zzafh(zzafe);
            f18069d.put(zzafe.asBinder(), zzafh2);
            return zzafh2;
        }
    }

    public final void destroy() {
        try {
            this.f18070a.destroy();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f18070a.getAvailableAssetNames();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f18070a.getCustomTemplateId();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzaei e = this.f18070a.mo27252e(str);
            if (e != null) {
                return new zzael(e);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m20520b("", e2);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.f18070a.mo27250c(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzaar videoController = this.f18070a.getVideoController();
            if (videoController != null) {
                this.f18072c.zza(videoController);
            }
        } catch (RemoteException e) {
            zzbad.m20520b("Exception occurred while getting video controller", e);
        }
        return this.f18072c;
    }

    public final MediaView getVideoMediaView() {
        return this.f18071b;
    }

    public final void performClick(String str) {
        try {
            this.f18070a.performClick(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f18070a.recordImpression();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    /* renamed from: a */
    public final zzafe mo27260a() {
        return this.f18070a;
    }
}
