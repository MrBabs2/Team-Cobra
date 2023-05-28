package p015cm.aptoide.aptoideviews.login;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p112n.p118g.p301a.p310c.C10695a;
import p112n.p118g.p301a.p311d.C10707a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\fJ\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentState", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", "getEmailChangeEvent", "Lrx/Observable;", "", "getMagicLinkSubmit", "getSecureLoginTextClick", "Ljava/lang/Void;", "resetTextFieldError", "", "setErrorState", "message", "textFieldError", "", "setInitialState", "setState", "state", "setupViews", "State", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.login.SendMagicLinkView */
/* compiled from: SendMagicLinkView.kt */
public final class SendMagicLinkView extends FrameLayout {
    private HashMap _$_findViewCache;
    private State currentState;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", "", "()V", "Error", "Initial", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Initial;", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Error;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.login.SendMagicLinkView$State */
    /* compiled from: SendMagicLinkView.kt */
    public static abstract class State {

        @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Error;", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", "message", "", "isTextFieldError", "", "(Ljava/lang/String;Z)V", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
        /* renamed from: cm.aptoide.aptoideviews.login.SendMagicLinkView$State$Error */
        /* compiled from: SendMagicLinkView.kt */
        public static final class Error extends State {
            private final boolean isTextFieldError;
            private final String message;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(String str, boolean z) {
                super((DefaultConstructorMarker) null);
                C10202j.m34178b(str, "message");
                this.message = str;
                this.isTextFieldError = z;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                if ((i & 2) != 0) {
                    z = error.isTextFieldError;
                }
                return error.copy(str, z);
            }

            public final String component1() {
                return this.message;
            }

            public final boolean component2() {
                return this.isTextFieldError;
            }

            public final Error copy(String str, boolean z) {
                C10202j.m34178b(str, "message");
                return new Error(str, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return C10202j.m34176a((Object) this.message, (Object) error.message) && this.isTextFieldError == error.isTextFieldError;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                boolean z = this.isTextFieldError;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            public final boolean isTextFieldError() {
                return this.isTextFieldError;
            }

            public String toString() {
                return "Error(message=" + this.message + ", isTextFieldError=" + this.isTextFieldError + ")";
            }
        }

        @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State$Initial;", "Lcm/aptoide/aptoideviews/login/SendMagicLinkView$State;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
        /* renamed from: cm.aptoide.aptoideviews.login.SendMagicLinkView$State$Initial */
        /* compiled from: SendMagicLinkView.kt */
        public static final class Initial extends State {
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super((DefaultConstructorMarker) null);
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SendMagicLinkView(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    private final void setErrorState(String str, boolean z) {
        TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.tip);
        C10202j.m34174a((Object) textView, "tip");
        textView.setVisibility(8);
        TextView textView2 = (TextView) _$_findCachedViewById(C1033R.C1035id.tip_error);
        C10202j.m34174a((Object) textView2, "tip_error");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) _$_findCachedViewById(C1033R.C1035id.tip_error);
        C10202j.m34174a((Object) textView3, "tip_error");
        textView3.setText(str);
        if (z) {
            ((AutoCompleteTextView) _$_findCachedViewById(C1033R.C1035id.email)).setTextAppearance(getContext(), C1033R.style.Aptoide_TextView_Regular_S_OrangeGradientEnd);
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            C10202j.m34174a((Object) context, "context");
            context.getTheme().resolveAttribute(C1033R.attr.loginInputErrorBackground, typedValue, true);
            ((AutoCompleteTextView) _$_findCachedViewById(C1033R.C1035id.email)).setBackgroundResource(typedValue.resourceId);
        }
    }

    private final void setInitialState() {
        TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.tip);
        C10202j.m34174a((Object) textView, "tip");
        textView.setVisibility(0);
        TextView textView2 = (TextView) _$_findCachedViewById(C1033R.C1035id.tip_error);
        C10202j.m34174a((Object) textView2, "tip_error");
        textView2.setVisibility(8);
        ((AutoCompleteTextView) _$_findCachedViewById(C1033R.C1035id.email)).setTextAppearance(getContext(), C1033R.style.Aptoide_TextView_Regular_S_Primary);
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        C10202j.m34174a((Object) context, "context");
        context.getTheme().resolveAttribute(C1033R.attr.loginInputBackground, typedValue, true);
        ((AutoCompleteTextView) _$_findCachedViewById(C1033R.C1035id.email)).setBackgroundResource(typedValue.resourceId);
    }

    private final void setupViews() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(getContext().getText(C1033R.string.login_safe_body_1));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append(" - ");
        spannableStringBuilder.append(getContext().getText(C1033R.string.login_safe_body_2));
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.login_benefits_textview);
        C10202j.m34174a((Object) textView, "login_benefits_textview");
        textView.setText(spannedString);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C5368e<String> getEmailChangeEvent() {
        C5368e<R> j = C10707a.m36230b((AutoCompleteTextView) _$_findCachedViewById(C1033R.C1035id.email)).mo18694j(new SendMagicLinkView$getEmailChangeEvent$1(this));
        C10202j.m34174a((Object) j, "RxTextView.textChangeEve…{ email.text.toString() }");
        return j;
    }

    public final C5368e<String> getMagicLinkSubmit() {
        C5368e<R> j = C10695a.m36221a((Button) _$_findCachedViewById(C1033R.C1035id.send_magic_link_button)).mo18694j(new SendMagicLinkView$getMagicLinkSubmit$1(this));
        C10202j.m34174a((Object) j, "RxView.clicks(send_magic…{ email.text.toString() }");
        return j;
    }

    public final C5368e<Void> getSecureLoginTextClick() {
        C5368e<Void> a = C10695a.m36221a((TextView) _$_findCachedViewById(C1033R.C1035id.login_benefits_textview));
        C10202j.m34174a((Object) a, "RxView.clicks(login_benefits_textview)");
        return a;
    }

    public final void resetTextFieldError() {
        State state = this.currentState;
        if (state != null && (state instanceof State.Error) && ((State.Error) state).isTextFieldError()) {
            setState(State.Initial.INSTANCE);
        }
    }

    public final void setState(State state) {
        C10202j.m34178b(state, "state");
        if (C10202j.m34176a((Object) state, (Object) State.Initial.INSTANCE)) {
            setInitialState();
        } else if (state instanceof State.Error) {
            State.Error error = (State.Error) state;
            setErrorState(error.getMessage(), error.isTextFieldError());
        }
        this.currentState = state;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SendMagicLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendMagicLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        FrameLayout.inflate(context, C1033R.layout.send_magic_link_layout, this);
        setupViews();
        setSaveEnabled(true);
    }
}
