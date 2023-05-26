package p015cm.aptoide.accountmanager;

import java.util.Map;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.accountmanager.SignUpAdapterRegistry */
public class SignUpAdapterRegistry {
    private final AccountService accountService;
    private final Map<String, SignUpAdapter> adapters;

    public SignUpAdapterRegistry(Map<String, SignUpAdapter> map, AccountService accountService2) {
        this.adapters = map;
        this.accountService = accountService2;
    }

    /* renamed from: a */
    static /* synthetic */ C5328b m4186a(C5328b bVar) {
        return bVar;
    }

    public boolean isEnabled(String str) {
        return this.adapters.get(str).isEnabled();
    }

    public C5328b logoutAll() {
        return C5368e.m10234a(this.adapters.values()).mo18681d(C1009x.f3399f).mo18694j(C1010y.f3400f).mo18689g(C1008w.f3398f).mo18696k();
    }

    public void register(String str, SignUpAdapter signUpAdapter) {
        this.adapters.put(str, signUpAdapter);
    }

    public <T> Single<Account> signUp(String str, T t) {
        return this.adapters.get(str).signUp(t, this.accountService);
    }
}
