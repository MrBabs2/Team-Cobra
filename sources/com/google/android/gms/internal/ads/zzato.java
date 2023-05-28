package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzato extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzato> CREATOR = new zzatp();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f18518f;
    @SafeParcelable.Field

    /* renamed from: g */
    public final int f18519g;

    public zzato(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    /* renamed from: a */
    public static zzato m19981a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzato(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzato)) {
            zzato zzato = (zzato) obj;
            if (!Objects.m16031a(this.f18518f, zzato.f18518f) || !Objects.m16031a(Integer.valueOf(this.f18519g), Integer.valueOf(zzato.f18519g))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m16029a(this.f18518f, Integer.valueOf(this.f18519g));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f18518f, false);
        SafeParcelWriter.m16135a(parcel, 3, this.f18519g);
        SafeParcelWriter.m16132a(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzato(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.f18518f = str;
        this.f18519g = i;
    }
}
