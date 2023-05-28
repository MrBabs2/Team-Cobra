package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10221n;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9870b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9879g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;

/* renamed from: kotlin.h0.u.e.k0.d.y0.g.i */
/* compiled from: JvmProtoBufUtil.kt */
public final class C9928i {

    /* renamed from: a */
    private static final C10422f f27388a;

    /* renamed from: b */
    public static final C9928i f27389b = new C9928i();

    static {
        C10422f b = C10422f.m35297b();
        C9890a.m32904a(b);
        C10202j.m34174a((Object) b, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        f27388a = b;
    }

    private C9928i() {
    }

    /* renamed from: b */
    public static final C10221n<C9925g, C9856v> m33160b(byte[] bArr, String[] strArr) {
        C10202j.m34178b(bArr, "bytes");
        C10202j.m34178b(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C10221n<>(f27389b.m33156a((InputStream) byteArrayInputStream, strArr), C9856v.m32720a((InputStream) byteArrayInputStream, f27388a));
    }

    /* renamed from: c */
    public static final C10221n<C9925g, C9856v> m33162c(String[] strArr, String[] strArr2) {
        C10202j.m34178b(strArr, "data");
        C10202j.m34178b(strArr2, "strings");
        byte[] b = C9914a.m33135b(strArr);
        C10202j.m34174a((Object) b, "BitEncoding.decodeBytes(data)");
        return m33160b(b, strArr2);
    }

    /* renamed from: a */
    public final C10422f mo34938a() {
        return f27388a;
    }

    /* renamed from: a */
    public static final C10221n<C9925g, C9775f> m33158a(String[] strArr, String[] strArr2) {
        C10202j.m34178b(strArr, "data");
        C10202j.m34178b(strArr2, "strings");
        byte[] b = C9914a.m33135b(strArr);
        C10202j.m34174a((Object) b, "BitEncoding.decodeBytes(data)");
        return m33157a(b, strArr2);
    }

    /* renamed from: a */
    public static final C10221n<C9925g, C9775f> m33157a(byte[] bArr, String[] strArr) {
        C10202j.m34178b(bArr, "bytes");
        C10202j.m34178b(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C10221n<>(f27389b.m33156a((InputStream) byteArrayInputStream, strArr), C9775f.m31742a((InputStream) byteArrayInputStream, f27388a));
    }

    /* renamed from: b */
    public static final C10221n<C9925g, C9836r> m33161b(String[] strArr, String[] strArr2) {
        C10202j.m34178b(strArr, "data");
        C10202j.m34178b(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C9914a.m33135b(strArr));
        return new C10221n<>(f27389b.m33156a((InputStream) byteArrayInputStream, strArr2), C9836r.m32521a((InputStream) byteArrayInputStream, f27388a));
    }

    /* renamed from: a */
    private final C9925g m33156a(InputStream inputStream, String[] strArr) {
        C9890a.C9901e a = C9890a.C9901e.m33032a(inputStream, f27388a);
        C10202j.m34174a((Object) a, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new C9925g(a, strArr);
    }

    /* renamed from: a */
    public final C9920e.C9922b mo34937a(C9836r rVar, C9875c cVar, C9880h hVar) {
        String str;
        C9836r rVar2 = rVar;
        C9875c cVar2 = cVar;
        C9880h hVar2 = hVar;
        C10202j.m34178b(rVar2, "proto");
        C10202j.m34178b(cVar2, "nameResolver");
        C10202j.m34178b(hVar2, "typeTable");
        C10427h.C10435g<C9836r, C9890a.C9895c> gVar = C9890a.f27285b;
        C10202j.m34174a((Object) gVar, "JvmProtoBuf.methodSignature");
        C9890a.C9895c cVar3 = (C9890a.C9895c) C9878f.m32873a(rVar2, gVar);
        int n = (cVar3 == null || !cVar3.mo34881l()) ? rVar.mo34740n() : cVar3.mo34879j();
        if (cVar3 == null || !cVar3.mo34880k()) {
            List b = C10529o.m35739b(C9879g.m32881a(rVar2, hVar2));
            List<C9831p0> z = rVar.mo34750z();
            C10202j.m34174a((Object) z, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(z, 10));
            for (C9831p0 p0Var : z) {
                C10202j.m34174a((Object) p0Var, "it");
                arrayList.add(C9879g.m32880a(p0Var, hVar2));
            }
            List<C9782g0> d = C10539w.m35796d(b, arrayList);
            ArrayList arrayList2 = new ArrayList(C10531p.m35750a(d, 10));
            for (C9782g0 a : d) {
                String a2 = f27389b.m33154a(a, cVar2);
                if (a2 == null) {
                    return null;
                }
                arrayList2.add(a2);
            }
            String a3 = m33154a(C9879g.m32888b(rVar2, hVar2), cVar2);
            if (a3 == null) {
                return null;
            }
            str = C10539w.m35773a(arrayList2, "", "(", ")", 0, (CharSequence) null, (C9113l) null, 56, (Object) null) + a3;
        } else {
            str = cVar2.getString(cVar3.mo34878i());
        }
        return new C9920e.C9922b(cVar2.getString(n), str);
    }

    /* renamed from: a */
    public final C9920e.C9922b mo34936a(C9790h hVar, C9875c cVar, C9880h hVar2) {
        String str;
        C10202j.m34178b(hVar, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        C10202j.m34178b(hVar2, "typeTable");
        C10427h.C10435g<C9790h, C9890a.C9895c> gVar = C9890a.f27284a;
        C10202j.m34174a((Object) gVar, "JvmProtoBuf.constructorSignature");
        C9890a.C9895c cVar2 = (C9890a.C9895c) C9878f.m32873a(hVar, gVar);
        String string = (cVar2 == null || !cVar2.mo34881l()) ? "<init>" : cVar.getString(cVar2.mo34879j());
        if (cVar2 == null || !cVar2.mo34880k()) {
            List<C9831p0> n = hVar.mo34579n();
            C10202j.m34174a((Object) n, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(n, 10));
            for (C9831p0 p0Var : n) {
                C9928i iVar = f27389b;
                C10202j.m34174a((Object) p0Var, "it");
                String a = iVar.m33154a(C9879g.m32880a(p0Var, hVar2), cVar);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
            }
            str = C10539w.m35773a(arrayList, "", "(", ")V", 0, (CharSequence) null, (C9113l) null, 56, (Object) null);
        } else {
            str = cVar.getString(cVar2.mo34878i());
        }
        return new C9920e.C9922b(string, str);
    }

    /* renamed from: a */
    public static /* synthetic */ C9920e.C9921a m33155a(C9928i iVar, C9930z zVar, C9875c cVar, C9880h hVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return iVar.mo34935a(zVar, cVar, hVar, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r4 != null) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e.C9921a mo34935a(kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z r4, kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c r5, kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C10202j.m34178b(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$g<kotlin.h0.u.e.k0.d.z, kotlin.h0.u.e.k0.d.y0.a$d> r0 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.f27287d
            java.lang.String r1 = "JvmProtoBuf.propertySignature"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.Object r0 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f.m32873a(r4, r0)
            kotlin.h0.u.e.k0.d.y0.a$d r0 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9898d) r0
            r1 = 0
            if (r0 == 0) goto L_0x0066
            boolean r2 = r0.mo34890m()
            if (r2 == 0) goto L_0x002a
            kotlin.h0.u.e.k0.d.y0.a$b r0 = r0.mo34886i()
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            if (r0 != 0) goto L_0x0030
            if (r7 == 0) goto L_0x0030
            return r1
        L_0x0030:
            if (r0 == 0) goto L_0x003d
            boolean r7 = r0.mo34873l()
            if (r7 == 0) goto L_0x003d
            int r7 = r0.mo34871j()
            goto L_0x0041
        L_0x003d:
            int r7 = r4.mo34952n()
        L_0x0041:
            if (r0 == 0) goto L_0x0052
            boolean r2 = r0.mo34872k()
            if (r2 == 0) goto L_0x0052
            int r4 = r0.mo34870i()
            java.lang.String r4 = r5.getString(r4)
            goto L_0x005c
        L_0x0052:
            kotlin.h0.u.e.k0.d.g0 r4 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9879g.m32889b((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z) r4, (kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h) r6)
            java.lang.String r4 = r3.m33154a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r4, (kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c) r5)
            if (r4 == 0) goto L_0x0066
        L_0x005c:
            kotlin.h0.u.e.k0.d.y0.g.e$a r6 = new kotlin.h0.u.e.k0.d.y0.g.e$a
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i.mo34935a(kotlin.h0.u.e.k0.d.z, kotlin.h0.u.e.k0.d.x0.c, kotlin.h0.u.e.k0.d.x0.h, boolean):kotlin.h0.u.e.k0.d.y0.g.e$a");
    }

    /* renamed from: a */
    private final String m33154a(C9782g0 g0Var, C9875c cVar) {
        if (g0Var.mo34517E()) {
            return C9915b.m33137a(cVar.mo34853a(g0Var.mo34533p()));
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m33159a(C9930z zVar) {
        C10202j.m34178b(zVar, "proto");
        C9870b.C9872b a = C9919d.f27375b.mo34923a();
        Object a2 = zVar.mo35765a(C9890a.f27288e);
        C10202j.m34174a(a2, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean a3 = a.m32856a(((Number) a2).intValue());
        C10202j.m34174a((Object) a3, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return a3.booleanValue();
    }
}
