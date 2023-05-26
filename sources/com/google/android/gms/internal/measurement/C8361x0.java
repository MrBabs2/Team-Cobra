package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x0 */
final class C8361x0<FieldDescriptorType extends zzuh<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C8361x0 f23377d = new C8361x0(true);

    /* renamed from: a */
    private final C8288g2<FieldDescriptorType, Object> f23378a = C8288g2.m25995b(16);

    /* renamed from: b */
    private boolean f23379b;

    /* renamed from: c */
    private boolean f23380c = false;

    private C8361x0() {
    }

    /* renamed from: i */
    public static <T extends zzuh<T>> C8361x0<T> m26278i() {
        return f23377d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo30256a() {
        if (this.f23380c) {
            return new C8282f1(this.f23378a.mo30122e().iterator());
        }
        return this.f23378a.mo30122e().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo30258b() {
        return this.f23378a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo30259c() {
        return this.f23379b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C8361x0 x0Var = new C8361x0();
        for (int i = 0; i < this.f23378a.mo30118c(); i++) {
            Map.Entry<FieldDescriptorType, Object> a = this.f23378a.mo30115a(i);
            x0Var.m26271a((zzuh) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f23378a.mo30121d()) {
            x0Var.m26271a((zzuh) next.getKey(), next.getValue());
        }
        x0Var.f23380c = this.f23380c;
        return x0Var;
    }

    /* renamed from: d */
    public final boolean mo30261d() {
        for (int i = 0; i < this.f23378a.mo30118c(); i++) {
            if (!m26273a(this.f23378a.mo30115a(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> a : this.f23378a.mo30121d()) {
            if (!m26273a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo30262e() {
        if (this.f23380c) {
            return new C8282f1(this.f23378a.entrySet().iterator());
        }
        return this.f23378a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8361x0)) {
            return false;
        }
        return this.f23378a.equals(((C8361x0) obj).f23378a);
    }

    /* renamed from: f */
    public final void mo30264f() {
        if (!this.f23379b) {
            this.f23378a.mo30117b();
            this.f23379b = true;
        }
    }

    /* renamed from: g */
    public final int mo30265g() {
        int i = 0;
        for (int i2 = 0; i2 < this.f23378a.mo30118c(); i2++) {
            Map.Entry<FieldDescriptorType, Object> a = this.f23378a.mo30115a(i2);
            i += m26274b((zzuh<?>) (zzuh) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f23378a.mo30121d()) {
            i += m26274b((zzuh<?>) (zzuh) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: h */
    public final int mo30266h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f23378a.mo30118c(); i2++) {
            i += m26277c(this.f23378a.mo30115a(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> c : this.f23378a.mo30121d()) {
            i += m26277c(c);
        }
        return i;
    }

    public final int hashCode() {
        return this.f23378a.hashCode();
    }

    /* renamed from: b */
    private final void m26276b(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        zzuh zzuh = (zzuh) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzuy) {
            zzuy.m26691c();
            throw null;
        } else if (zzuh.mo30416C()) {
            Object a = m26268a(zzuh);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m26269a(a2));
            }
            this.f23378a.put(zzuh, a);
        } else if (zzuh.mo30417G() == zzxx.MESSAGE) {
            Object a3 = m26268a(zzuh);
            if (a3 == null) {
                this.f23378a.put(zzuh, m26269a(value));
                return;
            }
            if (a3 instanceof zzwb) {
                obj = zzuh.mo30419a((zzwb) a3, (zzwb) value);
            } else {
                obj = zzuh.mo30418a(((zzvv) a3).mo30426c(), (zzvv) value).mo30436p();
            }
            this.f23378a.put(zzuh, obj);
        } else {
            this.f23378a.put(zzuh, m26269a(value));
        }
    }

    /* renamed from: c */
    private static int m26277c(Map.Entry<FieldDescriptorType, Object> entry) {
        zzuh zzuh = (zzuh) entry.getKey();
        Object value = entry.getValue();
        if (zzuh.mo30417G() != zzxx.MESSAGE || zzuh.mo30416C() || zzuh.mo30421z()) {
            return m26274b((zzuh<?>) zzuh, value);
        }
        if (value instanceof zzuy) {
            return zztv.m26542b(((zzuh) entry.getKey()).mo30420g(), (zzvc) (zzuy) value);
        }
        return zztv.m26554c(((zzuh) entry.getKey()).mo30420g(), (zzvv) value);
    }

    private C8361x0(boolean z) {
        mo30264f();
    }

    /* renamed from: a */
    private final Object m26268a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f23378a.get(fielddescriptortype);
        if (!(obj instanceof zzuy)) {
            return obj;
        }
        zzuy.m26691c();
        throw null;
    }

    /* renamed from: a */
    private final void m26271a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo30416C()) {
            m26272a(fielddescriptortype.mo30415A(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m26272a(fielddescriptortype.mo30415A(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzuy) {
            this.f23380c = true;
        }
        this.f23378a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzur) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzuy) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m26272a(com.google.android.gms.internal.measurement.zzxs r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzuq.m26677a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C8365y0.f23386a
            com.google.android.gms.internal.measurement.zzxx r2 = r2.mo30478a()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzvv
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzuy
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x001e:
            r0 = 0
            goto L_0x0043
        L_0x0020:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzur
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0029:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzte
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8361x0.m26272a(com.google.android.gms.internal.measurement.zzxs, java.lang.Object):void");
    }

    /* renamed from: b */
    private static int m26275b(zzxs zzxs, Object obj) {
        switch (C8365y0.f23387b[zzxs.ordinal()]) {
            case 1:
                return zztv.m26538b(((Double) obj).doubleValue());
            case 2:
                return zztv.m26539b(((Float) obj).floatValue());
            case 3:
                return zztv.m26559d(((Long) obj).longValue());
            case 4:
                return zztv.m26562e(((Long) obj).longValue());
            case 5:
                return zztv.m26563f(((Integer) obj).intValue());
            case 6:
                return zztv.m26570g(((Long) obj).longValue());
            case 7:
                return zztv.m26575i(((Integer) obj).intValue());
            case 8:
                return zztv.m26550b(((Boolean) obj).booleanValue());
            case 9:
                return zztv.m26556c((zzvv) obj);
            case 10:
                if (obj instanceof zzuy) {
                    return zztv.m26535a((zzvc) (zzuy) obj);
                }
                return zztv.m26548b((zzvv) obj);
            case 11:
                if (obj instanceof zzte) {
                    return zztv.m26547b((zzte) obj);
                }
                return zztv.m26549b((String) obj);
            case 12:
                if (obj instanceof zzte) {
                    return zztv.m26547b((zzte) obj);
                }
                return zztv.m26551b((byte[]) obj);
            case 13:
                return zztv.m26567g(((Integer) obj).intValue());
            case 14:
                return zztv.m26578j(((Integer) obj).intValue());
            case 15:
                return zztv.m26574h(((Long) obj).longValue());
            case 16:
                return zztv.m26571h(((Integer) obj).intValue());
            case 17:
                return zztv.m26566f(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzur) {
                    return zztv.m26580k(((zzur) obj).mo30438g());
                }
                return zztv.m26580k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    private static boolean m26273a(Map.Entry<FieldDescriptorType, Object> entry) {
        zzuh zzuh = (zzuh) entry.getKey();
        if (zzuh.mo30417G() == zzxx.MESSAGE) {
            if (zzuh.mo30416C()) {
                for (zzvv isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzvv) {
                    if (!((zzvv) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzuy) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo30257a(C8361x0<FieldDescriptorType> x0Var) {
        for (int i = 0; i < x0Var.f23378a.mo30118c(); i++) {
            m26276b(x0Var.f23378a.mo30115a(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> b : x0Var.f23378a.mo30121d()) {
            m26276b(b);
        }
    }

    /* renamed from: a */
    private static Object m26269a(Object obj) {
        if (obj instanceof zzwb) {
            return ((zzwb) obj).mo30465d();
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
    static void m26270a(zztv zztv, zzxs zzxs, int i, Object obj) throws IOException {
        if (zzxs == zzxs.GROUP) {
            zzvv zzvv = (zzvv) obj;
            zzuq.m26680a(zzvv);
            zztv.mo30387a(i, 3);
            zzvv.mo30424a(zztv);
            zztv.mo30387a(i, 4);
            return;
        }
        zztv.mo30387a(i, zzxs.mo30479d());
        switch (C8365y0.f23387b[zzxs.ordinal()]) {
            case 1:
                zztv.mo30382a(((Double) obj).doubleValue());
                return;
            case 2:
                zztv.mo30383a(((Float) obj).floatValue());
                return;
            case 3:
                zztv.mo30394a(((Long) obj).longValue());
                return;
            case 4:
                zztv.mo30394a(((Long) obj).longValue());
                return;
            case 5:
                zztv.mo30384a(((Integer) obj).intValue());
                return;
            case 6:
                zztv.mo30409c(((Long) obj).longValue());
                return;
            case 7:
                zztv.mo30410d(((Integer) obj).intValue());
                return;
            case 8:
                zztv.mo30399a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzvv) obj).mo30424a(zztv);
                return;
            case 10:
                zztv.mo30396a((zzvv) obj);
                return;
            case 11:
                if (obj instanceof zzte) {
                    zztv.mo30395a((zzte) obj);
                    return;
                } else {
                    zztv.mo30397a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzte) {
                    zztv.mo30395a((zzte) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zztv.mo30405b(bArr, 0, bArr.length);
                return;
            case 13:
                zztv.mo30400b(((Integer) obj).intValue());
                return;
            case 14:
                zztv.mo30410d(((Integer) obj).intValue());
                return;
            case 15:
                zztv.mo30409c(((Long) obj).longValue());
                return;
            case 16:
                zztv.mo30406c(((Integer) obj).intValue());
                return;
            case 17:
                zztv.mo30404b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzur) {
                    zztv.mo30384a(((zzur) obj).mo30438g());
                    return;
                } else {
                    zztv.mo30384a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: b */
    private static int m26274b(zzuh<?> zzuh, Object obj) {
        zzxs A = zzuh.mo30415A();
        int g = zzuh.mo30420g();
        if (!zzuh.mo30416C()) {
            return m26267a(A, g, obj);
        }
        int i = 0;
        if (zzuh.mo30421z()) {
            for (Object b : (List) obj) {
                i += m26275b(A, b);
            }
            return zztv.m26560e(g) + i + zztv.m26583m(i);
        }
        for (Object a : (List) obj) {
            i += m26267a(A, g, a);
        }
        return i;
    }

    /* renamed from: a */
    static int m26267a(zzxs zzxs, int i, Object obj) {
        int e = zztv.m26560e(i);
        if (zzxs == zzxs.GROUP) {
            zzuq.m26680a((zzvv) obj);
            e <<= 1;
        }
        return e + m26275b(zzxs, obj);
    }
}
