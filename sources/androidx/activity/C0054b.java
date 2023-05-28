package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* compiled from: OnBackPressedCallback */
public abstract class C0054b {

    /* renamed from: a */
    private boolean f101a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0053a> f102b = new CopyOnWriteArrayList<>();

    public C0054b(boolean z) {
        this.f101a = z;
    }

    /* renamed from: a */
    public abstract void mo142a();

    /* renamed from: a */
    public final void mo144a(boolean z) {
        this.f101a = z;
    }

    /* renamed from: b */
    public final boolean mo146b() {
        return this.f101a;
    }

    /* renamed from: c */
    public final void mo147c() {
        Iterator<C0053a> it = this.f102b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo143a(C0053a aVar) {
        this.f102b.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo145b(C0053a aVar) {
        this.f102b.remove(aVar);
    }
}
