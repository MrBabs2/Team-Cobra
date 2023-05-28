package p015cm.aptoide.p016pt.comments.view;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.comments.CommentDialogCallbackContract;
import p015cm.aptoide.p016pt.comments.CommentNode;
import p015cm.aptoide.p016pt.comments.ComplexComment;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.SetComment;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListCommentsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.dataprovider.util.CommentType;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.CommentOperations;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.custom.HorizontalDividerItemDecoration;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeFragment;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayableGroup;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.comments.view.CommentListFragment */
public class CommentListFragment extends GridRecyclerSwipeFragment implements CommentDialogCallbackContract {
    private static final String COMMENT_TYPE = "comment_type";
    private static final String ELEMENT_ID_AS_LONG = "element_id_as_long";
    private static final String STORE_ANALYTICS_ACTION = "store_analytics_action";
    private static final String STORE_CONTEXT = "store_context";
    private static final String URL_VAL = "url_val";
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    @Inject
    AnalyticsManager analyticsManager;
    private BodyInterceptor<BaseBody> bodyDecorator;
    private CommentOperations commentOperations;
    private CommentType commentType;
    private List<CommentNode> comments;
    private Converter.Factory converterFactory;
    private List<Displayable> displayables;
    private long elementIdAsLong;
    private FloatingActionButton floatingActionButton;
    private OkHttpClient httpClient;
    @Inject
    NavigationTracker navigationTracker;
    private SharedPreferences sharedPreferences;
    private StoreAnalytics storeAnalytics;
    private String storeAnalyticsAction;
    private StoreContext storeContext;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;
    @Inject
    ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;
    private String url;

    /* renamed from: a */
    static /* synthetic */ void m5098a(Object obj) {
    }

    private C5328b createNewCommentFragment(long j, long j2, String str) {
        return this.accountManager.accountStatus().mo18669c().mo18700m().mo18566b(new C2010r(this, j, j2, str));
    }

    private ComplexComment getComplexComment(String str, Long l, long j) {
        Comment comment = new Comment();
        Comment.User user = new Comment.User();
        if (!TextUtils.isEmpty(this.accountManager.getAccount().getAvatar())) {
            user.setAvatar(this.accountManager.getAccount().getAvatar());
        } else if (!TextUtils.isEmpty(this.accountManager.getAccount().getStore().getAvatar())) {
            user.setAvatar(this.accountManager.getAccount().getStore().getAvatar());
        }
        user.setName(this.accountManager.getAccount().getNickname());
        comment.setUser(user);
        comment.setBody(str);
        comment.setAdded(new Date());
        comment.setId(j);
        CommentNode commentNode = new CommentNode(comment);
        if (l != null) {
            Comment.Parent parent = new Comment.Parent();
            parent.setId(l.longValue());
            comment.setParent(parent);
            commentNode.setLevel(2);
        }
        return new ComplexComment(commentNode, createNewCommentFragment(this.elementIdAsLong, commentNode.getComment().getId(), this.storeName));
    }

    private void insertChildCommentInsideParent(ComplexComment complexComment) {
        this.displayables.clear();
        ArrayList arrayList = new ArrayList(this.comments.size() + 1);
        boolean z = false;
        for (CommentNode next : this.comments) {
            ComplexComment complexComment2 = new ComplexComment(next, createNewCommentFragment(this.elementIdAsLong, next.getComment().getId(), this.storeName));
            FragmentNavigator fragmentNavigator = getFragmentNavigator();
            AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
            arrayList.add(new CommentDisplayable(complexComment2, fragmentNavigator, AptoideApplication.getFragmentProvider()));
            if (next.getComment().getId() == complexComment.getParent().getId() && !z) {
                FragmentNavigator fragmentNavigator2 = getFragmentNavigator();
                AptoideApplication aptoideApplication2 = (AptoideApplication) getContext().getApplicationContext();
                arrayList.add(new CommentDisplayable(complexComment, fragmentNavigator2, AptoideApplication.getFragmentProvider()));
                z = true;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        this.displayables = arrayList2;
        arrayList2.add(new DisplayableGroup(arrayList, (WindowManager) getContext().getSystemService("window"), getContext().getResources()));
        clearDisplayables();
        addDisplayables(this.displayables);
    }

    public static Fragment newInstanceUrl(CommentType commentType2, String str, String str2, StoreContext storeContext2) {
        Bundle bundle = new Bundle();
        bundle.putString(URL_VAL, str);
        bundle.putSerializable(STORE_CONTEXT, storeContext2);
        bundle.putString(COMMENT_TYPE, commentType2.name());
        bundle.putString(STORE_ANALYTICS_ACTION, str2);
        CommentListFragment commentListFragment = new CommentListFragment();
        commentListFragment.setArguments(bundle);
        return commentListFragment;
    }

    private C5368e<Void> reloadComments() {
        return C5368e.m10240a(new C1998m(this));
    }

    private C5328b showSignInMessage() {
        return Single.m10119a(this.floatingActionButton).mo18566b(new C1995l(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7935a(long j, String str, ListComments listComments) {
        if (listComments != null && listComments.getDataList() != null && listComments.getDataList().getList() != null) {
            CommentOperations commentOperations2 = this.commentOperations;
            this.comments = commentOperations2.flattenByDepth(commentOperations2.transform(listComments.getDataList().getList()));
            ArrayList arrayList = new ArrayList(this.comments.size());
            for (CommentNode next : this.comments) {
                ComplexComment complexComment = new ComplexComment(next, createNewCommentFragment(j, next.getComment().getId(), str));
                FragmentNavigator fragmentNavigator = getFragmentNavigator();
                AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
                arrayList.add(new CommentDisplayable(complexComment, fragmentNavigator, AptoideApplication.getFragmentProvider()));
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            this.displayables = arrayList2;
            arrayList2.add(new DisplayableGroup(arrayList, (WindowManager) getContext().getSystemService("window"), getContext().getResources()));
            addDisplayables(this.displayables);
        }
    }

    public void bindViews(View view) {
        Drawable drawable;
        super.bindViews(view);
        this.commentOperations = new CommentOperations();
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) view.findViewById(C1086R.C1088id.fabAdd);
        this.floatingActionButton = floatingActionButton2;
        if (floatingActionButton2 != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable = getContext().getDrawable(this.themeManager.getAttributeForTheme(C1086R.attr.penDrawable).resourceId);
            } else {
                drawable = getActivity().getResources().getDrawable(this.themeManager.getAttributeForTheme(C1086R.attr.penDrawable).resourceId);
            }
            this.floatingActionButton.setImageDrawable(drawable);
            this.floatingActionButton.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void caseListStoreComments(String str, BaseRequestWithStore.StoreCredentials storeCredentials, boolean z) {
        ListCommentsRequest ofStoreAction = ListCommentsRequest.ofStoreAction(str, z, storeCredentials, this.bodyDecorator, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
        if (storeCredentials == null || storeCredentials.getId() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Current store credentials does not have a store id");
            CrashReport.getInstance().log(illegalStateException);
            throw illegalStateException;
        }
        C2014t tVar = new C2014t(this, storeCredentials.getId() != null ? storeCredentials.getId().longValue() : -1, storeCredentials.getName());
        getRecyclerView().clearOnScrollListeners();
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), ofStoreAction, tVar, C2008q.f4643a, true, false);
        getRecyclerView().addOnScrollListener(endlessRecyclerOnScrollListener);
        boolean z2 = z;
        endlessRecyclerOnScrollListener.onLoadMore(z2, z2);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.recycler_swipe_fragment_with_toolbar;
    }

    public ScreenTagHistory getHistoryTracker() {
        String simpleName = CommentListFragment.class.getSimpleName();
        StoreContext storeContext2 = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, "", storeContext2 != null ? storeContext2.name() : null);
    }

    /* access modifiers changed from: protected */
    public RecyclerView.C0643n getItemDecoration() {
        return new HorizontalDividerItemDecoration(getActivity(), this.themeManager);
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (z || z2) {
            refreshData();
        }
    }

    public void loadExtras(Bundle bundle) {
        BaseRequestWithStore.StoreCredentials storeCredentialsFromUrl;
        super.loadExtras(bundle);
        this.storeContext = (StoreContext) bundle.getSerializable(STORE_CONTEXT);
        this.elementIdAsLong = bundle.getLong(ELEMENT_ID_AS_LONG);
        this.url = bundle.getString(URL_VAL);
        this.commentType = CommentType.valueOf(bundle.getString(COMMENT_TYPE));
        this.storeAnalyticsAction = bundle.getString(STORE_ANALYTICS_ACTION);
        if (this.commentType == CommentType.STORE && (storeCredentialsFromUrl = StoreUtils.getStoreCredentialsFromUrl(this.url, this.storeCredentialsProvider)) != null) {
            Long id = storeCredentialsFromUrl.getId();
            if (id != null) {
                this.elementIdAsLong = id.longValue();
            }
            if (!TextUtils.isEmpty(storeCredentialsFromUrl.getName())) {
                this.storeName = storeCredentialsFromUrl.getName();
            }
        }
    }

    public void okSelected(BaseV7Response baseV7Response, long j, Long l, String str) {
        if (baseV7Response instanceof SetComment) {
            SetComment setComment = (SetComment) baseV7Response;
            ComplexComment complexComment = getComplexComment(setComment.getData().getBody(), l, setComment.getData().getId());
            FragmentNavigator fragmentNavigator = getFragmentNavigator();
            AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
            CommentDisplayable commentDisplayable = new CommentDisplayable(complexComment, fragmentNavigator, AptoideApplication.getFragmentProvider());
            if (complexComment.getParent() != null) {
                insertChildCommentInsideParent(complexComment);
            } else {
                addDisplayable(0, (Displayable) commentDisplayable, true);
            }
            ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
            ShowMessage.asSnack((Activity) getActivity(), (int) C1086R.string.comment_submitted);
        }
    }

    public void onCreate(Bundle bundle) {
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.bodyDecorator = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        return onCreateView;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.commentType == CommentType.STORE) {
            StoreAnalytics storeAnalytics2 = this.storeAnalytics;
            String str = this.storeAnalyticsAction;
            String str2 = this.storeName;
            if (str2 == null) {
                str2 = "unknown";
            }
            storeAnalytics2.sendStoreInteractEvent(str, "Home", str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void refreshData() {
        String str = this.url;
        caseListStoreComments(str, StoreUtils.getStoreCredentialsFromUrl(str, this.storeCredentialsProvider), true);
    }

    public void setupToolbarDetails(Toolbar toolbar) {
        if (this.commentType != CommentType.STORE || TextUtils.isEmpty(this.storeName)) {
            toolbar.setTitle((int) C1086R.string.comments_title_comments);
            return;
        }
        toolbar.setTitle((CharSequence) String.format(getString(C1086R.string.commentlist_title_comment_on_store), new Object[]{this.storeName}));
    }

    public void setupViews() {
        super.setupViews();
        setupToolbar();
        C10695a.m36221a(this.floatingActionButton).mo18687f(new C2016u(this)).mo18641a(bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18675c(C2004o.f4636f);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo7939b(FloatingActionButton floatingActionButton2) {
        return C5328b.m10169d(new C2012s(this, floatingActionButton2));
    }

    /* renamed from: b */
    public /* synthetic */ Void mo7938b() throws Exception {
        ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
        super.reload();
        return null;
    }

    public C5328b createNewCommentFragment(long j, String str) {
        return this.accountManager.accountStatus().mo18669c().mo18700m().mo18566b(new C1992k(this, j, str));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7932a(long j, long j2, String str, Account account) {
        if (!account.isLoggedIn()) {
            return showSignInMessage();
        }
        C0462h supportFragmentManager = getActivity().getSupportFragmentManager();
        CommentDialogFragment newInstanceStoreCommentReply = CommentDialogFragment.newInstanceStoreCommentReply(j, j2, str);
        newInstanceStoreCommentReply.setCommentDialogCallbackContract(this);
        return newInstanceStoreCommentReply.lifecycle().mo18663b((C5377a) new C2006p(newInstanceStoreCommentReply, supportFragmentManager)).mo18681d(C1989j.f4612f).mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7937a(FloatingActionButton floatingActionButton2) {
        Snackbar a = Snackbar.m28075a((android.view.View) floatingActionButton2, (int) C1086R.string.you_need_to_be_logged_in, 0);
        a.mo32011a((int) C1086R.string.login, (View.OnClickListener) new C2001n(this));
        a.mo31972k();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7936a(android.view.View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.COMMENT_LIST);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7934a(Void voidR) {
        return createNewCommentFragment(this.elementIdAsLong, this.storeName).mo18610e();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7933a(long j, String str, Account account) {
        if (!account.isLoggedIn()) {
            return showSignInMessage();
        }
        C0462h supportFragmentManager = getActivity().getSupportFragmentManager();
        CommentDialogFragment newInstanceStoreComment = CommentDialogFragment.newInstanceStoreComment(j, str);
        newInstanceStoreComment.setCommentDialogCallbackContract(this);
        return newInstanceStoreComment.lifecycle().mo18663b((C5377a) new C1983h(newInstanceStoreComment, supportFragmentManager)).mo18681d(C1986i.f4606f).mo18696k();
    }
}
