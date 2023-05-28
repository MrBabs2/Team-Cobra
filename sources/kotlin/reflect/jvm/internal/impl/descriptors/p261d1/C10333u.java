package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.u */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C10333u implements C10332t {

    /* renamed from: a */
    private final List<C10334v> f28105a;

    /* renamed from: b */
    private final Set<C10334v> f28106b;

    /* renamed from: c */
    private final List<C10334v> f28107c;

    public C10333u(List<C10334v> list, Set<C10334v> set, List<C10334v> list2) {
        C10202j.m34178b(list, "allDependencies");
        C10202j.m34178b(set, "modulesWhoseInternalsAreVisible");
        C10202j.m34178b(list2, "expectedByDependencies");
        this.f28105a = list;
        this.f28106b = set;
        this.f28107c = list2;
    }

    /* renamed from: a */
    public List<C10334v> mo35547a() {
        return this.f28105a;
    }

    /* renamed from: b */
    public List<C10334v> mo35548b() {
        return this.f28107c;
    }

    /* renamed from: c */
    public Set<C10334v> mo35549c() {
        return this.f28106b;
    }
}
