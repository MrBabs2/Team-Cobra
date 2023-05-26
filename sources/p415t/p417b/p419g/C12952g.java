package p415t.p417b.p419g;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: t.b.g.g */
/* compiled from: NamedLoggerBase */
abstract class C12952g implements C12938b, Serializable {

    /* renamed from: f */
    protected String f33231f;

    C12952g() {
    }

    public String getName() {
        return this.f33231f;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() throws ObjectStreamException {
        return C12939c.m41778a(getName());
    }
}
