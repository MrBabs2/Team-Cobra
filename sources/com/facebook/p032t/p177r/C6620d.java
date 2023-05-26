package com.facebook.p032t.p177r;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C4716f;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C4728g;
import com.facebook.p032t.p177r.p178g.C6631a;
import com.facebook.p032t.p177r.p178g.C6639f;
import com.facebook.p032t.p181u.C6650b;
import java.lang.ref.WeakReference;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.facebook.t.r.d */
/* compiled from: RCTCodelessLoggingEventListener */
public class C6620d {

    /* renamed from: com.facebook.t.r.d$a */
    /* compiled from: RCTCodelessLoggingEventListener */
    public static class C6621a implements View.OnTouchListener {

        /* renamed from: f */
        private C6631a f12315f;

        /* renamed from: g */
        private WeakReference<View> f12316g;

        /* renamed from: h */
        private WeakReference<View> f12317h;

        /* renamed from: i */
        private View.OnTouchListener f12318i;

        /* renamed from: j */
        private boolean f12319j = false;

        /* renamed from: com.facebook.t.r.d$a$a */
        /* compiled from: RCTCodelessLoggingEventListener */
        class C6622a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f12320f;

            /* renamed from: g */
            final /* synthetic */ Bundle f12321g;

            C6622a(C6621a aVar, String str, Bundle bundle) {
                this.f12320f = str;
                this.f12321g = bundle;
            }

            public void run() {
                if (!C6391a.m13260a((Object) this)) {
                    try {
                        C4728g.m7729b(C4716f.m7696e()).mo15779a(this.f12320f, this.f12321g);
                    } catch (Throwable th) {
                        C6391a.m13259a(th, this);
                    }
                }
            }
        }

        public C6621a(C6631a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f12318i = C6639f.m14141g(view2);
                this.f12315f = aVar;
                this.f12316g = new WeakReference<>(view2);
                this.f12317h = new WeakReference<>(view);
                this.f12319j = true;
            }
        }

        /* renamed from: b */
        private void m14096b() {
            C6631a aVar = this.f12315f;
            if (aVar != null) {
                String b = aVar.mo21389b();
                Bundle a = C6616c.m14075a(this.f12315f, (View) this.f12317h.get(), (View) this.f12316g.get());
                if (a.containsKey("_valueToSum")) {
                    a.putDouble("_valueToSum", C6650b.m14181a(a.getString("_valueToSum")));
                }
                a.putString("_is_fb_codeless", DiskLruCache.VERSION_1);
                C4716f.m7704m().execute(new C6622a(this, b, a));
            }
        }

        /* renamed from: a */
        public boolean mo21376a() {
            return this.f12319j;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                m14096b();
            }
            View.OnTouchListener onTouchListener = this.f12318i;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C6621a m14095a(C6631a aVar, View view, View view2) {
        Class<C6620d> cls = C6620d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return new C6621a(aVar, view, view2);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
