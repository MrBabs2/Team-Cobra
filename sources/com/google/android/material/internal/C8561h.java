package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p112n.p277e.p279b.p282b.p294w.C10621d;
import p112n.p277e.p279b.p282b.p294w.C10625f;

/* renamed from: com.google.android.material.internal.h */
/* compiled from: TextDrawableHelper */
public class C8561h {

    /* renamed from: a */
    private final TextPaint f24509a = new TextPaint(1);

    /* renamed from: b */
    private final C10625f f24510b = new C8562a();

    /* renamed from: c */
    private float f24511c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f24512d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C8563b> f24513e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private C10621d f24514f;

    /* renamed from: com.google.android.material.internal.h$b */
    /* compiled from: TextDrawableHelper */
    public interface C8563b {
        /* renamed from: a */
        void mo30883a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C8561h(C8563b bVar) {
        mo31945a(bVar);
    }

    /* renamed from: b */
    public TextPaint mo31948b() {
        return this.f24509a;
    }

    /* renamed from: com.google.android.material.internal.h$a */
    /* compiled from: TextDrawableHelper */
    class C8562a extends C10625f {
        C8562a() {
        }

        /* renamed from: a */
        public void mo31398a(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C8561h.this.f24512d = true;
                C8563b bVar = (C8563b) C8561h.this.f24513e.get();
                if (bVar != null) {
                    bVar.mo30883a();
                }
            }
        }

        /* renamed from: a */
        public void mo31397a(int i) {
            boolean unused = C8561h.this.f24512d = true;
            C8563b bVar = (C8563b) C8561h.this.f24513e.get();
            if (bVar != null) {
                bVar.mo30883a();
            }
        }
    }

    /* renamed from: a */
    public void mo31945a(C8563b bVar) {
        this.f24513e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo31947a(boolean z) {
        this.f24512d = z;
    }

    /* renamed from: a */
    public float mo31942a(String str) {
        if (!this.f24512d) {
            return this.f24511c;
        }
        float a = m27973a((CharSequence) str);
        this.f24511c = a;
        this.f24512d = false;
        return a;
    }

    /* renamed from: a */
    private float m27973a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f24509a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public C10621d mo31943a() {
        return this.f24514f;
    }

    /* renamed from: a */
    public void mo31946a(C10621d dVar, Context context) {
        if (this.f24514f != dVar) {
            this.f24514f = dVar;
            if (dVar != null) {
                dVar.mo36210c(context, this.f24509a, this.f24510b);
                C8563b bVar = (C8563b) this.f24513e.get();
                if (bVar != null) {
                    this.f24509a.drawableState = bVar.getState();
                }
                dVar.mo36209b(context, this.f24509a, this.f24510b);
                this.f24512d = true;
            }
            C8563b bVar2 = (C8563b) this.f24513e.get();
            if (bVar2 != null) {
                bVar2.mo30883a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: a */
    public void mo31944a(Context context) {
        this.f24514f.mo36209b(context, this.f24509a, this.f24510b);
    }
}
