package p120q.p121b.p359l.p361g;

import java.util.Arrays;
import p120q.p121b.p362m.C11569a;

/* renamed from: q.b.l.g.j */
/* compiled from: StackTraceInterface */
public class C11567j implements C11565h {

    /* renamed from: f */
    private final C11566i[] f30894f;

    /* renamed from: g */
    private final int f30895g;

    public C11567j(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2, C11569a[] aVarArr) {
        this.f30894f = C11566i.m37823a(stackTraceElementArr, aVarArr);
        int length = stackTraceElementArr.length - 1;
        int length2 = stackTraceElementArr2.length - 1;
        while (length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2])) {
            length--;
            length2--;
        }
        this.f30895g = (stackTraceElementArr.length - 1) - length;
    }

    /* renamed from: a */
    public int mo37785a() {
        return this.f30895g;
    }

    /* renamed from: b */
    public C11566i[] mo37786b() {
        C11566i[] iVarArr = this.f30894f;
        return (C11566i[]) Arrays.copyOf(iVarArr, iVarArr.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11567j.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f30894f, ((C11567j) obj).f30894f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f30894f);
    }

    public String toString() {
        return "StackTraceInterface{stackTrace=" + Arrays.toString(this.f30894f) + '}';
    }

    /* renamed from: y */
    public String mo37724y() {
        return "sentry.interfaces.Stacktrace";
    }
}
