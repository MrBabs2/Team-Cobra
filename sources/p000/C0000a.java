package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* renamed from: a */
/* compiled from: ServiceLoader */
public final /* synthetic */ class C0000a {
    /* renamed from: a */
    public static Iterator m0a() {
        try {
            return Arrays.asList(new CoroutineExceptionHandler[]{new AndroidExceptionPreHandler()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
