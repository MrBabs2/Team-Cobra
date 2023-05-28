package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzk;
import java.lang.ref.WeakReference;

@zzard
/* renamed from: com.google.android.gms.internal.ads.k7 */
final class C7648k7 extends C7722m7 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f15819g;

    public C7648k7(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f15819g = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26162a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26163b(ViewTreeObserver viewTreeObserver) {
        zzk.zzli().mo27818a(viewTreeObserver, (ViewTreeObserver.OnGlobalLayoutListener) this);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f15819g.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo26230b();
        }
    }
}
