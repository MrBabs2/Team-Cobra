package p015cm.aptoide.p016pt.account;

import com.facebook.FacebookException;
import com.facebook.login.C6533h;

/* renamed from: cm.aptoide.pt.account.FacebookLoginResult */
public class FacebookLoginResult {
    public static final int STATE_CANCELLED = 1;
    public static final int STATE_ERROR = 99;
    public static final int STATE_SUCCESS = 0;
    private final FacebookException error;
    private final C6533h result;
    private final int state;

    public FacebookLoginResult(C6533h hVar, int i, FacebookException facebookException) {
        this.result = hVar;
        this.state = i;
        this.error = facebookException;
    }

    public FacebookException getError() {
        return this.error;
    }

    public C6533h getResult() {
        return this.result;
    }

    public int getState() {
        return this.state;
    }
}
