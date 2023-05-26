package okhttp3.logging;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.HttpLoggingInterceptor;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"okhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DEFAULT$1", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "log", "", "message", "", "okhttp-logging-interceptor"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: HttpLoggingInterceptor.kt */
public final class HttpLoggingInterceptor$Logger$Companion$DEFAULT$1 implements HttpLoggingInterceptor.Logger {
    HttpLoggingInterceptor$Logger$Companion$DEFAULT$1() {
    }

    public void log(String str) {
        C10202j.m34178b(str, "message");
        Platform.Companion.get().log(4, str, (Throwable) null);
    }
}
