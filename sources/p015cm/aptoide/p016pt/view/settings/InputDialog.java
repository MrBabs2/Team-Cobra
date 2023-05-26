package p015cm.aptoide.p016pt.view.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.dialog.EditableTextDialog;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;

/* renamed from: cm.aptoide.pt.view.settings.InputDialog */
public class InputDialog extends EditableTextDialog {

    /* renamed from: cm.aptoide.pt.view.settings.InputDialog$Builder */
    public static class Builder {
        private final RxAlertDialog.Builder builder;
        private int editTextId;
        private final LayoutInflater layoutInflater;
        private int viewRes;

        public Builder(Context context, ThemeManager themeManager) {
            this.builder = new RxAlertDialog.Builder(context, themeManager);
            this.layoutInflater = LayoutInflater.from(context);
        }

        public InputDialog build() {
            int i = this.viewRes;
            if (i == 0 || this.editTextId == 0) {
                throw new IllegalArgumentException("View and edit text resource ids must be provided");
            }
            View inflate = this.layoutInflater.inflate(i, (ViewGroup) null, false);
            this.builder.setView(inflate);
            return new InputDialog(this.builder.build(), (EditText) inflate.findViewById(this.editTextId));
        }

        public Builder setEditText(int i) {
            this.editTextId = i;
            return this;
        }

        public Builder setMessage(int i) {
            this.builder.setMessage(i);
            return this;
        }

        public Builder setNegativeButton(int i) {
            this.builder.setNegativeButton(i);
            return this;
        }

        public Builder setPositiveButton(int i) {
            this.builder.setPositiveButton(i);
            return this;
        }

        public Builder setView(int i) {
            this.viewRes = i;
            return this;
        }
    }

    public InputDialog(RxAlertDialog rxAlertDialog, EditText editText) {
        super(rxAlertDialog, editText);
    }

    public void show() {
        super.show();
        setText("");
    }

    public void showWithInput(String str) {
        super.show();
        setText(str);
    }
}
