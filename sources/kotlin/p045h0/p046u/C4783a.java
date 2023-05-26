package kotlin.p045h0.p046u;

/* renamed from: kotlin.h0.u.a */
/* compiled from: KCallablesJvm.kt */
public final class C4783a {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        r3 = r3.mo33586j();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7901a(kotlin.p045h0.C9153b<?> r3, boolean r4) {
        /*
            java.lang.String r0 = "$this$isAccessible"
            kotlin.jvm.internal.C10202j.m34178b(r3, r0)
            boolean r0 = r3 instanceof kotlin.p045h0.C9158g
            if (r0 == 0) goto L_0x002b
            r0 = r3
            kotlin.h0.l r0 = (kotlin.p045h0.C9168l) r0
            java.lang.reflect.Field r1 = kotlin.p045h0.p046u.C4785c.m7905a((kotlin.p045h0.C9168l<?>) r0)
            if (r1 == 0) goto L_0x0015
            r1.setAccessible(r4)
        L_0x0015:
            java.lang.reflect.Method r0 = kotlin.p045h0.p046u.C4785c.m7909b((kotlin.p045h0.C9168l<?>) r0)
            if (r0 == 0) goto L_0x001e
            r0.setAccessible(r4)
        L_0x001e:
            kotlin.h0.g r3 = (kotlin.p045h0.C9158g) r3
            java.lang.reflect.Method r3 = kotlin.p045h0.p046u.C4785c.m7906a((kotlin.p045h0.C9158g<?>) r3)
            if (r3 == 0) goto L_0x00bf
            r3.setAccessible(r4)
            goto L_0x00bf
        L_0x002b:
            boolean r0 = r3 instanceof kotlin.p045h0.C9168l
            if (r0 == 0) goto L_0x0045
            kotlin.h0.l r3 = (kotlin.p045h0.C9168l) r3
            java.lang.reflect.Field r0 = kotlin.p045h0.p046u.C4785c.m7905a((kotlin.p045h0.C9168l<?>) r3)
            if (r0 == 0) goto L_0x003a
            r0.setAccessible(r4)
        L_0x003a:
            java.lang.reflect.Method r3 = kotlin.p045h0.p046u.C4785c.m7909b((kotlin.p045h0.C9168l<?>) r3)
            if (r3 == 0) goto L_0x00bf
            r3.setAccessible(r4)
            goto L_0x00bf
        L_0x0045:
            boolean r0 = r3 instanceof kotlin.p045h0.C9168l.C9170b
            if (r0 == 0) goto L_0x0065
            r0 = r3
            kotlin.h0.l$b r0 = (kotlin.p045h0.C9168l.C9170b) r0
            kotlin.h0.l r0 = r0.mo33524d()
            java.lang.reflect.Field r0 = kotlin.p045h0.p046u.C4785c.m7905a((kotlin.p045h0.C9168l<?>) r0)
            if (r0 == 0) goto L_0x0059
            r0.setAccessible(r4)
        L_0x0059:
            kotlin.h0.f r3 = (kotlin.p045h0.C9157f) r3
            java.lang.reflect.Method r3 = kotlin.p045h0.p046u.C4785c.m7908b((kotlin.p045h0.C9157f<?>) r3)
            if (r3 == 0) goto L_0x00bf
            r3.setAccessible(r4)
            goto L_0x00bf
        L_0x0065:
            boolean r0 = r3 instanceof kotlin.p045h0.C9158g.C9159a
            if (r0 == 0) goto L_0x0085
            r0 = r3
            kotlin.h0.g$a r0 = (kotlin.p045h0.C9158g.C9159a) r0
            kotlin.h0.l r0 = r0.mo33524d()
            java.lang.reflect.Field r0 = kotlin.p045h0.p046u.C4785c.m7905a((kotlin.p045h0.C9168l<?>) r0)
            if (r0 == 0) goto L_0x0079
            r0.setAccessible(r4)
        L_0x0079:
            kotlin.h0.f r3 = (kotlin.p045h0.C9157f) r3
            java.lang.reflect.Method r3 = kotlin.p045h0.p046u.C4785c.m7908b((kotlin.p045h0.C9157f<?>) r3)
            if (r3 == 0) goto L_0x00bf
            r3.setAccessible(r4)
            goto L_0x00bf
        L_0x0085:
            boolean r0 = r3 instanceof kotlin.p045h0.C9157f
            if (r0 == 0) goto L_0x00c0
            r0 = r3
            kotlin.h0.f r0 = (kotlin.p045h0.C9157f) r0
            java.lang.reflect.Method r1 = kotlin.p045h0.p046u.C4785c.m7908b((kotlin.p045h0.C9157f<?>) r0)
            if (r1 == 0) goto L_0x0095
            r1.setAccessible(r4)
        L_0x0095:
            kotlin.h0.u.e.e r3 = kotlin.p045h0.p046u.p047e.C9244g0.m30001a((java.lang.Object) r3)
            r1 = 0
            if (r3 == 0) goto L_0x00a7
            kotlin.h0.u.e.i0.d r3 = r3.mo33586j()
            if (r3 == 0) goto L_0x00a7
            java.lang.reflect.Member r3 = r3.getMember()
            goto L_0x00a8
        L_0x00a7:
            r3 = r1
        L_0x00a8:
            boolean r2 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r2 != 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r1 = r3
        L_0x00ae:
            java.lang.reflect.AccessibleObject r1 = (java.lang.reflect.AccessibleObject) r1
            if (r1 == 0) goto L_0x00b6
            r3 = 1
            r1.setAccessible(r3)
        L_0x00b6:
            java.lang.reflect.Constructor r3 = kotlin.p045h0.p046u.C4785c.m7904a(r0)
            if (r3 == 0) goto L_0x00bf
            r3.setAccessible(r4)
        L_0x00bf:
            return
        L_0x00c0:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown callable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.C4783a.m7901a(kotlin.h0.b, boolean):void");
    }
}
