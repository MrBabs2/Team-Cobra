package com.asf.appcoins.sdk.core.web3;

import java.util.concurrent.Callable;
import org.web3j.abi.datatypes.Address;

/* renamed from: com.asf.appcoins.sdk.core.web3.d */
/* compiled from: lambda */
public final /* synthetic */ class C5852d implements Callable {

    /* renamed from: f */
    private final /* synthetic */ AsfWeb3jImpl f10544f;

    /* renamed from: g */
    private final /* synthetic */ Address f10545g;

    public /* synthetic */ C5852d(AsfWeb3jImpl asfWeb3jImpl, Address address) {
        this.f10544f = asfWeb3jImpl;
        this.f10545g = address;
    }

    public final Object call() {
        return this.f10544f.mo19869a(this.f10545g);
    }
}
