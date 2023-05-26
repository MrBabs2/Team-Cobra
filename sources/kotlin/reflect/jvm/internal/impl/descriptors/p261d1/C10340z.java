package kotlin.reflect.jvm.internal.impl.descriptors.p261d1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10113b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11815g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11945p;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10354j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10356k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10364o;
import kotlin.reflect.jvm.internal.impl.descriptors.C10374s;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.utils.C12169j;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.z */
/* compiled from: PropertyDescriptorImpl */
public class C10340z extends C10312k0 implements C10352i0 {

    /* renamed from: A */
    private C10281a0 f28135A;

    /* renamed from: B */
    private C10356k0 f28136B;

    /* renamed from: C */
    private boolean f28137C;

    /* renamed from: D */
    private C10374s f28138D;

    /* renamed from: E */
    private C10374s f28139E;

    /* renamed from: m */
    private final C10388w f28140m;

    /* renamed from: n */
    private C10237a1 f28141n;

    /* renamed from: o */
    private Collection<? extends C10352i0> f28142o;

    /* renamed from: p */
    private final C10352i0 f28143p;

    /* renamed from: q */
    private final C10238b.C10239a f28144q;

    /* renamed from: r */
    private final boolean f28145r;

    /* renamed from: s */
    private final boolean f28146s;

    /* renamed from: t */
    private final boolean f28147t;

    /* renamed from: u */
    private final boolean f28148u;

    /* renamed from: v */
    private final boolean f28149v;

    /* renamed from: w */
    private final boolean f28150w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C10358l0 f28151x;

    /* renamed from: y */
    private C10358l0 f28152y;

    /* renamed from: z */
    private List<C10375s0> f28153z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d1.z$a */
    /* compiled from: PropertyDescriptorImpl */
    public class C10341a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10359m f28154a = C10340z.this.mo33762b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C10388w f28155b = C10340z.this.mo33767i();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10237a1 f28156c = C10340z.this.getVisibility();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C10352i0 f28157d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C10238b.C10239a f28158e = C10340z.this.mo35423g();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C11972x0 f28159f = C11972x0.f31680a;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f28160g = true;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C10358l0 f28161h = C10340z.this.f28151x;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public List<C10375s0> f28162i = null;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C9939f f28163j = C10340z.this.getName();

        public C10341a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m34915a(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 8 || i2 == 16 || i2 == 10 || i2 == 11 || i2 == 13 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 8 || i2 == 16 || i2 == 10 || i2 == 11 || i2 == 13 || i2 == 14) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 14:
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 3:
                    objArr[0] = "modality";
                    break;
                case 5:
                    objArr[0] = "visibility";
                    break;
                case 7:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "typeParameters";
                    break;
                case 12:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 4) {
                objArr[1] = "setModality";
            } else if (i2 == 6) {
                objArr[1] = "setVisibility";
            } else if (i2 == 8) {
                objArr[1] = "setKind";
            } else if (i2 == 16) {
                objArr[1] = "setName";
            } else if (i2 == 10) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 11) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 13) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 14) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 14:
                case 16:
                    break;
                case 3:
                    objArr[2] = "setModality";
                    break;
                case 5:
                    objArr[2] = "setVisibility";
                    break;
                case 7:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setTypeParameters";
                    break;
                case 12:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 8 || i2 == 16 || i2 == 10 || i2 == 11 || i2 == 13 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: a */
        public C10341a mo35593a(C10359m mVar) {
            if (mVar != null) {
                this.f28154a = mVar;
                return this;
            }
            m34915a(0);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C10354j0 mo35597b() {
            C10352i0 i0Var = this.f28157d;
            if (i0Var == null) {
                return null;
            }
            return i0Var.getGetter();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C10356k0 mo35598c() {
            C10352i0 i0Var = this.f28157d;
            if (i0Var == null) {
                return null;
            }
            return i0Var.getSetter();
        }

        /* renamed from: a */
        public C10341a mo35592a(C10238b bVar) {
            this.f28157d = (C10352i0) bVar;
            return this;
        }

        /* renamed from: a */
        public C10341a mo35594a(C10388w wVar) {
            if (wVar != null) {
                this.f28155b = wVar;
                return this;
            }
            m34915a(3);
            throw null;
        }

        /* renamed from: a */
        public C10341a mo35590a(C10237a1 a1Var) {
            if (a1Var != null) {
                this.f28156c = a1Var;
                return this;
            }
            m34915a(5);
            throw null;
        }

        /* renamed from: a */
        public C10341a mo35591a(C10238b.C10239a aVar) {
            if (aVar != null) {
                this.f28158e = aVar;
                return this;
            }
            m34915a(7);
            throw null;
        }

        /* renamed from: a */
        public C10341a mo35589a(C11972x0 x0Var) {
            if (x0Var != null) {
                this.f28159f = x0Var;
                return this;
            }
            m34915a(12);
            throw null;
        }

        /* renamed from: a */
        public C10341a mo35595a(boolean z) {
            this.f28160g = z;
            return this;
        }

        /* renamed from: a */
        public C10352i0 mo35596a() {
            return C10340z.this.mo35576a(this);
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.i0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C10340z(kotlin.reflect.jvm.internal.impl.descriptors.C10359m r13, kotlin.reflect.jvm.internal.impl.descriptors.C10352i0 r14, kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g r15, kotlin.reflect.jvm.internal.impl.descriptors.C10388w r16, kotlin.reflect.jvm.internal.impl.descriptors.C10237a1 r17, boolean r18, kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f r19, kotlin.reflect.jvm.internal.impl.descriptors.C10238b.C10239a r20, kotlin.reflect.jvm.internal.impl.descriptors.C10362n0 r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r12 = this;
            r7 = r12
            r8 = r16
            r9 = r17
            r10 = r20
            r11 = 0
            if (r13 == 0) goto L_0x0069
            if (r15 == 0) goto L_0x0064
            if (r8 == 0) goto L_0x005f
            if (r9 == 0) goto L_0x005a
            if (r19 == 0) goto L_0x0055
            if (r10 == 0) goto L_0x0050
            if (r21 == 0) goto L_0x004b
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r19
            r5 = r18
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f28142o = r11
            r7.f28140m = r8
            r7.f28141n = r9
            if (r14 != 0) goto L_0x002d
            r0 = r7
            goto L_0x002e
        L_0x002d:
            r0 = r14
        L_0x002e:
            r7.f28143p = r0
            r7.f28144q = r10
            r0 = r22
            r7.f28145r = r0
            r0 = r23
            r7.f28146s = r0
            r0 = r24
            r7.f28147t = r0
            r0 = r25
            r7.f28148u = r0
            r0 = r26
            r7.f28149v = r0
            r0 = r27
            r7.f28150w = r0
            return
        L_0x004b:
            r0 = 6
            m34879a((int) r0)
            throw r11
        L_0x0050:
            r0 = 5
            m34879a((int) r0)
            throw r11
        L_0x0055:
            r0 = 4
            m34879a((int) r0)
            throw r11
        L_0x005a:
            r0 = 3
            m34879a((int) r0)
            throw r11
        L_0x005f:
            r0 = 2
            m34879a((int) r0)
            throw r11
        L_0x0064:
            r0 = 1
            m34879a((int) r0)
            throw r11
        L_0x0069:
            r0 = 0
            m34879a((int) r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10340z.<init>(kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.i0, kotlin.reflect.jvm.internal.impl.descriptors.b1.g, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.a1, boolean, kotlin.h0.u.e.k0.e.f, kotlin.reflect.jvm.internal.impl.descriptors.b$a, kotlin.reflect.jvm.internal.impl.descriptors.n0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    private static /* synthetic */ void m34879a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 31 || i == 32 || i == 34 || i == 35)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 31 || i == 32 || i == 34 || i == 35)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 16:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 29:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
                objArr[0] = "source";
                break;
            case 14:
                objArr[0] = "outType";
                break;
            case 15:
                objArr[0] = "typeParameters";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 31:
            case 32:
            case 34:
            case 35:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 23:
                objArr[0] = "copyConfiguration";
                break;
            case 24:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "accessorDescriptor";
                break;
            case 26:
                objArr[0] = "newOwner";
                break;
            case 27:
                objArr[0] = "newModality";
                break;
            case 28:
                objArr[0] = "newVisibility";
                break;
            case 30:
                objArr[0] = "newName";
                break;
            case 33:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 31) {
            objArr[1] = "getOriginal";
        } else if (i == 32) {
            objArr[1] = "getKind";
        } else if (i == 34) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 35) {
            switch (i) {
                case 17:
                    objArr[1] = "getTypeParameters";
                    break;
                case 18:
                    objArr[1] = "getReturnType";
                    break;
                case 19:
                    objArr[1] = "getModality";
                    break;
                case 20:
                    objArr[1] = "getVisibility";
                    break;
                case 21:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
            case 15:
                objArr[2] = "setType";
                break;
            case 16:
                objArr[2] = "setVisibility";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 31:
            case 32:
            case 34:
            case 35:
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 24:
            case 25:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 33:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 31 || i == 32 || i == 34 || i == 35)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: F */
    public boolean mo33758F() {
        return this.f28147t;
    }

    /* renamed from: H */
    public boolean mo35575H() {
        return this.f28150w;
    }

    /* renamed from: X */
    public C10358l0 mo35403X() {
        return this.f28151x;
    }

    /* renamed from: a */
    public <V> V mo34229a(C10230a.C10231a<V> aVar) {
        return null;
    }

    /* renamed from: b0 */
    public C10358l0 mo35405b0() {
        return this.f28152y;
    }

    /* renamed from: c0 */
    public C10374s mo35582c0() {
        return this.f28139E;
    }

    /* renamed from: d */
    public Collection<? extends C10352i0> mo35406d() {
        Collection<? extends C10352i0> collection = this.f28142o;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        m34879a(34);
        throw null;
    }

    /* renamed from: f0 */
    public C10374s mo35583f0() {
        return this.f28138D;
    }

    /* renamed from: g */
    public C10238b.C10239a mo35423g() {
        C10238b.C10239a aVar = this.f28144q;
        if (aVar != null) {
            return aVar;
        }
        m34879a(32);
        throw null;
    }

    /* renamed from: g0 */
    public boolean mo35488g0() {
        return this.f28145r;
    }

    public C11824b0 getReturnType() {
        C11824b0 type = getType();
        if (type != null) {
            return type;
        }
        m34879a(18);
        throw null;
    }

    public C10356k0 getSetter() {
        return this.f28136B;
    }

    public List<C10375s0> getTypeParameters() {
        List<C10375s0> list = this.f28153z;
        if (list != null) {
            return list;
        }
        m34879a(17);
        throw null;
    }

    public C10237a1 getVisibility() {
        C10237a1 a1Var = this.f28141n;
        if (a1Var != null) {
            return a1Var;
        }
        m34879a(20);
        throw null;
    }

    /* renamed from: i */
    public C10388w mo33767i() {
        C10388w wVar = this.f28140m;
        if (wVar != null) {
            return wVar;
        }
        m34879a(19);
        throw null;
    }

    public boolean isConst() {
        return this.f28146s;
    }

    /* renamed from: o0 */
    public boolean mo33772o0() {
        return this.f28148u;
    }

    /* renamed from: q */
    public C10341a mo35586q() {
        return new C10341a();
    }

    /* renamed from: r */
    public boolean mo35587r() {
        return this.f28137C;
    }

    /* renamed from: t */
    public List<C10350h0> mo35588t() {
        ArrayList arrayList = new ArrayList(2);
        C10281a0 a0Var = this.f28135A;
        if (a0Var != null) {
            arrayList.add(a0Var);
        }
        C10356k0 k0Var = this.f28136B;
        if (k0Var != null) {
            arrayList.add(k0Var);
        }
        return arrayList;
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return this.f28149v;
    }

    public C10281a0 getGetter() {
        return this.f28135A;
    }

    /* renamed from: a */
    public static C10340z m34876a(C10359m mVar, C10249g gVar, C10388w wVar, C10237a1 a1Var, boolean z, C9939f fVar, C10238b.C10239a aVar, C10362n0 n0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (mVar == null) {
            m34879a(7);
            throw null;
        } else if (gVar == null) {
            m34879a(8);
            throw null;
        } else if (wVar == null) {
            m34879a(9);
            throw null;
        } else if (a1Var == null) {
            m34879a(10);
            throw null;
        } else if (fVar == null) {
            m34879a(11);
            throw null;
        } else if (aVar == null) {
            m34879a(12);
            throw null;
        } else if (n0Var != null) {
            return new C10340z(mVar, (C10352i0) null, gVar, wVar, a1Var, z, fVar, aVar, n0Var, z2, z3, z4, z5, z6, z7);
        } else {
            m34879a(13);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo35577a(C11824b0 b0Var, List<? extends C10375s0> list, C10358l0 l0Var, C10358l0 l0Var2) {
        if (b0Var == null) {
            m34879a(14);
            throw null;
        } else if (list != null) {
            mo35492a(b0Var);
            this.f28153z = new ArrayList(list);
            this.f28152y = l0Var2;
            this.f28151x = l0Var;
        } else {
            m34879a(15);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo35579a(C10281a0 a0Var, C10356k0 k0Var) {
        mo35580a(a0Var, k0Var, (C10374s) null, (C10374s) null);
    }

    /* renamed from: a */
    public void mo35580a(C10281a0 a0Var, C10356k0 k0Var, C10374s sVar, C10374s sVar2) {
        this.f28135A = a0Var;
        this.f28136B = k0Var;
        this.f28138D = sVar;
        this.f28139E = sVar2;
    }

    /* renamed from: a */
    public void mo35581a(boolean z) {
        this.f28137C = z;
    }

    /* renamed from: a */
    public void mo35578a(C10237a1 a1Var) {
        if (a1Var != null) {
            this.f28141n = a1Var;
        } else {
            m34879a(16);
            throw null;
        }
    }

    /* renamed from: a */
    public C10352i0 m34894a(C11978z0 z0Var) {
        if (z0Var == null) {
            m34879a(22);
            throw null;
        } else if (z0Var.mo38622b()) {
            return this;
        } else {
            C10341a q = mo35586q();
            q.mo35589a(z0Var.mo38619a());
            q.mo35592a((C10238b) m34895a());
            return q.mo35596a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10352i0 mo35576a(C10341a aVar) {
        C10358l0 l0Var;
        C10285c0 c0Var;
        C11815g<C10037g<?>> gVar;
        C10321o oVar = null;
        if (aVar != null) {
            C10340z a = mo34230a(aVar.f28154a, aVar.f28155b, aVar.f28156c, aVar.f28157d, aVar.f28158e, aVar.f28163j);
            List<C10375s0> typeParameters = aVar.f28162i == null ? getTypeParameters() : aVar.f28162i;
            ArrayList arrayList = new ArrayList(typeParameters.size());
            C11978z0 a2 = C11945p.m39492a(typeParameters, aVar.f28159f, a, arrayList);
            C11824b0 b = a2.mo38620b(getType(), C11838f1.OUT_VARIANCE);
            if (b == null) {
                return null;
            }
            C10358l0 j = aVar.f28161h;
            if (j != null) {
                l0Var = j.mo35448a(a2);
                if (l0Var == null) {
                    return null;
                }
            } else {
                l0Var = null;
            }
            C10358l0 l0Var2 = this.f28152y;
            if (l0Var2 != null) {
                C11824b0 b2 = a2.mo38620b(l0Var2.getType(), C11838f1.IN_VARIANCE);
                if (b2 == null) {
                    return null;
                }
                c0Var = new C10285c0(a, new C10113b(a, b2, this.f28152y.getValue()), this.f28152y.getAnnotations());
            } else {
                c0Var = null;
            }
            a.mo35577a(b, (List<? extends C10375s0>) arrayList, l0Var, (C10358l0) c0Var);
            C10281a0 a0Var = this.f28135A == null ? null : new C10281a0(a, this.f28135A.getAnnotations(), aVar.f28155b, m34875a(this.f28135A.getVisibility(), aVar.f28158e), this.f28135A.mo35569P(), this.f28135A.mo33778u(), this.f28135A.isInline(), aVar.f28158e, aVar.mo35597b(), C10362n0.f28175a);
            if (a0Var != null) {
                C11824b0 returnType = this.f28135A.getReturnType();
                a0Var.mo35572a(m34878a(a2, (C10350h0) this.f28135A));
                a0Var.mo35453a(returnType != null ? a2.mo38620b(returnType, C11838f1.OUT_VARIANCE) : null);
            }
            C10283b0 b0Var = this.f28136B == null ? null : new C10283b0(a, this.f28136B.getAnnotations(), aVar.f28155b, m34875a(this.f28136B.getVisibility(), aVar.f28158e), this.f28136B.mo35569P(), this.f28136B.mo33778u(), this.f28136B.isInline(), aVar.f28158e, aVar.mo35598c(), C10362n0.f28175a);
            if (b0Var != null) {
                List<C10386v0> a3 = C10322p.m34642a((C10382u) b0Var, this.f28136B.mo35407f(), a2, false, false, (boolean[]) null);
                if (a3 == null) {
                    a.mo35581a(true);
                    a3 = Collections.singletonList(C10283b0.m34364a(b0Var, C10071a.m33892b(aVar.f28154a).mo33724t(), this.f28136B.mo35407f().get(0).getAnnotations()));
                }
                if (a3.size() == 1) {
                    b0Var.mo35572a(m34878a(a2, (C10350h0) this.f28136B));
                    b0Var.mo35454a(a3.get(0));
                } else {
                    throw new IllegalStateException();
                }
            }
            C10374s sVar = this.f28138D;
            C10321o oVar2 = sVar == null ? null : new C10321o(sVar.getAnnotations(), a);
            C10374s sVar2 = this.f28139E;
            if (sVar2 != null) {
                oVar = new C10321o(sVar2.getAnnotations(), a);
            }
            a.mo35580a(a0Var, (C10356k0) b0Var, (C10374s) oVar2, (C10374s) oVar);
            if (aVar.f28160g) {
                C12169j b3 = C12169j.m40181b();
                for (C10352i0 a4 : mo35406d()) {
                    b3.add(a4.mo35448a(a2));
                }
                a.mo35422a((Collection<? extends C10238b>) b3);
            }
            if (isConst() && (gVar = this.f28026l) != null) {
                a.mo35493a(gVar);
            }
            return a;
        }
        m34879a(23);
        throw null;
    }

    /* renamed from: a */
    private static C10237a1 m34875a(C10237a1 a1Var, C10238b.C10239a aVar) {
        return (aVar != C10238b.C10239a.FAKE_OVERRIDE || !C10397z0.m35089a(a1Var.mo34183c())) ? a1Var : C10397z0.f28195h;
    }

    /* renamed from: a */
    private static C10382u m34878a(C11978z0 z0Var, C10350h0 h0Var) {
        if (z0Var == null) {
            m34879a(24);
            throw null;
        } else if (h0Var == null) {
            m34879a(25);
            throw null;
        } else if (h0Var.mo35500W() != null) {
            return h0Var.mo35500W().mo35448a(z0Var);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10340z mo34230a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10352i0 i0Var, C10238b.C10239a aVar, C9939f fVar) {
        if (mVar == null) {
            m34879a(26);
            throw null;
        } else if (wVar == null) {
            m34879a(27);
            throw null;
        } else if (a1Var == null) {
            m34879a(28);
            throw null;
        } else if (aVar == null) {
            m34879a(29);
            throw null;
        } else if (fVar != null) {
            return new C10340z(mVar, i0Var, getAnnotations(), wVar, a1Var, mo35484Z(), fVar, aVar, C10362n0.f28175a, mo35488g0(), isConst(), mo33758F(), mo33772o0(), mo33778u(), mo35575H());
        } else {
            m34879a(30);
            throw null;
        }
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return oVar.mo33628a((C10352i0) this, d);
    }

    /* renamed from: a */
    public C10352i0 m34889a() {
        C10352i0 i0Var = this.f28143p;
        C10352i0 a = i0Var == this ? this : i0Var.mo35404a();
        if (a != null) {
            return a;
        }
        m34879a(31);
        throw null;
    }

    /* renamed from: a */
    public void mo35422a(Collection<? extends C10238b> collection) {
        if (collection != null) {
            this.f28142o = collection;
        } else {
            m34879a(33);
            throw null;
        }
    }

    /* renamed from: a */
    public C10352i0 m34892a(C10359m mVar, C10388w wVar, C10237a1 a1Var, C10238b.C10239a aVar, boolean z) {
        C10341a q = mo35586q();
        q.mo35593a(mVar);
        q.mo35592a((C10238b) null);
        q.mo35594a(wVar);
        q.mo35590a(a1Var);
        q.mo35591a(aVar);
        q.mo35595a(z);
        C10352i0 a = q.mo35596a();
        if (a != null) {
            return a;
        }
        m34879a(35);
        throw null;
    }
}
