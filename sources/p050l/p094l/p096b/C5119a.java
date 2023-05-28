package p050l.p094l.p096b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.p004os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p050l.p075h.p083k.C5009i;

/* renamed from: l.l.b.a */
/* compiled from: AsyncTaskLoader */
public abstract class C5119a<D> extends C5121b<D> {

    /* renamed from: i */
    private final Executor f9030i;

    /* renamed from: j */
    volatile C5119a<D>.C0000a f9031j;

    /* renamed from: k */
    volatile C5119a<D>.C0000a f9032k;

    /* renamed from: l */
    long f9033l;

    /* renamed from: m */
    long f9034m;

    /* renamed from: n */
    Handler f9035n;

    /* renamed from: l.l.b.a$a */
    /* compiled from: AsyncTaskLoader */
    final class C5120a extends C5124c<Void, Void, D> implements Runnable {

        /* renamed from: o */
        private final CountDownLatch f9036o = new CountDownLatch(1);

        /* renamed from: p */
        boolean f9037p;

        C5120a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo17762b(D d) {
            try {
                C5119a.this.mo17751a(this, d);
            } finally {
                this.f9036o.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo17763c(D d) {
            try {
                C5119a.this.mo17752b(this, d);
            } finally {
                this.f9036o.countDown();
            }
        }

        public void run() {
            this.f9037p = false;
            C5119a.this.mo17757s();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo17760a(Void... voidArr) {
            try {
                return C5119a.this.mo17759u();
            } catch (OperationCanceledException e) {
                if (mo17788a()) {
                    return null;
                }
                throw e;
            }
        }
    }

    public C5119a(Context context) {
        this(context, C5124c.f9049m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17751a(C5119a<D>.C0000a aVar, D d) {
        mo17753c(d);
        if (this.f9032k == aVar) {
            mo17781o();
            this.f9034m = SystemClock.uptimeMillis();
            this.f9032k = null;
            mo17772d();
            mo17757s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17752b(C5119a<D>.C0000a aVar, D d) {
        if (this.f9031j != aVar) {
            mo17751a(aVar, d);
        } else if (mo17774f()) {
            mo17753c(d);
        } else {
            mo17771c();
            this.f9034m = SystemClock.uptimeMillis();
            this.f9031j = null;
            mo17769b(d);
        }
    }

    /* renamed from: c */
    public void mo17753c(D d) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo17754h() {
        if (this.f9031j == null) {
            return false;
        }
        if (!this.f9042d) {
            this.f9045g = true;
        }
        if (this.f9032k != null) {
            if (this.f9031j.f9037p) {
                this.f9031j.f9037p = false;
                this.f9035n.removeCallbacks(this.f9031j);
            }
            this.f9031j = null;
            return false;
        } else if (this.f9031j.f9037p) {
            this.f9031j.f9037p = false;
            this.f9035n.removeCallbacks(this.f9031j);
            this.f9031j = null;
            return false;
        } else {
            boolean a = this.f9031j.mo17789a(false);
            if (a) {
                this.f9032k = this.f9031j;
                mo17756r();
            }
            this.f9031j = null;
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo17755j() {
        super.mo17755j();
        mo17770b();
        this.f9031j = new C5120a();
        mo17757s();
    }

    /* renamed from: r */
    public void mo17756r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo17757s() {
        if (this.f9032k == null && this.f9031j != null) {
            if (this.f9031j.f9037p) {
                this.f9031j.f9037p = false;
                this.f9035n.removeCallbacks(this.f9031j);
            }
            if (this.f9033l <= 0 || SystemClock.uptimeMillis() >= this.f9034m + this.f9033l) {
                this.f9031j.mo17786a(this.f9030i, (Params[]) null);
                return;
            }
            this.f9031j.f9037p = true;
            this.f9035n.postAtTime(this.f9031j, this.f9034m + this.f9033l);
        }
    }

    /* renamed from: t */
    public abstract D mo17758t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public D mo17759u() {
        return mo17758t();
    }

    private C5119a(Context context, Executor executor) {
        super(context);
        this.f9034m = -10000;
        this.f9030i = executor;
    }

    @Deprecated
    /* renamed from: a */
    public void mo17750a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo17750a(str, fileDescriptor, printWriter, strArr);
        if (this.f9031j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f9031j);
            printWriter.print(" waiting=");
            printWriter.println(this.f9031j.f9037p);
        }
        if (this.f9032k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f9032k);
            printWriter.print(" waiting=");
            printWriter.println(this.f9032k.f9037p);
        }
        if (this.f9033l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C5009i.m8906a(this.f9033l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C5009i.m8905a(this.f9034m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
