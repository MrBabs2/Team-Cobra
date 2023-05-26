package p368r.p369a.p370g.p372t;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Timer;
import p368r.p369a.p370g.C11604c;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11611g;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11639l;
import p368r.p369a.p370g.p371s.C11666a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.t.c */
/* compiled from: Responder */
public class C11677c extends C11675a {

    /* renamed from: k */
    static C12938b f31236k = C12939c.m41778a(C11677c.class.getName());

    /* renamed from: g */
    private final C11604c f31237g;

    /* renamed from: h */
    private final InetAddress f31238h;

    /* renamed from: i */
    private final int f31239i;

    /* renamed from: j */
    private final boolean f31240j;

    public C11677c(C11639l lVar, C11604c cVar, InetAddress inetAddress, int i) {
        super(lVar);
        this.f31237g = cVar;
        this.f31238h = inetAddress;
        this.f31239i = i;
        this.f31240j = i != C11666a.f31110a;
    }

    /* renamed from: a */
    public void mo38219a(Timer timer) {
        boolean z = true;
        for (C11611g gVar : this.f31237g.mo37937l()) {
            if (f31236k.mo41314b()) {
                C12938b bVar = f31236k;
                bVar.mo41319d(mo38215b() + "start() question=" + gVar);
            }
            z = gVar.mo37967a(mo38214a());
            if (!z) {
                break;
            }
        }
        int i = 0;
        int nextInt = (!z || this.f31237g.mo37943r()) ? (C11639l.m38225W().nextInt(96) + 20) - this.f31237g.mo37913u() : 0;
        if (nextInt >= 0) {
            i = nextInt;
        }
        if (f31236k.mo41314b()) {
            C12938b bVar2 = f31236k;
            bVar2.mo41319d(mo38215b() + "start() Responder chosen delay=" + i);
        }
        if (!mo38214a().mo38086O() && !mo38214a().mo38085N()) {
            timer.schedule(this, (long) i);
        }
    }

    /* renamed from: b */
    public String mo38215b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Responder(");
        sb.append(mo38214a() != null ? mo38214a().mo38077F() : "");
        sb.append(")");
        return sb.toString();
    }

    public void run() {
        mo38214a().mo38105b(this.f31237g);
        HashSet<C11611g> hashSet = new HashSet<>();
        HashSet<C11620h> hashSet2 = new HashSet<>();
        if (mo38214a().mo38084M()) {
            try {
                for (C11611g gVar : this.f31237g.mo37937l()) {
                    if (f31236k.mo41309a()) {
                        C12938b bVar = f31236k;
                        bVar.mo41310b(mo38215b() + "run() JmDNS responding to: " + gVar);
                    }
                    if (this.f31240j) {
                        hashSet.add(gVar);
                    }
                    gVar.mo37965a(mo38214a(), hashSet2);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (C11620h hVar : this.f31237g.mo37928c()) {
                    if (hVar.mo37980c(currentTimeMillis)) {
                        hashSet2.remove(hVar);
                        if (f31236k.mo41309a()) {
                            C12938b bVar2 = f31236k;
                            bVar2.mo41310b(mo38215b() + "JmDNS Responder Known Answer Removed");
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    if (f31236k.mo41309a()) {
                        C12938b bVar3 = f31236k;
                        bVar3.mo41310b(mo38215b() + "run() JmDNS responding");
                    }
                    C11609f fVar = new C11609f(33792, !this.f31240j, this.f31237g.mo37914v());
                    if (this.f31240j) {
                        fVar.mo37946a(new InetSocketAddress(this.f31238h, this.f31239i));
                    }
                    fVar.mo37927b(this.f31237g.mo37931f());
                    for (C11611g gVar2 : hashSet) {
                        if (gVar2 != null) {
                            fVar = mo38211a(fVar, gVar2);
                        }
                    }
                    for (C11620h hVar2 : hashSet2) {
                        if (hVar2 != null) {
                            fVar = mo38210a(fVar, this.f31237g, hVar2);
                        }
                    }
                    if (!fVar.mo37939n()) {
                        mo38214a().mo38100a(fVar);
                    }
                }
            } catch (Throwable th) {
                C12938b bVar4 = f31236k;
                bVar4.mo41318c(mo38215b() + "run() exception ", th);
                mo38214a().close();
            }
        }
    }

    public String toString() {
        return super.toString() + " incomming: " + this.f31237g;
    }
}
