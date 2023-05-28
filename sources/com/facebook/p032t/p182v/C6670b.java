package com.facebook.p032t.p182v;

import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p182v.C6673c;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.facebook.t.v.b */
/* compiled from: Model */
public final class C6670b {

    /* renamed from: a */
    private C6669a f12431a;

    /* renamed from: b */
    private C6669a f12432b;

    /* renamed from: c */
    private C6669a f12433c;

    /* renamed from: d */
    private C6669a f12434d;

    /* renamed from: e */
    private C6669a f12435e;

    /* renamed from: f */
    private C6669a f12436f;

    /* renamed from: g */
    private C6669a f12437g;

    /* renamed from: h */
    private C6669a f12438h;

    /* renamed from: i */
    private C6669a f12439i;

    /* renamed from: j */
    private C6669a f12440j;

    /* renamed from: k */
    private C6669a f12441k;

    /* renamed from: l */
    private final Map<String, C6669a> f12442l = new HashMap();

    /* renamed from: com.facebook.t.v.b$a */
    /* compiled from: Model */
    class C6671a extends HashSet<String> {
        C6671a(C6670b bVar) {
            add(C6673c.C6678e.MTML_INTEGRITY_DETECT.mo21439a());
            add(C6673c.C6678e.MTML_APP_EVENT_PREDICTION.mo21439a());
        }
    }

    /* renamed from: com.facebook.t.v.b$b */
    /* compiled from: Model */
    static class C6672b extends HashMap<String, String> {
        C6672b() {
            put("embedding.weight", "embed.weight");
            put("dense1.weight", "fc1.weight");
            put("dense2.weight", "fc2.weight");
            put("dense3.weight", "fc3.weight");
            put("dense1.bias", "fc1.bias");
            put("dense2.bias", "fc2.bias");
            put("dense3.bias", "fc3.bias");
        }
    }

    private C6670b(Map<String, C6669a> map) {
        this.f12431a = map.get("embed.weight");
        this.f12432b = C6682d.m14293d(map.get("convs.0.weight"));
        this.f12433c = C6682d.m14293d(map.get("convs.1.weight"));
        this.f12434d = C6682d.m14293d(map.get("convs.2.weight"));
        this.f12435e = map.get("convs.0.bias");
        this.f12436f = map.get("convs.1.bias");
        this.f12437g = map.get("convs.2.bias");
        this.f12438h = C6682d.m14291c(map.get("fc1.weight"));
        this.f12439i = C6682d.m14291c(map.get("fc2.weight"));
        this.f12440j = map.get("fc1.bias");
        this.f12441k = map.get("fc2.bias");
        for (String str : new C6671a(this)) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            C6669a aVar = map.get(str2);
            C6669a aVar2 = map.get(str3);
            if (aVar != null) {
                this.f12442l.put(str2, C6682d.m14291c(aVar));
            }
            if (aVar2 != null) {
                this.f12442l.put(str3, aVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        com.facebook.internal.p168a0.p170f.C6391a.m13259a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000a] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, com.facebook.p032t.p182v.C6669a> m14252b(java.io.File r18) {
        /*
            java.lang.Class<com.facebook.t.v.b> r1 = com.facebook.p032t.p182v.C6670b.class
            boolean r0 = com.facebook.internal.p168a0.p170f.C6391a.m13260a((java.lang.Object) r1)
            r2 = 0
            if (r0 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r3 = r18
            r0.<init>(r3)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            int r3 = r0.available()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            byte[] r0 = new byte[r3]     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r4.readFully(r0)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r4.close()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r4 = 4
            if (r3 >= r4) goto L_0x0026
            return r2
        L_0x0026:
            r5 = 0
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r0, r5, r4)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r6.order(r7)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            int r6 = r6.getInt()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            int r7 = r6 + 4
            if (r3 >= r7) goto L_0x0039
            return r2
        L_0x0039:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r8.<init>(r0, r4, r6)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            org.json.JSONArray r6 = r4.names()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            int r8 = r6.length()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r10 = 0
        L_0x004e:
            if (r10 >= r8) goto L_0x0059
            java.lang.String r11 = r6.getString(r10)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r9[r10] = r11     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0059:
            java.util.Arrays.sort(r9)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r6.<init>()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            java.util.Map r10 = m14251a()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r11 = 0
        L_0x0066:
            if (r11 >= r8) goto L_0x00c1
            r12 = r9[r11]     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            org.json.JSONArray r13 = r4.getJSONArray(r12)     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            int r14 = r13.length()     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            int[] r15 = new int[r14]     // Catch:{ Exception -> 0x00c8, all -> 0x00c2 }
            r16 = 1
            r2 = 0
            r5 = 1
        L_0x0078:
            if (r2 >= r14) goto L_0x0089
            int r17 = r13.getInt(r2)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            r15[r2] = r17     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            r17 = r15[r2]     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            int r5 = r5 * r17
            int r2 = r2 + 1
            goto L_0x0078
        L_0x0087:
            r1 = 0
            goto L_0x00c9
        L_0x0089:
            int r2 = r5 * 4
            int r13 = r7 + r2
            if (r13 <= r3) goto L_0x0091
            r14 = 0
            return r14
        L_0x0091:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0, r7, r2)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            r2.order(r7)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            com.facebook.t.v.a r7 = new com.facebook.t.v.a     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            r7.<init>(r15)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            float[] r14 = r7.mo21433a()     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            r15 = 0
            r2.get(r14, r15, r5)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            boolean r2 = r10.containsKey(r12)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r10.get(r12)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
        L_0x00b8:
            r6.put(r12, r7)     // Catch:{ Exception -> 0x0087, all -> 0x00c2 }
            int r11 = r11 + 1
            r7 = r13
            r2 = 0
            r5 = 0
            goto L_0x0066
        L_0x00c1:
            return r6
        L_0x00c2:
            r0 = move-exception
            com.facebook.internal.p168a0.p170f.C6391a.m13259a(r0, r1)
            r1 = 0
            return r1
        L_0x00c8:
            r1 = r2
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p182v.C6670b.m14252b(java.io.File):java.util.Map");
    }

    /* renamed from: a */
    public C6669a mo21435a(C6669a aVar, String[] strArr, String str) {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            C6669a b = C6682d.m14289b(C6682d.m14284a(strArr, 128, this.f12431a), this.f12432b);
            C6682d.m14287a(b, this.f12435e);
            C6682d.m14285a(b);
            C6669a b2 = C6682d.m14289b(b, this.f12433c);
            C6682d.m14287a(b2, this.f12436f);
            C6682d.m14285a(b2);
            C6669a b3 = C6682d.m14288b(b2, 2);
            C6669a b4 = C6682d.m14289b(b3, this.f12434d);
            C6682d.m14287a(b4, this.f12437g);
            C6682d.m14285a(b4);
            C6669a b5 = C6682d.m14288b(b, b.mo21431a(1));
            C6669a b6 = C6682d.m14288b(b3, b3.mo21431a(1));
            C6669a b7 = C6682d.m14288b(b4, b4.mo21431a(1));
            C6682d.m14286a(b5, 1);
            C6682d.m14286a(b6, 1);
            C6682d.m14286a(b7, 1);
            C6669a a = C6682d.m14282a(C6682d.m14283a(new C6669a[]{b5, b6, b7, aVar}), this.f12438h, this.f12440j);
            C6682d.m14285a(a);
            C6669a a2 = C6682d.m14282a(a, this.f12439i, this.f12441k);
            C6682d.m14285a(a2);
            Map<String, C6669a> map = this.f12442l;
            C6669a aVar2 = map.get(str + ".weight");
            Map<String, C6669a> map2 = this.f12442l;
            C6669a aVar3 = map2.get(str + ".bias");
            if (aVar2 != null) {
                if (aVar3 != null) {
                    C6669a a3 = C6682d.m14282a(a2, aVar2, aVar3);
                    C6682d.m14290b(a3);
                    return a3;
                }
            }
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }

    /* renamed from: a */
    public static C6670b m14250a(File file) {
        Class<C6670b> cls = C6670b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            try {
                return new C6670b(m14252b(file));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    private static Map<String, String> m14251a() {
        Class<C6670b> cls = C6670b.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return new C6672b();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
