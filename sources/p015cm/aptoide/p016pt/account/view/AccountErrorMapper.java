package p015cm.aptoide.p016pt.account.view;

import android.content.Context;
import android.content.res.Resources;
import p015cm.aptoide.accountmanager.AccountException;
import p015cm.aptoide.accountmanager.AccountValidationException;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.ErrorsMapper;
import p015cm.aptoide.p016pt.account.FacebookSignUpException;
import p015cm.aptoide.p016pt.account.GoogleSignUpException;
import p015cm.aptoide.p016pt.dataprovider.util.ErrorUtils;
import p015cm.aptoide.p016pt.view.ThrowableToStringMapper;

/* renamed from: cm.aptoide.pt.account.view.AccountErrorMapper */
public class AccountErrorMapper implements ThrowableToStringMapper {
    private final Context context;
    private final ErrorsMapper errorsMapper;

    public AccountErrorMapper(Context context2, ErrorsMapper errorsMapper2) {
        this.context = context2;
        this.errorsMapper = errorsMapper2;
    }

    public String map(Throwable th) {
        String str;
        String string = this.context.getString(C1086R.string.unknown_error);
        if (th instanceof GoogleSignUpException) {
            return this.context.getString(C1086R.string.google_login_cancelled);
        }
        if (th instanceof FacebookSignUpException) {
            int code = ((FacebookSignUpException) th).getCode();
            if (code == 1) {
                return this.context.getString(C1086R.string.facebook_email_permission_regected_message);
            }
            if (code == 2) {
                return this.context.getString(C1086R.string.facebook_login_cancelled);
            }
            if (code != 99) {
                return string;
            }
            return this.context.getString(C1086R.string.error_occured);
        } else if (th instanceof AccountException) {
            AccountException accountException = (AccountException) th;
            if (accountException.hasCode()) {
                return this.context.getString(this.errorsMapper.getWebServiceErrorMessageFromCode(accountException.getCode(), this.context.getApplicationContext().getPackageName(), this.context.getResources()));
            }
            Resources resources = this.context.getResources();
            return this.context.getString(resources.getIdentifier("ws_error_" + ((String) accountException.getErrors().entrySet().iterator().next().getKey()).replace("-", "_"), "string", this.context.getPackageName()));
        } else if (!(th instanceof AccountValidationException)) {
            return ErrorUtils.isNoNetworkConnection(th) ? this.context.getString(C1086R.string.connection_error) : string;
        } else {
            int code2 = ((AccountValidationException) th).getCode();
            if (code2 == 1) {
                str = this.context.getString(C1086R.string.no_email_error_message);
            } else if (code2 == 2) {
                str = this.context.getString(C1086R.string.no_pass_error_message);
            } else if (code2 == 3) {
                str = this.context.getString(C1086R.string.no_email_and_pass_error_message);
            } else if (code2 == 4) {
                str = this.context.getString(C1086R.string.password_validation_text);
            } else if (code2 != 5) {
                return string;
            } else {
                str = this.context.getString(C1086R.string.nothing_inserted_user);
            }
            return str;
        }
    }
}
