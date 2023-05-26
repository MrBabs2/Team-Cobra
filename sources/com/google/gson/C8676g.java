package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.g */
/* compiled from: JsonArray */
public final class C8676g extends C8679j implements Iterable<C8679j> {

    /* renamed from: f */
    private final List<C8679j> f24744f = new ArrayList();

    /* renamed from: a */
    public void mo32323a(C8679j jVar) {
        if (jVar == null) {
            jVar = C8680k.f24745a;
        }
        this.f24744f.add(jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8676g) && ((C8676g) obj).f24744f.equals(this.f24744f));
    }

    public int hashCode() {
        return this.f24744f.hashCode();
    }

    public Iterator<C8679j> iterator() {
        return this.f24744f.iterator();
    }
}
