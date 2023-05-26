package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.C10221n;
import kotlin.C10483v;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11870h;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10369q;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10385v;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10322p;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10339y;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10340z;
import kotlin.reflect.jvm.internal.impl.utils.C12169j;

/* renamed from: kotlin.h0.u.e.k0.h.i */
/* compiled from: OverridingUtil */
public class C10007i {

    /* renamed from: b */
    private static final List<C10000d> f27594b;

    /* renamed from: c */
    public static final C10007i f27595c = new C10007i(new C10008a());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11868g.C11869a f27596a;

    /* renamed from: kotlin.h0.u.e.k0.h.i$a */
    /* compiled from: OverridingUtil */
    static class C10008a implements C11868g.C11869a {
        C10008a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m33753a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo35203a(C11953s0 s0Var, C11953s0 s0Var2) {
            if (s0Var == null) {
                m33753a(0);
                throw null;
            } else if (s0Var2 != null) {
                return s0Var.equals(s0Var2);
            } else {
                m33753a(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$b */
    /* compiled from: OverridingUtil */
    static class C10009b implements C9117p<D, D, C10221n<C10230a, C10230a>> {
        C10009b() {
        }

        /* renamed from: a */
        public C10221n<C10230a, C10230a> invoke(D d, D d2) {
            return new C10221n<>(d, d2);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$c */
    /* compiled from: OverridingUtil */
    class C10010c implements C11868g.C11869a {

        /* renamed from: a */
        final /* synthetic */ Map f27597a;

        C10010c(Map map) {
            this.f27597a = map;
        }

        /* renamed from: a */
        private static /* synthetic */ void m33756a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo35203a(C11953s0 s0Var, C11953s0 s0Var2) {
            if (s0Var == null) {
                m33756a(0);
                throw null;
            } else if (s0Var2 == null) {
                m33756a(1);
                throw null;
            } else if (C10007i.this.f27596a.mo35203a(s0Var, s0Var2)) {
                return true;
            } else {
                C11953s0 s0Var3 = (C11953s0) this.f27597a.get(s0Var);
                C11953s0 s0Var4 = (C11953s0) this.f27597a.get(s0Var2);
                if ((s0Var3 == null || !s0Var3.equals(s0Var2)) && (s0Var4 == null || !s0Var4.equals(s0Var))) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$d */
    /* compiled from: OverridingUtil */
    static class C10011d implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10359m f27599f;

        C10011d(C10359m mVar) {
            this.f27599f = mVar;
        }

        /* renamed from: a */
        public Boolean invoke(C10238b bVar) {
            return Boolean.valueOf(bVar.mo33762b() == this.f27599f);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$e */
    /* compiled from: OverridingUtil */
    static class C10012e implements C9113l<C10238b, C10230a> {
        C10012e() {
        }

        /* renamed from: a */
        public C10238b mo35216a(C10238b bVar) {
            return bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C10238b bVar = (C10238b) obj;
            mo35216a(bVar);
            return bVar;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$f */
    /* compiled from: OverridingUtil */
    static class C10013f implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C10342e f27600f;

        C10013f(C10342e eVar) {
            this.f27600f = eVar;
        }

        /* renamed from: a */
        public Boolean invoke(C10238b bVar) {
            return Boolean.valueOf(!C10397z0.m35089a(bVar.getVisibility()) && C10397z0.m35091a((C10369q) bVar, (C10359m) this.f27600f));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$g */
    /* compiled from: OverridingUtil */
    static class C10014g implements C9113l<C10238b, C10230a> {
        C10014g() {
        }

        /* renamed from: a */
        public C10230a mo35218a(C10238b bVar) {
            return bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C10238b bVar = (C10238b) obj;
            mo35218a(bVar);
            return bVar;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$h */
    /* compiled from: OverridingUtil */
    static class C10015h implements C9113l<C10238b, C10483v> {

        /* renamed from: f */
        final /* synthetic */ C10006h f27601f;

        /* renamed from: g */
        final /* synthetic */ C10238b f27602g;

        C10015h(C10006h hVar, C10238b bVar) {
            this.f27601f = hVar;
            this.f27602g = bVar;
        }

        /* renamed from: a */
        public C10483v invoke(C10238b bVar) {
            this.f27601f.mo35209a(this.f27602g, bVar);
            return C10483v.f28357a;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$i */
    /* compiled from: OverridingUtil */
    static /* synthetic */ class C10016i {

        /* renamed from: a */
        static final /* synthetic */ int[] f27603a;

        /* renamed from: b */
        static final /* synthetic */ int[] f27604b;

        /* renamed from: c */
        static final /* synthetic */ int[] f27605c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.descriptors.w[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.C10388w.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27605c = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.descriptors.w r2 = kotlin.reflect.jvm.internal.impl.descriptors.C10388w.FINAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27605c     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.descriptors.w r3 = kotlin.reflect.jvm.internal.impl.descriptors.C10388w.SEALED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f27605c     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.descriptors.w r4 = kotlin.reflect.jvm.internal.impl.descriptors.C10388w.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f27605c     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.descriptors.w r5 = kotlin.reflect.jvm.internal.impl.descriptors.C10388w.ABSTRACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                kotlin.h0.u.e.k0.h.i$j$a[] r4 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i.C10017j.C10018a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f27604b = r4
                kotlin.h0.u.e.k0.h.i$j$a r5 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i.C10017j.C10018a.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f27604b     // Catch:{ NoSuchFieldError -> 0x004e }
                kotlin.h0.u.e.k0.h.i$j$a r5 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i.C10017j.C10018a.CONFLICT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f27604b     // Catch:{ NoSuchFieldError -> 0x0058 }
                kotlin.h0.u.e.k0.h.i$j$a r5 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i.C10017j.C10018a.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                kotlin.h0.u.e.k0.h.d$b[] r4 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d.C10002b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f27603a = r4
                kotlin.h0.u.e.k0.h.d$b r5 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d.C10002b.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f27603a     // Catch:{ NoSuchFieldError -> 0x0073 }
                kotlin.h0.u.e.k0.h.d$b r4 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d.C10002b.CONFLICT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f27603a     // Catch:{ NoSuchFieldError -> 0x007d }
                kotlin.h0.u.e.k0.h.d$b r1 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d.C10002b.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f27603a     // Catch:{ NoSuchFieldError -> 0x0087 }
                kotlin.h0.u.e.k0.h.d$b r1 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C10000d.C10002b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i.C10016i.<clinit>():void");
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.i$j */
    /* compiled from: OverridingUtil */
    public static class C10017j {

        /* renamed from: b */
        private static final C10017j f27606b = new C10017j(C10018a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        private final C10018a f27607a;

        /* renamed from: kotlin.h0.u.e.k0.h.i$j$a */
        /* compiled from: OverridingUtil */
        public enum C10018a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public C10017j(C10018a aVar, String str) {
            if (aVar == null) {
                m33764a(3);
                throw null;
            } else if (str != null) {
                this.f27607a = aVar;
            } else {
                m33764a(4);
                throw null;
            }
        }

        /* renamed from: a */
        public static C10017j m33763a(String str) {
            if (str != null) {
                return new C10017j(C10018a.CONFLICT, str);
            }
            m33764a(2);
            throw null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void m33764a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = 2
                goto L_0x001c
            L_0x001b:
                r5 = 3
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i.C10017j.m33764a(int):void");
        }

        /* renamed from: b */
        public static C10017j m33765b() {
            C10017j jVar = f27606b;
            if (jVar != null) {
                return jVar;
            }
            m33764a(0);
            throw null;
        }

        /* renamed from: b */
        public static C10017j m33766b(String str) {
            if (str != null) {
                return new C10017j(C10018a.INCOMPATIBLE, str);
            }
            m33764a(1);
            throw null;
        }

        /* renamed from: a */
        public C10018a mo35220a() {
            C10018a aVar = this.f27607a;
            if (aVar != null) {
                return aVar;
            }
            m33764a(5);
            throw null;
        }
    }

    static {
        Class<C10000d> cls = C10000d.class;
        f27594b = C10539w.m35815n(ServiceLoader.load(cls, cls.getClassLoader()));
    }

    private C10007i(C11868g.C11869a aVar) {
        this.f27596a = aVar;
    }

    /* renamed from: a */
    private static /* synthetic */ void m33730a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 5 || i3 == 9 || i3 == 14 || i3 == 87 || i3 == 90 || i3 == 95 || i3 == 37 || i3 == 38)) {
            switch (i3) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i3) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            switch (i3) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    break;
                                default:
                                    switch (i3) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 5 || i3 == 9 || i3 == 14 || i3 == 87 || i3 == 90 || i3 == 95 || i3 == 37 || i3 == 38)) {
            switch (i3) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i3) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            switch (i3) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    break;
                                default:
                                    switch (i3) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 1:
            case 2:
                objArr[0] = "candidateSet";
                break;
            case 3:
                objArr[0] = "transformFirst";
                break;
            case 4:
            case 5:
            case 9:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 37:
            case 38:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 82:
            case 83:
            case 84:
            case 87:
            case 90:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 6:
                objArr[0] = "f";
                break;
            case 7:
                objArr[0] = "g";
                break;
            case 8:
            case 10:
                objArr[0] = "descriptor";
                break;
            case 11:
                objArr[0] = "result";
                break;
            case 12:
            case 15:
            case 23:
            case 33:
                objArr[0] = "superDescriptor";
                break;
            case 13:
            case 16:
            case 24:
            case 34:
                objArr[0] = "subDescriptor";
                break;
            case 35:
                objArr[0] = "firstParameters";
                break;
            case 36:
                objArr[0] = "secondParameters";
                break;
            case 39:
                objArr[0] = "typeInSuper";
                break;
            case 40:
                objArr[0] = "typeInSub";
                break;
            case 41:
            case 44:
                objArr[0] = "typeChecker";
                break;
            case 42:
                objArr[0] = "superTypeParameter";
                break;
            case 43:
                objArr[0] = "subTypeParameter";
                break;
            case 45:
                objArr[0] = "name";
                break;
            case 46:
                objArr[0] = "membersFromSupertypes";
                break;
            case 47:
                objArr[0] = "membersFromCurrent";
                break;
            case 48:
            case 54:
            case 57:
            case 78:
            case 81:
            case 88:
                objArr[0] = "current";
                break;
            case 49:
            case 55:
            case 59:
            case 79:
            case 98:
                objArr[0] = "strategy";
                break;
            case 50:
                objArr[0] = "overriding";
                break;
            case 51:
                objArr[0] = "fromSuper";
                break;
            case 52:
                objArr[0] = "fromCurrent";
                break;
            case 53:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 56:
            case 58:
                objArr[0] = "notOverridden";
                break;
            case 60:
            case 62:
            case 66:
                objArr[0] = "a";
                break;
            case 61:
            case 63:
            case 68:
                objArr[0] = "b";
                break;
            case 64:
                objArr[0] = "candidate";
                break;
            case 65:
            case 80:
            case 85:
            case 101:
                objArr[0] = "descriptors";
                break;
            case 67:
                objArr[0] = "aReturnType";
                break;
            case 69:
                objArr[0] = "bReturnType";
                break;
            case 70:
            case 77:
                objArr[0] = "overridables";
                break;
            case 71:
            case 93:
                objArr[0] = "descriptorByHandle";
                break;
            case 86:
                objArr[0] = "classModality";
                break;
            case 89:
                objArr[0] = "toFilter";
                break;
            case 91:
            case 96:
                objArr[0] = "overrider";
                break;
            case 92:
            case 97:
                objArr[0] = "extractFrom";
                break;
            case 94:
                objArr[0] = "onConflict";
                break;
            case 99:
            case 100:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i3 == 4 || i3 == 5) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 9) {
            if (i3 != 14) {
                if (i3 == 87) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 90) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 95) {
                    if (i3 != 37 && i3 != 38) {
                        switch (i3) {
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (i3) {
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 72:
                                            case 73:
                                            case 74:
                                            case 75:
                                            case 76:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeChecker";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
                objArr[2] = "filterOutOverridden";
                break;
            case 2:
            case 3:
                objArr[2] = "filterOverrides";
                break;
            case 4:
            case 5:
            case 9:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 37:
            case 38:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 82:
            case 83:
            case 84:
            case 87:
            case 90:
            case 95:
                break;
            case 6:
            case 7:
                objArr[2] = "overrides";
                break;
            case 8:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 10:
            case 11:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 12:
            case 13:
            case 15:
            case 16:
                objArr[2] = "isOverridableBy";
                break;
            case 23:
            case 24:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 33:
            case 34:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 35:
            case 36:
                objArr[2] = "createTypeChecker";
                break;
            case 39:
            case 40:
            case 41:
                objArr[2] = "areTypesEquivalent";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 50:
            case 51:
                objArr[2] = "isVisibleForOverride";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 56:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 57:
            case 58:
            case 59:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 60:
            case 61:
                objArr[2] = "isMoreSpecific";
                break;
            case 62:
            case 63:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 64:
            case 65:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 66:
            case 67:
            case 68:
            case 69:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 70:
            case 71:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 77:
            case 78:
            case 79:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 80:
            case 81:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 85:
            case 86:
                objArr[2] = "getMinimalModality";
                break;
            case 88:
            case 89:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 99:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 100:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 101:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 5 || i3 == 9 || i3 == 14 || i3 == 87 || i3 == 90 || i3 == 95 || i3 == 37 || i3 == 38)) {
            switch (i3) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i3) {
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            break;
                        default:
                            switch (i3) {
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                    break;
                                default:
                                    switch (i3) {
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static Set<C10238b> m33744b(C10238b bVar) {
        if (bVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m33733a(bVar, (Set<C10238b>) linkedHashSet);
            return linkedHashSet;
        }
        m33730a(8);
        throw null;
    }

    /* renamed from: c */
    public static C10017j.C10018a m33747c(C10230a aVar, C10230a aVar2) {
        C10017j.C10018a a = f27595c.mo35211a(aVar2, aVar, (C10342e) null).mo35220a();
        C10017j.C10018a a2 = f27595c.mo35211a(aVar, aVar2, (C10342e) null).mo35220a();
        C10017j.C10018a aVar3 = C10017j.C10018a.OVERRIDABLE;
        if (a == aVar3 && a2 == aVar3) {
            return aVar3;
        }
        C10017j.C10018a aVar4 = C10017j.C10018a.CONFLICT;
        return (a == aVar4 || a2 == aVar4) ? C10017j.C10018a.CONFLICT : C10017j.C10018a.INCOMPATIBLE;
    }

    /* renamed from: d */
    public static boolean m33748d(C10230a aVar, C10230a aVar2) {
        if (aVar == null) {
            m33730a(60);
            throw null;
        } else if (aVar2 != null) {
            C11824b0 returnType = aVar.getReturnType();
            C11824b0 returnType2 = aVar2.getReturnType();
            if (!m33741a((C10369q) aVar, (C10369q) aVar2)) {
                return false;
            }
            if (aVar instanceof C10382u) {
                return m33739a(aVar, returnType, aVar2, returnType2);
            }
            if (aVar instanceof C10352i0) {
                C10352i0 i0Var = (C10352i0) aVar;
                C10352i0 i0Var2 = (C10352i0) aVar2;
                if (!m33740a((C10350h0) i0Var.getSetter(), (C10350h0) i0Var2.getSetter())) {
                    return false;
                }
                if (i0Var.mo35484Z() && i0Var2.mo35484Z()) {
                    return f27595c.m33726a(aVar.getTypeParameters(), aVar2.getTypeParameters()).mo38535a(returnType, returnType2);
                }
                if ((i0Var.mo35484Z() || !i0Var2.mo35484Z()) && m33739a(aVar, returnType, aVar2, returnType2)) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        } else {
            m33730a(61);
            throw null;
        }
    }

    /* renamed from: e */
    public static <D extends C10230a> boolean m33749e(D d, D d2) {
        if (d == null) {
            m33730a(6);
            throw null;
        } else if (d2 == null) {
            m33730a(7);
            throw null;
        } else if (!d.equals(d2) && C9992a.f27571a.mo35201a((C10359m) d.mo35404a(), (C10359m) d2.mo35404a())) {
            return true;
        } else {
            C10230a a = d2.mo35404a();
            for (C10230a a2 : C9999c.m33657a(d)) {
                if (C9992a.f27571a.mo35201a((C10359m) a, (C10359m) a2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public static C10007i m33724a(C11868g.C11869a aVar) {
        if (aVar != null) {
            return new C10007i(aVar);
        }
        m33730a(0);
        throw null;
    }

    /* renamed from: a */
    public static <D extends C10230a> Set<D> m33721a(Set<D> set) {
        if (set != null) {
            return m33722a(set, new C10009b());
        }
        m33730a(1);
        throw null;
    }

    /* renamed from: b */
    public static C10017j m33745b(C10230a aVar, C10230a aVar2) {
        boolean z;
        if (aVar == null) {
            m33730a(33);
            throw null;
        } else if (aVar2 != null) {
            boolean z2 = aVar instanceof C10382u;
            if ((z2 && !(aVar2 instanceof C10382u)) || (((z = aVar instanceof C10352i0)) && !(aVar2 instanceof C10352i0))) {
                return C10017j.m33766b("Member kind mismatch");
            }
            if (!z2 && !z) {
                throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
            } else if (!aVar.getName().equals(aVar2.getName())) {
                return C10017j.m33766b("Name mismatch");
            } else {
                C10017j a = m33723a(aVar, aVar2);
                if (a != null) {
                    return a;
                }
                return null;
            }
        } else {
            m33730a(34);
            throw null;
        }
    }

    /* renamed from: a */
    public static <D> Set<D> m33722a(Set<D> set, C9117p<? super D, ? super D, C10221n<C10230a, C10230a>> pVar) {
        if (set == null) {
            m33730a(2);
            throw null;
        } else if (pVar == null) {
            m33730a(3);
            throw null;
        } else if (set.size() > 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (D next : set) {
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        linkedHashSet.add(next);
                        break;
                    }
                    C10221n invoke = pVar.invoke(next, it.next());
                    C10230a aVar = (C10230a) invoke.mo35389a();
                    C10230a aVar2 = (C10230a) invoke.mo35390b();
                    if (m33749e(aVar, aVar2)) {
                        it.remove();
                    } else if (m33749e(aVar2, aVar)) {
                        break;
                    }
                }
            }
            return linkedHashSet;
        } else if (set != null) {
            return set;
        } else {
            m33730a(4);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.reflect.jvm.internal.impl.descriptors.C10237a1 m33746b(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.C10238b> r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0058
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x000c
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r5 = kotlin.reflect.jvm.internal.impl.descriptors.C10397z0.f28198k
            return r5
        L_0x000c:
            java.util.Iterator r1 = r5.iterator()
        L_0x0010:
            r2 = r0
        L_0x0011:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C10238b) r3
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r3 = r3.getVisibility()
            if (r2 != 0) goto L_0x0025
        L_0x0023:
            r2 = r3
            goto L_0x0011
        L_0x0025:
            java.lang.Integer r4 = kotlin.reflect.jvm.internal.impl.descriptors.C10397z0.m35085a((kotlin.reflect.jvm.internal.impl.descriptors.C10237a1) r3, (kotlin.reflect.jvm.internal.impl.descriptors.C10237a1) r2)
            if (r4 != 0) goto L_0x002c
            goto L_0x0010
        L_0x002c:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0011
            goto L_0x0023
        L_0x0033:
            if (r2 != 0) goto L_0x0036
            return r0
        L_0x0036:
            java.util.Iterator r5 = r5.iterator()
        L_0x003a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C10238b) r1
            kotlin.reflect.jvm.internal.impl.descriptors.a1 r1 = r1.getVisibility()
            java.lang.Integer r1 = kotlin.reflect.jvm.internal.impl.descriptors.C10397z0.m35085a((kotlin.reflect.jvm.internal.impl.descriptors.C10237a1) r2, (kotlin.reflect.jvm.internal.impl.descriptors.C10237a1) r1)
            if (r1 == 0) goto L_0x0056
            int r1 = r1.intValue()
            if (r1 >= 0) goto L_0x003a
        L_0x0056:
            return r0
        L_0x0057:
            return r2
        L_0x0058:
            r5 = 101(0x65, float:1.42E-43)
            m33730a((int) r5)
            goto L_0x005f
        L_0x005e:
            throw r0
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i.m33746b(java.util.Collection):kotlin.reflect.jvm.internal.impl.descriptors.a1");
    }

    /* renamed from: a */
    private static void m33733a(C10238b bVar, Set<C10238b> set) {
        if (bVar == null) {
            m33730a(10);
            throw null;
        } else if (set == null) {
            m33730a(11);
            throw null;
        } else if (bVar.mo35423g().mo35424a()) {
            set.add(bVar);
        } else if (!bVar.mo35406d().isEmpty()) {
            for (C10238b a : bVar.mo35406d()) {
                m33733a(a, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    /* renamed from: a */
    public C10017j mo35211a(C10230a aVar, C10230a aVar2, C10342e eVar) {
        if (aVar == null) {
            m33730a(12);
            throw null;
        } else if (aVar2 != null) {
            C10017j a = mo35212a(aVar, aVar2, eVar, false);
            if (a != null) {
                return a;
            }
            m33730a(14);
            throw null;
        } else {
            m33730a(13);
            throw null;
        }
    }

    /* renamed from: a */
    public C10017j mo35212a(C10230a aVar, C10230a aVar2, C10342e eVar, boolean z) {
        if (aVar == null) {
            m33730a(15);
            throw null;
        } else if (aVar2 != null) {
            C10017j a = mo35213a(aVar, aVar2, z);
            boolean z2 = a.mo35220a() == C10017j.C10018a.OVERRIDABLE;
            for (C10000d next : f27594b) {
                if (next.mo34170a() != C10000d.C10001a.CONFLICTS_ONLY && (!z2 || next.mo34170a() != C10000d.C10001a.SUCCESS_ONLY)) {
                    int i = C10016i.f27603a[next.mo34171a(aVar, aVar2, eVar).ordinal()];
                    if (i == 1) {
                        z2 = true;
                    } else if (i == 2) {
                        C10017j a2 = C10017j.m33763a("External condition failed");
                        if (a2 != null) {
                            return a2;
                        }
                        m33730a(17);
                        throw null;
                    } else if (i == 3) {
                        C10017j b = C10017j.m33766b("External condition");
                        if (b != null) {
                            return b;
                        }
                        m33730a(18);
                        throw null;
                    }
                }
            }
            if (z2) {
                for (C10000d next2 : f27594b) {
                    if (next2.mo34170a() == C10000d.C10001a.CONFLICTS_ONLY) {
                        int i2 = C10016i.f27603a[next2.mo34171a(aVar, aVar2, eVar).ordinal()];
                        if (i2 == 1) {
                            throw new IllegalStateException("Contract violation in " + next2.getClass().getName() + " condition. It's not supposed to end with success");
                        } else if (i2 == 2) {
                            C10017j a3 = C10017j.m33763a("External condition failed");
                            if (a3 != null) {
                                return a3;
                            }
                            m33730a(20);
                            throw null;
                        } else if (i2 == 3) {
                            C10017j b2 = C10017j.m33766b("External condition");
                            if (b2 != null) {
                                return b2;
                            }
                            m33730a(21);
                            throw null;
                        }
                    }
                }
                C10017j b3 = C10017j.m33765b();
                if (b3 != null) {
                    return b3;
                }
                m33730a(22);
                throw null;
            } else if (a != null) {
                return a;
            } else {
                m33730a(19);
                throw null;
            }
        } else {
            m33730a(16);
            throw null;
        }
    }

    /* renamed from: a */
    public C10017j mo35213a(C10230a aVar, C10230a aVar2, boolean z) {
        if (aVar == null) {
            m33730a(23);
            throw null;
        } else if (aVar2 != null) {
            C10017j b = m33745b(aVar, aVar2);
            if (b == null) {
                List<C11824b0> a = m33720a(aVar);
                List<C11824b0> a2 = m33720a(aVar2);
                List<C10375s0> typeParameters = aVar.getTypeParameters();
                List<C10375s0> typeParameters2 = aVar2.getTypeParameters();
                int i = 0;
                if (typeParameters.size() != typeParameters2.size()) {
                    while (i < a.size()) {
                        if (!C11868g.f31579a.mo38535a(a.get(i), a2.get(i))) {
                            C10017j b2 = C10017j.m33766b("Type parameter number mismatch");
                            if (b2 != null) {
                                return b2;
                            }
                            m33730a(26);
                            throw null;
                        }
                        i++;
                    }
                    C10017j a3 = C10017j.m33763a("Type parameter number mismatch");
                    if (a3 != null) {
                        return a3;
                    }
                    m33730a(27);
                    throw null;
                }
                C11868g a4 = m33726a(typeParameters, typeParameters2);
                for (int i2 = 0; i2 < typeParameters.size(); i2++) {
                    if (!m33742a(typeParameters.get(i2), typeParameters2.get(i2), a4)) {
                        C10017j b3 = C10017j.m33766b("Type parameter bounds mismatch");
                        if (b3 != null) {
                            return b3;
                        }
                        m33730a(28);
                        throw null;
                    }
                }
                for (int i3 = 0; i3 < a.size(); i3++) {
                    if (!m33737a(a.get(i3), a2.get(i3), a4)) {
                        C10017j b4 = C10017j.m33766b("Value parameter type mismatch");
                        if (b4 != null) {
                            return b4;
                        }
                        m33730a(29);
                        throw null;
                    }
                }
                if (!(aVar instanceof C10382u) || !(aVar2 instanceof C10382u) || ((C10382u) aVar).isSuspend() == ((C10382u) aVar2).isSuspend()) {
                    if (z) {
                        C11824b0 returnType = aVar.getReturnType();
                        C11824b0 returnType2 = aVar2.getReturnType();
                        if (!(returnType == null || returnType2 == null)) {
                            if (C11830d0.m38958a(returnType2) && C11830d0.m38958a(returnType)) {
                                i = 1;
                            }
                            if (i == 0 && !a4.mo38536b(returnType2, returnType)) {
                                C10017j a5 = C10017j.m33763a("Return type mismatch");
                                if (a5 != null) {
                                    return a5;
                                }
                                m33730a(31);
                                throw null;
                            }
                        }
                    }
                    C10017j b5 = C10017j.m33765b();
                    if (b5 != null) {
                        return b5;
                    }
                    m33730a(32);
                    throw null;
                }
                C10017j a6 = C10017j.m33763a("Incompatible suspendability");
                if (a6 != null) {
                    return a6;
                }
                m33730a(30);
                throw null;
            } else if (b != null) {
                return b;
            } else {
                m33730a(25);
                throw null;
            }
        } else {
            m33730a(24);
            throw null;
        }
    }

    /* renamed from: a */
    private C11868g m33726a(List<C10375s0> list, List<C10375s0> list2) {
        if (list == null) {
            m33730a(35);
            throw null;
        } else if (list2 == null) {
            m33730a(36);
            throw null;
        } else if (list.isEmpty()) {
            C11868g a = C11870h.m39165a(this.f27596a);
            if (a != null) {
                return a;
            }
            m33730a(37);
            throw null;
        } else {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(list.get(i).mo33766h(), list2.get(i).mo33766h());
            }
            C11868g a2 = C11870h.m39165a((C11868g.C11869a) new C10010c(hashMap));
            if (a2 != null) {
                return a2;
            }
            m33730a(38);
            throw null;
        }
    }

    /* renamed from: a */
    private static C10017j m33723a(C10230a aVar, C10230a aVar2) {
        boolean z = true;
        boolean z2 = aVar.mo35405b0() == null;
        if (aVar2.mo35405b0() != null) {
            z = false;
        }
        if (z2 != z) {
            return C10017j.m33766b("Receiver presence mismatch");
        }
        if (aVar.mo35407f().size() != aVar2.mo35407f().size()) {
            return C10017j.m33766b("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m33737a(C11824b0 b0Var, C11824b0 b0Var2, C11868g gVar) {
        if (b0Var == null) {
            m33730a(39);
            throw null;
        } else if (b0Var2 == null) {
            m33730a(40);
            throw null;
        } else if (gVar != null) {
            if ((C11830d0.m38958a(b0Var) && C11830d0.m38958a(b0Var2)) || gVar.mo38535a(b0Var, b0Var2)) {
                return true;
            }
            return false;
        } else {
            m33730a(41);
            throw null;
        }
    }

    /* renamed from: a */
    private static boolean m33742a(C10375s0 s0Var, C10375s0 s0Var2, C11868g gVar) {
        if (s0Var == null) {
            m33730a(42);
            throw null;
        } else if (s0Var2 == null) {
            m33730a(43);
            throw null;
        } else if (gVar != null) {
            List<C11824b0> upperBounds = s0Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(s0Var2.getUpperBounds());
            if (upperBounds.size() != arrayList.size()) {
                return false;
            }
            for (C11824b0 next : upperBounds) {
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    if (m33737a(next, (C11824b0) listIterator.next(), gVar)) {
                        listIterator.remove();
                    }
                }
                return false;
            }
            return true;
        } else {
            m33730a(44);
            throw null;
        }
    }

    /* renamed from: a */
    private static List<C11824b0> m33720a(C10230a aVar) {
        C10358l0 b0 = aVar.mo35405b0();
        ArrayList arrayList = new ArrayList();
        if (b0 != null) {
            arrayList.add(b0.getType());
        }
        for (C10386v0 type : aVar.mo35407f()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m33732a(C9939f fVar, Collection<? extends C10238b> collection, Collection<? extends C10238b> collection2, C10342e eVar, C10006h hVar) {
        if (fVar == null) {
            m33730a(45);
            throw null;
        } else if (collection == null) {
            m33730a(46);
            throw null;
        } else if (collection2 == null) {
            m33730a(47);
            throw null;
        } else if (eVar == null) {
            m33730a(48);
            throw null;
        } else if (hVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
            for (C10238b a : collection2) {
                linkedHashSet.removeAll(m33717a(a, collection, eVar, hVar));
            }
            m33735a(eVar, (Collection<C10238b>) linkedHashSet, hVar);
        } else {
            m33730a(49);
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m33743a(C10385v vVar, C10385v vVar2) {
        if (vVar == null) {
            m33730a(50);
            throw null;
        } else if (vVar2 != null) {
            return !C10397z0.m35089a(vVar2.getVisibility()) && C10397z0.m35091a((C10369q) vVar2, (C10359m) vVar);
        } else {
            m33730a(51);
            throw null;
        }
    }

    /* renamed from: a */
    private static Collection<C10238b> m33717a(C10238b bVar, Collection<? extends C10238b> collection, C10342e eVar, C10006h hVar) {
        if (bVar == null) {
            m33730a(52);
            throw null;
        } else if (collection == null) {
            m33730a(53);
            throw null;
        } else if (eVar == null) {
            m33730a(54);
            throw null;
        } else if (hVar != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            C12169j b = C12169j.m40181b();
            for (C10238b bVar2 : collection) {
                C10017j.C10018a a = f27595c.mo35211a((C10230a) bVar2, (C10230a) bVar, eVar).mo35220a();
                boolean a2 = m33743a((C10385v) bVar, (C10385v) bVar2);
                int i = C10016i.f27604b[a.ordinal()];
                if (i == 1) {
                    if (a2) {
                        b.add(bVar2);
                    }
                    arrayList.add(bVar2);
                } else if (i == 2) {
                    if (a2) {
                        hVar.mo35210b(bVar2, bVar);
                    }
                    arrayList.add(bVar2);
                }
            }
            hVar.mo34193a(bVar, (Collection<? extends C10238b>) b);
            return arrayList;
        } else {
            m33730a(55);
            throw null;
        }
    }

    /* renamed from: a */
    private static boolean m33736a(Collection<C10238b> collection) {
        if (collection == null) {
            m33730a(56);
            throw null;
        } else if (collection.size() < 2) {
            return true;
        } else {
            return C10539w.m35783b(collection, new C10011d(collection.iterator().next().mo33762b()));
        }
    }

    /* renamed from: a */
    private static void m33735a(C10342e eVar, Collection<C10238b> collection, C10006h hVar) {
        if (eVar == null) {
            m33730a(57);
            throw null;
        } else if (collection == null) {
            m33730a(58);
            throw null;
        } else if (hVar == null) {
            m33730a(59);
            throw null;
        } else if (m33736a(collection)) {
            for (C10238b singleton : collection) {
                m33731a((Collection<C10238b>) Collections.singleton(singleton), eVar, hVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                m33731a(m33718a(C10022k.m33771a(linkedList), (Queue<C10238b>) linkedList, hVar), eVar, hVar);
            }
        }
    }

    /* renamed from: a */
    private static boolean m33741a(C10369q qVar, C10369q qVar2) {
        if (qVar == null) {
            m33730a(62);
            throw null;
        } else if (qVar2 != null) {
            Integer a = C10397z0.m35085a(qVar.getVisibility(), qVar2.getVisibility());
            return a == null || a.intValue() >= 0;
        } else {
            m33730a(63);
            throw null;
        }
    }

    /* renamed from: a */
    private static boolean m33740a(C10350h0 h0Var, C10350h0 h0Var2) {
        if (h0Var == null || h0Var2 == null) {
            return true;
        }
        return m33741a((C10369q) h0Var, (C10369q) h0Var2);
    }

    /* renamed from: a */
    private static boolean m33738a(C10230a aVar, Collection<C10230a> collection) {
        if (aVar == null) {
            m33730a(64);
            throw null;
        } else if (collection != null) {
            for (C10230a d : collection) {
                if (!m33748d(aVar, d)) {
                    return false;
                }
            }
            return true;
        } else {
            m33730a(65);
            throw null;
        }
    }

    /* renamed from: a */
    private static boolean m33739a(C10230a aVar, C11824b0 b0Var, C10230a aVar2, C11824b0 b0Var2) {
        if (aVar == null) {
            m33730a(66);
            throw null;
        } else if (b0Var == null) {
            m33730a(67);
            throw null;
        } else if (aVar2 == null) {
            m33730a(68);
            throw null;
        } else if (b0Var2 != null) {
            return f27595c.m33726a(aVar.getTypeParameters(), aVar2.getTypeParameters()).mo38536b(b0Var, b0Var2);
        } else {
            m33730a(69);
            throw null;
        }
    }

    /* renamed from: a */
    public static <H> H m33715a(Collection<H> collection, C9113l<H, C10230a> lVar) {
        H h;
        if (collection == null) {
            m33730a(70);
            throw null;
        } else if (lVar == null) {
            m33730a(71);
            throw null;
        } else if (collection.size() == 1) {
            H e = C10539w.m35798e(collection);
            if (e != null) {
                return e;
            }
            m33730a(72);
            throw null;
        } else {
            ArrayList arrayList = new ArrayList(2);
            List<C10230a> d = C10539w.m35795d(collection, lVar);
            H e2 = C10539w.m35798e(collection);
            C10230a invoke = lVar.invoke(e2);
            for (H next : collection) {
                C10230a invoke2 = lVar.invoke(next);
                if (m33738a(invoke2, (Collection<C10230a>) d)) {
                    arrayList.add(next);
                }
                if (m33748d(invoke2, invoke) && !m33748d(invoke, invoke2)) {
                    e2 = next;
                }
            }
            if (arrayList.isEmpty()) {
                if (e2 != null) {
                    return e2;
                }
                m33730a(73);
                throw null;
            } else if (arrayList.size() == 1) {
                H e3 = C10539w.m35798e(arrayList);
                if (e3 != null) {
                    return e3;
                }
                m33730a(74);
                throw null;
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        h = null;
                        break;
                    }
                    h = it.next();
                    if (!C11975y.m39644b(lVar.invoke(h).getReturnType())) {
                        break;
                    }
                }
                if (h == null) {
                    H e4 = C10539w.m35798e(arrayList);
                    if (e4 != null) {
                        return e4;
                    }
                    m33730a(76);
                    throw null;
                } else if (h != null) {
                    return h;
                } else {
                    m33730a(75);
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m33731a(Collection<C10238b> collection, C10342e eVar, C10006h hVar) {
        if (collection == null) {
            m33730a(77);
            throw null;
        } else if (eVar == null) {
            m33730a(78);
            throw null;
        } else if (hVar != null) {
            Collection<C10238b> a = m33719a(eVar, collection);
            boolean isEmpty = a.isEmpty();
            if (!isEmpty) {
                collection = a;
            }
            C10238b a2 = ((C10238b) m33715a(collection, new C10012e())).mo35421a(eVar, m33728a(collection, eVar), isEmpty ? C10397z0.f28195h : C10397z0.f28194g, C10238b.C10239a.FAKE_OVERRIDE, false);
            hVar.mo34193a(a2, (Collection<? extends C10238b>) collection);
            hVar.mo34192a(a2);
        } else {
            m33730a(79);
            throw null;
        }
    }

    /* renamed from: a */
    private static C10388w m33728a(Collection<C10238b> collection, C10342e eVar) {
        if (collection == null) {
            m33730a(80);
            throw null;
        } else if (eVar != null) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (C10238b next : collection) {
                int i = C10016i.f27605c[next.mo33767i().ordinal()];
                if (i == 1) {
                    C10388w wVar = C10388w.FINAL;
                    if (wVar != null) {
                        return wVar;
                    }
                    m33730a(82);
                    throw null;
                } else if (i == 2) {
                    throw new IllegalStateException("Member cannot have SEALED modality: " + next);
                } else if (i == 3) {
                    z2 = true;
                } else if (i == 4) {
                    z3 = true;
                }
            }
            if (!(!eVar.mo33758F() || eVar.mo33767i() == C10388w.ABSTRACT || eVar.mo33767i() == C10388w.SEALED)) {
                z = true;
            }
            if (z2 && !z3) {
                C10388w wVar2 = C10388w.OPEN;
                if (wVar2 != null) {
                    return wVar2;
                }
                m33730a(83);
                throw null;
            } else if (z2 || !z3) {
                HashSet hashSet = new HashSet();
                for (C10238b b : collection) {
                    hashSet.addAll(m33744b(b));
                }
                return m33729a((Collection<C10238b>) m33721a(hashSet), z, eVar.mo33767i());
            } else {
                C10388w i2 = z ? eVar.mo33767i() : C10388w.ABSTRACT;
                if (i2 != null) {
                    return i2;
                }
                m33730a(84);
                throw null;
            }
        } else {
            m33730a(81);
            throw null;
        }
    }

    /* renamed from: a */
    private static C10388w m33729a(Collection<C10238b> collection, boolean z, C10388w wVar) {
        if (collection == null) {
            m33730a(85);
            throw null;
        } else if (wVar != null) {
            C10388w wVar2 = C10388w.ABSTRACT;
            for (C10238b next : collection) {
                C10388w i = (!z || next.mo33767i() != C10388w.ABSTRACT) ? next.mo33767i() : wVar;
                if (i.compareTo(wVar2) < 0) {
                    wVar2 = i;
                }
            }
            if (wVar2 != null) {
                return wVar2;
            }
            m33730a(87);
            throw null;
        } else {
            m33730a(86);
            throw null;
        }
    }

    /* renamed from: a */
    private static Collection<C10238b> m33719a(C10342e eVar, Collection<C10238b> collection) {
        if (eVar == null) {
            m33730a(88);
            throw null;
        } else if (collection != null) {
            List<T> c = C10539w.m35788c(collection, new C10013f(eVar));
            if (c != null) {
                return c;
            }
            m33730a(90);
            throw null;
        } else {
            m33730a(89);
            throw null;
        }
    }

    /* renamed from: a */
    public static <H> Collection<H> m33716a(H h, Collection<H> collection, C9113l<H, C10230a> lVar, C9113l<H, C10483v> lVar2) {
        if (h == null) {
            m33730a(91);
            throw null;
        } else if (collection == null) {
            m33730a(92);
            throw null;
        } else if (lVar == null) {
            m33730a(93);
            throw null;
        } else if (lVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h);
            C10230a invoke = lVar.invoke(h);
            Iterator<H> it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                C10230a invoke2 = lVar.invoke(next);
                if (h == next) {
                    it.remove();
                } else {
                    C10017j.C10018a c = m33747c(invoke, invoke2);
                    if (c == C10017j.C10018a.OVERRIDABLE) {
                        arrayList.add(next);
                        it.remove();
                    } else if (c == C10017j.C10018a.CONFLICT) {
                        lVar2.invoke(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        } else {
            m33730a(94);
            throw null;
        }
    }

    /* renamed from: a */
    private static Collection<C10238b> m33718a(C10238b bVar, Queue<C10238b> queue, C10006h hVar) {
        if (bVar == null) {
            m33730a(96);
            throw null;
        } else if (queue == null) {
            m33730a(97);
            throw null;
        } else if (hVar != null) {
            return m33716a(bVar, queue, new C10014g(), new C10015h(hVar, bVar));
        } else {
            m33730a(98);
            throw null;
        }
    }

    /* renamed from: a */
    public static void m33734a(C10238b bVar, C9113l<C10238b, C10483v> lVar) {
        C10237a1 a1Var;
        if (bVar != null) {
            for (C10238b bVar2 : bVar.mo35406d()) {
                if (bVar2.getVisibility() == C10397z0.f28194g) {
                    m33734a(bVar2, lVar);
                }
            }
            if (bVar.getVisibility() == C10397z0.f28194g) {
                C10237a1 a = m33727a(bVar);
                if (a == null) {
                    if (lVar != null) {
                        lVar.invoke(bVar);
                    }
                    a1Var = C10397z0.f28192e;
                } else {
                    a1Var = a;
                }
                if (bVar instanceof C10340z) {
                    ((C10340z) bVar).mo35578a(a1Var);
                    for (C10350h0 a2 : ((C10352i0) bVar).mo35588t()) {
                        m33734a((C10238b) a2, a == null ? null : lVar);
                    }
                } else if (bVar instanceof C10322p) {
                    ((C10322p) bVar).mo35503a(a1Var);
                } else {
                    C10339y yVar = (C10339y) bVar;
                    yVar.mo35571a(a1Var);
                    if (a1Var != yVar.mo35574l0().getVisibility()) {
                        yVar.mo35573b(false);
                    }
                }
            }
        } else {
            m33730a(99);
            throw null;
        }
    }

    /* renamed from: a */
    private static C10237a1 m33727a(C10238b bVar) {
        if (bVar != null) {
            Collection<? extends C10238b> d = bVar.mo35406d();
            C10237a1 b = m33746b(d);
            if (b == null) {
                return null;
            }
            if (bVar.mo35423g() != C10238b.C10239a.FAKE_OVERRIDE) {
                return b.mo34183c();
            }
            for (C10238b bVar2 : d) {
                if (bVar2.mo33767i() != C10388w.ABSTRACT && !bVar2.getVisibility().equals(b)) {
                    return null;
                }
            }
            return b;
        }
        m33730a(100);
        throw null;
    }
}
