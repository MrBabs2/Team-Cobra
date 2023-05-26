package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p050l.p051a.C4790a;
import p050l.p051a.C4793d;
import p050l.p051a.C4795f;
import p050l.p051a.C4796g;
import p050l.p051a.C4797h;
import p050l.p051a.C4799j;
import p050l.p051a.p058o.C4823c;
import p050l.p075h.p084l.C5071v;
import p050l.p087i.p088a.C5090a;

public class SearchView extends C0229c0 implements C4823c {

    /* renamed from: v0 */
    static final C0209n f793v0 = (Build.VERSION.SDK_INT < 29 ? new C0209n() : null);

    /* renamed from: A */
    final ImageView f794A;

    /* renamed from: B */
    final ImageView f795B;

    /* renamed from: C */
    private final View f796C;

    /* renamed from: D */
    private C0210o f797D;

    /* renamed from: E */
    private Rect f798E;

    /* renamed from: F */
    private Rect f799F;

    /* renamed from: G */
    private int[] f800G;

    /* renamed from: H */
    private int[] f801H;

    /* renamed from: I */
    private final ImageView f802I;

    /* renamed from: J */
    private final Drawable f803J;

    /* renamed from: K */
    private final int f804K;

    /* renamed from: L */
    private final int f805L;

    /* renamed from: M */
    private final Intent f806M;

    /* renamed from: N */
    private final Intent f807N;

    /* renamed from: O */
    private final CharSequence f808O;

    /* renamed from: P */
    private C0207l f809P;

    /* renamed from: Q */
    private C0206k f810Q;

    /* renamed from: R */
    View.OnFocusChangeListener f811R;

    /* renamed from: S */
    private C0208m f812S;

    /* renamed from: T */
    private View.OnClickListener f813T;

    /* renamed from: U */
    private boolean f814U;

    /* renamed from: V */
    private boolean f815V;

    /* renamed from: W */
    C5090a f816W;

    /* renamed from: a0 */
    private boolean f817a0;

    /* renamed from: b0 */
    private CharSequence f818b0;

    /* renamed from: c0 */
    private boolean f819c0;

    /* renamed from: d0 */
    private boolean f820d0;

    /* renamed from: e0 */
    private int f821e0;

    /* renamed from: f0 */
    private boolean f822f0;

    /* renamed from: g0 */
    private CharSequence f823g0;

    /* renamed from: h0 */
    private CharSequence f824h0;

    /* renamed from: i0 */
    private boolean f825i0;

    /* renamed from: j0 */
    private int f826j0;

    /* renamed from: k0 */
    SearchableInfo f827k0;

    /* renamed from: l0 */
    private Bundle f828l0;

    /* renamed from: m0 */
    private final Runnable f829m0;

    /* renamed from: n0 */
    private Runnable f830n0;

    /* renamed from: o0 */
    private final WeakHashMap<String, Drawable.ConstantState> f831o0;

    /* renamed from: p0 */
    private final View.OnClickListener f832p0;

    /* renamed from: q0 */
    View.OnKeyListener f833q0;

    /* renamed from: r0 */
    private final TextView.OnEditorActionListener f834r0;

    /* renamed from: s0 */
    private final AdapterView.OnItemClickListener f835s0;

    /* renamed from: t0 */
    private final AdapterView.OnItemSelectedListener f836t0;

    /* renamed from: u */
    final SearchAutoComplete f837u;

    /* renamed from: u0 */
    private TextWatcher f838u0;

    /* renamed from: v */
    private final View f839v;

    /* renamed from: w */
    private final View f840w;

    /* renamed from: x */
    private final View f841x;

    /* renamed from: y */
    final ImageView f842y;

    /* renamed from: z */
    final ImageView f843z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0194a();

        /* renamed from: h */
        boolean f844h;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        class C0194a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0194a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f844h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f844h));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f844h = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C0228c {

        /* renamed from: i */
        private int f845i;

        /* renamed from: j */
        private SearchView f846j;

        /* renamed from: k */
        private boolean f847k;

        /* renamed from: l */
        final Runnable f848l;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0195a implements Runnable {
            C0195a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1212c();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1210a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f793v0.mo1245c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1211b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1212c() {
            if (this.f847k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f847k = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f845i <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f847k) {
                removeCallbacks(this.f848l);
                post(this.f848l);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f846j.mo1181j();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f846j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f846j.hasFocus() && getVisibility() == 0) {
                this.f847k = true;
                if (SearchView.m936a(getContext())) {
                    mo1210a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f847k = false;
                removeCallbacks(this.f848l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f847k = false;
                removeCallbacks(this.f848l);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f847k = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f846j = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f845i = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C4790a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f848l = new C0195a();
            this.f845i = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0196a implements TextWatcher {
        C0196a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1164b(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0197b implements Runnable {
        C0197b() {
        }

        public void run() {
            SearchView.this.mo1183l();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0198c implements Runnable {
        C0198c() {
        }

        public void run() {
            C5090a aVar = SearchView.this.f816W;
            if (aVar instanceof C0265k0) {
                aVar.changeCursor((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0199d implements View.OnFocusChangeListener {
        C0199d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f811R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0200e implements View.OnLayoutChangeListener {
        C0200e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1166d();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0201f implements View.OnClickListener {
        C0201f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f842y) {
                searchView.mo1179h();
            } else if (view == searchView.f794A) {
                searchView.mo1170g();
            } else if (view == searchView.f843z) {
                searchView.mo1180i();
            } else if (view == searchView.f795B) {
                searchView.mo1182k();
            } else if (view == searchView.f837u) {
                searchView.mo1168e();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0202g implements View.OnKeyListener {
        C0202g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f827k0 == null) {
                return false;
            }
            if (searchView.f837u.isPopupShowing() && SearchView.this.f837u.getListSelection() != -1) {
                return SearchView.this.mo1163a(view, i, keyEvent);
            }
            if (SearchView.this.f837u.mo1211b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1159a(0, (String) null, searchView2.f837u.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0203h implements TextView.OnEditorActionListener {
        C0203h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1180i();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0204i implements AdapterView.OnItemClickListener {
        C0204i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1162a(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0205j implements AdapterView.OnItemSelectedListener {
        C0205j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1167d(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0206k {
        /* renamed from: a */
        boolean mo1238a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0207l {
        /* renamed from: a */
        boolean mo1239a(String str);

        /* renamed from: b */
        boolean mo1240b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0208m {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0210o extends TouchDelegate {

        /* renamed from: a */
        private final View f863a;

        /* renamed from: b */
        private final Rect f864b = new Rect();

        /* renamed from: c */
        private final Rect f865c = new Rect();

        /* renamed from: d */
        private final Rect f866d = new Rect();

        /* renamed from: e */
        private final int f867e;

        /* renamed from: f */
        private boolean f868f;

        public C0210o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f867e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1246a(rect, rect2);
            this.f863a = view;
        }

        /* renamed from: a */
        public void mo1246a(Rect rect, Rect rect2) {
            this.f864b.set(rect);
            this.f866d.set(rect);
            Rect rect3 = this.f866d;
            int i = this.f867e;
            rect3.inset(-i, -i);
            this.f865c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f868f
                r7.f868f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f868f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f866d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f864b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f868f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f865c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f863a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f863a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f865c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f863a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0210o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private void m938b(boolean z) {
        this.f815V = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f837u.getText());
        this.f842y.setVisibility(i2);
        m935a(z2);
        this.f839v.setVisibility(z ? 8 : 0);
        if (this.f802I.getDrawable() == null || this.f814U) {
            i = 8;
        }
        this.f802I.setVisibility(i);
        m947q();
        m941c(!z2);
        m950t();
    }

    /* renamed from: c */
    private CharSequence m940c(CharSequence charSequence) {
        if (!this.f814U || this.f803J == null) {
            return charSequence;
        }
        double textSize = (double) this.f837u.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f803J.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f803J), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    private void m942e(int i) {
        Editable text = this.f837u.getText();
        Cursor cursor = this.f816W.getCursor();
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                CharSequence convertToString = this.f816W.convertToString(cursor);
                if (convertToString != null) {
                    setQuery(convertToString);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C4793d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C4793d.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private void m943m() {
        this.f837u.dismissDropDown();
    }

    /* renamed from: n */
    private boolean m944n() {
        SearchableInfo searchableInfo = this.f827k0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f827k0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f806M;
        } else if (this.f827k0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f807N;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m945o() {
        return (this.f817a0 || this.f822f0) && !mo1169f();
    }

    /* renamed from: p */
    private void m946p() {
        post(this.f829m0);
    }

    /* renamed from: q */
    private void m947q() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f837u.getText());
        int i = 0;
        if (!z2 && (!this.f814U || this.f825i0)) {
            z = false;
        }
        ImageView imageView = this.f794A;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f794A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: r */
    private void m948r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f837u;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m940c(queryHint));
    }

    /* renamed from: s */
    private void m949s() {
        this.f837u.setThreshold(this.f827k0.getSuggestThreshold());
        this.f837u.setImeOptions(this.f827k0.getImeOptions());
        int inputType = this.f827k0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f827k0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f837u.setInputType(inputType);
        C5090a aVar = this.f816W;
        if (aVar != null) {
            aVar.changeCursor((Cursor) null);
        }
        if (this.f827k0.getSuggestAuthority() != null) {
            C0265k0 k0Var = new C0265k0(getContext(), this, this.f827k0, this.f831o0);
            this.f816W = k0Var;
            this.f837u.setAdapter(k0Var);
            C0265k0 k0Var2 = (C0265k0) this.f816W;
            if (this.f819c0) {
                i = 2;
            }
            k0Var2.mo1666a(i);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f837u.setText(charSequence);
        this.f837u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m950t() {
        this.f841x.setVisibility((!m945o() || !(this.f843z.getVisibility() == 0 || this.f795B.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo1161a(CharSequence charSequence, boolean z) {
        this.f837u.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f837u;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f824h0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1180i();
        }
    }

    public void clearFocus() {
        this.f820d0 = true;
        super.clearFocus();
        this.f837u.clearFocus();
        this.f837u.setImeVisibility(false);
        this.f820d0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1166d() {
        int i;
        if (this.f796C.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f840w.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0298w0.m1423a(this);
            int dimensionPixelSize = this.f814U ? resources.getDimensionPixelSize(C4793d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C4793d.abc_dropdownitem_text_padding_left) : 0;
            this.f837u.getDropDownBackground().getPadding(rect);
            if (a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f837u.setDropDownHorizontalOffset(i);
            this.f837u.setDropDownWidth((((this.f796C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: f */
    public boolean mo1169f() {
        return this.f815V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1170g() {
        if (!TextUtils.isEmpty(this.f837u.getText())) {
            this.f837u.setText("");
            this.f837u.requestFocus();
            this.f837u.setImeVisibility(true);
        } else if (this.f814U) {
            C0206k kVar = this.f810Q;
            if (kVar == null || !kVar.mo1238a()) {
                clearFocus();
                m938b(true);
            }
        }
    }

    public int getImeOptions() {
        return this.f837u.getImeOptions();
    }

    public int getInputType() {
        return this.f837u.getInputType();
    }

    public int getMaxWidth() {
        return this.f821e0;
    }

    public CharSequence getQuery() {
        return this.f837u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f818b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f827k0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f808O;
        }
        return getContext().getText(this.f827k0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f805L;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f804K;
    }

    public C5090a getSuggestionsAdapter() {
        return this.f816W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1179h() {
        m938b(false);
        this.f837u.requestFocus();
        this.f837u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f813T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1180i() {
        Editable text = this.f837u.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0207l lVar = this.f809P;
            if (lVar == null || !lVar.mo1240b(text.toString())) {
                if (this.f827k0 != null) {
                    mo1159a(0, (String) null, text.toString());
                }
                this.f837u.setImeVisibility(false);
                m943m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1181j() {
        m938b(mo1169f());
        m946p();
        if (this.f837u.hasFocus()) {
            mo1168e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1182k() {
        SearchableInfo searchableInfo = this.f827k0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m937b(this.f806M, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m930a(this.f807N, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1183l() {
        int[] iArr = this.f837u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f840w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f841x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f829m0);
        post(this.f830n0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m934a((View) this.f837u, this.f798E);
            Rect rect = this.f799F;
            Rect rect2 = this.f798E;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0210o oVar = this.f797D;
            if (oVar == null) {
                C0210o oVar2 = new C0210o(this.f799F, this.f798E, this.f837u);
                this.f797D = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.mo1246a(this.f799F, this.f798E);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo1169f()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f821e0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f821e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f821e0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        m938b(savedState.f844h);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f844h = mo1169f();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m946p();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f820d0 || !isFocusable()) {
            return false;
        }
        if (mo1169f()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f837u.requestFocus(i, rect);
        if (requestFocus) {
            m938b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f828l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1170g();
        } else {
            mo1179h();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f814U != z) {
            this.f814U = z;
            m938b(z);
            m948r();
        }
    }

    public void setImeOptions(int i) {
        this.f837u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f837u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f821e0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0206k kVar) {
        this.f810Q = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f811R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0207l lVar) {
        this.f809P = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f813T = onClickListener;
    }

    public void setOnSuggestionListener(C0208m mVar) {
        this.f812S = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f818b0 = charSequence;
        m948r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f819c0 = z;
        C5090a aVar = this.f816W;
        if (aVar instanceof C0265k0) {
            ((C0265k0) aVar).mo1666a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f827k0 = searchableInfo;
        if (searchableInfo != null) {
            m949s();
            m948r();
        }
        boolean n = m944n();
        this.f822f0 = n;
        if (n) {
            this.f837u.setPrivateImeOptions("nm");
        }
        m938b(mo1169f());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f817a0 = z;
        m938b(mo1169f());
    }

    public void setSuggestionsAdapter(C5090a aVar) {
        this.f816W = aVar;
        this.f837u.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.searchViewStyle);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0209n {

        /* renamed from: a */
        private Method f860a = null;

        /* renamed from: b */
        private Method f861b = null;

        /* renamed from: c */
        private Method f862c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0209n() {
            m975a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f860a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f861b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f862c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1243a(AutoCompleteTextView autoCompleteTextView) {
            m975a();
            Method method = this.f861b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1244b(AutoCompleteTextView autoCompleteTextView) {
            m975a();
            Method method = this.f860a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1245c(AutoCompleteTextView autoCompleteTextView) {
            m975a();
            Method method = this.f862c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{true});
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        private static void m975a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f798E = new Rect();
        this.f799F = new Rect();
        this.f800G = new int[2];
        this.f801H = new int[2];
        this.f829m0 = new C0197b();
        this.f830n0 = new C0198c();
        this.f831o0 = new WeakHashMap<>();
        this.f832p0 = new C0201f();
        this.f833q0 = new C0202g();
        this.f834r0 = new C0203h();
        this.f835s0 = new C0204i();
        this.f836t0 = new C0205j();
        this.f838u0 = new C0196a();
        C0278q0 a = C0278q0.m1271a(context, attributeSet, C4799j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo1729g(C4799j.SearchView_layout, C4796g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C4795f.search_src_text);
        this.f837u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f839v = findViewById(C4795f.search_edit_frame);
        this.f840w = findViewById(C4795f.search_plate);
        this.f841x = findViewById(C4795f.submit_area);
        this.f842y = (ImageView) findViewById(C4795f.search_button);
        this.f843z = (ImageView) findViewById(C4795f.search_go_btn);
        this.f794A = (ImageView) findViewById(C4795f.search_close_btn);
        this.f795B = (ImageView) findViewById(C4795f.search_voice_btn);
        this.f802I = (ImageView) findViewById(C4795f.search_mag_icon);
        C5071v.m9161a(this.f840w, a.mo1719b(C4799j.SearchView_queryBackground));
        C5071v.m9161a(this.f841x, a.mo1719b(C4799j.SearchView_submitBackground));
        this.f842y.setImageDrawable(a.mo1719b(C4799j.SearchView_searchIcon));
        this.f843z.setImageDrawable(a.mo1719b(C4799j.SearchView_goIcon));
        this.f794A.setImageDrawable(a.mo1719b(C4799j.SearchView_closeIcon));
        this.f795B.setImageDrawable(a.mo1719b(C4799j.SearchView_voiceIcon));
        this.f802I.setImageDrawable(a.mo1719b(C4799j.SearchView_searchIcon));
        this.f803J = a.mo1719b(C4799j.SearchView_searchHintIcon);
        C0285s0.m1359a(this.f842y, getResources().getString(C4797h.abc_searchview_description_search));
        this.f804K = a.mo1729g(C4799j.SearchView_suggestionRowLayout, C4796g.abc_search_dropdown_item_icons_2line);
        this.f805L = a.mo1729g(C4799j.SearchView_commitIcon, 0);
        this.f842y.setOnClickListener(this.f832p0);
        this.f794A.setOnClickListener(this.f832p0);
        this.f843z.setOnClickListener(this.f832p0);
        this.f795B.setOnClickListener(this.f832p0);
        this.f837u.setOnClickListener(this.f832p0);
        this.f837u.addTextChangedListener(this.f838u0);
        this.f837u.setOnEditorActionListener(this.f834r0);
        this.f837u.setOnItemClickListener(this.f835s0);
        this.f837u.setOnItemSelectedListener(this.f836t0);
        this.f837u.setOnKeyListener(this.f833q0);
        this.f837u.setOnFocusChangeListener(new C0199d());
        setIconifiedByDefault(a.mo1716a(C4799j.SearchView_iconifiedByDefault, true));
        int c = a.mo1721c(C4799j.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f808O = a.mo1726e(C4799j.SearchView_defaultQueryHint);
        this.f818b0 = a.mo1726e(C4799j.SearchView_queryHint);
        int d = a.mo1723d(C4799j.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = a.mo1723d(C4799j.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(a.mo1716a(C4799j.SearchView_android_focusable, true));
        a.mo1720b();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f806M = intent;
        intent.addFlags(268435456);
        this.f806M.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f807N = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f837u.getDropDownAnchor());
        this.f796C = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new C0200e());
        }
        m938b(this.f814U);
        m948r();
    }

    /* renamed from: a */
    private void m934a(View view, Rect rect) {
        view.getLocationInWindow(this.f800G);
        getLocationInWindow(this.f801H);
        int[] iArr = this.f800G;
        int i = iArr[1];
        int[] iArr2 = this.f801H;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: c */
    private void m941c(boolean z) {
        int i = 8;
        if (this.f822f0 && !mo1169f() && z) {
            this.f843z.setVisibility(8);
            i = 0;
        }
        this.f795B.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1168e() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f837u.refreshAutoCompleteResults();
            return;
        }
        f793v0.mo1244b(this.f837u);
        f793v0.mo1243a(this.f837u);
    }

    /* renamed from: a */
    private void m935a(boolean z) {
        this.f843z.setVisibility((!this.f817a0 || !m945o() || !hasFocus() || (!z && this.f822f0)) ? 8 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1164b(CharSequence charSequence) {
        Editable text = this.f837u.getText();
        this.f824h0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m935a(z);
        m941c(!z);
        m947q();
        m950t();
        if (this.f809P != null && !TextUtils.equals(charSequence, this.f823g0)) {
            this.f809P.mo1239a(charSequence.toString());
        }
        this.f823g0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1160a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1163a(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f827k0 != null && this.f816W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1162a(this.f837u.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f837u.length();
                }
                this.f837u.setSelection(i2);
                this.f837u.setListSelection(0);
                this.f837u.clearListSelection();
                this.f837u.mo1210a();
                return true;
            } else if (i != 19 || this.f837u.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1167d(int i) {
        C0208m mVar = this.f812S;
        if (mVar != null && mVar.onSuggestionSelect(i)) {
            return false;
        }
        m942e(i);
        return true;
    }

    /* renamed from: b */
    public void mo811b() {
        mo1161a((CharSequence) "", false);
        clearFocus();
        m938b(true);
        this.f837u.setImeOptions(this.f826j0);
        this.f825i0 = false;
    }

    /* renamed from: a */
    public void mo810a() {
        if (!this.f825i0) {
            this.f825i0 = true;
            int imeOptions = this.f837u.getImeOptions();
            this.f826j0 = imeOptions;
            this.f837u.setImeOptions(imeOptions | 33554432);
            this.f837u.setText("");
            setIconified(false);
        }
    }

    /* renamed from: b */
    private boolean m939b(int i, int i2, String str) {
        Cursor cursor = this.f816W.getCursor();
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        m933a(m931a(cursor, i2, str));
        return true;
    }

    /* renamed from: b */
    private Intent m937b(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1162a(int i, int i2, String str) {
        C0208m mVar = this.f812S;
        if (mVar != null && mVar.onSuggestionClick(i)) {
            return false;
        }
        m939b(i, 0, (String) null);
        this.f837u.setImeVisibility(false);
        m943m();
        return true;
    }

    /* renamed from: a */
    private void m933a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1159a(int i, String str, String str2) {
        getContext().startActivity(m932a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* renamed from: a */
    private Intent m932a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f824h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f828l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f827k0.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private Intent m930a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f828l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m931a(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String a;
        try {
            String a2 = C0265k0.m1225a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.f827k0.getSuggestIntentAction();
            }
            if (a2 == null) {
                a2 = "android.intent.action.SEARCH";
            }
            String str2 = a2;
            String a3 = C0265k0.m1225a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.f827k0.getSuggestIntentData();
            }
            if (!(a3 == null || (a = C0265k0.m1225a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            if (a3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(a3);
            }
            return m932a(str2, uri, C0265k0.m1225a(cursor, "suggest_intent_extra_data"), C0265k0.m1225a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m936a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
