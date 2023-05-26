package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0;

import java.util.Map;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9490n;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9537w;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9538x;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11812d;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.utils.C12141a;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.i */
/* compiled from: resolvers.kt */
public final class C9423i implements C9428m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C9537w, Integer> f26196a;

    /* renamed from: b */
    private final C11812d<C9537w, C9490n> f26197b = this.f26198c.mo33896e().mo38406b(new C9424a(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9422h f26198c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10359m f26199d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f26200e;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.i$a */
    /* compiled from: resolvers.kt */
    static final class C9424a extends C10203k implements C9113l<C9537w, C9490n> {

        /* renamed from: f */
        final /* synthetic */ C9423i f26201f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9424a(C9423i iVar) {
            super(1);
            this.f26201f = iVar;
        }

        /* renamed from: a */
        public final C9490n invoke(C9537w wVar) {
            C10202j.m34178b(wVar, "typeParameter");
            Integer num = (Integer) this.f26201f.f26196a.get(wVar);
            if (num == null) {
                return null;
            }
            return new C9490n(C9409a.m30474a(this.f26201f.f26198c, (C9428m) this.f26201f), wVar, this.f26201f.f26200e + num.intValue(), this.f26201f.f26199d);
        }
    }

    public C9423i(C9422h hVar, C10359m mVar, C9538x xVar, int i) {
        C10202j.m34178b(hVar, "c");
        C10202j.m34178b(mVar, "containingDeclaration");
        C10202j.m34178b(xVar, "typeParameterOwner");
        this.f26198c = hVar;
        this.f26199d = mVar;
        this.f26200e = i;
        this.f26196a = C12141a.m40132a(xVar.getTypeParameters());
    }

    /* renamed from: a */
    public C10375s0 mo33899a(C9537w wVar) {
        C10202j.m34178b(wVar, "javaTypeParameter");
        C9490n invoke = this.f26197b.invoke(wVar);
        return invoke != null ? invoke : this.f26198c.mo33897f().mo33899a(wVar);
    }
}
