package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10370q0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.k.j */
/* compiled from: ClassTypeConstructorImpl */
public class C11900j extends C11823b implements C11953s0 {

    /* renamed from: c */
    private final C10342e f31612c;

    /* renamed from: d */
    private final List<C10375s0> f31613d;

    /* renamed from: e */
    private final Collection<C11824b0> f31614e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11900j(C10342e eVar, List<? extends C10375s0> list, Collection<C11824b0> collection, C11817i iVar) {
        super(iVar);
        if (eVar == null) {
            m39319a(0);
            throw null;
        } else if (list == null) {
            m39319a(1);
            throw null;
        } else if (collection == null) {
            m39319a(2);
            throw null;
        } else if (iVar != null) {
            this.f31612c = eVar;
            this.f31613d = Collections.unmodifiableList(new ArrayList(list));
            this.f31614e = Collections.unmodifiableCollection(collection);
        } else {
            m39319a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m39319a(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: c */
    public boolean mo33782c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Collection<C11824b0> mo33783e() {
        Collection<C11824b0> collection = this.f31614e;
        if (collection != null) {
            return collection;
        }
        m39319a(6);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C10370q0 mo33784g() {
        C10370q0.C10371a aVar = C10370q0.C10371a.f28177a;
        if (aVar != null) {
            return aVar;
        }
        m39319a(7);
        throw null;
    }

    public List<C10375s0> getParameters() {
        List<C10375s0> list = this.f31613d;
        if (list != null) {
            return list;
        }
        m39319a(4);
        throw null;
    }

    public String toString() {
        return C9999c.m33680e(this.f31612c).mo35006a();
    }

    /* renamed from: b */
    public C10342e m39321b() {
        C10342e eVar = this.f31612c;
        if (eVar != null) {
            return eVar;
        }
        m39319a(5);
        throw null;
    }
}
