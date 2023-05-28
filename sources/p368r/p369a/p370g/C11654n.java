package p368r.p369a.p370g;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: r.a.g.n */
/* compiled from: NameRegister */
public interface C11654n {

    /* renamed from: r.a.g.n$a */
    /* compiled from: NameRegister */
    static /* synthetic */ class C11655a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31079a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r.a.g.n$d[] r0 = p368r.p369a.p370g.C11654n.C11658d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31079a = r0
                r.a.g.n$d r1 = p368r.p369a.p370g.C11654n.C11658d.HOST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31079a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.a.g.n$d r1 = p368r.p369a.p370g.C11654n.C11658d.SERVICE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11654n.C11655a.<clinit>():void");
        }
    }

    /* renamed from: r.a.g.n$b */
    /* compiled from: NameRegister */
    public static abstract class C11656b implements C11654n {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo38155a(String str) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int indexOf = str.indexOf(".local.");
            int lastIndexOf = str.lastIndexOf(45);
            int i = 1;
            if (lastIndexOf < 0) {
                sb.append(str.substring(0, indexOf));
            } else {
                try {
                    int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1, indexOf)) + 1;
                    sb.append(str.substring(0, lastIndexOf));
                    i = parseInt;
                } catch (Exception unused) {
                    sb.append(str.substring(0, indexOf));
                }
            }
            sb.append('-');
            sb.append(i);
            sb.append(".local.");
            return sb.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo38156b(String str) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int lastIndexOf = str.lastIndexOf(40);
            int lastIndexOf2 = str.lastIndexOf(41);
            if (lastIndexOf < 0 || lastIndexOf >= lastIndexOf2) {
                sb.append(str);
                sb.append(" (2)");
            } else {
                try {
                    sb.append(str.substring(0, lastIndexOf));
                    sb.append('(');
                    sb.append(Integer.parseInt(str.substring(lastIndexOf + 1, lastIndexOf2)) + 1);
                    sb.append(')');
                } catch (NumberFormatException unused) {
                    sb.setLength(0);
                    sb.append(str);
                    sb.append(" (2)");
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: r.a.g.n$c */
    /* compiled from: NameRegister */
    public static class C11657c {

        /* renamed from: a */
        private static volatile C11654n f31080a;

        /* renamed from: a */
        public static C11654n m38310a() {
            if (f31080a == null) {
                f31080a = new C11659e();
            }
            return f31080a;
        }
    }

    /* renamed from: r.a.g.n$d */
    /* compiled from: NameRegister */
    public enum C11658d {
        HOST,
        SERVICE
    }

    /* renamed from: r.a.g.n$e */
    /* compiled from: NameRegister */
    public static class C11659e extends C11656b {
        public C11659e() {
            new ConcurrentHashMap();
            new ConcurrentHashMap();
        }

        /* renamed from: a */
        public String mo38154a(InetAddress inetAddress, String str, C11658d dVar) {
            int i = C11655a.f31079a[dVar.ordinal()];
            if (i == 1) {
                return mo38155a(str);
            }
            if (i != 2) {
                return str;
            }
            return mo38156b(str);
        }
    }

    /* renamed from: a */
    String mo38154a(InetAddress inetAddress, String str, C11658d dVar);
}
