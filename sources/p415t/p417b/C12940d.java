package p415t.p417b;

import java.util.Map;
import p415t.p417b.p419g.C12951f;
import p415t.p417b.p419g.C12955j;
import p415t.p417b.p420h.C12962d;
import p415t.p417b.p421i.C12963a;

/* renamed from: t.b.d */
/* compiled from: MDC */
public class C12940d {

    /* renamed from: a */
    static C12963a f33214a;

    static {
        try {
            f33214a = m41797a();
        } catch (NoClassDefFoundError e) {
            f33214a = new C12951f();
            String message = e.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e;
            }
            C12955j.m41900a("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            C12955j.m41900a("Defaulting to no-operation MDCAdapter implementation.");
            C12955j.m41900a("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        } catch (Exception e2) {
            C12955j.m41901a("MDC binding unsuccessful.", e2);
        }
    }

    /* renamed from: a */
    private static C12963a m41797a() throws NoClassDefFoundError {
        try {
            return C12962d.m41941b().mo41360a();
        } catch (NoSuchMethodError unused) {
            return C12962d.f33265a.mo41360a();
        }
    }

    /* renamed from: b */
    public static void m41799b() {
        C12963a aVar = f33214a;
        if (aVar != null) {
            aVar.clear();
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: c */
    public static Map<String, String> m41800c() {
        C12963a aVar = f33214a;
        if (aVar != null) {
            return aVar.mo41337a();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: a */
    public static void m41798a(Map<String, String> map) {
        C12963a aVar = f33214a;
        if (aVar != null) {
            aVar.mo41338a(map);
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }
}
