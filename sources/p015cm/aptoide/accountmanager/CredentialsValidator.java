package p015cm.aptoide.accountmanager;

import android.util.Patterns;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.p126m.C12495m;

/* renamed from: cm.aptoide.accountmanager.CredentialsValidator */
public class CredentialsValidator {
    private boolean checkIsEmailValid(String str) {
        return !isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    private boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5096a(AptoideCredentials aptoideCredentials) {
        int validateFields = validateFields(aptoideCredentials);
        if (validateFields != -1) {
            return C5328b.m10163b((Throwable) new AccountValidationException(validateFields));
        }
        return C5328b.m10170f();
    }

    public Single<Boolean> isEmailValid(String str) {
        return Single.m10119a(Boolean.valueOf(checkIsEmailValid(str)));
    }

    public C5328b validate(AptoideCredentials aptoideCredentials) {
        return C5328b.m10166b((C12495m<? extends C5328b>) new C1007v(this, aptoideCredentials));
    }

    /* access modifiers changed from: protected */
    public int validateFields(AptoideCredentials aptoideCredentials) {
        if (isEmpty(aptoideCredentials.getEmail()) && isEmpty(aptoideCredentials.getCode())) {
            return 3;
        }
        if (isEmpty(aptoideCredentials.getCode())) {
            return 2;
        }
        return isEmpty(aptoideCredentials.getEmail()) ? 1 : -1;
    }
}
