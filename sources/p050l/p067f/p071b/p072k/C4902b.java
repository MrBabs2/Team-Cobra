package p050l.p067f.p071b.p072k;

import java.util.ArrayList;
import p050l.p067f.p071b.C4889d;

/* renamed from: l.f.b.k.b */
/* compiled from: Chain */
public class C4902b {
    /* renamed from: a */
    public static void m8398a(C4910f fVar, C4889d dVar, ArrayList<C4907e> arrayList, int i) {
        C4903c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = fVar.f8650y0;
            cVarArr = fVar.f8633B0;
            i2 = 0;
        } else {
            int i4 = fVar.f8651z0;
            cVarArr = fVar.f8632A0;
            i3 = i4;
            i2 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C4903c cVar = cVarArr[i5];
            cVar.mo17157a();
            if (arrayList == null || (arrayList != null && arrayList.contains(cVar.f8518a))) {
                m8397a(fVar, dVar, i, i2, cVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: l.f.b.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: l.f.b.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: l.f.b.k.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: l.f.b.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: l.f.b.k.e} */
    /* JADX WARNING: type inference failed for: r4v11, types: [l.f.b.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.f8600h0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f8602i0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x03a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:327:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m8397a(p050l.p067f.p071b.p072k.C4910f r36, p050l.p067f.p071b.C4889d r37, int r38, int r39, p050l.p067f.p071b.p072k.C4903c r40) {
        /*
            r0 = r36
            r9 = r37
            r1 = r40
            l.f.b.k.e r10 = r1.f8518a
            l.f.b.k.e r11 = r1.f8520c
            l.f.b.k.e r12 = r1.f8519b
            l.f.b.k.e r13 = r1.f8521d
            l.f.b.k.e r2 = r1.f8522e
            float r3 = r1.f8528k
            l.f.b.k.e r4 = r1.f8523f
            l.f.b.k.e r4 = r1.f8524g
            l.f.b.k.e$b[] r4 = r0.f8575Q
            r4 = r4[r38]
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.f8600h0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f8600h0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f8600h0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f8602i0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f8602i0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f8602i0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r7 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x0051:
            r21 = 0
            if (r8 != 0) goto L_0x0131
            l.f.b.k.d[] r6 = r7.f8572N
            r6 = r6[r39]
            if (r5 == 0) goto L_0x005e
            r19 = 1
            goto L_0x0060
        L_0x005e:
            r19 = 4
        L_0x0060:
            int r22 = r6.mo17165c()
            r23 = r3
            l.f.b.k.e$b[] r3 = r7.f8575Q
            r3 = r3[r38]
            r24 = r8
            l.f.b.k.e$b r8 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x0078
            int[] r3 = r7.f8614p
            r3 = r3[r38]
            if (r3 != 0) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            l.f.b.k.d r8 = r6.f8543f
            if (r8 == 0) goto L_0x0085
            if (r7 == r10) goto L_0x0085
            int r8 = r8.mo17165c()
            int r22 = r22 + r8
        L_0x0085:
            r8 = r22
            if (r5 == 0) goto L_0x0092
            if (r7 == r10) goto L_0x0092
            if (r7 == r12) goto L_0x0092
            r22 = r15
            r19 = 8
            goto L_0x0094
        L_0x0092:
            r22 = r15
        L_0x0094:
            l.f.b.k.d r15 = r6.f8543f
            if (r15 == 0) goto L_0x00c6
            if (r7 != r12) goto L_0x00a7
            r25 = r14
            l.f.b.i r14 = r6.f8546i
            l.f.b.i r15 = r15.f8546i
            r26 = r2
            r2 = 6
            r9.mo17115b((p050l.p067f.p071b.C4898i) r14, (p050l.p067f.p071b.C4898i) r15, (int) r8, (int) r2)
            goto L_0x00b4
        L_0x00a7:
            r26 = r2
            r25 = r14
            l.f.b.i r2 = r6.f8546i
            l.f.b.i r14 = r15.f8546i
            r15 = 8
            r9.mo17115b((p050l.p067f.p071b.C4898i) r2, (p050l.p067f.p071b.C4898i) r14, (int) r8, (int) r15)
        L_0x00b4:
            if (r3 == 0) goto L_0x00ba
            if (r5 != 0) goto L_0x00ba
            r2 = 5
            goto L_0x00bc
        L_0x00ba:
            r2 = r19
        L_0x00bc:
            l.f.b.i r3 = r6.f8546i
            l.f.b.k.d r6 = r6.f8543f
            l.f.b.i r6 = r6.f8546i
            r9.mo17101a((p050l.p067f.p071b.C4898i) r3, (p050l.p067f.p071b.C4898i) r6, (int) r8, (int) r2)
            goto L_0x00ca
        L_0x00c6:
            r26 = r2
            r25 = r14
        L_0x00ca:
            if (r4 == 0) goto L_0x0100
            int r2 = r7.mo17179B()
            r3 = 8
            if (r2 == r3) goto L_0x00ee
            l.f.b.k.e$b[] r2 = r7.f8575Q
            r2 = r2[r38]
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00ee
            l.f.b.k.d[] r2 = r7.f8572N
            int r3 = r39 + 1
            r3 = r2[r3]
            l.f.b.i r3 = r3.f8546i
            r2 = r2[r39]
            l.f.b.i r2 = r2.f8546i
            r6 = 5
            r8 = 0
            r9.mo17115b((p050l.p067f.p071b.C4898i) r3, (p050l.p067f.p071b.C4898i) r2, (int) r8, (int) r6)
            goto L_0x00ef
        L_0x00ee:
            r8 = 0
        L_0x00ef:
            l.f.b.k.d[] r2 = r7.f8572N
            r2 = r2[r39]
            l.f.b.i r2 = r2.f8546i
            l.f.b.k.d[] r3 = r0.f8572N
            r3 = r3[r39]
            l.f.b.i r3 = r3.f8546i
            r6 = 8
            r9.mo17115b((p050l.p067f.p071b.C4898i) r2, (p050l.p067f.p071b.C4898i) r3, (int) r8, (int) r6)
        L_0x0100:
            l.f.b.k.d[] r2 = r7.f8572N
            int r3 = r39 + 1
            r2 = r2[r3]
            l.f.b.k.d r2 = r2.f8543f
            if (r2 == 0) goto L_0x011f
            l.f.b.k.e r2 = r2.f8541d
            l.f.b.k.d[] r3 = r2.f8572N
            r6 = r3[r39]
            l.f.b.k.d r6 = r6.f8543f
            if (r6 == 0) goto L_0x011f
            r3 = r3[r39]
            l.f.b.k.d r3 = r3.f8543f
            l.f.b.k.e r3 = r3.f8541d
            if (r3 == r7) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r21 = r2
        L_0x011f:
            if (r21 == 0) goto L_0x0126
            r7 = r21
            r8 = r24
            goto L_0x0127
        L_0x0126:
            r8 = 1
        L_0x0127:
            r15 = r22
            r3 = r23
            r14 = r25
            r2 = r26
            goto L_0x0051
        L_0x0131:
            r26 = r2
            r23 = r3
            r25 = r14
            r22 = r15
            if (r13 == 0) goto L_0x019c
            l.f.b.k.d[] r2 = r11.f8572N
            int r3 = r39 + 1
            r2 = r2[r3]
            l.f.b.k.d r2 = r2.f8543f
            if (r2 == 0) goto L_0x019c
            l.f.b.k.d[] r2 = r13.f8572N
            r2 = r2[r3]
            l.f.b.k.e$b[] r6 = r13.f8575Q
            r6 = r6[r38]
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0159
            int[] r6 = r13.f8614p
            r6 = r6[r38]
            if (r6 != 0) goto L_0x0159
            r6 = 1
            goto L_0x015a
        L_0x0159:
            r6 = 0
        L_0x015a:
            if (r6 == 0) goto L_0x0172
            if (r5 != 0) goto L_0x0172
            l.f.b.k.d r6 = r2.f8543f
            l.f.b.k.e r7 = r6.f8541d
            if (r7 != r0) goto L_0x0172
            l.f.b.i r7 = r2.f8546i
            l.f.b.i r6 = r6.f8546i
            int r8 = r2.mo17165c()
            int r8 = -r8
            r14 = 5
            r9.mo17101a((p050l.p067f.p071b.C4898i) r7, (p050l.p067f.p071b.C4898i) r6, (int) r8, (int) r14)
            goto L_0x0188
        L_0x0172:
            r14 = 5
            if (r5 == 0) goto L_0x0188
            l.f.b.k.d r6 = r2.f8543f
            l.f.b.k.e r7 = r6.f8541d
            if (r7 != r0) goto L_0x0188
            l.f.b.i r7 = r2.f8546i
            l.f.b.i r6 = r6.f8546i
            int r8 = r2.mo17165c()
            int r8 = -r8
            r15 = 4
            r9.mo17101a((p050l.p067f.p071b.C4898i) r7, (p050l.p067f.p071b.C4898i) r6, (int) r8, (int) r15)
        L_0x0188:
            l.f.b.i r6 = r2.f8546i
            l.f.b.k.d[] r7 = r11.f8572N
            r3 = r7[r3]
            l.f.b.k.d r3 = r3.f8543f
            l.f.b.i r3 = r3.f8546i
            int r2 = r2.mo17165c()
            int r2 = -r2
            r7 = 6
            r9.mo17118c(r6, r3, r2, r7)
            goto L_0x019d
        L_0x019c:
            r14 = 5
        L_0x019d:
            if (r4 == 0) goto L_0x01b8
            l.f.b.k.d[] r0 = r0.f8572N
            int r2 = r39 + 1
            r0 = r0[r2]
            l.f.b.i r0 = r0.f8546i
            l.f.b.k.d[] r3 = r11.f8572N
            r4 = r3[r2]
            l.f.b.i r4 = r4.f8546i
            r2 = r3[r2]
            int r2 = r2.mo17165c()
            r3 = 8
            r9.mo17115b((p050l.p067f.p071b.C4898i) r0, (p050l.p067f.p071b.C4898i) r4, (int) r2, (int) r3)
        L_0x01b8:
            java.util.ArrayList<l.f.b.k.e> r0 = r1.f8525h
            if (r0 == 0) goto L_0x0267
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0267
            boolean r4 = r1.f8534q
            if (r4 == 0) goto L_0x01cf
            boolean r4 = r1.f8536s
            if (r4 != 0) goto L_0x01cf
            int r4 = r1.f8527j
            float r4 = (float) r4
            goto L_0x01d1
        L_0x01cf:
            r4 = r23
        L_0x01d1:
            r6 = 0
            r7 = r21
            r8 = 0
            r28 = 0
        L_0x01d7:
            if (r8 >= r2) goto L_0x0267
            java.lang.Object r15 = r0.get(r8)
            l.f.b.k.e r15 = (p050l.p067f.p071b.p072k.C4907e) r15
            float[] r3 = r15.f8604j0
            r3 = r3[r38]
            int r18 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r18 >= 0) goto L_0x0203
            boolean r3 = r1.f8536s
            if (r3 == 0) goto L_0x01fe
            l.f.b.k.d[] r3 = r15.f8572N
            int r15 = r39 + 1
            r15 = r3[r15]
            l.f.b.i r15 = r15.f8546i
            r3 = r3[r39]
            l.f.b.i r3 = r3.f8546i
            r6 = 0
            r14 = 4
            r9.mo17101a((p050l.p067f.p071b.C4898i) r15, (p050l.p067f.p071b.C4898i) r3, (int) r6, (int) r14)
            r14 = 0
            goto L_0x021a
        L_0x01fe:
            r14 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            goto L_0x0204
        L_0x0203:
            r14 = 4
        L_0x0204:
            int r18 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r18 != 0) goto L_0x021f
            l.f.b.k.d[] r3 = r15.f8572N
            int r15 = r39 + 1
            r15 = r3[r15]
            l.f.b.i r15 = r15.f8546i
            r3 = r3[r39]
            l.f.b.i r3 = r3.f8546i
            r6 = 8
            r14 = 0
            r9.mo17101a((p050l.p067f.p071b.C4898i) r15, (p050l.p067f.p071b.C4898i) r3, (int) r14, (int) r6)
        L_0x021a:
            r23 = r0
            r17 = r2
            goto L_0x025c
        L_0x021f:
            r14 = 0
            if (r7 == 0) goto L_0x0255
            l.f.b.k.d[] r6 = r7.f8572N
            r7 = r6[r39]
            l.f.b.i r7 = r7.f8546i
            int r17 = r39 + 1
            r6 = r6[r17]
            l.f.b.i r6 = r6.f8546i
            l.f.b.k.d[] r14 = r15.f8572N
            r23 = r0
            r0 = r14[r39]
            l.f.b.i r0 = r0.f8546i
            r14 = r14[r17]
            l.f.b.i r14 = r14.f8546i
            r17 = r2
            l.f.b.b r2 = r37.mo17114b()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r7
            r32 = r6
            r33 = r0
            r34 = r14
            r27.mo17069a((float) r28, (float) r29, (float) r30, (p050l.p067f.p071b.C4898i) r31, (p050l.p067f.p071b.C4898i) r32, (p050l.p067f.p071b.C4898i) r33, (p050l.p067f.p071b.C4898i) r34)
            r9.mo17105a((p050l.p067f.p071b.C4886b) r2)
            goto L_0x0259
        L_0x0255:
            r23 = r0
            r17 = r2
        L_0x0259:
            r28 = r3
            r7 = r15
        L_0x025c:
            int r8 = r8 + 1
            r2 = r17
            r0 = r23
            r3 = 1
            r6 = 0
            r14 = 5
            goto L_0x01d7
        L_0x0267:
            if (r12 == 0) goto L_0x02bc
            if (r12 == r13) goto L_0x026d
            if (r5 == 0) goto L_0x02bc
        L_0x026d:
            l.f.b.k.d[] r0 = r10.f8572N
            r0 = r0[r39]
            l.f.b.k.d[] r1 = r11.f8572N
            int r2 = r39 + 1
            r1 = r1[r2]
            l.f.b.k.d r0 = r0.f8543f
            if (r0 == 0) goto L_0x027f
            l.f.b.i r0 = r0.f8546i
            r3 = r0
            goto L_0x0281
        L_0x027f:
            r3 = r21
        L_0x0281:
            l.f.b.k.d r0 = r1.f8543f
            if (r0 == 0) goto L_0x0289
            l.f.b.i r0 = r0.f8546i
            r5 = r0
            goto L_0x028b
        L_0x0289:
            r5 = r21
        L_0x028b:
            l.f.b.k.d[] r0 = r12.f8572N
            r0 = r0[r39]
            l.f.b.k.d[] r1 = r13.f8572N
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04db
            if (r5 == 0) goto L_0x04db
            if (r38 != 0) goto L_0x029e
            r2 = r26
            float r2 = r2.f8588b0
            goto L_0x02a2
        L_0x029e:
            r2 = r26
            float r2 = r2.f8590c0
        L_0x02a2:
            r4 = r2
            int r6 = r0.mo17165c()
            int r7 = r1.mo17165c()
            l.f.b.i r2 = r0.f8546i
            l.f.b.i r8 = r1.f8546i
            r10 = 7
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo17109a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04db
        L_0x02bc:
            if (r25 == 0) goto L_0x03ac
            if (r12 == 0) goto L_0x03ac
            int r0 = r1.f8527j
            if (r0 <= 0) goto L_0x02cb
            int r1 = r1.f8526i
            if (r1 != r0) goto L_0x02cb
            r16 = 1
            goto L_0x02cd
        L_0x02cb:
            r16 = 0
        L_0x02cd:
            r14 = r12
            r15 = r14
        L_0x02cf:
            if (r14 == 0) goto L_0x04db
            l.f.b.k.e[] r0 = r14.f8608l0
            r0 = r0[r38]
            r8 = r0
        L_0x02d6:
            if (r8 == 0) goto L_0x02e5
            int r0 = r8.mo17179B()
            r6 = 8
            if (r0 != r6) goto L_0x02e7
            l.f.b.k.e[] r0 = r8.f8608l0
            r8 = r0[r38]
            goto L_0x02d6
        L_0x02e5:
            r6 = 8
        L_0x02e7:
            if (r8 != 0) goto L_0x02f0
            if (r14 != r13) goto L_0x02ec
            goto L_0x02f0
        L_0x02ec:
            r17 = r8
            goto L_0x039f
        L_0x02f0:
            l.f.b.k.d[] r0 = r14.f8572N
            r0 = r0[r39]
            l.f.b.i r1 = r0.f8546i
            l.f.b.k.d r2 = r0.f8543f
            if (r2 == 0) goto L_0x02fd
            l.f.b.i r2 = r2.f8546i
            goto L_0x02ff
        L_0x02fd:
            r2 = r21
        L_0x02ff:
            if (r15 == r14) goto L_0x030a
            l.f.b.k.d[] r2 = r15.f8572N
            int r3 = r39 + 1
            r2 = r2[r3]
            l.f.b.i r2 = r2.f8546i
            goto L_0x031f
        L_0x030a:
            if (r14 != r12) goto L_0x031f
            if (r15 != r14) goto L_0x031f
            l.f.b.k.d[] r2 = r10.f8572N
            r3 = r2[r39]
            l.f.b.k.d r3 = r3.f8543f
            if (r3 == 0) goto L_0x031d
            r2 = r2[r39]
            l.f.b.k.d r2 = r2.f8543f
            l.f.b.i r2 = r2.f8546i
            goto L_0x031f
        L_0x031d:
            r2 = r21
        L_0x031f:
            int r0 = r0.mo17165c()
            l.f.b.k.d[] r3 = r14.f8572N
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.mo17165c()
            if (r8 == 0) goto L_0x0341
            l.f.b.k.d[] r5 = r8.f8572N
            r5 = r5[r39]
            l.f.b.i r7 = r5.f8546i
            l.f.b.k.d[] r6 = r14.f8572N
            r6 = r6[r4]
            l.f.b.i r6 = r6.f8546i
            r35 = r7
            r7 = r6
            r6 = r35
            goto L_0x0354
        L_0x0341:
            l.f.b.k.d[] r5 = r11.f8572N
            r5 = r5[r4]
            l.f.b.k.d r5 = r5.f8543f
            if (r5 == 0) goto L_0x034c
            l.f.b.i r6 = r5.f8546i
            goto L_0x034e
        L_0x034c:
            r6 = r21
        L_0x034e:
            l.f.b.k.d[] r7 = r14.f8572N
            r7 = r7[r4]
            l.f.b.i r7 = r7.f8546i
        L_0x0354:
            if (r5 == 0) goto L_0x035b
            int r5 = r5.mo17165c()
            int r3 = r3 + r5
        L_0x035b:
            if (r15 == 0) goto L_0x0366
            l.f.b.k.d[] r5 = r15.f8572N
            r5 = r5[r4]
            int r5 = r5.mo17165c()
            int r0 = r0 + r5
        L_0x0366:
            if (r1 == 0) goto L_0x02ec
            if (r2 == 0) goto L_0x02ec
            if (r6 == 0) goto L_0x02ec
            if (r7 == 0) goto L_0x02ec
            if (r14 != r12) goto L_0x0378
            l.f.b.k.d[] r0 = r12.f8572N
            r0 = r0[r39]
            int r0 = r0.mo17165c()
        L_0x0378:
            r5 = r0
            if (r14 != r13) goto L_0x0386
            l.f.b.k.d[] r0 = r13.f8572N
            r0 = r0[r4]
            int r0 = r0.mo17165c()
            r17 = r0
            goto L_0x0388
        L_0x0386:
            r17 = r3
        L_0x0388:
            if (r16 == 0) goto L_0x038d
            r18 = 8
            goto L_0x038f
        L_0x038d:
            r18 = 5
        L_0x038f:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r18
            r0.mo17109a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x039f:
            int r0 = r14.mo17179B()
            r8 = 8
            if (r0 == r8) goto L_0x03a8
            r15 = r14
        L_0x03a8:
            r14 = r17
            goto L_0x02cf
        L_0x03ac:
            r8 = 8
            if (r22 == 0) goto L_0x04db
            if (r12 == 0) goto L_0x04db
            int r0 = r1.f8527j
            if (r0 <= 0) goto L_0x03bd
            int r1 = r1.f8526i
            if (r1 != r0) goto L_0x03bd
            r16 = 1
            goto L_0x03bf
        L_0x03bd:
            r16 = 0
        L_0x03bf:
            r14 = r12
            r15 = r14
        L_0x03c1:
            if (r14 == 0) goto L_0x047d
            l.f.b.k.e[] r0 = r14.f8608l0
            r0 = r0[r38]
        L_0x03c7:
            if (r0 == 0) goto L_0x03d4
            int r1 = r0.mo17179B()
            if (r1 != r8) goto L_0x03d4
            l.f.b.k.e[] r0 = r0.f8608l0
            r0 = r0[r38]
            goto L_0x03c7
        L_0x03d4:
            if (r14 == r12) goto L_0x0468
            if (r14 == r13) goto L_0x0468
            if (r0 == 0) goto L_0x0468
            if (r0 != r13) goto L_0x03df
            r7 = r21
            goto L_0x03e0
        L_0x03df:
            r7 = r0
        L_0x03e0:
            l.f.b.k.d[] r0 = r14.f8572N
            r0 = r0[r39]
            l.f.b.i r1 = r0.f8546i
            l.f.b.k.d r2 = r0.f8543f
            if (r2 == 0) goto L_0x03ec
            l.f.b.i r2 = r2.f8546i
        L_0x03ec:
            l.f.b.k.d[] r2 = r15.f8572N
            int r3 = r39 + 1
            r2 = r2[r3]
            l.f.b.i r2 = r2.f8546i
            int r0 = r0.mo17165c()
            l.f.b.k.d[] r4 = r14.f8572N
            r4 = r4[r3]
            int r4 = r4.mo17165c()
            if (r7 == 0) goto L_0x0412
            l.f.b.k.d[] r5 = r7.f8572N
            r5 = r5[r39]
            l.f.b.i r6 = r5.f8546i
            l.f.b.k.d r8 = r5.f8543f
            if (r8 == 0) goto L_0x040f
            l.f.b.i r8 = r8.f8546i
            goto L_0x0423
        L_0x040f:
            r8 = r21
            goto L_0x0423
        L_0x0412:
            l.f.b.k.d[] r5 = r13.f8572N
            r5 = r5[r39]
            if (r5 == 0) goto L_0x041b
            l.f.b.i r6 = r5.f8546i
            goto L_0x041d
        L_0x041b:
            r6 = r21
        L_0x041d:
            l.f.b.k.d[] r8 = r14.f8572N
            r8 = r8[r3]
            l.f.b.i r8 = r8.f8546i
        L_0x0423:
            if (r5 == 0) goto L_0x042a
            int r5 = r5.mo17165c()
            int r4 = r4 + r5
        L_0x042a:
            r17 = r4
            if (r15 == 0) goto L_0x0437
            l.f.b.k.d[] r4 = r15.f8572N
            r3 = r4[r3]
            int r3 = r3.mo17165c()
            int r0 = r0 + r3
        L_0x0437:
            r3 = r0
            if (r16 == 0) goto L_0x043d
            r18 = 8
            goto L_0x043f
        L_0x043d:
            r18 = 4
        L_0x043f:
            if (r1 == 0) goto L_0x045d
            if (r2 == 0) goto L_0x045d
            if (r6 == 0) goto L_0x045d
            if (r8 == 0) goto L_0x045d
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r19 = 4
            r6 = r8
            r20 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r18
            r0.mo17109a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0465
        L_0x045d:
            r20 = r7
            r17 = r15
            r15 = 8
            r19 = 4
        L_0x0465:
            r0 = r20
            goto L_0x046e
        L_0x0468:
            r17 = r15
            r15 = 8
            r19 = 4
        L_0x046e:
            int r1 = r14.mo17179B()
            if (r1 == r15) goto L_0x0475
            goto L_0x0477
        L_0x0475:
            r14 = r17
        L_0x0477:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x03c1
        L_0x047d:
            l.f.b.k.d[] r0 = r12.f8572N
            r0 = r0[r39]
            l.f.b.k.d[] r1 = r10.f8572N
            r1 = r1[r39]
            l.f.b.k.d r1 = r1.f8543f
            l.f.b.k.d[] r2 = r13.f8572N
            int r3 = r39 + 1
            r10 = r2[r3]
            l.f.b.k.d[] r2 = r11.f8572N
            r2 = r2[r3]
            l.f.b.k.d r14 = r2.f8543f
            if (r1 == 0) goto L_0x04ca
            if (r12 == r13) goto L_0x04a4
            l.f.b.i r2 = r0.f8546i
            l.f.b.i r1 = r1.f8546i
            int r0 = r0.mo17165c()
            r15 = 5
            r9.mo17101a((p050l.p067f.p071b.C4898i) r2, (p050l.p067f.p071b.C4898i) r1, (int) r0, (int) r15)
            goto L_0x04cb
        L_0x04a4:
            r15 = 5
            if (r14 == 0) goto L_0x04cb
            l.f.b.i r2 = r0.f8546i
            l.f.b.i r3 = r1.f8546i
            int r4 = r0.mo17165c()
            r5 = 1056964608(0x3f000000, float:0.5)
            l.f.b.i r6 = r10.f8546i
            l.f.b.i r7 = r14.f8546i
            int r8 = r10.mo17165c()
            r16 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.mo17109a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04cb
        L_0x04ca:
            r15 = 5
        L_0x04cb:
            if (r14 == 0) goto L_0x04db
            if (r12 == r13) goto L_0x04db
            l.f.b.i r0 = r10.f8546i
            l.f.b.i r1 = r14.f8546i
            int r2 = r10.mo17165c()
            int r2 = -r2
            r9.mo17101a((p050l.p067f.p071b.C4898i) r0, (p050l.p067f.p071b.C4898i) r1, (int) r2, (int) r15)
        L_0x04db:
            if (r25 != 0) goto L_0x04df
            if (r22 == 0) goto L_0x0543
        L_0x04df:
            if (r12 == 0) goto L_0x0543
            if (r12 == r13) goto L_0x0543
            l.f.b.k.d[] r0 = r12.f8572N
            r0 = r0[r39]
            l.f.b.k.d[] r1 = r13.f8572N
            int r2 = r39 + 1
            r1 = r1[r2]
            l.f.b.k.d r3 = r0.f8543f
            if (r3 == 0) goto L_0x04f4
            l.f.b.i r3 = r3.f8546i
            goto L_0x04f6
        L_0x04f4:
            r3 = r21
        L_0x04f6:
            l.f.b.k.d r4 = r1.f8543f
            if (r4 == 0) goto L_0x04fd
            l.f.b.i r4 = r4.f8546i
            goto L_0x04ff
        L_0x04fd:
            r4 = r21
        L_0x04ff:
            if (r11 == r13) goto L_0x0510
            l.f.b.k.d[] r4 = r11.f8572N
            r4 = r4[r2]
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x050d
            l.f.b.i r4 = r4.f8546i
            r21 = r4
        L_0x050d:
            r5 = r21
            goto L_0x0511
        L_0x0510:
            r5 = r4
        L_0x0511:
            if (r12 != r13) goto L_0x051e
            l.f.b.k.d[] r0 = r12.f8572N
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x051e:
            if (r3 == 0) goto L_0x0543
            if (r5 == 0) goto L_0x0543
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo17165c()
            if (r13 != 0) goto L_0x052b
            goto L_0x052c
        L_0x052b:
            r11 = r13
        L_0x052c:
            l.f.b.k.d[] r7 = r11.f8572N
            r2 = r7[r2]
            int r7 = r2.mo17165c()
            l.f.b.i r2 = r0.f8546i
            l.f.b.i r8 = r1.f8546i
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo17109a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0543:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.C4902b.m8397a(l.f.b.k.f, l.f.b.d, int, int, l.f.b.k.c):void");
    }
}
