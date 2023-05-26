package com.airbnb.lottie.p133s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.e */
/* compiled from: KeyPath */
public class C5726e {

    /* renamed from: a */
    private final List<String> f10245a;

    /* renamed from: b */
    private C5727f f10246b;

    public C5726e(String... strArr) {
        this.f10245a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public C5726e mo19549a(String str) {
        C5726e eVar = new C5726e(this);
        eVar.f10245a.add(str);
        return eVar;
    }

    /* renamed from: b */
    public int mo19552b(String str, int i) {
        if (m11039b(str)) {
            return 0;
        }
        if (!this.f10245a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f10245a.size() - 1 && this.f10245a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public boolean mo19553c(String str, int i) {
        if (m11039b(str)) {
            return true;
        }
        if (i >= this.f10245a.size()) {
            return false;
        }
        if (this.f10245a.get(i).equals(str) || this.f10245a.get(i).equals("**") || this.f10245a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo19554d(String str, int i) {
        if (!str.equals("__container") && i >= this.f10245a.size() - 1 && !this.f10245a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f10245a);
        sb.append(",resolved=");
        sb.append(this.f10246b != null);
        sb.append('}');
        return sb.toString();
    }

    private C5726e(C5726e eVar) {
        this.f10245a = new ArrayList(eVar.f10245a);
        this.f10246b = eVar.f10246b;
    }

    /* renamed from: a */
    public C5726e mo19548a(C5727f fVar) {
        C5726e eVar = new C5726e(this);
        eVar.f10246b = fVar;
        return eVar;
    }

    /* renamed from: b */
    private boolean m11039b(String str) {
        return str.equals("__container");
    }

    /* renamed from: a */
    public C5727f mo19550a() {
        return this.f10246b;
    }

    /* renamed from: b */
    private boolean m11038b() {
        List<String> list = this.f10245a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: a */
    public boolean mo19551a(String str, int i) {
        if (i >= this.f10245a.size()) {
            return false;
        }
        boolean z = i == this.f10245a.size() - 1;
        String str2 = this.f10245a.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if ((z || (i == this.f10245a.size() - 2 && m11038b())) && z2) {
                return true;
            }
            return false;
        }
        if (!z && this.f10245a.get(i + 1).equals(str)) {
            if (i == this.f10245a.size() - 2 || (i == this.f10245a.size() - 3 && m11038b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f10245a.size() - 1) {
                return false;
            }
            return this.f10245a.get(i2).equals(str);
        }
    }
}
