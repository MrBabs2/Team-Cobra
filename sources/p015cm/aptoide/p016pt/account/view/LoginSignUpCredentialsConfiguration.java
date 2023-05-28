package p015cm.aptoide.p016pt.account.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/LoginSignUpCredentialsConfiguration;", "", "dismissToNavigateToMainView", "", "cleanBackStack", "hasMagicLinkError", "magicLinkErrorMessage", "", "(ZZZLjava/lang/String;)V", "getCleanBackStack", "()Z", "getDismissToNavigateToMainView", "getHasMagicLinkError", "getMagicLinkErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.LoginSignUpCredentialsConfiguration */
/* compiled from: LoginSignUpCredentialsConfiguration.kt */
public final class LoginSignUpCredentialsConfiguration {
    private final boolean cleanBackStack;
    private final boolean dismissToNavigateToMainView;
    private final boolean hasMagicLinkError;
    private final String magicLinkErrorMessage;

    public LoginSignUpCredentialsConfiguration(boolean z, boolean z2, boolean z3, String str) {
        C10202j.m34178b(str, "magicLinkErrorMessage");
        this.dismissToNavigateToMainView = z;
        this.cleanBackStack = z2;
        this.hasMagicLinkError = z3;
        this.magicLinkErrorMessage = str;
    }

    public static /* synthetic */ LoginSignUpCredentialsConfiguration copy$default(LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginSignUpCredentialsConfiguration.dismissToNavigateToMainView;
        }
        if ((i & 2) != 0) {
            z2 = loginSignUpCredentialsConfiguration.cleanBackStack;
        }
        if ((i & 4) != 0) {
            z3 = loginSignUpCredentialsConfiguration.hasMagicLinkError;
        }
        if ((i & 8) != 0) {
            str = loginSignUpCredentialsConfiguration.magicLinkErrorMessage;
        }
        return loginSignUpCredentialsConfiguration.copy(z, z2, z3, str);
    }

    public final boolean component1() {
        return this.dismissToNavigateToMainView;
    }

    public final boolean component2() {
        return this.cleanBackStack;
    }

    public final boolean component3() {
        return this.hasMagicLinkError;
    }

    public final String component4() {
        return this.magicLinkErrorMessage;
    }

    public final LoginSignUpCredentialsConfiguration copy(boolean z, boolean z2, boolean z3, String str) {
        C10202j.m34178b(str, "magicLinkErrorMessage");
        return new LoginSignUpCredentialsConfiguration(z, z2, z3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginSignUpCredentialsConfiguration)) {
            return false;
        }
        LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration = (LoginSignUpCredentialsConfiguration) obj;
        return this.dismissToNavigateToMainView == loginSignUpCredentialsConfiguration.dismissToNavigateToMainView && this.cleanBackStack == loginSignUpCredentialsConfiguration.cleanBackStack && this.hasMagicLinkError == loginSignUpCredentialsConfiguration.hasMagicLinkError && C10202j.m34176a((Object) this.magicLinkErrorMessage, (Object) loginSignUpCredentialsConfiguration.magicLinkErrorMessage);
    }

    public final boolean getCleanBackStack() {
        return this.cleanBackStack;
    }

    public final boolean getDismissToNavigateToMainView() {
        return this.dismissToNavigateToMainView;
    }

    public final boolean getHasMagicLinkError() {
        return this.hasMagicLinkError;
    }

    public final String getMagicLinkErrorMessage() {
        return this.magicLinkErrorMessage;
    }

    public int hashCode() {
        boolean z = this.dismissToNavigateToMainView;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.cleanBackStack;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hasMagicLinkError;
        if (!z4) {
            z2 = z4;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str = this.magicLinkErrorMessage;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LoginSignUpCredentialsConfiguration(dismissToNavigateToMainView=" + this.dismissToNavigateToMainView + ", cleanBackStack=" + this.cleanBackStack + ", hasMagicLinkError=" + this.hasMagicLinkError + ", magicLinkErrorMessage=" + this.magicLinkErrorMessage + ")";
    }
}
