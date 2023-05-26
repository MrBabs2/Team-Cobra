package p120q.p121b.p359l.p361g;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import p120q.p121b.p362m.C11569a;

/* renamed from: q.b.l.g.i */
/* compiled from: SentryStackTraceElement */
public class C11566i implements Serializable {

    /* renamed from: f */
    private final String f30886f;

    /* renamed from: g */
    private final String f30887g;

    /* renamed from: h */
    private final String f30888h;

    /* renamed from: i */
    private final int f30889i;

    /* renamed from: j */
    private final Integer f30890j;

    /* renamed from: k */
    private final String f30891k;

    /* renamed from: l */
    private final String f30892l;

    /* renamed from: m */
    private final Map<String, Object> f30893m;

    public C11566i(String str, String str2, String str3, int i, Integer num, String str4, String str5, Map<String, Object> map) {
        this.f30886f = str;
        this.f30887g = str2;
        this.f30888h = str3;
        this.f30889i = i;
        this.f30890j = num;
        this.f30891k = str4;
        this.f30892l = str5;
        this.f30893m = map;
    }

    /* renamed from: a */
    public String mo37774a() {
        return this.f30891k;
    }

    /* renamed from: b */
    public Integer mo37775b() {
        return this.f30890j;
    }

    /* renamed from: c */
    public String mo37776c() {
        return this.f30888h;
    }

    /* renamed from: d */
    public String mo37777d() {
        return this.f30887g;
    }

    /* renamed from: e */
    public int mo37778e() {
        return this.f30889i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11566i.class != obj.getClass()) {
            return false;
        }
        C11566i iVar = (C11566i) obj;
        if (this.f30889i != iVar.f30889i || !C4757h.m7801a(this.f30886f, iVar.f30886f) || !C4757h.m7801a(this.f30887g, iVar.f30887g) || !C4757h.m7801a(this.f30888h, iVar.f30888h) || !C4757h.m7801a(this.f30890j, iVar.f30890j) || !C4757h.m7801a(this.f30891k, iVar.f30891k) || !C4757h.m7801a(this.f30892l, iVar.f30892l) || !C4757h.m7801a(this.f30893m, iVar.f30893m)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Map<String, Object> mo37780f() {
        return this.f30893m;
    }

    /* renamed from: g */
    public String mo37781g() {
        return this.f30886f;
    }

    /* renamed from: h */
    public String mo37782h() {
        return this.f30892l;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30886f, this.f30887g, this.f30888h, Integer.valueOf(this.f30889i), this.f30890j, this.f30891k, this.f30892l, this.f30893m});
    }

    public String toString() {
        return "SentryStackTraceElement{module='" + this.f30886f + '\'' + ", function='" + this.f30887g + '\'' + ", fileName='" + this.f30888h + '\'' + ", lineno=" + this.f30889i + ", colno=" + this.f30890j + ", absPath='" + this.f30891k + '\'' + ", platform='" + this.f30892l + '\'' + ", locals='" + this.f30893m + '\'' + '}';
    }

    /* renamed from: a */
    public static C11566i[] m37823a(StackTraceElement[] stackTraceElementArr, C11569a[] aVarArr) {
        C11566i[] iVarArr = new C11566i[stackTraceElementArr.length];
        int i = 0;
        int i2 = 0;
        while (i < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            Map<String, Object> map = null;
            if (aVarArr != null) {
                while (i2 < aVarArr.length && !stackTraceElement.getMethodName().equals(aVarArr[i2].mo37799b().getName())) {
                    i2++;
                }
                if (i2 < aVarArr.length) {
                    map = aVarArr[i2].mo37798a();
                }
            }
            iVarArr[i] = m37822a(stackTraceElement, map);
            i++;
            i2++;
        }
        return iVarArr;
    }

    /* renamed from: a */
    private static C11566i m37822a(StackTraceElement stackTraceElement, Map<String, Object> map) {
        return new C11566i(stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), (Integer) null, (String) null, (String) null, map);
    }
}
