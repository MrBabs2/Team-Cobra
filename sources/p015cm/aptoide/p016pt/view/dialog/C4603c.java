package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import androidx.appcompat.widget.AppCompatRatingBar;
import com.google.android.material.textfield.TextInputLayout;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.view.dialog.c */
/* compiled from: lambda */
public final /* synthetic */ class C4603c implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ DialogUtils f7833f;

    /* renamed from: g */
    private final /* synthetic */ Activity f7834g;

    /* renamed from: h */
    private final /* synthetic */ TextInputLayout f7835h;

    /* renamed from: i */
    private final /* synthetic */ AppCompatRatingBar f7836i;

    /* renamed from: j */
    private final /* synthetic */ AlertDialog f7837j;

    /* renamed from: k */
    private final /* synthetic */ C5377a f7838k;

    /* renamed from: l */
    private final /* synthetic */ String f7839l;

    /* renamed from: m */
    private final /* synthetic */ String f7840m;

    public /* synthetic */ C4603c(DialogUtils dialogUtils, Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, AlertDialog alertDialog, C5377a aVar, String str, String str2) {
        this.f7833f = dialogUtils;
        this.f7834g = activity;
        this.f7835h = textInputLayout;
        this.f7836i = appCompatRatingBar;
        this.f7837j = alertDialog;
        this.f7838k = aVar;
        this.f7839l = str;
        this.f7840m = str2;
    }

    public final void onClick(View view) {
        this.f7833f.mo15544a(this.f7834g, this.f7835h, this.f7836i, this.f7837j, this.f7838k, this.f7839l, this.f7840m, view);
    }
}
