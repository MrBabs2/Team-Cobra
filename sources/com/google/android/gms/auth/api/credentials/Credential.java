package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

@SafeParcelable.Class
@SafeParcelable.Reserved
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f13475f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f13476g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final Uri f13477h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final List<IdToken> f13478i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final String f13479j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final String f13480k;
    @SafeParcelable.Field

    /* renamed from: l */
    private final String f13481l;
    @SafeParcelable.Field

    /* renamed from: m */
    private final String f13482m;

    public static class Builder {
    }

    @SafeParcelable.Constructor
    Credential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) Uri uri, @SafeParcelable.Param(id = 4) List<IdToken> list, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 9) String str5, @SafeParcelable.Param(id = 10) String str6) {
        List<IdToken> list2;
        Preconditions.m16038a(str, (Object) "credential identifier cannot be null");
        String trim = str.trim();
        Preconditions.m16039a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f13476g = str2;
                this.f13477h = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f13478i = list2;
                this.f13475f = trim;
                this.f13479j = str3;
                this.f13480k = str4;
                this.f13481l = str5;
                this.f13482m = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    /* renamed from: d */
    public String mo24682d() {
        return this.f13480k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f13475f, credential.f13475f) && TextUtils.equals(this.f13476g, credential.f13476g) && Objects.m16031a(this.f13477h, credential.f13477h) && TextUtils.equals(this.f13479j, credential.f13479j) && TextUtils.equals(this.f13480k, credential.f13480k);
    }

    public int hashCode() {
        return Objects.m16029a(this.f13475f, this.f13476g, this.f13477h, this.f13479j, this.f13480k);
    }

    /* renamed from: o */
    public String mo24685o() {
        return this.f13482m;
    }

    /* renamed from: p */
    public String mo24686p() {
        return this.f13481l;
    }

    /* renamed from: q */
    public String mo24687q() {
        return this.f13475f;
    }

    /* renamed from: t */
    public List<IdToken> mo24688t() {
        return this.f13478i;
    }

    /* renamed from: u */
    public String mo24689u() {
        return this.f13476g;
    }

    /* renamed from: v */
    public String mo24690v() {
        return this.f13479j;
    }

    /* renamed from: w */
    public Uri mo24691w() {
        return this.f13477h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 1, mo24687q(), false);
        SafeParcelWriter.m16143a(parcel, 2, mo24689u(), false);
        SafeParcelWriter.m16140a(parcel, 3, (Parcelable) mo24691w(), i, false);
        SafeParcelWriter.m16155c(parcel, 4, mo24688t(), false);
        SafeParcelWriter.m16143a(parcel, 5, mo24690v(), false);
        SafeParcelWriter.m16143a(parcel, 6, mo24682d(), false);
        SafeParcelWriter.m16143a(parcel, 9, mo24686p(), false);
        SafeParcelWriter.m16143a(parcel, 10, mo24685o(), false);
        SafeParcelWriter.m16132a(parcel, a);
    }
}
