package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

@SafeParcelable.Class
@SafeParcelable.Reserved
@zzard
public final class zzvv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();
    @SafeParcelable.Field

    /* renamed from: f */
    public final String f22854f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final long f22855g;
    @SafeParcelable.Field

    /* renamed from: h */
    private final String f22856h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final String f22857i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final String f22858j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final Bundle f22859k;
    @SafeParcelable.Field

    /* renamed from: l */
    public final boolean f22860l;
    @SafeParcelable.Field

    /* renamed from: m */
    public long f22861m;

    @SafeParcelable.Constructor
    zzvv(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j2) {
        this.f22854f = str;
        this.f22855g = j;
        this.f22856h = str2 == null ? "" : str2;
        this.f22857i = str3 == null ? "" : str3;
        this.f22858j = str4 == null ? "" : str4;
        this.f22859k = bundle == null ? new Bundle() : bundle;
        this.f22860l = z;
        this.f22861m = j2;
    }

    /* renamed from: a */
    public static zzvv m25451a(String str) {
        return m25450a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16143a(parcel, 2, this.f22854f, false);
        SafeParcelWriter.m16136a(parcel, 3, this.f22855g);
        SafeParcelWriter.m16143a(parcel, 4, this.f22856h, false);
        SafeParcelWriter.m16143a(parcel, 5, this.f22857i, false);
        SafeParcelWriter.m16143a(parcel, 6, this.f22858j, false);
        SafeParcelWriter.m16137a(parcel, 7, this.f22859k, false);
        SafeParcelWriter.m16146a(parcel, 8, this.f22860l);
        SafeParcelWriter.m16136a(parcel, 9, this.f22861m);
        SafeParcelWriter.m16132a(parcel, a);
    }

    /* renamed from: a */
    public static zzvv m25450a(Uri uri) {
        long j;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzbad.m20523d(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = DiskLruCache.VERSION_1.equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                j = 0;
            } else {
                j = Long.parseLong(queryParameter2);
            }
            long j2 = j;
            Bundle bundle = new Bundle();
            zzk.zzli();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new zzvv(queryParameter, j2, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e) {
            zzbad.m20522c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }
}
