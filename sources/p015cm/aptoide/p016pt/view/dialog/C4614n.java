package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import androidx.appcompat.widget.AppCompatRatingBar;
import com.google.android.material.textfield.TextInputLayout;
import p123rx.C12475j;

/* renamed from: cm.aptoide.pt.view.dialog.n */
/* compiled from: lambda */
public final /* synthetic */ class C4614n implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ DialogUtils f7861f;

    /* renamed from: g */
    private final /* synthetic */ Activity f7862g;

    /* renamed from: h */
    private final /* synthetic */ TextInputLayout f7863h;

    /* renamed from: i */
    private final /* synthetic */ AppCompatRatingBar f7864i;

    /* renamed from: j */
    private final /* synthetic */ View f7865j;

    /* renamed from: k */
    private final /* synthetic */ AlertDialog f7866k;

    /* renamed from: l */
    private final /* synthetic */ C12475j f7867l;

    /* renamed from: m */
    private final /* synthetic */ String f7868m;

    /* renamed from: n */
    private final /* synthetic */ String f7869n;

    public /* synthetic */ C4614n(DialogUtils dialogUtils, Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, View view, AlertDialog alertDialog, C12475j jVar, String str, String str2) {
        this.f7861f = dialogUtils;
        this.f7862g = activity;
        this.f7863h = textInputLayout;
        this.f7864i = appCompatRatingBar;
        this.f7865j = view;
        this.f7866k = alertDialog;
        this.f7867l = jVar;
        this.f7868m = str;
        this.f7869n = str2;
    }

    public final void onClick(View view) {
        this.f7861f.mo15545a(this.f7862g, this.f7863h, this.f7864i, this.f7865j, this.f7866k, this.f7867l, this.f7868m, this.f7869n, view);
    }
}
