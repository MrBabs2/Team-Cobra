package kotlin.p045h0.p046u.p047e;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.C9160h;
import kotlin.p045h0.p046u.p047e.C10150s;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001aB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "R", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "set", "", "value", "(Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.k */
/* compiled from: KProperty0Impl.kt */
public final class C9321k<R> extends C10138p<R> implements C9160h<R> {

    /* renamed from: s */
    private final C10176z.C10178b<C9322a<R>> f25889s;

    /* renamed from: kotlin.h0.u.e.k$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class C9322a<R> extends C10150s.C10156d<R> implements C9160h.C9161a<R> {

        /* renamed from: m */
        private final C9321k<R> f25890m;

        public C9322a(C9321k<R> kVar) {
            C10202j.m34178b(kVar, "property");
            this.f25890m = kVar;
        }

        /* renamed from: d */
        public C9321k<R> m30141d() {
            return this.f25890m;
        }

        public void invoke(R r) {
            m30142d().mo33686a(r);
        }
    }

    /* renamed from: kotlin.h0.u.e.k$b */
    /* compiled from: KProperty0Impl.kt */
    static final class C9323b extends C10203k implements C9102a<C9322a<R>> {

        /* renamed from: f */
        final /* synthetic */ C9321k f25891f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9323b(C9321k kVar) {
            super(0);
            this.f25891f = kVar;
        }

        public final C9322a<R> invoke() {
            return new C9322a<>(this.f25891f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9321k(C9247i iVar, C10352i0 i0Var) {
        super(iVar, i0Var);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(i0Var, "descriptor");
        C10176z.C10178b<C9322a<R>> a = C10176z.m34123a(new C9323b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Setter(this) }");
        this.f25889s = a;
    }

    /* renamed from: a */
    public void mo33686a(R r) {
        getSetter().call(r);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9321k(C9247i iVar, String str, String str2, Object obj) {
        super(iVar, str, str2, obj);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, RoomInstalled.SIGNATURE);
        C10176z.C10178b<C9322a<R>> a = C10176z.m34123a(new C9323b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Setter(this) }");
        this.f25889s = a;
    }

    public C9322a<R> getSetter() {
        C9322a<R> a = this.f25889s.mo35358a();
        C10202j.m34174a((Object) a, "_setter()");
        return a;
    }
}
