package p015cm.aptoide.accountmanager;

import p123rx.C5328b;
import p123rx.Single;

/* renamed from: cm.aptoide.accountmanager.SignUpAdapter */
public interface SignUpAdapter<T> {
    boolean isEnabled();

    C5328b logout();

    Single<Account> signUp(T t, AccountService accountService);
}
