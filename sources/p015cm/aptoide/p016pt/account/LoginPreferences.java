package p015cm.aptoide.p016pt.account;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: cm.aptoide.pt.account.LoginPreferences */
public class LoginPreferences {
    private final Context context;
    private final GoogleApiAvailability googleApiAvailability;

    public LoginPreferences(Context context2, GoogleApiAvailability googleApiAvailability2) {
        this.context = context2;
        this.googleApiAvailability = googleApiAvailability2;
    }

    public boolean isFacebookLoginEnabled() {
        return true;
    }

    public boolean isGoogleLoginEnabled() {
        return this.googleApiAvailability.mo24869c(this.context) == 0;
    }
}
