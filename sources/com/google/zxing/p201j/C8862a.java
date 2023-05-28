package com.google.zxing.p201j;

import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.C8814e;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import com.google.zxing.p201j.p202b.C8865c;
import com.google.zxing.p201j.p202b.C8866d;
import com.google.zxing.p201j.p202b.C8867e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.j.a */
/* compiled from: PDF417Writer */
public final class C8862a implements C8814e {
    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        int i3;
        int i4;
        if (aVar == C8806a.PDF_417) {
            C8867e eVar = new C8867e();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                if (map.containsKey(C8808c.PDF417_COMPACT)) {
                    eVar.mo32661a(Boolean.valueOf(map.get(C8808c.PDF417_COMPACT).toString()).booleanValue());
                }
                if (map.containsKey(C8808c.PDF417_COMPACTION)) {
                    eVar.mo32658a(C8865c.valueOf(map.get(C8808c.PDF417_COMPACTION).toString()));
                }
                if (map.containsKey(C8808c.PDF417_DIMENSIONS)) {
                    C8866d dVar = (C8866d) map.get(C8808c.PDF417_DIMENSIONS);
                    eVar.mo32657a(dVar.mo32652a(), dVar.mo32654c(), dVar.mo32653b(), dVar.mo32655d());
                }
                if (map.containsKey(C8808c.MARGIN)) {
                    i5 = Integer.parseInt(map.get(C8808c.MARGIN).toString());
                }
                if (map.containsKey(C8808c.ERROR_CORRECTION)) {
                    i6 = Integer.parseInt(map.get(C8808c.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C8808c.CHARACTER_SET)) {
                    eVar.mo32660a(Charset.forName(map.get(C8808c.CHARACTER_SET).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return m28943a(eVar, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    private static C8825b m28943a(C8867e eVar, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        eVar.mo32659a(str, i);
        byte[][] a = eVar.mo32656a().mo32648a(1, 4);
        if ((i3 > i2) != (a[0].length < a.length)) {
            a = m28945a(a);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / a[0].length;
        int length2 = i3 / a.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m28944a(a, i4);
        }
        byte[][] a2 = eVar.mo32656a().mo32648a(length, length << 2);
        if (z) {
            a2 = m28945a(a2);
        }
        return m28944a(a2, i4);
    }

    /* renamed from: a */
    private static C8825b m28944a(byte[][] bArr, int i) {
        int i2 = i * 2;
        C8825b bVar = new C8825b(bArr[0].length + i2, bArr.length + i2);
        bVar.mo32599b();
        int c = (bVar.mo32601c() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    bVar.mo32600b(i4 + i, c);
                }
            }
            i3++;
            c--;
        }
        return bVar;
    }

    /* renamed from: a */
    private static byte[][] m28945a(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
