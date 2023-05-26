package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzk;

@zzard
public final class zzazs {

    /* renamed from: a */
    private final View f18721a;

    /* renamed from: b */
    private Activity f18722b;

    /* renamed from: c */
    private boolean f18723c;

    /* renamed from: d */
    private boolean f18724d;

    /* renamed from: e */
    private boolean f18725e;

    /* renamed from: f */
    private ViewTreeObserver.OnGlobalLayoutListener f18726f;

    public zzazs(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f18722b = activity;
        this.f18721a = view;
        this.f18726f = onGlobalLayoutListener;
    }

    /* renamed from: e */
    private final void m20459e() {
        ViewTreeObserver b;
        if (!this.f18723c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f18726f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f18722b;
                if (!(activity == null || (b = m20458b(activity)) == null)) {
                    b.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                zzk.zzmd();
                zzbbz.m20571a(this.f18721a, this.f18726f);
            }
            this.f18723c = true;
        }
    }

    /* renamed from: f */
    private final void m20460f() {
        ViewTreeObserver b;
        Activity activity = this.f18722b;
        if (activity != null && this.f18723c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f18726f;
            if (!(onGlobalLayoutListener == null || (b = m20458b(activity)) == null)) {
                zzk.zzli().mo27818a(b, onGlobalLayoutListener);
            }
            this.f18723c = false;
        }
    }

    /* renamed from: a */
    public final void mo27874a(Activity activity) {
        this.f18722b = activity;
    }

    /* renamed from: b */
    public final void mo27875b() {
        this.f18724d = false;
        m20460f();
    }

    /* renamed from: c */
    public final void mo27876c() {
        this.f18725e = true;
        if (this.f18724d) {
            m20459e();
        }
    }

    /* renamed from: d */
    public final void mo27877d() {
        this.f18725e = false;
        m20460f();
    }

    /* renamed from: a */
    public final void mo27873a() {
        this.f18724d = true;
        if (this.f18725e) {
            m20459e();
        }
    }

    /* renamed from: b */
    private static ViewTreeObserver m20458b(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
