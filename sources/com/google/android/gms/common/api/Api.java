package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api<O extends ApiOptions> {

    /* renamed from: a */
    private final AbstractClientBuilder<?, O> f13635a;

    /* renamed from: b */
    private final ClientKey<?> f13636b;

    /* renamed from: c */
    private final String f13637c;

    @KeepForSdk
    @VisibleForTesting
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @KeepForSdk
        /* renamed from: a */
        public abstract T mo24654a(Context context, Looper looper, ClientSettings clientSettings, O o, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);
    }

    @KeepForSdk
    public interface AnyClient {
    }

    @KeepForSdk
    public static class AnyClientKey<C extends AnyClient> {
    }

    public interface ApiOptions {

        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            /* renamed from: a */
            GoogleSignInAccount mo24893a();
        }

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @KeepForSdk
        /* renamed from: a */
        public int mo24894a() {
            return Integer.MAX_VALUE;
        }

        @KeepForSdk
        /* renamed from: a */
        public List<Scope> mo24681a(O o) {
            return Collections.emptyList();
        }
    }

    @KeepForSdk
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        @KeepForSdk
        Feature[] getAvailableFeatures();

        @KeepForSdk
        String getEndpointPackageName();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        @KeepForSdk
        IBinder getServiceBrokerBinder();

        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    @KeepForSdk
    @VisibleForTesting
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    public interface SimpleClient<T extends IInterface> extends AnyClient {
        /* renamed from: a */
        void mo24907a(int i, T t);

        T createServiceInterface(IBinder iBinder);

        String getServiceDescriptor();

        String getStartServiceAction();
    }

    @VisibleForTesting
    public static abstract class zaa<T extends SimpleClient, O> extends BaseClientBuilder<T, O> {
    }

    @VisibleForTesting
    public static final class zab<C extends SimpleClient> extends AnyClientKey<C> {
    }

    public <C extends Client> Api(String str, AbstractClientBuilder<C, O> abstractClientBuilder, ClientKey<C> clientKey) {
        Preconditions.m16038a(abstractClientBuilder, (Object) "Cannot construct an Api with a null ClientBuilder");
        Preconditions.m16038a(clientKey, (Object) "Cannot construct an Api with a null ClientKey");
        this.f13637c = str;
        this.f13635a = abstractClientBuilder;
        this.f13636b = clientKey;
    }

    /* renamed from: a */
    public final AnyClientKey<?> mo24888a() {
        ClientKey<?> clientKey = this.f13636b;
        if (clientKey != null) {
            return clientKey;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo24889b() {
        return this.f13637c;
    }

    /* renamed from: c */
    public final BaseClientBuilder<?, O> mo24890c() {
        return this.f13635a;
    }

    /* renamed from: d */
    public final AbstractClientBuilder<?, O> mo24891d() {
        Preconditions.m16048b(this.f13635a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f13635a;
    }
}
