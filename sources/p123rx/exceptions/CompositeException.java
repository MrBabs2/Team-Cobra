package p123rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: rx.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {

    /* renamed from: f */
    private final List<Throwable> f32225f;

    /* renamed from: g */
    private final String f32226g;

    /* renamed from: h */
    private Throwable f32227h;

    /* renamed from: rx.exceptions.CompositeException$a */
    static final class C12467a extends RuntimeException {
        C12467a() {
        }

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: rx.exceptions.CompositeException$b */
    static abstract class C12468b {
        C12468b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Object mo40651a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo40652a(Object obj);
    }

    /* renamed from: rx.exceptions.CompositeException$c */
    static final class C12469c extends C12468b {

        /* renamed from: a */
        private final PrintStream f32228a;

        C12469c(PrintStream printStream) {
            this.f32228a = printStream;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo40651a() {
            return this.f32228a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40652a(Object obj) {
            this.f32228a.println(obj);
        }
    }

    /* renamed from: rx.exceptions.CompositeException$d */
    static final class C12470d extends C12468b {

        /* renamed from: a */
        private final PrintWriter f32229a;

        C12470d(PrintWriter printWriter) {
            this.f32229a = printWriter;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo40651a() {
            return this.f32229a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40652a(Object obj) {
            this.f32229a.println(obj);
        }
    }

    @Deprecated
    public CompositeException(String str, Collection<? extends Throwable> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).mo40644a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.f32225f = Collections.unmodifiableList(arrayList);
        this.f32226g = this.f32225f.size() + " exceptions occurred. ";
    }

    /* renamed from: b */
    private Throwable m40925b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause.getCause();
        }
        return cause;
    }

    /* renamed from: a */
    public List<Throwable> mo40644a() {
        return this.f32225f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f32227h     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            rx.exceptions.CompositeException$a r0 = new rx.exceptions.CompositeException$a     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.f32225f     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.m40922a((java.lang.Throwable) r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.m40925b(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.f32227h = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.f32227h     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0064
        L_0x0063:
            throw r0
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public String getMessage() {
        return this.f32226g;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* renamed from: a */
    private void m40924a(C12468b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.f32225f) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m40923a(sb, a, "\t");
            i++;
        }
        synchronized (bVar.mo40651a()) {
            bVar.mo40652a(sb.toString());
        }
    }

    public void printStackTrace(PrintStream printStream) {
        m40924a((C12468b) new C12469c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m40924a((C12468b) new C12470d(printWriter));
    }

    /* renamed from: a */
    private void m40923a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m40923a(sb, th.getCause(), "");
        }
    }

    public CompositeException(Collection<? extends Throwable> collection) {
        this((String) null, collection);
    }

    public CompositeException(Throwable... thArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (thArr != null) {
            for (CompositeException compositeException : thArr) {
                if (compositeException instanceof CompositeException) {
                    linkedHashSet.addAll(compositeException.mo40644a());
                } else if (compositeException != null) {
                    linkedHashSet.add(compositeException);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.f32225f = Collections.unmodifiableList(arrayList);
        this.f32226g = this.f32225f.size() + " exceptions occurred. ";
    }

    /* renamed from: a */
    private List<Throwable> m40922a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause.getCause();
            }
        }
        return arrayList;
    }
}
