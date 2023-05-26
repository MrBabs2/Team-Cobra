package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10392x0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.j0 */
/* compiled from: VariableDescriptorImpl */
public abstract class C10310j0 extends C10311k implements C10392x0 {

    /* renamed from: j */
    protected C11824b0 f28022j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10310j0(C10359m mVar, C10249g gVar, C9939f fVar, C11824b0 b0Var, C10362n0 n0Var) {
        super(mVar, gVar, fVar, n0Var);
        if (mVar == null) {
            m34573a(0);
            throw null;
        } else if (gVar == null) {
            m34573a(1);
            throw null;
        } else if (fVar == null) {
            m34573a(2);
            throw null;
        } else if (n0Var != null) {
            this.f28022j = b0Var;
        } else {
            m34573a(3);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34573a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: A */
    public boolean mo34221A() {
        return false;
    }

    /* renamed from: X */
    public C10358l0 mo35403X() {
        return null;
    }

    /* renamed from: a */
    public <V> V mo34229a(C10230a.C10231a<V> aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo35492a(C11824b0 b0Var) {
        this.f28022j = b0Var;
    }

    /* renamed from: b0 */
    public C10358l0 mo35405b0() {
        return null;
    }

    /* renamed from: f */
    public List<C10386v0> mo35407f() {
        List<C10386v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34573a(6);
        throw null;
    }

    public C11824b0 getReturnType() {
        C11824b0 type = getType();
        if (type != null) {
            return type;
        }
        m34573a(9);
        throw null;
    }

    public C11824b0 getType() {
        C11824b0 b0Var = this.f28022j;
        if (b0Var != null) {
            return b0Var;
        }
        m34573a(4);
        throw null;
    }

    public List<C10375s0> getTypeParameters() {
        List<C10375s0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34573a(8);
        throw null;
    }

    public boolean isConst() {
        return false;
    }
}
