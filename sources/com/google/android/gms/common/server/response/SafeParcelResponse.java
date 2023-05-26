package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zap();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14229f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final Parcel f14230g;

    /* renamed from: h */
    private final int f14231h = 2;
    @SafeParcelable.Field

    /* renamed from: i */
    private final zak f14232i;

    /* renamed from: j */
    private final String f14233j;

    /* renamed from: k */
    private int f14234k;

    /* renamed from: l */
    private int f14235l;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zak zak) {
        this.f14229f = i;
        Preconditions.m16037a(parcel);
        this.f14230g = parcel;
        this.f14232i = zak;
        if (zak == null) {
            this.f14233j = null;
        } else {
            this.f14233j = zak.mo25469o();
        }
        this.f14234k = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel m16221b() {
        /*
            r2 = this;
            int r0 = r2.f14234k
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.f14230g
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.m16131a(r0)
            r2.f14235l = r0
        L_0x0010:
            android.os.Parcel r0 = r2.f14230g
            int r1 = r2.f14235l
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.m16132a(r0, r1)
            r0 = 2
            r2.f14234k = r0
        L_0x001a:
            android.os.Parcel r0 = r2.f14230g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m16221b():android.os.Parcel");
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo24665a() {
        zak zak = this.f14232i;
        if (zak == null) {
            return null;
        }
        return zak.mo25467a(this.f14233j);
    }

    public String toString() {
        Preconditions.m16038a(this.f14232i, (Object) "Cannot convert to JSON on client side.");
        Parcel b = m16221b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m16220a(sb, this.f14232i.mo25467a(this.f14233j), b);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f14229f);
        SafeParcelWriter.m16139a(parcel, 2, m16221b(), false);
        int i2 = this.f14231h;
        if (i2 == 0) {
            zak = null;
        } else if (i2 == 1) {
            zak = this.f14232i;
        } else if (i2 == 2) {
            zak = this.f14232i;
        } else {
            int i3 = this.f14231h;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) zak, i, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* renamed from: a */
    public Object mo25449a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: a */
    private final void m16220a(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).mo25454d(), next);
        }
        sb.append('{');
        int b = SafeParcelReader.m16103b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m16098a(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(SafeParcelReader.m16097a(a));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.mo25455o()) {
                    switch (field.f14221i) {
                        case 0:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, Integer.valueOf(SafeParcelReader.m16127w(parcel, a))));
                            break;
                        case 1:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, SafeParcelReader.m16106c(parcel, a)));
                            break;
                        case 2:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, Long.valueOf(SafeParcelReader.m16129y(parcel, a))));
                            break;
                        case 3:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, Float.valueOf(SafeParcelReader.m16125u(parcel, a))));
                            break;
                        case 4:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, Double.valueOf(SafeParcelReader.m16124t(parcel, a))));
                            break;
                        case 5:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, SafeParcelReader.m16100a(parcel, a)));
                            break;
                        case 6:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, Boolean.valueOf(SafeParcelReader.m16123s(parcel, a))));
                            break;
                        case 7:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, SafeParcelReader.m16119o(parcel, a)));
                            break;
                        case 8:
                        case 9:
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, SafeParcelReader.m16111g(parcel, a)));
                            break;
                        case 10:
                            Bundle f = SafeParcelReader.m16110f(parcel, a);
                            HashMap hashMap = new HashMap();
                            for (String str : f.keySet()) {
                                hashMap.put(str, f.getString(str));
                            }
                            m16219a(sb, (FastJsonResponse.Field<?, ?>) field, FastJsonResponse.m16194a(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.f14221i;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f14222j) {
                    sb.append("[");
                    switch (field.f14221i) {
                        case 0:
                            ArrayUtils.m16242a(sb, SafeParcelReader.m16114j(parcel, a));
                            break;
                        case 1:
                            ArrayUtils.m16244a(sb, (T[]) SafeParcelReader.m16108d(parcel, a));
                            break;
                        case 2:
                            ArrayUtils.m16243a(sb, SafeParcelReader.m16116l(parcel, a));
                            break;
                        case 3:
                            ArrayUtils.m16241a(sb, SafeParcelReader.m16113i(parcel, a));
                            break;
                        case 4:
                            ArrayUtils.m16240a(sb, SafeParcelReader.m16112h(parcel, a));
                            break;
                        case 5:
                            ArrayUtils.m16244a(sb, (T[]) SafeParcelReader.m16105b(parcel, a));
                            break;
                        case 6:
                            ArrayUtils.m16246a(sb, SafeParcelReader.m16109e(parcel, a));
                            break;
                        case 7:
                            ArrayUtils.m16245a(sb, SafeParcelReader.m16120p(parcel, a));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n = SafeParcelReader.m16118n(parcel, a);
                            int length = n.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                n[i2].setDataPosition(0);
                                m16220a(sb, field.mo25456p(), n[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f14221i) {
                        case 0:
                            sb.append(SafeParcelReader.m16127w(parcel, a));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m16106c(parcel, a));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m16129y(parcel, a));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m16125u(parcel, a));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m16124t(parcel, a));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m16100a(parcel, a));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m16123s(parcel, a));
                            break;
                        case 7:
                            String o = SafeParcelReader.m16119o(parcel, a);
                            sb.append("\"");
                            sb.append(JsonUtils.m16282a(o));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g = SafeParcelReader.m16111g(parcel, a);
                            sb.append("\"");
                            sb.append(Base64Utils.m16248a(g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g2 = SafeParcelReader.m16111g(parcel, a);
                            sb.append("\"");
                            sb.append(Base64Utils.m16249b(g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.m16110f(parcel, a);
                            Set<String> keySet = f2.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(JsonUtils.m16282a(f2.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m = SafeParcelReader.m16117m(parcel, a);
                            m.setDataPosition(0);
                            m16220a(sb, field.mo25456p(), m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == b) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(b);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    /* renamed from: b */
    public boolean mo25450b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: a */
    private final void m16219a(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f14220h) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m16218a(sb, field.f14219g, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m16218a(sb, field.f14219g, obj);
    }

    /* renamed from: a */
    private static void m16218a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.m16282a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.m16248a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.m16249b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.m16283a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
