package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzauy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzauy> CREATOR = new zzauz();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f18545f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final String f18546g;
    @SafeParcelable.Field

    /* renamed from: h */
    public final boolean f18547h;
    @SafeParcelable.Field

    /* renamed from: i */
    public final boolean f18548i;
    @SafeParcelable.Field

    /* renamed from: j */
    public final List<String> f18549j;
    @SafeParcelable.Field

    /* renamed from: k */
    public final boolean f18550k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final boolean f18551l;
    @SafeParcelable.Field

    /* renamed from: m */
    public final List<String> f18552m;

    @SafeParcelable.Constructor
    public zzauy(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) List<String> list2) {
        this.f18545f = str;
        this.f18546g = str2;
        this.f18547h = z;
        this.f18548i = z2;
        this.f18549j = list;
        this.f18550k = z3;
        this.f18551l = z4;
        this.f18552m = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: a */
    public static zzauy m20050a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzauy(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzazc.m20428a(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzazc.m20428a(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f18545f, false);
        SafeParcelWriter.m16143a(parcel, 3, this.f18546g, false);
        SafeParcelWriter.m16146a(parcel, 4, this.f18547h);
        SafeParcelWriter.m16146a(parcel, 5, this.f18548i);
        SafeParcelWriter.m16153b(parcel, 6, this.f18549j, false);
        SafeParcelWriter.m16146a(parcel, 7, this.f18550k);
        SafeParcelWriter.m16146a(parcel, 8, this.f18551l);
        SafeParcelWriter.m16153b(parcel, 9, this.f18552m, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
