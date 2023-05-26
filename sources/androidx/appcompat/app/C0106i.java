package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.C0454b;

/* renamed from: androidx.appcompat.app.i */
/* compiled from: AppCompatDialogFragment */
public class C0106i extends C0454b {
    public Dialog onCreateDialog(Bundle bundle) {
        throw null;
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C0104h) {
            C0104h hVar = (C0104h) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            hVar.mo380a(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
