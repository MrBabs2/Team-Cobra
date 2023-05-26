package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.zzd;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class zzk implements SafetyNetApi {

    /* renamed from: com.google.android.gms.internal.safetynet.zzk$a */
    static abstract class C8384a extends C8381a<SafetyNetApi.zzb> {

        /* renamed from: s */
        protected final zzg f23580s = new C8383c(this);

        public C8384a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public /* synthetic */ Result mo24797a(Status status) {
            return new C8385b(status, (zzd) null);
        }
    }

    /* renamed from: com.google.android.gms.internal.safetynet.zzk$b */
    static class C8385b implements SafetyNetApi.zzb {

        /* renamed from: f */
        private final Status f23581f;

        /* renamed from: g */
        private final zzd f23582g;

        public C8385b(Status status, zzd zzd) {
            this.f23581f = status;
            this.f23582g = zzd;
        }

        /* renamed from: b */
        public final List<HarmfulAppsData> mo30517b() {
            zzd zzd = this.f23582g;
            return zzd == null ? Collections.emptyList() : Arrays.asList(zzd.f23672g);
        }

        public final Status getStatus() {
            return this.f23581f;
        }
    }

    public static class zzi implements SafetyNetApi.SafeBrowsingResult {

        /* renamed from: f */
        private Status f23583f;

        public final Status getStatus() {
            return this.f23583f;
        }
    }

    /* renamed from: a */
    public PendingResult<SafetyNetApi.zzb> mo30516a(GoogleApiClient googleApiClient) {
        return googleApiClient.mo24940a(new C8382b(this, googleApiClient));
    }
}
