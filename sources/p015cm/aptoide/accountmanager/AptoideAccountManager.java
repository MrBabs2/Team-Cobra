package p015cm.aptoide.accountmanager;

import android.text.TextUtils;
import com.aptoide.authentication.model.CodeAuth;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.accountmanager.Account;
import p050l.p075h.p083k.C5004d;
import p112n.p118g.p119b.C5305c;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.accountmanager.AptoideAccountManager */
public class AptoideAccountManager {
    public static final String APTOIDE_SIGN_UP_TYPE = "APTOIDE";
    private final AccountPersistence accountPersistence;
    private final C5305c<Account> accountRelay;
    private final AccountService accountService;
    private final SignUpAdapterRegistry adapterRegistry;
    private final AdultContent adultContent;
    private final CredentialsValidator credentialsValidator;
    private final StoreManager storeManager;

    /* renamed from: cm.aptoide.accountmanager.AptoideAccountManager$Builder */
    public static class Builder {
        private AccountPersistence accountPersistence;
        private C5305c<Account> accountRelay;
        private AccountService accountService;
        private final Map<String, SignUpAdapter> adapters = new HashMap();
        private AdultContent adultContent;
        private CredentialsValidator credentialsValidator;
        private StoreManager storeManager;

        public AptoideAccountManager build() {
            if (this.accountPersistence == null) {
                throw new IllegalArgumentException("AccountDataPersist is mandatory.");
            } else if (this.accountService == null) {
                throw new IllegalArgumentException("AccountManagerService is mandatory.");
            } else if (this.storeManager != null) {
                if (this.credentialsValidator == null) {
                    this.credentialsValidator = new CredentialsValidator();
                }
                if (this.accountRelay == null) {
                    this.accountRelay = C5305c.m10045o();
                }
                SignUpAdapterRegistry signUpAdapterRegistry = new SignUpAdapterRegistry(this.adapters, this.accountService);
                signUpAdapterRegistry.register(AptoideAccountManager.APTOIDE_SIGN_UP_TYPE, new AptoideSignUpAdapter(this.credentialsValidator));
                return new AptoideAccountManager(this.credentialsValidator, this.accountPersistence, this.accountService, this.accountRelay, signUpAdapterRegistry, this.storeManager, this.adultContent);
            } else {
                throw new IllegalArgumentException("StoreManager is mandatory.");
            }
        }

        public Builder registerSignUpAdapter(String str, SignUpAdapter signUpAdapter) {
            this.adapters.put(str, signUpAdapter);
            return this;
        }

        public Builder setAccountPersistence(AccountPersistence accountPersistence2) {
            this.accountPersistence = accountPersistence2;
            return this;
        }

        public Builder setAccountRelay(C5305c<Account> cVar) {
            this.accountRelay = cVar;
            return this;
        }

        public Builder setAccountService(AccountService accountService2) {
            this.accountService = accountService2;
            return this;
        }

        public Builder setAdultService(AdultContent adultContent2) {
            this.adultContent = adultContent2;
            return this;
        }

        public Builder setCredentialsValidator(CredentialsValidator credentialsValidator2) {
            this.credentialsValidator = credentialsValidator2;
            return this;
        }

        public Builder setStoreManager(StoreManager storeManager2) {
            this.storeManager = storeManager2;
            return this;
        }
    }

    /* renamed from: b */
    static /* synthetic */ Account m4163b(Throwable th) {
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ void m4164b() {
    }

    private Account createLocalAccount() {
        return new LocalAccount(Store.emptyStore());
    }

    /* access modifiers changed from: private */
    /* renamed from: saveAccount */
    public C5328b mo5053g(Account account) {
        return this.accountPersistence.saveAccount(account).mo18589a((C5377a) new C0999n(this, account));
    }

    private Single<Account> singleAccountStatus() {
        return accountStatus().mo18669c().mo18700m();
    }

    private C5328b syncAccount() {
        return this.accountPersistence.getAccount().mo18559a(new C0992g(this)).mo18566b(new C0990e(this));
    }

    /* renamed from: a */
    public /* synthetic */ Account mo5035a(Throwable th) {
        return createLocalAccount();
    }

    public C5368e<Account> accountStatus() {
        return C5368e.m10254b(this.accountRelay, (C5305c<Account>) this.accountPersistence.getAccount().mo18571f(new C0988c(this)).mo18567c());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo5044b(Account account) {
        return this.adultContent.enable(account.isLoggedIn());
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo5045c(Account account) {
        return this.accountService.removeAccount();
    }

    public C5328b createOrUpdate(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        return this.storeManager.createOrUpdate(str, str2, str3, z, str4, z2).mo18587a(syncAccount());
    }

    /* renamed from: d */
    public /* synthetic */ void mo5047d(Account account) {
        this.accountRelay.call(account);
    }

    public C5328b disable() {
        return accountStatus().mo18669c().mo18689g(new C0995j(this)).mo18696k();
    }

    public C5328b enable() {
        return accountStatus().mo18669c().mo18689g(new C1003r(this)).mo18696k();
    }

    /* renamed from: f */
    public /* synthetic */ Single mo5052f(Account account) {
        return this.accountService.getAccount(account.getEmail());
    }

    public C5328b generateEmailCode(String str) {
        if (str.isEmpty()) {
            return C5328b.m10163b((Throwable) new AccountValidationException(1));
        }
        return C5328b.m10170f();
    }

    @Deprecated
    public Account getAccount() {
        return singleAccountStatus().mo18571f(C0991f.f3375f).mo18562a().mo41082a();
    }

    /* renamed from: h */
    public /* synthetic */ C5328b mo5056h(Account account) {
        return syncAccount();
    }

    public C5368e<Boolean> hasMatureContentEnabled() {
        return this.adultContent.enabled();
    }

    /* renamed from: i */
    public /* synthetic */ C5328b mo5058i(Account account) {
        return this.accountPersistence.saveAccount(new AptoideAccount(account.getId(), account.getEmail(), account.getNickname(), account.getAvatar(), account.getStore(), account.isAdultContentEnabled(), account.getAccess(), account.isAccessConfirmed(), account.getSubscribedStores(), true, true));
    }

    @Deprecated
    public boolean isAccountAccessConfirmed() {
        Account account = getAccount();
        return account != null && account.isAccessConfirmed();
    }

    @Deprecated
    public boolean isAccountMature() {
        Account account = getAccount();
        return account != null && account.isAdultContentEnabled();
    }

    public Single<Boolean> isEmailValid(String str) {
        return this.credentialsValidator.isEmailValid(str);
    }

    @Deprecated
    public boolean isLoggedIn() {
        Account account = getAccount();
        return account != null && account.isLoggedIn();
    }

    public boolean isSignUpEnabled(String str) {
        return this.adapterRegistry.isEnabled(str);
    }

    public Single<Boolean> login(AptoideCredentials aptoideCredentials) {
        return this.credentialsValidator.validate(aptoideCredentials).mo18583a(this.accountService.getAccount(aptoideCredentials.getEmail(), aptoideCredentials.getCode(), aptoideCredentials.getState(), aptoideCredentials.getAgent())).mo18559a(new C1000o(this));
    }

    public C5328b logout() {
        return this.adapterRegistry.logoutAll().mo18587a(singleAccountStatus().mo18566b(new C0997l(this)).mo18587a(this.accountPersistence.removeAccount()).mo18589a((C5377a) new C0987b(this)));
    }

    public C5368e<Boolean> pinRequired() {
        return this.adultContent.pinRequired();
    }

    public C5328b removePin(int i) {
        return this.adultContent.removePin(i);
    }

    public C5328b requirePin(int i) {
        return this.adultContent.requirePin(i);
    }

    public Single<CodeAuth> sendMagicLink(String str) {
        return this.accountService.sendMagicLink(str);
    }

    public <T> C5328b signUp(String str, T t) {
        return this.adapterRegistry.signUp(str, t).mo18566b(new C0993h(this));
    }

    public C5328b subscribeStore(String str, String str2, String str3) {
        return this.accountService.subscribeStore(str, str2, str3);
    }

    public void unsubscribeStore(String str, String str2, String str3) {
        this.accountService.unsubscribeStore(str, str2, str3).mo18594a((C5377a) C1002q.f3390f, (C5378b<? super Throwable>) C0996k.f3381f);
    }

    public C5328b updateAccount(boolean z) {
        return singleAccountStatus().mo18566b(new C0989d(this, z));
    }

    public C5328b updateTermsAndConditions() {
        return this.accountService.updateTermsAndConditions().mo18593a(accountStatus()).mo18689g(new C1004s(this)).mo18696k();
    }

    private AptoideAccountManager(CredentialsValidator credentialsValidator2, AccountPersistence accountPersistence2, AccountService accountService2, C5305c<Account> cVar, SignUpAdapterRegistry signUpAdapterRegistry, StoreManager storeManager2, AdultContent adultContent2) {
        this.credentialsValidator = credentialsValidator2;
        this.accountPersistence = accountPersistence2;
        this.accountService = accountService2;
        this.accountRelay = cVar;
        this.adapterRegistry = signUpAdapterRegistry;
        this.storeManager = storeManager2;
        this.adultContent = adultContent2;
    }

    /* renamed from: a */
    public /* synthetic */ void mo5042a() {
        this.accountRelay.call(createLocalAccount());
    }

    public C5328b updateAccount(String str) {
        if (TextUtils.isEmpty(str)) {
            return C5328b.m10163b((Throwable) new AccountValidationException(5));
        }
        return singleAccountStatus().mo18566b(new C0994i(this, str));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo5036a(C5004d dVar) {
        return mo5053g((Account) dVar.f8862a).mo18583a(Single.m10119a((Boolean) dVar.f8863b));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5041a(boolean z, Account account) {
        return this.accountService.updateAccount(z);
    }

    public C5328b enable(int i) {
        return this.adultContent.enable(i);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5039a(String str, Account account) {
        return this.accountService.updateAccountUsername(str).mo18587a(syncAccount());
    }

    public C5328b updateAccount(Account.Access access) {
        return singleAccountStatus().mo18566b(new C0986a(this, access));
    }

    public C5328b updateAccount(String str, String str2) {
        return singleAccountStatus().mo18566b(new C0998m(this, str, str2));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5037a(Account.Access access, Account account) {
        return this.accountService.updateAccount(access.name()).mo18587a(syncAccount());
    }

    @Deprecated
    public C5328b updateAccount() {
        return singleAccountStatus().mo18566b(new C1001p(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5040a(String str, String str2, Account account) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return C5328b.m10163b((Throwable) new AccountValidationException(6));
        }
        if (TextUtils.isEmpty(str)) {
            return C5328b.m10163b((Throwable) new AccountValidationException(5));
        }
        AccountService accountService2 = this.accountService;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return accountService2.updateAccount(str, str2).mo18587a(syncAccount());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5038a(Account account) {
        return this.adultContent.disable(account.isLoggedIn());
    }
}
