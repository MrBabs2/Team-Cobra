package p015cm.aptoide.p016pt.comments.view;

import android.view.View;
import android.widget.Button;
import androidx.fragment.app.C0462h;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.store.view.StoreAddCommentDisplayable;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.comments.view.StoreAddCommentWidget */
public class StoreAddCommentWidget extends Widget<StoreAddCommentDisplayable> {
    private static final String TAG = "cm.aptoide.pt.comments.view.StoreAddCommentWidget";
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    private Button commentStore;

    public StoreAddCommentWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    static /* synthetic */ void m5142a(Void voidR) {
    }

    private C5328b showSignInMessage(View view) {
        return ShowMessage.asObservableSnack(view, (int) C1086R.string.you_need_to_be_logged_in, (int) C1086R.string.login, (View.OnClickListener) new C2027z0(this));
    }

    private C5368e<Void> showStoreCommentFragment(long j, String str, C0462h hVar, View view) {
        return C5368e.m10257c(Boolean.valueOf(this.accountManager.isLoggedIn())).mo18687f(new C2023x0(this, j, str, hVar, view));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7975a(StoreAddCommentDisplayable storeAddCommentDisplayable, Void voidR) {
        return showStoreCommentFragment(storeAddCommentDisplayable.getStoreId(), storeAddCommentDisplayable.getStoreName(), getContext().getSupportFragmentManager(), this.commentStore);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.commentStore = (Button) view.findViewById(C1086R.C1088id.comment_store_button);
    }

    public void bindView(StoreAddCommentDisplayable storeAddCommentDisplayable, int i) {
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.commentStore.setBackgroundResource(storeAddCommentDisplayable.getRaisedButtonDrawable());
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.commentStore).mo18687f(new C2025y0(this, storeAddCommentDisplayable)).mo18655a(C1967b1.f4578f, (C5378b<Throwable>) C1970c1.f4581f));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7974a(long j, String str, C0462h hVar, View view, Boolean bool) {
        if (!bool.booleanValue()) {
            return showSignInMessage(view).mo18610e();
        }
        CommentDialogFragment newInstanceStoreComment = CommentDialogFragment.newInstanceStoreComment(j, str);
        return newInstanceStoreComment.lifecycle().mo18663b((C5377a) new C1964a1(newInstanceStoreComment, hVar)).mo18681d(C1976e1.f4592f).mo18687f(C1973d1.f4584f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7976a(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.STORE_COMMENT);
    }
}
