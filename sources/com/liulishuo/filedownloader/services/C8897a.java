package com.liulishuo.filedownloader.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p112n.p312h.p313a.C10757f;
import p112n.p312h.p313a.C10798t;
import p112n.p312h.p313a.p315c0.C10741b;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: com.liulishuo.filedownloader.services.a */
/* compiled from: BaseFileServiceUIGuard */
public abstract class C8897a<CALLBACK extends Binder, INTERFACE extends IInterface> implements C10798t, ServiceConnection {

    /* renamed from: f */
    private final CALLBACK f25270f;

    /* renamed from: g */
    private volatile INTERFACE f25271g;

    /* renamed from: h */
    private final Class<?> f25272h;

    /* renamed from: i */
    private final List<Context> f25273i = new ArrayList();

    /* renamed from: j */
    private final ArrayList<Runnable> f25274j = new ArrayList<>();

    protected C8897a(Class<?> cls) {
        new HashMap();
        this.f25272h = cls;
        this.f25270f = mo32755a();
    }

    /* renamed from: a */
    private void m29179a(boolean z) {
        if (!z && this.f25271g != null) {
            try {
                mo32761b(this.f25271g, this.f25270f);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "release connect resources %s", this.f25271g);
        }
        this.f25271g = null;
        C10757f.m36470a().mo36460a(new C10741b(z ? C10741b.C10742a.lost : C10741b.C10742a.disconnected, this.f25272h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract CALLBACK mo32755a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract INTERFACE mo32756a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32759a(INTERFACE interfaceR, CALLBACK callback) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public INTERFACE mo32760b() {
        return this.f25271g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo32761b(INTERFACE interfaceR, CALLBACK callback) throws RemoteException;

    public boolean isConnected() {
        return mo32760b() != null;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25271g = mo32756a(iBinder);
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "onServiceConnected %s %s", componentName, this.f25271g);
        }
        try {
            mo32759a(this.f25271g, this.f25270f);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        this.f25274j.clear();
        for (Runnable run : (List) this.f25274j.clone()) {
            run.run();
        }
        C10757f.m36470a().mo36460a(new C10741b(C10741b.C10742a.connected, this.f25272h));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "onServiceDisconnected %s %s", componentName, this.f25271g);
        }
        m29179a(true);
    }

    /* renamed from: a */
    public void mo32757a(Context context) {
        mo32758a(context, (Runnable) null);
    }

    /* renamed from: a */
    public void mo32758a(Context context, Runnable runnable) {
        if (!C10771f.m36511b(context)) {
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "bindStartByContext %s", context.getClass().getSimpleName());
            }
            Intent intent = new Intent(context, this.f25272h);
            if (runnable != null && !this.f25274j.contains(runnable)) {
                this.f25274j.add(runnable);
            }
            if (!this.f25273i.contains(context)) {
                this.f25273i.add(context);
            }
            context.bindService(intent, this, 1);
            context.startService(intent);
            return;
        }
        throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation, and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
    }
}
