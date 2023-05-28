package p112n.p277e.p279b.p282b.p294w;

import android.graphics.Typeface;

/* renamed from: n.e.b.b.w.a */
/* compiled from: CancelableFontCallback */
public final class C10617a extends C10625f {

    /* renamed from: a */
    private final Typeface f28505a;

    /* renamed from: b */
    private final C10618a f28506b;

    /* renamed from: c */
    private boolean f28507c;

    /* renamed from: n.e.b.b.w.a$a */
    /* compiled from: CancelableFontCallback */
    public interface C10618a {
        /* renamed from: a */
        void mo31913a(Typeface typeface);
    }

    public C10617a(C10618a aVar, Typeface typeface) {
        this.f28505a = typeface;
        this.f28506b = aVar;
    }

    /* renamed from: a */
    public void mo31398a(Typeface typeface, boolean z) {
        m35946a(typeface);
    }

    /* renamed from: a */
    public void mo31397a(int i) {
        m35946a(this.f28505a);
    }

    /* renamed from: a */
    public void mo36203a() {
        this.f28507c = true;
    }

    /* renamed from: a */
    private void m35946a(Typeface typeface) {
        if (!this.f28507c) {
            this.f28506b.mo31913a(typeface);
        }
    }
}
