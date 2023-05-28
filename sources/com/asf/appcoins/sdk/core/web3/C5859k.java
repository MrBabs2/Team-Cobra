package com.asf.appcoins.sdk.core.web3;

import org.web3j.protocol.core.methods.response.EthGetTransactionCount;
import p120q.p326a.p328c0.C10861o;

/* renamed from: com.asf.appcoins.sdk.core.web3.k */
/* compiled from: lambda */
public final /* synthetic */ class C5859k implements C10861o {

    /* renamed from: f */
    public static final /* synthetic */ C5859k f10554f = new C5859k();

    private /* synthetic */ C5859k() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((EthGetTransactionCount) obj).getTransactionCount().longValue());
    }
}
