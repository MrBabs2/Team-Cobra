package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Future;

@zzard
public final class zzwb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzvu f22862a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f22863b;

    /* renamed from: c */
    private final Context f22864c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f22865d = new Object();

    zzwb(Context context) {
        this.f22864c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Future<InputStream> mo29857a(zzvv zzvv) {
        a50 a50 = new a50(this);
        b50 b50 = new b50(this, zzvv, a50);
        f50 f50 = new f50(this, a50);
        synchronized (this.f22865d) {
            zzvu zzvu = new zzvu(this.f22864c, zzk.zzlu().mo27864b(), b50, f50);
            this.f22862a = zzvu;
            zzvu.checkAvailabilityAndConnect();
        }
        return a50;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25457a() {
        synchronized (this.f22865d) {
            if (this.f22862a != null) {
                this.f22862a.disconnect();
                this.f22862a = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
