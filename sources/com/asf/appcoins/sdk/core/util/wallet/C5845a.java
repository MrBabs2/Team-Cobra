package com.asf.appcoins.sdk.core.util.wallet;

import android.app.AlertDialog;
import android.content.Context;
import com.asf.appcoins.sdk.core.C5844R;
import p120q.p326a.C11497x;
import p120q.p326a.C11499z;

/* renamed from: com.asf.appcoins.sdk.core.util.wallet.a */
/* compiled from: lambda */
public final /* synthetic */ class C5845a implements C11499z {

    /* renamed from: a */
    private final /* synthetic */ Context f10534a;

    /* renamed from: b */
    private final /* synthetic */ String f10535b;

    public /* synthetic */ C5845a(Context context, String str) {
        this.f10534a = context;
        this.f10535b = str;
    }

    /* renamed from: a */
    public final void mo4441a(C11497x xVar) {
        new AlertDialog.Builder(this.f10534a).setTitle(C5844R.string.wallet_missing).setMessage(this.f10535b).setPositiveButton(C5844R.string.install, new C5847c(xVar)).setNegativeButton(C5844R.string.skip, new C5848d(xVar)).setIcon(17301543).show();
    }
}
