package p368r.p369a.p370g.p372t.p373d;

import java.io.IOException;
import java.util.Timer;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11639l;
import p368r.p369a.p370g.p372t.C11675a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.t.d.a */
/* compiled from: DNSResolverTask */
public abstract class C11678a extends C11675a {

    /* renamed from: h */
    private static C12938b f31241h = C12939c.m41778a(C11678a.class.getName());

    /* renamed from: g */
    protected int f31242g = 0;

    public C11678a(C11639l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11609f mo38221a(C11609f fVar) throws IOException;

    /* renamed from: a */
    public void mo38222a(Timer timer) {
        if (!mo38214a().mo38086O() && !mo38214a().mo38085N()) {
            timer.schedule(this, 225, 225);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C11609f mo38223b(C11609f fVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo38224c();

    public void run() {
        try {
            if (!mo38214a().mo38086O()) {
                if (!mo38214a().mo38085N()) {
                    int i = this.f31242g;
                    this.f31242g = i + 1;
                    if (i < 3) {
                        if (f31241h.mo41309a()) {
                            C12938b bVar = f31241h;
                            bVar.mo41310b(mo38215b() + ".run() JmDNS " + mo38224c());
                        }
                        C11609f b = mo38223b(new C11609f(0));
                        if (mo38214a().mo38084M()) {
                            b = mo38221a(b);
                        }
                        if (!b.mo37939n()) {
                            mo38214a().mo38100a(b);
                            return;
                        }
                        return;
                    }
                    cancel();
                    return;
                }
            }
            cancel();
        } catch (Throwable th) {
            C12938b bVar2 = f31241h;
            bVar2.mo41318c(mo38215b() + ".run() exception ", th);
            mo38214a().mo38089R();
        }
    }

    public String toString() {
        return super.toString() + " count: " + this.f31242g;
    }
}
