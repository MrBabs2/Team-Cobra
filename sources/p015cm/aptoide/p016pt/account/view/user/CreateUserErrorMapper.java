package p015cm.aptoide.p016pt.account.view.user;

import android.content.Context;
import android.content.res.Resources;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import p015cm.aptoide.accountmanager.AccountValidationException;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.AccountErrorMapper;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.ThrowableToStringMapper;

/* renamed from: cm.aptoide.pt.account.view.user.CreateUserErrorMapper */
public class CreateUserErrorMapper implements ThrowableToStringMapper {
    private final AccountErrorMapper accountErrorMapper;
    private final Context context;
    private Resources resources;

    public CreateUserErrorMapper(Context context2, AccountErrorMapper accountErrorMapper2, Resources resources2) {
        this.context = context2;
        this.accountErrorMapper = accountErrorMapper2;
        this.resources = resources2;
    }

    public String map(Throwable th) {
        String map = this.accountErrorMapper.map(th);
        if ((th instanceof SocketTimeoutException) || (th instanceof TimeoutException)) {
            return this.context.getString(C1086R.string.user_upload_photo_failed);
        }
        if (!(th instanceof AccountValidationException)) {
            return map;
        }
        int code = ((AccountValidationException) th).getCode();
        if (code == 5) {
            return AptoideUtils.StringU.getResString(C1086R.string.no_username_inserted, this.resources);
        }
        if (code != 6) {
            return map;
        }
        return AptoideUtils.StringU.getResString(C1086R.string.nothing_inserted_user, this.resources);
    }
}
