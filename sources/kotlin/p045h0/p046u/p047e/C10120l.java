package kotlin.p045h0.p046u.p047e;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.C9162i;
import kotlin.p045h0.p046u.p047e.C10150s;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001cB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "T", "R", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "set", "", "receiver", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.l */
/* compiled from: KProperty1Impl.kt */
public final class C10120l<T, R> extends C10142q<T, R> implements C9162i<T, R> {

    /* renamed from: r */
    private final C10176z.C10178b<C10121a<T, R>> f27741r;

    /* renamed from: kotlin.h0.u.e.l$a */
    /* compiled from: KProperty1Impl.kt */
    public static final class C10121a<T, R> extends C10150s.C10156d<R> implements C9162i.C9163a<T, R> {

        /* renamed from: m */
        private final C10120l<T, R> f27742m;

        public C10121a(C10120l<T, R> lVar) {
            C10202j.m34178b(lVar, "property");
            this.f27742m = lVar;
        }

        /* renamed from: d */
        public C10120l<T, R> m34048d() {
            return this.f27742m;
        }

        public void invoke(T t, R r) {
            m34049d().mo33515a(t, r);
        }
    }

    /* renamed from: kotlin.h0.u.e.l$b */
    /* compiled from: KProperty1Impl.kt */
    static final class C10122b extends C10203k implements C9102a<C10121a<T, R>> {

        /* renamed from: f */
        final /* synthetic */ C10120l f27743f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10122b(C10120l lVar) {
            super(0);
            this.f27743f = lVar;
        }

        public final C10121a<T, R> invoke() {
            return new C10121a<>(this.f27743f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10120l(C9247i iVar, String str, String str2, Object obj) {
        super(iVar, str, str2, obj);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, RoomInstalled.SIGNATURE);
        C10176z.C10178b<C10121a<T, R>> a = C10176z.m34123a(new C10122b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Setter(this) }");
        this.f27741r = a;
    }

    /* renamed from: a */
    public void mo33515a(T t, R r) {
        getSetter().call(t, r);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10120l(C9247i iVar, C10352i0 i0Var) {
        super(iVar, i0Var);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(i0Var, "descriptor");
        C10176z.C10178b<C10121a<T, R>> a = C10176z.m34123a(new C10122b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Setter(this) }");
        this.f27741r = a;
    }

    public C10121a<T, R> getSetter() {
        C10121a<T, R> a = this.f27741r.mo35358a();
        C10202j.m34174a((Object) a, "_setter()");
        return a;
    }
}
