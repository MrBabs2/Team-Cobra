package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
/* compiled from: StateListAnimator */
public final class C8556f {

    /* renamed from: a */
    private final ArrayList<C8558b> f24489a = new ArrayList<>();

    /* renamed from: b */
    private C8558b f24490b = null;

    /* renamed from: c */
    ValueAnimator f24491c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f24492d = new C8557a();

    /* renamed from: com.google.android.material.internal.f$a */
    /* compiled from: StateListAnimator */
    class C8557a extends AnimatorListenerAdapter {
        C8557a() {
        }

        public void onAnimationEnd(Animator animator) {
            C8556f fVar = C8556f.this;
            if (fVar.f24491c == animator) {
                fVar.f24491c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* compiled from: StateListAnimator */
    static class C8558b {

        /* renamed from: a */
        final int[] f24494a;

        /* renamed from: b */
        final ValueAnimator f24495b;

        C8558b(int[] iArr, ValueAnimator valueAnimator) {
            this.f24494a = iArr;
            this.f24495b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m27961b() {
        ValueAnimator valueAnimator = this.f24491c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24491c = null;
        }
    }

    /* renamed from: a */
    public void mo31934a(int[] iArr, ValueAnimator valueAnimator) {
        C8558b bVar = new C8558b(iArr, valueAnimator);
        valueAnimator.addListener(this.f24492d);
        this.f24489a.add(bVar);
    }

    /* renamed from: a */
    public void mo31933a(int[] iArr) {
        C8558b bVar;
        int size = this.f24489a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f24489a.get(i);
            if (StateSet.stateSetMatches(bVar.f24494a, iArr)) {
                break;
            }
            i++;
        }
        C8558b bVar2 = this.f24490b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m27961b();
            }
            this.f24490b = bVar;
            if (bVar != null) {
                m27960a(bVar);
            }
        }
    }

    /* renamed from: a */
    private void m27960a(C8558b bVar) {
        ValueAnimator valueAnimator = bVar.f24495b;
        this.f24491c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo31932a() {
        ValueAnimator valueAnimator = this.f24491c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f24491c = null;
        }
    }
}
