package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@zzard
public final class zzvb {

    /* renamed from: a */
    private final int f22834a;

    /* renamed from: b */
    private final int f22835b;

    /* renamed from: c */
    private final zzva f22836c = new zzvf();

    public zzvb(int i) {
        this.f22835b = i;
        this.f22834a = 6;
    }

    /* renamed from: a */
    public final String mo29834a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append(10);
        }
        return m25421a(sb.toString());
    }

    @VisibleForTesting
    /* renamed from: a */
    private final String m25421a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        v40 v40 = new v40();
        PriorityQueue priorityQueue = new PriorityQueue(this.f22835b, new u40(this));
        for (String a : split) {
            String[] a2 = zzve.m25424a(a, false);
            if (a2.length != 0) {
                zzvh.m25430a(a2, this.f22835b, this.f22834a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                v40.mo26685a(this.f22836c.mo29833a(((zzvi) it.next()).f22839b));
            } catch (IOException e) {
                zzbad.m20520b("Error while writing hash to byteStream", e);
            }
        }
        return v40.toString();
    }
}
