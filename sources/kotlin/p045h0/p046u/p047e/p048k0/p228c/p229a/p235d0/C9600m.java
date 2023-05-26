package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9737u;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p262y.C10494b0;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.m */
/* compiled from: predefinedEnhancementInfo.kt */
final class C9600m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<String, C9585j> f26476a = new LinkedHashMap();

    /* renamed from: kotlin.h0.u.e.k0.c.a.d0.m$a */
    /* compiled from: predefinedEnhancementInfo.kt */
    public final class C9601a {

        /* renamed from: a */
        private final String f26477a;

        /* renamed from: b */
        final /* synthetic */ C9600m f26478b;

        public C9601a(C9600m mVar, String str) {
            C10202j.m34178b(str, "className");
            this.f26478b = mVar;
            this.f26477a = str;
        }

        /* renamed from: a */
        public final String mo34152a() {
            return this.f26477a;
        }

        /* renamed from: a */
        public final void mo34153a(String str, C9113l<? super C9602a, C10483v> lVar) {
            C10202j.m34178b(str, "name");
            C10202j.m34178b(lVar, "block");
            Map a = this.f26478b.f26476a;
            C9602a aVar = new C9602a(this, str);
            lVar.invoke(aVar);
            C10221n<String, C9585j> a2 = aVar.mo34154a();
            a.put(a2.mo35391c(), a2.mo35392d());
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.d0.m$a$a */
        /* compiled from: predefinedEnhancementInfo.kt */
        public final class C9602a {

            /* renamed from: a */
            private final List<C10221n<String, C9607r>> f26479a = new ArrayList();

            /* renamed from: b */
            private C10221n<String, C9607r> f26480b = C10481t.m35502a("V", null);

            /* renamed from: c */
            private final String f26481c;

            /* renamed from: d */
            final /* synthetic */ C9601a f26482d;

            public C9602a(C9601a aVar, String str) {
                C10202j.m34178b(str, "functionName");
                this.f26482d = aVar;
                this.f26481c = str;
            }

            /* renamed from: a */
            public final void mo34155a(String str, C9550d... dVarArr) {
                C9607r rVar;
                C10202j.m34178b(str, "type");
                C10202j.m34178b(dVarArr, "qualifiers");
                List<C10221n<String, C9607r>> list = this.f26479a;
                if (dVarArr.length == 0) {
                    rVar = null;
                } else {
                    Iterable<C10494b0> n = C10519k.m35656n(dVarArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(C10531p.m35750a(n, 10)), 16));
                    for (C10494b0 b0Var : n) {
                        linkedHashMap.put(Integer.valueOf(b0Var.mo35960c()), (C9550d) b0Var.mo35961d());
                    }
                    rVar = new C9607r(linkedHashMap);
                }
                list.add(C10481t.m35502a(str, rVar));
            }

            /* renamed from: b */
            public final void mo34157b(String str, C9550d... dVarArr) {
                C10202j.m34178b(str, "type");
                C10202j.m34178b(dVarArr, "qualifiers");
                Iterable<C10494b0> n = C10519k.m35656n(dVarArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(C10531p.m35750a(n, 10)), 16));
                for (C10494b0 b0Var : n) {
                    linkedHashMap.put(Integer.valueOf(b0Var.mo35960c()), (C9550d) b0Var.mo35961d());
                }
                this.f26480b = C10481t.m35502a(str, new C9607r(linkedHashMap));
            }

            /* renamed from: a */
            public final void mo34156a(C10081d dVar) {
                C10202j.m34178b(dVar, "type");
                this.f26480b = C10481t.m35502a(dVar.mo35287a(), null);
            }

            /* renamed from: a */
            public final C10221n<String, C9585j> mo34154a() {
                C9737u uVar = C9737u.f26706a;
                String a = this.f26482d.mo34152a();
                String str = this.f26481c;
                List<C10221n<String, C9607r>> list = this.f26479a;
                ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
                for (C10221n c : list) {
                    arrayList.add((String) c.mo35391c());
                }
                String a2 = uVar.mo34335a(a, uVar.mo34336a(str, arrayList, this.f26480b.mo35391c()));
                C9607r d = this.f26480b.mo35392d();
                List<C10221n<String, C9607r>> list2 = this.f26479a;
                ArrayList arrayList2 = new ArrayList(C10531p.m35750a(list2, 10));
                for (C10221n d2 : list2) {
                    arrayList2.add((C9607r) d2.mo35392d());
                }
                return C10481t.m35502a(a2, new C9585j(d, arrayList2));
            }
        }
    }

    /* renamed from: a */
    public final Map<String, C9585j> mo34151a() {
        return this.f26476a;
    }
}
