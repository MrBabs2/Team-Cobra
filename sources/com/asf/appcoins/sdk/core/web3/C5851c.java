package com.asf.appcoins.sdk.core.web3;

import org.web3j.protocol.core.methods.response.EthGasPrice;
import p120q.p326a.p328c0.C10861o;

/* renamed from: com.asf.appcoins.sdk.core.web3.c */
/* compiled from: lambda */
public final /* synthetic */ class C5851c implements C10861o {

    /* renamed from: f */
    public static final /* synthetic */ C5851c f10543f = new C5851c();

    private /* synthetic */ C5851c() {
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((EthGasPrice) obj).getGasPrice().longValue());
    }
}
