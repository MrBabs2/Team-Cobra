package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.C8887b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.lang.ref.WeakReference;
import p112n.p312h.p313a.p316d0.C10747a;
import p112n.p312h.p313a.p316d0.C10750b;
import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: com.liulishuo.filedownloader.services.e */
/* compiled from: FDServiceSeparateHandler */
public class C8902e extends C10750b.C10751a implements C8887b.C8889b, C8909k {

    /* renamed from: f */
    private final RemoteCallbackList<C10747a> f25282f = new RemoteCallbackList<>();

    /* renamed from: g */
    private final C8906h f25283g;

    /* renamed from: h */
    private final WeakReference<FileDownloadService> f25284h;

    C8902e(WeakReference<FileDownloadService> weakReference, C8906h hVar) {
        this.f25284h = weakReference;
        this.f25283g = hVar;
        C8887b.m29133a().mo32714a((C8887b.C8889b) this);
    }

    /* renamed from: b */
    private synchronized int m29210b(MessageSnapshot messageSnapshot) {
        int beginBroadcast;
        RemoteCallbackList<C10747a> remoteCallbackList;
        beginBroadcast = this.f25282f.beginBroadcast();
        int i = 0;
        while (i < beginBroadcast) {
            try {
                this.f25282f.getBroadcastItem(i).mo36484b(messageSnapshot);
                i++;
            } catch (RemoteException e) {
                try {
                    C10767d.m36491a((Object) this, (Throwable) e, "callback error", new Object[0]);
                    remoteCallbackList = this.f25282f;
                } catch (Throwable th) {
                    this.f25282f.finishBroadcast();
                    throw th;
                }
            }
        }
        remoteCallbackList = this.f25282f;
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    /* renamed from: M0 */
    public boolean mo32784M0() throws RemoteException {
        return this.f25283g.mo32810b();
    }

    /* renamed from: a */
    public void mo32786a(Intent intent, int i, int i2) {
    }

    /* renamed from: a */
    public void mo32788a(C10747a aVar) throws RemoteException {
        this.f25282f.register(aVar);
    }

    /* renamed from: b */
    public IBinder mo32791b(Intent intent) {
        return this;
    }

    /* renamed from: c0 */
    public void mo32793c0() throws RemoteException {
        this.f25283g.mo32804a();
    }

    /* renamed from: d */
    public boolean mo32794d(int i) throws RemoteException {
        return this.f25283g.mo32815f(i);
    }

    /* renamed from: e */
    public boolean mo32795e(int i) throws RemoteException {
        return this.f25283g.mo32806a(i);
    }

    /* renamed from: j */
    public boolean mo32796j(int i) throws RemoteException {
        return this.f25283g.mo32816g(i);
    }

    /* renamed from: l */
    public void mo32797l(boolean z) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f25284h;
        if (weakReference != null && weakReference.get() != null) {
            ((FileDownloadService) this.f25284h.get()).stopForeground(z);
        }
    }

    /* renamed from: m */
    public long mo32798m(int i) throws RemoteException {
        return this.f25283g.mo32813d(i);
    }

    /* renamed from: m1 */
    public void mo32799m1() throws RemoteException {
        this.f25283g.mo32812c();
    }

    public void onDestroy() {
        C8887b.m29133a().mo32714a((C8887b.C8889b) null);
    }

    /* renamed from: q */
    public long mo32801q(int i) throws RemoteException {
        return this.f25283g.mo32809b(i);
    }

    /* renamed from: a */
    public boolean mo32789a(String str, String str2) throws RemoteException {
        return this.f25283g.mo32808a(str, str2);
    }

    /* renamed from: a */
    public void mo32787a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException {
        this.f25283g.mo32805a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    /* renamed from: a */
    public void mo32785a(int i, Notification notification) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f25284h;
        if (weakReference != null && weakReference.get() != null) {
            ((FileDownloadService) this.f25284h.get()).startForeground(i, notification);
        }
    }

    /* renamed from: a */
    public void mo32715a(MessageSnapshot messageSnapshot) {
        m29210b(messageSnapshot);
    }

    /* renamed from: b */
    public void mo32792b(C10747a aVar) throws RemoteException {
        this.f25282f.unregister(aVar);
    }

    /* renamed from: b */
    public byte mo32790b(int i) throws RemoteException {
        return this.f25283g.mo32811c(i);
    }
}
