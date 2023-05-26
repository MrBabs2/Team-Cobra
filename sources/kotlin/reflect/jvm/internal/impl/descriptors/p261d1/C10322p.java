package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10113b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11945p;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10392x0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10254i;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10305i0;
import kotlin.reflect.jvm.internal.impl.utils.C12164i;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.p */
/* compiled from: FunctionDescriptorImpl */
public abstract class C10322p extends C10311k implements C10382u {

    /* renamed from: A */
    private boolean f28039A;

    /* renamed from: B */
    private boolean f28040B;

    /* renamed from: C */
    private Collection<? extends C10382u> f28041C;

    /* renamed from: D */
    private volatile C9102a<Collection<C10382u>> f28042D;

    /* renamed from: E */
    private final C10382u f28043E;

    /* renamed from: F */
    private final C10238b.C10239a f28044F;

    /* renamed from: G */
    private C10382u f28045G;

    /* renamed from: H */
    protected Map<C10230a.C10231a<?>, Object> f28046H;

    /* renamed from: j */
    private List<C10375s0> f28047j;

    /* renamed from: k */
    private List<C10386v0> f28048k;

    /* renamed from: l */
    private C11824b0 f28049l;

    /* renamed from: m */
    private C10358l0 f28050m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C10358l0 f28051n;

    /* renamed from: o */
    private C10388w f28052o;

    /* renamed from: p */
    private C10237a1 f28053p;

    /* renamed from: q */
    private boolean f28054q;

    /* renamed from: r */
    private boolean f28055r;

    /* renamed from: s */
    private boolean f28056s;

    /* renamed from: t */
    private boolean f28057t;

    /* renamed from: u */
    private boolean f28058u;

    /* renamed from: v */
    private boolean f28059v;

    /* renamed from: w */
    private boolean f28060w;

    /* renamed from: x */
    private boolean f28061x;

    /* renamed from: y */
    private boolean f28062y;

    /* renamed from: z */
    private boolean f28063z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.p$a */
    /* compiled from: FunctionDescriptorImpl */
    class C10323a implements C9102a<Collection<C10382u>> {

        /* renamed from: f */
        final /* synthetic */ C11978z0 f28064f;

        C10323a(C11978z0 z0Var) {
            this.f28064f = z0Var;
        }

        public Collection<C10382u> invoke() {
            C12164i iVar = new C12164i();
            for (C10382u a : C10322p.this.mo35406d()) {
                iVar.add(a.mo35448a(this.f28064f));
            }
            return iVar;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.p$b */
    /* compiled from: FunctionDescriptorImpl */
    static class C10324b implements C9102a<List<C10392x0>> {

        /* renamed from: f */
        final /* synthetic */ List f28066f;

        C10324b(List list) {
            this.f28066f = list;
        }

        public List<C10392x0> invoke() {
            return this.f28066f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C10322p(C10359m mVar, C10382u uVar, C10249g gVar, C9939f fVar, C10238b.C10239a aVar, C10362n0 n0Var) {
        super(mVar, gVar, fVar, n0Var);
        if (mVar == null) {
            m34645a(0);
            throw null;
        } else if (gVar == null) {
            m34645a(1);
            throw null;
        } else if (fVar == null) {
            m34645a(2);
            throw null;
        } else if (aVar == null) {
            m34645a(3);
            throw null;
        } else if (n0Var != null) {
            this.f28053p = C10397z0.f28196i;
            this.f28054q = false;
            this.f28055r = false;
            this.f28056s = false;
            this.f28057t = false;
            this.f28058u = false;
            this.f28059v = false;
            this.f28060w = false;
            this.f28061x = false;
            this.f28062y = false;
            this.f28063z = false;
            this.f28039A = true;
            this.f28040B = false;
            this.f28041C = null;
            this.f28042D = null;
            this.f28045G = null;
            this.f28046H = null;
            this.f28043E = uVar == null ? this : uVar;
            this.f28044F = aVar;
        } else {
            m34645a(4);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34645a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
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
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 26:
            case 28:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 27:
            case 29:
                objArr[0] = "substitutor";
                break;
            case 23:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 8:
                objArr[1] = "initialize";
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "newCopyBuilder";
                break;
            case 24:
                objArr[1] = "copy";
                break;
            case 25:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
                objArr[2] = "initialize";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "newCopyBuilder";
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: k */
    private void m34647k(boolean z) {
        this.f28062y = z;
    }

    /* renamed from: l */
    private void m34648l(boolean z) {
        this.f28061x = z;
    }

    /* renamed from: r */
    private void mo34228r() {
        C9102a<Collection<C10382u>> aVar = this.f28042D;
        if (aVar != null) {
            this.f28041C = aVar.invoke();
            this.f28042D = null;
        }
    }

    /* renamed from: A */
    public boolean mo34221A() {
        return this.f28040B;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return this.f28059v;
    }

    /* renamed from: I */
    public boolean mo33792I() {
        return this.f28058u;
    }

    /* renamed from: J */
    public boolean mo35499J() {
        if (this.f28054q) {
            return true;
        }
        for (C10382u J : m34665a().mo35406d()) {
            if (J.mo35499J()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public C10382u mo35500W() {
        return this.f28045G;
    }

    /* renamed from: X */
    public C10358l0 mo35403X() {
        return this.f28051n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C10322p mo33793a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var);

    /* renamed from: b */
    public void mo35506b(boolean z) {
        this.f28059v = z;
    }

    /* renamed from: b0 */
    public C10358l0 mo35405b0() {
        return this.f28050m;
    }

    /* renamed from: c */
    public void mo35507c(boolean z) {
        this.f28056s = z;
    }

    /* renamed from: d */
    public void mo34224d(boolean z) {
        this.f28039A = z;
    }

    /* renamed from: e */
    public void mo34225e(boolean z) {
        this.f28040B = z;
    }

    /* renamed from: f */
    public void mo35508f(boolean z) {
        this.f28055r = z;
    }

    /* renamed from: g */
    public void mo35509g(boolean z) {
        this.f28057t = z;
    }

    public C11824b0 getReturnType() {
        return this.f28049l;
    }

    public List<C10375s0> getTypeParameters() {
        List<C10375s0> list = this.f28047j;
        if (list != null) {
            return list;
        }
        m34645a(16);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = this.f28053p;
        if (a1Var != null) {
            return a1Var;
        }
        m34645a(14);
        throw null;
    }

    /* renamed from: h */
    public void mo35510h(boolean z) {
        this.f28054q = z;
    }

    /* renamed from: i */
    public void mo35511i(boolean z) {
        this.f28063z = z;
    }

    public boolean isInline() {
        return this.f28057t;
    }

    public boolean isSuspend() {
        return this.f28063z;
    }

    /* renamed from: j */
    public void mo35513j(boolean z) {
        this.f28058u = z;
    }

    /* renamed from: j0 */
    public boolean mo35514j0() {
        return this.f28061x;
    }

    /* renamed from: m0 */
    public boolean mo35515m0() {
        return this.f28062y;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return this.f28060w;
    }

    /* renamed from: p0 */
    public boolean mo35516p0() {
        if (this.f28055r) {
            return true;
        }
        for (C10382u p0 : m34665a().mo35406d()) {
            if (p0.mo35516p0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public C10382u.C10383a<? extends C10382u> mo35465q() {
        C10325c b = mo35505b(C11978z0.f31684b);
        if (b != null) {
            return b;
        }
        m34645a(21);
        throw null;
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return this.f28056s;
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.p$c */
    /* compiled from: FunctionDescriptorImpl */
    public class C10325c implements C10382u.C10383a<C10382u> {

        /* renamed from: a */
        protected C11972x0 f28067a;

        /* renamed from: b */
        protected C10359m f28068b;

        /* renamed from: c */
        protected C10388w f28069c;

        /* renamed from: d */
        protected C10237a1 f28070d;

        /* renamed from: e */
        protected C10382u f28071e;

        /* renamed from: f */
        protected C10238b.C10239a f28072f;

        /* renamed from: g */
        protected List<C10386v0> f28073g;

        /* renamed from: h */
        protected C10358l0 f28074h;

        /* renamed from: i */
        protected C10358l0 f28075i;

        /* renamed from: j */
        protected C11824b0 f28076j;

        /* renamed from: k */
        protected C9939f f28077k;

        /* renamed from: l */
        protected boolean f28078l;

        /* renamed from: m */
        protected boolean f28079m;

        /* renamed from: n */
        protected boolean f28080n;

        /* renamed from: o */
        protected boolean f28081o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f28082p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public List<C10375s0> f28083q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C10249g f28084r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public boolean f28085s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public Map<C10230a.C10231a<?>, Object> f28086t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public Boolean f28087u;

        /* renamed from: v */
        protected boolean f28088v;

        /* renamed from: w */
        final /* synthetic */ C10322p f28089w;

        public C10325c(C10322p pVar, C11972x0 x0Var, C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, List<C10386v0> list, C10358l0 l0Var, C11824b0 b0Var, C9939f fVar) {
            if (x0Var == null) {
                m34697a(0);
                throw null;
            } else if (mVar == null) {
                m34697a(1);
                throw null;
            } else if (wVar == null) {
                m34697a(2);
                throw null;
            } else if (a1Var == null) {
                m34697a(3);
                throw null;
            } else if (aVar == null) {
                m34697a(4);
                throw null;
            } else if (list == null) {
                m34697a(5);
                throw null;
            } else if (b0Var != null) {
                this.f28089w = pVar;
                this.f28071e = null;
                this.f28075i = this.f28089w.f28051n;
                this.f28078l = true;
                this.f28079m = false;
                this.f28080n = false;
                this.f28081o = false;
                this.f28082p = this.f28089w.mo35514j0();
                this.f28083q = null;
                this.f28084r = null;
                this.f28085s = this.f28089w.mo35515m0();
                this.f28086t = new LinkedHashMap();
                this.f28087u = null;
                this.f28088v = false;
                this.f28067a = x0Var;
                this.f28068b = mVar;
                this.f28069c = wVar;
                this.f28070d = a1Var;
                this.f28072f = aVar;
                this.f28073g = list;
                this.f28074h = l0Var;
                this.f28076j = b0Var;
                this.f28077k = fVar;
            } else {
                m34697a(6);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m34697a(int i) {
            String str;
            int i2;
            Throwable th;
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = "parameters";
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                    objArr[1] = "setModality";
                    break;
                case 12:
                    objArr[1] = "setVisibility";
                    break;
                case 14:
                    objArr[1] = "setKind";
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = "setName";
                    break;
                case 19:
                    objArr[1] = "setValueParameters";
                    break;
                case 21:
                    objArr[1] = "setTypeParameters";
                    break;
                case 23:
                    objArr[1] = "setReturnType";
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 35:
                    objArr[1] = "setSubstitution";
                    break;
                case 37:
                    objArr[1] = "putUserData";
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i) {
                case 7:
                    objArr[2] = "setOwner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = "setModality";
                    break;
                case 11:
                    objArr[2] = "setVisibility";
                    break;
                case 13:
                    objArr[2] = "setKind";
                    break;
                case 16:
                    objArr[2] = "setName";
                    break;
                case 18:
                    objArr[2] = "setValueParameters";
                    break;
                case 20:
                    objArr[2] = "setTypeParameters";
                    break;
                case 22:
                    objArr[2] = "setReturnType";
                    break;
                case 32:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 34:
                    objArr[2] = "setSubstitution";
                    break;
                case 36:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        /* renamed from: c */
        public C10325c mo35534c() {
            this.f28080n = true;
            return this;
        }

        /* renamed from: d */
        public C10325c mo35536d() {
            this.f28085s = true;
            return this;
        }

        /* renamed from: e */
        public C10325c mo35537e() {
            this.f28082p = true;
            return this;
        }

        /* renamed from: f */
        public C10325c mo35538f() {
            this.f28079m = true;
            return this;
        }

        /* renamed from: c */
        public C10325c mo35535c(boolean z) {
            this.f28088v = z;
            return this;
        }

        /* renamed from: b */
        public C10325c mo35531b(List<C10375s0> list) {
            if (list != null) {
                this.f28083q = list;
                return this;
            }
            m34697a(20);
            throw null;
        }

        /* renamed from: b */
        public C10325c mo35532b(C10358l0 l0Var) {
            this.f28074h = l0Var;
            return this;
        }

        /* renamed from: b */
        public C10325c mo35530b() {
            this.f28081o = true;
            return this;
        }

        /* renamed from: b */
        public C10325c mo35533b(boolean z) {
            this.f28087u = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C10325c mo35526a(C10359m mVar) {
            if (mVar != null) {
                this.f28068b = mVar;
                return this;
            }
            m34697a(7);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35527a(C10388w wVar) {
            if (wVar != null) {
                this.f28069c = wVar;
                return this;
            }
            m34697a(9);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35521a(C10237a1 a1Var) {
            if (a1Var != null) {
                this.f28070d = a1Var;
                return this;
            }
            m34697a(11);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35522a(C10238b.C10239a aVar) {
            if (aVar != null) {
                this.f28072f = aVar;
                return this;
            }
            m34697a(13);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35528a(boolean z) {
            this.f28078l = z;
            return this;
        }

        /* renamed from: a */
        public C10325c mo35518a(C9939f fVar) {
            if (fVar != null) {
                this.f28077k = fVar;
                return this;
            }
            m34697a(16);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35517a(List<C10386v0> list) {
            if (list != null) {
                this.f28073g = list;
                return this;
            }
            m34697a(18);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35519a(C11824b0 b0Var) {
            if (b0Var != null) {
                this.f28076j = b0Var;
                return this;
            }
            m34697a(22);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35525a(C10358l0 l0Var) {
            this.f28075i = l0Var;
            return this;
        }

        /* renamed from: a */
        public C10325c mo35524a(C10238b bVar) {
            this.f28071e = (C10382u) bVar;
            return this;
        }

        /* renamed from: a */
        public C10325c mo35523a(C10249g gVar) {
            if (gVar != null) {
                this.f28084r = gVar;
                return this;
            }
            m34697a(32);
            throw null;
        }

        /* renamed from: a */
        public C10325c mo35520a(C11972x0 x0Var) {
            if (x0Var != null) {
                this.f28067a = x0Var;
                return this;
            }
            m34697a(34);
            throw null;
        }

        /* renamed from: a */
        public C10382u mo35529a() {
            return this.f28089w.mo33794a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10325c mo35505b(C11978z0 z0Var) {
        if (z0Var != null) {
            return new C10325c(this, z0Var.mo38619a(), mo33762b(), mo33767i(), getVisibility(), mo35423g(), mo35407f(), mo35405b0(), getReturnType(), (C9939f) null);
        }
        m34645a(22);
        throw null;
    }

    /* renamed from: d */
    public Collection<? extends C10382u> mo35406d() {
        mo34228r();
        Collection<? extends C10382u> collection = this.f28041C;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        m34645a(12);
        throw null;
    }

    /* renamed from: f */
    public List<C10386v0> mo35407f() {
        List<C10386v0> list = this.f28048k;
        if (list != null) {
            return list;
        }
        m34645a(17);
        throw null;
    }

    /* renamed from: g */
    public C10238b.C10239a mo35423g() {
        C10238b.C10239a aVar = this.f28044F;
        if (aVar != null) {
            return aVar;
        }
        m34645a(19);
        throw null;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        C10388w wVar = this.f28052o;
        if (wVar != null) {
            return wVar;
        }
        m34645a(13);
        throw null;
    }

    /* renamed from: a */
    public C10322p mo35464a(C10358l0 l0Var, C10358l0 l0Var2, List<? extends C10375s0> list, List<C10386v0> list2, C11824b0 b0Var, C10388w wVar, C10237a1 a1Var) {
        if (list == null) {
            m34645a(5);
            throw null;
        } else if (list2 == null) {
            m34645a(6);
            throw null;
        } else if (a1Var != null) {
            this.f28047j = C10539w.m35815n(list);
            this.f28048k = C10539w.m35815n(list2);
            this.f28049l = b0Var;
            this.f28052o = wVar;
            this.f28053p = a1Var;
            this.f28050m = l0Var;
            this.f28051n = l0Var2;
            int i = 0;
            int i2 = 0;
            while (i2 < list.size()) {
                C10375s0 s0Var = (C10375s0) list.get(i2);
                if (s0Var.mo35442e() == i2) {
                    i2++;
                } else {
                    throw new IllegalStateException(s0Var + " index is " + s0Var.mo35442e() + " but position is " + i2);
                }
            }
            while (i < list2.size()) {
                C10386v0 v0Var = list2.get(i);
                if (v0Var.mo35487e() == i + 0) {
                    i++;
                } else {
                    throw new IllegalStateException(v0Var + "index is " + v0Var.mo35487e() + " but position is " + i);
                }
            }
            return this;
        } else {
            m34645a(7);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo35503a(C10237a1 a1Var) {
        if (a1Var != null) {
            this.f28053p = a1Var;
        } else {
            m34645a(9);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo35504a(boolean z) {
        this.f28060w = z;
    }

    /* renamed from: a */
    public void mo35501a(C11824b0 b0Var) {
        if (b0Var != null) {
            this.f28049l = b0Var;
        } else {
            m34645a(10);
            throw null;
        }
    }

    /* renamed from: a */
    public <V> V mo34229a(C10230a.C10231a<V> aVar) {
        Map map = this.f28046H;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* renamed from: a */
    public void mo35422a(Collection<? extends C10238b> collection) {
        if (collection != null) {
            this.f28041C = collection;
            Iterator<? extends C10238b> it = collection.iterator();
            while (it.hasNext()) {
                if (((C10382u) it.next()).mo35515m0()) {
                    this.f28062y = true;
                    return;
                }
            }
            return;
        }
        m34645a(15);
        throw null;
    }

    /* renamed from: a */
    public C10382u m34666a() {
        C10382u uVar = this.f28043E;
        C10382u a = uVar == this ? this : uVar.mo35404a();
        if (a != null) {
            return a;
        }
        m34645a(18);
        throw null;
    }

    /* renamed from: a */
    public C10382u m34667a(C11978z0 z0Var) {
        if (z0Var == null) {
            m34645a(20);
            throw null;
        } else if (z0Var.mo38622b()) {
            return this;
        } else {
            C10325c b = mo35505b(z0Var);
            b.mo35524a((C10238b) m34665a());
            b.mo35535c(true);
            return b.mo35529a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10382u mo33794a(C10325c cVar) {
        C10285c0 c0Var;
        C10358l0 l0Var;
        C11824b0 b;
        C10325c cVar2 = cVar;
        if (cVar2 != null) {
            boolean[] zArr = new boolean[1];
            C10249g a = cVar.f28084r != null ? C10254i.m34293a(getAnnotations(), cVar.f28084r) : getAnnotations();
            C10359m mVar = cVar2.f28068b;
            C10382u uVar = cVar2.f28071e;
            C10322p a2 = mo33793a(mVar, uVar, cVar2.f28072f, cVar2.f28077k, a, m34644a(cVar2.f28080n, uVar));
            List<C10375s0> typeParameters = cVar.f28083q == null ? getTypeParameters() : cVar.f28083q;
            zArr[0] = zArr[0] | (!typeParameters.isEmpty());
            ArrayList arrayList = new ArrayList(typeParameters.size());
            C11978z0 a3 = C11945p.m39493a(typeParameters, cVar2.f28067a, a2, arrayList, zArr);
            if (a3 == null) {
                return null;
            }
            C10358l0 l0Var2 = cVar2.f28074h;
            if (l0Var2 != null) {
                C11824b0 b2 = a3.mo38620b(l0Var2.getType(), C11838f1.IN_VARIANCE);
                if (b2 == null) {
                    return null;
                }
                C10285c0 c0Var2 = new C10285c0(a2, new C10113b(a2, b2, cVar2.f28074h.getValue()), cVar2.f28074h.getAnnotations());
                zArr[0] = (b2 != cVar2.f28074h.getType()) | zArr[0];
                c0Var = c0Var2;
            } else {
                c0Var = null;
            }
            C10358l0 l0Var3 = cVar2.f28075i;
            if (l0Var3 != null) {
                C10358l0 a4 = l0Var3.mo35448a(a3);
                if (a4 == null) {
                    return null;
                }
                zArr[0] = zArr[0] | (a4 != cVar2.f28075i);
                l0Var = a4;
            } else {
                l0Var = null;
            }
            List<C10386v0> a5 = m34642a((C10382u) a2, cVar2.f28073g, a3, cVar2.f28081o, cVar2.f28080n, zArr);
            if (a5 == null || (b = a3.mo38620b(cVar2.f28076j, C11838f1.OUT_VARIANCE)) == null) {
                return null;
            }
            zArr[0] = zArr[0] | (b != cVar2.f28076j);
            if (!zArr[0] && cVar2.f28088v) {
                return this;
            }
            C11978z0 z0Var = a3;
            a2.mo35464a(c0Var, l0Var, arrayList, a5, b, cVar2.f28069c, cVar2.f28070d);
            a2.mo35510h(this.f28054q);
            a2.mo35508f(this.f28055r);
            a2.mo35507c(this.f28056s);
            a2.mo35509g(this.f28057t);
            a2.mo35513j(this.f28058u);
            a2.mo35511i(this.f28063z);
            a2.mo35506b(this.f28059v);
            a2.mo35504a(this.f28060w);
            a2.mo34224d(this.f28039A);
            a2.m34648l(cVar.f28082p);
            a2.m34647k(cVar.f28085s);
            a2.mo34225e(cVar.f28087u != null ? cVar.f28087u.booleanValue() : this.f28040B);
            if (!cVar.f28086t.isEmpty() || this.f28046H != null) {
                Map<C10230a.C10231a<?>, Object> f = cVar.f28086t;
                Map<C10230a.C10231a<?>, Object> map = this.f28046H;
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!f.containsKey(next.getKey())) {
                            f.put(next.getKey(), next.getValue());
                        }
                    }
                }
                if (f.size() == 1) {
                    a2.f28046H = Collections.singletonMap(f.keySet().iterator().next(), f.values().iterator().next());
                } else {
                    a2.f28046H = f;
                }
            }
            if (cVar2.f28079m || mo35500W() != null) {
                a2.m34646a((mo35500W() != null ? mo35500W() : this).mo35448a(z0Var));
            }
            if (cVar2.f28078l && !m34665a().mo35406d().isEmpty()) {
                if (cVar2.f28067a.mo34004d()) {
                    C9102a<Collection<C10382u>> aVar = this.f28042D;
                    if (aVar != null) {
                        a2.f28042D = aVar;
                    } else {
                        a2.mo35422a((Collection<? extends C10238b>) mo35406d());
                    }
                } else {
                    a2.f28042D = new C10323a(z0Var);
                }
            }
            return a2;
        }
        m34645a(23);
        throw null;
    }

    /* renamed from: a */
    public C10382u m34669a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, boolean z) {
        C10382u a = mo35465q().mo35526a(mVar).mo35527a(wVar).mo35521a(a1Var).mo35522a(aVar).mo35528a(z).mo35529a();
        if (a != null) {
            return a;
        }
        m34645a(24);
        throw null;
    }

    /* renamed from: a */
    private C10362n0 m34644a(boolean z, C10382u uVar) {
        C10362n0 n0Var;
        if (z) {
            if (uVar == null) {
                uVar = m34665a();
            }
            n0Var = uVar.mo33773p();
        } else {
            n0Var = C10362n0.f28175a;
        }
        if (n0Var != null) {
            return n0Var;
        }
        m34645a(25);
        throw null;
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo33630a((C10382u) this, d);
    }

    /* renamed from: a */
    public static List<C10386v0> m34641a(C10382u uVar, List<C10386v0> list, C11978z0 z0Var) {
        if (list == null) {
            m34645a(26);
            throw null;
        } else if (z0Var != null) {
            return m34642a(uVar, list, z0Var, false, false, (boolean[]) null);
        } else {
            m34645a(27);
            throw null;
        }
    }

    /* renamed from: a */
    public static List<C10386v0> m34642a(C10382u uVar, List<C10386v0> list, C11978z0 z0Var, boolean z, boolean z2, boolean[] zArr) {
        C11824b0 b0Var;
        C11978z0 z0Var2 = z0Var;
        if (list == null) {
            m34645a(28);
            throw null;
        } else if (z0Var2 != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C10386v0 next : list) {
                C11824b0 b = z0Var2.mo38620b(next.getType(), C11838f1.IN_VARIANCE);
                C11824b0 a0 = next.mo35486a0();
                if (a0 == null) {
                    b0Var = null;
                } else {
                    b0Var = z0Var2.mo38620b(a0, C11838f1.IN_VARIANCE);
                }
                if (b == null) {
                    return null;
                }
                if (!((b == next.getType() && a0 == b0Var) || zArr == null)) {
                    zArr[0] = true;
                }
                arrayList.add(C10305i0.m34546a(uVar, z ? null : next, next.mo35487e(), next.getAnnotations(), next.getName(), b, next.mo35489h0(), next.mo35483V(), next.mo35482S(), b0Var, z2 ? next.mo33773p() : C10362n0.f28175a, next instanceof C10305i0.C10307b ? new C10324b(((C10305i0.C10307b) next).mo35491r()) : null));
            }
            return arrayList;
        } else {
            m34645a(29);
            throw null;
        }
    }

    /* renamed from: a */
    private void m34646a(C10382u uVar) {
        this.f28045G = uVar;
    }

    /* renamed from: a */
    public <V> void mo35502a(C10230a.C10231a<V> aVar, Object obj) {
        if (this.f28046H == null) {
            this.f28046H = new LinkedHashMap();
        }
        this.f28046H.put(aVar, obj);
    }
}
