package p120q.p121b.p359l.p361g;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import p120q.p121b.p362m.C11571b;

/* renamed from: q.b.l.g.g */
/* compiled from: SentryException */
public final class C11564g implements Serializable {

    /* renamed from: f */
    private final String f30881f;

    /* renamed from: g */
    private final String f30882g;

    /* renamed from: h */
    private final String f30883h;

    /* renamed from: i */
    private final C11567j f30884i;

    /* renamed from: j */
    private final C11560c f30885j;

    public C11564g(Throwable th, StackTraceElement[] stackTraceElementArr, C11560c cVar) {
        Package packageR = th.getClass().getPackage();
        String name = th.getClass().getName();
        this.f30881f = th.getMessage();
        if (packageR != null) {
            name = name.replace(packageR.getName() + ".", "");
        }
        this.f30882g = name;
        this.f30883h = packageR != null ? packageR.getName() : null;
        this.f30884i = new C11567j(th.getStackTrace(), stackTraceElementArr, C11571b.m37845a(th));
        this.f30885j = cVar;
    }

    /* renamed from: a */
    public static Deque<C11564g> m37815a(Throwable th) {
        C11560c cVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[0];
        while (th != null && hashSet.add(th)) {
            if (th instanceof C11561d) {
                C11561d dVar = (C11561d) th;
                cVar = dVar.mo37737a();
                th = dVar.mo37738b();
            } else {
                cVar = null;
            }
            arrayDeque.add(new C11564g(th, stackTraceElementArr, cVar));
            stackTraceElementArr = th.getStackTrace();
            th = th.getCause();
        }
        return arrayDeque;
    }

    /* renamed from: b */
    public C11560c mo37767b() {
        return this.f30885j;
    }

    /* renamed from: c */
    public String mo37768c() {
        return this.f30881f;
    }

    /* renamed from: d */
    public String mo37769d() {
        String str = this.f30883h;
        return str != null ? str : "(default)";
    }

    /* renamed from: e */
    public C11567j mo37770e() {
        return this.f30884i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11564g.class != obj.getClass()) {
            return false;
        }
        C11564g gVar = (C11564g) obj;
        if (!this.f30882g.equals(gVar.f30882g)) {
            return false;
        }
        String str = this.f30881f;
        if (str == null ? gVar.f30881f != null : !str.equals(gVar.f30881f)) {
            return false;
        }
        String str2 = this.f30883h;
        if (str2 == null ? gVar.f30883h != null : !str2.equals(gVar.f30883h)) {
            return false;
        }
        C11560c cVar = this.f30885j;
        if (cVar == null ? gVar.f30885j == null : cVar.equals(gVar.f30885j)) {
            return this.f30884i.equals(gVar.f30884i);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30881f;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f30882g.hashCode()) * 31;
        String str2 = this.f30883h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SentryException{exceptionMessage='" + this.f30881f + '\'' + ", exceptionClassName='" + this.f30882g + '\'' + ", exceptionPackageName='" + this.f30883h + '\'' + ", exceptionMechanism='" + this.f30885j + '\'' + ", stackTraceInterface=" + this.f30884i + '}';
    }

    /* renamed from: a */
    public String mo37766a() {
        return this.f30882g;
    }
}
