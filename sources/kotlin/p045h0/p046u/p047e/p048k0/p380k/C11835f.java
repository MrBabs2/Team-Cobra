package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C10485x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11903b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11904c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11912k;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11916o;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11921r;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.utils.C12164i;

/* renamed from: kotlin.h0.u.e.k0.k.f */
/* compiled from: AbstractTypeChecker.kt */
public final class C11835f {

    /* renamed from: a */
    public static boolean f31538a;

    /* renamed from: b */
    public static final C11835f f31539b = new C11835f();

    /* renamed from: kotlin.h0.u.e.k0.k.f$a */
    /* compiled from: AbstractTypeChecker.kt */
    static final class C11836a extends C10203k implements C9117p<C11910i, C11910i, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C11839g f31540f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11836a(C11839g gVar) {
            super(2);
            this.f31540f = gVar;
        }

        /* renamed from: a */
        public final boolean mo38454a(C11910i iVar, C11910i iVar2) {
            C10202j.m34178b(iVar, "integerLiteralType");
            C10202j.m34178b(iVar2, "type");
            Collection<C11908g> c = this.f31540f.mo38515c(iVar);
            if ((c instanceof Collection) && c.isEmpty()) {
                return false;
            }
            for (C11908g c2 : c) {
                if (C10202j.m34176a((Object) this.f31540f.mo38467c(c2), (Object) this.f31540f.mo38503a(iVar2))) {
                    return true;
                }
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo38454a((C11910i) obj, (C11910i) obj2));
        }
    }

    private C11835f() {
    }

    /* renamed from: c */
    private final boolean m38975c(C11839g gVar, C11908g gVar2, C11908g gVar3) {
        Boolean b = m38972b(gVar, gVar.mo38472h(gVar2), gVar.mo38469e(gVar3));
        if (b != null) {
            boolean booleanValue = b.booleanValue();
            gVar.mo38458a(gVar2, gVar3);
            return booleanValue;
        }
        Boolean a = gVar.mo38458a(gVar2, gVar3);
        if (a != null) {
            return a.booleanValue();
        }
        return m38976c(gVar, gVar.mo38472h(gVar2), gVar.mo38469e(gVar3));
    }

    /* renamed from: a */
    public final boolean mo38451a(C11839g gVar, C11908g gVar2, C11908g gVar3) {
        C10202j.m34178b(gVar, "context");
        C10202j.m34178b(gVar2, "a");
        C10202j.m34178b(gVar3, "b");
        if (gVar2 == gVar3) {
            return true;
        }
        if (f31539b.m38970a(gVar, gVar2) && f31539b.m38970a(gVar, gVar3)) {
            C11910i h = gVar.mo38472h(gVar2);
            if (!gVar.mo38465b(gVar.mo38467c(gVar2), gVar.mo38467c(gVar3))) {
                return false;
            }
            if (gVar.mo38510b((C11908g) h) == 0) {
                if (gVar.mo38474j(gVar2) || gVar.mo38474j(gVar3) || gVar.mo38522e(h) == gVar.mo38522e(gVar.mo38472h(gVar3))) {
                    return true;
                }
                return false;
            }
        }
        if (!f31539b.mo38453b(gVar, gVar2, gVar3) || !f31539b.mo38453b(gVar, gVar3, gVar2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo38453b(C11839g gVar, C11908g gVar2, C11908g gVar3) {
        C10202j.m34178b(gVar, "context");
        C10202j.m34178b(gVar2, "subType");
        C10202j.m34178b(gVar3, "superType");
        if (gVar2 == gVar3) {
            return true;
        }
        return m38975c(gVar, gVar.mo38481o(gVar2), gVar.mo38481o(gVar3));
    }

    /* renamed from: b */
    private final Boolean m38972b(C11839g gVar, C11910i iVar, C11910i iVar2) {
        boolean z = false;
        if (gVar.mo38525f((C11908g) iVar) || gVar.mo38525f((C11908g) iVar2)) {
            if (gVar.mo38471f()) {
                return true;
            }
            if (!gVar.mo38522e(iVar) || gVar.mo38522e(iVar2)) {
                return Boolean.valueOf(C11829d.f31532a.mo38445a((C11916o) gVar, (C11908g) gVar.mo38501a(iVar, false), (C11908g) gVar.mo38501a(iVar2, false)));
            }
            return false;
        } else if (gVar.mo38528g(iVar) || gVar.mo38528g(iVar2)) {
            return true;
        } else {
            C11904c f = gVar.mo38524f(iVar2);
            C11908g a = f != null ? gVar.mo38497a(f) : null;
            if (!(f == null || a == null)) {
                int i = C11832e.f31536c[gVar.mo38460a(iVar, f).ordinal()];
                if (i == 1) {
                    return Boolean.valueOf(mo38453b(gVar, (C11908g) iVar, a));
                }
                if (i == 2 && mo38453b(gVar, (C11908g) iVar, a)) {
                    return true;
                }
            }
            C11913l a2 = gVar.mo38503a(iVar2);
            if (!gVar.mo38526f(a2)) {
                return null;
            }
            boolean z2 = !gVar.mo38522e(iVar2);
            if (!C10485x.f28360a || z2) {
                Collection<C11908g> c = gVar.mo38516c(a2);
                if (!(c instanceof Collection) || !c.isEmpty()) {
                    Iterator<T> it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!f31539b.mo38453b(gVar, (C11908g) iVar, (C11908g) it.next())) {
                            break;
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
            throw new AssertionError("Intersection type should not be marked nullable!: " + iVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fa A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m38976c(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g r13, kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i r14, kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i r15) {
        /*
            r12 = this;
            boolean r0 = f31538a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006c
            boolean r0 = r13.mo38520d((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14)
            if (r0 != 0) goto L_0x001f
            kotlin.h0.u.e.k0.k.j1.l r0 = r13.mo38503a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14)
            boolean r0 = r13.mo38526f((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r0)
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.mo38477k((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g) r14)
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = kotlin.C10485x.f28360a
            if (r3 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x0027
            goto L_0x003e
        L_0x0027:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Not singleClassifierType and not intersection subType: "
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.AssertionError r14 = new java.lang.AssertionError
            r14.<init>(r13)
            throw r14
        L_0x003e:
            boolean r0 = r13.mo38520d((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            if (r0 != 0) goto L_0x004d
            boolean r0 = r13.mo38477k((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g) r15)
            if (r0 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = 0
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            boolean r3 = kotlin.C10485x.f28360a
            if (r3 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x0055
            goto L_0x006c
        L_0x0055:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Not singleClassifierType superType: "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.AssertionError r14 = new java.lang.AssertionError
            r14.<init>(r13)
            throw r14
        L_0x006c:
            kotlin.h0.u.e.k0.k.c r0 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11826c.f31530a
            boolean r0 = r0.mo38443a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            if (r0 != 0) goto L_0x0075
            return r1
        L_0x0075:
            kotlin.h0.u.e.k0.k.j1.i r0 = r13.mo38472h(r14)
            kotlin.h0.u.e.k0.k.j1.i r3 = r13.mo38469e(r15)
            java.lang.Boolean r0 = r12.m38968a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r0, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r3)
            if (r0 == 0) goto L_0x008b
            boolean r0 = r0.booleanValue()
            r13.mo38458a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g) r14, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g) r15)
            return r0
        L_0x008b:
            kotlin.h0.u.e.k0.k.j1.l r0 = r13.mo38503a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            kotlin.h0.u.e.k0.k.j1.l r3 = r13.mo38503a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14)
            boolean r3 = r13.mo38508a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r3, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r0)
            if (r3 == 0) goto L_0x00a0
            int r3 = r13.mo38495a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r0)
            if (r3 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            kotlin.h0.u.e.k0.k.j1.l r3 = r13.mo38503a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            boolean r3 = r13.mo38529g((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r3)
            if (r3 == 0) goto L_0x00ab
            return r2
        L_0x00ab:
            java.util.List r3 = r12.mo38449a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r0)
            int r4 = r3.size()
            if (r4 == 0) goto L_0x01ad
            if (r4 == r2) goto L_0x019e
            kotlin.h0.u.e.k0.k.g$b r4 = r13.mo38464b()
            int[] r5 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11832e.f31534a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r2) goto L_0x019d
            r5 = 2
            if (r4 == r5) goto L_0x018e
            r5 = 3
            if (r4 == r5) goto L_0x00cf
            r5 = 4
            if (r4 == r5) goto L_0x00cf
            goto L_0x00fb
        L_0x00cf:
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00db
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00db
        L_0x00d9:
            r4 = 0
            goto L_0x00f8
        L_0x00db:
            java.util.Iterator r4 = r3.iterator()
        L_0x00df:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d9
            java.lang.Object r5 = r4.next()
            kotlin.h0.u.e.k0.k.j1.i r5 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r5
            kotlin.h0.u.e.k0.k.f r6 = f31539b
            kotlin.h0.u.e.k0.k.j1.j r5 = r13.mo38512b((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r5)
            boolean r5 = r6.mo38452a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j) r5, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            if (r5 == 0) goto L_0x00df
            r4 = 1
        L_0x00f8:
            if (r4 == 0) goto L_0x00fb
            return r2
        L_0x00fb:
            kotlin.h0.u.e.k0.k.g$b r4 = r13.mo38464b()
            kotlin.h0.u.e.k0.k.g$b r5 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g.C11841b.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
            if (r4 == r5) goto L_0x0104
            return r1
        L_0x0104:
            kotlin.h0.u.e.k0.k.j1.a r4 = new kotlin.h0.u.e.k0.k.j1.a
            int r5 = r13.mo38495a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r0)
            r4.<init>(r5)
            int r0 = r13.mo38495a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l) r0)
            r5 = 0
        L_0x0112:
            if (r5 >= r0) goto L_0x0189
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.p262y.C10531p.m35750a(r3, (int) r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r3.iterator()
        L_0x0123:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x017b
            java.lang.Object r8 = r7.next()
            kotlin.h0.u.e.k0.k.j1.i r8 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r8
            kotlin.h0.u.e.k0.k.j1.k r9 = r13.mo38461a((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r8, (int) r5)
            if (r9 == 0) goto L_0x0150
            kotlin.h0.u.e.k0.k.j1.r r10 = r13.mo38513b((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11912k) r9)
            kotlin.h0.u.e.k0.k.j1.r r11 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11921r.INV
            if (r10 != r11) goto L_0x013f
            r10 = 1
            goto L_0x0140
        L_0x013f:
            r10 = 0
        L_0x0140:
            if (r10 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r9 = 0
        L_0x0144:
            if (r9 == 0) goto L_0x0150
            kotlin.h0.u.e.k0.k.j1.g r9 = r13.mo38517c((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11912k) r9)
            if (r9 == 0) goto L_0x0150
            r6.add(r9)
            goto L_0x0123
        L_0x0150:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Incorrect type: "
            r13.append(r0)
            r13.append(r8)
            java.lang.String r0 = ", subType: "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r14 = ", superType: "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L_0x017b:
            kotlin.h0.u.e.k0.k.j1.g r6 = r13.mo38496a((java.util.List<? extends kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g>) r6)
            kotlin.h0.u.e.k0.k.j1.k r6 = r13.mo38527g((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g) r6)
            r4.add(r6)
            int r5 = r5 + 1
            goto L_0x0112
        L_0x0189:
            boolean r13 = r12.mo38452a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j) r4, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            return r13
        L_0x018e:
            java.lang.Object r14 = kotlin.p262y.C10539w.m35799e(r3)
            kotlin.h0.u.e.k0.k.j1.i r14 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14
            kotlin.h0.u.e.k0.k.j1.j r14 = r13.mo38512b((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14)
            boolean r13 = r12.mo38452a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j) r14, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            return r13
        L_0x019d:
            return r1
        L_0x019e:
            java.lang.Object r14 = kotlin.p262y.C10539w.m35799e(r3)
            kotlin.h0.u.e.k0.k.j1.i r14 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14
            kotlin.h0.u.e.k0.k.j1.j r14 = r13.mo38512b((kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14)
            boolean r13 = r12.mo38452a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j) r14, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r15)
            return r13
        L_0x01ad:
            boolean r13 = r12.m38971a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11839g) r13, (kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i) r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p380k.C11835f.m38976c(kotlin.h0.u.e.k0.k.g, kotlin.h0.u.e.k0.k.j1.i, kotlin.h0.u.e.k0.k.j1.i):boolean");
    }

    /* renamed from: a */
    private final Boolean m38968a(C11839g gVar, C11910i iVar, C11910i iVar2) {
        if (!gVar.mo38475j(iVar) && !gVar.mo38475j(iVar2)) {
            return null;
        }
        C11836a aVar = new C11836a(gVar);
        if (gVar.mo38475j(iVar) && gVar.mo38475j(iVar2)) {
            return true;
        }
        if (gVar.mo38475j(iVar)) {
            if (aVar.mo38454a(iVar, iVar2)) {
                return true;
            }
        } else if (gVar.mo38475j(iVar2) && aVar.mo38454a(iVar2, iVar)) {
            return true;
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m38971a(C11839g gVar, C11910i iVar) {
        C11839g.C11842c cVar;
        C11913l a = gVar.mo38503a(iVar);
        if (gVar.mo38523e(a)) {
            return gVar.mo38514b(a);
        }
        if (gVar.mo38514b(gVar.mo38503a(iVar))) {
            return true;
        }
        gVar.mo38470e();
        ArrayDeque<C11910i> c = gVar.mo38466c();
        if (c != null) {
            Set<C11910i> d = gVar.mo38468d();
            if (d != null) {
                c.push(iVar);
                while (!c.isEmpty()) {
                    if (d.size() <= 1000) {
                        C11910i pop = c.pop();
                        C10202j.m34174a((Object) pop, "current");
                        if (d.add(pop)) {
                            if (gVar.mo38473i(pop)) {
                                cVar = C11839g.C11842c.C11845c.f31561a;
                            } else {
                                cVar = C11839g.C11842c.C11844b.f31560a;
                            }
                            if (!(!C10202j.m34176a((Object) cVar, (Object) C11839g.C11842c.C11845c.f31561a))) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                for (C11908g a2 : gVar.mo38516c(gVar.mo38503a(pop))) {
                                    C11910i a3 = cVar.mo38482a(gVar, a2);
                                    if (gVar.mo38514b(gVar.mo38503a(a3))) {
                                        gVar.mo38463a();
                                        return true;
                                    }
                                    c.add(a3);
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + C10539w.m35773a(d, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 63, (Object) null)).toString());
                    }
                }
                gVar.mo38463a();
                return false;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: b */
    private final List<C11910i> m38973b(C11839g gVar, C11910i iVar, C11913l lVar) {
        C11839g.C11842c cVar;
        List<C11910i> a = gVar.mo38459a(iVar, lVar);
        if (a != null) {
            return a;
        }
        if (!gVar.mo38523e(lVar) && gVar.mo38473i(iVar)) {
            return C10529o.m35736a();
        }
        if (!gVar.mo38533i(lVar)) {
            C12164i iVar2 = new C12164i();
            gVar.mo38470e();
            ArrayDeque<C11910i> c = gVar.mo38466c();
            if (c != null) {
                Set<C11910i> d = gVar.mo38468d();
                if (d != null) {
                    c.push(iVar);
                    while (!c.isEmpty()) {
                        if (d.size() <= 1000) {
                            C11910i pop = c.pop();
                            C10202j.m34174a((Object) pop, "current");
                            if (d.add(pop)) {
                                C11910i a2 = gVar.mo38500a(pop, C11903b.FOR_SUBTYPING);
                                if (a2 == null) {
                                    a2 = pop;
                                }
                                if (gVar.mo38465b(gVar.mo38503a(a2), lVar)) {
                                    iVar2.add(a2);
                                    cVar = C11839g.C11842c.C11845c.f31561a;
                                } else if (gVar.mo38510b((C11908g) a2) == 0) {
                                    cVar = C11839g.C11842c.C11844b.f31560a;
                                } else {
                                    cVar = gVar.mo38476k(a2);
                                }
                                if (!(!C10202j.m34176a((Object) cVar, (Object) C11839g.C11842c.C11845c.f31561a))) {
                                    cVar = null;
                                }
                                if (cVar != null) {
                                    for (C11908g a3 : gVar.mo38516c(gVar.mo38503a(pop))) {
                                        c.add(cVar.mo38482a(gVar, a3));
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + C10539w.m35773a(d, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 63, (Object) null)).toString());
                        }
                    }
                    gVar.mo38463a();
                    return iVar2;
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        } else if (!gVar.mo38465b(gVar.mo38503a(iVar), lVar)) {
            return C10529o.m35736a();
        } else {
            C11910i a4 = gVar.mo38500a(iVar, C11903b.FOR_SUBTYPING);
            if (a4 != null) {
                iVar = a4;
            }
            return C10527n.m35729a(iVar);
        }
    }

    /* renamed from: c */
    private final List<C11910i> m38974c(C11839g gVar, C11910i iVar, C11913l lVar) {
        return m38969a(gVar, (List<? extends C11910i>) m38973b(gVar, iVar, lVar));
    }

    /* renamed from: a */
    public final boolean mo38452a(C11839g gVar, C11911j jVar, C11910i iVar) {
        boolean z;
        C10202j.m34178b(gVar, "$this$isSubtypeForSameConstructor");
        C10202j.m34178b(jVar, "capturedSubArguments");
        C10202j.m34178b(iVar, "superType");
        C11913l a = gVar.mo38503a(iVar);
        int a2 = gVar.mo38495a(a);
        for (int i = 0; i < a2; i++) {
            C11912k a3 = gVar.mo38502a((C11908g) iVar, i);
            if (!gVar.mo38507a(a3)) {
                C11908g c = gVar.mo38517c(a3);
                C11912k a4 = gVar.mo38462a(jVar, i);
                boolean z2 = gVar.mo38513b(a4) == C11921r.INV;
                if (!C10485x.f28360a || z2) {
                    C11908g c2 = gVar.mo38517c(a4);
                    C11921r a5 = mo38450a(gVar.mo38505a(gVar.mo38504a(a, i)), gVar.mo38513b(a3));
                    if (a5 == null) {
                        return gVar.mo38471f();
                    }
                    if (gVar.f31547a <= 100) {
                        gVar.f31547a = gVar.f31547a + 1;
                        int i2 = C11832e.f31535b[a5.ordinal()];
                        if (i2 == 1) {
                            z = f31539b.mo38451a(gVar, c2, c);
                        } else if (i2 == 2) {
                            z = f31539b.mo38453b(gVar, c2, c);
                        } else if (i2 == 3) {
                            z = f31539b.mo38453b(gVar, c, c2);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar.f31547a = gVar.f31547a - 1;
                        if (!z) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + c2).toString());
                    }
                } else {
                    throw new AssertionError("Incorrect sub argument: " + a4);
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m38970a(C11839g gVar, C11908g gVar2) {
        return gVar.mo38521d(gVar.mo38467c(gVar2)) && !gVar.mo38479m(gVar2) && !gVar.mo38478l(gVar2) && C10202j.m34176a((Object) gVar.mo38503a(gVar.mo38472h(gVar2)), (Object) gVar.mo38503a(gVar.mo38469e(gVar2)));
    }

    /* renamed from: a */
    public final C11921r mo38450a(C11921r rVar, C11921r rVar2) {
        C10202j.m34178b(rVar, "declared");
        C10202j.m34178b(rVar2, "useSite");
        C11921r rVar3 = C11921r.INV;
        if (rVar == rVar3) {
            return rVar2;
        }
        if (rVar2 == rVar3 || rVar == rVar2) {
            return rVar;
        }
        return null;
    }

    /* renamed from: a */
    private final List<C11910i> m38969a(C11839g gVar, List<? extends C11910i> list) {
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C11911j b = gVar.mo38512b((C11910i) next);
            int a = gVar.mo38494a(b);
            int i = 0;
            while (true) {
                if (i >= a) {
                    break;
                }
                if (!(gVar.mo38519d(gVar.mo38517c(gVar.mo38462a(b, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    /* renamed from: a */
    public final List<C11910i> mo38449a(C11839g gVar, C11910i iVar, C11913l lVar) {
        C11839g.C11842c cVar;
        C10202j.m34178b(gVar, "$this$findCorrespondingSupertypes");
        C10202j.m34178b(iVar, "subType");
        C10202j.m34178b(lVar, "superConstructor");
        if (gVar.mo38473i(iVar)) {
            return m38974c(gVar, iVar, lVar);
        }
        if (!gVar.mo38523e(lVar) && !gVar.mo38531h(lVar)) {
            return m38973b(gVar, iVar, lVar);
        }
        C12164i<C11910i> iVar2 = new C12164i<>();
        gVar.mo38470e();
        ArrayDeque<C11910i> c = gVar.mo38466c();
        if (c != null) {
            Set<C11910i> d = gVar.mo38468d();
            if (d != null) {
                c.push(iVar);
                while (!c.isEmpty()) {
                    if (d.size() <= 1000) {
                        C11910i pop = c.pop();
                        C10202j.m34174a((Object) pop, "current");
                        if (d.add(pop)) {
                            if (gVar.mo38473i(pop)) {
                                iVar2.add(pop);
                                cVar = C11839g.C11842c.C11845c.f31561a;
                            } else {
                                cVar = C11839g.C11842c.C11844b.f31560a;
                            }
                            if (!(!C10202j.m34176a((Object) cVar, (Object) C11839g.C11842c.C11845c.f31561a))) {
                                cVar = null;
                            }
                            if (cVar != null) {
                                for (C11908g a : gVar.mo38516c(gVar.mo38503a(pop))) {
                                    c.add(cVar.mo38482a(gVar, a));
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + C10539w.m35773a(d, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 63, (Object) null)).toString());
                    }
                }
                gVar.mo38463a();
                ArrayList arrayList = new ArrayList();
                for (C11910i iVar3 : iVar2) {
                    C11835f fVar = f31539b;
                    C10202j.m34174a((Object) iVar3, "it");
                    boolean unused = C10536t.m35760a(arrayList, fVar.m38974c(gVar, iVar3, lVar));
                }
                return arrayList;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }
}
