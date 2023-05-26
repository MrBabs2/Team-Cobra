package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

@KeepForSdk
public class BaseImplementation {

    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        /* renamed from: a */
        void mo25006a(R r);
    }

    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk

        /* renamed from: q */
        private final Api.AnyClientKey<A> f13697q;
        @KeepForSdk

        /* renamed from: r */
        private final Api<?> f13698r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        protected ApiMethodImpl(Api<?> api, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            Preconditions.m16038a(googleApiClient, (Object) "GoogleApiClient must not be null");
            Preconditions.m16038a(api, (Object) "Api must not be null");
            this.f13697q = api.mo24888a();
            this.f13698r = api;
        }

        @KeepForSdk
        /* renamed from: a */
        private void m15389a(RemoteException remoteException) {
            mo25009c(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        /* renamed from: a */
        public abstract void mo24798a(A a) throws RemoteException;

        @KeepForSdk
        /* renamed from: b */
        public final void mo25007b(A a) throws DeadObjectException {
            if (a instanceof SimpleClientAdapter) {
                a = ((SimpleClientAdapter) a).mo25391d();
            }
            try {
                mo24798a(a);
            } catch (DeadObjectException e) {
                m15389a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m15389a(e2);
            }
        }

        /* access modifiers changed from: protected */
        @KeepForSdk
        /* renamed from: b */
        public void mo25008b(R r) {
        }

        @KeepForSdk
        /* renamed from: c */
        public final void mo25009c(Status status) {
            Preconditions.m16044a(!status.mo24986q(), (Object) "Failed result must not be success");
            Result a = mo24797a(status);
            mo25012a(a);
            mo25008b(a);
        }

        @KeepForSdk
        /* renamed from: g */
        public final Api<?> mo25010g() {
            return this.f13698r;
        }

        @KeepForSdk
        /* renamed from: h */
        public final Api.AnyClientKey<A> mo25011h() {
            return this.f13697q;
        }

        @KeepForSdk
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo25006a(Object obj) {
            super.mo25012a((Result) obj);
        }
    }
}
