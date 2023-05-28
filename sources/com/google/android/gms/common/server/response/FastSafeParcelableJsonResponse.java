package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@KeepForSdk
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @VisibleForTesting
    /* renamed from: a */
    public Object mo25449a(String str) {
        return null;
    }

    @VisibleForTesting
    /* renamed from: b */
    public boolean mo25450b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo24665a().values()) {
            if (mo24666b(next)) {
                if (!fastJsonResponse.mo24666b(next) || !mo24664a(next).equals(fastJsonResponse.mo24664a(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo24666b(next)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo24665a().values()) {
            if (mo24666b(next)) {
                i = (i * 31) + mo24664a(next).hashCode();
            }
        }
        return i;
    }
}
