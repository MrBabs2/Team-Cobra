package com.liulishuo.filedownloader.services;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import p112n.p312h.p313a.C10784m;
import p112n.p312h.p313a.p318f0.C10768e;
import p112n.p312h.p313a.p318f0.C10771f;

@SuppressLint({"Registered"})
public class FileDownloadService extends Service {

    /* renamed from: f */
    private C8909k f25269f;

    public static class SeparateProcessService extends FileDownloadService {
    }

    public static class SharedMainProcessService extends FileDownloadService {
    }

    public IBinder onBind(Intent intent) {
        return this.f25269f.mo32791b(intent);
    }

    public void onCreate() {
        super.onCreate();
        try {
            C10771f.m36505a(C10768e.m36497a().f28827a);
            C10771f.m36506a(C10768e.m36497a().f28828b);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        C8906h hVar = new C8906h(C10784m.m36573c().mo36549a());
        if (C10768e.m36497a().f28830d) {
            this.f25269f = new C8903f(new WeakReference(this), hVar);
        } else {
            this.f25269f = new C8902e(new WeakReference(this), hVar);
        }
    }

    public void onDestroy() {
        this.f25269f.onDestroy();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f25269f.mo32786a(intent, i, i2);
        return 1;
    }
}
