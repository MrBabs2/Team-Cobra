package p015cm.aptoide.p016pt.view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.dialog.ImagePickerDialog */
public class ImagePickerDialog implements DialogInterface {
    public static final int LAYOUT = 2131492971;
    private final RxAlertDialog dialog;
    private View selectFromCamera;
    private View selectFromGallery;

    /* renamed from: cm.aptoide.pt.view.dialog.ImagePickerDialog$Builder */
    public static class Builder {
        private final RxAlertDialog.Builder builder;
        private int cameraButtonRes;
        private int galleryButtonRes;
        private final LayoutInflater layoutInflater;
        private int viewRes;

        public Builder(Context context, ThemeManager themeManager) {
            this.builder = new RxAlertDialog.Builder(context, themeManager);
            this.layoutInflater = LayoutInflater.from(context);
        }

        public ImagePickerDialog build() {
            int i = this.viewRes;
            if (i == 0 || this.cameraButtonRes == 0 || this.galleryButtonRes == 0) {
                throw new IllegalArgumentException("View and edit text resource ids must be provided");
            }
            View inflate = this.layoutInflater.inflate(i, (ViewGroup) null, false);
            this.builder.setView(inflate);
            return new ImagePickerDialog(this.builder.build(), (TextView) inflate.findViewById(this.cameraButtonRes), (TextView) inflate.findViewById(this.galleryButtonRes));
        }

        public Builder setCameraButton(int i) {
            this.cameraButtonRes = i;
            return this;
        }

        public Builder setGalleryButton(int i) {
            this.galleryButtonRes = i;
            return this;
        }

        public Builder setNegativeButton(int i) {
            this.builder.setNegativeButton(i);
            return this;
        }

        public Builder setTitle(int i) {
            this.builder.setTitle(i);
            return this;
        }

        public Builder setViewRes(int i) {
            this.viewRes = i;
            return this;
        }
    }

    /* renamed from: a */
    public /* synthetic */ DialogInterface mo15561a(Void voidR) {
        return this;
    }

    /* renamed from: b */
    public /* synthetic */ DialogInterface mo15562b(Void voidR) {
        return this;
    }

    public C5368e<DialogInterface> cameraSelected() {
        return C10695a.m36221a(this.selectFromCamera).mo18694j(new C4616p(this));
    }

    public void cancel() {
        this.dialog.cancel();
    }

    public void dismiss() {
        this.dialog.dismiss();
    }

    public C5368e<DialogInterface> gallerySelected() {
        return C10695a.m36221a(this.selectFromGallery).mo18694j(new C4617q(this));
    }

    public void show() {
        this.dialog.show();
    }

    private ImagePickerDialog(RxAlertDialog rxAlertDialog, TextView textView, TextView textView2) {
        this.dialog = rxAlertDialog;
        this.selectFromCamera = textView;
        this.selectFromGallery = textView2;
    }
}
