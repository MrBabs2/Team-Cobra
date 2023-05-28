package com.facebook.p032t.p181u;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C4716f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.u.i */
/* compiled from: InAppPurchaseEventManager */
class C6665i {

    /* renamed from: a */
    private static final HashMap<String, Method> f12413a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f12414b = new HashMap<>();

    /* renamed from: c */
    private static final String f12415c = C4716f.m7696e().getPackageName();

    /* renamed from: d */
    private static final SharedPreferences f12416d = C4716f.m7696e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    private static final SharedPreferences f12417e = C4716f.m7696e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: a */
    static Object m14210a(Context context, IBinder iBinder) {
        return m14211a(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
    }

    /* renamed from: b */
    private static Map<String, String> m14222b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = f12415c;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object a = m14211a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (a != null) {
                Bundle bundle2 = (Bundle) a;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                        }
                    }
                    m14218a((Map<String, String>) hashMap);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    private static Boolean m14224c(Context context, Object obj, String str) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Object a = m14211a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f12415c, str});
        if (a != null && ((Integer) a).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    static Map<String, String> m14216a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Map<String, String> b = m14223b(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!b.containsKey(next)) {
                arrayList2.add(next);
            }
        }
        b.putAll(m14222b(context, arrayList2, obj, z));
        return b;
    }

    /* renamed from: c */
    static ArrayList<String> m14225c(Context context, Object obj) {
        return m14215a(m14221b(context, obj, "subs"));
    }

    /* renamed from: a */
    private static void m14218a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = f12416d.edit();
        for (Map.Entry next : map.entrySet()) {
            edit.putString((String) next.getKey(), currentTimeMillis + ";" + ((String) next.getValue()));
        }
        edit.apply();
    }

    /* renamed from: a */
    static boolean m14219a(String str) {
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString == null || optString.isEmpty()) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static Map<String, String> m14223b(ArrayList<String> arrayList) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String string = f12416d.getString(next, (String) null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(next, split[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    static ArrayList<String> m14213a(Context context, Object obj) {
        Class<?> a;
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null || (a = m14209a(context, "com.android.vending.billing.IInAppBillingService")) == null || m14212a(a, "getPurchaseHistory") == null) {
            return arrayList;
        }
        return m14215a(m14214a(context, obj, "inapp"));
    }

    /* renamed from: b */
    static ArrayList<String> m14220b(Context context, Object obj) {
        return m14215a(m14221b(context, obj, "inapp"));
    }

    /* renamed from: a */
    private static ArrayList<String> m14214a(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        ArrayList<String> arrayList = new ArrayList<>();
        if (m14224c(context, obj, str).booleanValue()) {
            String str2 = null;
            int i = 0;
            boolean z = false;
            do {
                Object a = m14211a(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f12415c, str, str2, new Bundle()});
                if (a != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            } catch (JSONException unused) {
                            }
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30 || str2 == null) {
                            break;
                        }
                    }
                }
                str2 = null;
            } while (!z);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[EDGE_INSN: B:19:0x005c->B:17:0x005c ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.String> m14221b(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Boolean r1 = m14224c(r9, r10, r11)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005c
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = 0
        L_0x0016:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r1] = r7
            r7 = 1
            java.lang.String r8 = f12415c
            r5[r7] = r8
            r7 = 2
            r5[r7] = r11
            r5[r6] = r3
            java.lang.String r3 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r6 = "getPurchases"
            java.lang.Object r3 = m14211a(r9, r3, r6, r10, r5)
            if (r3 == 0) goto L_0x0055
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L_0x005c
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            r5 = 30
            if (r4 >= r5) goto L_0x005c
            if (r3 != 0) goto L_0x0016
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p181u.C6665i.m14221b(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: a */
    private static ArrayList<String> m14215a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor edit = f12417e.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject(next);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f12417e.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    /* renamed from: a */
    private static Method m14212a(Class<?> cls, String str) {
        Class<String> cls2 = String.class;
        Method method = f12413a.get(str);
        if (method != null) {
            return method;
        }
        Class[] clsArr = null;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c == 1) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, Bundle.class};
            } else if (c == 2) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2};
            } else if (c == 3) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, cls2};
            } else if (c == 4) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, cls2, Bundle.class};
            }
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            f12413a.put(str, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return method;
        }
    }

    /* renamed from: a */
    private static Class<?> m14209a(Context context, String str) {
        Class<?> cls = f12414b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            f12414b.put(str, cls);
            return cls;
        } catch (ClassNotFoundException unused) {
            return cls;
        }
    }

    /* renamed from: a */
    private static Object m14211a(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method a;
        Class<?> a2 = m14209a(context, str);
        if (a2 == null || (a = m14212a(a2, str2)) == null) {
            return null;
        }
        if (obj != null) {
            obj = a2.cast(obj);
        }
        try {
            return a.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m14217a() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j = f12416d.getLong("LAST_CLEARED_TIME", 0);
        if (j == 0) {
            f12416d.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        } else if (currentTimeMillis - j > 604800) {
            f12416d.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }
}
