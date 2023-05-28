package com.facebook.p032t.p177r;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.C4716f;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C4728g;
import com.facebook.p032t.p177r.p178g.C6631a;
import com.facebook.p032t.p177r.p178g.C6639f;
import com.facebook.p032t.p181u.C6650b;
import java.lang.ref.WeakReference;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.facebook.t.r.a */
/* compiled from: CodelessLoggingEventListener */
public class C6609a {

    /* renamed from: com.facebook.t.r.a$a */
    /* compiled from: CodelessLoggingEventListener */
    static class C6610a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f12278f;

        /* renamed from: g */
        final /* synthetic */ Bundle f12279g;

        C6610a(String str, Bundle bundle) {
            this.f12278f = str;
            this.f12279g = bundle;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C4728g.m7729b(C4716f.m7696e()).mo15779a(this.f12278f, this.f12279g);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.r.a$b */
    /* compiled from: CodelessLoggingEventListener */
    public static class C6611b implements View.OnClickListener {

        /* renamed from: f */
        private C6631a f12280f;

        /* renamed from: g */
        private WeakReference<View> f12281g;

        /* renamed from: h */
        private WeakReference<View> f12282h;

        /* renamed from: i */
        private View.OnClickListener f12283i;

        /* renamed from: j */
        private boolean f12284j;

        /* synthetic */ C6611b(C6631a aVar, View view, View view2, C6610a aVar2) {
            this(aVar, view, view2);
        }

        /* renamed from: a */
        public boolean mo21360a() {
            return this.f12284j;
        }

        public void onClick(View view) {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (this.f12283i != null) {
                        this.f12283i.onClick(view);
                    }
                    if (this.f12282h.get() != null && this.f12281g.get() != null) {
                        C6609a.m14054a(this.f12280f, (View) this.f12282h.get(), (View) this.f12281g.get());
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }

        private C6611b(C6631a aVar, View view, View view2) {
            this.f12284j = false;
            if (aVar != null && view != null && view2 != null) {
                this.f12283i = C6639f.m14140f(view2);
                this.f12280f = aVar;
                this.f12281g = new WeakReference<>(view2);
                this.f12282h = new WeakReference<>(view);
                this.f12284j = true;
            }
        }
    }

    /* renamed from: com.facebook.t.r.a$c */
    /* compiled from: CodelessLoggingEventListener */
    public static class C6612c implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        private C6631a f12285f;

        /* renamed from: g */
        private WeakReference<AdapterView> f12286g;

        /* renamed from: h */
        private WeakReference<View> f12287h;

        /* renamed from: i */
        private AdapterView.OnItemClickListener f12288i;

        /* renamed from: j */
        private boolean f12289j;

        /* synthetic */ C6612c(C6631a aVar, View view, AdapterView adapterView, C6610a aVar2) {
            this(aVar, view, adapterView);
        }

        /* renamed from: a */
        public boolean mo21362a() {
            return this.f12289j;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.f12288i;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.f12287h.get() != null && this.f12286g.get() != null) {
                C6609a.m14054a(this.f12285f, (View) this.f12287h.get(), (View) this.f12286g.get());
            }
        }

        private C6612c(C6631a aVar, View view, AdapterView adapterView) {
            this.f12289j = false;
            if (aVar != null && view != null && adapterView != null) {
                this.f12288i = adapterView.getOnItemClickListener();
                this.f12285f = aVar;
                this.f12286g = new WeakReference<>(adapterView);
                this.f12287h = new WeakReference<>(view);
                this.f12289j = true;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14054a(C6631a aVar, View view, View view2) {
        Class<C6609a> cls = C6609a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                m14056c(aVar, view, view2);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static C6611b m14055b(C6631a aVar, View view, View view2) {
        Class<C6609a> cls = C6609a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return new C6611b(aVar, view, view2, (C6610a) null);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private static void m14056c(C6631a aVar, View view, View view2) {
        Class<C6609a> cls = C6609a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                String b = aVar.mo21389b();
                Bundle a = C6616c.m14075a(aVar, view, view2);
                if (a.containsKey("_valueToSum")) {
                    a.putDouble("_valueToSum", C6650b.m14181a(a.getString("_valueToSum")));
                }
                a.putString("_is_fb_codeless", DiskLruCache.VERSION_1);
                C4716f.m7704m().execute(new C6610a(b, a));
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    public static C6612c m14053a(C6631a aVar, View view, AdapterView adapterView) {
        Class<C6609a> cls = C6609a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return new C6612c(aVar, view, adapterView, (C6610a) null);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
