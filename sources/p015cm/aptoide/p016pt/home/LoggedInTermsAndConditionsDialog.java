package p015cm.aptoide.p016pt.home;

import android.app.AlertDialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import p015cm.aptoide.analytics.implementation.CrashLogger;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.LoggedInTermsAndConditionsDialog */
public class LoggedInTermsAndConditionsDialog {
    private static final String GDPR_DIALOG_EVENT_LISTENER_IS_NULL = "GDPR_DIALOG_EVENT_LISTENER_IS_NULL";
    private Button continueButton;
    /* access modifiers changed from: private */
    public CrashLogger crashReport = CrashReport.getInstance();
    private AlertDialog dialog;
    private Button logoutButton;
    private C12871b<String> uiEvents = C12871b.m41468p();

    public LoggedInTermsAndConditionsDialog(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.dialog = new AlertDialog.Builder(context).create();
        View inflate = from.inflate(C1086R.layout.dialog_logged_in_accept_tos, (ViewGroup) null);
        this.dialog.setView(inflate);
        this.continueButton = (Button) inflate.findViewById(C1086R.C1088id.accept_continue);
        this.logoutButton = (Button) inflate.findViewById(C1086R.C1088id.log_out);
        setPrivacyPolicyLinks(inflate, context, this.uiEvents);
        this.dialog.setCancelable(false);
        this.dialog.setCanceledOnTouchOutside(false);
        this.continueButton.setOnClickListener(new C2871bb(this));
        this.logoutButton.setOnClickListener(new C2722ab(this));
    }

    private void setPrivacyPolicyLinks(View view, Context context, final C12871b<String> bVar) {
        C27081 r0 = new ClickableSpan() {
            public void onClick(View view) {
                C12871b bVar = bVar;
                if (bVar != null) {
                    bVar.onNext("terms");
                } else {
                    LoggedInTermsAndConditionsDialog.this.crashReport.log(LoggedInTermsAndConditionsDialog.GDPR_DIALOG_EVENT_LISTENER_IS_NULL, "");
                }
            }
        };
        C27092 r1 = new ClickableSpan() {
            public void onClick(View view) {
                C12871b bVar = bVar;
                if (bVar != null) {
                    bVar.onNext("privacy");
                } else {
                    LoggedInTermsAndConditionsDialog.this.crashReport.log(LoggedInTermsAndConditionsDialog.GDPR_DIALOG_EVENT_LISTENER_IS_NULL, "");
                }
            }
        };
        String string = context.getString(C1086R.string.accept_terms_message_loggedin);
        String string2 = context.getString(C1086R.string.terms_and_conditions_privacy_sign_up_message);
        String string3 = context.getString(C1086R.string.settings_terms_conditions);
        String string4 = context.getString(C1086R.string.settings_privacy_policy);
        String format = String.format(string, new Object[]{string3, string4});
        ((Button) view.findViewById(C1086R.C1088id.accept_continue)).setText(String.format(string2, new Object[]{string3, string4}));
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(r0, format.indexOf(string3), format.indexOf(string3) + string3.length(), 33);
        spannableString.setSpan(r1, format.indexOf(string4), format.indexOf(string4) + string4.length(), 33);
        TextView textView = (TextView) view.findViewById(C1086R.C1088id.tos_info);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11834a(View view) {
        C12871b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("continue");
            this.dialog.dismiss();
            return;
        }
        this.crashReport.log(GDPR_DIALOG_EVENT_LISTENER_IS_NULL, "");
    }

    /* renamed from: b */
    public /* synthetic */ void mo11835b(View view) {
        C12871b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("logout");
        } else {
            this.crashReport.log(GDPR_DIALOG_EVENT_LISTENER_IS_NULL, "");
        }
        this.dialog.dismiss();
    }

    public void destroyDialog() {
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.dialog = null;
        Button button = this.continueButton;
        if (button != null) {
            button.setOnClickListener((View.OnClickListener) null);
        }
        Button button2 = this.logoutButton;
        if (button2 != null) {
            button2.setOnClickListener((View.OnClickListener) null);
        }
        this.continueButton = null;
        this.logoutButton = null;
        this.uiEvents = null;
    }

    public C5368e<String> dialogClicked() {
        return this.uiEvents;
    }

    public void showDialog() {
        this.dialog.show();
    }
}
