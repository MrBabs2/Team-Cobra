package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.auth.zzu;

public class AccountTransferClient extends GoogleApi<zzn> {

    /* renamed from: i */
    private static final Api.ClientKey<zzu> f13441i = new Api.ClientKey<>();

    /* renamed from: j */
    private static final Api.AbstractClientBuilder<zzu, zzn> f13442j;

    static {
        C7135b bVar = new C7135b();
        f13442j = bVar;
        new Api("AccountTransfer.ACCOUNT_TRANSFER_API", bVar, f13441i);
    }
}
