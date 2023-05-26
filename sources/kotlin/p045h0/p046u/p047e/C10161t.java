package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.C10150s;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11752j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p221i0.C9268e;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\nH\u0002\"\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, mo16641d2 = {"boundReceiver", "", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "isGetter", "", "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflection"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.t */
/* compiled from: KPropertyImpl.kt */
public final class C10161t {

    /* renamed from: kotlin.h0.u.e.t$a */
    /* compiled from: KPropertyImpl.kt */
    static final class C10162a extends C10203k implements C9102a<Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10150s.C10151a f27802f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10162a(C10150s.C10151a aVar) {
            super(0);
            this.f27802f = aVar;
        }

        public final boolean invoke() {
            return this.f27802f.mo33524d().mo33587o().getAnnotations().mo33886b(C9244g0.m30002a());
        }
    }

    /* renamed from: kotlin.h0.u.e.t$b */
    /* compiled from: KPropertyImpl.kt */
    static final class C10163b extends C10203k implements C9102a<Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10150s.C10151a f27803f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10163b(C10150s.C10151a aVar) {
            super(0);
            this.f27803f = aVar;
        }

        public final boolean invoke() {
            return !C11821a1.m38916g(this.f27803f.mo33524d().mo33587o().getType());
        }
    }

    /* renamed from: kotlin.h0.u.e.t$c */
    /* compiled from: KPropertyImpl.kt */
    static final class C10164c extends C10203k implements C9113l<Field, C9268e<? extends Field>> {

        /* renamed from: f */
        final /* synthetic */ C10150s.C10151a f27804f;

        /* renamed from: g */
        final /* synthetic */ boolean f27805g;

        /* renamed from: h */
        final /* synthetic */ C10163b f27806h;

        /* renamed from: i */
        final /* synthetic */ C10162a f27807i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10164c(C10150s.C10151a aVar, boolean z, C10163b bVar, C10162a aVar2) {
            super(1);
            this.f27804f = aVar;
            this.f27805g = z;
            this.f27806h = bVar;
            this.f27807i = aVar2;
        }

        /* renamed from: a */
        public final C9268e<Field> invoke(Field field) {
            C10202j.m34178b(field, "field");
            if (C10161t.m34113b(this.f27804f.mo33524d().mo33587o()) || !Modifier.isStatic(field.getModifiers())) {
                if (this.f27805g) {
                    if (this.f27804f.mo33589q()) {
                        return new C9268e.C9274f.C9275a(field, C10161t.m34109a((C10150s.C10151a<?, ?>) this.f27804f));
                    }
                    return new C9268e.C9274f.C9277c(field);
                } else if (this.f27804f.mo33589q()) {
                    return new C9268e.C9280g.C9281a(field, this.f27806h.invoke(), C10161t.m34109a((C10150s.C10151a<?, ?>) this.f27804f));
                } else {
                    return new C9268e.C9280g.C9283c(field, this.f27806h.invoke());
                }
            } else if (this.f27807i.invoke()) {
                if (this.f27805g) {
                    if (this.f27804f.mo33589q()) {
                        return new C9268e.C9274f.C9276b(field);
                    }
                    return new C9268e.C9274f.C9278d(field);
                } else if (this.f27804f.mo33589q()) {
                    return new C9268e.C9280g.C9282b(field, this.f27806h.invoke());
                } else {
                    return new C9268e.C9280g.C9284d(field, this.f27806h.invoke());
                }
            } else if (this.f27805g) {
                return new C9268e.C9274f.C9279e(field);
            } else {
                return new C9268e.C9280g.C9285e(field, this.f27806h.invoke());
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0127  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.p045h0.p046u.p047e.p221i0.C9266d<?> m34112b(kotlin.p045h0.p046u.p047e.C10150s.C10151a<?, ?> r7, boolean r8) {
        /*
            kotlin.h0.u.e.i$a r0 = kotlin.p045h0.p046u.p047e.C9247i.f25796h
            kotlin.j0.j r0 = r0.mo33621a()
            kotlin.h0.u.e.s r1 = r7.mo33524d()
            java.lang.String r1 = r1.mo35347u()
            boolean r0 = r0.mo38744b(r1)
            if (r0 == 0) goto L_0x0017
            kotlin.h0.u.e.i0.j r7 = kotlin.p045h0.p046u.p047e.p221i0.C9300j.f25859a
            return r7
        L_0x0017:
            kotlin.h0.u.e.t$a r0 = new kotlin.h0.u.e.t$a
            r0.<init>(r7)
            kotlin.h0.u.e.t$b r1 = new kotlin.h0.u.e.t$b
            r1.<init>(r7)
            kotlin.h0.u.e.t$c r2 = new kotlin.h0.u.e.t$c
            r2.<init>(r7, r8, r1, r0)
            kotlin.h0.u.e.d0 r1 = kotlin.p045h0.p046u.p047e.C9205d0.f25736b
            kotlin.h0.u.e.s r3 = r7.mo33524d()
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r3 = r3.mo33587o()
            kotlin.h0.u.e.d r1 = r1.mo33581a((kotlin.reflect.jvm.internal.impl.descriptors.C10352i0) r3)
            boolean r3 = r1 instanceof kotlin.p045h0.p046u.p047e.C9200d.C9203c
            r4 = 0
            if (r3 == 0) goto L_0x0177
            kotlin.h0.u.e.d$c r1 = (kotlin.p045h0.p046u.p047e.C9200d.C9203c) r1
            kotlin.h0.u.e.k0.d.y0.a$d r3 = r1.mo33576e()
            if (r8 == 0) goto L_0x004c
            boolean r8 = r3.mo34891n()
            if (r8 == 0) goto L_0x0057
            kotlin.h0.u.e.k0.d.y0.a$c r8 = r3.mo34887j()
            goto L_0x0058
        L_0x004c:
            boolean r8 = r3.mo34892o()
            if (r8 == 0) goto L_0x0057
            kotlin.h0.u.e.k0.d.y0.a$c r8 = r3.mo34888k()
            goto L_0x0058
        L_0x0057:
            r8 = r4
        L_0x0058:
            if (r8 == 0) goto L_0x007f
            kotlin.h0.u.e.s r3 = r7.mo33524d()
            kotlin.h0.u.e.i r3 = r3.mo33585i()
            kotlin.h0.u.e.k0.d.x0.c r5 = r1.mo33574c()
            int r6 = r8.mo34879j()
            java.lang.String r5 = r5.getString(r6)
            kotlin.h0.u.e.k0.d.x0.c r1 = r1.mo33574c()
            int r8 = r8.mo34878i()
            java.lang.String r8 = r1.getString(r8)
            java.lang.reflect.Method r8 = r3.mo33618b(r5, r8)
            goto L_0x0080
        L_0x007f:
            r8 = r4
        L_0x0080:
            if (r8 != 0) goto L_0x0127
            kotlin.h0.u.e.s r8 = r7.mo33524d()
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r8 = r8.mo33587o()
            boolean r8 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10003e.m33702a((kotlin.reflect.jvm.internal.impl.descriptors.C10392x0) r8)
            if (r8 == 0) goto L_0x00fc
            kotlin.h0.u.e.s r8 = r7.mo33524d()
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r8 = r8.mo33587o()
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r8 = r8.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.C10397z0.f28191d
            boolean r8 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r8, (java.lang.Object) r0)
            if (r8 == 0) goto L_0x00fc
            kotlin.h0.u.e.s r8 = r7.mo33524d()
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r8 = r8.mo33587o()
            kotlin.reflect.jvm.internal.impl.descriptors.m r8 = r8.mo33762b()
            java.lang.Class r8 = kotlin.p045h0.p046u.p047e.p221i0.C9296h.m30068a((kotlin.reflect.jvm.internal.impl.descriptors.C10359m) r8)
            if (r8 == 0) goto L_0x00dc
            kotlin.h0.u.e.s r0 = r7.mo33524d()
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r0 = r0.mo33587o()
            java.lang.reflect.Method r8 = kotlin.p045h0.p046u.p047e.p221i0.C9296h.m30074b(r8, r0)
            if (r8 == 0) goto L_0x00dc
            boolean r0 = r7.mo33589q()
            if (r0 == 0) goto L_0x00d5
            kotlin.h0.u.e.i0.i$a r0 = new kotlin.h0.u.e.i0.i$a
            java.lang.Object r1 = m34109a((kotlin.p045h0.p046u.p047e.C10150s.C10151a<?, ?>) r7)
            r0.<init>(r8, r1)
            goto L_0x01b0
        L_0x00d5:
            kotlin.h0.u.e.i0.i$b r0 = new kotlin.h0.u.e.i0.i$b
            r0.<init>(r8)
            goto L_0x01b0
        L_0x00dc:
            kotlin.h0.u.e.x r8 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Underlying property of inline class "
            r0.append(r1)
            kotlin.h0.u.e.s r7 = r7.mo33524d()
            r0.append(r7)
            java.lang.String r7 = " should have a field"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00fc:
            kotlin.h0.u.e.s r8 = r7.mo33524d()
            java.lang.reflect.Field r8 = r8.mo35345t()
            if (r8 == 0) goto L_0x010c
            kotlin.h0.u.e.i0.e r0 = r2.invoke(r8)
            goto L_0x01b0
        L_0x010c:
            kotlin.h0.u.e.x r8 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessors or field is found for property "
            r0.append(r1)
            kotlin.h0.u.e.s r7 = r7.mo33524d()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x0127:
            int r1 = r8.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L_0x0149
            boolean r0 = r7.mo33589q()
            if (r0 == 0) goto L_0x0142
            kotlin.h0.u.e.i0.e$h$a r0 = new kotlin.h0.u.e.i0.e$h$a
            java.lang.Object r1 = m34109a((kotlin.p045h0.p046u.p047e.C10150s.C10151a<?, ?>) r7)
            r0.<init>(r8, r1)
            goto L_0x01b0
        L_0x0142:
            kotlin.h0.u.e.i0.e$h$d r0 = new kotlin.h0.u.e.i0.e$h$d
            r0.<init>(r8)
            goto L_0x01b0
        L_0x0149:
            boolean r0 = r0.invoke()
            if (r0 == 0) goto L_0x0161
            boolean r0 = r7.mo33589q()
            if (r0 == 0) goto L_0x015b
            kotlin.h0.u.e.i0.e$h$b r0 = new kotlin.h0.u.e.i0.e$h$b
            r0.<init>(r8)
            goto L_0x01b0
        L_0x015b:
            kotlin.h0.u.e.i0.e$h$e r0 = new kotlin.h0.u.e.i0.e$h$e
            r0.<init>(r8)
            goto L_0x01b0
        L_0x0161:
            boolean r0 = r7.mo33589q()
            if (r0 == 0) goto L_0x0171
            kotlin.h0.u.e.i0.e$h$c r0 = new kotlin.h0.u.e.i0.e$h$c
            java.lang.Object r1 = m34109a((kotlin.p045h0.p046u.p047e.C10150s.C10151a<?, ?>) r7)
            r0.<init>(r8, r1)
            goto L_0x01b0
        L_0x0171:
            kotlin.h0.u.e.i0.e$h$f r0 = new kotlin.h0.u.e.i0.e$h$f
            r0.<init>(r8)
            goto L_0x01b0
        L_0x0177:
            boolean r0 = r1 instanceof kotlin.p045h0.p046u.p047e.C9200d.C9201a
            if (r0 == 0) goto L_0x0186
            kotlin.h0.u.e.d$a r1 = (kotlin.p045h0.p046u.p047e.C9200d.C9201a) r1
            java.lang.reflect.Field r8 = r1.mo33570b()
            kotlin.h0.u.e.i0.e r0 = r2.invoke(r8)
            goto L_0x01b0
        L_0x0186:
            boolean r0 = r1 instanceof kotlin.p045h0.p046u.p047e.C9200d.C9202b
            if (r0 == 0) goto L_0x01d6
            if (r8 == 0) goto L_0x0193
            kotlin.h0.u.e.d$b r1 = (kotlin.p045h0.p046u.p047e.C9200d.C9202b) r1
            java.lang.reflect.Method r8 = r1.mo33571b()
            goto L_0x019b
        L_0x0193:
            kotlin.h0.u.e.d$b r1 = (kotlin.p045h0.p046u.p047e.C9200d.C9202b) r1
            java.lang.reflect.Method r8 = r1.mo33572c()
            if (r8 == 0) goto L_0x01bb
        L_0x019b:
            boolean r0 = r7.mo33589q()
            if (r0 == 0) goto L_0x01ab
            kotlin.h0.u.e.i0.e$h$a r0 = new kotlin.h0.u.e.i0.e$h$a
            java.lang.Object r1 = m34109a((kotlin.p045h0.p046u.p047e.C10150s.C10151a<?, ?>) r7)
            r0.<init>(r8, r1)
            goto L_0x01b0
        L_0x01ab:
            kotlin.h0.u.e.i0.e$h$d r0 = new kotlin.h0.u.e.i0.e$h$d
            r0.<init>(r8)
        L_0x01b0:
            kotlin.reflect.jvm.internal.impl.descriptors.h0 r7 = r7.mo33587o()
            r8 = 0
            r1 = 2
            kotlin.h0.u.e.i0.d r7 = kotlin.p045h0.p046u.p047e.p221i0.C9296h.m30072a(r0, r7, r8, r1, r4)
            return r7
        L_0x01bb:
            kotlin.h0.u.e.x r7 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "No source found for setter of Java method property: "
            r8.append(r0)
            java.lang.reflect.Method r0 = r1.mo33571b()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x01d6:
            boolean r0 = r1 instanceof kotlin.p045h0.p046u.p047e.C9200d.C9204d
            if (r0 == 0) goto L_0x0279
            if (r8 == 0) goto L_0x01e3
            kotlin.h0.u.e.d$d r1 = (kotlin.p045h0.p046u.p047e.C9200d.C9204d) r1
            kotlin.h0.u.e.c$e r8 = r1.mo33578b()
            goto L_0x01eb
        L_0x01e3:
            kotlin.h0.u.e.d$d r1 = (kotlin.p045h0.p046u.p047e.C9200d.C9204d) r1
            kotlin.h0.u.e.c$e r8 = r1.mo33579c()
            if (r8 == 0) goto L_0x025e
        L_0x01eb:
            kotlin.h0.u.e.s r0 = r7.mo33524d()
            kotlin.h0.u.e.i r0 = r0.mo33585i()
            java.lang.String r1 = r8.mo33560c()
            java.lang.String r8 = r8.mo33559b()
            java.lang.reflect.Method r8 = r0.mo33618b(r1, r8)
            if (r8 == 0) goto L_0x0243
            int r0 = r8.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r0 = r0 ^ 1
            boolean r1 = kotlin.C10485x.f28360a
            if (r1 == 0) goto L_0x022d
            if (r0 == 0) goto L_0x0212
            goto L_0x022d
        L_0x0212:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Mapped property cannot have a static accessor: "
            r8.append(r0)
            kotlin.h0.u.e.s r7 = r7.mo33524d()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>(r7)
            throw r8
        L_0x022d:
            boolean r0 = r7.mo33589q()
            if (r0 == 0) goto L_0x023d
            kotlin.h0.u.e.i0.e$h$a r0 = new kotlin.h0.u.e.i0.e$h$a
            java.lang.Object r7 = m34109a((kotlin.p045h0.p046u.p047e.C10150s.C10151a<?, ?>) r7)
            r0.<init>(r8, r7)
            goto L_0x0242
        L_0x023d:
            kotlin.h0.u.e.i0.e$h$d r0 = new kotlin.h0.u.e.i0.e$h$d
            r0.<init>(r8)
        L_0x0242:
            return r0
        L_0x0243:
            kotlin.h0.u.e.x r8 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessor found for property "
            r0.append(r1)
            kotlin.h0.u.e.s r7 = r7.mo33524d()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x025e:
            kotlin.h0.u.e.x r8 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No setter found for property "
            r0.append(r1)
            kotlin.h0.u.e.s r7 = r7.mo33524d()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x0279:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C10161t.m34112b(kotlin.h0.u.e.s$a, boolean):kotlin.h0.u.e.i0.d");
    }

    /* renamed from: a */
    public static final Object m34109a(C10150s.C10151a<?, ?> aVar) {
        C10202j.m34178b(aVar, "$this$boundReceiver");
        return aVar.mo33524d().mo35344s();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m34113b(C10352i0 i0Var) {
        C10359m b = i0Var.mo33762b();
        C10202j.m34174a((Object) b, "containingDeclaration");
        if (!C9999c.m33688m(b)) {
            return false;
        }
        C10359m b2 = b.mo33762b();
        if ((C9999c.m33692q(b2) || C9999c.m33684i(b2)) && (!(i0Var instanceof C11752j) || !C9928i.m33159a(((C11752j) i0Var).m38693y()))) {
            return false;
        }
        return true;
    }
}
