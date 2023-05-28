package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzacc;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzbad;

@zzard
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    private zzaar zzaav;
    private VideoLifecycleCallbacks zzaaw;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final float getAspectRatio() {
        synchronized (this.lock) {
            if (this.zzaav == null) {
                return 0.0f;
            }
            try {
                float t = this.zzaav.mo26938t();
                return t;
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }

    @KeepForSdk
    public final int getPlaybackState() {
        synchronized (this.lock) {
            if (this.zzaav == null) {
                return 0;
            }
            try {
                int o = this.zzaav.mo26936o();
                return o;
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzaaw;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzaav != null;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            if (this.zzaav == null) {
                return false;
            }
            try {
                boolean K = this.zzaav.mo26927K();
                return K;
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            if (this.zzaav == null) {
                return false;
            }
            try {
                boolean Q0 = this.zzaav.mo26930Q0();
                return Q0;
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            if (this.zzaav == null) {
                return true;
            }
            try {
                boolean R = this.zzaav.mo26931R();
                return R;
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            if (this.zzaav != null) {
                try {
                    this.zzaav.mo26934h(z);
                } catch (RemoteException e) {
                    zzbad.m20520b("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            if (this.zzaav != null) {
                try {
                    this.zzaav.pause();
                } catch (RemoteException e) {
                    zzbad.m20520b("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.zzaav != null) {
                try {
                    this.zzaav.mo26929P0();
                } catch (RemoteException e) {
                    zzbad.m20520b("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.m16038a(videoLifecycleCallbacks, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzaaw = videoLifecycleCallbacks;
            if (this.zzaav != null) {
                try {
                    this.zzaav.mo26933a(new zzacc(videoLifecycleCallbacks));
                } catch (RemoteException e) {
                    zzbad.m20520b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    public final void zza(zzaar zzaar) {
        synchronized (this.lock) {
            this.zzaav = zzaar;
            if (this.zzaaw != null) {
                setVideoLifecycleCallbacks(this.zzaaw);
            }
        }
    }

    public final zzaar zzdh() {
        zzaar zzaar;
        synchronized (this.lock) {
            zzaar = this.zzaav;
        }
        return zzaar;
    }
}
