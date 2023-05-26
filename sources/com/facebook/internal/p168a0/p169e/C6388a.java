package com.facebook.internal.p168a0.p169e;

import android.util.Log;
import com.facebook.C4716f;
import com.facebook.C6371i;
import com.facebook.GraphRequest;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.C6376a;
import com.facebook.internal.p168a0.C6378b;
import com.facebook.internal.p168a0.C6385d;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;

/* renamed from: com.facebook.internal.a0.e.a */
/* compiled from: CrashHandler */
public class C6388a implements Thread.UncaughtExceptionHandler {

    /* renamed from: g */
    private static final String f11752g = C6388a.class.getCanonicalName();

    /* renamed from: h */
    private static C6388a f11753h;

    /* renamed from: f */
    private final Thread.UncaughtExceptionHandler f11754f;

    /* renamed from: com.facebook.internal.a0.e.a$a */
    /* compiled from: CrashHandler */
    static class C6389a implements Comparator<C6378b> {
        C6389a() {
        }

        /* renamed from: a */
        public int compare(C6378b bVar, C6378b bVar2) {
            return bVar.mo20937a(bVar2);
        }
    }

    /* renamed from: com.facebook.internal.a0.e.a$b */
    /* compiled from: CrashHandler */
    static class C6390b implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ ArrayList f11755a;

        C6390b(ArrayList arrayList) {
            this.f11755a = arrayList;
        }

        public void onCompleted(C6371i iVar) {
            try {
                if (iVar.mo20918a() == null && iVar.mo20919b().getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                    for (int i = 0; this.f11755a.size() > i; i++) {
                        ((C6378b) this.f11755a.get(i)).mo20938a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C6388a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f11754f = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static synchronized void m13254a() {
        synchronized (C6388a.class) {
            if (C4716f.m7700i()) {
                m13255b();
            }
            if (f11753h != null) {
                Log.w(f11752g, "Already enabled!");
                return;
            }
            C6388a aVar = new C6388a(Thread.getDefaultUncaughtExceptionHandler());
            f11753h = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
        }
    }

    /* renamed from: b */
    private static void m13255b() {
        if (!C6476x.m13541g()) {
            File[] c = C6385d.m13253c();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (File a : c) {
                C6378b a2 = C6378b.C6380b.m13237a(a);
                if (a2.mo20939b()) {
                    arrayList.add(a2);
                }
            }
            Collections.sort(arrayList, new C6389a());
            JSONArray jSONArray = new JSONArray();
            while (i < arrayList.size() && i < 5) {
                jSONArray.put(arrayList.get(i));
                i++;
            }
            C6385d.m13248a("crash_reports", jSONArray, new C6390b(arrayList));
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (C6385d.m13252c(th)) {
            C6376a.m13227a(th);
            C6378b.C6380b.m13238a(th, C6378b.C6381c.CrashReport).mo20940c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11754f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
