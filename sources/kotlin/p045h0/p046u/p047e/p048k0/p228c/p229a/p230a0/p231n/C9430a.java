package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9527n;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9529p;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9530q;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9641a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p391i0.C12079h;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.a */
/* compiled from: DeclaredMemberIndex.kt */
public class C9430a implements C9432b {

    /* renamed from: a */
    private final C9113l<C9530q, Boolean> f26206a = new C9431a(this);

    /* renamed from: b */
    private final Map<C9939f, List<C9530q>> f26207b;

    /* renamed from: c */
    private final Map<C9939f, C9527n> f26208c;

    /* renamed from: d */
    private final C9520g f26209d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9113l<C9529p, Boolean> f26210e;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.a$a */
    /* compiled from: DeclaredMemberIndex.kt */
    static final class C9431a extends C10203k implements C9113l<C9530q, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C9430a f26211f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9431a(C9430a aVar) {
            super(1);
            this.f26211f = aVar;
        }

        /* renamed from: a */
        public final boolean mo33912a(C9530q qVar) {
            C10202j.m34178b(qVar, "m");
            return ((Boolean) this.f26211f.f26210e.invoke(qVar)).booleanValue() && !C9641a.m31097a((C9529p) qVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo33912a((C9530q) obj));
        }
    }

    public C9430a(C9520g gVar, C9113l<? super C9529p, Boolean> lVar) {
        C10202j.m34178b(gVar, "jClass");
        C10202j.m34178b(lVar, "memberFilter");
        this.f26209d = gVar;
        this.f26210e = lVar;
        C12079h<T> a = C12090n.m39921a(C10539w.m35782b(this.f26209d.mo34034F()), this.f26206a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : a) {
            C9939f name = ((C9530q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f26207b = linkedHashMap;
        C12079h<T> a2 = C12090n.m39921a(C10539w.m35782b(this.f26209d.mo34041v()), this.f26210e);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (T next2 : a2) {
            linkedHashMap2.put(((C9527n) next2).getName(), next2);
        }
        this.f26208c = linkedHashMap2;
    }

    /* renamed from: b */
    public Collection<C9530q> mo33910b(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        List list = this.f26207b.get(fVar);
        return list != null ? list : C10529o.m35736a();
    }

    /* renamed from: a */
    public Set<C9939f> mo33908a() {
        C12079h<T> a = C12090n.m39921a(C10539w.m35782b(this.f26209d.mo34034F()), this.f26206a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T name : a) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public Set<C9939f> mo33911b() {
        C12079h<T> a = C12090n.m39921a(C10539w.m35782b(this.f26209d.mo34041v()), this.f26210e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T name : a) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public C9527n mo33909a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        return this.f26208c.get(fVar);
    }
}
