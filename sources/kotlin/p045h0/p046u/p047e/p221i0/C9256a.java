package kotlin.p045h0.p046u.p047e.p221i0;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p221i0.C9266d;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002 !B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0016¢\u0006\u0002\u0010\u001fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.i0.a */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C9256a implements C9266d {

    /* renamed from: a */
    private final List<Type> f25808a;

    /* renamed from: b */
    private final List<Class<?>> f25809b;

    /* renamed from: c */
    private final List<Object> f25810c;

    /* renamed from: d */
    private final Class<?> f25811d;

    /* renamed from: e */
    private final List<String> f25812e;

    /* renamed from: f */
    private final C9257a f25813f;

    /* renamed from: g */
    private final List<Method> f25814g;

    /* renamed from: kotlin.h0.u.e.i0.a$a */
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum C9257a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* renamed from: kotlin.h0.u.e.i0.a$b */
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum C9258b {
        JAVA,
        KOTLIN
    }

    public C9256a(Class<?> cls, List<String> list, C9257a aVar, C9258b bVar, List<Method> list2) {
        C10202j.m34178b(cls, "jClass");
        C10202j.m34178b(list, "parameterNames");
        C10202j.m34178b(aVar, "callMode");
        C10202j.m34178b(bVar, "origin");
        C10202j.m34178b(list2, "methods");
        this.f25811d = cls;
        this.f25812e = list;
        this.f25813f = aVar;
        this.f25814g = list2;
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list2, 10));
        for (Method genericReturnType : list2) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.f25808a = arrayList;
        List<Method> list3 = this.f25814g;
        ArrayList arrayList2 = new ArrayList(C10531p.m35750a(list3, 10));
        for (Method returnType : list3) {
            Class<?> returnType2 = returnType.getReturnType();
            C10202j.m34174a((Object) returnType2, "it");
            Class<?> f = C12029b.m39752f(returnType2);
            if (f != null) {
                returnType2 = f;
            }
            arrayList2.add(returnType2);
        }
        this.f25809b = arrayList2;
        List<Method> list4 = this.f25814g;
        ArrayList arrayList3 = new ArrayList(C10531p.m35750a(list4, 10));
        for (Method defaultValue : list4) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.f25810c = arrayList3;
        if (this.f25813f == C9257a.POSITIONAL_CALL && bVar == C9258b.JAVA && (!C10539w.m35787c(this.f25812e, DonationsAnalytics.VALUE).isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    /* renamed from: a */
    public void mo33635a(Object[] objArr) {
        C10202j.m34178b(objArr, "args");
        C9266d.C9267a.m30053a(this, objArr);
    }

    public Object call(Object[] objArr) {
        Object obj;
        C10202j.m34178b(objArr, "args");
        mo33635a(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            int i3 = i2 + 1;
            if (obj2 == null && this.f25813f == C9257a.CALL_BY_NAME) {
                obj = this.f25810c.get(i2);
            } else {
                obj = C9259b.m30049b(obj2, this.f25809b.get(i2));
            }
            if (obj != null) {
                arrayList.add(obj);
                i++;
                i2 = i3;
            } else {
                C9259b.m30048a(i2, this.f25812e.get(i2), (Class) this.f25809b.get(i2));
                throw null;
            }
        }
        return C9259b.m30045a(this.f25811d, (Map<String, ? extends Object>) C10518j0.m35602a(C10539w.m35800e(this.f25812e, arrayList)), this.f25814g);
    }

    public Void getMember() {
        return null;
    }

    public Type getReturnType() {
        return this.f25811d;
    }

    /* renamed from: a */
    public List<Type> mo33634a() {
        return this.f25808a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9256a(java.lang.Class r7, java.util.List r8, kotlin.p045h0.p046u.p047e.p221i0.C9256a.C9257a r9, kotlin.p045h0.p046u.p047e.p221i0.C9256a.C9258b r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.p262y.C10531p.m35750a(r8, (int) r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x002a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L_0x0013
        L_0x002a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9256a.<init>(java.lang.Class, java.util.List, kotlin.h0.u.e.i0.a$a, kotlin.h0.u.e.i0.a$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
