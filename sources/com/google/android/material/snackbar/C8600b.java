package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
/* compiled from: SnackbarManager */
class C8600b {

    /* renamed from: e */
    private static C8600b f24590e;

    /* renamed from: a */
    private final Object f24591a = new Object();

    /* renamed from: b */
    private final Handler f24592b = new Handler(Looper.getMainLooper(), new C8601a());

    /* renamed from: c */
    private C8603c f24593c;

    /* renamed from: d */
    private C8603c f24594d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    /* compiled from: SnackbarManager */
    class C8601a implements Handler.Callback {
        C8601a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C8600b.this.mo32027a((C8603c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    /* compiled from: SnackbarManager */
    interface C8602b {
        /* renamed from: a */
        void mo31986a(int i);

        void show();
    }

    /* renamed from: com.google.android.material.snackbar.b$c */
    /* compiled from: SnackbarManager */
    private static class C8603c {

        /* renamed from: a */
        final WeakReference<C8602b> f24596a;

        /* renamed from: b */
        int f24597b;

        /* renamed from: c */
        boolean f24598c;

        C8603c(int i, C8602b bVar) {
            this.f24596a = new WeakReference<>(bVar);
            this.f24597b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo32034a(C8602b bVar) {
            return bVar != null && this.f24596a.get() == bVar;
        }
    }

    private C8600b() {
    }

    /* renamed from: a */
    static C8600b m28092a() {
        if (f24590e == null) {
            f24590e = new C8600b();
        }
        return f24590e;
    }

    /* renamed from: f */
    private boolean m28096f(C8602b bVar) {
        C8603c cVar = this.f24593c;
        return cVar != null && cVar.mo32034a(bVar);
    }

    /* renamed from: g */
    private boolean m28097g(C8602b bVar) {
        C8603c cVar = this.f24594d;
        return cVar != null && cVar.mo32034a(bVar);
    }

    /* renamed from: b */
    public void mo32029b(C8602b bVar) {
        synchronized (this.f24591a) {
            if (m28096f(bVar)) {
                this.f24593c = null;
                if (this.f24594d != null) {
                    m28094b();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo32030c(C8602b bVar) {
        synchronized (this.f24591a) {
            if (m28096f(bVar)) {
                m28095b(this.f24593c);
            }
        }
    }

    /* renamed from: d */
    public void mo32031d(C8602b bVar) {
        synchronized (this.f24591a) {
            if (m28096f(bVar) && !this.f24593c.f24598c) {
                this.f24593c.f24598c = true;
                this.f24592b.removeCallbacksAndMessages(this.f24593c);
            }
        }
    }

    /* renamed from: e */
    public void mo32032e(C8602b bVar) {
        synchronized (this.f24591a) {
            if (m28096f(bVar) && this.f24593c.f24598c) {
                this.f24593c.f24598c = false;
                m28095b(this.f24593c);
            }
        }
    }

    /* renamed from: a */
    public void mo32025a(int i, C8602b bVar) {
        synchronized (this.f24591a) {
            if (m28096f(bVar)) {
                this.f24593c.f24597b = i;
                this.f24592b.removeCallbacksAndMessages(this.f24593c);
                m28095b(this.f24593c);
                return;
            }
            if (m28097g(bVar)) {
                this.f24594d.f24597b = i;
            } else {
                this.f24594d = new C8603c(i, bVar);
            }
            if (this.f24593c == null || !m28093a(this.f24593c, 4)) {
                this.f24593c = null;
                m28094b();
            }
        }
    }

    /* renamed from: b */
    private void m28094b() {
        C8603c cVar = this.f24594d;
        if (cVar != null) {
            this.f24593c = cVar;
            this.f24594d = null;
            C8602b bVar = (C8602b) cVar.f24596a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f24593c = null;
            }
        }
    }

    /* renamed from: b */
    private void m28095b(C8603c cVar) {
        int i = cVar.f24597b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f24592b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f24592b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: a */
    public void mo32026a(C8602b bVar, int i) {
        synchronized (this.f24591a) {
            if (m28096f(bVar)) {
                m28093a(this.f24593c, i);
            } else if (m28097g(bVar)) {
                m28093a(this.f24594d, i);
            }
        }
    }

    /* renamed from: a */
    public boolean mo32028a(C8602b bVar) {
        boolean z;
        synchronized (this.f24591a) {
            if (!m28096f(bVar)) {
                if (!m28097g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m28093a(C8603c cVar, int i) {
        C8602b bVar = (C8602b) cVar.f24596a.get();
        if (bVar == null) {
            return false;
        }
        this.f24592b.removeCallbacksAndMessages(cVar);
        bVar.mo31986a(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32027a(C8603c cVar) {
        synchronized (this.f24591a) {
            if (this.f24593c == cVar || this.f24594d == cVar) {
                m28093a(cVar, 2);
            }
        }
    }
}
