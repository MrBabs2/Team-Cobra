package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.internal.p168a0.p170f.C6391a;

/* renamed from: com.facebook.internal.t */
/* compiled from: PlatformServiceClient */
public abstract class C6470t implements ServiceConnection {

    /* renamed from: f */
    private final Context f11902f;

    /* renamed from: g */
    private final Handler f11903g;

    /* renamed from: h */
    private C6472b f11904h;

    /* renamed from: i */
    private boolean f11905i;

    /* renamed from: j */
    private Messenger f11906j;

    /* renamed from: k */
    private int f11907k;

    /* renamed from: l */
    private int f11908l;

    /* renamed from: m */
    private final String f11909m;

    /* renamed from: n */
    private final int f11910n;

    /* renamed from: com.facebook.internal.t$a */
    /* compiled from: PlatformServiceClient */
    class C6471a extends Handler {
        C6471a() {
        }

        public void handleMessage(Message message) {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6470t.this.mo21022a(message);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.t$b */
    /* compiled from: PlatformServiceClient */
    public interface C6472b {
        /* renamed from: a */
        void mo21028a(Bundle bundle);
    }

    public C6470t(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f11902f = applicationContext != null ? applicationContext : context;
        this.f11907k = i;
        this.f11908l = i2;
        this.f11909m = str;
        this.f11910n = i3;
        this.f11903g = new C6471a();
    }

    /* renamed from: c */
    private void m13463c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f11909m);
        mo21021a(bundle);
        Message obtain = Message.obtain((Handler) null, this.f11907k);
        obtain.arg1 = this.f11910n;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f11903g);
        try {
            this.f11906j.send(obtain);
        } catch (RemoteException unused) {
            m13462b((Bundle) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21021a(Bundle bundle);

    /* renamed from: a */
    public void mo21023a(C6472b bVar) {
        this.f11904h = bVar;
    }

    /* renamed from: b */
    public boolean mo21024b() {
        Intent a;
        if (this.f11905i || C6461s.m13418a(this.f11910n) == -1 || (a = C6461s.m13420a(this.f11902f)) == null) {
            return false;
        }
        this.f11905i = true;
        this.f11902f.bindService(a, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11906j = new Messenger(iBinder);
        m13463c();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f11906j = null;
        try {
            this.f11902f.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m13462b((Bundle) null);
    }

    /* renamed from: a */
    public void mo21020a() {
        this.f11905i = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21022a(Message message) {
        if (message.what == this.f11908l) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m13462b((Bundle) null);
            } else {
                m13462b(data);
            }
            try {
                this.f11902f.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    private void m13462b(Bundle bundle) {
        if (this.f11905i) {
            this.f11905i = false;
            C6472b bVar = this.f11904h;
            if (bVar != null) {
                bVar.mo21028a(bundle);
            }
        }
    }
}
