package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@zzard
/* renamed from: com.google.android.gms.internal.ads.m7 */
abstract class C7722m7 {

    /* renamed from: f */
    private final WeakReference<View> f16203f;

    public C7722m7(View view) {
        this.f16203f = new WeakReference<>(view);
    }

    /* renamed from: c */
    private final ViewTreeObserver m17548c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f16203f.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: a */
    public final void mo26229a() {
        ViewTreeObserver c = m17548c();
        if (c != null) {
            mo26162a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26162a(ViewTreeObserver viewTreeObserver);

    /* renamed from: b */
    public final void mo26230b() {
        ViewTreeObserver c = m17548c();
        if (c != null) {
            mo26163b(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo26163b(ViewTreeObserver viewTreeObserver);
}
