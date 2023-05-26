package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {

    /* renamed from: f0 */
    private final Context f2225f0;

    /* renamed from: g0 */
    private final ArrayAdapter f2226g0;

    /* renamed from: h0 */
    private Spinner f2227h0;

    /* renamed from: i0 */
    private final AdapterView.OnItemSelectedListener f2228i0;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C0553a implements AdapterView.OnItemSelectedListener {
        C0553a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo3147f0()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo3148g0()) && DropDownPreference.this.mo3192a((Object) charSequence)) {
                    DropDownPreference.this.mo3145e(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0608m.dropdownPreferenceStyle);
    }

    /* renamed from: f */
    private int m2658f(String str) {
        CharSequence[] f0 = mo3147f0();
        if (str == null || f0 == null) {
            return -1;
        }
        for (int length = f0.length - 1; length >= 0; length--) {
            if (f0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: i0 */
    private void m2659i0() {
        this.f2226g0.clear();
        if (mo3144d0() != null) {
            for (CharSequence charSequence : mo3144d0()) {
                this.f2226g0.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo3124N() {
        super.mo3124N();
        ArrayAdapter arrayAdapter = this.f2226g0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3116Q() {
        this.f2227h0.performClick();
    }

    /* renamed from: a */
    public void mo3114a(C0607l lVar) {
        Spinner spinner = (Spinner) lVar.itemView.findViewById(C0611p.spinner);
        this.f2227h0 = spinner;
        spinner.setAdapter(this.f2226g0);
        this.f2227h0.setOnItemSelectedListener(this.f2228i0);
        this.f2227h0.setSelection(m2658f(mo3148g0()));
        super.mo3114a(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public ArrayAdapter mo3125h0() {
        return new ArrayAdapter(this.f2225f0, 17367049);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2228i0 = new C0553a();
        this.f2225f0 = context;
        this.f2226g0 = mo3125h0();
        m2659i0();
    }
}
