package p368r.p369a.p370g;

import java.io.IOException;
import java.net.DatagramPacket;
import p368r.p369a.p370g.p371s.C11666a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.r */
/* compiled from: SocketListener */
class C11665r extends Thread {

    /* renamed from: g */
    static C12938b f31108g = C12939c.m41778a(C11665r.class.getName());

    /* renamed from: f */
    private final C11639l f31109f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11665r(p368r.p369a.p370g.C11639l r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SocketListener("
            r0.append(r1)
            if (r3 == 0) goto L_0x0011
            java.lang.String r1 = r3.mo38077F()
            goto L_0x0013
        L_0x0011:
            java.lang.String r1 = ""
        L_0x0013:
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r0 = 1
            r2.setDaemon(r0)
            r2.f31109f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11665r.<init>(r.a.g.l):void");
    }

    public void run() {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.f31109f.mo38086O() && !this.f31109f.mo38085N()) {
                datagramPacket.setLength(8972);
                this.f31109f.mo38080I().receive(datagramPacket);
                if (this.f31109f.mo38086O() || this.f31109f.mo38085N() || this.f31109f.mo38087P() || this.f31109f.isClosed()) {
                    break;
                }
                try {
                    if (!this.f31109f.mo38076E().mo38050a(datagramPacket)) {
                        C11604c cVar = new C11604c(datagramPacket);
                        if (cVar.mo37944s()) {
                            if (f31108g.mo41314b()) {
                                C12938b bVar = f31108g;
                                bVar.mo41319d(getName() + ".run() JmDNS in:" + cVar.mo37909a(true));
                            }
                            if (cVar.mo37941p()) {
                                if (datagramPacket.getPort() != C11666a.f31110a) {
                                    this.f31109f.mo38106b(cVar, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                this.f31109f.mo38106b(cVar, this.f31109f.mo38073B(), C11666a.f31110a);
                            } else {
                                this.f31109f.mo38097a(cVar);
                            }
                        } else if (f31108g.mo41309a()) {
                            C12938b bVar2 = f31108g;
                            bVar2.mo41310b(getName() + ".run() JmDNS in message with error code:" + cVar.mo37909a(true));
                        }
                    }
                } catch (IOException e) {
                    C12938b bVar3 = f31108g;
                    bVar3.mo41318c(getName() + ".run() exception ", (Throwable) e);
                }
            }
        } catch (IOException e2) {
            if (!this.f31109f.mo38086O() && !this.f31109f.mo38085N() && !this.f31109f.mo38087P() && !this.f31109f.isClosed()) {
                C12938b bVar4 = f31108g;
                bVar4.mo41318c(getName() + ".run() exception ", (Throwable) e2);
                this.f31109f.mo38089R();
            }
        }
        if (f31108g.mo41314b()) {
            C12938b bVar5 = f31108g;
            bVar5.mo41319d(getName() + ".run() exiting.");
        }
    }
}
