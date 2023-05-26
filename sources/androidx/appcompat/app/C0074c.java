package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p050l.p051a.C4790a;

/* renamed from: androidx.appcompat.app.c */
/* compiled from: AlertDialog */
public class C0074c extends C0104h implements DialogInterface {

    /* renamed from: h */
    final AlertController f216h = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    /* compiled from: AlertDialog */
    public static class C0075a {

        /* renamed from: a */
        private final AlertController.C0061f f217a;

        /* renamed from: b */
        private final int f218b;

        public C0075a(Context context) {
            this(context, C0074c.m214a(context, 0));
        }

        /* renamed from: a */
        public C0075a mo217a(View view) {
            this.f217a.f182g = view;
            return this;
        }

        /* renamed from: b */
        public Context mo226b() {
            return this.f217a.f176a;
        }

        /* renamed from: c */
        public C0075a mo232c(int i) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f181f = fVar.f176a.getText(i);
            return this;
        }

        public C0075a(Context context, int i) {
            this.f217a = new AlertController.C0061f(new ContextThemeWrapper(context, C0074c.m214a(context, i)));
            this.f218b = i;
        }

        /* renamed from: a */
        public C0075a mo220a(CharSequence charSequence) {
            this.f217a.f183h = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0075a mo230b(CharSequence charSequence) {
            this.f217a.f181f = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0075a mo233c(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f184i = fVar.f176a.getText(i);
            this.f217a.f186k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0075a mo212a(int i) {
            this.f217a.f178c = i;
            return this;
        }

        /* renamed from: b */
        public C0075a mo227b(int i) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f183h = fVar.f176a.getText(i);
            return this;
        }

        /* renamed from: a */
        public C0075a mo216a(Drawable drawable) {
            this.f217a.f179d = drawable;
            return this;
        }

        /* renamed from: b */
        public C0075a mo228b(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f187l = fVar.f176a.getText(i);
            this.f217a.f189n = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C0075a mo234c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f184i = charSequence;
            fVar.f186k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0075a mo221a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f187l = charSequence;
            fVar.f189n = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0075a mo231b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f190o = charSequence;
            fVar.f192q = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0075a mo222a(boolean z) {
            this.f217a.f193r = z;
            return this;
        }

        /* renamed from: a */
        public C0075a mo214a(DialogInterface.OnCancelListener onCancelListener) {
            this.f217a.f194s = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public C0075a mo229b(View view) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f201z = view;
            fVar.f200y = 0;
            fVar.f165E = false;
            return this;
        }

        /* renamed from: a */
        public C0075a mo215a(DialogInterface.OnKeyListener onKeyListener) {
            this.f217a.f196u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0075a mo213a(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f197v = fVar.f176a.getResources().getTextArray(i);
            this.f217a.f199x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0075a mo219a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f198w = listAdapter;
            fVar.f199x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0075a mo224a(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f197v = charSequenceArr;
            fVar.f170J = onMultiChoiceClickListener;
            fVar.f166F = zArr;
            fVar.f167G = true;
            return this;
        }

        /* renamed from: a */
        public C0075a mo223a(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f197v = charSequenceArr;
            fVar.f199x = onClickListener;
            fVar.f169I = i;
            fVar.f168H = true;
            return this;
        }

        /* renamed from: a */
        public C0075a mo218a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0061f fVar = this.f217a;
            fVar.f198w = listAdapter;
            fVar.f199x = onClickListener;
            fVar.f169I = i;
            fVar.f168H = true;
            return this;
        }

        /* renamed from: a */
        public C0074c mo225a() {
            C0074c cVar = new C0074c(this.f217a.f176a, this.f218b);
            this.f217a.mo170a(cVar.f216h);
            cVar.setCancelable(this.f217a.f193r);
            if (this.f217a.f193r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f217a.f194s);
            cVar.setOnDismissListener(this.f217a.f195t);
            DialogInterface.OnKeyListener onKeyListener = this.f217a.f196u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }
    }

    protected C0074c(Context context, int i) {
        super(context, m214a(context, i));
    }

    /* renamed from: a */
    static int m214a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4790a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public Button mo206b(int i) {
        return this.f216h.mo148a(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f216h.mo157b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f216h.mo155a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f216h.mo160b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f216h.mo159b(charSequence);
    }

    /* renamed from: b */
    public ListView mo207b() {
        return this.f216h.mo149a();
    }

    /* renamed from: a */
    public void mo205a(Drawable drawable) {
        this.f216h.mo151a(drawable);
    }
}
