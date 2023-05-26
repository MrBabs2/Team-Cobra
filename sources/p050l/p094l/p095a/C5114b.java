package p050l.p094l.p095a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C0521j;
import androidx.lifecycle.C0529p;
import androidx.lifecycle.C0530q;
import androidx.lifecycle.C0542v;
import androidx.lifecycle.C0543w;
import androidx.lifecycle.C0546x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p050l.p066e.C4882h;
import p050l.p075h.p083k.C5001a;
import p050l.p094l.p095a.C5112a;
import p050l.p094l.p096b.C5121b;

/* renamed from: l.l.a.b */
/* compiled from: LoaderManagerImpl */
class C5114b extends C5112a {

    /* renamed from: c */
    static boolean f9015c = false;

    /* renamed from: a */
    private final C0521j f9016a;

    /* renamed from: b */
    private final C5117c f9017b;

    /* renamed from: l.l.a.b$c */
    /* compiled from: LoaderManagerImpl */
    static class C5117c extends C0542v {

        /* renamed from: d */
        private static final C0543w.C0544a f9027d = new C5118a();

        /* renamed from: b */
        private C4882h<C5115a> f9028b = new C4882h<>();

        /* renamed from: c */
        private boolean f9029c = false;

        /* renamed from: l.l.a.b$c$a */
        /* compiled from: LoaderManagerImpl */
        static class C5118a implements C0543w.C0544a {
            C5118a() {
            }

            /* renamed from: a */
            public <T extends C0542v> T mo2931a(Class<T> cls) {
                return new C5117c();
            }
        }

        C5117c() {
        }

        /* renamed from: a */
        static C5117c m9417a(C0546x xVar) {
            return (C5117c) new C0543w(xVar, f9027d).mo3094a(C5117c.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo2920b() {
            super.mo2920b();
            int c = this.f9028b.mo17048c();
            for (int i = 0; i < c; i++) {
                this.f9028b.mo17053e(i).mo17733a(true);
            }
            this.f9028b.mo17047b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo17746c() {
            this.f9029c = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo17747d() {
            return this.f9029c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo17748e() {
            int c = this.f9028b.mo17048c();
            for (int i = 0; i < c; i++) {
                this.f9028b.mo17053e(i).mo17737f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo17749f() {
            this.f9029c = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17744a(int i, C5115a aVar) {
            this.f9028b.mo17050c(i, aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <D> C5115a<D> mo17743a(int i) {
            return this.f9028b.mo17043a(i);
        }

        /* renamed from: a */
        public void mo17745a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f9028b.mo17048c() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f9028b.mo17048c(); i++) {
                    C5115a e = this.f9028b.mo17053e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f9028b.mo17049c(i));
                    printWriter.print(": ");
                    printWriter.println(e.toString());
                    e.mo17734a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    C5114b(C0521j jVar, C0546x xVar) {
        this.f9016a = jVar;
        this.f9017b = C5117c.m9417a(xVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C5121b<D> m9399a(int i, Bundle bundle, C5112a.C5113a<D> aVar, C5121b<D> bVar) {
        try {
            this.f9017b.mo17749f();
            C5121b<D> a = aVar.mo17728a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a);
                    }
                }
                C5115a aVar2 = new C5115a(i, bundle, a, bVar);
                if (f9015c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f9017b.mo17744a(i, aVar2);
                this.f9017b.mo17746c();
                return aVar2.mo17732a(this.f9016a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f9017b.mo17746c();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C5001a.m8886a(this.f9016a, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: l.l.a.b$b */
    /* compiled from: LoaderManagerImpl */
    static class C5116b<D> implements C0530q<D> {

        /* renamed from: a */
        private final C5121b<D> f9024a;

        /* renamed from: b */
        private final C5112a.C5113a<D> f9025b;

        /* renamed from: c */
        private boolean f9026c = false;

        C5116b(C5121b<D> bVar, C5112a.C5113a<D> aVar) {
            this.f9024a = bVar;
            this.f9025b = aVar;
        }

        /* renamed from: a */
        public void mo3051a(D d) {
            if (C5114b.f9015c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f9024a + ": " + this.f9024a.mo17765a(d));
            }
            this.f9025b.mo17730a(this.f9024a, d);
            this.f9026c = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17741b() {
            if (this.f9026c) {
                if (C5114b.f9015c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f9024a);
                }
                this.f9025b.mo17729a(this.f9024a);
            }
        }

        public String toString() {
            return this.f9025b.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo17740a() {
            return this.f9026c;
        }

        /* renamed from: a */
        public void mo17739a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f9026c);
        }
    }

    /* renamed from: l.l.a.b$a */
    /* compiled from: LoaderManagerImpl */
    public static class C5115a<D> extends C0529p<D> implements C5121b.C5123b<D> {

        /* renamed from: k */
        private final int f9018k;

        /* renamed from: l */
        private final Bundle f9019l;

        /* renamed from: m */
        private final C5121b<D> f9020m;

        /* renamed from: n */
        private C0521j f9021n;

        /* renamed from: o */
        private C5116b<D> f9022o;

        /* renamed from: p */
        private C5121b<D> f9023p;

        C5115a(int i, Bundle bundle, C5121b<D> bVar, C5121b<D> bVar2) {
            this.f9018k = i;
            this.f9019l = bundle;
            this.f9020m = bVar;
            this.f9023p = bVar2;
            bVar.mo17767a(i, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5121b<D> mo17732a(C0521j jVar, C5112a.C5113a<D> aVar) {
            C5116b<D> bVar = new C5116b<>(this.f9020m, aVar);
            mo3000a(jVar, bVar);
            C5116b<D> bVar2 = this.f9022o;
            if (bVar2 != null) {
                mo3001a(bVar2);
            }
            this.f9021n = jVar;
            this.f9022o = bVar;
            return this.f9020m;
        }

        /* renamed from: b */
        public void mo3003b(D d) {
            super.mo3003b(d);
            C5121b<D> bVar = this.f9023p;
            if (bVar != null) {
                bVar.mo17780n();
                this.f9023p = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3005c() {
            if (C5114b.f9015c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f9020m.mo17782p();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3006d() {
            if (C5114b.f9015c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f9020m.mo17783q();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C5121b<D> mo17736e() {
            return this.f9020m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo17737f() {
            C0521j jVar = this.f9021n;
            C5116b<D> bVar = this.f9022o;
            if (jVar != null && bVar != null) {
                super.mo3001a(bVar);
                mo3000a(jVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f9018k);
            sb.append(" : ");
            C5001a.m8886a(this.f9020m, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: a */
        public void mo3001a(C0530q<? super D> qVar) {
            super.mo3001a(qVar);
            this.f9021n = null;
            this.f9022o = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5121b<D> mo17733a(boolean z) {
            if (C5114b.f9015c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f9020m.mo17770b();
            this.f9020m.mo17766a();
            C5116b<D> bVar = this.f9022o;
            if (bVar != null) {
                mo3001a(bVar);
                if (z) {
                    bVar.mo17741b();
                }
            }
            this.f9020m.mo17768a(this);
            if ((bVar == null || bVar.mo17740a()) && !z) {
                return this.f9020m;
            }
            this.f9020m.mo17780n();
            return this.f9023p;
        }

        /* renamed from: a */
        public void mo17735a(C5121b<D> bVar, D d) {
            if (C5114b.f9015c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo3003b(d);
                return;
            }
            if (C5114b.f9015c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo3002a(d);
        }

        /* renamed from: a */
        public void mo17734a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f9018k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f9019l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f9020m);
            C5121b<D> bVar = this.f9020m;
            bVar.mo17750a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f9022o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f9022o);
                C5116b<D> bVar2 = this.f9022o;
                bVar2.mo17739a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo17736e().mo17765a(mo2998a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo3004b());
        }
    }

    /* renamed from: a */
    public <D> C5121b<D> mo17725a(int i, Bundle bundle, C5112a.C5113a<D> aVar) {
        if (this.f9017b.mo17747d()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C5115a a = this.f9017b.mo17743a(i);
            if (f9015c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (a == null) {
                return m9399a(i, bundle, aVar, (C5121b) null);
            }
            if (f9015c) {
                Log.v("LoaderManager", "  Re-using existing loader " + a);
            }
            return a.mo17732a(this.f9016a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    public void mo17726a() {
        this.f9017b.mo17748e();
    }

    @Deprecated
    /* renamed from: a */
    public void mo17727a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f9017b.mo17745a(str, fileDescriptor, printWriter, strArr);
    }
}
