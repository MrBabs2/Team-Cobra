package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzatj implements RewardedVideoAd {

    /* renamed from: a */
    private final zzasw f18511a;

    /* renamed from: b */
    private final Context f18512b;

    /* renamed from: c */
    private final Object f18513c = new Object();

    /* renamed from: d */
    private final zzatg f18514d = new zzatg((RewardedVideoAdListener) null);

    /* renamed from: e */
    private String f18515e;

    /* renamed from: f */
    private String f18516f;

    public zzatj(Context context, zzasw zzasw) {
        this.f18511a = zzasw == null ? new zzabx() : zzasw;
        this.f18512b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final void m19957a(String str, zzaaz zzaaz) {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    this.f18511a.mo27125a(new zzath(zzyc.m25642a(this.f18512b, zzaaz), str));
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void destroy() {
        destroy((Context) null);
    }

    public final Bundle getAdMetadata() {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    Bundle adMetadata = this.f18511a.getAdMetadata();
                    return adMetadata;
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
            Bundle bundle = new Bundle();
            return bundle;
        }
    }

    public final String getCustomData() {
        String str;
        synchronized (this.f18513c) {
            str = this.f18516f;
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f18511a != null) {
                return this.f18511a.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener p1;
        synchronized (this.f18513c) {
            p1 = this.f18514d.mo27637p1();
        }
        return p1;
    }

    public final String getUserId() {
        String str;
        synchronized (this.f18513c) {
            str = this.f18515e;
        }
        return str;
    }

    public final boolean isLoaded() {
        synchronized (this.f18513c) {
            if (this.f18511a == null) {
                return false;
            }
            try {
                boolean isLoaded = this.f18511a.isLoaded();
                return isLoaded;
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    public final void loadAd(String str, AdRequest adRequest) {
        m19957a(str, adRequest.zzde());
    }

    public final void pause() {
        pause((Context) null);
    }

    public final void resume() {
        resume((Context) null);
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    this.f18511a.mo27126a((zzzp) new zzxy(adMetadataListener));
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setCustomData(String str) {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    this.f18511a.setCustomData(str);
                    this.f18516f = str;
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    this.f18511a.setImmersiveMode(z);
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f18513c) {
            this.f18514d.mo27636a(rewardedVideoAdListener);
            if (this.f18511a != null) {
                try {
                    this.f18511a.mo27124a((zzatb) this.f18514d);
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f18513c) {
            this.f18515e = str;
            if (this.f18511a != null) {
                try {
                    this.f18511a.setUserId(str);
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void show() {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    this.f18511a.show();
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void destroy(Context context) {
        synchronized (this.f18513c) {
            this.f18514d.mo27636a((RewardedVideoAdListener) null);
            if (this.f18511a != null) {
                try {
                    this.f18511a.mo27131k(ObjectWrapper.m16391a(context));
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        m19957a(str, publisherAdRequest.zzde());
    }

    public final void pause(Context context) {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    this.f18511a.mo27122F(ObjectWrapper.m16391a(context));
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void resume(Context context) {
        synchronized (this.f18513c) {
            if (this.f18511a != null) {
                try {
                    this.f18511a.mo27121B(ObjectWrapper.m16391a(context));
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
