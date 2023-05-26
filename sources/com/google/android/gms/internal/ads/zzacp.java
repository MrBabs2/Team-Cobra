package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@zzard
public final class zzacp {

    /* renamed from: a */
    private final Collection<zzacj<?>> f17762a = new ArrayList();

    /* renamed from: b */
    private final Collection<zzacj<String>> f17763b = new ArrayList();

    /* renamed from: c */
    private final Collection<zzacj<String>> f17764c = new ArrayList();

    /* renamed from: a */
    public final void mo27159a(zzacj zzacj) {
        this.f17762a.add(zzacj);
    }

    /* renamed from: b */
    public final void mo27161b(zzacj<String> zzacj) {
        this.f17763b.add(zzacj);
    }

    /* renamed from: c */
    public final void mo27162c(zzacj<String> zzacj) {
        this.f17764c.add(zzacj);
    }

    /* renamed from: a */
    public final void mo27158a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzacj next : this.f17762a) {
            if (next.mo27155b() == 1) {
                next.mo26196a(editor, next.mo26195a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzbad.m20519b("Flag Json is null.");
        }
    }

    /* renamed from: b */
    public final List<String> mo27160b() {
        List<String> a = mo27157a();
        for (zzacj<String> a2 : this.f17764c) {
            String str = (String) zzyt.m25670e().mo27163a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final List<String> mo27157a() {
        ArrayList arrayList = new ArrayList();
        for (zzacj<String> a : this.f17763b) {
            String str = (String) zzyt.m25670e().mo27163a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
