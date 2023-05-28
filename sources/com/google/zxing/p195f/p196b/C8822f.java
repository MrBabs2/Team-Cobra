package com.google.zxing.p195f.p196b;

import com.google.zxing.p197g.C8824a;
import java.util.LinkedList;

/* renamed from: com.google.zxing.f.b.f */
/* compiled from: State */
final class C8822f {

    /* renamed from: e */
    static final C8822f f25045e = new C8822f(C8823g.f25050b, 0, 0, 0);

    /* renamed from: a */
    private final int f25046a;

    /* renamed from: b */
    private final C8823g f25047b;

    /* renamed from: c */
    private final int f25048c;

    /* renamed from: d */
    private final int f25049d;

    private C8822f(C8823g gVar, int i, int i2, int i3) {
        this.f25047b = gVar;
        this.f25046a = i;
        this.f25048c = i2;
        this.f25049d = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo32571a() {
        return this.f25048c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32576b() {
        return this.f25049d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo32579c() {
        return this.f25046a;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C8819d.f25038b[this.f25046a], Integer.valueOf(this.f25049d), Integer.valueOf(this.f25048c)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8822f mo32573a(int i, int i2) {
        int i3 = this.f25049d;
        C8823g gVar = this.f25047b;
        int i4 = this.f25046a;
        if (i != i4) {
            int i5 = C8819d.f25039c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.mo32582a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new C8822f(gVar.mo32582a(i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8822f mo32578b(int i, int i2) {
        C8823g gVar = this.f25047b;
        int i3 = this.f25046a == 2 ? 4 : 5;
        return new C8822f(gVar.mo32582a(C8819d.f25041e[this.f25046a][i], i3).mo32582a(i2, 5), this.f25046a, 0, this.f25049d + i3 + 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8822f mo32577b(int i) {
        int i2 = this.f25048c;
        if (i2 == 0) {
            return this;
        }
        return new C8822f(this.f25047b.mo32583b(i - i2, i2), this.f25046a, 0, this.f25049d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8822f mo32572a(int i) {
        C8823g gVar = this.f25047b;
        int i2 = this.f25046a;
        int i3 = this.f25049d;
        if (i2 == 4 || i2 == 2) {
            int i4 = C8819d.f25039c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.mo32582a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f25048c;
        C8822f fVar = new C8822f(gVar, i2, this.f25048c + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return fVar.f25048c == 2078 ? fVar.mo32577b(i + 1) : fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo32575a(C8822f fVar) {
        int i;
        int i2 = this.f25049d + (C8819d.f25039c[this.f25046a][fVar.f25046a] >> 16);
        int i3 = fVar.f25048c;
        if (i3 > 0 && ((i = this.f25048c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= fVar.f25049d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8824a mo32574a(byte[] bArr) {
        LinkedList<C8823g> linkedList = new LinkedList<>();
        for (C8823g gVar = mo32577b(bArr.length).f25047b; gVar != null; gVar = gVar.mo32581a()) {
            linkedList.addFirst(gVar);
        }
        C8824a aVar = new C8824a();
        for (C8823g a : linkedList) {
            a.mo32565a(aVar, bArr);
        }
        return aVar;
    }
}
