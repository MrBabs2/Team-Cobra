package p015cm.aptoide.p016pt.comments.view;

import android.view.View;
import androidx.fragment.app.C0462h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.comments.CommentNode;
import p015cm.aptoide.p016pt.comments.ComplexComment;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListCommentsRequest;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.store.view.StoreLatestCommentsDisplayable;
import p015cm.aptoide.p016pt.util.CommentOperations;
import p015cm.aptoide.p016pt.view.FragmentProvider;
import p015cm.aptoide.p016pt.view.custom.HorizontalDividerItemDecoration;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.comments.view.StoreLatestCommentsWidget */
public class StoreLatestCommentsWidget extends Widget<StoreLatestCommentsDisplayable> {
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private RecyclerView recyclerView;
    private long storeId;
    private String storeName;
    private TokenInvalidator tokenInvalidator;

    public StoreLatestCommentsWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: reloadComments */
    public Void mo7978a() {
        ManagerPreferences.setForceServerRefreshFlag(true, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
        this.compositeSubscription.mo18721a(ListCommentsRequest.m5259of(this.storeId, 0, 3, false, this.baseBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).observe().mo18662b(Schedulers.m10352io()).mo18644a(C5376a.m10346b()).mo18655a(new C1997l1(this), (C5378b<Throwable>) C2003n1.f4635f));
        return null;
    }

    private void setAdapter(List<Comment> list) {
        RecyclerView recyclerView2 = this.recyclerView;
        long j = this.storeId;
        String str = this.storeName;
        C0462h supportFragmentManager = getContext().getSupportFragmentManager();
        RecyclerView recyclerView3 = this.recyclerView;
        C5368e a = C5368e.m10240a(new C2000m1(this));
        AptoideAccountManager aptoideAccountManager = this.accountManager;
        AccountNavigator accountNavigator2 = this.accountNavigator;
        FragmentNavigator fragmentNavigator = getFragmentNavigator();
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        recyclerView2.setAdapter(new CommentListAdapter(j, str, list, supportFragmentManager, recyclerView3, a, aptoideAccountManager, accountNavigator2, fragmentNavigator, AptoideApplication.getFragmentProvider()));
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.comments);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7979a(ListComments listComments) {
        setAdapter(listComments.getDataList().getList());
    }

    public void bindView(StoreLatestCommentsDisplayable storeLatestCommentsDisplayable, int i) {
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.recyclerView.getContext()));
        this.recyclerView.addItemDecoration(new HorizontalDividerItemDecoration(((ActivityResultNavigator) getContext()).getActivity(), storeLatestCommentsDisplayable.getThemeManager()));
        this.storeId = storeLatestCommentsDisplayable.getStoreId();
        this.storeName = storeLatestCommentsDisplayable.getStoreName();
        setAdapter(storeLatestCommentsDisplayable.getComments());
    }

    /* renamed from: cm.aptoide.pt.comments.view.StoreLatestCommentsWidget$CommentListAdapter */
    private static class CommentListAdapter extends BaseAdapter {
        private final AptoideAccountManager accountManager;
        private AccountNavigator accountNavigator;

        CommentListAdapter(long j, String str, List<Comment> list, C0462h hVar, View view, C5368e<Void> eVar, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator2, FragmentNavigator fragmentNavigator, FragmentProvider fragmentProvider) {
            this.accountManager = aptoideAccountManager;
            this.accountNavigator = accountNavigator2;
            CommentOperations commentOperations = new CommentOperations();
            List<CommentNode> flattenByDepth = commentOperations.flattenByDepth(commentOperations.transform(list));
            ArrayList arrayList = new ArrayList(flattenByDepth.size());
            for (CommentNode next : flattenByDepth) {
                arrayList.add(new CommentDisplayable(new ComplexComment(next, showStoreCommentFragment(j, next.getComment(), str, hVar, view, eVar)), fragmentNavigator, fragmentProvider));
            }
            addDisplayables(arrayList);
        }

        /* renamed from: a */
        static /* synthetic */ C5368e m5151a(C5368e eVar, C9008b bVar) {
            return eVar;
        }

        private C5328b showSignInMessage(View view) {
            return C5328b.m10169d(new C1982g1(this, view));
        }

        private C5328b showStoreCommentFragment(long j, Comment comment, String str, C0462h hVar, View view, C5368e<Void> eVar) {
            return this.accountManager.accountStatus().mo18669c().mo18700m().mo18566b(new C1994k1(this, j, comment, str, hVar, eVar, view));
        }

        /* renamed from: a */
        public /* synthetic */ C5328b mo7981a(long j, Comment comment, String str, C0462h hVar, C5368e eVar, View view, Account account) {
            if (!account.isLoggedIn()) {
                return showSignInMessage(view);
            }
            CommentDialogFragment newInstanceStoreCommentReply = CommentDialogFragment.newInstanceStoreCommentReply(j, comment.getId(), str);
            return newInstanceStoreCommentReply.lifecycle().mo18663b((C5377a) new C1988i1(newInstanceStoreCommentReply, hVar)).mo18681d(C1991j1.f4614f).mo18687f(new C1985h1(eVar)).mo18696k();
        }

        /* renamed from: b */
        public /* synthetic */ void mo7983b(View view) {
            Snackbar a = Snackbar.m28075a(view, (int) C1086R.string.you_need_to_be_logged_in, 0);
            a.mo32011a((int) C1086R.string.login, (View.OnClickListener) new C1979f1(this));
            a.mo31972k();
        }

        /* renamed from: a */
        public /* synthetic */ void mo7982a(View view) {
            this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.LATEST_COMMENTS_STORE);
        }
    }
}
