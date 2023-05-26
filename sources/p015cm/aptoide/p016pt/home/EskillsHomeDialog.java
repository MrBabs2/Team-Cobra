package p015cm.aptoide.p016pt.home;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import p015cm.aptoide.p016pt.C1086R;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.EskillsHomeDialog */
public class EskillsHomeDialog {
    private Button cancel;
    private AlertDialog dialog;
    private final View dialogView;
    private Button navigate;
    private C12871b<String> uiEvents = C12871b.m41468p();

    public EskillsHomeDialog(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.dialog = new AlertDialog.Builder(context).create();
        View inflate = from.inflate(C1086R.layout.eskills_home_dialog, (ViewGroup) null);
        this.dialogView = inflate;
        this.dialog.setView(inflate);
        this.cancel = (Button) this.dialogView.findViewById(C1086R.C1088id.cancel_button);
        this.navigate = (Button) this.dialogView.findViewById(C1086R.C1088id.navigate_button);
        this.dialog.setCancelable(true);
        this.dialog.setCanceledOnTouchOutside(true);
        Window window = this.dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.navigate.setOnClickListener(new C2945d(this));
        this.cancel.setOnClickListener(new C2958e(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11524a(View view) {
        C12871b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("navigate");
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo11525b(View view) {
        C12871b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("cancel");
        }
    }

    public void destroyDialog() {
        dismissDialog();
        this.dialog = null;
        this.navigate = null;
        this.cancel = null;
        this.uiEvents = null;
    }

    public C5368e<String> dialogClicked() {
        return this.uiEvents;
    }

    public void dismissDialog() {
        this.dialog.dismiss();
    }

    public void showDialog() {
        this.dialog.show();
    }
}
