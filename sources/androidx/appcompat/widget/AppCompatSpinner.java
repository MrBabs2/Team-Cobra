package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0074c;
import androidx.appcompat.view.menu.C0158p;
import p050l.p051a.C4790a;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5070u;
import p050l.p075h.p084l.C5071v;

public class AppCompatSpinner extends Spinner implements C5070u {

    /* renamed from: n */
    private static final int[] f751n = {16843505};

    /* renamed from: f */
    private final C0231d f752f;

    /* renamed from: g */
    private final Context f753g;

    /* renamed from: h */
    private C0225b0 f754h;

    /* renamed from: i */
    private SpinnerAdapter f755i;

    /* renamed from: j */
    private final boolean f756j;

    /* renamed from: k */
    private C0192f f757k;

    /* renamed from: l */
    int f758l;

    /* renamed from: m */
    final Rect f759m;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0183a();

        /* renamed from: f */
        boolean f760f;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        class C0183a implements Parcelable.Creator<SavedState> {
            C0183a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f760f ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f760f = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0184a extends C0225b0 {

        /* renamed from: o */
        final /* synthetic */ C0188e f761o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0184a(View view, C0188e eVar) {
            super(view);
            this.f761o = eVar;
        }

        /* renamed from: a */
        public C0158p mo469a() {
            return this.f761o;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public boolean mo470b() {
            if (AppCompatSpinner.this.getInternalPopup().mo1113a()) {
                return true;
            }
            AppCompatSpinner.this.mo1079a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class C0185b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0185b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1113a()) {
                AppCompatSpinner.this.mo1079a();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class C0186c implements C0192f, DialogInterface.OnClickListener {

        /* renamed from: f */
        C0074c f764f;

        /* renamed from: g */
        private ListAdapter f765g;

        /* renamed from: h */
        private CharSequence f766h;

        C0186c() {
        }

        /* renamed from: a */
        public boolean mo1113a() {
            C0074c cVar = this.f764f;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        /* renamed from: b */
        public int mo1114b() {
            return 0;
        }

        /* renamed from: b */
        public void mo1115b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public CharSequence mo1116c() {
            return this.f766h;
        }

        /* renamed from: d */
        public Drawable mo1118d() {
            return null;
        }

        public void dismiss() {
            C0074c cVar = this.f764f;
            if (cVar != null) {
                cVar.dismiss();
                this.f764f = null;
            }
        }

        /* renamed from: f */
        public int mo1120f() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f765g.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: a */
        public void mo1111a(ListAdapter listAdapter) {
            this.f765g = listAdapter;
        }

        /* renamed from: c */
        public void mo1117c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1112a(CharSequence charSequence) {
            this.f766h = charSequence;
        }

        /* renamed from: a */
        public void mo1109a(int i, int i2) {
            if (this.f765g != null) {
                C0074c.C0075a aVar = new C0074c.C0075a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f766h;
                if (charSequence != null) {
                    aVar.mo230b(charSequence);
                }
                aVar.mo218a(this.f765g, AppCompatSpinner.this.getSelectedItemPosition(), (DialogInterface.OnClickListener) this);
                C0074c a = aVar.mo225a();
                this.f764f = a;
                ListView b = a.mo207b();
                if (Build.VERSION.SDK_INT >= 17) {
                    b.setTextDirection(i);
                    b.setTextAlignment(i2);
                }
                this.f764f.show();
            }
        }

        /* renamed from: a */
        public void mo1110a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1108a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static class C0187d implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f768f;

        /* renamed from: g */
        private ListAdapter f769g;

        public C0187d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f768f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f769g = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0270m0) {
                C0270m0 m0Var = (C0270m0) spinnerAdapter;
                if (m0Var.getDropDownViewTheme() == null) {
                    m0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f769g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f768f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f768f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f768f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f768f;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f768f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f769g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f768f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f768f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    class C0188e extends C0232d0 implements C0192f {

        /* renamed from: N */
        private CharSequence f770N;

        /* renamed from: O */
        ListAdapter f771O;

        /* renamed from: P */
        private final Rect f772P = new Rect();

        /* renamed from: Q */
        private int f773Q;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        class C0189a implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AppCompatSpinner f775f;

            C0189a(AppCompatSpinner appCompatSpinner) {
                this.f775f = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0188e eVar = C0188e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f771O.getItemId(i));
                }
                C0188e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        class C0190b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0190b() {
            }

            public void onGlobalLayout() {
                C0188e eVar = C0188e.this;
                if (!eVar.mo1135b(AppCompatSpinner.this)) {
                    C0188e.this.dismiss();
                    return;
                }
                C0188e.this.mo1136p();
                C0188e.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        class C0191c implements PopupWindow.OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f778f;

            C0191c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f778f = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f778f);
                }
            }
        }

        public C0188e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1489a((View) AppCompatSpinner.this);
            mo1492a(true);
            mo1504h(0);
            mo1490a((AdapterView.OnItemClickListener) new C0189a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1135b(View view) {
            return C5071v.m9139D(view) && view.getGlobalVisibleRect(this.f772P);
        }

        /* renamed from: c */
        public CharSequence mo1116c() {
            return this.f770N;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo1136p() {
            int i;
            int i2;
            Drawable d = mo1496d();
            int i3 = 0;
            if (d != null) {
                d.getPadding(AppCompatSpinner.this.f759m);
                if (C0298w0.m1423a(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f759m.right;
                } else {
                    i2 = -AppCompatSpinner.this.f759m.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f759m;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.f758l;
            if (i4 == -2) {
                int a = appCompatSpinner.mo1078a((SpinnerAdapter) this.f771O, mo1496d());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f759m;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a > i6) {
                    a = i6;
                }
                mo1498e(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                mo1498e((width - paddingLeft) - paddingRight);
            } else {
                mo1498e(i4);
            }
            if (C0298w0.m1423a(AppCompatSpinner.this)) {
                i = i3 + (((width - paddingRight) - mo1511m()) - mo1137q());
            } else {
                i = i3 + paddingLeft + mo1137q();
            }
            mo1486a(i);
        }

        /* renamed from: q */
        public int mo1137q() {
            return this.f773Q;
        }

        /* renamed from: a */
        public void mo1111a(ListAdapter listAdapter) {
            super.mo1111a(listAdapter);
            this.f771O = listAdapter;
        }

        /* renamed from: c */
        public void mo1117c(int i) {
            this.f773Q = i;
        }

        /* renamed from: a */
        public void mo1112a(CharSequence charSequence) {
            this.f770N = charSequence;
        }

        /* renamed from: a */
        public void mo1109a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a = mo570a();
            mo1136p();
            mo1502g(2);
            super.show();
            ListView e = mo579e();
            e.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                e.setTextDirection(i);
                e.setTextAlignment(i2);
            }
            mo1506i(AppCompatSpinner.this.getSelectedItemPosition());
            if (!a && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0190b bVar = new C0190b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo1491a((PopupWindow.OnDismissListener) new C0191c(bVar));
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    interface C0192f {
        /* renamed from: a */
        void mo1108a(int i);

        /* renamed from: a */
        void mo1109a(int i, int i2);

        /* renamed from: a */
        void mo1110a(Drawable drawable);

        /* renamed from: a */
        void mo1111a(ListAdapter listAdapter);

        /* renamed from: a */
        void mo1112a(CharSequence charSequence);

        /* renamed from: a */
        boolean mo1113a();

        /* renamed from: b */
        int mo1114b();

        /* renamed from: b */
        void mo1115b(int i);

        /* renamed from: c */
        CharSequence mo1116c();

        /* renamed from: c */
        void mo1117c(int i);

        /* renamed from: d */
        Drawable mo1118d();

        void dismiss();

        /* renamed from: f */
        int mo1120f();
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.spinnerStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1078a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f759m);
        Rect rect = this.f759m;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f752f;
        if (dVar != null) {
            dVar.mo1476a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0192f fVar = this.f757k;
        if (fVar != null) {
            return fVar.mo1114b();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0192f fVar = this.f757k;
        if (fVar != null) {
            return fVar.mo1120f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f757k != null) {
            return this.f758l;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0192f getInternalPopup() {
        return this.f757k;
    }

    public Drawable getPopupBackground() {
        C0192f fVar = this.f757k;
        if (fVar != null) {
            return fVar.mo1118d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f753g;
    }

    public CharSequence getPrompt() {
        C0192f fVar = this.f757k;
        return fVar != null ? fVar.mo1116c() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f752f;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f752f;
        if (dVar != null) {
            return dVar.mo1484c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0192f fVar = this.f757k;
        if (fVar != null && fVar.mo1113a()) {
            this.f757k.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f757k != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1078a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f760f && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0185b());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0192f fVar = this.f757k;
        savedState.f760f = fVar != null && fVar.mo1113a();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0225b0 b0Var = this.f754h;
        if (b0Var == null || !b0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0192f fVar = this.f757k;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo1113a()) {
            return true;
        }
        mo1079a();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231d dVar = this.f752f;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f752f;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0192f fVar = this.f757k;
        if (fVar != null) {
            fVar.mo1117c(i);
            this.f757k.mo1108a(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0192f fVar = this.f757k;
        if (fVar != null) {
            fVar.mo1115b(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f757k != null) {
            this.f758l = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0192f fVar = this.f757k;
        if (fVar != null) {
            fVar.mo1110a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C4800a.m7936c(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0192f fVar = this.f757k;
        if (fVar != null) {
            fVar.mo1112a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f752f;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f752f;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f756j) {
            this.f755i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f757k != null) {
            Context context = this.f753g;
            if (context == null) {
                context = getContext();
            }
            this.f757k.mo1111a((ListAdapter) new C0187d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r11 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r11 != null) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f759m = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0268l0.m1250a((android.view.View) r6, (android.content.Context) r0)
            int[] r0 = p050l.p051a.C4799j.Spinner
            r1 = 0
            androidx.appcompat.widget.q0 r0 = androidx.appcompat.widget.C0278q0.m1271a(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r6)
            r6.f752f = r2
            if (r11 == 0) goto L_0x0029
            l.a.o.d r2 = new l.a.o.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f753g = r2
            goto L_0x003b
        L_0x0029:
            int r11 = p050l.p051a.C4799j.Spinner_popupTheme
            int r11 = r0.mo1729g(r11, r1)
            if (r11 == 0) goto L_0x0039
            l.a.o.d r2 = new l.a.o.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f753g = r2
            goto L_0x003b
        L_0x0039:
            r6.f753g = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006d
            int[] r11 = f751n     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0055 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0055 }
        L_0x004f:
            if (r11 == 0) goto L_0x006d
        L_0x0051:
            r11.recycle()
            goto L_0x006d
        L_0x0055:
            r3 = move-exception
            goto L_0x005b
        L_0x0057:
            r7 = move-exception
            goto L_0x0067
        L_0x0059:
            r3 = move-exception
            r11 = r2
        L_0x005b:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0065 }
            if (r11 == 0) goto L_0x006d
            goto L_0x0051
        L_0x0065:
            r7 = move-exception
            r2 = r11
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.recycle()
        L_0x006c:
            throw r7
        L_0x006d:
            r11 = 1
            if (r10 == 0) goto L_0x00aa
            if (r10 == r11) goto L_0x0073
            goto L_0x00ba
        L_0x0073:
            androidx.appcompat.widget.AppCompatSpinner$e r10 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r6.f753g
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f753g
            int[] r4 = p050l.p051a.C4799j.Spinner
            androidx.appcompat.widget.q0 r1 = androidx.appcompat.widget.C0278q0.m1271a(r3, r8, r4, r9, r1)
            int r3 = p050l.p051a.C4799j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo1727f(r3, r4)
            r6.f758l = r3
            int r3 = p050l.p051a.C4799j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo1719b(r3)
            r10.mo1488a((android.graphics.drawable.Drawable) r3)
            int r3 = p050l.p051a.C4799j.Spinner_android_prompt
            java.lang.String r3 = r0.mo1724d(r3)
            r10.mo1112a((java.lang.CharSequence) r3)
            r1.mo1720b()
            r6.f757k = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f754h = r1
            goto L_0x00ba
        L_0x00aa:
            androidx.appcompat.widget.AppCompatSpinner$c r10 = new androidx.appcompat.widget.AppCompatSpinner$c
            r10.<init>()
            r6.f757k = r10
            int r1 = p050l.p051a.C4799j.Spinner_android_prompt
            java.lang.String r1 = r0.mo1724d(r1)
            r10.mo1112a((java.lang.CharSequence) r1)
        L_0x00ba:
            int r10 = p050l.p051a.C4799j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo1728f(r10)
            if (r10 == 0) goto L_0x00d2
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p050l.p051a.C4796g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d2:
            r0.mo1720b()
            r6.f756j = r11
            android.widget.SpinnerAdapter r7 = r6.f755i
            if (r7 == 0) goto L_0x00e0
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f755i = r2
        L_0x00e0:
            androidx.appcompat.widget.d r7 = r6.f752f
            r7.mo1481a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1079a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f757k.mo1109a(getTextDirection(), getTextAlignment());
        } else {
            this.f757k.mo1109a(-1, -1);
        }
    }
}
