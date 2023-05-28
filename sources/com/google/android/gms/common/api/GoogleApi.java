package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public class GoogleApi<O extends Api.ApiOptions> {

    /* renamed from: a */
    private final Context f13644a;

    /* renamed from: b */
    private final Api<O> f13645b;

    /* renamed from: c */
    private final O f13646c;

    /* renamed from: d */
    private final zai<O> f13647d;

    /* renamed from: e */
    private final Looper f13648e;

    /* renamed from: f */
    private final int f13649f;

    /* renamed from: g */
    private final GoogleApiClient f13650g;

    /* renamed from: h */
    protected final GoogleApiManager f13651h;

    @KeepForSdk
    public static class Settings {

        /* renamed from: a */
        public final StatusExceptionMapper f13652a;

        /* renamed from: b */
        public final Looper f13653b;

        static {
            new Builder().mo24933a();
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f13652a = statusExceptionMapper;
            this.f13653b = looper;
        }

        @KeepForSdk
        public static class Builder {

            /* renamed from: a */
            private StatusExceptionMapper f13654a;

            /* renamed from: b */
            private Looper f13655b;

            @KeepForSdk
            /* renamed from: a */
            public Builder mo24932a(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.m16038a(statusExceptionMapper, (Object) "StatusExceptionMapper must not be null.");
                this.f13654a = statusExceptionMapper;
                return this;
            }

            @KeepForSdk
            /* renamed from: a */
            public Settings mo24933a() {
                if (this.f13654a == null) {
                    this.f13654a = new ApiExceptionMapper();
                }
                if (this.f13655b == null) {
                    this.f13655b = Looper.getMainLooper();
                }
                return new Settings(this.f13654a, this.f13655b);
            }
        }
    }

    @KeepForSdk
    protected GoogleApi(Context context, Api<O> api, Looper looper) {
        Preconditions.m16038a(context, (Object) "Null context is not permitted.");
        Preconditions.m16038a(api, (Object) "Api must not be null.");
        Preconditions.m16038a(looper, (Object) "Looper must not be null.");
        this.f13644a = context.getApplicationContext();
        this.f13645b = api;
        this.f13646c = null;
        this.f13648e = looper;
        this.f13647d = zai.m15826a(api);
        this.f13650g = new zabp(this);
        GoogleApiManager a = GoogleApiManager.m15418a(this.f13644a);
        this.f13651h = a;
        this.f13649f = a.mo25030b();
        new ApiExceptionMapper();
    }

    /* renamed from: a */
    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T m15312a(int i, T t) {
        t.mo25019f();
        this.f13651h.mo25028a(this, i, t);
        return t;
    }

    @KeepForSdk
    /* renamed from: b */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo24925b(T t) {
        m15312a(1, t);
        return t;
    }

    /* renamed from: c */
    public final Api<O> mo24927c() {
        return this.f13645b;
    }

    @KeepForSdk
    /* renamed from: d */
    public Context mo24928d() {
        return this.f13644a;
    }

    /* renamed from: e */
    public final int mo24929e() {
        return this.f13649f;
    }

    @KeepForSdk
    /* renamed from: f */
    public Looper mo24930f() {
        return this.f13648e;
    }

    /* renamed from: g */
    public final zai<O> mo24931g() {
        return this.f13647d;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public ClientSettings.Builder mo24926b() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a;
        GoogleSignInAccount a2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.f13646c;
        if (!(o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (a2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).mo24893a()) == null) {
            O o2 = this.f13646c;
            account = o2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        } else {
            account = a2.getAccount();
        }
        builder.mo25333a(account);
        O o3 = this.f13646c;
        if (!(o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (a = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).mo24893a()) == null) {
            set = Collections.emptySet();
        } else {
            set = a.mo24745w();
        }
        builder.mo25335a((Collection<Scope>) set);
        builder.mo25334a(this.f13644a.getClass().getName());
        builder.mo25337b(this.f13644a.getPackageName());
        return builder;
    }

    @KeepForSdk
    /* renamed from: a */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo24923a(T t) {
        m15312a(0, t);
        return t;
    }

    /* renamed from: a */
    public Api.Client mo24921a(Looper looper, GoogleApiManager.zaa<O> zaa) {
        return this.f13645b.mo24891d().mo24654a(this.f13644a, looper, mo24926b().mo25336a(), this.f13646c, zaa, zaa);
    }

    @KeepForSdk
    /* renamed from: a */
    public GoogleApiClient mo24922a() {
        return this.f13650g;
    }

    /* renamed from: a */
    public zace mo24924a(Context context, Handler handler) {
        return new zace(context, handler, mo24926b().mo25336a());
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        Preconditions.m16038a(context, (Object) "Null context is not permitted.");
        Preconditions.m16038a(api, (Object) "Api must not be null.");
        Preconditions.m16038a(settings, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f13644a = context.getApplicationContext();
        this.f13645b = api;
        this.f13646c = o;
        this.f13648e = settings.f13653b;
        this.f13647d = zai.m15827a(api, o);
        this.f13650g = new zabp(this);
        GoogleApiManager a = GoogleApiManager.m15418a(this.f13644a);
        this.f13651h = a;
        this.f13649f = a.mo25030b();
        StatusExceptionMapper statusExceptionMapper = settings.f13652a;
        this.f13651h.mo25027a((GoogleApi<?>) this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.mo24932a(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.mo24933a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.GoogleApi.Settings) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
