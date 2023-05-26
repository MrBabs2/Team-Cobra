package p120q.p121b.p357j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p120q.p121b.p359l.C11539a;
import p120q.p121b.p359l.C11550e;
import p120q.p121b.p359l.p361g.C11562e;
import p120q.p121b.p367q.C11589a;

/* renamed from: q.b.j.a */
/* compiled from: Context */
public class C11532a implements Serializable {

    /* renamed from: f */
    private volatile C11589a<C11539a> f30778f;

    /* renamed from: g */
    private volatile C11550e f30779g;

    /* renamed from: h */
    private volatile Map<String, String> f30780h;

    /* renamed from: i */
    private volatile Map<String, Object> f30781i;

    /* renamed from: j */
    private volatile C11562e f30782j;

    public C11532a() {
        this(100);
    }

    /* renamed from: a */
    public synchronized List<C11539a> mo37638a() {
        if (this.f30778f != null) {
            if (!this.f30778f.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f30778f.size());
                arrayList.addAll(this.f30778f);
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo37639a(UUID uuid) {
    }

    /* renamed from: b */
    public synchronized Map<String, Object> mo37640b() {
        if (this.f30781i != null) {
            if (!this.f30781i.isEmpty()) {
                return Collections.unmodifiableMap(this.f30781i);
            }
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public synchronized C11562e mo37641c() {
        return this.f30782j;
    }

    /* renamed from: d */
    public synchronized Map<String, String> mo37642d() {
        if (this.f30780h != null) {
            if (!this.f30780h.isEmpty()) {
                return Collections.unmodifiableMap(this.f30780h);
            }
        }
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public C11550e mo37643e() {
        return this.f30779g;
    }

    public C11532a(int i) {
    }
}
