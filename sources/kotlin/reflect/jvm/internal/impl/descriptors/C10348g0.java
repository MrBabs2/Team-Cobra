package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.g0 */
/* compiled from: typeParameterUtils.kt */
public final class C10348g0 {

    /* renamed from: a */
    private final C10351i f28172a;

    /* renamed from: b */
    private final List<C11965u0> f28173b;

    /* renamed from: c */
    private final C10348g0 f28174c;

    public C10348g0(C10351i iVar, List<? extends C11965u0> list, C10348g0 g0Var) {
        C10202j.m34178b(iVar, "classifierDescriptor");
        C10202j.m34178b(list, "arguments");
        this.f28172a = iVar;
        this.f28173b = list;
        this.f28174c = g0Var;
    }

    /* renamed from: a */
    public final List<C11965u0> mo35600a() {
        return this.f28173b;
    }

    /* renamed from: b */
    public final C10351i mo35601b() {
        return this.f28172a;
    }

    /* renamed from: c */
    public final C10348g0 mo35602c() {
        return this.f28174c;
    }
}
