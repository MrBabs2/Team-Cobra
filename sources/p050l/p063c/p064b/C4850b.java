package p050l.p063c.p064b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p037k.p040b.p041a.C4777a;
import p037k.p040b.p041a.C4779b;

/* renamed from: l.c.b.b */
/* compiled from: CustomTabsClient */
public class C4850b {

    /* renamed from: a */
    private final C4779b f8305a;

    /* renamed from: b */
    private final ComponentName f8306b;

    /* renamed from: l.c.b.b$a */
    /* compiled from: CustomTabsClient */
    static class C4851a extends C4860d {

        /* renamed from: f */
        final /* synthetic */ Context f8307f;

        C4851a(Context context) {
            this.f8307f = context;
        }

        /* renamed from: a */
        public final void mo16881a(ComponentName componentName, C4850b bVar) {
            bVar.mo16880a(0);
            this.f8307f.unbindService(this);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    C4850b(C4779b bVar, ComponentName componentName) {
        this.f8305a = bVar;
        this.f8306b = componentName;
    }

    /* renamed from: a */
    public static boolean m8136a(Context context, String str, C4860d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    /* renamed from: l.c.b.b$b */
    /* compiled from: CustomTabsClient */
    class C4852b extends C4777a.C4778a {

        /* renamed from: f */
        private Handler f8308f = new Handler(Looper.getMainLooper());

        /* renamed from: g */
        final /* synthetic */ C4849a f8309g;

        /* renamed from: l.c.b.b$b$a */
        /* compiled from: CustomTabsClient */
        class C4853a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f8310f;

            /* renamed from: g */
            final /* synthetic */ Bundle f8311g;

            C4853a(int i, Bundle bundle) {
                this.f8310f = i;
                this.f8311g = bundle;
            }

            public void run() {
                C4852b.this.f8309g.mo16875a(this.f8310f, this.f8311g);
                throw null;
            }
        }

        /* renamed from: l.c.b.b$b$b */
        /* compiled from: CustomTabsClient */
        class C4854b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f8313f;

            /* renamed from: g */
            final /* synthetic */ Bundle f8314g;

            C4854b(String str, Bundle bundle) {
                this.f8313f = str;
                this.f8314g = bundle;
            }

            public void run() {
                C4852b.this.f8309g.mo16877a(this.f8313f, this.f8314g);
                throw null;
            }
        }

        /* renamed from: l.c.b.b$b$c */
        /* compiled from: CustomTabsClient */
        class C4855c implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Bundle f8316f;

            C4855c(Bundle bundle) {
                this.f8316f = bundle;
            }

            public void run() {
                C4852b.this.f8309g.mo16876a(this.f8316f);
                throw null;
            }
        }

        /* renamed from: l.c.b.b$b$d */
        /* compiled from: CustomTabsClient */
        class C4856d implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f8318f;

            /* renamed from: g */
            final /* synthetic */ Bundle f8319g;

            C4856d(String str, Bundle bundle) {
                this.f8318f = str;
                this.f8319g = bundle;
            }

            public void run() {
                C4852b.this.f8309g.mo16878b(this.f8318f, this.f8319g);
                throw null;
            }
        }

        /* renamed from: l.c.b.b$b$e */
        /* compiled from: CustomTabsClient */
        class C4857e implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f8321f;

            /* renamed from: g */
            final /* synthetic */ Uri f8322g;

            /* renamed from: h */
            final /* synthetic */ boolean f8323h;

            /* renamed from: i */
            final /* synthetic */ Bundle f8324i;

            C4857e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f8321f = i;
                this.f8322g = uri;
                this.f8323h = z;
                this.f8324i = bundle;
            }

            public void run() {
                C4852b.this.f8309g.mo16874a(this.f8321f, this.f8322g, this.f8323h, this.f8324i);
                throw null;
            }
        }

        C4852b(C4850b bVar, C4849a aVar) {
            this.f8309g = aVar;
        }

        /* renamed from: a */
        public void mo16611a(String str, Bundle bundle) throws RemoteException {
            if (this.f8309g != null) {
                this.f8308f.post(new C4854b(str, bundle));
            }
        }

        /* renamed from: b */
        public void mo16612b(int i, Bundle bundle) {
            if (this.f8309g != null) {
                this.f8308f.post(new C4853a(i, bundle));
            }
        }

        /* renamed from: j */
        public void mo16614j(Bundle bundle) throws RemoteException {
            if (this.f8309g != null) {
                this.f8308f.post(new C4855c(bundle));
            }
        }

        /* renamed from: a */
        public void mo16610a(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f8309g != null) {
                this.f8308f.post(new C4857e(i, uri, z, bundle));
            }
        }

        /* renamed from: b */
        public void mo16613b(String str, Bundle bundle) throws RemoteException {
            if (this.f8309g != null) {
                this.f8308f.post(new C4856d(str, bundle));
            }
        }
    }

    /* renamed from: a */
    public static boolean m8135a(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m8136a(applicationContext, str, new C4851a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo16880a(long j) {
        try {
            return this.f8305a.mo16619b(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public C4862e mo16879a(C4849a aVar) {
        C4852b bVar = new C4852b(this, aVar);
        try {
            if (!this.f8305a.mo16617a(bVar)) {
                return null;
            }
            return new C4862e(this.f8305a, bVar, this.f8306b);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
