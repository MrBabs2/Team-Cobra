package p015cm.aptoide.p016pt.account.view;

import android.content.Intent;
import android.os.Bundle;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.account.view.LoginActivity */
public class LoginActivity extends LoginBottomSheetActivity {
    public static final String ACCOUNT_TYPE = "account_type";
    public static final String AUTH_TYPE = "auth_type";
    public static final String IS_ADDING_NEW_ACCOUNT = "is_adding_new_account";
    private String accountType;
    private String authType;
    private boolean isNewAccount;

    private int getLayoutId() {
        return C1086R.layout.empty_frame;
    }

    private void loadExtras(Intent intent) {
        this.accountType = intent.getStringExtra(ACCOUNT_TYPE);
        this.authType = intent.getStringExtra(AUTH_TYPE);
        this.isNewAccount = intent.getBooleanExtra(IS_ADDING_NEW_ACCOUNT, false);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutId());
        loadExtras(getIntent());
        if (bundle == null) {
            getFragmentNavigator().navigateToWithoutBackSave(LoginSignUpFragment.newInstance(false, true, false, this.accountType, this.authType, this.isNewAccount, false, false, ""), true);
        }
    }
}
