package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzard
public final class zzalh implements zzajq, zzalg {

    /* renamed from: f */
    private final zzalf f18173f;

    /* renamed from: g */
    private final HashSet<AbstractMap.SimpleEntry<String, zzaho<? super zzalf>>> f18174g = new HashSet<>();

    public zzalh(zzalf zzalf) {
        this.f18173f = zzalf;
    }

    /* renamed from: a */
    public final void mo25660a(String str) {
        this.f18173f.mo25660a(str);
    }

    /* renamed from: a */
    public final void mo26359a(String str, String str2) {
        zzajr.m19304a((zzajq) this, str, str2);
    }

    /* renamed from: a */
    public final void mo25665a(String str, Map map) {
        zzajr.m19305a((zzajq) this, str, map);
    }

    /* renamed from: a */
    public final void mo25666a(String str, JSONObject jSONObject) {
        zzajr.m19307b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo27357b(String str, zzaho<? super zzalf> zzaho) {
        this.f18173f.mo27357b(str, zzaho);
        this.f18174g.remove(new AbstractMap.SimpleEntry(str, zzaho));
    }

    /* renamed from: b */
    public final void mo25675b(String str, JSONObject jSONObject) {
        zzajr.m19306a((zzajq) this, str, jSONObject);
    }

    /* renamed from: n */
    public final void mo27369n() {
        Iterator<AbstractMap.SimpleEntry<String, zzaho<? super zzalf>>> it = this.f18174g.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((zzaho) next.getValue()).toString());
            zzawz.m20167e(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f18173f.mo27357b((String) next.getKey(), (zzaho) next.getValue());
        }
        this.f18174g.clear();
    }

    /* renamed from: a */
    public final void mo27355a(String str, zzaho<? super zzalf> zzaho) {
        this.f18173f.mo27355a(str, zzaho);
        this.f18174g.add(new AbstractMap.SimpleEntry(str, zzaho));
    }
}
