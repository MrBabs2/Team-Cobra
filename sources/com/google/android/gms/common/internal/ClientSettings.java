package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p050l.p066e.C4870b;

@KeepForSdk
@VisibleForTesting
public final class ClientSettings {

    /* renamed from: a */
    private final Account f14083a;

    /* renamed from: b */
    private final Set<Scope> f14084b;

    /* renamed from: c */
    private final Set<Scope> f14085c;

    /* renamed from: d */
    private final Map<Api<?>, OptionalApiSettings> f14086d;

    /* renamed from: e */
    private final View f14087e;

    /* renamed from: f */
    private final String f14088f;

    /* renamed from: g */
    private final String f14089g;

    /* renamed from: h */
    private final SignInOptions f14090h;

    /* renamed from: i */
    private final boolean f14091i;

    /* renamed from: j */
    private Integer f14092j;

    @KeepForSdk
    public static final class Builder {

        /* renamed from: a */
        private Account f14093a;

        /* renamed from: b */
        private C4870b<Scope> f14094b;

        /* renamed from: c */
        private Map<Api<?>, OptionalApiSettings> f14095c;

        /* renamed from: d */
        private int f14096d = 0;

        /* renamed from: e */
        private View f14097e;

        /* renamed from: f */
        private String f14098f;

        /* renamed from: g */
        private String f14099g;

        /* renamed from: h */
        private SignInOptions f14100h = SignInOptions.f23678n;

        /* renamed from: i */
        private boolean f14101i;

        /* renamed from: a */
        public final Builder mo25333a(Account account) {
            this.f14093a = account;
            return this;
        }

        @KeepForSdk
        /* renamed from: b */
        public final Builder mo25337b(String str) {
            this.f14098f = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo25335a(Collection<Scope> collection) {
            if (this.f14094b == null) {
                this.f14094b = new C4870b<>();
            }
            this.f14094b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final Builder mo25334a(String str) {
            this.f14099g = str;
            return this;
        }

        @KeepForSdk
        /* renamed from: a */
        public final ClientSettings mo25336a() {
            return new ClientSettings(this.f14093a, this.f14094b, this.f14095c, this.f14096d, this.f14097e, this.f14098f, this.f14099g, this.f14100h, this.f14101i);
        }
    }

    public static final class OptionalApiSettings {

        /* renamed from: a */
        public final Set<Scope> f14102a;
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.f14083a = account;
        this.f14084b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f14086d = map == null ? Collections.EMPTY_MAP : map;
        this.f14087e = view;
        this.f14088f = str;
        this.f14089g = str2;
        this.f14090h = signInOptions;
        this.f14091i = z;
        HashSet hashSet = new HashSet(this.f14084b);
        for (OptionalApiSettings optionalApiSettings : this.f14086d.values()) {
            hashSet.addAll(optionalApiSettings.f14102a);
        }
        this.f14085c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    /* renamed from: a */
    public static ClientSettings m15962a(Context context) {
        return new GoogleApiClient.Builder(context).mo24959b();
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public final String mo25323b() {
        Account account = this.f14083a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: c */
    public final Account mo25324c() {
        Account account = this.f14083a;
        if (account != null) {
            return account;
        }
        return new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
    }

    @KeepForSdk
    /* renamed from: d */
    public final Set<Scope> mo25325d() {
        return this.f14085c;
    }

    /* renamed from: e */
    public final Integer mo25326e() {
        return this.f14092j;
    }

    /* renamed from: f */
    public final Map<Api<?>, OptionalApiSettings> mo25327f() {
        return this.f14086d;
    }

    /* renamed from: g */
    public final String mo25328g() {
        return this.f14089g;
    }

    @KeepForSdk
    /* renamed from: h */
    public final String mo25329h() {
        return this.f14088f;
    }

    @KeepForSdk
    /* renamed from: i */
    public final Set<Scope> mo25330i() {
        return this.f14084b;
    }

    /* renamed from: j */
    public final SignInOptions mo25331j() {
        return this.f14090h;
    }

    /* renamed from: k */
    public final boolean mo25332k() {
        return this.f14091i;
    }

    @KeepForSdk
    /* renamed from: a */
    public final Account mo25320a() {
        return this.f14083a;
    }

    /* renamed from: a */
    public final void mo25322a(Integer num) {
        this.f14092j = num;
    }

    @KeepForSdk
    /* renamed from: a */
    public final Set<Scope> mo25321a(Api<?> api) {
        OptionalApiSettings optionalApiSettings = this.f14086d.get(api);
        if (optionalApiSettings == null || optionalApiSettings.f14102a.isEmpty()) {
            return this.f14084b;
        }
        HashSet hashSet = new HashSet(this.f14084b);
        hashSet.addAll(optionalApiSettings.f14102a);
        return hashSet;
    }
}
