package p015cm.aptoide.accountmanager;

import android.text.TextUtils;
import java.util.List;
import p015cm.aptoide.accountmanager.Account;

/* renamed from: cm.aptoide.accountmanager.AccountFactory */
public class AccountFactory {
    private Account.Access getAccessFrom(String str) {
        if (TextUtils.isEmpty(str)) {
            return Account.Access.UNLISTED;
        }
        return Account.Access.valueOf(str.toUpperCase());
    }

    public Account createAccount(String str, List<Store> list, String str2, String str3, String str4, String str5, Store store, boolean z, boolean z2, boolean z3, boolean z4) {
        return new AptoideAccount(str2, str3, str4, str5, store, z, getAccessFrom(str), z2, list, z3, z4);
    }
}
