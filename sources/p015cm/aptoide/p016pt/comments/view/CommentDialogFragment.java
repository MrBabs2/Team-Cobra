package p015cm.aptoide.p016pt.comments.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputLayout;
import com.trello.rxlifecycle.p209g.C9008b;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.comments.CommentDialogCallbackContract;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.PostCommentForReview;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.PostCommentForStore;
import p015cm.aptoide.p016pt.dataprovider.util.CommentType;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.comments.view.CommentDialogFragment */
public class CommentDialogFragment extends BaseDialogFragment {
    private static final String APP_OR_STORE_NAME = "app_or_store_name";
    private static final String COMMENT_TYPE = "comment_type";
    private static final String PREVIOUS_COMMENT_ID = "previous_comment_id";
    private static final String RESOURCE_ID_AS_LONG = "resource_id_as_long";
    private static final String RESOURCE_ID_AS_STRING = "resource_id_as_string";
    private AnalyticsManager analyticsManager;
    private String appOrStoreName;
    private BodyInterceptor<BaseBody> baseBodyBodyInterceptor;
    private Button commentButton;
    private CommentDialogCallbackContract commentDialogCallbackContract;
    private CommentType commentType;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private long idAsLong;
    private String idAsString;
    private NavigationTracker navigationTracker;
    private String onEmptyTextError;
    private Long previousCommentId;
    private SharedPreferences sharedPreferences;
    private StoreAnalytics storeAnalytics;
    private TextInputLayout textInputLayout;
    private TokenInvalidator tokenInvalidator;
    @Inject
    UserFeedbackAnalytics userFeedbackAnalytics;

    /* renamed from: cm.aptoide.pt.comments.view.CommentDialogFragment$2 */
    static /* synthetic */ class C19612 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.dataprovider.util.CommentType[] r0 = p015cm.aptoide.p016pt.dataprovider.util.CommentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType = r0
                cm.aptoide.pt.dataprovider.util.CommentType r1 = p015cm.aptoide.p016pt.dataprovider.util.CommentType.REVIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.util.CommentType r1 = p015cm.aptoide.p016pt.dataprovider.util.CommentType.STORE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.comments.view.CommentDialogFragment.C19612.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void disableError() {
        this.textInputLayout.setErrorEnabled(false);
    }

    private void enableError(String str) {
        this.textInputLayout.setError(str);
    }

    private String getText() {
        TextInputLayout textInputLayout2 = this.textInputLayout;
        if (textInputLayout2 != null) {
            return textInputLayout2.getEditText().getEditableText().toString();
        }
        return null;
    }

    private void loadArguments() {
        Bundle arguments = getArguments();
        this.appOrStoreName = arguments.getString(APP_OR_STORE_NAME, "");
        this.commentType = CommentType.valueOf(arguments.getString(COMMENT_TYPE));
        this.idAsString = arguments.getString(RESOURCE_ID_AS_STRING);
        this.idAsLong = arguments.getLong(RESOURCE_ID_AS_LONG);
        if (arguments.containsKey(PREVIOUS_COMMENT_ID)) {
            this.previousCommentId = Long.valueOf(arguments.getLong(PREVIOUS_COMMENT_ID));
        }
    }

    public static CommentDialogFragment newInstanceReviewReply(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(COMMENT_TYPE, CommentType.REVIEW.name());
        bundle.putLong(RESOURCE_ID_AS_LONG, j);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(APP_OR_STORE_NAME, str);
        }
        CommentDialogFragment commentDialogFragment = new CommentDialogFragment();
        commentDialogFragment.setArguments(bundle);
        return commentDialogFragment;
    }

    public static CommentDialogFragment newInstanceStoreComment(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(COMMENT_TYPE, CommentType.STORE.name());
        bundle.putLong(RESOURCE_ID_AS_LONG, j);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(APP_OR_STORE_NAME, str);
        }
        CommentDialogFragment commentDialogFragment = new CommentDialogFragment();
        commentDialogFragment.setArguments(bundle);
        return commentDialogFragment;
    }

    public static CommentDialogFragment newInstanceStoreCommentReply(long j, long j2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(COMMENT_TYPE, CommentType.STORE.name());
        bundle.putLong(RESOURCE_ID_AS_LONG, j);
        bundle.putLong(PREVIOUS_COMMENT_ID, j2);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(APP_OR_STORE_NAME, str);
        }
        CommentDialogFragment commentDialogFragment = new CommentDialogFragment();
        commentDialogFragment.setArguments(bundle);
        return commentDialogFragment;
    }

    private void setupLogic() {
        this.textInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() > 0) {
                    CommentDialogFragment.this.disableError();
                }
            }
        });
        C10695a.m36221a(this.commentButton).mo18687f(new C1965b(this)).mo18681d(new C1974e(this)).mo18687f(new C1968c(this)).mo18655a(new C1977f(this), (C5378b<Throwable>) C1980g.f4596f);
    }

    private C5368e<? extends BaseV7Response> submitComment(String str, long j, Long l) {
        int i = C19612.$SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType[this.commentType.ordinal()];
        if (i == 1) {
            this.userFeedbackAnalytics.sendAppReviewReplyComment();
            return PostCommentForReview.m5268of(j, str, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
        } else if (i != 2) {
            Logger.getInstance().mo12979e(getTag(), "Unable to create reply due to missing comment type");
            return C5368e.m10265n();
        } else if (l == null) {
            this.userFeedbackAnalytics.sendStoreCommentEvent();
            this.storeAnalytics.sendStoreInteractEvent("Write a Comment", "Home", this.appOrStoreName);
            return PostCommentForStore.m5378of(j, str, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
        } else {
            this.userFeedbackAnalytics.sendStoreCommentReplyEvent();
            this.storeAnalytics.sendStoreInteractEvent("Reply to Comment", "Home", this.appOrStoreName);
            return PostCommentForStore.m5377of(j, l.longValue(), str, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo7920a(View view) {
        dismiss();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo7923b(String str) {
        return submitComment(str, this.idAsLong, this.previousCommentId).mo18644a(C5376a.m10346b()).mo18649a((C5378b<? super Throwable>) new C1971d(this)).mo18686f().mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
        this.baseBodyBodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.onEmptyTextError = AptoideUtils.StringU.getResString(C1086R.string.ws_error_MARG_107, getContext().getResources());
        this.analyticsManager = aptoideApplication.getAnalyticsManager();
        this.navigationTracker = aptoideApplication.getNavigationTracker();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        loadArguments();
        View inflate = layoutInflater.inflate(C1086R.layout.dialog_comment_on_review, viewGroup);
        TextView textView = (TextView) inflate.findViewById(C1086R.C1088id.title);
        textView.setVisibility(0);
        int i = C19612.$SwitchMap$cm$aptoide$pt$dataprovider$util$CommentType[this.commentType.ordinal()];
        if (i == 1) {
            textView.setText(getString(C1086R.string.dialog_title_comment));
        } else if (i == 2) {
            if (TextUtils.isEmpty(this.appOrStoreName)) {
                str = getString(C1086R.string.comment_store_title);
            } else {
                str = getString(C1086R.string.commentlist_title_comment_on_store, this.appOrStoreName);
            }
            textView.setText(str);
        }
        ((Button) inflate.findViewById(C1086R.C1088id.cancel_button)).setOnClickListener(new C1962a(this));
        this.textInputLayout = (TextInputLayout) inflate.findViewById(C1086R.C1088id.input_layout_title);
        this.commentButton = (Button) inflate.findViewById(C1086R.C1088id.comment_button);
        setupLogic();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        return inflate;
    }

    public void setCommentDialogCallbackContract(CommentDialogCallbackContract commentDialogCallbackContract2) {
        this.commentDialogCallbackContract = commentDialogCallbackContract2;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7919a(Void voidR) {
        return C5368e.m10257c(getText());
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo7918a(String str) {
        if (TextUtils.isEmpty(str)) {
            enableError(this.onEmptyTextError);
            return false;
        }
        disableError();
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo7922a(Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack((Fragment) this, (int) C1086R.string.error_occured);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7921a(BaseV7Response baseV7Response) {
        if (baseV7Response.isOk()) {
            dismiss();
            CommentDialogCallbackContract commentDialogCallbackContract2 = this.commentDialogCallbackContract;
            if (commentDialogCallbackContract2 != null) {
                commentDialogCallbackContract2.okSelected(baseV7Response, this.idAsLong, this.previousCommentId, this.idAsString);
                return;
            }
            return;
        }
        ShowMessage.asSnack((Fragment) this, (int) C1086R.string.error_occured);
    }
}
