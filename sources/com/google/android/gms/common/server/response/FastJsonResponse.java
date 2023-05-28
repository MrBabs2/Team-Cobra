package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    @SafeParcelable.Class
    @VisibleForTesting
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zai CREATOR = new zai();
        @SafeParcelable.VersionField

        /* renamed from: f */
        private final int f14218f;
        @SafeParcelable.Field

        /* renamed from: g */
        protected final int f14219g;
        @SafeParcelable.Field

        /* renamed from: h */
        protected final boolean f14220h;
        @SafeParcelable.Field

        /* renamed from: i */
        protected final int f14221i;
        @SafeParcelable.Field

        /* renamed from: j */
        protected final boolean f14222j;
        @SafeParcelable.Field

        /* renamed from: k */
        protected final String f14223k;
        @SafeParcelable.Field

        /* renamed from: l */
        protected final int f14224l;

        /* renamed from: m */
        protected final Class<? extends FastJsonResponse> f14225m;
        @SafeParcelable.Field

        /* renamed from: n */
        private final String f14226n;

        /* renamed from: o */
        private zak f14227o;
        /* access modifiers changed from: private */
        @SafeParcelable.Field

        /* renamed from: p */
        public FieldConverter<I, O> f14228p;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) zaa zaa) {
            this.f14218f = i;
            this.f14219g = i2;
            this.f14220h = z;
            this.f14221i = i3;
            this.f14222j = z2;
            this.f14223k = str;
            this.f14224l = i4;
            if (str2 == null) {
                this.f14225m = null;
                this.f14226n = null;
            } else {
                this.f14225m = SafeParcelResponse.class;
                this.f14226n = str2;
            }
            if (zaa == null) {
                this.f14228p = null;
            } else {
                this.f14228p = zaa.mo25441d();
            }
        }

        @KeepForSdk
        @VisibleForTesting
        /* renamed from: b */
        public static Field<Integer, Integer> m16204b(String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        /* renamed from: c */
        public static Field<String, String> m16206c(String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        /* renamed from: q */
        private final String m16208q() {
            String str = this.f14226n;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: t */
        private final zaa m16209t() {
            FieldConverter<I, O> fieldConverter = this.f14228p;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.m16192a(fieldConverter);
        }

        /* renamed from: a */
        public final void mo25453a(zak zak) {
            this.f14227o = zak;
        }

        @KeepForSdk
        /* renamed from: d */
        public int mo25454d() {
            return this.f14224l;
        }

        /* renamed from: o */
        public final boolean mo25455o() {
            return this.f14228p != null;
        }

        /* renamed from: p */
        public final Map<String, Field<?, ?>> mo25456p() {
            Preconditions.m16037a(this.f14226n);
            Preconditions.m16037a(this.f14227o);
            return this.f14227o.mo25467a(this.f14226n);
        }

        public String toString() {
            Objects.ToStringHelper a = Objects.m16030a((Object) this);
            a.mo25372a(RoomInstalled.VERSION_CODE, Integer.valueOf(this.f14218f));
            a.mo25372a("typeIn", Integer.valueOf(this.f14219g));
            a.mo25372a("typeInArray", Boolean.valueOf(this.f14220h));
            a.mo25372a("typeOut", Integer.valueOf(this.f14221i));
            a.mo25372a("typeOutArray", Boolean.valueOf(this.f14222j));
            a.mo25372a("outputFieldName", this.f14223k);
            a.mo25372a("safeParcelFieldId", Integer.valueOf(this.f14224l));
            a.mo25372a("concreteTypeName", m16208q());
            Class<? extends FastJsonResponse> cls = this.f14225m;
            if (cls != null) {
                a.mo25372a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f14228p;
            if (fieldConverter != null) {
                a.mo25372a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = SafeParcelWriter.m16131a(parcel);
            SafeParcelWriter.m16135a(parcel, 1, this.f14218f);
            SafeParcelWriter.m16135a(parcel, 2, this.f14219g);
            SafeParcelWriter.m16146a(parcel, 3, this.f14220h);
            SafeParcelWriter.m16135a(parcel, 4, this.f14221i);
            SafeParcelWriter.m16146a(parcel, 5, this.f14222j);
            SafeParcelWriter.m16143a(parcel, 6, this.f14223k, false);
            SafeParcelWriter.m16135a(parcel, 7, mo25454d());
            SafeParcelWriter.m16143a(parcel, 8, m16208q(), false);
            SafeParcelWriter.m16140a(parcel, 9, (Parcelable) m16209t(), i, false);
            SafeParcelWriter.m16132a(parcel, a);
        }

        @KeepForSdk
        /* renamed from: b */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m16205b(String str, int i, Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (FieldConverter) null);
        }

        @KeepForSdk
        /* renamed from: d */
        public static Field<ArrayList<String>, ArrayList<String>> m16207d(String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        /* renamed from: a */
        public final I mo25452a(O o) {
            return this.f14228p.mo25438a(o);
        }

        @KeepForSdk
        @VisibleForTesting
        /* renamed from: a */
        public static Field<byte[], byte[]> m16201a(String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m16202a(String str, int i, Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (FieldConverter) null);
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, FieldConverter<I, O> fieldConverter) {
            this.f14218f = 1;
            this.f14219g = i;
            this.f14220h = z;
            this.f14221i = i2;
            this.f14222j = z2;
            this.f14223k = str;
            this.f14224l = i3;
            this.f14225m = cls;
            if (cls == null) {
                this.f14226n = null;
            } else {
                this.f14226n = cls.getCanonicalName();
            }
            this.f14228p = fieldConverter;
        }
    }

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        /* renamed from: a */
        I mo25438a(O o);
    }

    /* renamed from: a */
    protected static <O, I> I m16194a(Field<I, O> field, Object obj) {
        return field.f14228p != null ? field.mo25452a(obj) : obj;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public abstract Object mo25449a(String str);

    @KeepForSdk
    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo24665a();

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public boolean mo24666b(Field field) {
        if (field.f14221i != 11) {
            return mo25450b(field.f14223k);
        }
        if (field.f14222j) {
            String str = field.f14223k;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.f14223k;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public abstract boolean mo25450b(String str);

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> a = mo24665a();
        StringBuilder sb = new StringBuilder(100);
        for (String next : a.keySet()) {
            Field field = a.get(next);
            if (mo24666b(field)) {
                Object a2 = m16194a(field, mo24664a(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (a2 != null) {
                    switch (field.f14221i) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.m16248a((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.m16249b((byte[]) a2));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.m16283a(sb, (HashMap) a2);
                            break;
                        default:
                            if (!field.f14220h) {
                                m16195a(sb, field, a2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) a2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m16195a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public Object mo24664a(Field field) {
        String str = field.f14223k;
        if (field.f14225m == null) {
            return mo25449a(str);
        }
        Preconditions.m16049b(mo25449a(str) == null, "Concrete field shouldn't be value object: %s", field.f14223k);
        boolean z = field.f14222j;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m16195a(StringBuilder sb, Field field, Object obj) {
        int i = field.f14219g;
        if (i == 11) {
            sb.append(((FastJsonResponse) field.f14225m.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(JsonUtils.m16282a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }
}
