package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

public class SeekBarPreference extends Preference {

    /* renamed from: U */
    int f2300U;

    /* renamed from: V */
    int f2301V;

    /* renamed from: W */
    private int f2302W;

    /* renamed from: X */
    private int f2303X;

    /* renamed from: Y */
    boolean f2304Y;

    /* renamed from: Z */
    SeekBar f2305Z;

    /* renamed from: a0 */
    private TextView f2306a0;

    /* renamed from: b0 */
    boolean f2307b0;

    /* renamed from: c0 */
    private boolean f2308c0;

    /* renamed from: d0 */
    boolean f2309d0;

    /* renamed from: e0 */
    private SeekBar.OnSeekBarChangeListener f2310e0;

    /* renamed from: f0 */
    private View.OnKeyListener f2311f0;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C0572a implements SeekBar.OnSeekBarChangeListener {
        C0572a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f2309d0 || !seekBarPreference.f2304Y) {
                    SeekBarPreference.this.mo3255a(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo3259j(i + seekBarPreference2.f2301V);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f2304Y = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f2304Y = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f2301V != seekBarPreference.f2300U) {
                seekBarPreference.mo3255a(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class C0573b implements View.OnKeyListener {
        C0573b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if ((!SeekBarPreference.this.f2307b0 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = SeekBarPreference.this.f2305Z;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2310e0 = new C0572a();
        this.f2311f0 = new C0573b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0615t.SeekBarPreference, i, i2);
        this.f2301V = obtainStyledAttributes.getInt(C0615t.SeekBarPreference_min, 0);
        mo3256g(obtainStyledAttributes.getInt(C0615t.SeekBarPreference_android_max, 100));
        mo3257h(obtainStyledAttributes.getInt(C0615t.SeekBarPreference_seekBarIncrement, 0));
        this.f2307b0 = obtainStyledAttributes.getBoolean(C0615t.SeekBarPreference_adjustable, true);
        this.f2308c0 = obtainStyledAttributes.getBoolean(C0615t.SeekBarPreference_showSeekBarValue, false);
        this.f2309d0 = obtainStyledAttributes.getBoolean(C0615t.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public Parcelable mo3128T() {
        Parcelable T = super.mo3128T();
        if (mo3166K()) {
            return T;
        }
        SavedState savedState = new SavedState(T);
        savedState.f2312f = this.f2300U;
        savedState.f2313g = this.f2301V;
        savedState.f2314h = this.f2302W;
        return savedState;
    }

    /* renamed from: a */
    public void mo3114a(C0607l lVar) {
        super.mo3114a(lVar);
        lVar.itemView.setOnKeyListener(this.f2311f0);
        this.f2305Z = (SeekBar) lVar.mo3383a(C0611p.seekbar);
        TextView textView = (TextView) lVar.mo3383a(C0611p.seekbar_value);
        this.f2306a0 = textView;
        if (this.f2308c0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f2306a0 = null;
        }
        SeekBar seekBar = this.f2305Z;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f2310e0);
        this.f2305Z.setMax(this.f2302W - this.f2301V);
        int i = this.f2303X;
        if (i != 0) {
            this.f2305Z.setKeyProgressIncrement(i);
        } else {
            this.f2303X = this.f2305Z.getKeyProgressIncrement();
        }
        this.f2305Z.setProgress(this.f2300U - this.f2301V);
        mo3259j(this.f2300U);
        this.f2305Z.setEnabled(mo3165J());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3132b(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        mo3258i(mo3175a(((Integer) obj).intValue()));
    }

    /* renamed from: g */
    public final void mo3256g(int i) {
        int i2 = this.f2301V;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f2302W) {
            this.f2302W = i;
            mo3124N();
        }
    }

    /* renamed from: h */
    public final void mo3257h(int i) {
        if (i != this.f2303X) {
            this.f2303X = Math.min(this.f2302W - this.f2301V, Math.abs(i));
            mo3124N();
        }
    }

    /* renamed from: i */
    public void mo3258i(int i) {
        m2818a(i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3259j(int i) {
        TextView textView = this.f2306a0;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0571a();

        /* renamed from: f */
        int f2312f;

        /* renamed from: g */
        int f2313g;

        /* renamed from: h */
        int f2314h;

        /* renamed from: androidx.preference.SeekBarPreference$SavedState$a */
        static class C0571a implements Parcelable.Creator<SavedState> {
            C0571a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2312f = parcel.readInt();
            this.f2313g = parcel.readInt();
            this.f2314h = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2312f);
            parcel.writeInt(this.f2313g);
            parcel.writeInt(this.f2314h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0608m.seekBarPreferenceStyle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo3130a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: a */
    private void m2818a(int i, boolean z) {
        int i2 = this.f2301V;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f2302W;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f2300U) {
            this.f2300U = i;
            mo3259j(i);
            mo3199b(i);
            if (z) {
                mo3124N();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3255a(SeekBar seekBar) {
        int progress = this.f2301V + seekBar.getProgress();
        if (progress == this.f2300U) {
            return;
        }
        if (mo3192a((Object) Integer.valueOf(progress))) {
            m2818a(progress, false);
            return;
        }
        seekBar.setProgress(this.f2300U - this.f2301V);
        mo3259j(this.f2300U);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3131a(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo3131a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3131a(savedState.getSuperState());
        this.f2300U = savedState.f2312f;
        this.f2301V = savedState.f2313g;
        this.f2302W = savedState.f2314h;
        mo3124N();
    }
}
