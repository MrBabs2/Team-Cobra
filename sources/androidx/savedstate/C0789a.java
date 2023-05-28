package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0514f;

/* renamed from: androidx.savedstate.a */
/* compiled from: SavedStateRegistryController */
public final class C0789a {

    /* renamed from: a */
    private final C0790b f2884a;

    /* renamed from: b */
    private final SavedStateRegistry f2885b = new SavedStateRegistry();

    private C0789a(C0790b bVar) {
        this.f2884a = bVar;
    }

    /* renamed from: a */
    public SavedStateRegistry mo4477a() {
        return this.f2885b;
    }

    /* renamed from: b */
    public void mo4479b(Bundle bundle) {
        this.f2885b.mo4473a(bundle);
    }

    /* renamed from: a */
    public void mo4478a(Bundle bundle) {
        C0514f lifecycle = this.f2884a.getLifecycle();
        if (lifecycle.mo3038a() == C0514f.C0516b.INITIALIZED) {
            lifecycle.mo3039a(new Recreator(this.f2884a));
            this.f2885b.mo4474a(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: a */
    public static C0789a m3563a(C0790b bVar) {
        return new C0789a(bVar);
    }
}
