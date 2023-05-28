package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.lang.ref.WeakReference;
import p112n.p312h.p313a.C10784m;
import p112n.p312h.p313a.p316d0.C10747a;
import p112n.p312h.p313a.p316d0.C10750b;

/* renamed from: com.liulishuo.filedownloader.services.f */
/* compiled from: FDServiceSharedHandler */
public class C8903f extends C10750b.C10751a implements C8909k {

    /* renamed from: f */
    private final C8906h f25285f;

    /* renamed from: g */
    private final WeakReference<FileDownloadService> f25286g;

    /* renamed from: com.liulishuo.filedownloader.services.f$a */
    /* compiled from: FDServiceSharedHandler */
    public interface C8904a {
        /* renamed from: a */
        void mo32802a();

        /* renamed from: a */
        void mo32803a(C8903f fVar);
    }

    C8903f(WeakReference<FileDownloadService> weakReference, C8906h hVar) {
        this.f25286g = weakReference;
        this.f25285f = hVar;
    }

    /* renamed from: M0 */
    public boolean mo32784M0() {
        return this.f25285f.mo32810b();
    }

    /* renamed from: a */
    public void mo32788a(C10747a aVar) {
    }

    /* renamed from: a */
    public boolean mo32789a(String str, String str2) {
        return this.f25285f.mo32808a(str, str2);
    }

    /* renamed from: b */
    public byte mo32790b(int i) {
        return this.f25285f.mo32811c(i);
    }

    /* renamed from: b */
    public IBinder mo32791b(Intent intent) {
        return null;
    }

    /* renamed from: b */
    public void mo32792b(C10747a aVar) {
    }

    /* renamed from: c0 */
    public void mo32793c0() {
        this.f25285f.mo32804a();
    }

    /* renamed from: d */
    public boolean mo32794d(int i) {
        return this.f25285f.mo32815f(i);
    }

    /* renamed from: e */
    public boolean mo32795e(int i) {
        return this.f25285f.mo32806a(i);
    }

    /* renamed from: j */
    public boolean mo32796j(int i) {
        return this.f25285f.mo32816g(i);
    }

    /* renamed from: l */
    public void mo32797l(boolean z) {
        WeakReference<FileDownloadService> weakReference = this.f25286g;
        if (weakReference != null && weakReference.get() != null) {
            ((FileDownloadService) this.f25286g.get()).stopForeground(z);
        }
    }

    /* renamed from: m */
    public long mo32798m(int i) {
        return this.f25285f.mo32813d(i);
    }

    /* renamed from: m1 */
    public void mo32799m1() {
        this.f25285f.mo32812c();
    }

    public void onDestroy() {
        C10784m.m36572b().mo32802a();
    }

    /* renamed from: q */
    public long mo32801q(int i) {
        return this.f25285f.mo32809b(i);
    }

    /* renamed from: a */
    public void mo32787a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        this.f25285f.mo32805a(str, str2, z, i, i2, i3, z2, fileDownloadHeader, z3);
    }

    /* renamed from: a */
    public void mo32785a(int i, Notification notification) {
        WeakReference<FileDownloadService> weakReference = this.f25286g;
        if (weakReference != null && weakReference.get() != null) {
            ((FileDownloadService) this.f25286g.get()).startForeground(i, notification);
        }
    }

    /* renamed from: a */
    public void mo32786a(Intent intent, int i, int i2) {
        C10784m.m36572b().mo32803a(this);
    }
}
