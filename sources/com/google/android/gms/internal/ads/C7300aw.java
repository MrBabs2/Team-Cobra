package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: com.google.android.gms.internal.ads.aw */
final class C7300aw {
    /* renamed from: a */
    static String m16509a(zzdpk zzdpk, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m16511a(zzdpk, sb, 0);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f2, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0204, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0215, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0227, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x025d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m16511a(com.google.android.gms.internal.ads.zzdpk r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.lang.Class r6 = r18.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = 0
        L_0x0020:
            java.lang.String r10 = "get"
            if (r9 >= r7) goto L_0x004f
            r11 = r6[r9]
            java.lang.String r12 = r11.getName()
            r4.put(r12, r11)
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L_0x004c
            java.lang.String r12 = r11.getName()
            r3.put(r12, r11)
            java.lang.String r12 = r11.getName()
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = r11.getName()
            r5.add(r10)
        L_0x004c:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x004f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0276
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r9 = r6.replaceFirst(r10, r7)
            java.lang.String r11 = "List"
            boolean r12 = r9.endsWith(r11)
            r13 = 1
            if (r12 == 0) goto L_0x00c9
            java.lang.String r12 = "OrBuilderList"
            boolean r12 = r9.endsWith(r12)
            if (r12 != 0) goto L_0x00c9
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x00c9
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + -4
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto L_0x00a1
            java.lang.String r11 = r11.concat(r12)
            goto L_0x00a7
        L_0x00a1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L_0x00a7:
            java.lang.Object r12 = r3.get(r6)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L_0x00c9
            java.lang.Class r14 = r12.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00c9
            java.lang.String r6 = m16510a(r11)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.ads.zzdob.m24004a((java.lang.reflect.Method) r12, (java.lang.Object) r0, (java.lang.Object[]) r7)
            m16512a(r1, r2, r6, r7)
            goto L_0x0053
        L_0x00c9:
            java.lang.String r11 = "Map"
            boolean r12 = r9.endsWith(r11)
            if (r12 == 0) goto L_0x0137
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0137
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + -3
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto L_0x00fc
            java.lang.String r11 = r11.concat(r12)
            goto L_0x0102
        L_0x00fc:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L_0x0102:
            java.lang.Object r6 = r3.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0137
            java.lang.Class r12 = r6.getReturnType()
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x0137
            java.lang.Class<java.lang.Deprecated> r12 = java.lang.Deprecated.class
            boolean r12 = r6.isAnnotationPresent(r12)
            if (r12 != 0) goto L_0x0137
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L_0x0137
            java.lang.String r7 = m16510a(r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzdob.m24004a((java.lang.reflect.Method) r6, (java.lang.Object) r0, (java.lang.Object[]) r9)
            m16512a(r1, r2, r7, r6)
            goto L_0x0053
        L_0x0137:
            java.lang.String r6 = "set"
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x0148
            java.lang.String r6 = r6.concat(r11)
            goto L_0x014e
        L_0x0148:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L_0x014e:
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0053
            java.lang.String r6 = "Bytes"
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x0182
            int r6 = r9.length()
            int r6 = r6 + -5
            java.lang.String r6 = r9.substring(r8, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r11 = r6.length()
            if (r11 == 0) goto L_0x0177
            java.lang.String r6 = r10.concat(r6)
            goto L_0x017c
        L_0x0177:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r10)
        L_0x017c:
            boolean r6 = r3.containsKey(r6)
            if (r6 != 0) goto L_0x0053
        L_0x0182:
            java.lang.String r6 = r9.substring(r8, r13)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r11 = r9.substring(r13)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x01a1
            java.lang.String r6 = r6.concat(r11)
            goto L_0x01a7
        L_0x01a1:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L_0x01a7:
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r12 = r11.length()
            if (r12 == 0) goto L_0x01b6
            java.lang.String r11 = r10.concat(r11)
            goto L_0x01bb
        L_0x01b6:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
        L_0x01bb:
            java.lang.Object r11 = r3.get(r11)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r12 = "has"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r14 = r9.length()
            if (r14 == 0) goto L_0x01d2
            java.lang.String r9 = r12.concat(r9)
            goto L_0x01d7
        L_0x01d2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r12)
        L_0x01d7:
            java.lang.Object r9 = r3.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r11 == 0) goto L_0x0053
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r11 = com.google.android.gms.internal.ads.zzdob.m24004a((java.lang.reflect.Method) r11, (java.lang.Object) r0, (java.lang.Object[]) r12)
            if (r9 != 0) goto L_0x025f
            boolean r9 = r11 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x01f9
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x01f7
        L_0x01f4:
            r7 = 1
            goto L_0x025a
        L_0x01f7:
            r7 = 0
            goto L_0x025a
        L_0x01f9:
            boolean r9 = r11 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x0207
            r7 = r11
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x01f7
            goto L_0x01f4
        L_0x0207:
            boolean r9 = r11 instanceof java.lang.Float
            if (r9 == 0) goto L_0x0218
            r7 = r11
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x01f7
            goto L_0x01f4
        L_0x0218:
            boolean r9 = r11 instanceof java.lang.Double
            if (r9 == 0) goto L_0x022a
            r7 = r11
            java.lang.Double r7 = (java.lang.Double) r7
            double r14 = r7.doubleValue()
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x01f7
            goto L_0x01f4
        L_0x022a:
            boolean r9 = r11 instanceof java.lang.String
            if (r9 == 0) goto L_0x0233
            boolean r7 = r11.equals(r7)
            goto L_0x025a
        L_0x0233:
            boolean r7 = r11 instanceof com.google.android.gms.internal.ads.zzdmr
            if (r7 == 0) goto L_0x023e
            com.google.android.gms.internal.ads.zzdmr r7 = com.google.android.gms.internal.ads.zzdmr.f21488g
            boolean r7 = r11.equals(r7)
            goto L_0x025a
        L_0x023e:
            boolean r7 = r11 instanceof com.google.android.gms.internal.ads.zzdpk
            if (r7 == 0) goto L_0x024c
            r7 = r11
            com.google.android.gms.internal.ads.zzdpk r7 = (com.google.android.gms.internal.ads.zzdpk) r7
            com.google.android.gms.internal.ads.zzdpk r7 = r7.mo29132f()
            if (r11 != r7) goto L_0x01f7
            goto L_0x01f4
        L_0x024c:
            boolean r7 = r11 instanceof java.lang.Enum
            if (r7 == 0) goto L_0x01f7
            r7 = r11
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L_0x01f7
            goto L_0x01f4
        L_0x025a:
            if (r7 != 0) goto L_0x025d
            goto L_0x026b
        L_0x025d:
            r13 = 0
            goto L_0x026b
        L_0x025f:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.ads.zzdob.m24004a((java.lang.reflect.Method) r9, (java.lang.Object) r0, (java.lang.Object[]) r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
        L_0x026b:
            if (r13 == 0) goto L_0x0053
            java.lang.String r6 = m16510a(r6)
            m16512a(r1, r2, r6, r11)
            goto L_0x0053
        L_0x0276:
            boolean r3 = r0 instanceof com.google.android.gms.internal.ads.zzdob.zzc
            if (r3 == 0) goto L_0x0299
            r3 = r0
            com.google.android.gms.internal.ads.zzdob$zzc r3 = (com.google.android.gms.internal.ads.zzdob.zzc) r3
            com.google.android.gms.internal.ads.zu<java.lang.Object> r3 = r3.zzhhj
            java.util.Iterator r3 = r3.mo26895e()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x028a
            goto L_0x0299
        L_0x028a:
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0299:
            com.google.android.gms.internal.ads.zzdob r0 = (com.google.android.gms.internal.ads.zzdob) r0
            com.google.android.gms.internal.ads.zzdqu r0 = r0.zzhhd
            if (r0 == 0) goto L_0x02a2
            r0.mo29177a((java.lang.StringBuilder) r1, (int) r2)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7300aw.m16511a(com.google.android.gms.internal.ads.zzdpk, java.lang.StringBuilder, int):void");
    }

    /* renamed from: a */
    static final void m16512a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m16512a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a2 : ((Map) obj).entrySet()) {
                m16512a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C7338bx.m16699a(zzdmr.m23762a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzdmr) {
                sb.append(": \"");
                sb.append(C7338bx.m16699a((zzdmr) obj));
                sb.append('\"');
            } else if (obj instanceof zzdob) {
                sb.append(" {");
                m16511a((zzdob) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m16512a(sb, i4, RoomNotification.KEY, entry.getKey());
                m16512a(sb, i4, DonationsAnalytics.VALUE, entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: a */
    private static final String m16510a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
