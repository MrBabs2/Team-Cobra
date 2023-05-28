package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;

public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    public static final class C5835b {

        /* renamed from: a */
        private final Context f10516a;

        /* renamed from: a */
        public InstallReferrerClient mo19752a() {
            Context context = this.f10516a;
            if (context != null) {
                return new C5836a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C5835b(Context context) {
            this.f10516a = context;
        }
    }

    /* renamed from: a */
    public static C5835b m11394a(Context context) {
        return new C5835b(context);
    }

    /* renamed from: a */
    public abstract ReferrerDetails mo19750a() throws RemoteException;

    /* renamed from: a */
    public abstract void mo19751a(InstallReferrerStateListener installReferrerStateListener);
}
