package com.asf.appcoins.sdk.core.util.wallet;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.asf.appcoins.sdk.core.util.AndroidUtils;
import p120q.p326a.C11496w;

public class WalletUtils {
    /* renamed from: a */
    static /* synthetic */ void m11409a(Activity activity, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            gotoStore(activity);
        }
    }

    private static void gotoStore(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + "com.asfoundation.wallet")));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + "com.asfoundation.wallet")));
        }
    }

    public static boolean hasWalletInstalled(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("ethereum:"));
        return AndroidUtils.hasHandlerAvailable(intent, context);
    }

    public static C11496w<Boolean> promptToInstallWallet(Activity activity, String str) {
        return showWalletInstallDialog(activity, str).mo37606a(new C5846b(activity));
    }

    private static C11496w<Boolean> showWalletInstallDialog(Context context, String str) {
        return C11496w.m37608a(new C5845a(context, str));
    }
}
