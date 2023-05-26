package p015cm.aptoide.p016pt.account.view.magiclink;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.common.NonbreakingSpan;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.fragment.BaseToolbarFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001eH\u0014J\u0012\u0010'\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010,\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020\u001aH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00061"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailFragment;", "Lcm/aptoide/pt/view/fragment/BaseToolbarFragment;", "Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailView;", "Lcm/aptoide/pt/view/NotBottomNavigationView;", "()V", "email", "", "openEmailAppButton", "Landroid/widget/Button;", "getOpenEmailAppButton", "()Landroid/widget/Button;", "setOpenEmailAppButton", "(Landroid/widget/Button;)V", "openEmailBody", "Landroid/widget/TextView;", "getOpenEmailBody", "()Landroid/widget/TextView;", "setOpenEmailBody", "(Landroid/widget/TextView;)V", "presenter", "Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailPresenter;", "getPresenter", "()Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailPresenter;", "setPresenter", "(Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailPresenter;)V", "bindViews", "", "view", "Landroid/view/View;", "displayHomeUpAsEnabled", "", "getCheckYourEmailClick", "Lrx/Observable;", "Ljava/lang/Void;", "getContentViewId", "", "getHistoryTracker", "Lcm/aptoide/analytics/implementation/navigation/ScreenTagHistory;", "hasToolbar", "loadExtras", "args", "Landroid/os/Bundle;", "onCreate", "savedInstanceState", "setupToolbarDetails", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "setupViews", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.CheckYourEmailFragment */
/* compiled from: CheckYourEmailFragment.kt */
public final class CheckYourEmailFragment extends BaseToolbarFragment implements CheckYourEmailView, NotBottomNavigationView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EMAIL = "email";
    private HashMap _$_findViewCache;
    private String email;
    public Button openEmailAppButton;
    public TextView openEmailBody;
    @Inject
    public CheckYourEmailPresenter presenter;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailFragment$Companion;", "", "()V", "EMAIL", "", "newInstance", "Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailFragment;", "email", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.account.view.magiclink.CheckYourEmailFragment$Companion */
    /* compiled from: CheckYourEmailFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public final CheckYourEmailFragment newInstance(String str) {
            C10202j.m34178b(str, CheckYourEmailFragment.EMAIL);
            CheckYourEmailFragment checkYourEmailFragment = new CheckYourEmailFragment();
            Bundle bundle = new Bundle();
            bundle.putString(CheckYourEmailFragment.EMAIL, str);
            checkYourEmailFragment.setArguments(bundle);
            return checkYourEmailFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
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
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void bindViews(View view) {
        super.bindViews(view);
        if (view != null) {
            View findViewById = view.findViewById(C1086R.C1088id.open_email_app_button);
            C10202j.m34174a((Object) findViewById, "v.findViewById(R.id.open_email_app_button)");
            this.openEmailAppButton = (Button) findViewById;
            View findViewById2 = view.findViewById(C1086R.C1088id.check_your_email_body_text);
            C10202j.m34174a((Object) findViewById2, "v.findViewById(R.id.check_your_email_body_text)");
            this.openEmailBody = (TextView) findViewById2;
            String str = this.email;
            if (str != null) {
                String string = getString(C1086R.string.login_check_email_body, str);
                C10202j.m34174a((Object) string, "getString(R.string.login_check_email_body, e)");
                SpannableString spannableString = new SpannableString(string);
                String str2 = string;
                String str3 = str;
                spannableString.setSpan(new NonbreakingSpan(), C12131w.m40064a((CharSequence) str2, str3, 0, false, 6, (Object) null), C12131w.m40064a((CharSequence) str2, str3, 0, false, 6, (Object) null) + str.length(), 33);
                TextView textView = this.openEmailBody;
                if (textView != null) {
                    textView.setText(spannableString);
                } else {
                    C10202j.m34181d("openEmailBody");
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public C5368e<Void> getCheckYourEmailClick() {
        Button button = this.openEmailAppButton;
        if (button != null) {
            C5368e<Void> a = C10695a.m36221a(button);
            C10202j.m34174a((Object) a, "RxView.clicks(openEmailAppButton)");
            return a;
        }
        C10202j.m34181d("openEmailAppButton");
        throw null;
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_check_your_email;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(CheckYourEmailFragment.class.getSimpleName());
    }

    public final Button getOpenEmailAppButton() {
        Button button = this.openEmailAppButton;
        if (button != null) {
            return button;
        }
        C10202j.m34181d("openEmailAppButton");
        throw null;
    }

    public final TextView getOpenEmailBody() {
        TextView textView = this.openEmailBody;
        if (textView != null) {
            return textView;
        }
        C10202j.m34181d("openEmailBody");
        throw null;
    }

    public final CheckYourEmailPresenter getPresenter() {
        CheckYourEmailPresenter checkYourEmailPresenter = this.presenter;
        if (checkYourEmailPresenter != null) {
            return checkYourEmailPresenter;
        }
        C10202j.m34181d("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean hasToolbar() {
        return true;
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.email = bundle != null ? bundle.getString(EMAIL) : null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        setHasOptionsMenu(true);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void setOpenEmailAppButton(Button button) {
        C10202j.m34178b(button, "<set-?>");
        this.openEmailAppButton = button;
    }

    public final void setOpenEmailBody(TextView textView) {
        C10202j.m34178b(textView, "<set-?>");
        this.openEmailBody = textView;
    }

    public final void setPresenter(CheckYourEmailPresenter checkYourEmailPresenter) {
        C10202j.m34178b(checkYourEmailPresenter, "<set-?>");
        this.presenter = checkYourEmailPresenter;
    }

    /* access modifiers changed from: protected */
    public void setupToolbarDetails(Toolbar toolbar) {
        if (toolbar != null) {
            toolbar.setTitle((CharSequence) "");
        }
    }

    public void setupViews() {
        super.setupViews();
        CheckYourEmailPresenter checkYourEmailPresenter = this.presenter;
        if (checkYourEmailPresenter != null) {
            attachPresenter(checkYourEmailPresenter);
        } else {
            C10202j.m34181d("presenter");
            throw null;
        }
    }
}
