package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9515b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "Factory", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.m0.d */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public abstract class C12033d implements C9515b {

    /* renamed from: b */
    public static final C12034a f31792b = new C12034a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C9939f f31793a;

    /* renamed from: kotlin.h0.u.e.m0.d$a */
    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class C12034a {
        private C12034a() {
        }

        /* renamed from: a */
        public final C12033d mo38670a(Object obj, C9939f fVar) {
            C10202j.m34178b(obj, DonationsAnalytics.VALUE);
            if (C12029b.m39753g(obj.getClass())) {
                return new C12054o(fVar, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new C12035e(fVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new C12039h(fVar, (Object[]) obj);
            }
            if (obj instanceof Class) {
                return new C12050k(fVar, (Class) obj);
            }
            return new C12056q(fVar, obj);
        }

        public /* synthetic */ C12034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12033d(C9939f fVar) {
        this.f31793a = fVar;
    }

    public C9939f getName() {
        return this.f31793a;
    }
}
