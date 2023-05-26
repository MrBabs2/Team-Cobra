package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class zzal {

    /* renamed from: e */
    private static final Comparator<byte[]> f18164e = new C7643k2();

    /* renamed from: a */
    private final List<byte[]> f18165a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f18166b = new ArrayList(64);

    /* renamed from: c */
    private int f18167c = 0;

    /* renamed from: d */
    private final int f18168d = RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;

    public zzal(int i) {
    }

    /* renamed from: a */
    public final synchronized byte[] mo27365a(int i) {
        for (int i2 = 0; i2 < this.f18166b.size(); i2++) {
            byte[] bArr = this.f18166b.get(i2);
            if (bArr.length >= i) {
                this.f18167c -= bArr.length;
                this.f18166b.remove(i2);
                this.f18165a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo27364a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f18168d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f18165a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f18166b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f18164e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f18166b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f18167c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f18167c = r0     // Catch:{ all -> 0x002b }
            r2.m19361a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzal.mo27364a(byte[]):void");
    }

    /* renamed from: a */
    private final synchronized void m19361a() {
        while (this.f18167c > this.f18168d) {
            byte[] remove = this.f18165a.remove(0);
            this.f18166b.remove(remove);
            this.f18167c -= remove.length;
        }
    }
}
