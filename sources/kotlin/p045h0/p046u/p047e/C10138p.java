package kotlin.p045h0.p046u.p047e;

import kotlin.C10219k;
import kotlin.C4789l;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.C9171m;
import kotlin.p045h0.p046u.p047e.C10150s;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0014X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "R", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "kotlin.jvm.PlatformType", "delegateFieldValue", "Lkotlin/Lazy;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.p */
/* compiled from: KProperty0Impl.kt */
public class C10138p<R> extends C10150s<R> implements C9171m<R> {

    /* renamed from: q */
    private final C10176z.C10178b<C10139a<R>> f27770q;

    /* renamed from: r */
    private final C9134f<Object> f27771r = C10181i.m34135a(C10219k.PUBLICATION, new C10141c(this));

    /* renamed from: kotlin.h0.u.e.p$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class C10139a<R> extends C10150s.C10153c<R> implements C9171m.C9172a<R> {

        /* renamed from: m */
        private final C10138p<R> f27772m;

        public C10139a(C10138p<? extends R> pVar) {
            C10202j.m34178b(pVar, "property");
            this.f27772m = pVar;
        }

        public R invoke() {
            return m34077d().get();
        }

        /* renamed from: d */
        public C10138p<R> m34076d() {
            return this.f27772m;
        }
    }

    /* renamed from: kotlin.h0.u.e.p$b */
    /* compiled from: KProperty0Impl.kt */
    static final class C10140b extends C10203k implements C9102a<C10139a<? extends R>> {

        /* renamed from: f */
        final /* synthetic */ C10138p f27773f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10140b(C10138p pVar) {
            super(0);
            this.f27773f = pVar;
        }

        public final C10139a<R> invoke() {
            return new C10139a<>(this.f27773f);
        }
    }

    /* renamed from: kotlin.h0.u.e.p$c */
    /* compiled from: KProperty0Impl.kt */
    static final class C10141c extends C10203k implements C9102a<Object> {

        /* renamed from: f */
        final /* synthetic */ C10138p f27774f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10141c(C10138p pVar) {
            super(0);
            this.f27774f = pVar;
        }

        public final Object invoke() {
            C10138p pVar = this.f27774f;
            return pVar.mo35340a(pVar.mo35343r(), this.f27774f.mo35344s());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10138p(C9247i iVar, C10352i0 i0Var) {
        super(iVar, i0Var);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(i0Var, "descriptor");
        C10176z.C10178b<C10139a<R>> a = C10176z.m34123a(new C10140b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Getter(this) }");
        this.f27770q = a;
    }

    public R get() {
        return getGetter().call(new Object[0]);
    }

    public Object getDelegate() {
        return this.f27771r.getValue();
    }

    public R invoke() {
        return get();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10138p(C9247i iVar, String str, String str2, Object obj) {
        super(iVar, str, str2, obj);
        C10202j.m34178b(iVar, "container");
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, RoomInstalled.SIGNATURE);
        C10176z.C10178b<C10139a<R>> a = C10176z.m34123a(new C10140b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Getter(this) }");
        this.f27770q = a;
    }

    public C10139a<R> getGetter() {
        C10139a<R> a = this.f27770q.mo35358a();
        C10202j.m34174a((Object) a, "_getter()");
        return a;
    }
}
