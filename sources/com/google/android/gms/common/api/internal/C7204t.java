package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.t */
final class C7204t implements ResultCallback<Status> {

    /* renamed from: a */
    private final /* synthetic */ StatusPendingResult f13843a;

    /* renamed from: b */
    private final /* synthetic */ boolean f13844b;

    /* renamed from: c */
    private final /* synthetic */ GoogleApiClient f13845c;

    /* renamed from: d */
    private final /* synthetic */ zaaw f13846d;

    C7204t(zaaw zaaw, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.f13846d = zaaw;
        this.f13843a = statusPendingResult;
        this.f13844b = z;
        this.f13845c = googleApiClient;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24971a(Result result) {
        Status status = (Status) result;
        Storage.m15189a(this.f13846d.f13896g).mo24796e();
        if (status.mo24986q() && this.f13846d.mo25161j()) {
            this.f13846d.mo25162k();
        }
        this.f13843a.mo25012a(status);
        if (this.f13844b) {
            this.f13845c.mo24949d();
        }
    }
}
