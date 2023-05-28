package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0;

import java.util.EnumMap;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9552e;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9555h;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.d */
/* compiled from: context.kt */
public final class C9416d {

    /* renamed from: a */
    private final EnumMap<C9405a.C9406a, C9555h> f26181a;

    public C9416d(EnumMap<C9405a.C9406a, C9555h> enumMap) {
        C10202j.m34178b(enumMap, "nullabilityQualifiers");
        this.f26181a = enumMap;
    }

    /* renamed from: a */
    public final EnumMap<C9405a.C9406a, C9555h> mo33883a() {
        return this.f26181a;
    }

    /* renamed from: a */
    public final C9550d mo33884a(C9405a.C9406a aVar) {
        C9555h hVar = this.f26181a.get(aVar);
        if (hVar == null) {
            return null;
        }
        C10202j.m34174a((Object) hVar, "nullabilityQualifiers[ap…ilityType] ?: return null");
        return new C9550d(hVar.mo34096a(), (C9552e) null, false, hVar.mo34098b());
    }
}
