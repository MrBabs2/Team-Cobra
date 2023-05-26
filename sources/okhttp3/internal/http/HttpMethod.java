package okhttp3.internal.http;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo16641d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: HttpMethod.kt */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        C10202j.m34178b(str, "method");
        return !C10202j.m34176a((Object) str, (Object) "GET") && !C10202j.m34176a((Object) str, (Object) "HEAD");
    }

    public static final boolean requiresRequestBody(String str) {
        C10202j.m34178b(str, "method");
        return C10202j.m34176a((Object) str, (Object) "POST") || C10202j.m34176a((Object) str, (Object) "PUT") || C10202j.m34176a((Object) str, (Object) "PATCH") || C10202j.m34176a((Object) str, (Object) "PROPPATCH") || C10202j.m34176a((Object) str, (Object) "REPORT");
    }

    public final boolean invalidatesCache(String str) {
        C10202j.m34178b(str, "method");
        return C10202j.m34176a((Object) str, (Object) "POST") || C10202j.m34176a((Object) str, (Object) "PATCH") || C10202j.m34176a((Object) str, (Object) "PUT") || C10202j.m34176a((Object) str, (Object) "DELETE") || C10202j.m34176a((Object) str, (Object) "MOVE");
    }

    public final boolean redirectsToGet(String str) {
        C10202j.m34178b(str, "method");
        return !C10202j.m34176a((Object) str, (Object) "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        C10202j.m34178b(str, "method");
        return C10202j.m34176a((Object) str, (Object) "PROPFIND");
    }
}
