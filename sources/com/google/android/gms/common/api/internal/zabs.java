package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public interface zabs {
    /* renamed from: a */
    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25122a(T t);

    /* renamed from: a */
    void mo25123a();

    /* renamed from: a */
    boolean mo25124a(SignInConnectionListener signInConnectionListener);

    /* renamed from: b */
    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25125b(T t);

    /* renamed from: b */
    void mo25126b();

    /* renamed from: c */
    void mo25127c();

    /* renamed from: d */
    ConnectionResult mo25128d();

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean isConnected();
}
