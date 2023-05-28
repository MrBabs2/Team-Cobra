package com.airbnb.epoxy.preload;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo16641d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloadException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorMessage", "", "(Ljava/lang/String;)V", "epoxy-adapter_release"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: EpoxyPreloader.kt */
public final class EpoxyPreloadException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpoxyPreloadException(String str) {
        super(str);
        C10202j.m34178b(str, "errorMessage");
    }
}
