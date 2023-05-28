package kotlin.p045h0.p046u.p047e.p222j0;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9688a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9691b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\b\u0002\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "klass", "Ljava/lang/Class;", "classHeader", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;)V", "getClassHeader", "()Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getKlass", "()Ljava/lang/Class;", "location", "", "getLocation", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "loadClassAnnotations", "", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "cachedContents", "", "toString", "visitMembers", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "Factory", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.j0.f */
/* compiled from: ReflectKotlinClass.kt */
public final class C9310f implements C9724o {

    /* renamed from: c */
    public static final C9311a f25877c = new C9311a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Class<?> f25878a;

    /* renamed from: b */
    private final C9688a f25879b;

    /* renamed from: kotlin.h0.u.e.j0.f$a */
    /* compiled from: ReflectKotlinClass.kt */
    public static final class C9311a {
        private C9311a() {
        }

        /* renamed from: a */
        public final C9310f mo33670a(Class<?> cls) {
            C10202j.m34178b(cls, "klass");
            C9691b bVar = new C9691b();
            C9307c.f25875a.mo33656a(cls, (C9724o.C9727c) bVar);
            C9688a b = bVar.mo34269b();
            if (b != null) {
                return new C9310f(cls, b, (DefaultConstructorMarker) null);
            }
            return null;
        }

        public /* synthetic */ C9311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C9310f(Class<?> cls, C9688a aVar) {
        this.f25878a = cls;
        this.f25879b = aVar;
    }

    /* renamed from: a */
    public C9688a mo33661a() {
        return this.f25879b;
    }

    /* renamed from: b */
    public final Class<?> mo33664b() {
        return this.f25878a;
    }

    /* renamed from: d */
    public C9933a mo33665d() {
        return C12029b.m39748b(this.f25878a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9310f) && C10202j.m34176a((Object) this.f25878a, (Object) ((C9310f) obj).f25878a);
    }

    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.f25878a.getName();
        C10202j.m34174a((Object) name, "klass.name");
        sb.append(C12130v.m40043a(name, '.', '/', false, 4, (Object) null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f25878a.hashCode();
    }

    public String toString() {
        return C9310f.class.getName() + ": " + this.f25878a;
    }

    public /* synthetic */ C9310f(Class cls, C9688a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    /* renamed from: a */
    public void mo33662a(C9724o.C9727c cVar, byte[] bArr) {
        C10202j.m34178b(cVar, "visitor");
        C9307c.f25875a.mo33656a(this.f25878a, cVar);
    }

    /* renamed from: a */
    public void mo33663a(C9724o.C9728d dVar, byte[] bArr) {
        C10202j.m34178b(dVar, "visitor");
        C9307c.f25875a.mo33657a(this.f25878a, dVar);
    }
}
