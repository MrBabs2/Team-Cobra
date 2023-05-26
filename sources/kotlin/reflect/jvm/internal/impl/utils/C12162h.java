package kotlin.reflect.jvm.internal.impl.utils;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.h */
/* compiled from: Jsr305State.kt */
public enum C12162h {
    IGNORE("ignore"),
    WARN(Malware.WARN),
    STRICT("strict");
    

    /* renamed from: f */
    private final String f31928f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.h$a */
    /* compiled from: Jsr305State.kt */
    public static final class C12163a {
        private C12163a() {
        }

        public /* synthetic */ C12163a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C12163a((DefaultConstructorMarker) null);
    }

    private C12162h(String str) {
        this.f31928f = str;
    }

    /* renamed from: a */
    public final String mo38769a() {
        return this.f31928f;
    }

    /* renamed from: d */
    public final boolean mo38770d() {
        return this == IGNORE;
    }

    /* renamed from: e */
    public final boolean mo38771e() {
        return this == WARN;
    }
}
