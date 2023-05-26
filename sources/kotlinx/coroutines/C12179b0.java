package kotlinx.coroutines;

import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9057a;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12331y1;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, mo16641d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.b0 */
/* compiled from: CoroutineContext.kt */
public final class C12179b0 extends C9057a implements C12331y1<String> {

    /* renamed from: g */
    public static final C12180a f31948g = new C12180a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final long f31949f;

    /* renamed from: kotlinx.coroutines.b0$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C12180a implements C9069g.C9074c<C12179b0> {
        private C12180a() {
        }

        public /* synthetic */ C12180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12179b0(long j) {
        super(f31948g);
        this.f31949f = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C12179b0) && this.f31949f == ((C12179b0) obj).f31949f;
        }
        return true;
    }

    public <R> R fold(R r, C9117p<? super R, ? super C9069g.C9072b, ? extends R> pVar) {
        return C12331y1.C12332a.m40696a(this, r, pVar);
    }

    public <E extends C9069g.C9072b> E get(C9069g.C9074c<E> cVar) {
        return C12331y1.C12332a.m40697a(this, cVar);
    }

    public int hashCode() {
        long j = this.f31949f;
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: m */
    public final long mo38837m() {
        return this.f31949f;
    }

    public C9069g minusKey(C9069g.C9074c<?> cVar) {
        return C12331y1.C12332a.m40699b(this, cVar);
    }

    public C9069g plus(C9069g gVar) {
        return C12331y1.C12332a.m40698a(this, gVar);
    }

    public String toString() {
        return "CoroutineId(" + this.f31949f + ')';
    }

    /* renamed from: a */
    public String m40215a(C9069g gVar) {
        String str;
        C12184c0 c0Var = (C12184c0) gVar.get(C12184c0.f31954g);
        if (c0Var == null || (str = c0Var.mo38842m()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int b = C12131w.m40089b((CharSequence) name, " @", 0, false, 6, (Object) null);
        if (b < 0) {
            b = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + b + 10);
        if (name != null) {
            String substring = name.substring(0, b);
            C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" @");
            sb.append(str);
            sb.append('#');
            sb.append(this.f31949f);
            String sb2 = sb.toString();
            C10202j.m34174a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
            currentThread.setName(sb2);
            return name;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public void mo38833a(C9069g gVar, String str) {
        Thread.currentThread().setName(str);
    }
}
