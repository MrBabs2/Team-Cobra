package com.facebook.internal.p168a0;

import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6368h;
import com.facebook.C6371i;
import com.facebook.GraphRequest;
import com.facebook.internal.C6437k;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.C6378b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;

/* renamed from: com.facebook.internal.a0.a */
/* compiled from: ExceptionAnalyzer */
public final class C6376a {

    /* renamed from: a */
    private static boolean f11736a = false;

    /* renamed from: com.facebook.internal.a0.a$a */
    /* compiled from: ExceptionAnalyzer */
    static class C6377a implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ C6378b f11737a;

        C6377a(C6378b bVar) {
            this.f11737a = bVar;
        }

        public void onCompleted(C6371i iVar) {
            try {
                if (iVar.mo20918a() == null && iVar.mo20919b().getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                    this.f11737a.mo20938a();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13226a() {
        f11736a = true;
        if (C4716f.m7700i()) {
            m13228b();
        }
    }

    /* renamed from: b */
    private static void m13228b() {
        if (!C6476x.m13541g()) {
            File[] b = C6385d.m13251b();
            ArrayList arrayList = new ArrayList();
            for (File a : b) {
                C6378b a2 = C6378b.C6380b.m13237a(a);
                if (a2.mo20939b()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", a2.toString());
                        arrayList.add(GraphRequest.m13074a((AccessToken) null, String.format("%s/instruments", new Object[]{C4716f.m7697f()}), jSONObject, (GraphRequest.C6344f) new C6377a(a2)));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new C6368h((Collection<GraphRequest>) arrayList).mo20904c();
            }
        }
    }

    /* renamed from: a */
    public static void m13227a(Throwable th) {
        if (f11736a) {
            HashSet hashSet = new HashSet();
            for (StackTraceElement className : th.getStackTrace()) {
                C6437k.C6441d a = C6437k.m13336a(className.getClassName());
                if (a != C6437k.C6441d.Unknown) {
                    C6437k.m13340b(a);
                    hashSet.add(a.toString());
                }
            }
            if (C4716f.m7700i() && !hashSet.isEmpty()) {
                C6378b.C6380b.m13239a(new JSONArray(hashSet)).mo20940c();
            }
        }
    }
}
