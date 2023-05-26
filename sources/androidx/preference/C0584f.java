package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.C0074c;
import androidx.fragment.app.C0454b;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: androidx.preference.f */
/* compiled from: PreferenceDialogFragmentCompat */
public abstract class C0584f extends C0454b implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private DialogPreference f2343f;

    /* renamed from: g */
    private CharSequence f2344g;

    /* renamed from: h */
    private CharSequence f2345h;

    /* renamed from: i */
    private CharSequence f2346i;

    /* renamed from: j */
    private CharSequence f2347j;

    /* renamed from: k */
    private int f2348k;

    /* renamed from: l */
    private BitmapDrawable f2349l;

    /* renamed from: m */
    private int f2350m;

    /* renamed from: a */
    private void m2876a(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3286a(C0074c.C0075a aVar) {
    }

    /* renamed from: a */
    public abstract void mo3284a(boolean z);

    /* renamed from: b */
    public DialogPreference mo3298b() {
        if (this.f2343f == null) {
            this.f2343f = (DialogPreference) ((DialogPreference.C0552a) getTargetFragment()).findPreference(getArguments().getString(RoomNotification.KEY));
        }
        return this.f2343f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3285c() {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2350m = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.C0552a) {
            DialogPreference.C0552a aVar = (DialogPreference.C0552a) targetFragment;
            String string = getArguments().getString(RoomNotification.KEY);
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.findPreference(string);
                this.f2343f = dialogPreference;
                this.f2344g = dialogPreference.mo3120a0();
                this.f2345h = this.f2343f.mo3122c0();
                this.f2346i = this.f2343f.mo3121b0();
                this.f2347j = this.f2343f.mo3119Z();
                this.f2348k = this.f2343f.mo3118Y();
                Drawable X = this.f2343f.mo3117X();
                if (X == null || (X instanceof BitmapDrawable)) {
                    this.f2349l = (BitmapDrawable) X;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(X.getIntrinsicWidth(), X.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                X.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                X.draw(canvas);
                this.f2349l = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.f2344g = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f2345h = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f2346i = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f2347j = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f2348k = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f2349l = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C0456c activity = getActivity();
        this.f2350m = -2;
        C0074c.C0075a aVar = new C0074c.C0075a(activity);
        aVar.mo230b(this.f2344g);
        aVar.mo216a((Drawable) this.f2349l);
        aVar.mo234c(this.f2345h, (DialogInterface.OnClickListener) this);
        aVar.mo221a(this.f2346i, (DialogInterface.OnClickListener) this);
        View a = mo3297a((Context) activity);
        if (a != null) {
            mo3283a(a);
            aVar.mo229b(a);
        } else {
            aVar.mo220a(this.f2347j);
        }
        mo3286a(aVar);
        C0074c a2 = aVar.mo225a();
        if (mo3285c()) {
            m2876a((Dialog) a2);
        }
        return a2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo3284a(this.f2350m == -1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2344g);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2345h);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2346i);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2347j);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2348k);
        BitmapDrawable bitmapDrawable = this.f2349l;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo3297a(Context context) {
        int i = this.f2348k;
        if (i == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3283a(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f2347j;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }
}
