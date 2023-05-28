package p415t.p417b.p420h;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p415t.p417b.p419g.C12946a;
import p415t.p417b.p419g.C12947b;
import p415t.p417b.p419g.C12948c;
import p415t.p417b.p419g.C12955j;

/* renamed from: t.b.h.a */
/* compiled from: SimpleLogger */
public class C12958a extends C12947b {

    /* renamed from: i */
    private static long f33244i = System.currentTimeMillis();

    /* renamed from: j */
    private static final Properties f33245j = new Properties();

    /* renamed from: k */
    private static boolean f33246k = false;

    /* renamed from: l */
    private static int f33247l = 20;

    /* renamed from: m */
    private static boolean f33248m = false;

    /* renamed from: n */
    private static String f33249n = null;

    /* renamed from: o */
    private static DateFormat f33250o = null;

    /* renamed from: p */
    private static boolean f33251p = true;

    /* renamed from: q */
    private static boolean f33252q = true;

    /* renamed from: r */
    private static boolean f33253r = false;

    /* renamed from: s */
    private static String f33254s = "System.err";

    /* renamed from: t */
    private static PrintStream f33255t = null;

    /* renamed from: u */
    private static boolean f33256u = false;

    /* renamed from: v */
    private static String f33257v = "WARN";

    /* renamed from: g */
    protected int f33258g = 20;

    /* renamed from: h */
    private transient String f33259h = null;

    /* renamed from: t.b.h.a$a */
    /* compiled from: SimpleLogger */
    static class C12959a implements PrivilegedAction<InputStream> {
        C12959a() {
        }

        public InputStream run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.getResourceAsStream("simplelogger.properties");
            }
            return ClassLoader.getSystemResourceAsStream("simplelogger.properties");
        }
    }

    C12958a(String str) {
        this.f33231f = str;
        String c = mo41356c();
        if (c != null) {
            this.f33258g = m41915g(c);
        } else {
            this.f33258g = f33247l;
        }
    }

    /* renamed from: a */
    private static String m41906a(String str, String str2) {
        String f = m41913f(str);
        return f == null ? str2 : f;
    }

    /* renamed from: d */
    private String m41910d() {
        String str = this.f33231f;
        return str.substring(str.lastIndexOf(".") + 1);
    }

    /* renamed from: e */
    private static PrintStream m41911e(String str) {
        if ("System.err".equalsIgnoreCase(str)) {
            return System.err;
        }
        if ("System.out".equalsIgnoreCase(str)) {
            return System.out;
        }
        try {
            return new PrintStream(new FileOutputStream(str));
        } catch (FileNotFoundException e) {
            C12955j.m41901a("Could not open [" + str + "]. Defaulting to System.err", e);
            return System.err;
        }
    }

    /* renamed from: f */
    private static String m41913f(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return str2 == null ? f33245j.getProperty(str) : str2;
    }

    /* renamed from: g */
    private static void m41916g() {
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new C12959a());
        if (inputStream != null) {
            try {
                f33245j.load(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public boolean mo41314b() {
        return mo41355a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo41356c() {
        String str = this.f33231f;
        int length = str.length();
        String str2 = null;
        while (str2 == null && length > -1) {
            str = str.substring(0, length);
            str2 = m41906a("org.slf4j.simpleLogger.log." + str, (String) null);
            length = String.valueOf(str).lastIndexOf(".");
        }
        return str2;
    }

    /* renamed from: a */
    private static boolean m41909a(String str, boolean z) {
        String f = m41913f(str);
        return f == null ? z : "true".equalsIgnoreCase(f);
    }

    /* renamed from: b */
    public void mo41311b(String str, Object obj) {
        m41907a(0, str, obj, (Object) null);
    }

    /* renamed from: d */
    public void mo41319d(String str) {
        m41908a(0, str, (Throwable) null);
    }

    /* renamed from: f */
    static void m41914f() {
        if (!f33246k) {
            f33246k = true;
            m41916g();
            String a = m41906a("org.slf4j.simpleLogger.defaultLogLevel", (String) null);
            if (a != null) {
                f33247l = m41915g(a);
            }
            f33252q = m41909a("org.slf4j.simpleLogger.showLogName", f33252q);
            f33253r = m41909a("org.slf4j.simpleLogger.showShortLogName", f33253r);
            f33248m = m41909a("org.slf4j.simpleLogger.showDateTime", f33248m);
            f33251p = m41909a("org.slf4j.simpleLogger.showThreadName", f33251p);
            f33249n = m41906a("org.slf4j.simpleLogger.dateTimeFormat", f33249n);
            f33256u = m41909a("org.slf4j.simpleLogger.levelInBrackets", f33256u);
            f33257v = m41906a("org.slf4j.simpleLogger.warnLevelString", f33257v);
            String a2 = m41906a("org.slf4j.simpleLogger.logFile", f33254s);
            f33254s = a2;
            f33255t = m41911e(a2);
            if (f33249n != null) {
                try {
                    f33250o = new SimpleDateFormat(f33249n);
                } catch (IllegalArgumentException e) {
                    C12955j.m41901a("Bad date format in simplelogger.properties; will output relative time", e);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo41310b(String str) {
        m41908a(10, str, (Throwable) null);
    }

    /* renamed from: d */
    public void mo41321d(String str, Throwable th) {
        m41908a(10, str, th);
    }

    /* renamed from: a */
    private void m41908a(int i, String str, Throwable th) {
        if (mo41355a(i)) {
            StringBuilder sb = new StringBuilder(32);
            if (f33248m) {
                if (f33250o != null) {
                    sb.append(m41912e());
                    sb.append(' ');
                } else {
                    sb.append(System.currentTimeMillis() - f33244i);
                    sb.append(' ');
                }
            }
            if (f33251p) {
                sb.append('[');
                sb.append(Thread.currentThread().getName());
                sb.append("] ");
            }
            if (f33256u) {
                sb.append('[');
            }
            if (i == 0) {
                sb.append("TRACE");
            } else if (i == 10) {
                sb.append("DEBUG");
            } else if (i == 20) {
                sb.append("INFO");
            } else if (i == 30) {
                sb.append(f33257v);
            } else if (i == 40) {
                sb.append("ERROR");
            }
            if (f33256u) {
                sb.append(']');
            }
            sb.append(' ');
            if (f33253r) {
                if (this.f33259h == null) {
                    this.f33259h = m41910d();
                }
                sb.append(String.valueOf(this.f33259h));
                sb.append(" - ");
            } else if (f33252q) {
                sb.append(String.valueOf(this.f33231f));
                sb.append(" - ");
            }
            sb.append(str);
            mo41354a(sb, th);
        }
    }

    /* renamed from: g */
    private static int m41915g(String str) {
        if ("trace".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("debug".equalsIgnoreCase(str)) {
            return 10;
        }
        if ("info".equalsIgnoreCase(str)) {
            return 20;
        }
        if (Malware.WARN.equalsIgnoreCase(str)) {
            return 30;
        }
        if ("error".equalsIgnoreCase(str)) {
            return 40;
        }
        return 20;
    }

    /* renamed from: b */
    public void mo41313b(String str, Throwable th) {
        m41908a(20, str, th);
    }

    /* renamed from: d */
    public void mo41320d(String str, Object obj) {
        m41907a(40, str, obj, (Object) null);
    }

    /* renamed from: b */
    public void mo41312b(String str, Object obj, Object obj2) {
        m41907a(30, str, obj, obj2);
    }

    /* renamed from: c */
    public void mo41316c(String str, Object obj) {
        m41907a(10, str, obj, (Object) null);
    }

    /* renamed from: c */
    public void mo41315c(String str) {
        m41908a(30, str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo41318c(String str, Throwable th) {
        m41908a(30, str, th);
    }

    /* renamed from: e */
    private String m41912e() {
        String format;
        Date date = new Date();
        synchronized (f33250o) {
            format = f33250o.format(date);
        }
        return format;
    }

    /* renamed from: c */
    public void mo41317c(String str, Object obj, Object obj2) {
        m41907a(40, str, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41354a(StringBuilder sb, Throwable th) {
        f33255t.println(sb.toString());
        if (th != null) {
            th.printStackTrace(f33255t);
        }
        f33255t.flush();
    }

    /* renamed from: a */
    private void m41907a(int i, String str, Object obj, Object obj2) {
        if (mo41355a(i)) {
            C12946a a = C12948c.m41833a(str, obj, obj2);
            m41908a(i, a.mo41334a(), a.mo41335b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41355a(int i) {
        return i >= this.f33258g;
    }

    /* renamed from: a */
    public boolean mo41309a() {
        return mo41355a(10);
    }

    /* renamed from: a */
    public void mo41307a(String str, Object obj, Object obj2) {
        m41907a(10, str, obj, obj2);
    }

    /* renamed from: a */
    public void mo41306a(String str, Object obj) {
        m41907a(30, str, obj, (Object) null);
    }

    /* renamed from: a */
    public void mo41305a(String str) {
        m41908a(40, str, (Throwable) null);
    }

    /* renamed from: a */
    public void mo41308a(String str, Throwable th) {
        m41908a(40, str, th);
    }
}
