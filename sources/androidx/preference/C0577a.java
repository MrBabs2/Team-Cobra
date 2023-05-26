package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: androidx.preference.a */
/* compiled from: EditTextPreferenceDialogFragmentCompat */
public class C0577a extends C0584f {

    /* renamed from: n */
    private EditText f2331n;

    /* renamed from: o */
    private CharSequence f2332o;

    /* renamed from: d */
    private EditTextPreference m2854d() {
        return (EditTextPreference) mo3298b();
    }

    public static C0577a newInstance(String str) {
        C0577a aVar = new C0577a();
        Bundle bundle = new Bundle(1);
        bundle.putString(RoomNotification.KEY, str);
        aVar.setArguments(bundle);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3283a(View view) {
        super.mo3283a(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f2331n = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f2331n.setText(this.f2332o);
            EditText editText2 = this.f2331n;
            editText2.setSelection(editText2.getText().length());
            if (m2854d().mo3134d0() != null) {
                m2854d().mo3134d0().mo3139a(this.f2331n);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3285c() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f2332o = m2854d().mo3135e0();
        } else {
            this.f2332o = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f2332o);
    }

    /* renamed from: a */
    public void mo3284a(boolean z) {
        if (z) {
            String obj = this.f2331n.getText().toString();
            EditTextPreference d = m2854d();
            if (d.mo3192a((Object) obj)) {
                d.mo3133d(obj);
            }
        }
    }
}
