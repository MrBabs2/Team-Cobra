package p015cm.aptoide.p016pt.view.p031rx;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.C0074c;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p112n.p118g.p119b.C5305c;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.view.rx.RxAlertDialog */
public class RxAlertDialog implements DialogInterface {
    private final CancelEvent cancelEvent;
    private final C0074c dialog;
    private final DismissEvent dismissEvent;
    private final DialogClick negativeClick;
    private final DialogClick positiveClick;
    private final View view;

    /* renamed from: cm.aptoide.pt.view.rx.RxAlertDialog$Builder */
    public static class Builder {
        private final C0074c.C0075a builder;
        private DialogClick negativeClick;
        private DialogClick positiveClick;
        private View view;

        public Builder(Context context, ThemeManager themeManager) {
            this.builder = new C0074c.C0075a(new ContextThemeWrapper(context, themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId));
        }

        public RxAlertDialog build() {
            C0074c a = this.builder.mo225a();
            CancelEvent cancelEvent = new CancelEvent(C5305c.m10045o());
            DismissEvent dismissEvent = new DismissEvent(C5305c.m10045o());
            a.setOnCancelListener(cancelEvent);
            a.setOnDismissListener(dismissEvent);
            return new RxAlertDialog(a, this.view, this.positiveClick, this.negativeClick, cancelEvent, dismissEvent);
        }

        public Builder setMessage(int i) {
            this.builder.mo227b(i);
            return this;
        }

        public Builder setNegativeButton(int i) {
            DialogClick dialogClick = new DialogClick(-2, C5305c.m10045o());
            this.negativeClick = dialogClick;
            this.builder.mo228b(i, (DialogInterface.OnClickListener) dialogClick);
            return this;
        }

        public Builder setPositiveButton(int i) {
            DialogClick dialogClick = new DialogClick(-1, C5305c.m10045o());
            this.positiveClick = dialogClick;
            this.builder.mo233c(i, (DialogInterface.OnClickListener) dialogClick);
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i) {
            this.builder.mo223a(charSequenceArr, i, (DialogInterface.OnClickListener) null);
            return this;
        }

        public Builder setTitle(int i) {
            this.builder.mo232c(i);
            return this;
        }

        public Builder setTitleSmall(int i) {
            TextView textView = new TextView(this.builder.mo226b());
            textView.setTextSize(12.0f);
            textView.setTextColor(textView.getResources().getColor(C1086R.color.secondary_text_color));
            textView.setText(i);
            textView.setPaddingRelative((int) ((textView.getResources().getDisplayMetrics().density * 25.0f) + 0.5f), (int) ((textView.getResources().getDisplayMetrics().density * 20.0f) + 0.5f), 0, (int) ((textView.getResources().getDisplayMetrics().density * 10.0f) + 0.5f));
            this.builder.mo217a((View) textView);
            return this;
        }

        public Builder setView(View view2) {
            this.view = view2;
            this.builder.mo229b(view2);
            return this;
        }
    }

    /* renamed from: cm.aptoide.pt.view.rx.RxAlertDialog$CancelEvent */
    protected static class CancelEvent implements DialogInterface.OnCancelListener {
        private final C5305c<Void> subject;

        public CancelEvent(C5305c<Void> cVar) {
            this.subject = cVar;
        }

        public C5368e<Void> cancels() {
            return this.subject;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.subject.call(null);
        }
    }

    /* renamed from: cm.aptoide.pt.view.rx.RxAlertDialog$DialogClick */
    protected static class DialogClick implements DialogInterface.OnClickListener {
        private final C5305c<Void> subject;
        private final int which;

        public DialogClick(int i, C5305c<Void> cVar) {
            this.which = i;
            this.subject = cVar;
        }

        public C5368e<Void> clicks() {
            return this.subject;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.which == i) {
                this.subject.call(null);
            }
        }
    }

    /* renamed from: cm.aptoide.pt.view.rx.RxAlertDialog$DismissEvent */
    protected static class DismissEvent implements DialogInterface.OnDismissListener {
        private final C5305c<Void> subject;

        public DismissEvent(C5305c<Void> cVar) {
            this.subject = cVar;
        }

        public C5368e<Void> dismisses() {
            return this.subject;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.subject.call(null);
        }
    }

    /* renamed from: cm.aptoide.pt.view.rx.RxAlertDialog$Result */
    public enum Result {
        CANCEL,
        DISMISS,
        POSITIVE,
        NEGATIVE
    }

    protected RxAlertDialog(C0074c cVar, View view2, DialogClick dialogClick, DialogClick dialogClick2, CancelEvent cancelEvent2, DismissEvent dismissEvent2) {
        this.dialog = cVar;
        this.view = view2;
        this.positiveClick = dialogClick;
        this.negativeClick = dialogClick2;
        this.cancelEvent = cancelEvent2;
        this.dismissEvent = dismissEvent2;
    }

    /* renamed from: a */
    public /* synthetic */ DialogInterface mo15735a(Void voidR) {
        return this;
    }

    /* renamed from: b */
    public /* synthetic */ DialogInterface mo15736b(Void voidR) {
        return this;
    }

    /* renamed from: c */
    public /* synthetic */ DialogInterface mo15737c(Void voidR) {
        return this;
    }

    public void cancel() {
        this.dialog.cancel();
    }

    public C5368e<DialogInterface> cancels() {
        return this.cancelEvent.cancels().mo18694j(new C4688b(this));
    }

    /* renamed from: d */
    public /* synthetic */ DialogInterface mo15740d(Void voidR) {
        return this;
    }

    public void dismiss() {
        this.dialog.dismiss();
    }

    public C5368e<DialogInterface> dismisses() {
        return this.dismissEvent.dismisses().mo18694j(new C4692f(this));
    }

    public int getCheckedItem() {
        return this.dialog.mo207b().getCheckedItemPosition();
    }

    public View getDialogView() {
        return this.view;
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }

    public C5368e<DialogInterface> negativeClicks() {
        DialogClick dialogClick = this.negativeClick;
        if (dialogClick != null) {
            return dialogClick.clicks().mo18694j(new C4693g(this));
        }
        return C5368e.m10265n();
    }

    public C5368e<DialogInterface> positiveClicks() {
        DialogClick dialogClick = this.positiveClick;
        if (dialogClick != null) {
            return dialogClick.clicks().mo18694j(new C4691e(this));
        }
        return C5368e.m10265n();
    }

    public void show() {
        this.dialog.show();
    }

    public Single<Result> showWithResult() {
        C0074c cVar = this.dialog;
        cVar.getClass();
        return C5328b.m10169d(new C4695i(cVar)).mo18593a(C5368e.m10244a(this.cancelEvent.cancels().mo18694j(C4687a.f7960f), this.dismissEvent.dismisses().mo18694j(C4690d.f7963f), this.positiveClick.clicks().mo18694j(C4694h.f7967f), this.negativeClick.clicks().mo18694j(C4689c.f7962f))).mo18669c().mo18700m();
    }
}
