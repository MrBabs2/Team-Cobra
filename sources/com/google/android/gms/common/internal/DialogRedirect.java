package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static DialogRedirect m15990a(Activity activity, Intent intent, int i) {
        return new C7229a(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25338a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo25338a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static DialogRedirect m15991a(Fragment fragment, Intent intent, int i) {
        return new C7230b(intent, fragment, i);
    }

    /* renamed from: a */
    public static DialogRedirect m15992a(LifecycleFragment lifecycleFragment, Intent intent, int i) {
        return new C7231c(intent, lifecycleFragment, i);
    }
}
