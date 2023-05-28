package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

/* renamed from: kotlin.h0.u.e.k0.c.a.x */
/* compiled from: utils.kt */
public final class C9640x {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30209u(r4) != false) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9624o m31092a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "$this$lexicalCastFrom"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            kotlin.h0.u.e.k0.k.s0 r0 = r4.mo35227v0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r0 = r0.mo33781b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10342e
            r2 = 0
            if (r1 == 0) goto L_0x0048
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r0
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r0.mo33763g()
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = kotlin.reflect.jvm.internal.impl.descriptors.C10345f.ENUM_CLASS
            if (r1 != r3) goto L_0x0048
            kotlin.h0.u.e.k0.h.q.h r4 = r0.mo33928k0()
            kotlin.h0.u.e.k0.e.f r5 = kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f.m33302b(r5)
            java.lang.String r0 = "Name.identifier(value)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r0)
            kotlin.h0.u.e.k0.b.b.d r0 = kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d.FROM_BACKEND
            kotlin.reflect.jvm.internal.impl.descriptors.h r4 = r4.mo33917b(r5, r0)
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10342e
            if (r5 == 0) goto L_0x0047
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r4
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r4.mo33763g()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = kotlin.reflect.jvm.internal.impl.descriptors.C10345f.ENUM_ENTRY
            if (r5 != r0) goto L_0x0047
            kotlin.h0.u.e.k0.c.a.h r2 = new kotlin.h0.u.e.k0.c.a.h
            r2.<init>(r4)
        L_0x0047:
            return r2
        L_0x0048:
            kotlin.h0.u.e.k0.k.b0 r4 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a.m39420d(r4)
            kotlin.reflect.jvm.internal.impl.utils.f r0 = kotlin.reflect.jvm.internal.impl.utils.C12161g.m40167a(r5)
            java.lang.String r1 = r0.mo38764a()
            int r0 = r0.mo38765b()
            boolean r3 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30187d((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r3 == 0) goto L_0x0067
            boolean r4 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ IllegalArgumentException -> 0x00bb }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x0067:
            boolean r3 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30194f(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r3 == 0) goto L_0x0072
            java.lang.Character r5 = kotlin.p392j0.C12137y.m40121h(r5)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x0072:
            boolean r3 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30191e((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r3 == 0) goto L_0x007d
            java.lang.Byte r5 = kotlin.p392j0.C12129u.m40035a(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x007d:
            boolean r3 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30208t(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r3 == 0) goto L_0x0088
            java.lang.Short r5 = kotlin.p392j0.C12129u.m40040d(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x0088:
            boolean r3 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30200l(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r3 == 0) goto L_0x0093
            java.lang.Integer r5 = kotlin.p392j0.C12129u.m40036b(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x0093:
            boolean r3 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30201m(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r3 == 0) goto L_0x009e
            java.lang.Long r5 = kotlin.p392j0.C12129u.m40038c(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x009e:
            boolean r0 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30198j(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r0 == 0) goto L_0x00a9
            java.lang.Float r5 = kotlin.p392j0.C12128t.m40034b(r5)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x00a9:
            boolean r0 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30196h(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r0 == 0) goto L_0x00b4
            java.lang.Double r5 = kotlin.p392j0.C12128t.m40033a(r5)     // Catch:{ IllegalArgumentException -> 0x00bb }
            goto L_0x00bc
        L_0x00b4:
            boolean r4 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30209u(r4)     // Catch:{ IllegalArgumentException -> 0x00bb }
            if (r4 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r5 = r2
        L_0x00bc:
            if (r5 == 0) goto L_0x00c3
            kotlin.h0.u.e.k0.c.a.f r2 = new kotlin.h0.u.e.k0.c.a.f
            r2.<init>(r5)
        L_0x00c3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9640x.m31092a(kotlin.h0.u.e.k0.k.b0, java.lang.String):kotlin.h0.u.e.k0.c.a.o");
    }
}
