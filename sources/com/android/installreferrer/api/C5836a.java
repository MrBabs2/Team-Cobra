package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p112n.p269b.p270a.p271a.C10556a;
import p112n.p277e.p279b.p280a.p281a.C10570a;

/* renamed from: com.android.installreferrer.api.a */
/* compiled from: InstallReferrerClientImpl */
class C5836a extends InstallReferrerClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f10518a = 0;

    /* renamed from: b */
    private final Context f10519b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10570a f10520c;

    /* renamed from: d */
    private ServiceConnection f10521d;

    /* renamed from: com.android.installreferrer.api.a$b */
    /* compiled from: InstallReferrerClientImpl */
    private final class C5838b implements ServiceConnection {

        /* renamed from: f */
        private final InstallReferrerStateListener f10522f;

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C10556a.m35846a("InstallReferrerClient", "Install Referrer service connected.");
            C10570a unused = C5836a.this.f10520c = C10570a.C10571a.m35865a(iBinder);
            int unused2 = C5836a.this.f10518a = 2;
            this.f10522f.mo19754a(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C10556a.m35847b("InstallReferrerClient", "Install Referrer service disconnected.");
            C10570a unused = C5836a.this.f10520c = null;
            int unused2 = C5836a.this.f10518a = 0;
            this.f10522f.mo19753a();
        }

        private C5838b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f10522f = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public C5836a(Context context) {
        this.f10519b = context.getApplicationContext();
    }

    /* renamed from: c */
    private boolean m11403c() {
        try {
            if (this.f10519b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo19756b() {
        return (this.f10518a != 2 || this.f10520c == null || this.f10521d == null) ? false : true;
    }

    /* renamed from: a */
    public void mo19751a(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (mo19756b()) {
            C10556a.m35846a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.mo19754a(0);
            return;
        }
        int i = this.f10518a;
        if (i == 1) {
            C10556a.m35847b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.mo19754a(3);
        } else if (i == 3) {
            C10556a.m35847b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.mo19754a(3);
        } else {
            C10556a.m35846a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f10521d = new C5838b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f10519b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f10518a = 0;
                C10556a.m35846a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener.mo19754a(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !m11403c()) {
                C10556a.m35847b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f10518a = 0;
                installReferrerStateListener.mo19754a(2);
                return;
            }
            if (this.f10519b.bindService(new Intent(intent), this.f10521d, 1)) {
                C10556a.m35846a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            C10556a.m35847b("InstallReferrerClient", "Connection to service is blocked.");
            this.f10518a = 0;
            installReferrerStateListener.mo19754a(1);
        }
    }

    /* renamed from: a */
    public ReferrerDetails mo19750a() throws RemoteException {
        if (mo19756b()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f10519b.getPackageName());
            try {
                return new ReferrerDetails(this.f10520c.mo36119h(bundle));
            } catch (RemoteException e) {
                C10556a.m35847b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f10518a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }
}
