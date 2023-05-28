package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;

@zzard
public final class zzvh {
    /* renamed from: a */
    public static void m25430a(String[] strArr, int i, int i2, PriorityQueue<zzvi> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m25429a(i, m25431b(strArr2, 0, strArr2.length), m25428a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m25431b(strArr2, 0, i3);
        m25429a(i, b, m25428a(strArr2, 0, i3), i2, priorityQueue);
        long a = m25427a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) zzve.m25423a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) zzve.m25423a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m25429a(i, b, m25428a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: b */
    private static long m25431b(String[] strArr, int i, int i2) {
        long a = (((long) zzve.m25423a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) zzve.m25423a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    @VisibleForTesting
    /* renamed from: a */
    private static void m25429a(int i, long j, String str, int i2, PriorityQueue<zzvi> priorityQueue) {
        zzvi zzvi = new zzvi(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f22840c <= zzvi.f22840c && priorityQueue.peek().f22838a <= zzvi.f22838a)) && !priorityQueue.contains(zzvi)) {
            priorityQueue.add(zzvi);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private static String m25428a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzbad.m20519b("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private static long m25427a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        if (i % 2 == 0) {
            return m25427a((j * j) % 1073807359, i / 2) % 1073807359;
        }
        return (j * (m25427a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }
}
