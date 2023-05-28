package p415t.p417b.p419g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p415t.p417b.C12937a;
import p415t.p417b.C12938b;
import p415t.p417b.p418f.C12945d;

/* renamed from: t.b.g.i */
/* compiled from: SubstituteLoggerFactory */
public class C12954i implements C12937a {

    /* renamed from: a */
    boolean f33239a = false;

    /* renamed from: b */
    final Map<String, C12953h> f33240b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue<C12945d> f33241c = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public synchronized C12938b mo41304a(String str) {
        C12953h hVar;
        hVar = this.f33240b.get(str);
        if (hVar == null) {
            hVar = new C12953h(str, this.f33241c, this.f33239a);
            this.f33240b.put(str, hVar);
        }
        return hVar;
    }

    /* renamed from: b */
    public LinkedBlockingQueue<C12945d> mo41350b() {
        return this.f33241c;
    }

    /* renamed from: c */
    public List<C12953h> mo41351c() {
        return new ArrayList(this.f33240b.values());
    }

    /* renamed from: d */
    public void mo41352d() {
        this.f33239a = true;
    }

    /* renamed from: a */
    public void mo41349a() {
        this.f33240b.clear();
        this.f33241c.clear();
    }
}
