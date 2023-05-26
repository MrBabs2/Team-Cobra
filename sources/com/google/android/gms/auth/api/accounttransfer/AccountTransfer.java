package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzt;
import com.google.android.gms.internal.auth.zzu;

public final class AccountTransfer {

    /* renamed from: a */
    private static final Api.ClientKey<zzu> f13439a = new Api.ClientKey<>();

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzu, zzn> f13440b;

    static {
        C7134a aVar = new C7134a();
        f13440b = aVar;
        new Api("AccountTransfer.ACCOUNT_TRANSFER_API", aVar, f13439a);
        new zzt();
        new zzt();
    }

    private AccountTransfer() {
    }
}
