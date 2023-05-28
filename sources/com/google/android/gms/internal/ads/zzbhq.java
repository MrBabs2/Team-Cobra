package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;

@zzard
public final class zzbhq extends zzaas {

    /* renamed from: f */
    private final zzbdf f18999f;

    /* renamed from: g */
    private final Object f19000g = new Object();

    /* renamed from: h */
    private final boolean f19001h;

    /* renamed from: i */
    private final boolean f19002i;

    /* renamed from: j */
    private int f19003j;

    /* renamed from: k */
    private zzaau f19004k;

    /* renamed from: l */
    private boolean f19005l;

    /* renamed from: m */
    private boolean f19006m = true;

    /* renamed from: n */
    private float f19007n;

    /* renamed from: o */
    private float f19008o;

    /* renamed from: p */
    private float f19009p;

    /* renamed from: q */
    private boolean f19010q;

    /* renamed from: r */
    private boolean f19011r;

    public zzbhq(zzbdf zzbdf, float f, boolean z, boolean z2) {
        this.f18999f = zzbdf;
        this.f19007n = f;
        this.f19001h = z;
        this.f19002i = z2;
    }

    /* renamed from: a */
    private final void m21055a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbbm.f18748a.execute(new C7464fb(this, hashMap));
    }

    /* renamed from: K */
    public final boolean mo26927K() {
        boolean z;
        boolean Q0 = mo26930Q0();
        synchronized (this.f19000g) {
            if (!Q0) {
                try {
                    if (this.f19011r && this.f19002i) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: N0 */
    public final zzaau mo26928N0() throws RemoteException {
        zzaau zzaau;
        synchronized (this.f19000g) {
            zzaau = this.f19004k;
        }
        return zzaau;
    }

    /* renamed from: P0 */
    public final void mo26929P0() {
        m21055a("play", (Map<String, String>) null);
    }

    /* renamed from: Q0 */
    public final boolean mo26930Q0() {
        boolean z;
        synchronized (this.f19000g) {
            z = this.f19001h && this.f19010q;
        }
        return z;
    }

    /* renamed from: R */
    public final boolean mo26931R() {
        boolean z;
        synchronized (this.f19000g) {
            z = this.f19006m;
        }
        return z;
    }

    /* renamed from: Z0 */
    public final float mo26932Z0() {
        float f;
        synchronized (this.f19000g) {
            f = this.f19008o;
        }
        return f;
    }

    /* renamed from: b */
    public final void mo28162b(zzacd zzacd) {
        boolean z = zzacd.f17755f;
        boolean z2 = zzacd.f17756g;
        boolean z3 = zzacd.f17757h;
        synchronized (this.f19000g) {
            this.f19010q = z2;
            this.f19011r = z3;
        }
        m21055a("initialState", CollectionUtils.m16257a("muteStart", z ? DiskLruCache.VERSION_1 : "0", "customControlsRequested", z2 ? DiskLruCache.VERSION_1 : "0", "clickToExpandRequested", z3 ? DiskLruCache.VERSION_1 : "0"));
    }

    /* renamed from: h */
    public final void mo26934h(boolean z) {
        m21055a(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    /* renamed from: l1 */
    public final float mo26935l1() {
        float f;
        synchronized (this.f19000g) {
            f = this.f19007n;
        }
        return f;
    }

    /* renamed from: o */
    public final int mo26936o() {
        int i;
        synchronized (this.f19000g) {
            i = this.f19003j;
        }
        return i;
    }

    /* renamed from: p1 */
    public final void mo28164p1() {
        boolean z;
        int i;
        synchronized (this.f19000g) {
            z = this.f19006m;
            i = this.f19003j;
            this.f19003j = 3;
        }
        m21056b(i, 3, z, z);
    }

    public final void pause() {
        m21055a("pause", (Map<String, String>) null);
    }

    /* renamed from: t */
    public final float mo26938t() {
        float f;
        synchronized (this.f19000g) {
            f = this.f19009p;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo26933a(zzaau zzaau) {
        synchronized (this.f19000g) {
            this.f19004k = zzaau;
        }
    }

    /* renamed from: a */
    public final void mo28159a(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        int i2;
        synchronized (this.f19000g) {
            this.f19007n = f2;
            this.f19008o = f;
            z2 = this.f19006m;
            this.f19006m = z;
            i2 = this.f19003j;
            this.f19003j = i;
            float f4 = this.f19009p;
            this.f19009p = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f18999f.getView().invalidate();
            }
        }
        m21056b(i2, i, z2, z);
    }

    /* renamed from: b */
    public final void mo28161b(float f) {
        synchronized (this.f19000g) {
            this.f19008o = f;
        }
    }

    /* renamed from: b */
    private final void m21056b(int i, int i2, boolean z, boolean z2) {
        zzbbm.f18748a.execute(new C7500gb(this, i, i2, z, z2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28163b(Map map) {
        this.f18999f.mo25665a("pubVideoCmd", (Map<String, ?>) map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28160a(int i, int i2, boolean z, boolean z2) {
        synchronized (this.f19000g) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.f19005l && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.f19005l || z5) {
                z3 = true;
            }
            this.f19005l = z3;
            if (z5) {
                try {
                    if (this.f19004k != null) {
                        this.f19004k.onVideoStart();
                    }
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
            if (z6 && this.f19004k != null) {
                this.f19004k.onVideoPlay();
            }
            if (z7 && this.f19004k != null) {
                this.f19004k.onVideoPause();
            }
            if (z8) {
                if (this.f19004k != null) {
                    this.f19004k.mo26943x();
                }
                this.f18999f.mo25703o();
            }
            if (z9 && this.f19004k != null) {
                this.f19004k.mo26939b(z2);
            }
        }
    }
}
