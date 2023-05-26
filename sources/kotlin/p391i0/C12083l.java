package kotlin.p391i0;

import java.util.Iterator;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\b\u001a@\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001e0\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001d0\u0001¨\u0006\u001f"}, mo16641d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, mo16642k = 5, mo16643mv = {1, 1, 16}, mo16645xi = 1, mo16646xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.i0.l */
/* compiled from: Sequences.kt */
class C12083l extends C12082k {

    /* renamed from: kotlin.i0.l$a */
    /* compiled from: Sequences.kt */
    public static final class C12084a implements C12079h<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f31848a;

        public C12084a(Iterator it) {
            this.f31848a = it;
        }

        public Iterator<T> iterator() {
            return this.f31848a;
        }
    }

    /* renamed from: kotlin.i0.l$b */
    /* compiled from: Sequences.kt */
    static final class C12085b extends C10203k implements C9113l<C12079h<? extends T>, Iterator<? extends T>> {

        /* renamed from: f */
        public static final C12085b f31849f = new C12085b();

        C12085b() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator<T> invoke(C12079h<? extends T> hVar) {
            C10202j.m34178b(hVar, "it");
            return hVar.iterator();
        }
    }

    /* renamed from: kotlin.i0.l$c */
    /* compiled from: Sequences.kt */
    static final class C12086c extends C10203k implements C9113l<T, T> {

        /* renamed from: f */
        public static final C12086c f31850f = new C12086c();

        C12086c() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: kotlin.i0.l$d */
    /* compiled from: Sequences.kt */
    static final class C12087d extends C10203k implements C9113l<T, T> {

        /* renamed from: f */
        final /* synthetic */ C9102a f31851f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12087d(C9102a aVar) {
            super(1);
            this.f31851f = aVar;
        }

        public final T invoke(T t) {
            C10202j.m34178b(t, "it");
            return this.f31851f.invoke();
        }
    }

    /* renamed from: kotlin.i0.l$e */
    /* compiled from: Sequences.kt */
    static final class C12088e extends C10203k implements C9102a<T> {

        /* renamed from: f */
        final /* synthetic */ Object f31852f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12088e(Object obj) {
            super(0);
            this.f31852f = obj;
        }

        public final T invoke() {
            return this.f31852f;
        }
    }

    /* renamed from: a */
    public static <T> C12079h<T> m39907a(Iterator<? extends T> it) {
        C10202j.m34178b(it, "$this$asSequence");
        return m39909a(new C12084a(it));
    }

    /* renamed from: b */
    public static final <T> C12079h<T> m39912b(C12079h<? extends C12079h<? extends T>> hVar) {
        C10202j.m34178b(hVar, "$this$flatten");
        return m39910a(hVar, C12085b.f31849f);
    }

    /* renamed from: a */
    public static final <T> C12079h<T> m39911a(T... tArr) {
        C10202j.m34178b(tArr, "elements");
        return tArr.length == 0 ? m39905a() : C10519k.m35643c(tArr);
    }

    /* renamed from: a */
    public static <T> C12079h<T> m39905a() {
        return C12072d.f31829a;
    }

    /* renamed from: a */
    private static final <T, R> C12079h<R> m39910a(C12079h<? extends T> hVar, C9113l<? super T, ? extends Iterator<? extends R>> lVar) {
        if (hVar instanceof C12096p) {
            return ((C12096p) hVar).mo38720a(lVar);
        }
        return new C12075f(hVar, C12086c.f31850f, lVar);
    }

    /* renamed from: a */
    public static final <T> C12079h<T> m39909a(C12079h<? extends T> hVar) {
        C10202j.m34178b(hVar, "$this$constrainOnce");
        return hVar instanceof C12068a ? hVar : new C12068a(hVar);
    }

    /* renamed from: a */
    public static <T> C12079h<T> m39908a(C9102a<? extends T> aVar) {
        C10202j.m34178b(aVar, "nextFunction");
        return m39909a(new C12077g(aVar, new C12087d(aVar)));
    }

    /* renamed from: a */
    public static <T> C12079h<T> m39906a(T t, C9113l<? super T, ? extends T> lVar) {
        C10202j.m34178b(lVar, "nextFunction");
        if (t == null) {
            return C12072d.f31829a;
        }
        return new C12077g(new C12088e(t), lVar);
    }
}
