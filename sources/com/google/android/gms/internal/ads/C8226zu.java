package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdnu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zu */
final class C8226zu<FieldDescriptorType extends zzdnu<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C8226zu f17664d = new C8226zu(true);

    /* renamed from: a */
    private final C7895qw<FieldDescriptorType, Object> f17665a = C7895qw.m18057b(16);

    /* renamed from: b */
    private boolean f17666b;

    /* renamed from: c */
    private boolean f17667c = false;

    private C8226zu() {
    }

    /* renamed from: i */
    public static <T extends zzdnu<T>> C8226zu<T> m18667i() {
        return f17664d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo26889a() {
        if (this.f17667c) {
            return new C7672kv(this.f17665a.mo26487e().iterator());
        }
        return this.f17665a.mo26487e().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo26891b() {
        return this.f17665a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo26892c() {
        return this.f17666b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C8226zu zuVar = new C8226zu();
        for (int i = 0; i < this.f17665a.mo26483c(); i++) {
            Map.Entry<FieldDescriptorType, Object> a = this.f17665a.mo26480a(i);
            zuVar.m18660a((zzdnu) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f17665a.mo26486d()) {
            zuVar.m18660a((zzdnu) next.getKey(), next.getValue());
        }
        zuVar.f17667c = this.f17667c;
        return zuVar;
    }

    /* renamed from: d */
    public final boolean mo26894d() {
        for (int i = 0; i < this.f17665a.mo26483c(); i++) {
            if (!m18662a(this.f17665a.mo26480a(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> a : this.f17665a.mo26486d()) {
            if (!m18662a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo26895e() {
        if (this.f17667c) {
            return new C7672kv(this.f17665a.entrySet().iterator());
        }
        return this.f17665a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8226zu)) {
            return false;
        }
        return this.f17665a.equals(((C8226zu) obj).f17665a);
    }

    /* renamed from: f */
    public final void mo26897f() {
        if (!this.f17666b) {
            this.f17665a.mo26482b();
            this.f17666b = true;
        }
    }

    /* renamed from: g */
    public final int mo26898g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f17665a.mo26483c(); i2++) {
            Map.Entry<FieldDescriptorType, Object> a = this.f17665a.mo26480a(i2);
            i += m18663b((zzdnu<?>) (zzdnu) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f17665a.mo26486d()) {
            i += m18663b((zzdnu<?>) (zzdnu) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final int mo26899h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f17665a.mo26483c(); i2++) {
            i += m18666c(this.f17665a.mo26480a(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> c : this.f17665a.mo26486d()) {
            i += m18666c(c);
        }
        return i;
    }

    public final int hashCode() {
        return this.f17665a.hashCode();
    }

    /* renamed from: b */
    private final void m18665b(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        zzdnu zzdnu = (zzdnu) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzdon) {
            zzdon.m24057c();
            throw null;
        } else if (zzdnu.mo29125n()) {
            Object a = m18657a(zzdnu);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m18658a(a2));
            }
            this.f17665a.put(zzdnu, a);
        } else if (zzdnu.mo29124k() == zzdrn.MESSAGE) {
            Object a3 = m18657a(zzdnu);
            if (a3 == null) {
                this.f17665a.put(zzdnu, m18658a(value));
                return;
            }
            if (a3 instanceof zzdpr) {
                obj = zzdnu.mo29121a((zzdpr) a3, (zzdpr) value);
            } else {
                obj = zzdnu.mo29120a(((zzdpk) a3).mo29129b(), (zzdpk) value).mo29143t();
            }
            this.f17665a.put(zzdnu, obj);
        } else {
            this.f17665a.put(zzdnu, m18658a(value));
        }
    }

    /* renamed from: c */
    private static int m18666c(Map.Entry<FieldDescriptorType, Object> entry) {
        zzdnu zzdnu = (zzdnu) entry.getKey();
        Object value = entry.getValue();
        if (zzdnu.mo29124k() != zzdrn.MESSAGE || zzdnu.mo29125n() || zzdnu.mo29126u()) {
            return m18663b((zzdnu<?>) zzdnu, value);
        }
        if (value instanceof zzdon) {
            return zzdni.m23817b(((zzdnu) entry.getKey()).mo29122c(), (zzdor) (zzdon) value);
        }
        return zzdni.m23832d(((zzdnu) entry.getKey()).mo29122c(), (zzdpk) value);
    }

    private C8226zu(boolean z) {
        mo26897f();
    }

    /* renamed from: a */
    private final Object m18657a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f17665a.get(fielddescriptortype);
        if (!(obj instanceof zzdon)) {
            return obj;
        }
        zzdon.m24057c();
        throw null;
    }

    /* renamed from: a */
    private final void m18660a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo29125n()) {
            m18661a(fielddescriptortype.mo29123f(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m18661a(fielddescriptortype.mo29123f(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzdon) {
            this.f17667c = true;
        }
        this.f17665a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdoe) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzdon) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m18661a(com.google.android.gms.internal.ads.zzdri r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzdod.m24034a(r3)
            int[] r0 = com.google.android.gms.internal.ads.C7299av.f14501a
            com.google.android.gms.internal.ads.zzdrn r2 = r2.mo29187a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0035;
                case 6: goto L_0x0032;
                case 7: goto L_0x0029;
                case 8: goto L_0x0020;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdpk
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdon
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x001e:
            r0 = 0
            goto L_0x0043
        L_0x0020:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdoe
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0029:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdmr
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0043
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0043
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0043
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0043
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0043
        L_0x0041:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0043:
            r1 = r0
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x0050
        L_0x004f:
            throw r2
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8226zu.m18661a(com.google.android.gms.internal.ads.zzdri, java.lang.Object):void");
    }

    /* renamed from: b */
    private static int m18664b(zzdri zzdri, Object obj) {
        switch (C7299av.f14502b[zzdri.ordinal()]) {
            case 1:
                return zzdni.m23813b(((Double) obj).doubleValue());
            case 2:
                return zzdni.m23814b(((Float) obj).floatValue());
            case 3:
                return zzdni.m23833d(((Long) obj).longValue());
            case 4:
                return zzdni.m23837e(((Long) obj).longValue());
            case 5:
                return zzdni.m23838f(((Integer) obj).intValue());
            case 6:
                return zzdni.m23845g(((Long) obj).longValue());
            case 7:
                return zzdni.m23850i(((Integer) obj).intValue());
            case 8:
                return zzdni.m23824b(((Boolean) obj).booleanValue());
            case 9:
                return zzdni.m23829c((zzdpk) obj);
            case 10:
                if (obj instanceof zzdon) {
                    return zzdni.m23809a((zzdor) (zzdon) obj);
                }
                return zzdni.m23822b((zzdpk) obj);
            case 11:
                if (obj instanceof zzdmr) {
                    return zzdni.m23821b((zzdmr) obj);
                }
                return zzdni.m23823b((String) obj);
            case 12:
                if (obj instanceof zzdmr) {
                    return zzdni.m23821b((zzdmr) obj);
                }
                return zzdni.m23825b((byte[]) obj);
            case 13:
                return zzdni.m23842g(((Integer) obj).intValue());
            case 14:
                return zzdni.m23853j(((Integer) obj).intValue());
            case 15:
                return zzdni.m23849h(((Long) obj).longValue());
            case 16:
                return zzdni.m23846h(((Integer) obj).intValue());
            case 17:
                return zzdni.m23841f(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzdoe) {
                    return zzdni.m23855k(((zzdoe) obj).mo28259c());
                }
                return zzdni.m23855k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    private static boolean m18662a(Map.Entry<FieldDescriptorType, Object> entry) {
        zzdnu zzdnu = (zzdnu) entry.getKey();
        if (zzdnu.mo29124k() == zzdrn.MESSAGE) {
            if (zzdnu.mo29125n()) {
                for (zzdpk isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzdpk) {
                    if (!((zzdpk) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzdon) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo26890a(C8226zu<FieldDescriptorType> zuVar) {
        for (int i = 0; i < zuVar.f17665a.mo26483c(); i++) {
            m18665b(zuVar.f17665a.mo26480a(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> b : zuVar.f17665a.mo26486d()) {
            m18665b(b);
        }
    }

    /* renamed from: a */
    private static Object m18658a(Object obj) {
        if (obj instanceof zzdpr) {
            return ((zzdpr) obj).mo29172o();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    static void m18659a(zzdni zzdni, zzdri zzdri, int i, Object obj) throws IOException {
        if (zzdri == zzdri.GROUP) {
            zzdpk zzdpk = (zzdpk) obj;
            zzdod.m24037a(zzdpk);
            zzdni.mo29099b(i, 3);
            zzdpk.mo29128a(zzdni);
            zzdni.mo29099b(i, 4);
            return;
        }
        zzdni.mo29099b(i, zzdri.mo29188d());
        switch (C7299av.f14502b[zzdri.ordinal()]) {
            case 1:
                zzdni.mo29079a(((Double) obj).doubleValue());
                return;
            case 2:
                zzdni.mo29080a(((Float) obj).floatValue());
                return;
            case 3:
                zzdni.mo29091a(((Long) obj).longValue());
                return;
            case 4:
                zzdni.mo29091a(((Long) obj).longValue());
                return;
            case 5:
                zzdni.mo29081a(((Integer) obj).intValue());
                return;
            case 6:
                zzdni.mo29109c(((Long) obj).longValue());
                return;
            case 7:
                zzdni.mo29111d(((Integer) obj).intValue());
                return;
            case 8:
                zzdni.mo29096a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzdpk) obj).mo29128a(zzdni);
                return;
            case 10:
                zzdni.mo29093a((zzdpk) obj);
                return;
            case 11:
                if (obj instanceof zzdmr) {
                    zzdni.mo29092a((zzdmr) obj);
                    return;
                } else {
                    zzdni.mo29094a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzdmr) {
                    zzdni.mo29092a((zzdmr) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzdni.mo29110c(bArr, 0, bArr.length);
                return;
            case 13:
                zzdni.mo29098b(((Integer) obj).intValue());
                return;
            case 14:
                zzdni.mo29111d(((Integer) obj).intValue());
                return;
            case 15:
                zzdni.mo29109c(((Long) obj).longValue());
                return;
            case 16:
                zzdni.mo29106c(((Integer) obj).intValue());
                return;
            case 17:
                zzdni.mo29103b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzdoe) {
                    zzdni.mo29081a(((zzdoe) obj).mo28259c());
                    return;
                } else {
                    zzdni.mo29081a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: b */
    private static int m18663b(zzdnu<?> zzdnu, Object obj) {
        zzdri f = zzdnu.mo29123f();
        int c = zzdnu.mo29122c();
        if (!zzdnu.mo29125n()) {
            return m18656a(f, c, obj);
        }
        int i = 0;
        if (zzdnu.mo29126u()) {
            for (Object b : (List) obj) {
                i += m18664b(f, b);
            }
            return zzdni.m23835e(c) + i + zzdni.m23858m(i);
        }
        for (Object a : (List) obj) {
            i += m18656a(f, c, a);
        }
        return i;
    }

    /* renamed from: a */
    static int m18656a(zzdri zzdri, int i, Object obj) {
        int e = zzdni.m23835e(i);
        if (zzdri == zzdri.GROUP) {
            zzdod.m24037a((zzdpk) obj);
            e <<= 1;
        }
        return e + m18664b(zzdri, obj);
    }
}
