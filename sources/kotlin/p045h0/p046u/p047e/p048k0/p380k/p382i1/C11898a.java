package kotlin.p045h0.p046u.p047e.p048k0.p380k.p382i1;

import java.util.Collection;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10289d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10322p;

/* renamed from: kotlin.h0.u.e.k0.k.i1.a */
/* compiled from: ErrorSimpleFunctionDescriptorImpl */
public class C11898a extends C10289d0 {

    /* renamed from: kotlin.h0.u.e.k0.k.i1.a$a */
    /* compiled from: ErrorSimpleFunctionDescriptorImpl */
    class C11899a implements C10382u.C10383a<C10360m0> {
        C11899a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m39297a(int i) {
            String str;
            int i2;
            Throwable th;
            int i3 = i;
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                    break;
                case 2:
                    objArr[0] = "modality";
                    break;
                case 4:
                    objArr[0] = "visibility";
                    break;
                case 6:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 11:
                case 17:
                    objArr[0] = "parameters";
                    break;
                case 13:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = "userDataKey";
                    break;
                case 19:
                    objArr[0] = "type";
                    break;
                case 29:
                    objArr[0] = "additionalAnnotations";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i3 == 1) {
                objArr[1] = "setOwner";
            } else if (i3 == 3) {
                objArr[1] = "setModality";
            } else if (i3 == 5) {
                objArr[1] = "setVisibility";
            } else if (i3 == 10) {
                objArr[1] = "setName";
            } else if (i3 == 12) {
                objArr[1] = "setValueParameters";
            } else if (i3 == 14) {
                objArr[1] = "setSubstitution";
            } else if (i3 == 16) {
                objArr[1] = "putUserData";
            } else if (i3 == 18) {
                objArr[1] = "setTypeParameters";
            } else if (i3 == 30) {
                objArr[1] = "setAdditionalAnnotations";
            } else if (i3 == 7) {
                objArr[1] = "setKind";
            } else if (i3 != 8) {
                switch (i3) {
                    case 20:
                        objArr[1] = "setReturnType";
                        break;
                    case 21:
                        objArr[1] = "setExtensionReceiverParameter";
                        break;
                    case 22:
                        objArr[1] = "setDispatchReceiverParameter";
                        break;
                    case 23:
                        objArr[1] = "setOriginal";
                        break;
                    case 24:
                        objArr[1] = "setSignatureChange";
                        break;
                    case 25:
                        objArr[1] = "setPreserveSourceElement";
                        break;
                    case 26:
                        objArr[1] = "setDropOriginalInContainingParts";
                        break;
                    case 27:
                        objArr[1] = "setHiddenToOvercomeSignatureClash";
                        break;
                    case 28:
                        objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                        break;
                }
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    break;
                case 2:
                    objArr[2] = "setModality";
                    break;
                case 4:
                    objArr[2] = "setVisibility";
                    break;
                case 6:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setName";
                    break;
                case 11:
                    objArr[2] = "setValueParameters";
                    break;
                case 13:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "putUserData";
                    break;
                case 17:
                    objArr[2] = "setTypeParameters";
                    break;
                case 19:
                    objArr[2] = "setReturnType";
                    break;
                case 29:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35517a(List<C10386v0> list) {
            if (list != null) {
                return this;
            }
            m39297a(11);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35518a(C9939f fVar) {
            if (fVar != null) {
                return this;
            }
            m39297a(9);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35519a(C11824b0 b0Var) {
            if (b0Var != null) {
                return this;
            }
            m39297a(19);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35520a(C11972x0 x0Var) {
            if (x0Var != null) {
                return this;
            }
            m39297a(13);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35521a(C10237a1 a1Var) {
            if (a1Var != null) {
                return this;
            }
            m39297a(4);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35522a(C10238b.C10239a aVar) {
            if (aVar != null) {
                return this;
            }
            m39297a(6);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35523a(C10249g gVar) {
            if (gVar != null) {
                return this;
            }
            m39297a(29);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35524a(C10238b bVar) {
            return this;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35525a(C10358l0 l0Var) {
            return this;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35526a(C10359m mVar) {
            if (mVar != null) {
                return this;
            }
            m39297a(0);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35527a(C10388w wVar) {
            if (wVar != null) {
                return this;
            }
            m39297a(2);
            throw null;
        }

        /* renamed from: a */
        public C10382u.C10383a<C10360m0> mo35528a(boolean z) {
            return this;
        }

        /* renamed from: b */
        public C10382u.C10383a<C10360m0> mo35530b() {
            return this;
        }

        /* renamed from: b */
        public C10382u.C10383a<C10360m0> mo35531b(List<C10375s0> list) {
            if (list != null) {
                return this;
            }
            m39297a(17);
            throw null;
        }

        /* renamed from: b */
        public C10382u.C10383a<C10360m0> mo35532b(C10358l0 l0Var) {
            return this;
        }

        /* renamed from: c */
        public C10382u.C10383a<C10360m0> mo35534c() {
            return this;
        }

        /* renamed from: d */
        public C10382u.C10383a<C10360m0> mo35536d() {
            return this;
        }

        /* renamed from: e */
        public C10382u.C10383a<C10360m0> mo35537e() {
            return this;
        }

        /* renamed from: f */
        public C10382u.C10383a<C10360m0> mo35538f() {
            return this;
        }

        /* renamed from: a */
        public C10360m0 m39311a() {
            return C11898a.this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11898a(C10342e eVar, C11958u.C11962d dVar) {
        super(eVar, (C10360m0) null, C10249g.f27910c.mo35429a(), C9939f.m33304d("<ERROR FUNCTION>"), C10238b.C10239a.DECLARATION, C10362n0.f28175a);
        if (eVar == null) {
            m39289a(0);
            throw null;
        } else if (dVar != null) {
        } else {
            m39289a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m39289a(int i) {
        String str = (i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
                break;
            case 8:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 6) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 6:
            case 7:
                break;
            case 8:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public <V> V mo34229a(C10230a.C10231a<V> aVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10322p mo33793a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        if (mVar == null) {
            m39289a(2);
            throw null;
        } else if (aVar == null) {
            m39289a(3);
            throw null;
        } else if (gVar == null) {
            m39289a(4);
            throw null;
        } else if (n0Var != null) {
            return this;
        } else {
            m39289a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public C10360m0 m39293a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, boolean z) {
        return this;
    }

    /* renamed from: a */
    public void mo35422a(Collection<? extends C10238b> collection) {
        if (collection == null) {
            m39289a(8);
            throw null;
        }
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: q */
    public C10382u.C10383a<? extends C10360m0> mo35465q() {
        return new C11899a();
    }
}
