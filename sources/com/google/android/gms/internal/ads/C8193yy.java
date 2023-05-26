package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.yy */
final class C8193yy implements zzge {

    /* renamed from: a */
    private final Handler f17493a;

    /* renamed from: b */
    private final C7303az f17494b;

    /* renamed from: c */
    private final CopyOnWriteArraySet<zzgh> f17495c = new CopyOnWriteArraySet<>();

    /* renamed from: d */
    private final boolean[] f17496d = new boolean[2];

    /* renamed from: e */
    private boolean f17497e = false;

    /* renamed from: f */
    private int f17498f = 1;

    /* renamed from: g */
    private int f17499g;

    @SuppressLint({"HandlerLeak"})
    public C8193yy(int i, int i2, int i3) {
        Log.i("ExoPlayerImpl", "Init 1.3.1");
        int i4 = 0;
        while (true) {
            boolean[] zArr = this.f17496d;
            if (i4 < zArr.length) {
                zArr[i4] = true;
                i4++;
            } else {
                C8230zy zyVar = new C8230zy(this);
                this.f17493a = zyVar;
                this.f17494b = new C7303az(zyVar, this.f17497e, this.f17496d, 2500, 5000);
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo26845a(zzgh zzgh) {
        this.f17495c.add(zzgh);
    }

    /* renamed from: b */
    public final void mo26849b(zzgf zzgf, int i, Object obj) {
        this.f17494b.mo25610a(zzgf, 1, obj);
    }

    /* renamed from: c */
    public final long mo26850c() {
        return this.f17494b.mo25617e();
    }

    /* renamed from: d */
    public final boolean mo26851d() {
        return this.f17497e;
    }

    /* renamed from: e */
    public final long mo26852e() {
        return this.f17494b.mo25613b();
    }

    /* renamed from: o */
    public final int mo26853o() {
        return this.f17498f;
    }

    public final void stop() {
        this.f17494b.mo25616d();
    }

    /* renamed from: a */
    public final void mo26847a(zzhp... zzhpArr) {
        this.f17494b.mo25612a(zzhpArr);
    }

    /* renamed from: b */
    public final long mo26848b() {
        return this.f17494b.mo25607a();
    }

    /* renamed from: a */
    public final void mo26841a(int i, boolean z) {
        boolean[] zArr = this.f17496d;
        if (zArr[0] != z) {
            zArr[0] = z;
            this.f17494b.mo25608a(0, z);
        }
    }

    /* renamed from: a */
    public final void mo26846a(boolean z) {
        if (this.f17497e != z) {
            this.f17497e = z;
            this.f17499g++;
            this.f17494b.mo25611a(z);
            Iterator<zzgh> it = this.f17495c.iterator();
            while (it.hasNext()) {
                it.next().mo26128a(z, this.f17498f);
            }
        }
    }

    /* renamed from: a */
    public final void mo26842a(long j) {
        this.f17494b.mo25609a(j);
    }

    /* renamed from: a */
    public final void mo26840a() {
        this.f17494b.mo25615c();
        this.f17493a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public final void mo26844a(zzgf zzgf, int i, Object obj) {
        this.f17494b.mo25614b(zzgf, 1, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26843a(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f17498f = message.arg1;
            Iterator<zzgh> it = this.f17495c.iterator();
            while (it.hasNext()) {
                it.next().mo26128a(this.f17497e, this.f17498f);
            }
        } else if (i == 2) {
            int i2 = this.f17499g - 1;
            this.f17499g = i2;
            if (i2 == 0) {
                Iterator<zzgh> it2 = this.f17495c.iterator();
                while (it2.hasNext()) {
                    it2.next().mo26125a();
                }
            }
        } else if (i == 3) {
            zzgd zzgd = (zzgd) message.obj;
            Iterator<zzgh> it3 = this.f17495c.iterator();
            while (it3.hasNext()) {
                it3.next().mo26126a(zzgd);
            }
        }
    }
}
