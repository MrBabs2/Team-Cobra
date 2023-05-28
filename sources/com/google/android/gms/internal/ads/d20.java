package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzpo;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.root.execution.Command;

final class d20 {

    /* renamed from: a */
    private static final int f14800a = zzsy.m25292b("vide");

    /* renamed from: b */
    private static final int f14801b = zzsy.m25292b("soun");

    /* renamed from: c */
    private static final int f14802c = zzsy.m25292b(Command.CommandHandler.TEXT);

    /* renamed from: d */
    private static final int f14803d = zzsy.m25292b("sbtl");

    /* renamed from: e */
    private static final int f14804e = zzsy.m25292b("subt");

    /* renamed from: f */
    private static final int f14805f = zzsy.m25292b("clcp");

    /* renamed from: g */
    private static final int f14806g = zzsy.m25292b("cenc");

    /* renamed from: h */
    private static final int f14807h = zzsy.m25292b("meta");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x049b: MOVE  (r10v11 java.lang.String) = (r25v11 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0485 A[SYNTHETIC] */
    /* renamed from: a */
    public static com.google.android.gms.internal.ads.zzpa m16771a(com.google.android.gms.internal.ads.b20 r50, com.google.android.gms.internal.ads.c20 r51, long r52, com.google.android.gms.internal.ads.zzne r54, boolean r55) throws com.google.android.gms.internal.ads.zzlm {
        /*
            r0 = r50
            int r1 = com.google.android.gms.internal.ads.a20.f14395z
            com.google.android.gms.internal.ads.b20 r1 = r0.mo25624e(r1)
            int r2 = com.google.android.gms.internal.ads.a20.f14331L
            com.google.android.gms.internal.ads.c20 r2 = r1.mo25623d(r2)
            com.google.android.gms.internal.ads.zzst r2 = r2.f14694z0
            r3 = 16
            r2.mo29727b(r3)
            int r2 = r2.mo29730d()
            int r4 = f14801b
            r5 = 4
            r6 = 3
            r8 = -1
            if (r2 != r4) goto L_0x0022
            r12 = 1
            goto L_0x0042
        L_0x0022:
            int r4 = f14800a
            if (r2 != r4) goto L_0x0028
            r12 = 2
            goto L_0x0042
        L_0x0028:
            int r4 = f14802c
            if (r2 == r4) goto L_0x0041
            int r4 = f14803d
            if (r2 == r4) goto L_0x0041
            int r4 = f14804e
            if (r2 == r4) goto L_0x0041
            int r4 = f14805f
            if (r2 != r4) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r4 = f14807h
            if (r2 != r4) goto L_0x003f
            r12 = 4
            goto L_0x0042
        L_0x003f:
            r12 = -1
            goto L_0x0042
        L_0x0041:
            r12 = 3
        L_0x0042:
            r2 = 0
            if (r12 != r8) goto L_0x0046
            return r2
        L_0x0046:
            int r4 = com.google.android.gms.internal.ads.a20.f14327H
            com.google.android.gms.internal.ads.c20 r4 = r0.mo25623d(r4)
            com.google.android.gms.internal.ads.zzst r4 = r4.f14694z0
            r10 = 8
            r4.mo29727b(r10)
            int r11 = r4.mo29730d()
            int r11 = com.google.android.gms.internal.ads.a20.m16461b(r11)
            if (r11 != 0) goto L_0x0060
            r13 = 8
            goto L_0x0062
        L_0x0060:
            r13 = 16
        L_0x0062:
            r4.mo29729c(r13)
            int r13 = r4.mo29730d()
            r4.mo29729c(r5)
            int r14 = r4.mo29726b()
            if (r11 != 0) goto L_0x0074
            r15 = 4
            goto L_0x0076
        L_0x0074:
            r15 = 8
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 >= r15) goto L_0x0086
            byte[] r7 = r4.f22660a
            int r16 = r14 + r9
            byte r7 = r7[r16]
            if (r7 == r8) goto L_0x0083
            r7 = 0
            goto L_0x0087
        L_0x0083:
            int r9 = r9 + 1
            goto L_0x0077
        L_0x0086:
            r7 = 1
        L_0x0087:
            r16 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x0096
            r4.mo29729c(r15)
        L_0x0093:
            r14 = r18
            goto L_0x00a6
        L_0x0096:
            if (r11 != 0) goto L_0x009d
            long r14 = r4.mo29738j()
            goto L_0x00a1
        L_0x009d:
            long r14 = r4.mo29741m()
        L_0x00a1:
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x00a6
            goto L_0x0093
        L_0x00a6:
            r4.mo29729c(r3)
            int r7 = r4.mo29730d()
            int r9 = r4.mo29730d()
            r4.mo29729c(r5)
            int r11 = r4.mo29730d()
            int r4 = r4.mo29730d()
            r5 = 65536(0x10000, float:9.18355E-41)
            r3 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L_0x00cb
            if (r9 != r5) goto L_0x00cb
            if (r11 != r3) goto L_0x00cb
            if (r4 != 0) goto L_0x00cb
            r3 = 90
            goto L_0x00e2
        L_0x00cb:
            if (r7 != 0) goto L_0x00d6
            if (r9 != r3) goto L_0x00d6
            if (r11 != r5) goto L_0x00d6
            if (r4 != 0) goto L_0x00d6
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x00e2
        L_0x00d6:
            if (r7 != r3) goto L_0x00e1
            if (r9 != 0) goto L_0x00e1
            if (r11 != 0) goto L_0x00e1
            if (r4 != r3) goto L_0x00e1
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            com.google.android.gms.internal.ads.j20 r4 = new com.google.android.gms.internal.ads.j20
            r4.<init>(r13, r14, r3)
            long r22 = com.google.android.gms.internal.ads.j20.m17307a(r4)
            r3 = r51
            com.google.android.gms.internal.ads.zzst r3 = r3.f14694z0
            r3.mo29727b(r10)
            int r5 = r3.mo29730d()
            int r5 = com.google.android.gms.internal.ads.a20.m16461b(r5)
            if (r5 != 0) goto L_0x00ff
            r5 = 8
            goto L_0x0101
        L_0x00ff:
            r5 = 16
        L_0x0101:
            r3.mo29729c(r5)
            long r28 = r3.mo29738j()
            int r3 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x010d
            goto L_0x0118
        L_0x010d:
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r26 = r28
            long r13 = com.google.android.gms.internal.ads.zzsy.m25284a((long) r22, (long) r24, (long) r26)
            r18 = r13
        L_0x0118:
            int r3 = com.google.android.gms.internal.ads.a20.f14320A
            com.google.android.gms.internal.ads.b20 r3 = r1.mo25624e(r3)
            int r5 = com.google.android.gms.internal.ads.a20.f14321B
            com.google.android.gms.internal.ads.b20 r3 = r3.mo25624e(r5)
            int r5 = com.google.android.gms.internal.ads.a20.f14330K
            com.google.android.gms.internal.ads.c20 r1 = r1.mo25623d(r5)
            com.google.android.gms.internal.ads.zzst r1 = r1.f14694z0
            r1.mo29727b(r10)
            int r5 = r1.mo29730d()
            int r5 = com.google.android.gms.internal.ads.a20.m16461b(r5)
            if (r5 != 0) goto L_0x013c
            r7 = 8
            goto L_0x013e
        L_0x013c:
            r7 = 16
        L_0x013e:
            r1.mo29729c(r7)
            long r13 = r1.mo29738j()
            if (r5 != 0) goto L_0x0149
            r5 = 4
            goto L_0x014b
        L_0x0149:
            r5 = 8
        L_0x014b:
            r1.mo29729c(r5)
            int r1 = r1.mo29736h()
            int r5 = r1 >> 10
            r5 = r5 & 31
            int r5 = r5 + 96
            char r5 = (char) r5
            int r7 = r1 >> 5
            r7 = r7 & 31
            int r7 = r7 + 96
            char r7 = (char) r7
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r5)
            r9.append(r7)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            int r5 = com.google.android.gms.internal.ads.a20.f14332M
            com.google.android.gms.internal.ads.c20 r3 = r3.mo25623d(r5)
            com.google.android.gms.internal.ads.zzst r3 = r3.f14694z0
            int r5 = com.google.android.gms.internal.ads.j20.m17308b(r4)
            int r7 = com.google.android.gms.internal.ads.j20.m17309c(r4)
            java.lang.Object r9 = r1.second
            java.lang.String r9 = (java.lang.String) r9
            r11 = 12
            r3.mo29727b(r11)
            int r11 = r3.mo29730d()
            com.google.android.gms.internal.ads.g20 r13 = new com.google.android.gms.internal.ads.g20
            r13.<init>(r11)
            r14 = 0
        L_0x01a2:
            if (r14 >= r11) goto L_0x0678
            int r15 = r3.mo29726b()
            int r6 = r3.mo29730d()
            if (r6 <= 0) goto L_0x01b0
            r10 = 1
            goto L_0x01b1
        L_0x01b0:
            r10 = 0
        L_0x01b1:
            java.lang.String r2 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzsk.m25217a(r10, r2)
            int r10 = r3.mo29730d()
            int r8 = com.google.android.gms.internal.ads.a20.f14349c
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14351d
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14337R
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14342W
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14353e
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14355f
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14357g
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14386u0
            if (r10 == r8) goto L_0x04d3
            int r8 = com.google.android.gms.internal.ads.a20.f14388v0
            if (r10 != r8) goto L_0x01e0
            goto L_0x04d3
        L_0x01e0:
            int r8 = com.google.android.gms.internal.ads.a20.f14361i
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14338S
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14371n
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14375p
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14379r
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14385u
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14381s
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14383t
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14364j0
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14366k0
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14367l
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14369m
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14363j
            if (r10 == r8) goto L_0x02b8
            int r8 = com.google.android.gms.internal.ads.a20.f14394y0
            if (r10 != r8) goto L_0x021a
            goto L_0x02b8
        L_0x021a:
            int r2 = com.google.android.gms.internal.ads.a20.f14341V
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.a20.f14356f0
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.a20.f14358g0
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.a20.f14360h0
            if (r10 == r2) goto L_0x0249
            int r2 = com.google.android.gms.internal.ads.a20.f14362i0
            if (r10 != r2) goto L_0x022f
            goto L_0x0249
        L_0x022f:
            int r2 = com.google.android.gms.internal.ads.a20.f14392x0
            if (r10 != r2) goto L_0x0245
            java.lang.String r2 = java.lang.Integer.toString(r5)
            java.lang.String r8 = "application/x-camera-motion"
            r51 = r11
            r10 = -1
            r11 = 0
            com.google.android.gms.internal.ads.zzlh r2 = com.google.android.gms.internal.ads.zzlh.m24754a(r2, r8, r11, r10, r11)
            r13.f15263b = r2
            goto L_0x02fb
        L_0x0245:
            r51 = r11
            goto L_0x02fb
        L_0x0249:
            r51 = r11
            int r2 = r15 + 8
            r8 = 8
            int r2 = r2 + r8
            r3.mo29727b(r2)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.android.gms.internal.ads.a20.f14341V
            java.lang.String r11 = "application/ttml+xml"
            if (r10 != r2) goto L_0x0265
            r31 = r11
        L_0x0260:
            r38 = r25
        L_0x0262:
            r40 = 0
            goto L_0x029b
        L_0x0265:
            int r2 = com.google.android.gms.internal.ads.a20.f14356f0
            if (r10 != r2) goto L_0x027f
            int r2 = r6 + -8
            int r2 = r2 - r8
            byte[] r8 = new byte[r2]
            r10 = 0
            r3.mo29725a(r8, r10, r2)
            java.util.List r2 = java.util.Collections.singletonList(r8)
            java.lang.String r8 = "application/x-quicktime-tx3g"
            r40 = r2
            r31 = r8
            r38 = r25
            goto L_0x029b
        L_0x027f:
            int r2 = com.google.android.gms.internal.ads.a20.f14358g0
            if (r10 != r2) goto L_0x0288
            java.lang.String r2 = "application/x-mp4-vtt"
        L_0x0285:
            r31 = r2
            goto L_0x0260
        L_0x0288:
            int r2 = com.google.android.gms.internal.ads.a20.f14360h0
            if (r10 != r2) goto L_0x0291
            r31 = r11
            r38 = r16
            goto L_0x0262
        L_0x0291:
            int r2 = com.google.android.gms.internal.ads.a20.f14362i0
            if (r10 != r2) goto L_0x02b2
            r2 = 1
            r13.f15265d = r2
            java.lang.String r2 = "application/x-mp4-cea-608"
            goto L_0x0285
        L_0x029b:
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = 0
            r36 = -1
            r37 = 0
            r35 = r9
            com.google.android.gms.internal.ads.zzlh r2 = com.google.android.gms.internal.ads.zzlh.m24752a(r30, r31, r32, r33, r34, r35, r36, r37, r38, r40)
            r13.f15263b = r2
            goto L_0x02fb
        L_0x02b2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02b8:
            r51 = r11
            int r8 = r15 + 8
            r11 = 8
            int r8 = r8 + r11
            r3.mo29727b(r8)
            r8 = 6
            if (r55 == 0) goto L_0x02cf
            int r22 = r3.mo29736h()
            r3.mo29729c(r8)
            r11 = r22
            goto L_0x02d3
        L_0x02cf:
            r3.mo29729c(r11)
            r11 = 0
        L_0x02d3:
            if (r11 == 0) goto L_0x0306
            r8 = 1
            if (r11 != r8) goto L_0x02d9
            goto L_0x0306
        L_0x02d9:
            r8 = 2
            if (r11 != r8) goto L_0x02fb
            r8 = 16
            r3.mo29729c(r8)
            long r25 = r3.mo29732e()
            double r25 = java.lang.Double.longBitsToDouble(r25)
            r8 = r12
            long r11 = java.lang.Math.round(r25)
            int r12 = (int) r11
            int r11 = r3.mo29740l()
            r25 = r11
            r11 = 20
            r3.mo29729c(r11)
            goto L_0x0323
        L_0x02fb:
            r46 = r1
            r47 = r4
            r48 = r7
            r45 = r12
        L_0x0303:
            r1 = 3
            goto L_0x065f
        L_0x0306:
            r8 = r12
            int r12 = r3.mo29736h()
            r26 = r12
            r12 = 6
            r3.mo29729c(r12)
            int r12 = r3.mo29739k()
            r25 = r12
            r12 = 1
            if (r11 != r12) goto L_0x031f
            r11 = 16
            r3.mo29729c(r11)
        L_0x031f:
            r12 = r25
            r25 = r26
        L_0x0323:
            int r11 = r3.mo29726b()
            r26 = r12
            int r12 = com.google.android.gms.internal.ads.a20.f14338S
            if (r10 != r12) goto L_0x0334
            int r10 = m16768a((com.google.android.gms.internal.ads.zzst) r3, (int) r15, (int) r6, (com.google.android.gms.internal.ads.g20) r13, (int) r14)
            r3.mo29727b(r11)
        L_0x0334:
            int r12 = com.google.android.gms.internal.ads.a20.f14371n
            r27 = r11
            java.lang.String r11 = "audio/raw"
            if (r10 != r12) goto L_0x033f
            java.lang.String r10 = "audio/ac3"
            goto L_0x0388
        L_0x033f:
            int r12 = com.google.android.gms.internal.ads.a20.f14375p
            if (r10 != r12) goto L_0x0346
            java.lang.String r10 = "audio/eac3"
            goto L_0x0388
        L_0x0346:
            int r12 = com.google.android.gms.internal.ads.a20.f14379r
            if (r10 != r12) goto L_0x034d
            java.lang.String r10 = "audio/vnd.dts"
            goto L_0x0388
        L_0x034d:
            int r12 = com.google.android.gms.internal.ads.a20.f14381s
            if (r10 == r12) goto L_0x0386
            int r12 = com.google.android.gms.internal.ads.a20.f14383t
            if (r10 != r12) goto L_0x0356
            goto L_0x0386
        L_0x0356:
            int r12 = com.google.android.gms.internal.ads.a20.f14385u
            if (r10 != r12) goto L_0x035d
            java.lang.String r10 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0388
        L_0x035d:
            int r12 = com.google.android.gms.internal.ads.a20.f14364j0
            if (r10 != r12) goto L_0x0364
            java.lang.String r10 = "audio/3gpp"
            goto L_0x0388
        L_0x0364:
            int r12 = com.google.android.gms.internal.ads.a20.f14366k0
            if (r10 != r12) goto L_0x036b
            java.lang.String r10 = "audio/amr-wb"
            goto L_0x0388
        L_0x036b:
            int r12 = com.google.android.gms.internal.ads.a20.f14367l
            if (r10 == r12) goto L_0x0384
            int r12 = com.google.android.gms.internal.ads.a20.f14369m
            if (r10 != r12) goto L_0x0374
            goto L_0x0384
        L_0x0374:
            int r12 = com.google.android.gms.internal.ads.a20.f14363j
            if (r10 != r12) goto L_0x037b
            java.lang.String r10 = "audio/mpeg"
            goto L_0x0388
        L_0x037b:
            int r12 = com.google.android.gms.internal.ads.a20.f14394y0
            if (r10 != r12) goto L_0x0382
            java.lang.String r10 = "audio/alac"
            goto L_0x0388
        L_0x0382:
            r10 = 0
            goto L_0x0388
        L_0x0384:
            r10 = r11
            goto L_0x0388
        L_0x0386:
            java.lang.String r10 = "audio/vnd.dts.hd"
        L_0x0388:
            r45 = r8
            r12 = 0
            r49 = r25
            r25 = r10
            r10 = r27
            r27 = r26
            r26 = r49
        L_0x0395:
            int r8 = r10 - r15
            if (r8 >= r6) goto L_0x0490
            r3.mo29727b(r10)
            int r8 = r3.mo29730d()
            r46 = r1
            if (r8 <= 0) goto L_0x03a6
            r1 = 1
            goto L_0x03a7
        L_0x03a6:
            r1 = 0
        L_0x03a7:
            com.google.android.gms.internal.ads.zzsk.m25217a(r1, r2)
            int r1 = r3.mo29730d()
            r47 = r4
            int r4 = com.google.android.gms.internal.ads.a20.f14324E
            if (r1 == r4) goto L_0x041c
            if (r55 == 0) goto L_0x03bb
            int r4 = com.google.android.gms.internal.ads.a20.f14365k
            if (r1 != r4) goto L_0x03bb
            goto L_0x041c
        L_0x03bb:
            int r4 = com.google.android.gms.internal.ads.a20.f14373o
            if (r1 != r4) goto L_0x03d1
            int r1 = r10 + 8
            r3.mo29727b(r1)
            java.lang.String r1 = java.lang.Integer.toString(r5)
            r4 = 0
            com.google.android.gms.internal.ads.zzlh r1 = com.google.android.gms.internal.ads.zzlv.m24802a(r3, r1, r9, r4)
            r13.f15263b = r1
        L_0x03cf:
            r4 = 0
            goto L_0x0417
        L_0x03d1:
            int r4 = com.google.android.gms.internal.ads.a20.f14377q
            if (r1 != r4) goto L_0x03e6
            int r1 = r10 + 8
            r3.mo29727b(r1)
            java.lang.String r1 = java.lang.Integer.toString(r5)
            r4 = 0
            com.google.android.gms.internal.ads.zzlh r1 = com.google.android.gms.internal.ads.zzlv.m24803b(r3, r1, r9, r4)
            r13.f15263b = r1
            goto L_0x03cf
        L_0x03e6:
            int r4 = com.google.android.gms.internal.ads.a20.f14387v
            if (r1 != r4) goto L_0x0409
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = -1
            r37 = 0
            r38 = 0
            r39 = 0
            r31 = r25
            r35 = r26
            r36 = r27
            r40 = r9
            com.google.android.gms.internal.ads.zzlh r1 = com.google.android.gms.internal.ads.zzlh.m24751a(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r13.f15263b = r1
            goto L_0x03cf
        L_0x0409:
            int r4 = com.google.android.gms.internal.ads.a20.f14394y0
            if (r1 != r4) goto L_0x03cf
            byte[] r1 = new byte[r8]
            r3.mo29727b(r10)
            r4 = 0
            r3.mo29725a(r1, r4, r8)
            r12 = r1
        L_0x0417:
            r48 = r7
            r0 = -1
            goto L_0x0485
        L_0x041c:
            int r4 = com.google.android.gms.internal.ads.a20.f14324E
            if (r1 != r4) goto L_0x0425
            r48 = r7
            r1 = r10
        L_0x0423:
            r0 = -1
            goto L_0x0451
        L_0x0425:
            int r1 = r3.mo29726b()
        L_0x0429:
            int r4 = r1 - r10
            if (r4 >= r8) goto L_0x044d
            r3.mo29727b(r1)
            int r4 = r3.mo29730d()
            if (r4 <= 0) goto L_0x0438
            r0 = 1
            goto L_0x0439
        L_0x0438:
            r0 = 0
        L_0x0439:
            com.google.android.gms.internal.ads.zzsk.m25217a(r0, r2)
            int r0 = r3.mo29730d()
            r48 = r7
            int r7 = com.google.android.gms.internal.ads.a20.f14324E
            if (r0 != r7) goto L_0x0447
            goto L_0x0423
        L_0x0447:
            int r1 = r1 + r4
            r0 = r50
            r7 = r48
            goto L_0x0429
        L_0x044d:
            r48 = r7
            r0 = -1
            r1 = -1
        L_0x0451:
            if (r1 == r0) goto L_0x0485
            android.util.Pair r1 = m16769a((com.google.android.gms.internal.ads.zzst) r3, (int) r1)
            java.lang.Object r4 = r1.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.second
            r12 = r1
            byte[] r12 = (byte[]) r12
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0483
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzsl.m25221a((byte[]) r12)
            java.lang.Object r7 = r1.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r26 = r1
            r25 = r4
            r27 = r7
            goto L_0x0485
        L_0x0483:
            r25 = r4
        L_0x0485:
            int r10 = r10 + r8
            r0 = r50
            r1 = r46
            r4 = r47
            r7 = r48
            goto L_0x0395
        L_0x0490:
            r46 = r1
            r47 = r4
            r48 = r7
            r0 = -1
            com.google.android.gms.internal.ads.zzlh r1 = r13.f15263b
            if (r1 != 0) goto L_0x0303
            r10 = r25
            if (r10 == 0) goto L_0x0303
            boolean r1 = r11.equals(r10)
            if (r1 == 0) goto L_0x04a8
            r37 = 2
            goto L_0x04aa
        L_0x04a8:
            r37 = -1
        L_0x04aa:
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = -1
            if (r12 != 0) goto L_0x04b9
            r38 = 0
            goto L_0x04bf
        L_0x04b9:
            java.util.List r1 = java.util.Collections.singletonList(r12)
            r38 = r1
        L_0x04bf:
            r39 = 0
            r40 = 0
            r31 = r10
            r35 = r26
            r36 = r27
            r41 = r9
            com.google.android.gms.internal.ads.zzlh r1 = com.google.android.gms.internal.ads.zzlh.m24750a(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r13.f15263b = r1
            goto L_0x0303
        L_0x04d3:
            r46 = r1
            r47 = r4
            r48 = r7
            r51 = r11
            r45 = r12
            r0 = -1
            int r1 = r15 + 8
            r4 = 8
            int r1 = r1 + r4
            r3.mo29727b(r1)
            r1 = 16
            r3.mo29729c(r1)
            int r35 = r3.mo29736h()
            int r36 = r3.mo29736h()
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 50
            r3.mo29729c(r7)
            int r7 = r3.mo29726b()
            int r8 = com.google.android.gms.internal.ads.a20.f14337R
            if (r10 != r8) goto L_0x0509
            int r10 = m16768a((com.google.android.gms.internal.ads.zzst) r3, (int) r15, (int) r6, (com.google.android.gms.internal.ads.g20) r13, (int) r14)
            r3.mo29727b(r7)
        L_0x0509:
            r4 = 0
            r31 = 0
            r38 = 0
            r40 = 1065353216(0x3f800000, float:1.0)
            r41 = 0
            r42 = -1
        L_0x0514:
            int r8 = r7 - r15
            if (r8 >= r6) goto L_0x0644
            r3.mo29727b(r7)
            int r8 = r3.mo29726b()
            int r11 = r3.mo29730d()
            if (r11 != 0) goto L_0x052c
            int r12 = r3.mo29726b()
            int r12 = r12 - r15
            if (r12 == r6) goto L_0x0644
        L_0x052c:
            if (r11 <= 0) goto L_0x0530
            r12 = 1
            goto L_0x0531
        L_0x0530:
            r12 = 0
        L_0x0531:
            com.google.android.gms.internal.ads.zzsk.m25217a(r12, r2)
            int r12 = r3.mo29730d()
            int r0 = com.google.android.gms.internal.ads.a20.f14322C
            if (r12 != r0) goto L_0x055c
            if (r31 != 0) goto L_0x0540
            r0 = 1
            goto L_0x0541
        L_0x0540:
            r0 = 0
        L_0x0541:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            int r8 = r8 + 8
            r3.mo29727b(r8)
            com.google.android.gms.internal.ads.zzta r0 = com.google.android.gms.internal.ads.zzta.m25297a(r3)
            java.util.List<byte[]> r8 = r0.f22676a
            int r12 = r0.f22677b
            r13.f15264c = r12
            if (r4 != 0) goto L_0x0559
            float r0 = r0.f22678c
            r40 = r0
        L_0x0559:
            java.lang.String r31 = "video/avc"
            goto L_0x0579
        L_0x055c:
            int r0 = com.google.android.gms.internal.ads.a20.f14323D
            if (r12 != r0) goto L_0x0580
            if (r31 != 0) goto L_0x0564
            r0 = 1
            goto L_0x0565
        L_0x0564:
            r0 = 0
        L_0x0565:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            int r8 = r8 + 8
            r3.mo29727b(r8)
            com.google.android.gms.internal.ads.zztg r0 = com.google.android.gms.internal.ads.zztg.m25301a(r3)
            java.util.List<byte[]> r8 = r0.f22688a
            int r0 = r0.f22689b
            r13.f15264c = r0
            java.lang.String r31 = "video/hevc"
        L_0x0579:
            r25 = r2
            r38 = r8
        L_0x057d:
            r1 = 3
            goto L_0x063c
        L_0x0580:
            int r0 = com.google.android.gms.internal.ads.a20.f14390w0
            if (r12 != r0) goto L_0x0598
            if (r31 != 0) goto L_0x0588
            r0 = 1
            goto L_0x0589
        L_0x0588:
            r0 = 0
        L_0x0589:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            int r0 = com.google.android.gms.internal.ads.a20.f14386u0
            if (r10 != r0) goto L_0x0593
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0595
        L_0x0593:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x0595:
            r31 = r0
            goto L_0x05a6
        L_0x0598:
            int r0 = com.google.android.gms.internal.ads.a20.f14359h
            if (r12 != r0) goto L_0x05a9
            if (r31 != 0) goto L_0x05a0
            r0 = 1
            goto L_0x05a1
        L_0x05a0:
            r0 = 0
        L_0x05a1:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            java.lang.String r31 = "video/3gpp"
        L_0x05a6:
            r25 = r2
            goto L_0x057d
        L_0x05a9:
            int r0 = com.google.android.gms.internal.ads.a20.f14324E
            if (r12 != r0) goto L_0x05c8
            if (r31 != 0) goto L_0x05b1
            r0 = 1
            goto L_0x05b2
        L_0x05b1:
            r0 = 0
        L_0x05b2:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            android.util.Pair r0 = m16769a((com.google.android.gms.internal.ads.zzst) r3, (int) r8)
            java.lang.Object r8 = r0.first
            r31 = r8
            java.lang.String r31 = (java.lang.String) r31
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r38 = java.util.Collections.singletonList(r0)
            goto L_0x05a6
        L_0x05c8:
            int r0 = com.google.android.gms.internal.ads.a20.f14340U
            if (r12 != r0) goto L_0x05e2
            int r8 = r8 + 8
            r3.mo29727b(r8)
            int r0 = r3.mo29740l()
            int r4 = r3.mo29740l()
            float r0 = (float) r0
            float r4 = (float) r4
            float r40 = r0 / r4
            r25 = r2
            r1 = 3
            r4 = 1
            goto L_0x063c
        L_0x05e2:
            int r0 = com.google.android.gms.internal.ads.a20.f14382s0
            if (r12 != r0) goto L_0x0612
            int r0 = r8 + 8
        L_0x05e8:
            int r12 = r0 - r8
            if (r12 >= r11) goto L_0x060b
            r3.mo29727b(r0)
            int r12 = r3.mo29730d()
            int r1 = r3.mo29730d()
            r25 = r2
            int r2 = com.google.android.gms.internal.ads.a20.f14384t0
            if (r1 != r2) goto L_0x0605
            byte[] r1 = r3.f22660a
            int r12 = r12 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r12)
            goto L_0x060e
        L_0x0605:
            int r0 = r0 + r12
            r2 = r25
            r1 = 16
            goto L_0x05e8
        L_0x060b:
            r25 = r2
            r0 = 0
        L_0x060e:
            r41 = r0
            goto L_0x057d
        L_0x0612:
            r25 = r2
            int r0 = com.google.android.gms.internal.ads.a20.f14380r0
            if (r12 != r0) goto L_0x057d
            int r0 = r3.mo29735g()
            r1 = 3
            r3.mo29729c(r1)
            if (r0 != 0) goto L_0x063c
            int r0 = r3.mo29735g()
            if (r0 == 0) goto L_0x063a
            r2 = 1
            if (r0 == r2) goto L_0x0637
            r2 = 2
            if (r0 == r2) goto L_0x0634
            if (r0 == r1) goto L_0x0631
            goto L_0x063c
        L_0x0631:
            r42 = 3
            goto L_0x063c
        L_0x0634:
            r42 = 2
            goto L_0x063c
        L_0x0637:
            r42 = 1
            goto L_0x063c
        L_0x063a:
            r42 = 0
        L_0x063c:
            int r7 = r7 + r11
            r2 = r25
            r0 = -1
            r1 = 16
            goto L_0x0514
        L_0x0644:
            r1 = 3
            if (r31 == 0) goto L_0x065f
            java.lang.String r30 = java.lang.Integer.toString(r5)
            r32 = 0
            r33 = -1
            r34 = -1
            r37 = -1082130432(0xffffffffbf800000, float:-1.0)
            r43 = 0
            r44 = 0
            r39 = r48
            com.google.android.gms.internal.ads.zzlh r0 = com.google.android.gms.internal.ads.zzlh.m24749a(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r13.f15263b = r0
        L_0x065f:
            int r15 = r15 + r6
            r3.mo29727b(r15)
            int r14 = r14 + 1
            r0 = r50
            r11 = r51
            r12 = r45
            r1 = r46
            r4 = r47
            r7 = r48
            r2 = 0
            r6 = 3
            r8 = -1
            r10 = 8
            goto L_0x01a2
        L_0x0678:
            r46 = r1
            r47 = r4
            r45 = r12
            int r0 = com.google.android.gms.internal.ads.a20.f14328I
            r1 = r50
            com.google.android.gms.internal.ads.b20 r0 = r1.mo25624e(r0)
            if (r0 == 0) goto L_0x06e3
            int r1 = com.google.android.gms.internal.ads.a20.f14329J
            com.google.android.gms.internal.ads.c20 r0 = r0.mo25623d(r1)
            if (r0 != 0) goto L_0x0691
            goto L_0x06e3
        L_0x0691:
            com.google.android.gms.internal.ads.zzst r0 = r0.f14694z0
            r1 = 8
            r0.mo29727b(r1)
            int r1 = r0.mo29730d()
            int r1 = com.google.android.gms.internal.ads.a20.m16461b(r1)
            int r2 = r0.mo29740l()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r7 = 0
        L_0x06a9:
            if (r7 >= r2) goto L_0x06dc
            r5 = 1
            if (r1 != r5) goto L_0x06b3
            long r8 = r0.mo29741m()
            goto L_0x06b7
        L_0x06b3:
            long r8 = r0.mo29738j()
        L_0x06b7:
            r3[r7] = r8
            if (r1 != r5) goto L_0x06c0
            long r8 = r0.mo29732e()
            goto L_0x06c5
        L_0x06c0:
            int r6 = r0.mo29730d()
            long r8 = (long) r6
        L_0x06c5:
            r4[r7] = r8
            short r6 = r0.mo29734f()
            if (r6 != r5) goto L_0x06d4
            r6 = 2
            r0.mo29729c(r6)
            int r7 = r7 + 1
            goto L_0x06a9
        L_0x06d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x06dc:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x06e8
        L_0x06e3:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x06e8:
            com.google.android.gms.internal.ads.zzlh r2 = r13.f15263b
            if (r2 != 0) goto L_0x06ed
            return r0
        L_0x06ed:
            com.google.android.gms.internal.ads.zzpa r0 = new com.google.android.gms.internal.ads.zzpa
            int r11 = com.google.android.gms.internal.ads.j20.m17308b(r47)
            r2 = r46
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            com.google.android.gms.internal.ads.zzlh r4 = r13.f15263b
            int r5 = r13.f15265d
            com.google.android.gms.internal.ads.zzpb[] r6 = r13.f15262a
            int r7 = r13.f15264c
            java.lang.Object r8 = r1.first
            r23 = r8
            long[] r23 = (long[]) r23
            java.lang.Object r1 = r1.second
            r24 = r1
            long[] r24 = (long[]) r24
            r10 = r0
            r12 = r45
            r13 = r2
            r15 = r28
            r17 = r18
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d20.m16771a(com.google.android.gms.internal.ads.b20, com.google.android.gms.internal.ads.c20, long, com.google.android.gms.internal.ads.zzne, boolean):com.google.android.gms.internal.ads.zzpa");
    }

    /* renamed from: a */
    public static p20 m16770a(zzpa zzpa, b20 b20, zznr zznr) throws zzlm {
        f20 f20;
        boolean z;
        int i;
        int i2;
        long j;
        int i3;
        int[] iArr;
        int i4;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        zzpa zzpa2;
        long j2;
        long[] jArr3;
        boolean z2;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i5;
        int i6;
        int i7;
        int i8;
        zzpa zzpa3 = zzpa;
        b20 b202 = b20;
        zznr zznr2 = zznr;
        c20 d = b202.mo25623d(a20.f14348b0);
        if (d != null) {
            f20 = new h20(d);
        } else {
            c20 d2 = b202.mo25623d(a20.f14350c0);
            if (d2 != null) {
                f20 = new i20(d2);
            } else {
                throw new zzlm("Track has no sample table size information");
            }
        }
        int b = f20.mo25907b();
        if (b == 0) {
            return new p20(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        c20 d3 = b202.mo25623d(a20.f14352d0);
        if (d3 == null) {
            d3 = b202.mo25623d(a20.f14354e0);
            z = true;
        } else {
            z = false;
        }
        zzst zzst = d3.f14694z0;
        zzst zzst2 = b202.mo25623d(a20.f14346a0).f14694z0;
        zzst zzst3 = b202.mo25623d(a20.f14343X).f14694z0;
        c20 d4 = b202.mo25623d(a20.f14344Y);
        zzst zzst4 = null;
        zzst zzst5 = d4 != null ? d4.f14694z0 : null;
        c20 d5 = b202.mo25623d(a20.f14345Z);
        zzst zzst6 = d5 != null ? d5.f14694z0 : null;
        e20 e20 = new e20(zzst2, zzst, z);
        zzst3.mo29727b(12);
        int l = zzst3.mo29740l() - 1;
        int l2 = zzst3.mo29740l();
        int l3 = zzst3.mo29740l();
        if (zzst6 != null) {
            zzst6.mo29727b(12);
            i = zzst6.mo29740l();
        } else {
            i = 0;
        }
        int i9 = -1;
        if (zzst5 != null) {
            zzst5.mo29727b(12);
            i2 = zzst5.mo29740l();
            if (i2 > 0) {
                i9 = zzst5.mo29740l() - 1;
                zzst4 = zzst5;
            }
        } else {
            zzst4 = zzst5;
            i2 = 0;
        }
        long j3 = 0;
        if (!(f20.mo25906a() && "audio/raw".equals(zzpa3.f22446f.f22189k) && l == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[b];
            iArr = new int[b];
            jArr = new long[b];
            int i10 = i2;
            iArr2 = new int[b];
            zzst zzst7 = zzst3;
            int i11 = i9;
            long j4 = 0;
            j = 0;
            int i12 = 0;
            i4 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = i;
            int i17 = l3;
            int i18 = l2;
            int i19 = l;
            int i20 = i10;
            while (i12 < b) {
                while (i14 == 0) {
                    zzsk.m25218b(e20.mo25854a());
                    j4 = e20.f15048d;
                    i14 = e20.f15047c;
                    i17 = i17;
                    i18 = i18;
                }
                int i21 = i18;
                int i22 = i17;
                if (zzst6 != null) {
                    while (i13 == 0 && i16 > 0) {
                        i13 = zzst6.mo29740l();
                        i15 = zzst6.mo29730d();
                        i16--;
                    }
                    i13--;
                }
                int i23 = i15;
                jArr5[i12] = j4;
                iArr[i12] = f20.mo25908c();
                if (iArr[i12] > i4) {
                    i4 = iArr[i12];
                }
                int i24 = b;
                f20 f202 = f20;
                jArr[i12] = j + ((long) i23);
                iArr2[i12] = zzst4 == null ? 1 : 0;
                if (i12 == i11) {
                    iArr2[i12] = 1;
                    i20--;
                    if (i20 > 0) {
                        i11 = zzst4.mo29740l() - 1;
                    }
                }
                int i25 = i22;
                long[] jArr6 = jArr5;
                j += (long) i25;
                int i26 = i21 - 1;
                if (i26 != 0 || i19 <= 0) {
                    int i27 = i26;
                    i7 = i25;
                    i8 = i27;
                } else {
                    i8 = zzst7.mo29740l();
                    i7 = zzst7.mo29740l();
                    i19--;
                }
                int i28 = i8;
                j4 += (long) iArr[i12];
                i14--;
                i12++;
                b = i24;
                jArr5 = jArr6;
                i11 = i11;
                i15 = i23;
                i18 = i28;
                f20 f203 = f202;
                i17 = i7;
                f20 = f203;
            }
            i3 = b;
            long[] jArr7 = jArr5;
            int i29 = i18;
            zzsk.m25216a(i13 == 0);
            while (i16 > 0) {
                zzsk.m25216a(zzst6.mo29740l() == 0);
                zzst6.mo29730d();
                i16--;
            }
            if (i20 == 0 && i29 == 0) {
                i6 = i14;
                if (i6 == 0 && i19 == 0) {
                    zzpa2 = zzpa;
                    jArr2 = jArr7;
                }
            } else {
                i6 = i14;
            }
            zzpa2 = zzpa;
            int i30 = zzpa2.f22441a;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i30);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i20);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i29);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i6);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i19);
            Log.w("AtomParsers", sb.toString());
            jArr2 = jArr7;
        } else {
            zzpa2 = zzpa3;
            i3 = b;
            f20 f204 = f20;
            int i31 = e20.f15045a;
            long[] jArr8 = new long[i31];
            int[] iArr6 = new int[i31];
            while (e20.mo25854a()) {
                int i32 = e20.f15046b;
                jArr8[i32] = e20.f15048d;
                iArr6[i32] = e20.f15047c;
            }
            int c = f204.mo25908c();
            long j5 = (long) l3;
            int i33 = 8192 / c;
            int i34 = 0;
            for (int i35 = 0; i35 < i31; i35++) {
                i34 += zzsy.m25281a(iArr6[i35], i33);
            }
            long[] jArr9 = new long[i34];
            int[] iArr7 = new int[i34];
            long[] jArr10 = new long[i34];
            int[] iArr8 = new int[i34];
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (i36 < i31) {
                int i40 = iArr6[i36];
                long j6 = jArr8[i36];
                int i41 = i40;
                int i42 = i31;
                int i43 = i41;
                while (i43 > 0) {
                    int min = Math.min(i33, i43);
                    jArr9[i38] = j6;
                    iArr7[i38] = c * min;
                    i39 = Math.max(i39, iArr7[i38]);
                    jArr10[i38] = ((long) i37) * j5;
                    iArr8[i38] = 1;
                    j6 += (long) iArr7[i38];
                    i37 += min;
                    i43 -= min;
                    i38++;
                    jArr8 = jArr8;
                    iArr6 = iArr6;
                }
                long[] jArr11 = jArr8;
                int[] iArr9 = iArr6;
                i36++;
                i31 = i42;
            }
            zzou zzou = new zzou(jArr9, iArr7, i39, jArr10, iArr8);
            jArr2 = zzou.f22415a;
            iArr = zzou.f22416b;
            i4 = zzou.f22417c;
            jArr = zzou.f22418d;
            iArr2 = zzou.f22419e;
            j = 0;
        }
        if (zzpa2.f22448h == null || zznr.mo29587a()) {
            zzsy.m25288a(jArr, 1000000, zzpa2.f22443c);
            return new p20(jArr2, iArr, i4, jArr, iArr2);
        }
        long[] jArr12 = zzpa2.f22448h;
        if (jArr12.length == 1 && zzpa2.f22442b == 1 && jArr.length >= 2) {
            long j7 = zzpa2.f22449i[0];
            long a = zzsy.m25284a(jArr12[0], zzpa2.f22443c, zzpa2.f22444d) + j7;
            if (jArr[0] <= j7 && j7 < jArr[1] && jArr[jArr.length - 1] < a && a <= j) {
                long j8 = j - a;
                long a2 = zzsy.m25284a(j7 - jArr[0], (long) zzpa2.f22446f.f22202x, zzpa2.f22443c);
                long a3 = zzsy.m25284a(j8, (long) zzpa2.f22446f.f22202x, zzpa2.f22443c);
                if (!(a2 == 0 && a3 == 0) && a2 <= 2147483647L && a3 <= 2147483647L) {
                    int i44 = (int) a2;
                    zznr zznr3 = zznr;
                    zznr3.f22355a = i44;
                    zznr3.f22356b = (int) a3;
                    zzsy.m25288a(jArr, 1000000, zzpa2.f22443c);
                    return new p20(jArr2, iArr, i4, jArr, iArr2);
                }
            }
        }
        long[] jArr13 = zzpa2.f22448h;
        if (jArr13.length == 1) {
            char c2 = 0;
            if (jArr13[0] == 0) {
                int i45 = 0;
                while (i45 < jArr.length) {
                    jArr[i45] = zzsy.m25284a(jArr[i45] - zzpa2.f22449i[c2], 1000000, zzpa2.f22443c);
                    i45++;
                    c2 = 0;
                }
                return new p20(jArr2, iArr, i4, jArr, iArr2);
            }
        }
        boolean z3 = zzpa2.f22442b == 1;
        boolean z4 = false;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        while (true) {
            long[] jArr14 = zzpa2.f22448h;
            j2 = -1;
            if (i48 >= jArr14.length) {
                break;
            }
            int i49 = i4;
            int[] iArr10 = iArr;
            long j9 = zzpa2.f22449i[i48];
            if (j9 != -1) {
                i5 = i49;
                long a4 = zzsy.m25284a(jArr14[i48], zzpa2.f22443c, zzpa2.f22444d);
                int b2 = zzsy.m25293b(jArr, j9, true, true);
                int b3 = zzsy.m25293b(jArr, j9 + a4, z3, false);
                i46 += b3 - b2;
                z4 |= i47 != b2;
                i47 = b3;
            } else {
                i5 = i49;
            }
            i48++;
            iArr = iArr10;
            i4 = i5;
        }
        int i50 = i4;
        int[] iArr11 = iArr;
        boolean z5 = z4 | (i46 != i3);
        long[] jArr15 = z5 ? new long[i46] : jArr2;
        int[] iArr12 = z5 ? new int[i46] : iArr11;
        int i51 = z5 ? 0 : i50;
        int[] iArr13 = z5 ? new int[i46] : iArr2;
        long[] jArr16 = new long[i46];
        int i52 = i51;
        int i53 = 0;
        int i54 = 0;
        while (true) {
            long[] jArr17 = zzpa2.f22448h;
            if (i53 >= jArr17.length) {
                break;
            }
            int[] iArr14 = iArr12;
            int[] iArr15 = iArr13;
            long j10 = zzpa2.f22449i[i53];
            long j11 = jArr17[i53];
            if (j10 != j2) {
                long j12 = zzpa2.f22443c;
                jArr4 = jArr15;
                long[] jArr18 = jArr2;
                int b4 = zzsy.m25293b(jArr, j10, true, true);
                int b5 = zzsy.m25293b(jArr, zzsy.m25284a(j11, j12, zzpa2.f22444d) + j10, z3, false);
                if (z5) {
                    int i55 = b5 - b4;
                    System.arraycopy(jArr18, b4, jArr4, i54, i55);
                    iArr4 = iArr11;
                    int[] iArr16 = iArr14;
                    z2 = z3;
                    iArr3 = iArr16;
                    System.arraycopy(iArr4, b4, iArr3, i54, i55);
                    jArr3 = jArr18;
                    iArr5 = iArr15;
                    System.arraycopy(iArr2, b4, iArr5, i54, i55);
                } else {
                    iArr4 = iArr11;
                    jArr3 = jArr18;
                    iArr5 = iArr15;
                    int[] iArr17 = iArr14;
                    z2 = z3;
                    iArr3 = iArr17;
                }
                int i56 = i52;
                while (b4 < b5) {
                    int[] iArr18 = iArr5;
                    int[] iArr19 = iArr4;
                    long j13 = j10;
                    jArr16[i54] = zzsy.m25284a(j3, 1000000, zzpa2.f22444d) + zzsy.m25284a(jArr[b4] - j10, 1000000, zzpa2.f22443c);
                    if (z5 && iArr3[i54] > i56) {
                        i56 = iArr19[b4];
                    }
                    i54++;
                    b4++;
                    iArr4 = iArr19;
                    j10 = j13;
                    iArr5 = iArr18;
                }
                iArr15 = iArr5;
                iArr11 = iArr4;
                i52 = i56;
            } else {
                jArr4 = jArr15;
                jArr3 = jArr2;
                int[] iArr20 = iArr14;
                z2 = z3;
                iArr3 = iArr20;
            }
            j3 += j11;
            i53++;
            iArr12 = iArr3;
            jArr15 = jArr4;
            z3 = z2;
            iArr13 = iArr15;
            jArr2 = jArr3;
            j2 = -1;
        }
        long[] jArr19 = jArr15;
        int[] iArr21 = iArr12;
        int[] iArr22 = iArr13;
        boolean z6 = false;
        for (int i57 = 0; i57 < iArr22.length && !z6; i57++) {
            z6 |= (iArr22[i57] & 1) != 0;
        }
        if (z6) {
            return new p20(jArr19, iArr21, i52, jArr16, iArr22);
        }
        throw new zzlm("The edited sample sequence does not contain a sync sample.");
    }

    /* renamed from: a */
    public static zzpo m16772a(c20 c20, boolean z) {
        if (z) {
            return null;
        }
        zzst zzst = c20.f14694z0;
        zzst.mo29727b(8);
        while (zzst.mo29742n() >= 8) {
            int b = zzst.mo29726b();
            int d = zzst.mo29730d();
            if (zzst.mo29730d() == a20.f14370m0) {
                zzst.mo29727b(b);
                int i = b + d;
                zzst.mo29729c(12);
                while (true) {
                    if (zzst.mo29726b() >= i) {
                        break;
                    }
                    int b2 = zzst.mo29726b();
                    int d2 = zzst.mo29730d();
                    if (zzst.mo29730d() == a20.f14372n0) {
                        zzst.mo29727b(b2);
                        int i2 = b2 + d2;
                        zzst.mo29729c(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzst.mo29726b() < i2) {
                            zzpo.zza a = l20.m17472a(zzst);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzpo((List<? extends zzpo.zza>) arrayList);
                        }
                    } else {
                        zzst.mo29729c(d2 - 8);
                    }
                }
                return null;
            }
            zzst.mo29729c(d - 8);
        }
        return null;
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m16769a(zzst zzst, int i) {
        zzst.mo29727b(i + 8 + 4);
        zzst.mo29729c(1);
        m16767a(zzst);
        zzst.mo29729c(2);
        int g = zzst.mo29735g();
        if ((g & 128) != 0) {
            zzst.mo29729c(2);
        }
        if ((g & 64) != 0) {
            zzst.mo29729c(zzst.mo29736h());
        }
        if ((g & 32) != 0) {
            zzst.mo29729c(2);
        }
        zzst.mo29729c(1);
        m16767a(zzst);
        int g2 = zzst.mo29735g();
        String str = null;
        if (g2 == 32) {
            str = "video/mp4v-es";
        } else if (g2 == 33) {
            str = "video/avc";
        } else if (g2 != 35) {
            if (g2 != 64) {
                if (g2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (g2 == 165) {
                    str = "audio/ac3";
                } else if (g2 != 166) {
                    switch (g2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzst.mo29729c(12);
        zzst.mo29729c(1);
        int a = m16767a(zzst);
        byte[] bArr = new byte[a];
        zzst.mo29725a(bArr, 0, a);
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    private static int m16768a(zzst zzst, int i, int i2, g20 g20, int i3) {
        zzst zzst2 = zzst;
        int b = zzst.mo29726b();
        while (true) {
            boolean z = false;
            if (b - i >= i2) {
                return 0;
            }
            zzst.mo29727b(b);
            int d = zzst.mo29730d();
            zzsk.m25217a(d > 0, "childAtomSize should be positive");
            if (zzst.mo29730d() == a20.f14333N) {
                int i4 = b + 8;
                Pair pair = null;
                Integer num = null;
                zzpb zzpb = null;
                boolean z2 = false;
                while (i4 - b < d) {
                    zzst.mo29727b(i4);
                    int d2 = zzst.mo29730d();
                    int d3 = zzst.mo29730d();
                    if (d3 == a20.f14339T) {
                        num = Integer.valueOf(zzst.mo29730d());
                    } else if (d3 == a20.f14334O) {
                        zzst.mo29729c(4);
                        z2 = zzst.mo29730d() == f14806g;
                    } else if (d3 == a20.f14335P) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= d2) {
                                zzpb = null;
                                break;
                            }
                            zzst.mo29727b(i5);
                            int d4 = zzst.mo29730d();
                            if (zzst.mo29730d() == a20.f14336Q) {
                                zzst.mo29729c(6);
                                boolean z3 = zzst.mo29735g() == 1;
                                int g = zzst.mo29735g();
                                byte[] bArr = new byte[16];
                                zzst.mo29725a(bArr, 0, 16);
                                zzpb = new zzpb(z3, g, bArr);
                            } else {
                                i5 += d4;
                            }
                        }
                    }
                    i4 += d2;
                }
                if (z2) {
                    zzsk.m25217a(num != null, "frma atom is mandatory");
                    if (zzpb != null) {
                        z = true;
                    }
                    zzsk.m25217a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzpb);
                }
                if (pair != null) {
                    g20.f15262a[i3] = (zzpb) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            g20 g202 = g20;
            b += d;
        }
    }

    /* renamed from: a */
    private static int m16767a(zzst zzst) {
        int g = zzst.mo29735g();
        int i = g & 127;
        while ((g & 128) == 128) {
            g = zzst.mo29735g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }
}
