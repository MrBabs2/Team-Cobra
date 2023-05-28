package com.asf.appcoins.sdk.core.web3;

import java.util.concurrent.Callable;
import org.web3j.protocol.core.methods.request.Transaction;

/* renamed from: com.asf.appcoins.sdk.core.web3.b */
/* compiled from: lambda */
public final /* synthetic */ class C5850b implements Callable {

    /* renamed from: f */
    private final /* synthetic */ AsfWeb3jImpl f10541f;

    /* renamed from: g */
    private final /* synthetic */ Transaction f10542g;

    public /* synthetic */ C5850b(AsfWeb3jImpl asfWeb3jImpl, Transaction transaction) {
        this.f10541f = asfWeb3jImpl;
        this.f10542g = transaction;
    }

    public final Object call() {
        return this.f10541f.mo19867a(this.f10542g);
    }
}
