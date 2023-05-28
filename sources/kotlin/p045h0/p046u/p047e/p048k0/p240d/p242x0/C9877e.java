package kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0;

import java.util.LinkedList;
import java.util.List;
import kotlin.C10480s;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9759b0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9772e0;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.h0.u.e.k0.d.x0.e */
/* compiled from: NameResolverImpl.kt */
public final class C9877e implements C9875c {

    /* renamed from: a */
    private final C9772e0 f27266a;

    /* renamed from: b */
    private final C9759b0 f27267b;

    public C9877e(C9772e0 e0Var, C9759b0 b0Var) {
        C10202j.m34178b(e0Var, "strings");
        C10202j.m34178b(b0Var, "qualifiedNames");
        this.f27266a = e0Var;
        this.f27267b = b0Var;
    }

    /* renamed from: c */
    private final C10480s<List<String>, List<String>, Boolean> m32870c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C9759b0.C9762c a = this.f27267b.mo34432a(i);
            C9772e0 e0Var = this.f27266a;
            C10202j.m34174a((Object) a, "proto");
            String a2 = e0Var.mo34450a(a.mo34440k());
            C9759b0.C9762c.C9765c i2 = a.mo34438i();
            if (i2 != null) {
                int i3 = C9876d.f27265a[i2.ordinal()];
                if (i3 == 1) {
                    linkedList2.addFirst(a2);
                } else if (i3 == 2) {
                    linkedList.addFirst(a2);
                } else if (i3 == 3) {
                    linkedList2.addFirst(a2);
                    z = true;
                }
                i = a.mo34439j();
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        return new C10480s<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public String mo34853a(int i) {
        C10480s<List<String>, List<String>, Boolean> c = m32870c(i);
        List a = c.mo35887a();
        String a2 = C10539w.m35773a(c.mo35888b(), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 62, (Object) null);
        if (a.isEmpty()) {
            return a2;
        }
        return C10539w.m35773a(a, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 62, (Object) null) + '/' + a2;
    }

    /* renamed from: b */
    public boolean mo34854b(int i) {
        return m32870c(i).mo35890d().booleanValue();
    }

    public String getString(int i) {
        String a = this.f27266a.mo34450a(i);
        C10202j.m34174a((Object) a, "strings.getString(index)");
        return a;
    }
}
