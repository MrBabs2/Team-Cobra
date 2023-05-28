package com.facebook.internal.p168a0.p171g;

import com.facebook.C4716f;
import com.facebook.C6371i;
import com.facebook.GraphRequest;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.C6385d;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;

/* renamed from: com.facebook.internal.a0.g.b */
/* compiled from: ErrorReportHandler */
public final class C6393b {

    /* renamed from: com.facebook.internal.a0.g.b$a */
    /* compiled from: ErrorReportHandler */
    static class C6394a implements Comparator<C6392a> {
        C6394a() {
        }

        /* renamed from: a */
        public int compare(C6392a aVar, C6392a aVar2) {
            return aVar.mo20949a(aVar2);
        }
    }

    /* renamed from: com.facebook.internal.a0.g.b$b */
    /* compiled from: ErrorReportHandler */
    static class C6395b implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ ArrayList f11761a;

        C6395b(ArrayList arrayList) {
            this.f11761a = arrayList;
        }

        public void onCompleted(C6371i iVar) {
            try {
                if (iVar.mo20918a() == null && iVar.mo20919b().getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                    for (int i = 0; this.f11761a.size() > i; i++) {
                        ((C6392a) this.f11761a.get(i)).mo20950a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.facebook.internal.a0.g.b$c */
    /* compiled from: ErrorReportHandler */
    static class C6396c implements FilenameFilter {
        C6396c() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"error_log_"}));
        }
    }

    /* renamed from: a */
    public static void m13267a(String str) {
        try {
            new C6392a(str).mo20953d();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static File[] m13268b() {
        File a = C6385d.m13244a();
        if (a == null) {
            return new File[0];
        }
        return a.listFiles(new C6396c());
    }

    /* renamed from: c */
    public static void m13269c() {
        if (!C6476x.m13541g()) {
            File[] b = m13268b();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (File aVar : b) {
                C6392a aVar2 = new C6392a(aVar);
                if (aVar2.mo20952c()) {
                    arrayList.add(aVar2);
                }
            }
            Collections.sort(arrayList, new C6394a());
            JSONArray jSONArray = new JSONArray();
            while (i < arrayList.size() && i < 1000) {
                jSONArray.put(arrayList.get(i));
                i++;
            }
            C6385d.m13248a("error_reports", jSONArray, new C6395b(arrayList));
        }
    }

    /* renamed from: a */
    public static void m13266a() {
        if (C4716f.m7700i()) {
            m13269c();
        }
    }
}
