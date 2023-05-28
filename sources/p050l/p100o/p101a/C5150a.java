package p050l.p100o.p101a;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import p050l.p075h.p076e.C4949a;
import p050l.p100o.p101a.C5153b;

/* renamed from: l.o.a.a */
/* compiled from: ColorCutQuantizer */
final class C5150a {

    /* renamed from: f */
    private static final Comparator<C5152b> f9098f = new C5151a();

    /* renamed from: a */
    final int[] f9099a;

    /* renamed from: b */
    final int[] f9100b;

    /* renamed from: c */
    final List<C5153b.C5159e> f9101c;

    /* renamed from: d */
    final C5153b.C5157c[] f9102d;

    /* renamed from: e */
    private final float[] f9103e = new float[3];

    /* renamed from: l.o.a.a$a */
    /* compiled from: ColorCutQuantizer */
    static class C5151a implements Comparator<C5152b> {
        C5151a() {
        }

        /* renamed from: a */
        public int compare(C5152b bVar, C5152b bVar2) {
            return bVar2.mo17818g() - bVar.mo17818g();
        }
    }

    /* renamed from: l.o.a.a$b */
    /* compiled from: ColorCutQuantizer */
    private class C5152b {

        /* renamed from: a */
        private int f9104a;

        /* renamed from: b */
        private int f9105b;

        /* renamed from: c */
        private int f9106c;

        /* renamed from: d */
        private int f9107d;

        /* renamed from: e */
        private int f9108e;

        /* renamed from: f */
        private int f9109f;

        /* renamed from: g */
        private int f9110g;

        /* renamed from: h */
        private int f9111h;

        /* renamed from: i */
        private int f9112i;

        C5152b(int i, int i2) {
            this.f9104a = i;
            this.f9105b = i2;
            mo17814c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo17812a() {
            return mo17816e() > 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo17813b() {
            int f = mo17817f();
            C5150a aVar = C5150a.this;
            int[] iArr = aVar.f9099a;
            int[] iArr2 = aVar.f9100b;
            C5150a.m9525a(iArr, f, this.f9104a, this.f9105b);
            Arrays.sort(iArr, this.f9104a, this.f9105b + 1);
            C5150a.m9525a(iArr, f, this.f9104a, this.f9105b);
            int i = this.f9106c / 2;
            int i2 = this.f9104a;
            int i3 = 0;
            while (true) {
                int i4 = this.f9105b;
                if (i2 > i4) {
                    return this.f9104a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo17814c() {
            C5150a aVar = C5150a.this;
            int[] iArr = aVar.f9099a;
            int[] iArr2 = aVar.f9100b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f9104a; i8 <= this.f9105b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int f = C5150a.m9533f(i9);
                int e = C5150a.m9532e(i9);
                int d = C5150a.m9531d(i9);
                if (f > i4) {
                    i4 = f;
                }
                if (f < i) {
                    i = f;
                }
                if (e > i5) {
                    i5 = e;
                }
                if (e < i2) {
                    i2 = e;
                }
                if (d > i6) {
                    i6 = d;
                }
                if (d < i3) {
                    i3 = d;
                }
            }
            this.f9107d = i;
            this.f9108e = i4;
            this.f9109f = i2;
            this.f9110g = i5;
            this.f9111h = i3;
            this.f9112i = i6;
            this.f9106c = i7;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final C5153b.C5159e mo17815d() {
            C5150a aVar = C5150a.this;
            int[] iArr = aVar.f9099a;
            int[] iArr2 = aVar.f9100b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f9104a; i5 <= this.f9105b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C5150a.m9533f(i6) * i7;
                i3 += C5150a.m9532e(i6) * i7;
                i4 += i7 * C5150a.m9531d(i6);
            }
            float f = (float) i2;
            return new C5153b.C5159e(C5150a.m9522a(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final int mo17816e() {
            return (this.f9105b + 1) - this.f9104a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo17817f() {
            int i = this.f9108e - this.f9107d;
            int i2 = this.f9110g - this.f9109f;
            int i3 = this.f9112i - this.f9111h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final int mo17818g() {
            return ((this.f9108e - this.f9107d) + 1) * ((this.f9110g - this.f9109f) + 1) * ((this.f9112i - this.f9111h) + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final C5152b mo17819h() {
            if (mo17812a()) {
                int b = mo17813b();
                C5152b bVar = new C5152b(b + 1, this.f9105b);
                this.f9105b = b;
                mo17814c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    C5150a(int[] iArr, int i, C5153b.C5157c[] cVarArr) {
        this.f9102d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f9100b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int b = m9528b(iArr[i2]);
            iArr[i2] = b;
            iArr2[b] = iArr2[b] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m9534g(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f9099a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.f9101c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f9101c.add(new C5153b.C5159e(m9521a(i8), iArr2[i8]));
            }
            return;
        }
        this.f9101c = m9530c(i);
    }

    /* renamed from: b */
    private static int m9528b(int i) {
        return m9529b(Color.blue(i), 8, 5) | (m9529b(Color.red(i), 8, 5) << 10) | (m9529b(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: b */
    private static int m9529b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: c */
    private List<C5153b.C5159e> m9530c(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f9098f);
        priorityQueue.offer(new C5152b(0, this.f9099a.length - 1));
        m9524a((PriorityQueue<C5152b>) priorityQueue, i);
        return m9523a((Collection<C5152b>) priorityQueue);
    }

    /* renamed from: d */
    static int m9531d(int i) {
        return i & 31;
    }

    /* renamed from: e */
    static int m9532e(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: f */
    static int m9533f(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: g */
    private boolean m9534g(int i) {
        int a = m9521a(i);
        C4949a.m8705a(a, this.f9103e);
        return m9526a(a, this.f9103e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C5153b.C5159e> mo17809a() {
        return this.f9101c;
    }

    /* renamed from: a */
    private void m9524a(PriorityQueue<C5152b> priorityQueue, int i) {
        C5152b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.mo17812a()) {
            priorityQueue.offer(poll.mo17819h());
            priorityQueue.offer(poll);
        }
    }

    /* renamed from: a */
    private List<C5153b.C5159e> m9523a(Collection<C5152b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C5152b d : collection) {
            C5153b.C5159e d2 = d.mo17815d();
            if (!m9527a(d2)) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static void m9525a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m9531d(i4) | (m9532e(i4) << 10) | (m9533f(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m9533f(i5) | (m9531d(i5) << 10) | (m9532e(i5) << 5);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private boolean m9527a(C5153b.C5159e eVar) {
        return m9526a(eVar.mo17833d(), eVar.mo17831b());
    }

    /* renamed from: a */
    private boolean m9526a(int i, float[] fArr) {
        C5153b.C5157c[] cVarArr = this.f9102d;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f9102d[i2].mo17822a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static int m9522a(int i, int i2, int i3) {
        return Color.rgb(m9529b(i, 5, 8), m9529b(i2, 5, 8), m9529b(i3, 5, 8));
    }

    /* renamed from: a */
    private static int m9521a(int i) {
        return m9522a(m9533f(i), m9532e(i), m9531d(i));
    }
}
