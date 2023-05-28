package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

@KeepForSdk
public class ApiExceptionMapper implements StatusExceptionMapper {
    /* renamed from: a */
    public Exception mo24991a(Status status) {
        return ApiExceptionUtil.m15937a(status);
    }
}
