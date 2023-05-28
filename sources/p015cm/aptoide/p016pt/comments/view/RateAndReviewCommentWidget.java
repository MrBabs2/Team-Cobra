package p015cm.aptoide.p016pt.comments.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.C0462h;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.comments.CommentAdder;
import p015cm.aptoide.p016pt.comments.ReviewWithAppName;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListCommentsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetReviewRatingRequest;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.comments.view.RateAndReviewCommentWidget */
public class RateAndReviewCommentWidget extends Widget<RateAndReviewCommentDisplayable> {
    private static final int FULL_COMMENTS_LIMIT = 3;
    private static final String TAG = "RateAndReviewCommentWidget";
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private ImageView helpfulButton;
    private OkHttpClient httpClient;
    private boolean isCommentsCollapsed = false;
    private ImageView notHelpfulButton;
    private AppCompatRatingBar ratingBar;
    private TextView reply;
    private TextView reviewDate;
    private TextView reviewText;
    private TextView reviewTitle;
    private TextView showHideReplies;
    private TokenInvalidator tokenInvalidator;
    private ImageView userImage;
    private TextView username;

    public RateAndReviewCommentWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    static /* synthetic */ void m5122a(Object obj) {
    }

    /* renamed from: a */
    static /* synthetic */ void m5123a(Void voidR) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5126b(Void voidR) {
    }

    private void loadCommentsForThisReview(long j, int i, CommentAdder commentAdder) {
        ListCommentsRequest.m5260of(j, i, true, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).execute(new C2015t0(this, commentAdder), new C2013s0(this), true);
    }

    private void setHelpButtonsClickable(boolean z) {
        this.notHelpfulButton.setClickable(z);
        this.helpfulButton.setClickable(z);
    }

    private void setReviewRating(long j, boolean z) {
        setHelpButtonsClickable(false);
        if (this.accountManager.isLoggedIn()) {
            SetReviewRatingRequest.m5271of(j, z, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).execute(new C1984h0(this, j, z), new C2011r0(this), true);
            return;
        }
        ShowMessage.asSnack((Activity) getContext(), (int) C1086R.string.you_need_to_be_logged_in, (int) C1086R.string.login, (View.OnClickListener) new C2021w0(this), -1);
        setHelpButtonsClickable(true);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7962a(C0456c cVar, Review review, String str, CommentAdder commentAdder, long j, Void voidR) {
        if (!this.accountManager.isLoggedIn()) {
            return ShowMessage.asObservableSnack((View) this.ratingBar, (int) C1086R.string.you_need_to_be_logged_in, (int) C1086R.string.login, (View.OnClickListener) new C1981g0(this)).mo18610e();
        }
        C0462h supportFragmentManager = cVar.getSupportFragmentManager();
        CommentDialogFragment newInstanceReviewReply = CommentDialogFragment.newInstanceReviewReply(review.getId(), str);
        newInstanceReviewReply.show(supportFragmentManager, "fragment_comment_dialog");
        return newInstanceReviewReply.lifecycle().mo18681d(C1978f0.f4594f).mo18664b(new C2007p0(this, commentAdder, j)).mo18687f(C1996l0.f4628f);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.reply = (TextView) view.findViewById(C1086R.C1088id.write_reply_btn);
        this.showHideReplies = (TextView) view.findViewById(C1086R.C1088id.show_replies_btn);
        this.ratingBar = (AppCompatRatingBar) view.findViewById(C1086R.C1088id.rating_bar);
        this.reviewTitle = (TextView) view.findViewById(C1086R.C1088id.comment_title);
        this.reviewDate = (TextView) view.findViewById(C1086R.C1088id.added_date);
        this.reviewText = (TextView) view.findViewById(C1086R.C1088id.comment);
        this.userImage = (ImageView) view.findViewById(C1086R.C1088id.user_icon);
        this.username = (TextView) view.findViewById(C1086R.C1088id.user_name);
        this.helpfulButton = (ImageView) view.findViewById(C1086R.C1088id.helpful_button);
        this.notHelpfulButton = (ImageView) view.findViewById(C1086R.C1088id.not_helpful_button);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7971b(Review review, Void voidR) {
        setReviewRating(review.getId(), true);
    }

    public void bindView(RateAndReviewCommentDisplayable rateAndReviewCommentDisplayable, int i) {
        Review review = ((ReviewWithAppName) rateAndReviewCommentDisplayable.getPojo()).getReview();
        String appName = ((ReviewWithAppName) rateAndReviewCommentDisplayable.getPojo()).getAppName();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.bodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        C0456c context = getContext();
        ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(review.getUser().getAvatar(), this.userImage, C1086R.C1087drawable.layer_1);
        this.username.setText(review.getUser().getName());
        this.ratingBar.setRating(review.getStats().getRating());
        this.reviewTitle.setText(review.getTitle());
        this.reviewText.setText(review.getBody());
        this.reviewDate.setText(AptoideUtils.DateTimeU.getInstance(getContext()).getTimeDiffString((Context) context, review.getAdded().getTime(), getContext().getResources()));
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.reply).mo18687f(new C1975e0(this, context, review, appName, rateAndReviewCommentDisplayable.getCommentAdder(), review.getId())).mo18655a(C2019v0.f4662f, (C5378b<Throwable>) C1999m0.f4631f));
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.helpfulButton).mo18664b(new C1993k0(this, review)).mo18664b(new C2017u0(rateAndReviewCommentDisplayable)).mo18675c(C2005o0.f4637f));
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.notHelpfulButton).mo18664b(new C2009q0(this, review)).mo18664b(new C1990j0(rateAndReviewCommentDisplayable)).mo18675c(C2002n0.f4634f));
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.showHideReplies).mo18675c(new C1987i0(this, review, rateAndReviewCommentDisplayable)));
        Resources.Theme theme = context.getTheme();
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(C1086R.attr.widgetBackgroundColorPrimary, typedValue, true);
        theme.resolveAttribute(C1086R.attr.widgetBackgroundColorSecondary, typedValue2, true);
        int i2 = getItemId() % 2 == 0 ? typedValue.resourceId : typedValue2.resourceId;
        if (Build.VERSION.SDK_INT >= 23) {
            this.itemView.setBackgroundColor(resources.getColor(i2, theme));
        } else {
            this.itemView.setBackgroundColor(resources.getColor(i2));
        }
        int numberComments = rateAndReviewCommentDisplayable.getNumberComments();
        if (numberComments > 0) {
            this.showHideReplies.setVisibility(0);
            this.showHideReplies.setText(AptoideUtils.StringU.getFormattedString(C1086R.string.reviews_expand_button, getContext().getResources(), Integer.valueOf(numberComments)));
            return;
        }
        this.showHideReplies.setVisibility(8);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7972b(Throwable th) {
        ShowMessage.asSnack((View) this.helpfulButton, (int) C1086R.string.unknown_error);
        Logger.getInstance().mo12981e(TAG, th);
        setHelpButtonsClickable(true);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7970b(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.REVIEW_FEEDBACK);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7965a(CommentAdder commentAdder, long j, C9008b bVar) {
        ManagerPreferences.setForceServerRefreshFlag(true, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
        commentAdder.collapseComments();
        loadCommentsForThisReview(j, 3, commentAdder);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7964a(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.REPLY_REVIEW);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7968a(Review review, Void voidR) {
        setReviewRating(review.getId(), false);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7967a(Review review, RateAndReviewCommentDisplayable rateAndReviewCommentDisplayable, Void voidR) {
        if (this.isCommentsCollapsed) {
            loadCommentsForThisReview(review.getId(), 3, rateAndReviewCommentDisplayable.getCommentAdder());
            this.showHideReplies.setCompoundDrawablesWithIntrinsicBounds(0, 0, C1086R.C1087drawable.ic_up_arrow, 0);
            this.isCommentsCollapsed = false;
            return;
        }
        rateAndReviewCommentDisplayable.getCommentAdder().collapseComments();
        this.showHideReplies.setCompoundDrawablesWithIntrinsicBounds(0, 0, C1086R.C1087drawable.ic_down_arrow, 0);
        this.isCommentsCollapsed = true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo7966a(CommentAdder commentAdder, ListComments listComments) {
        if (listComments.isOk()) {
            commentAdder.addComment(listComments.getDataList().getList());
            return;
        }
        Logger.getInstance().mo12979e(TAG, "error loading comments");
        ShowMessage.asSnack((View) this.helpfulButton, (int) C1086R.string.unknown_error);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7969a(Throwable th) {
        Logger.getInstance().mo12981e(TAG, th);
        ShowMessage.asSnack((View) this.helpfulButton, (int) C1086R.string.unknown_error);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7963a(long j, boolean z, BaseV7Response baseV7Response) {
        if (baseV7Response == null) {
            Logger.getInstance().mo12979e(TAG, "empty response");
        } else if (baseV7Response.getError() != null) {
            Logger.getInstance().mo12979e(TAG, baseV7Response.getError().getDescription());
        } else {
            List<BaseV7Response.Error> errors = baseV7Response.getErrors();
            if (errors == null || errors.isEmpty()) {
                Logger instance = Logger.getInstance();
                String str = TAG;
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(j);
                objArr[1] = z ? "positive" : "negative";
                instance.mo12975d(str, String.format("review %d was marked as %s", objArr));
                setHelpButtonsClickable(true);
                ShowMessage.asSnack((View) this.helpfulButton, (int) C1086R.string.thank_you_for_your_opinion);
                return;
            }
            for (BaseV7Response.Error description : errors) {
                Logger.getInstance().mo12979e(TAG, description.getDescription());
            }
        }
    }
}
