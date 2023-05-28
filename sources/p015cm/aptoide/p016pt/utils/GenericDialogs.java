package p015cm.aptoide.p016pt.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.appcompat.app.C0074c;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p128t.C12889e;

/* renamed from: cm.aptoide.pt.utils.GenericDialogs */
public class GenericDialogs {

    /* renamed from: cm.aptoide.pt.utils.GenericDialogs$EResponse */
    public enum EResponse {
        YES,
        NO,
        CANCEL
    }

    /* renamed from: a */
    static /* synthetic */ void m7471a(Context context, String str, String str2, String str3, String str4, C12475j jVar) {
        C0074c.C0075a aVar = new C0074c.C0075a(context);
        aVar.mo230b((CharSequence) str);
        aVar.mo220a((CharSequence) str2);
        aVar.mo234c((CharSequence) str3, (DialogInterface.OnClickListener) new C4486w(jVar));
        aVar.mo221a((CharSequence) str4, (DialogInterface.OnClickListener) new C4453a0(jVar));
        C0074c a = aVar.mo225a();
        jVar.add(C12889e.m41501a(new C4488y(a)));
        a.show();
        a.mo206b(-2).setTextColor(-7829368);
    }

    /* renamed from: b */
    static /* synthetic */ void m7475b(Context context, int i, String str, String str2, C12475j jVar) {
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(context, i));
        aVar.mo230b((CharSequence) str);
        aVar.mo220a((CharSequence) str2);
        aVar.mo233c(17039370, (DialogInterface.OnClickListener) new C4485v(jVar));
        aVar.mo228b(17039360, (DialogInterface.OnClickListener) new C4473j0(jVar));
        C0074c a = aVar.mo225a();
        jVar.add(C12889e.m41501a(new C4487x(a)));
        a.show();
    }

    /* renamed from: c */
    static /* synthetic */ void m7479c(Context context, int i, String str, String str2, C12475j jVar) {
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(context, i));
        aVar.mo230b((CharSequence) str);
        aVar.mo220a((CharSequence) str2);
        aVar.mo233c(17039379, (DialogInterface.OnClickListener) new C4481r(jVar));
        aVar.mo228b(17039369, (DialogInterface.OnClickListener) new C4455b0(jVar));
        aVar.mo214a((DialogInterface.OnCancelListener) new C4465f0(jVar));
        C0074c a = aVar.mo225a();
        jVar.add(C12889e.m41501a(new C4483t(a)));
        a.show();
    }

    public static C5368e<EResponse> createGenericContinueCancelMessage(Context context, String str, String str2, int i) {
        return C5368e.m10241a(new C4471i0(context, i, str, str2));
    }

    public static C5368e<EResponse> createGenericContinueMessage(Context context, View view, String str, String str2, int i, int i2) {
        return C5368e.m10241a(new C4477n(context, i2, str, str2, i, view));
    }

    public static C5368e<EResponse> createGenericOkCancelMessage(Context context, String str, String str2, int i) {
        return C5368e.m10241a(new C4469h0(context, i, str, str2));
    }

    public static C5368e<EResponse> createGenericOkCancelMessageWithColorButton(Context context, String str, String str2, String str3, String str4) {
        return C5368e.m10241a(new C4474k(context, str, str2, str3, str4));
    }

    public static C5368e<EResponse> createGenericOkMessage(Context context, String str, String str2, int i) {
        return createGenericContinueMessage(context, (View) null, str, str2, 17039370, i);
    }

    public static ProgressDialog createGenericPleaseWaitDialog(Context context, int i) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(context, i));
        progressDialog.setMessage(context.getString(C4449R.string.please_wait));
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public static C5368e<EResponse> createGenericYesNoCancelMessage(Context context, String str, String str2, int i) {
        return C5368e.m10241a(new C4475l(context, i, str, str2)).mo18662b(C5376a.m10346b());
    }

    /* renamed from: g */
    static /* synthetic */ void m7489g(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: h */
    static /* synthetic */ void m7490h(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: i */
    static /* synthetic */ void m7491i(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.YES);
        jVar.onCompleted();
    }

    /* renamed from: j */
    static /* synthetic */ void m7492j(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.YES);
        jVar.onCompleted();
    }

    /* renamed from: k */
    static /* synthetic */ void m7493k(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.NO);
        jVar.onCompleted();
    }

    public static C5368e<EResponse> createGenericOkCancelMessage(Context context, String str, int i, int i2, int i3, int i4) {
        return C5368e.m10241a(new C4479p(context, i4, str, i, i2, i3));
    }

    /* renamed from: d */
    static /* synthetic */ void m7484d(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.YES);
        jVar.onCompleted();
    }

    /* renamed from: e */
    static /* synthetic */ void m7486e(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.NO);
        jVar.onCompleted();
    }

    /* renamed from: f */
    static /* synthetic */ void m7488f(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.YES);
        jVar.onCompleted();
    }

    public static ProgressDialog createGenericPleaseWaitDialog(Context context, int i, String str) {
        ProgressDialog progressDialog = new ProgressDialog(new ContextThemeWrapper(context, i));
        progressDialog.setMessage(str);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    /* renamed from: a */
    static /* synthetic */ void m7469a(Context context, int i, String str, String str2, int i2, View view, C12475j jVar) {
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(context, i));
        aVar.mo230b((CharSequence) str);
        aVar.mo220a((CharSequence) str2);
        aVar.mo233c(i2, (DialogInterface.OnClickListener) new C4467g0(jVar));
        if (view != null) {
            aVar.mo229b(view);
        }
        C0074c a = aVar.mo225a();
        jVar.add(C12889e.m41501a(new C4463e0(a)));
        a.show();
    }

    /* renamed from: b */
    static /* synthetic */ void m7478b(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.NO);
        jVar.onCompleted();
    }

    /* renamed from: c */
    static /* synthetic */ void m7481c(C12475j jVar, DialogInterface dialogInterface) {
        jVar.onNext(EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: b */
    static /* synthetic */ void m7477b(C12475j jVar, DialogInterface dialogInterface) {
        jVar.onNext(EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: c */
    static /* synthetic */ void m7482c(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.YES);
        jVar.onCompleted();
    }

    /* renamed from: a */
    static /* synthetic */ void m7470a(Context context, int i, String str, String str2, C12475j jVar) {
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(context, i));
        aVar.mo230b((CharSequence) str);
        aVar.mo220a((CharSequence) str2);
        aVar.mo233c(17039370, (DialogInterface.OnClickListener) new C4459d0(jVar));
        aVar.mo228b(17039360, (DialogInterface.OnClickListener) new C4489z(jVar));
        aVar.mo214a((DialogInterface.OnCancelListener) new C4478o(jVar));
        C0074c a = aVar.mo225a();
        jVar.add(C12889e.m41501a(new C4482s(a)));
        a.show();
    }

    /* renamed from: a */
    static /* synthetic */ void m7474a(C12475j jVar, DialogInterface dialogInterface, int i) {
        jVar.onNext(EResponse.YES);
        jVar.onCompleted();
    }

    /* renamed from: a */
    static /* synthetic */ void m7473a(C12475j jVar, DialogInterface dialogInterface) {
        jVar.onNext(EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: a */
    static /* synthetic */ void m7468a(Context context, int i, String str, int i2, int i3, int i4, C12475j jVar) {
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(context, i));
        aVar.mo230b((CharSequence) str);
        aVar.mo227b(i2);
        aVar.mo233c(i3, (DialogInterface.OnClickListener) new C4480q(jVar));
        aVar.mo228b(i4, (DialogInterface.OnClickListener) new C4476m(jVar));
        aVar.mo214a((DialogInterface.OnCancelListener) new C4457c0(jVar));
        C0074c a = aVar.mo225a();
        jVar.add(C12889e.m41501a(new C4484u(a)));
        a.show();
    }
}
