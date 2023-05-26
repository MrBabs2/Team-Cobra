package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C6430h;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6476x;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C6335a();

    /* renamed from: p */
    static final C6337c f11613p = new C6337c(200, 299, (C6335a) null);

    /* renamed from: f */
    private final C6336b f11614f;

    /* renamed from: g */
    private final int f11615g;

    /* renamed from: h */
    private final int f11616h;

    /* renamed from: i */
    private final int f11617i;

    /* renamed from: j */
    private final String f11618j;

    /* renamed from: k */
    private final String f11619k;

    /* renamed from: l */
    private final String f11620l;

    /* renamed from: m */
    private final String f11621m;

    /* renamed from: n */
    private final Object f11622n;

    /* renamed from: o */
    private final FacebookException f11623o;

    /* renamed from: com.facebook.FacebookRequestError$a */
    static class C6335a implements Parcelable.Creator<FacebookRequestError> {
        C6335a() {
        }

        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, (C6335a) null);
        }

        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    public enum C6336b {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$c */
    private static class C6337c {

        /* renamed from: a */
        private final int f11628a;

        /* renamed from: b */
        private final int f11629b;

        /* synthetic */ C6337c(int i, int i2, C6335a aVar) {
            this(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20823a(int i) {
            return this.f11628a <= i && i <= this.f11629b;
        }

        private C6337c(int i, int i2) {
            this.f11628a = i;
            this.f11629b = i2;
        }
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, C6335a aVar) {
        this(parcel);
    }

    /* renamed from: g */
    static synchronized C6430h m13063g() {
        synchronized (FacebookRequestError.class) {
            C6446m c = C6448n.m13386c(C4716f.m7697f());
            if (c == null) {
                C6430h a = C6430h.m13325a();
                return a;
            }
            C6430h c2 = c.mo20990c();
            return c2;
        }
    }

    /* renamed from: a */
    public int mo20812a() {
        return this.f11616h;
    }

    /* renamed from: b */
    public String mo20813b() {
        String str = this.f11619k;
        if (str != null) {
            return str;
        }
        return this.f11623o.getLocalizedMessage();
    }

    /* renamed from: c */
    public String mo20814c() {
        return this.f11618j;
    }

    /* renamed from: d */
    public FacebookException mo20815d() {
        return this.f11623o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo20817e() {
        return this.f11615g;
    }

    /* renamed from: f */
    public int mo20818f() {
        return this.f11617i;
    }

    public String toString() {
        return "{HttpStatus: " + this.f11615g + ", errorCode: " + this.f11616h + ", subErrorCode: " + this.f11617i + ", errorType: " + this.f11618j + ", errorMessage: " + mo20813b() + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11615g);
        parcel.writeInt(this.f11616h);
        parcel.writeInt(this.f11617i);
        parcel.writeString(this.f11618j);
        parcel.writeString(this.f11619k);
        parcel.writeString(this.f11620l);
        parcel.writeString(this.f11621m);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        boolean z2;
        C6336b bVar;
        this.f11615g = i;
        this.f11616h = i2;
        this.f11617i = i3;
        this.f11618j = str;
        this.f11619k = str2;
        this.f11622n = obj;
        this.f11620l = str3;
        this.f11621m = str4;
        if (facebookException != null) {
            this.f11623o = facebookException;
            z2 = true;
        } else {
            this.f11623o = new FacebookServiceException(this, str2);
            z2 = false;
        }
        C6430h g = m13063g();
        if (z2) {
            bVar = C6336b.OTHER;
        } else {
            bVar = g.mo20977a(i2, i3, z);
        }
        this.f11614f = bVar;
        g.mo20978a(bVar);
    }

    /* renamed from: a */
    static FacebookRequestError m13062a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        JSONObject jSONObject2 = jSONObject;
        try {
            if (jSONObject2.has("code")) {
                int i3 = jSONObject2.getInt("code");
                Object a = C6476x.m13483a(jSONObject2, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a;
                    boolean z2 = false;
                    if (jSONObject3.has("error")) {
                        JSONObject jSONObject4 = (JSONObject) C6476x.m13483a(jSONObject3, "error", (String) null);
                        String optString = jSONObject4.optString("type", (String) null);
                        String optString2 = jSONObject4.optString("message", (String) null);
                        i2 = jSONObject4.optInt("code", -1);
                        int optInt = jSONObject4.optInt("error_subcode", -1);
                        str2 = jSONObject4.optString("error_user_msg", (String) null);
                        str = jSONObject4.optString("error_user_title", (String) null);
                        z = jSONObject4.optBoolean("is_transient", false);
                        str4 = optString;
                        z2 = true;
                        int i4 = optInt;
                        str3 = optString2;
                        i = i4;
                    } else {
                        if (!jSONObject3.has("error_code")) {
                            if (!jSONObject3.has("error_msg")) {
                                if (!jSONObject3.has("error_reason")) {
                                    str4 = null;
                                    str3 = null;
                                    str2 = null;
                                    str = null;
                                    i2 = -1;
                                    i = -1;
                                    z = false;
                                }
                            }
                        }
                        String optString3 = jSONObject3.optString("error_reason", (String) null);
                        String optString4 = jSONObject3.optString("error_msg", (String) null);
                        int optInt2 = jSONObject3.optInt("error_code", -1);
                        i = jSONObject3.optInt("error_subcode", -1);
                        str4 = optString3;
                        str3 = optString4;
                        str2 = null;
                        str = null;
                        z2 = true;
                        z = false;
                        i2 = optInt2;
                    }
                    if (z2) {
                        return new FacebookRequestError(i3, i2, i, str4, str3, str, str2, z, jSONObject3, jSONObject, obj, httpURLConnection, (FacebookException) null);
                    }
                }
                if (!f11613p.mo20823a(i3)) {
                    return new FacebookRequestError(i3, -1, -1, (String) null, (String) null, (String) null, (String) null, false, jSONObject2.has("body") ? (JSONObject) C6476x.m13483a(jSONObject2, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, (FacebookException) null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FacebookRequestError(java.net.HttpURLConnection r17, java.lang.Exception r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.facebook.FacebookException
            if (r1 == 0) goto L_0x000a
            com.facebook.FacebookException r0 = (com.facebook.FacebookException) r0
            r15 = r0
            goto L_0x0010
        L_0x000a:
            com.facebook.FacebookException r1 = new com.facebook.FacebookException
            r1.<init>((java.lang.Throwable) r0)
            r15 = r1
        L_0x0010:
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = r16
            r14 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, (String) null, (String) null, false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null);
    }
}
