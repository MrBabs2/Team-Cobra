package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10356k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.b0 */
/* compiled from: PropertySetterDescriptorImpl */
public class C10283b0 extends C10339y implements C10356k0 {

    /* renamed from: r */
    private C10386v0 f27964r;

    /* renamed from: s */
    private final C10356k0 f27965s;

    /* JADX WARNING: type inference failed for: r21v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.k0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10283b0(kotlin.reflect.jvm.internal.impl.descriptors.C10352i0 r13, kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g r14, kotlin.reflect.jvm.internal.impl.descriptors.C10388w r15, kotlin.reflect.jvm.internal.impl.descriptors.C10237a1 r16, boolean r17, boolean r18, boolean r19, kotlin.reflect.jvm.internal.impl.descriptors.C10238b.C10239a r20, kotlin.reflect.jvm.internal.impl.descriptors.C10356k0 r21, kotlin.reflect.jvm.internal.impl.descriptors.C10362n0 r22) {
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
            java.lang.String r1 = "<set-"
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
            r1.f27965s = r0
            return
        L_0x0049:
            r1 = r12
            r2 = 5
            m34365a((int) r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 4
            m34365a((int) r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 3
            m34365a((int) r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 2
            m34365a((int) r2)
            throw r0
        L_0x0061:
            r1 = r12
            r2 = 1
            m34365a((int) r2)
            throw r0
        L_0x0067:
            r1 = r12
            r2 = 0
            m34365a((int) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10283b0.<init>(kotlin.reflect.jvm.internal.impl.descriptors.i0, kotlin.reflect.jvm.internal.impl.descriptors.b1.g, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.a1, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.b$a, kotlin.reflect.jvm.internal.impl.descriptors.k0, kotlin.reflect.jvm.internal.impl.descriptors.n0):void");
    }

    /* renamed from: a */
    private static /* synthetic */ void m34365a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: d */
    public Collection<? extends C10356k0> mo35406d() {
        Collection<C10350h0> a = super.mo35570a(false);
        if (a != null) {
            return a;
        }
        m34365a(10);
        throw null;
    }

    /* renamed from: f */
    public List<C10386v0> mo35407f() {
        C10386v0 v0Var = this.f27964r;
        if (v0Var != null) {
            List<C10386v0> singletonList = Collections.singletonList(v0Var);
            if (singletonList != null) {
                return singletonList;
            }
            m34365a(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    public C11824b0 getReturnType() {
        C11901j0 E = C10071a.m33892b((C10359m) this).mo33695E();
        if (E != null) {
            return E;
        }
        m34365a(12);
        throw null;
    }

    /* renamed from: a */
    public void mo35454a(C10386v0 v0Var) {
        if (v0Var != null) {
            this.f27964r = v0Var;
        } else {
            m34365a(6);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10305i0 m34364a(C10356k0 k0Var, C11824b0 b0Var, C10249g gVar) {
        if (k0Var == null) {
            m34365a(7);
            throw null;
        } else if (b0Var == null) {
            m34365a(8);
            throw null;
        } else if (gVar != null) {
            return new C10305i0(k0Var, (C10386v0) null, 0, gVar, C9939f.m33304d("<set-?>"), b0Var, false, false, false, (C11824b0) null, C10362n0.f28175a);
        } else {
            m34365a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo35124a((C10356k0) this, d);
    }

    /* renamed from: a */
    public C10356k0 m34370a() {
        C10356k0 k0Var = this.f27965s;
        if (k0Var != null) {
            return k0Var;
        }
        m34365a(13);
        throw null;
    }
}
