package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: com.facebook.k */
/* compiled from: LegacyTokenHelper */
final class C6493k {

    /* renamed from: c */
    private static final String f11972c = "k";

    /* renamed from: a */
    private String f11973a;

    /* renamed from: b */
    private SharedPreferences f11974b;

    public C6493k(Context context) {
        this(context, (String) null);
    }

    /* renamed from: c */
    public static String m13606c(Bundle bundle) {
        C6481y.m13556a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    /* renamed from: d */
    public static boolean m13607d(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo21070a() {
        this.f11974b.edit().clear().apply();
    }

    /* renamed from: b */
    public Bundle mo21071b() {
        Bundle bundle = new Bundle();
        for (String next : this.f11974b.getAll().keySet()) {
            try {
                m13604a(next, bundle);
            } catch (JSONException e) {
                C6494l lVar = C6494l.CACHE;
                String str = f11972c;
                C6460r.m13405a(lVar, 5, str, "Error reading cached value for key: '" + next + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public C6493k(Context context, String str) {
        C6481y.m13556a((Object) context, "context");
        this.f11973a = C6476x.m13533d(str) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        Context applicationContext = context.getApplicationContext();
        this.f11974b = (applicationContext != null ? applicationContext : context).getSharedPreferences(this.f11973a, 0);
    }

    /* renamed from: a */
    public static String m13602a(Bundle bundle) {
        C6481y.m13556a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    /* renamed from: a */
    static Date m13603a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j);
    }

    /* renamed from: a */
    private void m13604a(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f11974b.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        if (string.equals("bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean(DonationsAnalytics.VALUE));
            return;
        }
        int i = 0;
        if (string.equals("bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i < length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt(DonationsAnalytics.VALUE));
        } else if (string.equals("byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i < length2) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (string.equals("short")) {
            bundle.putShort(str, (short) jSONObject.getInt(DonationsAnalytics.VALUE));
        } else if (string.equals("short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i < length3) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt(DonationsAnalytics.VALUE));
        } else if (string.equals("int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i < length4) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (string.equals("long")) {
            bundle.putLong(str, jSONObject.getLong(DonationsAnalytics.VALUE));
        } else if (string.equals("long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i < length5) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble(DonationsAnalytics.VALUE));
        } else if (string.equals("float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i < length6) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble(DonationsAnalytics.VALUE));
        } else if (string.equals("double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i < length7) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (string.equals("char")) {
            String string2 = jSONObject.getString(DonationsAnalytics.VALUE);
            if (string2 != null && string2.length() == 1) {
                bundle.putChar(str, string2.charAt(0));
            }
        } else if (string.equals("char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i2 = 0; i2 < length8; i2++) {
                String string3 = jSONArray8.getString(i2);
                if (string3 != null && string3.length() == 1) {
                    cArr[i2] = string3.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString(DonationsAnalytics.VALUE));
        } else if (string.equals("stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray(DonationsAnalytics.VALUE);
            int length9 = jSONArray9.length();
            ArrayList arrayList = new ArrayList(length9);
            while (i < length9) {
                Object obj = jSONArray9.get(i);
                arrayList.add(i, obj == JSONObject.NULL ? null : (String) obj);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else if (string.equals("enum")) {
            try {
                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString(DonationsAnalytics.VALUE)));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    public static C6359c m13605b(Bundle bundle) {
        C6481y.m13556a((Object) bundle, "bundle");
        if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
            return (C6359c) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        }
        return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? C6359c.FACEBOOK_APPLICATION_WEB : C6359c.WEB_VIEW;
    }
}
