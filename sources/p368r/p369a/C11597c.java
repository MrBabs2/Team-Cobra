package p368r.p369a;

import java.util.EventObject;

/* renamed from: r.a.c */
/* compiled from: ServiceEvent */
public abstract class C11597c extends EventObject implements Cloneable {
    public C11597c(Object obj) {
        super(obj);
    }

    /* renamed from: b */
    public abstract C11592a mo37846b();

    /* renamed from: c */
    public abstract C11598d mo37847c();

    /* renamed from: e */
    public abstract String mo37849e();

    /* renamed from: f */
    public abstract String mo37850f();

    public C11597c clone() {
        try {
            return (C11597c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
