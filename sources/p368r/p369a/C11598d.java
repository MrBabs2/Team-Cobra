package p368r.p369a;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* renamed from: r.a.d */
/* compiled from: ServiceInfo */
public abstract class C11598d implements Cloneable {

    /* renamed from: f */
    public static final byte[] f30936f = new byte[0];

    /* renamed from: r.a.d$a */
    /* compiled from: ServiceInfo */
    public enum C11599a {
        Domain,
        Protocol,
        Application,
        Instance,
        Subtype
    }

    /* renamed from: a */
    public abstract boolean mo37851a(C11598d dVar);

    /* renamed from: b */
    public abstract String mo37852b();

    /* renamed from: c */
    public abstract String mo37853c();

    /* renamed from: e */
    public abstract Inet4Address[] mo37855e();

    /* renamed from: f */
    public abstract Inet6Address[] mo37856f();

    /* renamed from: g */
    public abstract InetAddress[] mo37857g();

    /* renamed from: h */
    public abstract String mo37858h();

    /* renamed from: i */
    public abstract int mo37859i();

    /* renamed from: j */
    public abstract int mo37860j();

    /* renamed from: k */
    public abstract String mo37861k();

    /* renamed from: l */
    public abstract String mo37862l();

    /* renamed from: m */
    public abstract String mo37863m();

    /* renamed from: n */
    public abstract String mo37864n();

    /* renamed from: q */
    public abstract byte[] mo37865q();

    /* renamed from: r */
    public abstract String mo37866r();

    /* renamed from: s */
    public abstract int mo37867s();

    /* renamed from: u */
    public abstract boolean mo37868u();

    /* renamed from: w */
    public abstract boolean mo37869w();

    public C11598d clone() {
        try {
            return (C11598d) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
