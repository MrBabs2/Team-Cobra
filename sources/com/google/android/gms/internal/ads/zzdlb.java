package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

public final class zzdlb implements zzdky<KeyFactory> {
    /* renamed from: a */
    public final /* synthetic */ Object mo29058a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
