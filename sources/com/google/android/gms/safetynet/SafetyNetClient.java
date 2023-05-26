package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.Task;

public class SafetyNetClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    SafetyNetClient(Context context) {
        super(context, SafetyNet.f23668c, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    /* renamed from: h */
    public Task<SafetyNetApi.HarmfulAppsResponse> mo30657h() {
        return PendingResultUtil.m16033a(SafetyNet.f23669d.mo30516a(mo24922a()), new SafetyNetApi.HarmfulAppsResponse());
    }
}
