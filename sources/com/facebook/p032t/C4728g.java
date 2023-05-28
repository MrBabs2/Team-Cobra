package com.facebook.p032t;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;

/* renamed from: com.facebook.t.g */
/* compiled from: AppEventsLogger */
public class C4728g {

    /* renamed from: a */
    private C6584h f8018a;

    /* renamed from: com.facebook.t.g$a */
    /* compiled from: AppEventsLogger */
    public enum C4729a {
        AUTO,
        EXPLICIT_ONLY
    }

    private C4728g(Context context, String str, AccessToken accessToken) {
        this.f8018a = new C6584h(context, str, accessToken);
    }

    /* renamed from: a */
    public static void m7724a(Application application) {
        C6584h.m13966a(application, (String) null);
    }

    @Deprecated
    /* renamed from: a */
    public static void m7727a(Bundle bundle, GraphRequest.C6344f fVar) {
    }

    /* renamed from: b */
    public static C4728g m7729b(Context context) {
        return new C4728g(context, (String) null, (AccessToken) null);
    }

    /* renamed from: c */
    public static String m7731c() {
        return C6567b.m13928d();
    }

    /* renamed from: d */
    public static void m7732d() {
        C6584h.m13977h();
    }

    /* renamed from: a */
    public static void m7725a(Application application, String str) {
        C6584h.m13966a(application, str);
    }

    /* renamed from: b */
    public static C4729a m7728b() {
        return C6584h.m13973d();
    }

    /* renamed from: a */
    public static void m7726a(Context context, String str) {
        C6584h.m13967a(context, str);
    }

    /* renamed from: b */
    public static void m7730b(String str) {
        C6567b.m13926b(str);
    }

    /* renamed from: a */
    public void mo15778a(String str) {
        this.f8018a.mo21323a(str);
    }

    /* renamed from: a */
    public void mo15779a(String str, Bundle bundle) {
        this.f8018a.mo21325a(str, bundle);
    }

    /* renamed from: a */
    public void mo15777a() {
        this.f8018a.mo21322a();
    }

    /* renamed from: a */
    public static String m7723a(Context context) {
        return C6584h.m13965a(context);
    }
}
