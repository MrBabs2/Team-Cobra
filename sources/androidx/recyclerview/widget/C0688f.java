package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: DiffUtil */
public class C0688f {

    /* renamed from: a */
    private static final Comparator<C0695g> f2621a = new C0689a();

    /* renamed from: androidx.recyclerview.widget.f$a */
    /* compiled from: DiffUtil */
    static class C0689a implements Comparator<C0695g> {
        C0689a() {
        }

        /* renamed from: a */
        public int compare(C0695g gVar, C0695g gVar2) {
            int i = gVar.f2636a - gVar2.f2636a;
            return i == 0 ? gVar.f2637b - gVar2.f2637b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    /* compiled from: DiffUtil */
    public static abstract class C0690b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    /* compiled from: DiffUtil */
    public static abstract class C0692d<T> {
        /* renamed from: a */
        public abstract boolean mo4204a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo4205b(T t, T t2);

        /* renamed from: c */
        public abstract Object mo4206c(T t, T t2);
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    /* compiled from: DiffUtil */
    private static class C0693e {

        /* renamed from: a */
        int f2629a;

        /* renamed from: b */
        int f2630b;

        /* renamed from: c */
        boolean f2631c;

        public C0693e(int i, int i2, boolean z) {
            this.f2629a = i;
            this.f2630b = i2;
            this.f2631c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    /* compiled from: DiffUtil */
    static class C0694f {

        /* renamed from: a */
        int f2632a;

        /* renamed from: b */
        int f2633b;

        /* renamed from: c */
        int f2634c;

        /* renamed from: d */
        int f2635d;

        public C0694f() {
        }

        public C0694f(int i, int i2, int i3, int i4) {
            this.f2632a = i;
            this.f2633b = i2;
            this.f2634c = i3;
            this.f2635d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$g */
    /* compiled from: DiffUtil */
    static class C0695g {

        /* renamed from: a */
        int f2636a;

        /* renamed from: b */
        int f2637b;

        /* renamed from: c */
        int f2638c;

        /* renamed from: d */
        boolean f2639d;

        /* renamed from: e */
        boolean f2640e;

        C0695g() {
        }
    }

    /* renamed from: a */
    public static C0691c m3266a(C0690b bVar) {
        return m3267a(bVar, true);
    }

    /* renamed from: a */
    public static C0691c m3267a(C0690b bVar, boolean z) {
        C0694f fVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0694f(0, oldListSize, 0, newListSize));
        int abs = oldListSize + newListSize + Math.abs(oldListSize - newListSize);
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0694f fVar2 = (C0694f) arrayList2.remove(arrayList2.size() - 1);
            C0695g a = m3268a(bVar, fVar2.f2632a, fVar2.f2633b, fVar2.f2634c, fVar2.f2635d, iArr, iArr2, abs);
            if (a != null) {
                if (a.f2638c > 0) {
                    arrayList.add(a);
                }
                a.f2636a += fVar2.f2632a;
                a.f2637b += fVar2.f2634c;
                if (arrayList3.isEmpty()) {
                    fVar = new C0694f();
                } else {
                    fVar = (C0694f) arrayList3.remove(arrayList3.size() - 1);
                }
                fVar.f2632a = fVar2.f2632a;
                fVar.f2634c = fVar2.f2634c;
                if (a.f2640e) {
                    fVar.f2633b = a.f2636a;
                    fVar.f2635d = a.f2637b;
                } else if (a.f2639d) {
                    fVar.f2633b = a.f2636a - 1;
                    fVar.f2635d = a.f2637b;
                } else {
                    fVar.f2633b = a.f2636a;
                    fVar.f2635d = a.f2637b - 1;
                }
                arrayList2.add(fVar);
                if (!a.f2640e) {
                    int i2 = a.f2636a;
                    int i3 = a.f2638c;
                    fVar2.f2632a = i2 + i3;
                    fVar2.f2634c = a.f2637b + i3;
                } else if (a.f2639d) {
                    int i4 = a.f2636a;
                    int i5 = a.f2638c;
                    fVar2.f2632a = i4 + i5 + 1;
                    fVar2.f2634c = a.f2637b + i5;
                } else {
                    int i6 = a.f2636a;
                    int i7 = a.f2638c;
                    fVar2.f2632a = i6 + i7;
                    fVar2.f2634c = a.f2637b + i7 + 1;
                }
                arrayList2.add(fVar2);
            } else {
                arrayList3.add(fVar2);
            }
        }
        Collections.sort(arrayList, f2621a);
        return new C0691c(bVar, arrayList, iArr, iArr2, z);
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    /* compiled from: DiffUtil */
    public static class C0691c {

        /* renamed from: a */
        private final List<C0695g> f2622a;

        /* renamed from: b */
        private final int[] f2623b;

        /* renamed from: c */
        private final int[] f2624c;

        /* renamed from: d */
        private final C0690b f2625d;

        /* renamed from: e */
        private final int f2626e;

        /* renamed from: f */
        private final int f2627f;

        /* renamed from: g */
        private final boolean f2628g;

        C0691c(C0690b bVar, List<C0695g> list, int[] iArr, int[] iArr2, boolean z) {
            this.f2622a = list;
            this.f2623b = iArr;
            this.f2624c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.f2624c, 0);
            this.f2625d = bVar;
            this.f2626e = bVar.getOldListSize();
            this.f2627f = bVar.getNewListSize();
            this.f2628g = z;
            m3271a();
            m3275b();
        }

        /* renamed from: a */
        private void m3271a() {
            C0695g gVar = this.f2622a.isEmpty() ? null : this.f2622a.get(0);
            if (gVar == null || gVar.f2636a != 0 || gVar.f2637b != 0) {
                C0695g gVar2 = new C0695g();
                gVar2.f2636a = 0;
                gVar2.f2637b = 0;
                gVar2.f2639d = false;
                gVar2.f2638c = 0;
                gVar2.f2640e = false;
                this.f2622a.add(0, gVar2);
            }
        }

        /* renamed from: b */
        private void m3275b() {
            int i = this.f2626e;
            int i2 = this.f2627f;
            for (int size = this.f2622a.size() - 1; size >= 0; size--) {
                C0695g gVar = this.f2622a.get(size);
                int i3 = gVar.f2636a;
                int i4 = gVar.f2638c;
                int i5 = i3 + i4;
                int i6 = gVar.f2637b + i4;
                if (this.f2628g) {
                    while (i > i5) {
                        m3272a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m3276b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < gVar.f2638c; i7++) {
                    int i8 = gVar.f2636a + i7;
                    int i9 = gVar.f2637b + i7;
                    int i10 = this.f2625d.areContentsTheSame(i8, i9) ? 1 : 2;
                    this.f2623b[i8] = (i9 << 5) | i10;
                    this.f2624c[i9] = (i8 << 5) | i10;
                }
                i = gVar.f2636a;
                i2 = gVar.f2637b;
            }
        }

        /* renamed from: a */
        private void m3272a(int i, int i2, int i3) {
            if (this.f2623b[i - 1] == 0) {
                m3274a(i, i2, i3, false);
            }
        }

        /* renamed from: a */
        private boolean m3274a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C0695g gVar = this.f2622a.get(i3);
                int i6 = gVar.f2636a;
                int i7 = gVar.f2638c;
                int i8 = i6 + i7;
                int i9 = gVar.f2637b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.f2625d.areItemsTheSame(i11, i5)) {
                            if (!this.f2625d.areContentsTheSame(i11, i5)) {
                                i10 = 4;
                            }
                            this.f2624c[i5] = (i11 << 5) | 16;
                            this.f2623b[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f2625d.areItemsTheSame(i5, i12)) {
                            if (!this.f2625d.areContentsTheSame(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f2623b[i13] = (i12 << 5) | 16;
                            this.f2624c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = gVar.f2636a;
                i2 = gVar.f2637b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m3276b(int i, int i2, int i3) {
            if (this.f2624c[i2 - 1] == 0) {
                m3274a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        private void m3277b(List<C0693e> list, C0708l lVar, int i, int i2, int i3) {
            if (!this.f2628g) {
                lVar.mo4146c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f2623b[i5] & 31;
                if (i6 == 0) {
                    lVar.mo4146c(i + i4, 1);
                    for (C0693e eVar : list) {
                        eVar.f2630b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f2623b[i5] >> 5;
                    C0693e a = m3270a(list, i7, false);
                    lVar.mo4143a(i + i4, a.f2630b - 1);
                    if (i6 == 4) {
                        lVar.mo4144a(a.f2630b - 1, 1, this.f2625d.getChangePayload(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C0693e(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: a */
        public void mo4202a(RecyclerView.C0633g gVar) {
            mo4203a((C0708l) new C0672b(gVar));
        }

        /* renamed from: a */
        public void mo4203a(C0708l lVar) {
            C0673c cVar;
            if (lVar instanceof C0673c) {
                cVar = (C0673c) lVar;
            } else {
                cVar = new C0673c(lVar);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f2626e;
            int i2 = this.f2627f;
            for (int size = this.f2622a.size() - 1; size >= 0; size--) {
                C0695g gVar = this.f2622a.get(size);
                int i3 = gVar.f2638c;
                int i4 = gVar.f2636a + i3;
                int i5 = gVar.f2637b + i3;
                if (i4 < i) {
                    m3277b(arrayList, cVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m3273a(arrayList, cVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f2623b;
                    int i7 = gVar.f2636a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        cVar.mo4144a(i7 + i6, 1, this.f2625d.getChangePayload(i7 + i6, gVar.f2637b + i6));
                    }
                }
                i = gVar.f2636a;
                i2 = gVar.f2637b;
            }
            cVar.mo4147a();
        }

        /* renamed from: a */
        private static C0693e m3270a(List<C0693e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0693e eVar = list.get(size);
                if (eVar.f2629a == i && eVar.f2631c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f2630b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m3273a(List<C0693e> list, C0708l lVar, int i, int i2, int i3) {
            if (!this.f2628g) {
                lVar.mo4145b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f2624c[i5] & 31;
                if (i6 == 0) {
                    lVar.mo4145b(i, 1);
                    for (C0693e eVar : list) {
                        eVar.f2630b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f2624c[i5] >> 5;
                    lVar.mo4143a(m3270a(list, i7, true).f2630b, i);
                    if (i6 == 4) {
                        lVar.mo4144a(i, 1, this.f2625d.getChangePayload(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C0693e(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[LOOP:1: B:10:0x0033->B:33:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C0688f.C0695g m3268a(androidx.recyclerview.widget.C0688f.C0690b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x012f
            if (r4 >= r5) goto L_0x0011
            goto L_0x012f
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x0127
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a0
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.areItemsTheSame(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009a
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009a
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009a
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009a
            androidx.recyclerview.widget.f$g r0 = new androidx.recyclerview.widget.f$g
            r0.<init>()
            r3 = r2[r5]
            r0.f2636a = r3
            int r3 = r3 - r12
            r0.f2637b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f2638c = r1
            r0.f2639d = r14
            r13 = 0
            r0.f2640e = r13
            return r0
        L_0x009a:
            r13 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a0:
            r13 = 0
            r5 = r11
        L_0x00a2:
            if (r5 > r9) goto L_0x011c
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c4
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00bb
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 >= r12) goto L_0x00bc
            goto L_0x00c5
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = 1
            goto L_0x00cb
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = 0
        L_0x00cb:
            int r16 = r12 - r10
        L_0x00cd:
            if (r12 <= 0) goto L_0x00ea
            if (r16 <= 0) goto L_0x00ea
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.areItemsTheSame(r13, r3)
            if (r3 == 0) goto L_0x00ec
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cd
        L_0x00ea:
            r18 = r3
        L_0x00ec:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0115
            if (r10 < r11) goto L_0x0115
            if (r10 > r9) goto L_0x0115
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0115
            androidx.recyclerview.widget.f$g r0 = new androidx.recyclerview.widget.f$g
            r0.<init>()
            r4 = r2[r3]
            r0.f2636a = r4
            int r4 = r4 - r10
            r0.f2637b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f2638c = r1
            r0.f2639d = r14
            r3 = 1
            r0.f2640e = r3
            return r0
        L_0x0115:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a2
        L_0x011c:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0688f.m3268a(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$g");
    }
}
