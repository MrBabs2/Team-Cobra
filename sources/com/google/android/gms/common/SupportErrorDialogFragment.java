package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C0454b;
import androidx.fragment.app.C0462h;
import com.google.android.gms.common.internal.Preconditions;

public class SupportErrorDialogFragment extends C0454b {

    /* renamed from: f */
    private Dialog f13631f = null;

    /* renamed from: g */
    private DialogInterface.OnCancelListener f13632g = null;

    /* renamed from: a */
    public static SupportErrorDialogFragment m15294a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Preconditions.m16038a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f13631f = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f13632g = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13632g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f13631f == null) {
            setShowsDialog(false);
        }
        return this.f13631f;
    }

    public void show(C0462h hVar, String str) {
        super.show(hVar, str);
    }
}
