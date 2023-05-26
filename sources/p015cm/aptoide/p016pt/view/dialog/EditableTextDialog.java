package p015cm.aptoide.p016pt.view.dialog;

import android.content.DialogInterface;
import android.widget.EditText;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.dialog.EditableTextDialog */
public class EditableTextDialog implements DialogInterface {
    private final RxAlertDialog dialog;
    private final EditText editText;

    public EditableTextDialog(RxAlertDialog rxAlertDialog, EditText editText2) {
        this.dialog = rxAlertDialog;
        this.editText = editText2;
    }

    /* renamed from: a */
    public /* synthetic */ CharSequence mo15554a(DialogInterface dialogInterface) {
        return this.editText.getText();
    }

    public void cancel() {
        this.dialog.cancel();
    }

    public void dismiss() {
        this.dialog.dismiss();
    }

    public C5368e<DialogInterface> negativeClicks() {
        return this.dialog.negativeClicks();
    }

    public C5368e<CharSequence> positiveClicks() {
        return this.dialog.positiveClicks().mo18694j(new C4615o(this));
    }

    /* access modifiers changed from: protected */
    public void setText(String str) {
        this.editText.setText(str);
    }

    public void show() {
        this.dialog.show();
    }
}
