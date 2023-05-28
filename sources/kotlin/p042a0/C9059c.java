package kotlin.p042a0;

import java.io.Serializable;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10214v;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo16641d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.a0.c */
/* compiled from: CoroutineContextImpl.kt */
public final class C9059c implements C9069g, Serializable {

    /* renamed from: f */
    private final C9069g f25645f;

    /* renamed from: g */
    private final C9069g.C9072b f25646g;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo16641d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: kotlin.a0.c$a */
    /* compiled from: CoroutineContextImpl.kt */
    private static final class C9060a implements Serializable {

        /* renamed from: f */
        private final C9069g[] f25647f;

        /* renamed from: kotlin.a0.c$a$a */
        /* compiled from: CoroutineContextImpl.kt */
        public static final class C9061a {
            private C9061a() {
            }

            public /* synthetic */ C9061a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C9061a((DefaultConstructorMarker) null);
        }

        public C9060a(C9069g[] gVarArr) {
            C10202j.m34178b(gVarArr, "elements");
            this.f25647f = gVarArr;
        }

        private final Object readResolve() {
            C9069g[] gVarArr = this.f25647f;
            C9069g gVar = C9075h.f25654f;
            for (C9069g plus : gVarArr) {
                gVar = gVar.plus(plus);
            }
            return gVar;
        }
    }

    /* renamed from: kotlin.a0.c$b */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C9062b extends C10203k implements C9117p<String, C9069g.C9072b, String> {

        /* renamed from: f */
        public static final C9062b f25648f = new C9062b();

        C9062b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, C9069g.C9072b bVar) {
            C10202j.m34178b(str, "acc");
            C10202j.m34178b(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: kotlin.a0.c$c */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C9063c extends C10203k implements C9117p<C10483v, C9069g.C9072b, C10483v> {

        /* renamed from: f */
        final /* synthetic */ C9069g[] f25649f;

        /* renamed from: g */
        final /* synthetic */ C10214v f25650g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9063c(C9069g[] gVarArr, C10214v vVar) {
            super(2);
            this.f25649f = gVarArr;
            this.f25650g = vVar;
        }

        /* renamed from: a */
        public final void mo33451a(C10483v vVar, C9069g.C9072b bVar) {
            C10202j.m34178b(vVar, "<anonymous parameter 0>");
            C10202j.m34178b(bVar, "element");
            C9069g[] gVarArr = this.f25649f;
            C10214v vVar2 = this.f25650g;
            int i = vVar2.f27853f;
            vVar2.f27853f = i + 1;
            gVarArr[i] = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo33451a((C10483v) obj, (C9069g.C9072b) obj2);
            return C10483v.f28357a;
        }
    }

    public C9059c(C9069g gVar, C9069g.C9072b bVar) {
        C10202j.m34178b(gVar, "left");
        C10202j.m34178b(bVar, "element");
        this.f25645f = gVar;
        this.f25646g = bVar;
    }

    /* renamed from: a */
    private final int m29764a() {
        int i = 2;
        C9059c cVar = this;
        while (true) {
            C9069g gVar = cVar.f25645f;
            if (!(gVar instanceof C9059c)) {
                gVar = null;
            }
            cVar = (C9059c) gVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int a = m29764a();
        C9069g[] gVarArr = new C9069g[a];
        C10214v vVar = new C10214v();
        boolean z = false;
        vVar.f27853f = 0;
        fold(C10483v.f28357a, new C9063c(gVarArr, vVar));
        if (vVar.f27853f == a) {
            z = true;
        }
        if (z) {
            return new C9060a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9059c) {
                C9059c cVar = (C9059c) obj;
                if (cVar.m29764a() != m29764a() || !cVar.m29765a(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C9117p<? super R, ? super C9069g.C9072b, ? extends R> pVar) {
        C10202j.m34178b(pVar, "operation");
        return pVar.invoke(this.f25645f.fold(r, pVar), this.f25646g);
    }

    public <E extends C9069g.C9072b> E get(C9069g.C9074c<E> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        C9059c cVar2 = this;
        while (true) {
            E e = cVar2.f25646g.get(cVar);
            if (e != null) {
                return e;
            }
            C9069g gVar = cVar2.f25645f;
            if (!(gVar instanceof C9059c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C9059c) gVar;
        }
    }

    public int hashCode() {
        return this.f25645f.hashCode() + this.f25646g.hashCode();
    }

    public C9069g minusKey(C9069g.C9074c<?> cVar) {
        C10202j.m34178b(cVar, RoomNotification.KEY);
        if (this.f25646g.get(cVar) != null) {
            return this.f25645f;
        }
        C9069g minusKey = this.f25645f.minusKey(cVar);
        if (minusKey == this.f25645f) {
            return this;
        }
        if (minusKey == C9075h.f25654f) {
            return this.f25646g;
        }
        return new C9059c(minusKey, this.f25646g);
    }

    public C9069g plus(C9069g gVar) {
        C10202j.m34178b(gVar, "context");
        return C9069g.C9070a.m29774a(this, gVar);
    }

    public String toString() {
        return "[" + ((String) fold("", C9062b.f25648f)) + "]";
    }

    /* renamed from: a */
    private final boolean m29766a(C9069g.C9072b bVar) {
        return C10202j.m34176a((Object) get(bVar.getKey()), (Object) bVar);
    }

    /* renamed from: a */
    private final boolean m29765a(C9059c cVar) {
        while (m29766a(cVar.f25646g)) {
            C9069g gVar = cVar.f25645f;
            if (gVar instanceof C9059c) {
                cVar = (C9059c) gVar;
            } else if (gVar != null) {
                return m29766a((C9069g.C9072b) gVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }
}
