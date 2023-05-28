package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import p050l.p063c.p064b.C4849a;
import p050l.p063c.p064b.C4850b;
import p050l.p063c.p064b.C4860d;
import p050l.p063c.p064b.C4862e;

/* renamed from: com.facebook.login.a */
/* compiled from: CustomTabPrefetchHelper */
public class C6519a extends C4860d {

    /* renamed from: f */
    private static C4850b f12069f;

    /* renamed from: g */
    private static C4862e f12070g;

    /* renamed from: a */
    public static void m13767a(Uri uri) {
        if (f12070g == null) {
            m13768b();
        }
        C4862e eVar = f12070g;
        if (eVar != null) {
            eVar.mo16899a(uri, (Bundle) null, (List<Bundle>) null);
        }
    }

    /* renamed from: b */
    private static void m13768b() {
        C4850b bVar;
        if (f12070g == null && (bVar = f12069f) != null) {
            f12070g = bVar.mo16879a((C4849a) null);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    /* renamed from: a */
    public static C4862e m13766a() {
        C4862e eVar = f12070g;
        f12070g = null;
        return eVar;
    }

    /* renamed from: a */
    public void mo16881a(ComponentName componentName, C4850b bVar) {
        f12069f = bVar;
        bVar.mo16880a(0);
        m13768b();
    }
}
