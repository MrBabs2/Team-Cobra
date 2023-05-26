package kotlin.p045h0.p046u.p047e.p221i0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p220g0.C9146c;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.i0.g */
/* compiled from: InlineClassAwareCaller.kt */
public final class C9294g<M extends Member> implements C9266d<M> {

    /* renamed from: a */
    private final C9295a f25849a;

    /* renamed from: b */
    private final C9266d<M> f25850b;

    /* renamed from: c */
    private final boolean f25851c;

    /* renamed from: kotlin.h0.u.e.i0.g$a */
    /* compiled from: InlineClassAwareCaller.kt */
    private static final class C9295a {

        /* renamed from: a */
        private final C9146c f25852a;

        /* renamed from: b */
        private final Method[] f25853b;

        /* renamed from: c */
        private final Method f25854c;

        public C9295a(C9146c cVar, Method[] methodArr, Method method) {
            C10202j.m34178b(cVar, "argumentRange");
            C10202j.m34178b(methodArr, "unbox");
            this.f25852a = cVar;
            this.f25853b = methodArr;
            this.f25854c = method;
        }

        /* renamed from: a */
        public final C9146c mo33645a() {
            return this.f25852a;
        }

        /* renamed from: b */
        public final Method[] mo33646b() {
            return this.f25853b;
        }

        /* renamed from: c */
        public final Method mo33647c() {
            return this.f25854c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if ((r0 instanceof kotlin.p045h0.p046u.p047e.p221i0.C9265c) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9294g(kotlin.reflect.jvm.internal.impl.descriptors.C10238b r8, kotlin.p045h0.p046u.p047e.p221i0.C9266d<? extends M> r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            java.lang.String r0 = "caller"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            r7.<init>()
            r7.f25850b = r9
            r7.f25851c = r10
            kotlin.h0.u.e.k0.k.b0 r9 = r8.getReturnType()
            r10 = 0
            if (r9 == 0) goto L_0x0189
            java.lang.String r0 = "descriptor.returnType!!"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.Class r9 = kotlin.p045h0.p046u.p047e.p221i0.C9296h.m30067a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r9)
            if (r9 == 0) goto L_0x0028
            java.lang.reflect.Method r9 = kotlin.p045h0.p046u.p047e.p221i0.C9296h.m30070a((java.lang.Class<?>) r9, (kotlin.reflect.jvm.internal.impl.descriptors.C10238b) r8)
            goto L_0x0029
        L_0x0028:
            r9 = r10
        L_0x0029:
            boolean r0 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10003e.m33700a((kotlin.reflect.jvm.internal.impl.descriptors.C10230a) r8)
            r1 = 0
            if (r0 == 0) goto L_0x003f
            kotlin.g0.c$a r8 = kotlin.p220g0.C9146c.f25689k
            kotlin.g0.c r8 = r8.mo33497a()
            java.lang.reflect.Method[] r10 = new java.lang.reflect.Method[r1]
            kotlin.h0.u.e.i0.g$a r0 = new kotlin.h0.u.e.i0.g$a
            r0.<init>(r8, r10, r9)
            goto L_0x0138
        L_0x003f:
            kotlin.h0.u.e.i0.d<M> r0 = r7.f25850b
            boolean r2 = r0 instanceof kotlin.p045h0.p046u.p047e.p221i0.C9268e.C9286h.C9289c
            java.lang.String r3 = "descriptor.containingDeclaration"
            r4 = -1
            if (r2 == 0) goto L_0x0049
            goto L_0x006f
        L_0x0049:
            boolean r2 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10357l
            if (r2 == 0) goto L_0x0052
            boolean r0 = r0 instanceof kotlin.p045h0.p046u.p047e.p221i0.C9265c
            if (r0 == 0) goto L_0x006e
            goto L_0x006f
        L_0x0052:
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r0 = r8.mo35403X()
            if (r0 == 0) goto L_0x006e
            kotlin.h0.u.e.i0.d<M> r0 = r7.f25850b
            boolean r0 = r0 instanceof kotlin.p045h0.p046u.p047e.p221i0.C9265c
            if (r0 != 0) goto L_0x006e
            kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r8.mo33762b()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r3)
            boolean r0 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10003e.m33701a((kotlin.reflect.jvm.internal.impl.descriptors.C10359m) r0)
            if (r0 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r4 = 1
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            boolean r0 = r7.f25851c
            if (r0 == 0) goto L_0x0075
            r0 = 2
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r5 = r8.mo35405b0()
            if (r5 == 0) goto L_0x0086
            kotlin.h0.u.e.k0.k.b0 r5 = r5.getType()
            goto L_0x0087
        L_0x0086:
            r5 = r10
        L_0x0087:
            if (r5 == 0) goto L_0x008d
            r2.add(r5)
            goto L_0x00d5
        L_0x008d:
            boolean r5 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10357l
            if (r5 == 0) goto L_0x00bb
            r3 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.l r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C10357l) r3
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = r3.mo35473x()
            java.lang.String r5 = "descriptor.constructedClass"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r5)
            boolean r5 = r3.mo33770k()
            if (r5 == 0) goto L_0x00d5
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r3.mo33762b()
            if (r3 == 0) goto L_0x00b3
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r3
            kotlin.h0.u.e.k0.k.j0 r3 = r3.mo35445o()
            r2.add(r3)
            goto L_0x00d5
        L_0x00b3:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r8.<init>(r9)
            throw r8
        L_0x00bb:
            kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r8.mo33762b()
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r3)
            boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10342e
            if (r3 == 0) goto L_0x00d5
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r5
            boolean r3 = r5.isInline()
            if (r3 == 0) goto L_0x00d5
            kotlin.h0.u.e.k0.k.j0 r3 = r5.mo35445o()
            r2.add(r3)
        L_0x00d5:
            java.util.List r3 = r8.mo35407f()
            java.lang.String r5 = "descriptor.valueParameters"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00e2:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f6
            java.lang.Object r5 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C10386v0) r5
            kotlin.h0.u.e.k0.k.b0 r5 = r5.getType()
            r2.add(r5)
            goto L_0x00e2
        L_0x00f6:
            int r3 = r2.size()
            int r3 = r3 + r4
            int r3 = r3 + r0
            int r0 = kotlin.p045h0.p046u.p047e.p221i0.C9293f.m30062a(r7)
            if (r0 != r3) goto L_0x013b
            int r0 = java.lang.Math.max(r4, r1)
            int r5 = r2.size()
            int r5 = r5 + r4
            kotlin.g0.c r0 = kotlin.p220g0.C9150f.m29854d(r0, r5)
            java.lang.reflect.Method[] r5 = new java.lang.reflect.Method[r3]
        L_0x0111:
            if (r1 >= r3) goto L_0x0132
            boolean r6 = r0.mo33496h(r1)
            if (r6 == 0) goto L_0x012c
            int r6 = r1 - r4
            java.lang.Object r6 = r2.get(r6)
            kotlin.h0.u.e.k0.k.b0 r6 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r6
            java.lang.Class r6 = kotlin.p045h0.p046u.p047e.p221i0.C9296h.m30067a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r6)
            if (r6 == 0) goto L_0x012c
            java.lang.reflect.Method r6 = kotlin.p045h0.p046u.p047e.p221i0.C9296h.m30074b(r6, r8)
            goto L_0x012d
        L_0x012c:
            r6 = r10
        L_0x012d:
            r5[r1] = r6
            int r1 = r1 + 1
            goto L_0x0111
        L_0x0132:
            kotlin.h0.u.e.i0.g$a r8 = new kotlin.h0.u.e.i0.g$a
            r8.<init>(r0, r5, r9)
            r0 = r8
        L_0x0138:
            r7.f25849a = r0
            return
        L_0x013b:
            kotlin.h0.u.e.x r9 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r10.append(r0)
            int r0 = kotlin.p045h0.p046u.p047e.p221i0.C9293f.m30062a(r7)
            r10.append(r0)
            java.lang.String r0 = " != "
            r10.append(r0)
            r10.append(r3)
            r0 = 10
            r10.append(r0)
            java.lang.String r1 = "Calling: "
            r10.append(r1)
            r10.append(r8)
            r10.append(r0)
            java.lang.String r8 = "Parameter types: "
            r10.append(r8)
            java.util.List r8 = r7.mo33634a()
            r10.append(r8)
            java.lang.String r8 = ")\n"
            r10.append(r8)
            java.lang.String r8 = "Default: "
            r10.append(r8)
            boolean r8 = r7.f25851c
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x0189:
            kotlin.jvm.internal.C10202j.m34172a()
            goto L_0x018e
        L_0x018d:
            throw r10
        L_0x018e:
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9294g.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.h0.u.e.i0.d, boolean):void");
    }

    /* renamed from: a */
    public List<Type> mo33634a() {
        return this.f25850b.mo33634a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r0 = r0.invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C10202j.m34178b(r10, r0)
            kotlin.h0.u.e.i0.g$a r0 = r9.f25849a
            kotlin.g0.c r1 = r0.mo33645a()
            java.lang.reflect.Method[] r2 = r0.mo33646b()
            java.lang.reflect.Method r0 = r0.mo33647c()
            int r3 = r10.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r4 = "java.util.Arrays.copyOf(this, size)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r4)
            if (r3 == 0) goto L_0x0055
            int r4 = r1.getFirst()
            int r1 = r1.getLast()
            r5 = 0
            if (r4 > r1) goto L_0x003f
        L_0x002a:
            r6 = r2[r4]
            r7 = r10[r4]
            if (r6 == 0) goto L_0x0038
            if (r7 == 0) goto L_0x0038
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r7 = r6.invoke(r7, r8)
        L_0x0038:
            r3[r4] = r7
            if (r4 == r1) goto L_0x003f
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003f:
            kotlin.h0.u.e.i0.d<M> r10 = r9.f25850b
            java.lang.Object r10 = r10.call(r3)
            if (r0 == 0) goto L_0x0054
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r10
            java.lang.Object r0 = r0.invoke(r1, r2)
            if (r0 == 0) goto L_0x0054
            r10 = r0
        L_0x0054:
            return r10
        L_0x0055:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            r10.<init>(r0)
            goto L_0x005e
        L_0x005d:
            throw r10
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p221i0.C9294g.call(java.lang.Object[]):java.lang.Object");
    }

    public M getMember() {
        return this.f25850b.getMember();
    }

    public Type getReturnType() {
        return this.f25850b.getReturnType();
    }
}
