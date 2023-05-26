package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.common.reedsolomon.c */
/* compiled from: ReedSolomonEncoder */
public final class C8811c {

    /* renamed from: a */
    private final C8809a f25031a;

    /* renamed from: b */
    private final List<C8810b> f25032b;

    public C8811c(C8809a aVar) {
        this.f25031a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f25032b = arrayList;
        arrayList.add(new C8810b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C8810b m28757a(int i) {
        if (i >= this.f25032b.size()) {
            List<C8810b> list = this.f25032b;
            C8810b bVar = list.get(list.size() - 1);
            for (int size = this.f25032b.size(); size <= i; size++) {
                C8809a aVar = this.f25031a;
                bVar = bVar.mo32554c(new C8810b(aVar, new int[]{1, aVar.mo32541a((size - 1) + aVar.mo32540a())}));
                this.f25032b.add(bVar);
            }
        }
        return this.f25032b.get(i);
    }

    /* renamed from: a */
    public void mo32557a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C8810b a = m28757a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] a2 = new C8810b(this.f25031a, iArr2).mo32549a(i, 1).mo32553b(a)[1].mo32551a();
                int length2 = i - a2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(a2, 0, iArr, length + length2, a2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
