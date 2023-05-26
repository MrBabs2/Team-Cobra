package com.facebook.p032t.p177r.p178g;

import android.util.Log;

/* renamed from: com.facebook.t.r.g.e */
/* compiled from: UnityReflection */
public class C6638e {

    /* renamed from: a */
    private static final String f12364a = "com.facebook.t.r.g.e";

    /* renamed from: b */
    private static Class<?> f12365b;

    /* renamed from: a */
    public static void m14128a(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (f12365b == null) {
                f12365b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f12365b.getMethod("UnitySendMessage", new Class[]{cls, cls, cls}).invoke(f12365b, new Object[]{str, str2, str3});
        } catch (Exception e) {
            Log.e(f12364a, "Failed to send message to Unity", e);
        }
    }

    /* renamed from: a */
    public static void m14126a() {
        m14128a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: a */
    public static void m14127a(String str) {
        m14128a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }
}
