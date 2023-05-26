package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.m */
/* compiled from: FetchedAppSettings */
public final class C6446m {

    /* renamed from: a */
    private boolean f11849a;

    /* renamed from: b */
    private int f11850b;

    /* renamed from: c */
    private EnumSet<C6475w> f11851c;

    /* renamed from: d */
    private boolean f11852d;

    /* renamed from: e */
    private C6430h f11853e;

    /* renamed from: f */
    private boolean f11854f;

    /* renamed from: g */
    private boolean f11855g;

    /* renamed from: h */
    private String f11856h;

    /* renamed from: i */
    private JSONArray f11857i;

    /* renamed from: j */
    private boolean f11858j;

    /* renamed from: k */
    private String f11859k;

    /* renamed from: l */
    private String f11860l;

    /* renamed from: m */
    private String f11861m;

    public C6446m(boolean z, String str, boolean z2, int i, EnumSet<C6475w> enumSet, Map<String, Map<String, C6447a>> map, boolean z3, C6430h hVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        this.f11849a = z;
        this.f11853e = hVar;
        this.f11850b = i;
        this.f11852d = z3;
        this.f11851c = enumSet;
        this.f11854f = z4;
        this.f11855g = z5;
        this.f11857i = jSONArray;
        this.f11856h = str4;
        this.f11858j = z7;
        this.f11859k = str5;
        this.f11860l = str6;
        this.f11861m = str7;
    }

    /* renamed from: a */
    public boolean mo20988a() {
        return this.f11852d;
    }

    /* renamed from: b */
    public boolean mo20989b() {
        return this.f11855g;
    }

    /* renamed from: c */
    public C6430h mo20990c() {
        return this.f11853e;
    }

    /* renamed from: d */
    public JSONArray mo20991d() {
        return this.f11857i;
    }

    /* renamed from: e */
    public boolean mo20992e() {
        return this.f11854f;
    }

    /* renamed from: f */
    public boolean mo20993f() {
        return this.f11858j;
    }

    /* renamed from: g */
    public String mo20994g() {
        return this.f11859k;
    }

    /* renamed from: h */
    public String mo20995h() {
        return this.f11861m;
    }

    /* renamed from: i */
    public String mo20996i() {
        return this.f11856h;
    }

    /* renamed from: j */
    public int mo20997j() {
        return this.f11850b;
    }

    /* renamed from: k */
    public EnumSet<C6475w> mo20998k() {
        return this.f11851c;
    }

    /* renamed from: l */
    public String mo20999l() {
        return this.f11860l;
    }

    /* renamed from: m */
    public boolean mo21000m() {
        return this.f11849a;
    }

    /* renamed from: com.facebook.internal.m$a */
    /* compiled from: FetchedAppSettings */
    public static class C6447a {

        /* renamed from: a */
        private String f11862a;

        /* renamed from: b */
        private String f11863b;

        /* renamed from: c */
        private Uri f11864c;

        private C6447a(String str, String str2, Uri uri, int[] iArr) {
            this.f11862a = str;
            this.f11863b = str2;
            this.f11864c = uri;
        }

        /* renamed from: a */
        public static C6447a m13373a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (C6476x.m13533d(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C6476x.m13533d(str) || C6476x.m13533d(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!C6476x.m13533d(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C6447a(str, str2, uri, m13374a(jSONObject.optJSONArray("versions")));
        }

        /* renamed from: b */
        public String mo21002b() {
            return this.f11863b;
        }

        /* renamed from: a */
        private static int[] m13374a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C6476x.m13533d(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C6476x.m13507a("FacebookSDK", (Exception) e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        /* renamed from: a */
        public String mo21001a() {
            return this.f11862a;
        }
    }
}
