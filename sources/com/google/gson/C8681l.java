package com.google.gson;

import com.google.gson.p191t.C8719g;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.gson.l */
/* compiled from: JsonObject */
public final class C8681l extends C8679j {

    /* renamed from: a */
    private final C8719g<String, C8679j> f24746a = new C8719g<>();

    /* renamed from: a */
    public void mo32338a(String str, C8679j jVar) {
        if (jVar == null) {
            jVar = C8680k.f24745a;
        }
        this.f24746a.put(str, jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8681l) && ((C8681l) obj).f24746a.equals(this.f24746a));
    }

    public int hashCode() {
        return this.f24746a.hashCode();
    }

    /* renamed from: j */
    public Set<Map.Entry<String, C8679j>> mo32341j() {
        return this.f24746a.entrySet();
    }
}
