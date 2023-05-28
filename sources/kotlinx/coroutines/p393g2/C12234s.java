package kotlinx.coroutines.p393g2;

import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12331y1;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo16641d2 = {"ZERO", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "restoreState", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.g2.s */
/* compiled from: ThreadContext.kt */
public final class C12234s {

    /* renamed from: a */
    private static final C12230o f32006a = new C12230o("ZERO");

    /* renamed from: b */
    private static final C9117p<Object, C9069g.C9072b, Object> f32007b = C12235a.f32011f;

    /* renamed from: c */
    private static final C9117p<C12331y1<?>, C9069g.C9072b, C12331y1<?>> f32008c = C12236b.f32012f;

    /* renamed from: d */
    private static final C9117p<C12241v, C9069g.C9072b, C12241v> f32009d = C12238d.f32014f;

    /* renamed from: e */
    private static final C9117p<C12241v, C9069g.C9072b, C12241v> f32010e = C12237c.f32013f;

    /* renamed from: kotlinx.coroutines.g2.s$a */
    /* compiled from: ThreadContext.kt */
    static final class C12235a extends C10203k implements C9117p<Object, C9069g.C9072b, Object> {

        /* renamed from: f */
        public static final C12235a f32011f = new C12235a();

        C12235a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, C9069g.C9072b bVar) {
            if (!(bVar instanceof C12331y1)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.g2.s$b */
    /* compiled from: ThreadContext.kt */
    static final class C12236b extends C10203k implements C9117p<C12331y1<?>, C9069g.C9072b, C12331y1<?>> {

        /* renamed from: f */
        public static final C12236b f32012f = new C12236b();

        C12236b() {
            super(2);
        }

        /* renamed from: a */
        public final C12331y1<?> invoke(C12331y1<?> y1Var, C9069g.C9072b bVar) {
            if (y1Var != null) {
                return y1Var;
            }
            if (!(bVar instanceof C12331y1)) {
                bVar = null;
            }
            return (C12331y1) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.g2.s$c */
    /* compiled from: ThreadContext.kt */
    static final class C12237c extends C10203k implements C9117p<C12241v, C9069g.C9072b, C12241v> {

        /* renamed from: f */
        public static final C12237c f32013f = new C12237c();

        C12237c() {
            super(2);
        }

        /* renamed from: a */
        public final C12241v mo38905a(C12241v vVar, C9069g.C9072b bVar) {
            if (bVar instanceof C12331y1) {
                ((C12331y1) bVar).mo38833a(vVar.mo38919a(), vVar.mo38922c());
            }
            return vVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            C12241v vVar = (C12241v) obj;
            mo38905a(vVar, (C9069g.C9072b) obj2);
            return vVar;
        }
    }

    /* renamed from: kotlinx.coroutines.g2.s$d */
    /* compiled from: ThreadContext.kt */
    static final class C12238d extends C10203k implements C9117p<C12241v, C9069g.C9072b, C12241v> {

        /* renamed from: f */
        public static final C12238d f32014f = new C12238d();

        C12238d() {
            super(2);
        }

        /* renamed from: a */
        public final C12241v mo38906a(C12241v vVar, C9069g.C9072b bVar) {
            if (bVar instanceof C12331y1) {
                vVar.mo38920a(((C12331y1) bVar).mo38832a(vVar.mo38919a()));
            }
            return vVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            C12241v vVar = (C12241v) obj;
            mo38906a(vVar, (C9069g.C9072b) obj2);
            return vVar;
        }
    }

    /* renamed from: a */
    public static final Object m40332a(C9069g gVar) {
        Object fold = gVar.fold(0, f32007b);
        if (fold != null) {
            return fold;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: b */
    public static final Object m40334b(C9069g gVar, Object obj) {
        if (obj == null) {
            obj = m40332a(gVar);
        }
        if (obj == 0) {
            return f32006a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new C12241v(gVar, ((Number) obj).intValue()), f32009d);
        }
        if (obj != null) {
            return ((C12331y1) obj).mo38832a(gVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: a */
    public static final void m40333a(C9069g gVar, Object obj) {
        if (obj != f32006a) {
            if (obj instanceof C12241v) {
                ((C12241v) obj).mo38921b();
                gVar.fold(obj, f32010e);
                return;
            }
            Object fold = gVar.fold(null, f32008c);
            if (fold != null) {
                ((C12331y1) fold).mo38833a(gVar, obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }
}
