package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.utils.C12164i;

/* renamed from: kotlin.h0.u.e.k0.k.b */
/* compiled from: AbstractClassTypeConstructor */
public abstract class C11823b extends C11849h implements C11953s0 {

    /* renamed from: b */
    private int f31529b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11823b(C11817i iVar) {
        super(iVar);
        if (iVar != null) {
            this.f31529b = 0;
            return;
        }
        m38927a(0);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void m38927a(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = 3
            goto L_0x0018
        L_0x0017:
            r5 = 2
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "descriptor"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "hasMeaningfulFqName"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.C11823b.m38927a(int):void");
    }

    /* renamed from: a */
    private static boolean m38928a(C10342e eVar, C10342e eVar2) {
        if (!eVar.getName().equals(eVar2.getName())) {
            return false;
        }
        C10359m b = eVar.mo33762b();
        C10359m b2 = eVar2.mo33762b();
        while (b != null && b2 != null) {
            if (b instanceof C10393y) {
                return b2 instanceof C10393y;
            }
            if (b2 instanceof C10393y) {
                return false;
            }
            if (b instanceof C10240b0) {
                if (!(b2 instanceof C10240b0) || !((C10240b0) b).mo35425c().equals(((C10240b0) b2).mo35425c())) {
                    return false;
                }
                return true;
            } else if ((b2 instanceof C10240b0) || !b.getName().equals(b2.getName())) {
                return false;
            } else {
                b = b.mo33762b();
                b2 = b2.mo33762b();
            }
        }
        return true;
    }

    /* renamed from: b */
    public abstract C10342e mo33781b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11953s0) || obj.hashCode() != hashCode()) {
            return false;
        }
        C11953s0 s0Var = (C11953s0) obj;
        if (s0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        C10342e b = mo33781b();
        C10349h b2 = s0Var.mo33781b();
        if (!m38929a((C10349h) b) || ((b2 != null && !m38929a(b2)) || !(b2 instanceof C10342e))) {
            return false;
        }
        return m38928a(b, (C10342e) b2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11824b0 mo35467f() {
        if (C9333g.m30192e(mo33781b())) {
            return null;
        }
        return mo35232l().mo33707c();
    }

    public final int hashCode() {
        int i;
        int i2 = this.f31529b;
        if (i2 != 0) {
            return i2;
        }
        C10342e b = mo33781b();
        if (m38929a((C10349h) b)) {
            i = C9999c.m33680e(b).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.f31529b = i;
        return i;
    }

    /* renamed from: l */
    public C9333g mo35232l() {
        C9333g b = C10071a.m33892b((C10359m) mo33781b());
        if (b != null) {
            return b;
        }
        m38927a(1);
        throw null;
    }

    /* renamed from: a */
    private static boolean m38929a(C10349h hVar) {
        if (hVar != null) {
            return !C11958u.m39553a((C10359m) hVar) && !C9999c.m33693r(hVar);
        }
        m38927a(2);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<C11824b0> mo38434a(boolean z) {
        C10359m b = mo33781b().mo33762b();
        if (!(b instanceof C10342e)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m38927a(3);
            throw null;
        }
        C12164i iVar = new C12164i();
        C10342e eVar = (C10342e) b;
        iVar.add(eVar.mo35445o());
        C10342e O = eVar.mo33761O();
        if (z && O != null) {
            iVar.add(O.mo35445o());
        }
        return iVar;
    }
}
