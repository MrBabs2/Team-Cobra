package kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1;

import java.util.ArrayList;

/* renamed from: kotlin.h0.u.e.k0.k.j1.a */
/* compiled from: TypeSystemContext.kt */
public final class C11902a extends ArrayList<C11912k> implements C11911j {
    public C11902a(int i) {
        super(i);
    }

    /* renamed from: a */
    public /* bridge */ boolean mo38564a(C11912k kVar) {
        return super.contains(kVar);
    }

    /* renamed from: b */
    public /* bridge */ int mo38565b() {
        return super.size();
    }

    /* renamed from: c */
    public /* bridge */ int mo38567c(C11912k kVar) {
        return super.lastIndexOf(kVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C11912k) {
            return mo38564a((C11912k) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean mo38569d(C11912k kVar) {
        return super.remove(kVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C11912k) {
            return mo38566b((C11912k) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C11912k) {
            return mo38567c((C11912k) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C11912k) {
            return mo38569d((C11912k) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return mo38565b();
    }

    /* renamed from: b */
    public /* bridge */ int mo38566b(C11912k kVar) {
        return super.indexOf(kVar);
    }
}
