package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzaug {

    /* renamed from: a */
    private final zzatt f18520a;

    /* renamed from: b */
    private final Context f18521b;

    public zzaug(Context context, String str) {
        this.f18521b = context.getApplicationContext();
        this.f18520a = zzyt.m25667b().mo29920b(context, str, new zzamo());
    }

    /* renamed from: a */
    public final void mo27661a(zzaaz zzaaz, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            this.f18520a.mo27115a(zzyc.m25642a(this.f18521b, zzaaz), (zzaub) new zzaul(rewardedAdLoadCallback));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final String mo27662b() {
        try {
            return this.f18520a.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return "";
        }
    }

    /* renamed from: c */
    public final RewardItem mo27663c() {
        try {
            zzatq k1 = this.f18520a.mo27119k1();
            if (k1 == null) {
                return null;
            }
            return new zzauh(k1);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: d */
    public final boolean mo27664d() {
        try {
            return this.f18520a.isLoaded();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo27660a(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.f18520a.mo27114a(new zzaum(serverSideVerificationOptions));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27659a(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f18520a.mo27111a((zzaao) new zzabz(onAdMetadataChangedListener));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final Bundle mo27656a() {
        try {
            return this.f18520a.getAdMetadata();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return new Bundle();
        }
    }

    /* renamed from: a */
    public final void mo27657a(Activity activity, RewardedAdCallback rewardedAdCallback) {
        try {
            this.f18520a.mo27112a((zzatw) new zzaui(rewardedAdCallback));
            this.f18520a.mo27120y(ObjectWrapper.m16391a(activity));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27658a(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        try {
            this.f18520a.mo27112a((zzatw) new zzaui(rewardedAdCallback));
            this.f18520a.mo27110a(ObjectWrapper.m16391a(activity), z);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
