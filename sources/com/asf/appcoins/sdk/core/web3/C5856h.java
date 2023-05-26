package com.asf.appcoins.sdk.core.web3;

import org.web3j.protocol.core.methods.response.EthSendTransaction;
import p120q.p326a.p328c0.C10861o;

/* renamed from: com.asf.appcoins.sdk.core.web3.h */
/* compiled from: lambda */
public final /* synthetic */ class C5856h implements C10861o {

    /* renamed from: f */
    private final /* synthetic */ AsfWeb3jImpl f10550f;

    public /* synthetic */ C5856h(AsfWeb3jImpl asfWeb3jImpl) {
        this.f10550f = asfWeb3jImpl;
    }

    public final Object apply(Object obj) {
        return this.f10550f.successOrThrow((EthSendTransaction) obj);
    }
}
