package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0264k;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import p050l.p051a.C4790a;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;

public class CheckableImageButton extends C0264k implements Checkable {

    /* renamed from: k */
    private static final int[] f24404k = {16842912};

    /* renamed from: h */
    private boolean f24405h;

    /* renamed from: i */
    private boolean f24406i;

    /* renamed from: j */
    private boolean f24407j;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8545a();

        /* renamed from: h */
        boolean f24408h;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        static class C8545a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8545a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m27876a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f24408h = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24408h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m27876a(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C8546a extends C5010a {
        C8546a() {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            super.mo2445a(view, cVar);
            cVar.mo17522b(CheckableImageButton.this.mo31844a());
            cVar.mo17528c(CheckableImageButton.this.isChecked());
        }

        /* renamed from: b */
        public void mo2447b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2447b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo31844a() {
        return this.f24406i;
    }

    public boolean isChecked() {
        return this.f24405h;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f24405h) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f24404k.length), f24404k);
        }
        return super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        setChecked(savedState.f24408h);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f24408h = this.f24405h;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f24406i != z) {
            this.f24406i = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f24406i && this.f24405h != z) {
            this.f24405h = z;
            refreshDrawableState();
            sendAccessibilityEvent(RecyclerView.C0638l.FLAG_MOVED);
        }
    }

    public void setPressable(boolean z) {
        this.f24407j = z;
    }

    public void setPressed(boolean z) {
        if (this.f24407j) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f24405h);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24406i = true;
        this.f24407j = true;
        C5071v.m9165a((View) this, (C5010a) new C8546a());
    }
}
