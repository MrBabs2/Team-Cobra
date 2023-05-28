package kotlin.p219f0;

import java.util.Random;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\n"}, mo16641d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "implStorage", "kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.f0.b */
/* compiled from: PlatformRandom.kt */
public final class C9136b extends C9135a {

    /* renamed from: c */
    private final C9137a f25675c = new C9137a();

    /* renamed from: kotlin.f0.b$a */
    /* compiled from: PlatformRandom.kt */
    public static final class C9137a extends ThreadLocal<Random> {
        C9137a() {
        }

        /* access modifiers changed from: protected */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo33481c() {
        Object obj = this.f25675c.get();
        C10202j.m34174a(obj, "implStorage.get()");
        return (Random) obj;
    }
}
