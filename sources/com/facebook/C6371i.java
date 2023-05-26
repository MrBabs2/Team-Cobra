package com.facebook;

import android.util.Log;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6476x;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.i */
/* compiled from: GraphResponse */
public class C6371i {

    /* renamed from: d */
    private static final String f11721d = "i";

    /* renamed from: a */
    private final HttpURLConnection f11722a;

    /* renamed from: b */
    private final JSONObject f11723b;

    /* renamed from: c */
    private final FacebookRequestError f11724c;

    public C6371i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, (JSONArray) null, (FacebookRequestError) null);
    }

    /* renamed from: a */
    public final FacebookRequestError mo20918a() {
        return this.f11724c;
    }

    /* renamed from: b */
    public final JSONObject mo20919b() {
        return this.f11723b;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.f11722a != null ? this.f11722a.getResponseCode() : 200);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response: " + " responseCode: " + str + ", graphObject: " + this.f11723b + ", error: " + this.f11724c + "}";
    }

    public C6371i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, (JSONObject) null, jSONArray, (FacebookRequestError) null);
    }

    /* renamed from: a */
    static List<C6371i> m13206a(HttpURLConnection httpURLConnection, C6368h hVar) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            if (C4716f.m7712u()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                return m13204a(inputStream2, httpURLConnection, hVar);
            }
            Log.e(f11721d, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        } catch (FacebookException e) {
            C6460r.m13408a(C6494l.REQUESTS, "Response", "Response <Error>: %s", e);
            return m13208a((List<GraphRequest>) hVar, httpURLConnection, e);
        } catch (Exception e2) {
            C6460r.m13408a(C6494l.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m13208a((List<GraphRequest>) hVar, httpURLConnection, new FacebookException((Throwable) e2));
        } finally {
            C6476x.m13504a(inputStream2);
        }
    }

    public C6371i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, facebookRequestError);
    }

    C6371i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f11722a = httpURLConnection;
        this.f11723b = jSONObject;
        this.f11724c = facebookRequestError;
    }

    /* renamed from: a */
    static List<C6371i> m13204a(InputStream inputStream, HttpURLConnection httpURLConnection, C6368h hVar) throws FacebookException, JSONException, IOException {
        String a = C6476x.m13485a(inputStream);
        C6460r.m13408a(C6494l.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a.length()), a);
        return m13205a(a, httpURLConnection, hVar);
    }

    /* renamed from: a */
    static List<C6371i> m13205a(String str, HttpURLConnection httpURLConnection, C6368h hVar) throws FacebookException, JSONException, IOException {
        List<C6371i> a = m13207a(httpURLConnection, (List<GraphRequest>) hVar, new JSONTokener(str).nextValue());
        C6460r.m13408a(C6494l.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", hVar.mo20911j(), Integer.valueOf(str.length()), a);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C6371i> m13207a(java.net.HttpURLConnection r7, java.util.List<com.facebook.GraphRequest> r8, java.lang.Object r9) throws com.facebook.FacebookException, org.json.JSONException {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0051
            java.lang.Object r3 = r8.get(r2)
            com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0052
        L_0x0034:
            r4 = move-exception
            com.facebook.i r5 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
            goto L_0x0051
        L_0x0043:
            r4 = move-exception
            com.facebook.i r5 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
        L_0x0051:
            r5 = r9
        L_0x0052:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0097
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 != r0) goto L_0x0097
        L_0x005e:
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0096
            java.lang.Object r0 = r8.get(r2)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            com.facebook.i r3 = m13203a(r0, r7, r3, r9)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            r1.add(r3)     // Catch:{ JSONException -> 0x0085, FacebookException -> 0x0076 }
            goto L_0x0093
        L_0x0076:
            r3 = move-exception
            com.facebook.i r4 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
            goto L_0x0093
        L_0x0085:
            r3 = move-exception
            com.facebook.i r4 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
        L_0x0093:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0096:
            return r1
        L_0x0097:
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>((java.lang.String) r8)
            goto L_0x00a0
        L_0x009f:
            throw r7
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C6371i.m13207a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: a */
    private static C6371i m13203a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.m13062a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                Log.e(f11721d, a.toString());
                if (a.mo20812a() == 190 && C6476x.m13514a(graphRequest.mo20833c())) {
                    if (a.mo20818f() != 493) {
                        AccessToken.m13034b((AccessToken) null);
                    } else if (!AccessToken.m13036r().mo20790o()) {
                        AccessToken.m13035q();
                    }
                }
                return new C6371i(graphRequest, httpURLConnection, a);
            }
            Object a2 = C6476x.m13483a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (a2 instanceof JSONObject) {
                return new C6371i(graphRequest, httpURLConnection, a2.toString(), (JSONObject) a2);
            }
            if (a2 instanceof JSONArray) {
                return new C6371i(graphRequest, httpURLConnection, a2.toString(), (JSONArray) a2);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new C6371i(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        throw new FacebookException("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
    }

    /* renamed from: a */
    static List<C6371i> m13208a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C6371i(list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }
}
