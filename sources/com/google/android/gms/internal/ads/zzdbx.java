package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzdbx {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<zzdbw> f21327a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static zzdbw m23277a(String str) throws GeneralSecurityException {
        Iterator<zzdbw> it = f21327a.iterator();
        while (it.hasNext()) {
            zzdbw next = it.next();
            if (next.mo28911a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
