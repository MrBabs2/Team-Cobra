package p015cm.aptoide.p016pt.promotions;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import p015cm.aptoide.analytics.implementation.CrashLogger;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.HomePromotionsWrapper;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.promotions.PromotionsHomeDialog */
public class PromotionsHomeDialog {
    private static final String HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL = "HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL";
    private Button cancel;
    private final CrashLogger crashReport = CrashReport.getInstance();
    private AlertDialog dialog;
    private View dialogView;
    private Button navigate;
    private C12871b<String> uiEvents = C12871b.m41468p();

    public PromotionsHomeDialog(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.dialog = new AlertDialog.Builder(context).create();
        View inflate = from.inflate(C1086R.layout.promotions_home_dialog, (ViewGroup) null);
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
        this.navigate.setOnClickListener(new C3787g2(this));
        this.cancel.setOnClickListener(new C3795h2(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13724a(View view) {
        C12871b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("navigate");
        } else {
            this.crashReport.log(HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL, "");
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo13725b(View view) {
        C12871b<String> bVar = this.uiEvents;
        if (bVar != null) {
            bVar.onNext("cancel");
        } else {
            this.crashReport.log(HOME_PROMOTIONS_DIALOG_EVENT_LISTENER_IS_NULL, "");
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

    public void showDialog(HomePromotionsWrapper homePromotionsWrapper) {
        this.dialog.show();
        ((TextView) this.dialogView.findViewById(C1086R.C1088id.description)).setText(homePromotionsWrapper.getDescription());
        ((TextView) this.dialog.findViewById(C1086R.C1088id.promotion_title)).setText(homePromotionsWrapper.getTitle());
        ImageLoader.with(this.dialog.getContext()).load(homePromotionsWrapper.getFeatureGraphic(), (ImageView) this.dialog.findViewById(C1086R.C1088id.promotion_graphic));
    }
}
