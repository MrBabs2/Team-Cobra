package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C10202j;

/* compiled from: InvalidModuleException.kt */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        C10202j.m34178b(str, "message");
    }
}
