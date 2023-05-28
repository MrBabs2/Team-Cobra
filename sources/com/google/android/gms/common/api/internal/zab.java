package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.util.PlatformVersion;

public abstract class zab {
    public zab(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m15723a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (PlatformVersion.m16286b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo25110a(Status status);

    /* renamed from: a */
    public abstract void mo25111a(GoogleApiManager.zaa<?> zaa) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo25166a(zaab zaab, boolean z);

    /* renamed from: a */
    public abstract void mo25112a(RuntimeException runtimeException);
}
