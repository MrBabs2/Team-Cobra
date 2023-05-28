package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10354j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.a0 */
/* compiled from: PropertyGetterDescriptorImpl */
public class C10281a0 extends C10339y implements C10354j0 {

    /* renamed from: r */
    private C11824b0 f27962r;

    /* renamed from: s */
    private final C10354j0 f27963s;

    /* JADX WARNING: type inference failed for: r21v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.j0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10281a0(kotlin.reflect.jvm.internal.impl.descriptors.C10352i0 r13, kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g r14, kotlin.reflect.jvm.internal.impl.descriptors.C10388w r15, kotlin.reflect.jvm.internal.impl.descriptors.C10237a1 r16, boolean r17, boolean r18, boolean r19, kotlin.reflect.jvm.internal.impl.descriptors.C10238b.C10239a r20, kotlin.reflect.jvm.internal.impl.descriptors.C10354j0 r21, kotlin.reflect.jvm.internal.impl.descriptors.C10362n0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0067
            if (r14 == 0) goto L_0x0061
            if (r15 == 0) goto L_0x005b
            if (r16 == 0) goto L_0x0055
            if (r20 == 0) goto L_0x004f
            if (r22 == 0) goto L_0x0049
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<get-"
            r0.append(r1)
            kotlin.h0.u.e.k0.e.f r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.h0.u.e.k0.e.f r6 = kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f.m33304d(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L_0x0044
            r1 = r12
            r0 = r21
            goto L_0x0046
        L_0x0044:
            r0 = r12
            r1 = r0
        L_0x0046:
            r1.f27963s = r0
            return
        L_0x0049:
            r1 = r12
            r2 = 5
            m34351a((int) r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 4
            m34351a((int) r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 3
            m34351a((int) r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 2
            m34351a((int) r2)
            throw r0
        L_0x0061:
            r1 = r12
            r2 = 1
            m34351a((int) r2)
            throw r0
        L_0x0067:
            r1 = r12
            r2 = 0
            m34351a((int) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10281a0.<init>(kotlin.reflect.jvm.internal.impl.descriptors.i0, kotlin.reflect.jvm.internal.impl.descriptors.b1.g, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.a1, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.b$a, kotlin.reflect.jvm.internal.impl.descriptors.j0, kotlin.reflect.jvm.internal.impl.descriptors.n0):void");
    }

    /* renamed from: a */
    private static /* synthetic */ void m34351a(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: d */
    public Collection<? extends C10354j0> mo35406d() {
        Collection<C10350h0> a = super.mo35570a(true);
        if (a != null) {
            return a;
        }
        m34351a(6);
        throw null;
    }

    /* renamed from: f */
    public List<C10386v0> mo35407f() {
        List<C10386v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m34351a(7);
        throw null;
    }

    public C11824b0 getReturnType() {
        return this.f27962r;
    }

    /* renamed from: a */
    public void mo35453a(C11824b0 b0Var) {
        if (b0Var == null) {
            b0Var = mo35574l0().getType();
        }
        this.f27962r = b0Var;
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo35123a((C10354j0) this, d);
    }

    /* renamed from: a */
    public C10354j0 m34356a() {
        C10354j0 j0Var = this.f27963s;
        if (j0Var != null) {
            return j0Var;
        }
        m34351a(8);
        throw null;
    }
}
