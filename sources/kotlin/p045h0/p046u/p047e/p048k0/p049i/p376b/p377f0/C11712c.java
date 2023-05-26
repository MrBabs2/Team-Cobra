package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0;

import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11774q;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11738f;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9327b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9861w;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p241w0.C9864a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.i.b.f0.c */
/* compiled from: BuiltInsPackageFragmentImpl.kt */
public final class C11712c extends C11774q implements C9327b {

    /* renamed from: q */
    public static final C11713a f31307q = new C11713a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.k0.i.b.f0.c$a */
    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class C11713a {
        private C11713a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
            r11 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
            kotlin.p257io.C10182a.m34136a(r13, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
            throw r11;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0.C11712c mo38288a(kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b r10, kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i r11, kotlin.reflect.jvm.internal.impl.descriptors.C10393y r12, java.io.InputStream r13, boolean r14) {
            /*
                r9 = this;
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.C10202j.m34178b(r10, r0)
                java.lang.String r0 = "storageManager"
                kotlin.jvm.internal.C10202j.m34178b(r11, r0)
                java.lang.String r0 = "module"
                kotlin.jvm.internal.C10202j.m34178b(r12, r0)
                java.lang.String r0 = "inputStream"
                kotlin.jvm.internal.C10202j.m34178b(r13, r0)
                kotlin.h0.u.e.k0.d.w0.a$a r0 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p241w0.C9864a.f27208g     // Catch:{ all -> 0x0077 }
                kotlin.h0.u.e.k0.d.w0.a r6 = r0.mo34839a(r13)     // Catch:{ all -> 0x0077 }
                r0 = 0
                if (r6 == 0) goto L_0x0071
                boolean r1 = r6.mo34838d()     // Catch:{ all -> 0x0077 }
                if (r1 == 0) goto L_0x0041
                kotlin.h0.u.e.k0.i.b.f0.a r1 = kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0.C11709a.f31305m     // Catch:{ all -> 0x0077 }
                kotlin.reflect.jvm.internal.impl.protobuf.f r1 = r1.mo16631e()     // Catch:{ all -> 0x0077 }
                kotlin.h0.u.e.k0.d.w r5 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9861w.m32791a((java.io.InputStream) r13, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r1)     // Catch:{ all -> 0x0077 }
                kotlin.p257io.C10182a.m34136a(r13, r0)
                kotlin.h0.u.e.k0.i.b.f0.c r13 = new kotlin.h0.u.e.k0.i.b.f0.c
                java.lang.String r0 = "proto"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r0)
                r8 = 0
                r1 = r13
                r2 = r10
                r3 = r11
                r4 = r12
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r13
            L_0x0041:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0077 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
                r11.<init>()     // Catch:{ all -> 0x0077 }
                java.lang.String r12 = "Kotlin built-in definition format version is not supported: "
                r11.append(r12)     // Catch:{ all -> 0x0077 }
                java.lang.String r12 = "expected "
                r11.append(r12)     // Catch:{ all -> 0x0077 }
                kotlin.h0.u.e.k0.d.w0.a r12 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p241w0.C9864a.f27207f     // Catch:{ all -> 0x0077 }
                r11.append(r12)     // Catch:{ all -> 0x0077 }
                java.lang.String r12 = ", actual "
                r11.append(r12)     // Catch:{ all -> 0x0077 }
                r11.append(r6)     // Catch:{ all -> 0x0077 }
                java.lang.String r12 = ". "
                r11.append(r12)     // Catch:{ all -> 0x0077 }
                java.lang.String r12 = "Please update Kotlin"
                r11.append(r12)     // Catch:{ all -> 0x0077 }
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0077 }
                r10.<init>(r11)     // Catch:{ all -> 0x0077 }
                throw r10     // Catch:{ all -> 0x0077 }
            L_0x0071:
                java.lang.String r10 = "version"
                kotlin.jvm.internal.C10202j.m34181d(r10)     // Catch:{ all -> 0x0077 }
                throw r0
            L_0x0077:
                r10 = move-exception
                throw r10     // Catch:{ all -> 0x0079 }
            L_0x0079:
                r11 = move-exception
                kotlin.p257io.C10182a.m34136a(r13, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0.C11712c.C11713a.mo38288a(kotlin.h0.u.e.k0.e.b, kotlin.h0.u.e.k0.j.i, kotlin.reflect.jvm.internal.impl.descriptors.y, java.io.InputStream, boolean):kotlin.h0.u.e.k0.i.b.f0.c");
        }

        public /* synthetic */ C11713a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C11712c(C9934b bVar, C11817i iVar, C10393y yVar, C9861w wVar, C9864a aVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, iVar, yVar, wVar, aVar, z);
    }

    private C11712c(C9934b bVar, C11817i iVar, C10393y yVar, C9861w wVar, C9864a aVar, boolean z) {
        super(bVar, iVar, yVar, wVar, aVar, (C11738f) null);
    }
}
