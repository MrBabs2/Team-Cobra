package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p413s.C12905f;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n\u001a\f\u0010\u001a\u001a\u00020\u0004*\u00020\u0010H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo16641d2 = {"QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS", "hasBody", "", "response", "Lokhttp3/Response;", "parseChallenges", "", "Lokhttp3/Challenge;", "Lokhttp3/Headers;", "headerName", "", "promisesBody", "readChallengeHeader", "", "Lokio/Buffer;", "result", "", "readQuotedString", "readToken", "receiveHeaders", "Lokhttp3/CookieJar;", "url", "Lokhttp3/HttpUrl;", "headers", "skipCommasAndWhitespace", "startsWith", "prefix", "", "okhttp"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* compiled from: HttpHeaders.kt */
public final class HttpHeaders {
    private static final C12911i QUOTED_STRING_DELIMITERS = C12911i.f33159j.mo41249c("\"\\");
    private static final C12911i TOKEN_DELIMITERS = C12911i.f33159j.mo41249c("\t ,=");

    public static final boolean hasBody(Response response) {
        C10202j.m34178b(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        C10202j.m34178b(headers, "$this$parseChallenges");
        C10202j.m34178b(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (C12130v.m40053b(str, headers.name(i), true)) {
                C12905f fVar = new C12905f();
                fVar.mo41155b(headers.value(i));
                try {
                    readChallengeHeader(fVar, arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log(5, "Unable to parse challenge", e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        C10202j.m34178b(response, "$this$promisesBody");
        if (C10202j.m34176a((Object) response.request().method(), (Object) "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !C12130v.m40053b("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    private static final void readChallengeHeader(C12905f fVar, List<Challenge> list) throws EOFException {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipCommasAndWhitespace(fVar);
                    str2 = readToken(fVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(fVar);
                readToken = readToken(fVar);
                if (readToken != null) {
                    byte b = (byte) 61;
                    skipAll = Util.skipAll(fVar, b);
                    boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(fVar);
                    if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !fVar.mo41169g())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + Util.skipAll(fVar, b);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(fVar);
                                if (skipCommasAndWhitespace(fVar)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = Util.skipAll(fVar, b);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipCommasAndWhitespace(fVar)) {
                                if (startsWith(fVar, (byte) 34)) {
                                    str = readQuotedString(fVar);
                                } else {
                                    str = readToken(fVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(readToken, str)) == null) {
                                    if (skipCommasAndWhitespace(fVar) || fVar.mo41169g()) {
                                        readToken = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str2, (Map<String, String>) linkedHashMap));
                        str2 = readToken;
                    }
                } else if (fVar.mo41169g()) {
                    list.add(new Challenge(str2, (Map<String, String>) C10518j0.m35601a()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, readToken + C12130v.m40041a("=", skipAll));
            C10202j.m34174a((Object) singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str2, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(C12905f fVar) throws EOFException {
        byte b = (byte) 34;
        if (fVar.readByte() == b) {
            C12905f fVar2 = new C12905f();
            while (true) {
                long b2 = fVar.mo41152b(QUOTED_STRING_DELIMITERS);
                if (b2 == -1) {
                    return null;
                }
                if (fVar.mo41163d(b2) == b) {
                    fVar2.write(fVar, b2);
                    fVar.readByte();
                    return fVar2.mo41186q();
                } else if (fVar.size() == b2 + 1) {
                    return null;
                } else {
                    fVar2.write(fVar, b2);
                    fVar.readByte();
                    fVar2.write(fVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(C12905f fVar) {
        long b = fVar.mo41152b(TOKEN_DELIMITERS);
        if (b == -1) {
            b = fVar.size();
        }
        if (b != 0) {
            return fVar.mo41168g(b);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        C10202j.m34178b(cookieJar, "$this$receiveHeaders");
        C10202j.m34178b(httpUrl, "url");
        C10202j.m34178b(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(C12905f fVar) {
        boolean z = false;
        while (!fVar.mo41169g()) {
            byte d = fVar.mo41163d(0);
            if (d == 9 || d == 32) {
                fVar.readByte();
            } else if (d != 44) {
                break;
            } else {
                fVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(C12905f fVar, byte b) {
        return !fVar.mo41169g() && fVar.mo41163d(0) == b;
    }
}
