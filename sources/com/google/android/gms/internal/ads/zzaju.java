package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzard
public class zzaju<ReferenceT> implements zzajt {

    /* renamed from: f */
    private final Map<String, CopyOnWriteArrayList<zzaho<? super ReferenceT>>> f18147f = new HashMap();

    /* renamed from: g */
    private ReferenceT f18148g;

    /* renamed from: M */
    public final synchronized void mo27347M() {
        this.f18147f.clear();
    }

    /* renamed from: a */
    public final void mo27349a(ReferenceT referencet) {
        this.f18148g = referencet;
    }

    /* renamed from: b */
    public final boolean mo27346b(String str) {
        return str != null && mo27352a(Uri.parse(str));
    }

    /* renamed from: a */
    public final boolean mo27352a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        mo27353b(uri);
        return true;
    }

    /* renamed from: b */
    public final void mo27353b(Uri uri) {
        String path = uri.getPath();
        zzk.zzlg();
        m19309b(path, zzaxi.m20271a(uri));
    }

    /* renamed from: b */
    private final synchronized void m19309b(String str, Map<String, String> map) {
        if (zzbad.m20518a(2)) {
            String valueOf = String.valueOf(str);
            zzawz.m20167e(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str2).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str2);
                zzawz.m20167e(sb.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18147f.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                zzbbm.f18748a.execute(new C7269a1(this, (zzaho) it.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo27351a(String str, zzaho<? super ReferenceT> zzaho) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18147f.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f18147f.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzaho);
    }

    /* renamed from: a */
    public final synchronized void mo27350a(String str, Predicate<zzaho<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18147f.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                zzaho zzaho = (zzaho) it.next();
                if (predicate.apply(zzaho)) {
                    arrayList.add(zzaho);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: b */
    public final synchronized void mo27354b(String str, zzaho<? super ReferenceT> zzaho) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18147f.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(zzaho);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27348a(zzaho zzaho, Map map) {
        zzaho.mo25559a(this.f18148g, map);
    }
}
