package kotlin.p218e0;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.C9168l;

/* renamed from: kotlin.e0.b */
/* compiled from: ObservableProperty.kt */
public abstract class C9131b<T> implements C9133d<Object, T> {

    /* renamed from: a */
    private T f25674a;

    public C9131b(T t) {
        this.f25674a = t;
    }

    /* renamed from: a */
    public T mo33474a(Object obj, C9168l<?> lVar) {
        C10202j.m34178b(lVar, "property");
        return this.f25674a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33476a(C9168l<?> lVar, T t, T t2) {
        C10202j.m34178b(lVar, "property");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo33477b(C9168l<?> lVar, T t, T t2) {
        C10202j.m34178b(lVar, "property");
        return true;
    }

    /* renamed from: a */
    public void mo33475a(Object obj, C9168l<?> lVar, T t) {
        C10202j.m34178b(lVar, "property");
        T t2 = this.f25674a;
        if (mo33477b(lVar, t2, t)) {
            this.f25674a = t;
            mo33476a(lVar, t2, t);
        }
    }
}
