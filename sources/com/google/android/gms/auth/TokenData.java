package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzk();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f13418f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f13419g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final Long f13420h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final boolean f13421i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final boolean f13422j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final List<String> f13423k;
    @SafeParcelable.Field

    /* renamed from: l */
    private final String f13424l;

    @SafeParcelable.Constructor
    TokenData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Long l, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) String str2) {
        this.f13418f = i;
        Preconditions.m16046b(str);
        this.f13419g = str;
        this.f13420h = l;
        this.f13421i = z;
        this.f13422j = z2;
        this.f13423k = list;
        this.f13424l = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f13419g, tokenData.f13419g) || !Objects.m16031a(this.f13420h, tokenData.f13420h) || this.f13421i != tokenData.f13421i || this.f13422j != tokenData.f13422j || !Objects.m16031a(this.f13423k, tokenData.f13423k) || !Objects.m16031a(this.f13424l, tokenData.f13424l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m16029a(this.f13419g, this.f13420h, Boolean.valueOf(this.f13421i), Boolean.valueOf(this.f13422j), this.f13423k, this.f13424l);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16135a(parcel, 1, this.f13418f);
        SafeParcelWriter.m16143a(parcel, 2, this.f13419g, false);
        SafeParcelWriter.m16142a(parcel, 3, this.f13420h, false);
        SafeParcelWriter.m16146a(parcel, 4, this.f13421i);
        SafeParcelWriter.m16146a(parcel, 5, this.f13422j);
        SafeParcelWriter.m16153b(parcel, 6, this.f13423k, false);
        SafeParcelWriter.m16143a(parcel, 7, this.f13424l, false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
