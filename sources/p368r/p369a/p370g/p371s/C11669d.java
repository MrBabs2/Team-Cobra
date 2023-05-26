package p368r.p369a.p370g.p371s;

import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.s.d */
/* compiled from: DNSRecordClass */
public enum C11669d {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", 254),
    CLASS_ANY("any", 255);
    

    /* renamed from: n */
    private static C12938b f31131n;

    /* renamed from: f */
    private final int f31133f;

    static {
        f31131n = C12939c.m41778a(C11669d.class.getName());
    }

    private C11669d(String str, int i) {
        this.f31133f = i;
    }

    /* renamed from: b */
    public static C11669d m38378b(int i) {
        int i2 = i & 32767;
        for (C11669d dVar : values()) {
            if (dVar.f31133f == i2) {
                return dVar;
            }
        }
        f31131n.mo41315c("Could not find record class for index: " + i);
        return CLASS_UNKNOWN;
    }

    /* renamed from: a */
    public int mo38193a() {
        return this.f31133f;
    }

    public String toString() {
        return name() + " index " + mo38193a();
    }

    /* renamed from: a */
    public boolean mo38194a(int i) {
        return (this == CLASS_UNKNOWN || (i & 32768) == 0) ? false : true;
    }
}
