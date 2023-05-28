package p015cm.aptoide.p016pt.account.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.permission.PermissionServiceFragment;

/* renamed from: cm.aptoide.pt.account.view.GooglePlayServicesFragment */
public abstract class GooglePlayServicesFragment extends PermissionServiceFragment implements GooglePlayServicesView {
    private static final int RESOLVE_CONNECTION_ERROR_REQUEST_CODE = 1;
    private GoogleApiAvailability apiAvailability;
    private Dialog errorDialog;

    private void showConnectionErrorMessage(int i) {
        Dialog dialog = this.errorDialog;
        if (dialog == null || !dialog.isShowing()) {
            Dialog a = this.apiAvailability.mo24859a((Activity) getActivity(), i, 1);
            this.errorDialog = a;
            a.show();
        }
    }

    private void showResolution(ConnectionResult connectionResult) {
        try {
            connectionResult.mo24839a(getActivity(), 1);
        } catch (IntentSender.SendIntentException e) {
            CrashReport.getInstance().log(e);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.errorDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.errorDialog = null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.apiAvailability = GoogleApiAvailability.m15256a();
    }

    public void showConnectionError(ConnectionResult connectionResult) {
        if (connectionResult.mo24845q()) {
            showResolution(connectionResult);
        } else {
            showConnectionErrorMessage(connectionResult.mo24840d());
        }
    }
}
