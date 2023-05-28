package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11698e;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11764k;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11767l;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11768m;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11772o;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11777r;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11779s;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11783v;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9324a;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9399c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10232a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10265c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10274d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10266a;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10268b;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10269c;

/* renamed from: kotlin.h0.u.e.k0.i.b.f0.b */
/* compiled from: BuiltInsLoaderImpl.kt */
public final class C11710b implements C9324a {

    /* renamed from: b */
    private final C11714d f31306b = new C11714d();

    /* renamed from: kotlin.h0.u.e.k0.i.b.f0.b$a */
    /* compiled from: BuiltInsLoaderImpl.kt */
    static final /* synthetic */ class C11711a extends C10200h implements C9113l<String, InputStream> {
        C11711a(C11714d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final InputStream invoke(String str) {
            C10202j.m34178b(str, "p1");
            return ((C11714d) this.receiver).mo38289a(str);
        }

        public final String getName() {
            return "loadResource";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C11714d.class);
        }

        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    /* renamed from: a */
    public C10265c0 mo33687a(C11817i iVar, C10393y yVar, Iterable<? extends C10268b> iterable, C10269c cVar, C10266a aVar, boolean z) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(yVar, "builtInsModule");
        C10202j.m34178b(iterable, "classDescriptorFactories");
        C10202j.m34178b(cVar, "platformDependentDeclarationFilter");
        C10202j.m34178b(aVar, "additionalClassPartsProvider");
        Set<C9934b> set = C9333g.f25906j;
        C10202j.m34174a((Object) set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
        return mo38286a(iVar, yVar, set, iterable, cVar, aVar, z, new C11711a(this.f31306b));
    }

    /* renamed from: a */
    public final C10265c0 mo38286a(C11817i iVar, C10393y yVar, Set<C9934b> set, Iterable<? extends C10268b> iterable, C10269c cVar, C10266a aVar, boolean z, C9113l<? super String, ? extends InputStream> lVar) {
        C11817i iVar2 = iVar;
        C10393y yVar2 = yVar;
        Set<C9934b> set2 = set;
        C9113l<? super String, ? extends InputStream> lVar2 = lVar;
        C10202j.m34178b(iVar2, "storageManager");
        C10202j.m34178b(yVar2, "module");
        C10202j.m34178b(set2, "packageFqNames");
        C10202j.m34178b(iterable, "classDescriptorFactories");
        C10202j.m34178b(cVar, "platformDependentDeclarationFilter");
        C10202j.m34178b(aVar, "additionalClassPartsProvider");
        C10202j.m34178b(lVar2, "loadResource");
        ArrayList arrayList = new ArrayList(C10531p.m35750a(set2, 10));
        for (C9934b bVar : set) {
            String b = C11709a.f31305m.mo38285b(bVar);
            InputStream inputStream = (InputStream) lVar2.invoke(b);
            if (inputStream != null) {
                arrayList.add(C11712c.f31307q.mo38288a(bVar, iVar, yVar, inputStream, z));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + b);
            }
        }
        C10274d0 d0Var = r2;
        C10274d0 d0Var2 = new C10274d0(arrayList);
        C10232a0 a0Var = r1;
        C10232a0 a0Var2 = new C10232a0(iVar2, yVar2);
        C11768m.C11769a aVar2 = C11768m.C11769a.f31445a;
        C11772o oVar = r5;
        C11772o oVar2 = new C11772o(d0Var2);
        C11698e eVar = r7;
        C11698e eVar2 = new C11698e(yVar2, a0Var2, C11709a.f31305m);
        C11783v.C11784a aVar3 = C11783v.C11784a.f31470a;
        C11777r rVar = C11777r.f31464a;
        C10202j.m34174a((Object) rVar, "ErrorReporter.DO_NOTHING");
        ArrayList<C11712c> arrayList2 = arrayList;
        C10274d0 d0Var3 = d0Var2;
        C11767l lVar3 = r0;
        C11767l lVar4 = new C11767l(iVar, yVar, aVar2, oVar, eVar, d0Var, aVar3, rVar, C9399c.C9400a.f26127a, C11779s.C11780a.f31465a, iterable, a0Var, C11764k.f31425a.mo38350a(), aVar, cVar, C11709a.f31305m.mo16631e());
        for (C11712c a : arrayList2) {
            a.mo38384a(lVar3);
        }
        return d0Var3;
    }
}
