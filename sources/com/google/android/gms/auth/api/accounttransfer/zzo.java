package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p050l.p066e.C4868a;

@SafeParcelable.Class
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: l */
    private static final C4868a<String, FastJsonResponse.Field<?, ?>> f13453l;
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13454f;
    @SafeParcelable.Field

    /* renamed from: g */
    private List<String> f13455g;
    @SafeParcelable.Field

    /* renamed from: h */
    private List<String> f13456h;
    @SafeParcelable.Field

    /* renamed from: i */
    private List<String> f13457i;
    @SafeParcelable.Field

    /* renamed from: j */
    private List<String> f13458j;
    @SafeParcelable.Field

    /* renamed from: k */
    private List<String> f13459k;

    static {
        C4868a<String, FastJsonResponse.Field<?, ?>> aVar = new C4868a<>();
        f13453l = aVar;
        aVar.put("registered", FastJsonResponse.Field.m16207d("registered", 2));
        f13453l.put("in_progress", FastJsonResponse.Field.m16207d("in_progress", 3));
        f13453l.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, FastJsonResponse.Field.m16207d(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, 4));
        f13453l.put("failed", FastJsonResponse.Field.m16207d("failed", 5));
        f13453l.put("escrowed", FastJsonResponse.Field.m16207d("escrowed", 6));
    }

    public zzo() {
        this.f13454f = 1;
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo24665a() {
        return f13453l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo24666b(FastJsonResponse.Field field) {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13454f);
        SafeParcelWriter.m16153b(parcel, 2, this.f13455g, false);
        SafeParcelWriter.m16153b(parcel, 3, this.f13456h, false);
        SafeParcelWriter.m16153b(parcel, 4, this.f13457i, false);
        SafeParcelWriter.m16153b(parcel, 5, this.f13458j, false);
        SafeParcelWriter.m16153b(parcel, 6, this.f13459k, false);
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo24664a(FastJsonResponse.Field field) {
        switch (field.mo25454d()) {
            case 1:
                return Integer.valueOf(this.f13454f);
            case 2:
                return this.f13455g;
            case 3:
                return this.f13456h;
            case 4:
                return this.f13457i;
            case 5:
                return this.f13458j;
            case 6:
                return this.f13459k;
            default:
                int d = field.mo25454d();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(d);
                throw new IllegalStateException(sb.toString());
        }
    }

    @SafeParcelable.Constructor
    zzo(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) List<String> list, @SafeParcelable.Param(id = 3) List<String> list2, @SafeParcelable.Param(id = 4) List<String> list3, @SafeParcelable.Param(id = 5) List<String> list4, @SafeParcelable.Param(id = 6) List<String> list5) {
        this.f13454f = i;
        this.f13455g = list;
        this.f13456h = list2;
        this.f13457i = list3;
        this.f13458j = list4;
        this.f13459k = list5;
    }
}
