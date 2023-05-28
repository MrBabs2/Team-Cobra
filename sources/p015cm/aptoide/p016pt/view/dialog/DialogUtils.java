package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.PostReviewRequest;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;
import retrofit2.Converter;

@Deprecated
/* renamed from: cm.aptoide.pt.view.dialog.DialogUtils */
public class DialogUtils {
    private static final String TAG = "DialogUtils";
    private final Locale LOCALE = Locale.getDefault();
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final MarketResourceFormatter marketResourceFormatter;
    private final SharedPreferences sharedPreferences;
    private final ThemeManager themeManager;
    private final TokenInvalidator tokenInvalidator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;

    public DialogUtils(AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator2, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, MarketResourceFormatter marketResourceFormatter2, ThemeManager themeManager2, UserFeedbackAnalytics userFeedbackAnalytics2) {
        this.accountManager = aptoideAccountManager;
        this.accountNavigator = accountNavigator2;
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.marketResourceFormatter = marketResourceFormatter2;
        this.themeManager = themeManager2;
        this.userFeedbackAnalytics = userFeedbackAnalytics2;
    }

    private boolean isAppInstalled(String str) {
        return this.aptoideInstalledAppsRepository.contains(str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15546a(Activity activity, String str, String str2, String str3, C12475j jVar) {
        Activity activity2 = activity;
        C12475j jVar2 = jVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity2, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
        if (!this.accountManager.isLoggedIn()) {
            ShowMessage.asSnack(activity2, (int) C1086R.string.you_need_to_be_logged_in, (int) C1086R.string.login, (View.OnClickListener) new C4605e(this), -1);
            jVar2.onNext(GenericDialogs.EResponse.CANCEL);
            jVar.onCompleted();
            return;
        }
        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(C1086R.layout.dialog_rate_app, (ViewGroup) null);
        AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) inflate.findViewById(C1086R.C1088id.rating_bar);
        Locale locale = this.LOCALE;
        String string = activity2.getString(C1086R.string.rate_app);
        TextView textView = (TextView) inflate.findViewById(C1086R.C1088id.highlighted_reviews_explanation_4);
        ((TextView) inflate.findViewById(C1086R.C1088id.title)).setText(String.format(locale, string, new Object[]{str}));
        AlertDialog create = new AlertDialog.Builder(contextThemeWrapper).setView(inflate).create();
        jVar2.add(C12889e.m41501a(new C4602b(create)));
        ((Button) inflate.findViewById(C1086R.C1088id.cancel_button)).setOnClickListener(new C4608h(jVar2));
        appCompatRatingBar.setOnRatingBarChangeListener(new C4604d(inflate, activity2));
        C4614n nVar = r0;
        TextView textView2 = textView;
        TextView textView3 = textView2;
        TextView textView4 = (TextView) inflate.findViewById(C1086R.C1088id.highlighted_reviews_explanation_3);
        C4614n nVar2 = new C4614n(this, activity, (TextInputLayout) inflate.findViewById(C1086R.C1088id.input_layout_review), appCompatRatingBar, inflate, create, jVar, str2, str3);
        ((Button) inflate.findViewById(C1086R.C1088id.rate_button)).setOnClickListener(nVar);
        ((TextView) inflate.findViewById(C1086R.C1088id.highlighted_reviews_explanation_1)).setText(activity.getResources().getString(C1086R.string.reviewappview_highlighted_reviews_explanation_1));
        setBulletText((TextView) inflate.findViewById(C1086R.C1088id.highlighted_reviews_explanation_2), activity.getResources().getString(C1086R.string.reviewappview_highlighted_reviews_explanation_2));
        setBulletText(textView4, activity.getResources().getString(C1086R.string.reviewappview_highlighted_reviews_explanation_3));
        setBulletText(textView3, this.marketResourceFormatter.formatString(inflate.getContext(), C1086R.string.reviewappview_highlighted_reviews_explanation_4, new String[0]));
        create.show();
    }

    /* renamed from: b */
    public /* synthetic */ void mo15550b(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.RATE_DIALOG);
    }

    public void setBulletText(TextView textView, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new BulletSpan(16, this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimaryDark).data), 0, str.length(), 0);
        textView.setText(spannableString);
    }

    public C5368e<GenericDialogs.EResponse> showRateDialog(Activity activity, String str, String str2, String str3) {
        return C5368e.m10241a(new C4613m(this, activity, str, str3, str2));
    }

    public void showRateDialog(Activity activity, String str, String str2, String str3, C5377a aVar) {
        Activity activity2 = activity;
        if (!this.accountManager.isLoggedIn()) {
            ShowMessage.asSnack(activity, (int) C1086R.string.you_need_to_be_logged_in, (int) C1086R.string.login, (View.OnClickListener) new C4607g(this), -1);
            return;
        }
        View inflate = LayoutInflater.from(activity).inflate(C1086R.layout.dialog_rate_app, (ViewGroup) null);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C1086R.C1088id.input_layout_review);
        ((TextView) inflate.findViewById(C1086R.C1088id.title)).setText(String.format(this.LOCALE, activity.getString(C1086R.string.rate_app), new Object[]{str}));
        AlertDialog create = new AlertDialog.Builder(activity).setView(inflate).create();
        ((Button) inflate.findViewById(C1086R.C1088id.cancel_button)).setOnClickListener(new C4609i(create));
        ((Button) inflate.findViewById(C1086R.C1088id.rate_button)).setOnClickListener(new C4603c(this, activity, textInputLayout, (AppCompatRatingBar) inflate.findViewById(C1086R.C1088id.rating_bar), create, aVar, str3, str2));
        create.show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15549a(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.RATE_DIALOG);
    }

    /* renamed from: a */
    static /* synthetic */ void m7633a(AlertDialog alertDialog) {
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7636a(C12475j jVar, View view) {
        jVar.onNext(GenericDialogs.EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15545a(Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, View view, AlertDialog alertDialog, C12475j jVar, String str, String str2, View view2) {
        Activity activity2 = activity;
        C12475j jVar2 = jVar;
        String str3 = str2;
        AptoideUtils.SystemU.hideKeyboard(activity);
        String obj = textInputLayout.getEditText().getText().toString();
        int round = Math.round(appCompatRatingBar.getRating());
        if (round == 0) {
            ((TextView) view.findViewById(C1086R.C1088id.tap_to_rate)).setTextColor(activity.getResources().getColor(C1086R.color.red));
            ShowMessage.asSnack(activity, "Please choose a rating");
            return;
        }
        alertDialog.dismiss();
        this.userFeedbackAnalytics.sendSubmitAppRateEvent(!obj.isEmpty());
        C4611k kVar = new C4611k(this, activity, jVar2);
        C4610j jVar3 = new C4610j(activity, jVar2);
        if (str != null) {
            PostReviewRequest.m5270of(str, str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str3), this.tokenInvalidator, this.sharedPreferences).execute(kVar, (ErrorRequestListener) jVar3);
            return;
        }
        PostReviewRequest.m5269of(str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str3), this.tokenInvalidator, this.sharedPreferences).execute(kVar, (ErrorRequestListener) jVar3);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15547a(Activity activity, C12475j jVar, BaseV7Response baseV7Response) {
        if (baseV7Response.isOk()) {
            Logger.getInstance().mo12975d(TAG, "review added");
            ShowMessage.asSnack(activity, (int) C1086R.string.review_success);
            ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
            jVar.onNext(GenericDialogs.EResponse.YES);
            jVar.onCompleted();
            return;
        }
        ShowMessage.asSnack(activity, (int) C1086R.string.error_occured);
        jVar.onNext(GenericDialogs.EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: a */
    static /* synthetic */ void m7632a(Activity activity, C12475j jVar, Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(activity, (int) C1086R.string.error_occured);
        jVar.onNext(GenericDialogs.EResponse.CANCEL);
        jVar.onCompleted();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15544a(Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, AlertDialog alertDialog, C5377a aVar, String str, String str2, View view) {
        Activity activity2 = activity;
        String str3 = str2;
        AptoideUtils.SystemU.hideKeyboard(activity);
        String obj = textInputLayout.getEditText().getText().toString();
        int round = Math.round(appCompatRatingBar.getRating());
        alertDialog.dismiss();
        C4606f fVar = new C4606f(this, activity, aVar);
        C4612l lVar = new C4612l(activity);
        if (str != null) {
            PostReviewRequest.m5270of(str, str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str3), this.tokenInvalidator, this.sharedPreferences).execute(fVar, (ErrorRequestListener) lVar);
            return;
        }
        PostReviewRequest.m5269of(str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str3), this.tokenInvalidator, this.sharedPreferences).execute(fVar, (ErrorRequestListener) lVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15548a(Activity activity, C5377a aVar, BaseV7Response baseV7Response) {
        if (baseV7Response.isOk()) {
            Logger.getInstance().mo12975d(TAG, "review added");
            ShowMessage.asSnack(activity, (int) C1086R.string.review_success);
            ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
            if (aVar != null) {
                aVar.call();
                return;
            }
            return;
        }
        ShowMessage.asSnack(activity, (int) C1086R.string.error_occured);
    }

    /* renamed from: a */
    static /* synthetic */ void m7631a(Activity activity, Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(activity, (int) C1086R.string.error_occured);
    }
}
