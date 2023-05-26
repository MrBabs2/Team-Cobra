package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.x */
/* compiled from: ViewModelStore */
public class C0546x {

    /* renamed from: a */
    private final HashMap<String, C0542v> f2208a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3099a(String str, C0542v vVar) {
        C0542v put = this.f2208a.put(str, vVar);
        if (put != null) {
            put.mo2920b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0542v mo3097a(String str) {
        return this.f2208a.get(str);
    }

    /* renamed from: a */
    public final void mo3098a() {
        for (C0542v a : this.f2208a.values()) {
            a.mo3093a();
        }
        this.f2208a.clear();
    }
}
