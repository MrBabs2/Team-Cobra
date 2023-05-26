package org.parceler;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.parceler.a */
/* compiled from: IdentityCollection */
public final class C12412a {

    /* renamed from: b */
    private static final Object f32188b = new Object();

    /* renamed from: a */
    private final List<Object> f32189a = new ArrayList();

    public C12412a() {
        mo40464b((Object) null);
    }

    /* renamed from: a */
    public boolean mo40463a(int i) {
        return i < this.f32189a.size();
    }

    /* renamed from: b */
    public int mo40464b(Object obj) {
        this.f32189a.add(obj);
        return this.f32189a.size() - 1;
    }

    /* renamed from: c */
    public boolean mo40466c(int i) {
        return this.f32189a.get(i) == f32188b;
    }

    /* renamed from: a */
    public int mo40460a() {
        return mo40464b(f32188b);
    }

    /* renamed from: a */
    public void mo40462a(int i, Object obj) {
        if (this.f32189a.size() > i) {
            this.f32189a.remove(i);
        }
        this.f32189a.add(i, obj);
    }

    /* renamed from: b */
    public <T> T mo40465b(int i) {
        return this.f32189a.get(i);
    }

    /* renamed from: a */
    public int mo40461a(Object obj) {
        for (int i = 0; i < this.f32189a.size(); i++) {
            if (this.f32189a.get(i) == obj) {
                return i;
            }
        }
        return -1;
    }
}
