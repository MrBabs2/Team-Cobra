package kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0;

import java.util.ArrayList;
import java.util.List;
import kotlin.C9056a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9795i0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9839r0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

/* renamed from: kotlin.h0.u.e.k0.d.x0.j */
/* compiled from: VersionRequirement.kt */
public final class C9882j {

    /* renamed from: f */
    public static final C9883a f27270f = new C9883a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C9884b f27271a;

    /* renamed from: b */
    private final C9839r0.C9844d f27272b;

    /* renamed from: c */
    private final C9056a f27273c;

    /* renamed from: d */
    private final Integer f27274d;

    /* renamed from: e */
    private final String f27275e;

    /* renamed from: kotlin.h0.u.e.k0.d.x0.j$a */
    /* compiled from: VersionRequirement.kt */
    public static final class C9883a {
        private C9883a() {
        }

        /* renamed from: a */
        public final List<C9882j> mo34860a(C10449o oVar, C9875c cVar, C9886k kVar) {
            List<Integer> list;
            C10202j.m34178b(oVar, "proto");
            C10202j.m34178b(cVar, "nameResolver");
            C10202j.m34178b(kVar, "table");
            if (oVar instanceof C9775f) {
                list = ((C9775f) oVar).mo34462I();
            } else if (oVar instanceof C9790h) {
                list = ((C9790h) oVar).mo34580o();
            } else if (oVar instanceof C9836r) {
                list = ((C9836r) oVar).mo34726A();
            } else if (oVar instanceof C9930z) {
                list = ((C9930z) oVar).mo34962z();
            } else if (oVar instanceof C9795i0) {
                list = ((C9795i0) oVar).mo34601v();
            } else {
                throw new IllegalStateException("Unexpected declaration: " + oVar.getClass());
            }
            C10202j.m34174a((Object) list, "ids");
            ArrayList arrayList = new ArrayList();
            for (Integer num : list) {
                C9883a aVar = C9882j.f27270f;
                C10202j.m34174a((Object) num, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
                C9882j a = aVar.mo34861a(num.intValue(), cVar, kVar);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }

        public /* synthetic */ C9883a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9882j mo34861a(int i, C9875c cVar, C9886k kVar) {
            C9056a aVar;
            C10202j.m34178b(cVar, "nameResolver");
            C10202j.m34178b(kVar, "table");
            C9839r0 a = kVar.mo34867a(i);
            String str = null;
            if (a == null) {
                return null;
            }
            C9884b a2 = C9884b.f27277e.mo34866a(a.mo34782r() ? Integer.valueOf(a.mo34776l()) : null, a.mo34783s() ? Integer.valueOf(a.mo34777m()) : null);
            C9839r0.C9842c j = a.mo34774j();
            if (j != null) {
                int i2 = C9881i.f27269a[j.ordinal()];
                if (i2 == 1) {
                    aVar = C9056a.WARNING;
                } else if (i2 == 2) {
                    aVar = C9056a.ERROR;
                } else if (i2 == 3) {
                    aVar = C9056a.HIDDEN;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C9056a aVar2 = aVar;
                Integer valueOf = a.mo34779o() ? Integer.valueOf(a.mo34773i()) : null;
                if (a.mo34781q()) {
                    str = cVar.getString(a.mo34775k());
                }
                C9839r0.C9844d n = a.mo34778n();
                C10202j.m34174a((Object) n, "info.versionKind");
                return new C9882j(a2, n, aVar2, valueOf, str);
            }
            C10202j.m34172a();
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.x0.j$b */
    /* compiled from: VersionRequirement.kt */
    public static final class C9884b {

        /* renamed from: d */
        public static final C9884b f27276d = new C9884b(256, 256, 256);

        /* renamed from: e */
        public static final C9885a f27277e = new C9885a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final int f27278a;

        /* renamed from: b */
        private final int f27279b;

        /* renamed from: c */
        private final int f27280c;

        /* renamed from: kotlin.h0.u.e.k0.d.x0.j$b$a */
        /* compiled from: VersionRequirement.kt */
        public static final class C9885a {
            private C9885a() {
            }

            /* renamed from: a */
            public final C9884b mo34866a(Integer num, Integer num2) {
                if (num2 != null) {
                    return new C9884b(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new C9884b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return C9884b.f27276d;
            }

            public /* synthetic */ C9885a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C9884b(int i, int i2, int i3) {
            this.f27278a = i;
            this.f27279b = i2;
            this.f27280c = i3;
        }

        /* renamed from: a */
        public final String mo34862a() {
            int i;
            StringBuilder sb;
            if (this.f27280c == 0) {
                sb = new StringBuilder();
                sb.append(this.f27278a);
                sb.append('.');
                i = this.f27279b;
            } else {
                sb = new StringBuilder();
                sb.append(this.f27278a);
                sb.append('.');
                sb.append(this.f27279b);
                sb.append('.');
                i = this.f27280c;
            }
            sb.append(i);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9884b) {
                    C9884b bVar = (C9884b) obj;
                    if (this.f27278a == bVar.f27278a) {
                        if (this.f27279b == bVar.f27279b) {
                            if (this.f27280c == bVar.f27280c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f27278a * 31) + this.f27279b) * 31) + this.f27280c;
        }

        public String toString() {
            return mo34862a();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C9884b(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    public C9882j(C9884b bVar, C9839r0.C9844d dVar, C9056a aVar, Integer num, String str) {
        C10202j.m34178b(bVar, "version");
        C10202j.m34178b(dVar, "kind");
        C10202j.m34178b(aVar, "level");
        this.f27271a = bVar;
        this.f27272b = dVar;
        this.f27273c = aVar;
        this.f27274d = num;
        this.f27275e = str;
    }

    /* renamed from: a */
    public final C9839r0.C9844d mo34857a() {
        return this.f27272b;
    }

    /* renamed from: b */
    public final C9884b mo34858b() {
        return this.f27271a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("since ");
        sb.append(this.f27271a);
        sb.append(' ');
        sb.append(this.f27273c);
        String str2 = "";
        if (this.f27274d != null) {
            str = " error " + this.f27274d;
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f27275e != null) {
            str2 = ": " + this.f27275e;
        }
        sb.append(str2);
        return sb.toString();
    }
}
