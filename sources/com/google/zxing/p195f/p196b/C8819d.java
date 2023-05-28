package com.google.zxing.p195f.p196b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import okhttp3.internal.p398ws.WebSocketProtocol;

/* renamed from: com.google.zxing.f.b.d */
/* compiled from: HighLevelEncoder */
public final class C8819d {

    /* renamed from: b */
    static final String[] f25038b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    static final int[][] f25039c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    private static final int[][] f25040d;

    /* renamed from: e */
    static final int[][] f25041e;

    /* renamed from: a */
    private final byte[] f25042a;

    /* renamed from: com.google.zxing.f.b.d$a */
    /* compiled from: HighLevelEncoder */
    class C8820a implements Comparator<C8822f> {
        C8820a(C8819d dVar) {
        }

        /* renamed from: a */
        public int compare(C8822f fVar, C8822f fVar2) {
            return fVar.mo32576b() - fVar2.mo32576b();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        f25040d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f25040d[0][i] = (i - 65) + 2;
        }
        f25040d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f25040d[1][i2] = (i2 - 97) + 2;
        }
        f25040d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f25040d[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f25040d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, WebSocketProtocol.PAYLOAD_SHORT, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f25040d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f25040d[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f25041e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f25041e;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public C8819d(byte[] bArr) {
        this.f25042a = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.p197g.C8824a mo32567a() {
        /*
            r8 = this;
            com.google.zxing.f.b.f r0 = com.google.zxing.p195f.p196b.C8822f.f25045e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.f25042a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004e
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r3 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            byte[] r5 = r8.f25042a
            byte r5 = r5[r2]
            r6 = 13
            if (r5 == r6) goto L_0x003a
            r6 = 44
            r7 = 32
            if (r5 == r6) goto L_0x0036
            r6 = 46
            if (r5 == r6) goto L_0x0032
            r6 = 58
            if (r5 == r6) goto L_0x002e
        L_0x002c:
            r3 = 0
            goto L_0x003f
        L_0x002e:
            if (r3 != r7) goto L_0x002c
            r3 = 5
            goto L_0x003f
        L_0x0032:
            if (r3 != r7) goto L_0x002c
            r3 = 3
            goto L_0x003f
        L_0x0036:
            if (r3 != r7) goto L_0x002c
            r3 = 4
            goto L_0x003f
        L_0x003a:
            r5 = 10
            if (r3 != r5) goto L_0x002c
            r3 = 2
        L_0x003f:
            if (r3 <= 0) goto L_0x0047
            java.util.Collection r0 = m28782a((java.lang.Iterable<com.google.zxing.p195f.p196b.C8822f>) r0, (int) r2, (int) r3)
            r2 = r4
            goto L_0x004b
        L_0x0047:
            java.util.Collection r0 = r8.m28781a(r0, r2)
        L_0x004b:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004e:
            com.google.zxing.f.b.d$a r1 = new com.google.zxing.f.b.d$a
            r1.<init>(r8)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.google.zxing.f.b.f r0 = (com.google.zxing.p195f.p196b.C8822f) r0
            byte[] r1 = r8.f25042a
            com.google.zxing.g.a r0 = r0.mo32574a((byte[]) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p195f.p196b.C8819d.mo32567a():com.google.zxing.g.a");
    }

    /* renamed from: a */
    private Collection<C8822f> m28781a(Iterable<C8822f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C8822f a : iterable) {
            m28784a(a, i, (Collection<C8822f>) linkedList);
        }
        return m28780a(linkedList);
    }

    /* renamed from: a */
    private void m28784a(C8822f fVar, int i, Collection<C8822f> collection) {
        char c = (char) (this.f25042a[i] & 255);
        boolean z = f25040d[fVar.mo32579c()][c] > 0;
        C8822f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f25040d[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo32577b(i);
                }
                if (!z || i2 == fVar.mo32579c() || i2 == 2) {
                    collection.add(fVar2.mo32573a(i2, i3));
                }
                if (!z && f25041e[fVar.mo32579c()][i2] >= 0) {
                    collection.add(fVar2.mo32578b(i2, i3));
                }
            }
        }
        if (fVar.mo32571a() > 0 || f25040d[fVar.mo32579c()][c] == 0) {
            collection.add(fVar.mo32572a(i));
        }
    }

    /* renamed from: a */
    private static Collection<C8822f> m28782a(Iterable<C8822f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C8822f a : iterable) {
            m28783a(a, i, i2, linkedList);
        }
        return m28780a(linkedList);
    }

    /* renamed from: a */
    private static void m28783a(C8822f fVar, int i, int i2, Collection<C8822f> collection) {
        C8822f b = fVar.mo32577b(i);
        collection.add(b.mo32573a(4, i2));
        if (fVar.mo32579c() != 4) {
            collection.add(b.mo32578b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b.mo32573a(2, 16 - i2).mo32573a(2, 1));
        }
        if (fVar.mo32571a() > 0) {
            collection.add(fVar.mo32572a(i).mo32572a(i + 1));
        }
    }

    /* renamed from: a */
    private static Collection<C8822f> m28780a(Iterable<C8822f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C8822f next : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8822f fVar = (C8822f) it.next();
                if (fVar.mo32575a(next)) {
                    z = false;
                    break;
                } else if (next.mo32575a(fVar)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }
}
