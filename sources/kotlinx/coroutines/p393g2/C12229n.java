package kotlinx.coroutines.p393g2;

import java.util.ArrayDeque;
import kotlin.C10221n;
import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C10481t;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.p043j.p044a.C9085d;

/* renamed from: kotlinx.coroutines.g2.n */
/* compiled from: StackTraceRecovery.kt */
public final class C12229n {

    /* renamed from: a */
    private static final String f32003a;

    static {
        Object obj;
        Object obj2;
        try {
            C10222o.C10223a aVar = C10222o.f27863f;
            obj = Class.forName("kotlin.a0.j.a.a").getCanonicalName();
            C10222o.m34210a(obj);
        } catch (Throwable th) {
            C10222o.C10223a aVar2 = C10222o.f27863f;
            obj = C10225p.m34213a(th);
            C10222o.m34210a(obj);
        }
        if (C10222o.m34211b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f32003a = (String) obj;
        try {
            C10222o.C10223a aVar3 = C10222o.f27863f;
            obj2 = Class.forName("kotlinx.coroutines.g2.n").getCanonicalName();
            C10222o.m34210a(obj2);
        } catch (Throwable th2) {
            C10222o.C10223a aVar4 = C10222o.f27863f;
            obj2 = C10225p.m34213a(th2);
            C10222o.m34210a(obj2);
        }
        if (C10222o.m34211b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) obj2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final <E extends Throwable> E m40317b(E e, C9085d dVar) {
        C10221n a = m40312a(e);
        E e2 = (Throwable) a.mo35389a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a.mo35390b();
        E a2 = C12210e.m40260a(e2);
        if (a2 == null || (!C10202j.m34176a((Object) a2.getMessage(), (Object) e2.getMessage()))) {
            return e;
        }
        ArrayDeque<StackTraceElement> a3 = m40311a(dVar);
        if (a3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m40313a(stackTraceElementArr, a3);
        }
        m40309a(e2, a2, a3);
        return a2;
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m40309a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m40308a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int a = m40307a(stackTrace, f32003a);
        int i = 0;
        if (a == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a)];
        for (int i2 = 0; i2 < a; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: b */
    public static final <E extends Throwable> E m40316b(E e) {
        E cause = e.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!C10202j.m34176a((Object) cause.getClass(), (Object) e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (m40314a(stackTrace[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return cause;
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private static final <E extends Throwable> C10221n<E, StackTraceElement[]> m40312a(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C10202j.m34176a((Object) cause.getClass(), (Object) e.getClass())) {
            return C10481t.m35502a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (m40314a(stackTrace[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return C10481t.m35502a(cause, stackTrace);
        }
        return C10481t.m35502a(e, new StackTraceElement[0]);
    }

    /* renamed from: a */
    private static final ArrayDeque<StackTraceElement> m40311a(C9085d dVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = dVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(dVar instanceof C9085d)) {
                dVar = null;
            }
            if (dVar == null || (dVar = dVar.getCallerFrame()) == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = dVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    /* renamed from: a */
    public static final StackTraceElement m40308a(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    /* renamed from: a */
    public static final boolean m40314a(StackTraceElement stackTraceElement) {
        return C12130v.m40056c(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: a */
    private static final boolean m40315a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C10202j.m34176a((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && C10202j.m34176a((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && C10202j.m34176a((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    /* renamed from: a */
    private static final void m40313a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m40314a(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                if (m40315a(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static final int m40307a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C10202j.m34176a((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
