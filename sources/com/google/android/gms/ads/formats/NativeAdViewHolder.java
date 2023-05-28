package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzyt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzbql = new WeakHashMap<>();
    private zzaer zzbqk;
    private WeakReference<View> zzbqm;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.m16038a(view, (Object) "ContainerView must not be null");
        if ((view instanceof NativeAdView) || (view instanceof UnifiedNativeAdView)) {
            zzbad.m20519b("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zzbql.get(view) != null) {
            zzbad.m20519b("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zzbql.put(view, this);
            this.zzbqm = new WeakReference<>(view);
            this.zzbqk = zzyt.m25667b().mo29917a(view, zzb(map), zzb(map2));
        }
    }

    private static HashMap<String, View> zzb(Map<String, View> map) {
        if (map == null) {
            return new HashMap<>();
        }
        return new HashMap<>(map);
    }

    private final void zze(IObjectWrapper iObjectWrapper) {
        WeakReference<View> weakReference = this.zzbqm;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzbad.m20523d("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzbql.containsKey(view)) {
            zzbql.put(view, this);
        }
        zzaer zzaer = this.zzbqk;
        if (zzaer != null) {
            try {
                zzaer.mo27108c(iObjectWrapper);
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbqk.mo27109d(ObjectWrapper.m16391a(view));
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setNativeAd(NativeAd nativeAd) {
        zze((IObjectWrapper) nativeAd.zzkq());
    }

    public final void unregisterNativeAd() {
        zzaer zzaer = this.zzbqk;
        if (zzaer != null) {
            try {
                zzaer.mo27107T0();
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference<View> weakReference = this.zzbqm;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zzbql.remove(view);
        }
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        zze((IObjectWrapper) unifiedNativeAd.zzkq());
    }
}
