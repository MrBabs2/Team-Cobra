package com.asf.appcoins.sdk.core.web3;

import org.web3j.protocol.core.methods.response.EthGetTransactionReceipt;
import p120q.p326a.p328c0.C10861o;

/* renamed from: com.asf.appcoins.sdk.core.web3.j */
/* compiled from: lambda */
public final /* synthetic */ class C5858j implements C10861o {

    /* renamed from: f */
    private final /* synthetic */ AsfWeb3jImpl f10552f;

    /* renamed from: g */
    private final /* synthetic */ String f10553g;

    public /* synthetic */ C5858j(AsfWeb3jImpl asfWeb3jImpl, String str) {
        this.f10552f = asfWeb3jImpl;
        this.f10553g = str;
    }

    public final Object apply(Object obj) {
        return this.f10552f.mo19871a(this.f10553g, (EthGetTransactionReceipt) obj);
    }
}
