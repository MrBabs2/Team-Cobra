package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.p */
/* compiled from: PackageReference.kt */
public final class C10208p implements C10195d {

    /* renamed from: f */
    private final Class<?> f27846f;

    public C10208p(Class<?> cls, String str) {
        C10202j.m34178b(cls, "jClass");
        C10202j.m34178b(str, "moduleName");
        this.f27846f = cls;
    }

    /* renamed from: a */
    public Class<?> mo33537a() {
        return this.f27846f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10208p) && C10202j.m34176a((Object) mo33537a(), (Object) ((C10208p) obj).mo33537a());
    }

    public int hashCode() {
        return mo33537a().hashCode();
    }

    public String toString() {
        return mo33537a().toString() + " (Kotlin reflection is not available)";
    }
}
