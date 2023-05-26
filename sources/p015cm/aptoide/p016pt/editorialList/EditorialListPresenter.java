package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListModel;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListPresenter */
public class EditorialListPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReporter;
    private final EditorialListAnalytics editorialListAnalytics;
    private final EditorialListManager editorialListManager;
    private final EditorialListNavigator editorialListNavigator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;
    private final EditorialListView view;
    private final C5373h viewScheduler;

    public EditorialListPresenter(EditorialListView editorialListView, EditorialListManager editorialListManager2, AptoideAccountManager aptoideAccountManager, EditorialListNavigator editorialListNavigator2, EditorialListAnalytics editorialListAnalytics2, CrashReport crashReport, C5373h hVar, UserFeedbackAnalytics userFeedbackAnalytics2) {
        this.view = editorialListView;
        this.editorialListManager = editorialListManager2;
        this.accountManager = aptoideAccountManager;
        this.editorialListNavigator = editorialListNavigator2;
        this.editorialListAnalytics = editorialListAnalytics2;
        this.crashReporter = crashReport;
        this.viewScheduler = hVar;
        this.userFeedbackAnalytics = userFeedbackAnalytics2;
    }

    /* renamed from: b */
    static /* synthetic */ EditorialListModel m5706b(EditorialListModel editorialListModel) {
        return editorialListModel;
    }

    /* renamed from: b */
    static /* synthetic */ void m5707b(CurationCard curationCard) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5708b(EditorialListEvent editorialListEvent) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5709b(String str) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5710c(CurationCard curationCard) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5711d(CurationCard curationCard) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5712d(EditorialHomeEvent editorialHomeEvent) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5713e(CurationCard curationCard) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5714e(EditorialHomeEvent editorialHomeEvent) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5715f(CurationCard curationCard) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5716f(EditorialHomeEvent editorialHomeEvent) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5717f(Void voidR) {
    }

    /* renamed from: g */
    static /* synthetic */ void m5718g(CurationCard curationCard) {
    }

    /* renamed from: g */
    static /* synthetic */ void m5719g(Void voidR) {
    }

    /* access modifiers changed from: private */
    /* renamed from: getUserAvatar */
    public C5368e<String> mo11434a(Account account) {
        return C5368e.m10257c((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleReactionsResponse(ReactionsResponse reactionsResponse, boolean z) {
        if (reactionsResponse.wasSuccess()) {
            if (z) {
                this.editorialListAnalytics.sendDeleteEvent();
            } else {
                this.editorialListAnalytics.sendReactedEvent();
            }
        } else if (reactionsResponse.reactionsExceeded()) {
            this.view.showLogInDialog();
        } else if (reactionsResponse.wasNetworkError()) {
            this.view.showNetworkErrorToast();
        } else if (reactionsResponse.wasGeneralError()) {
            this.view.showGenericErrorToast();
        }
    }

    /* access modifiers changed from: private */
    public C5368e<CurationCard> handleSinglePressReactionButton(EditorialHomeEvent editorialHomeEvent) {
        return this.editorialListManager.isFirstReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).mo18568c(new C2659p1(this, editorialHomeEvent));
    }

    private C5368e<CurationCard> loadEditorialAndReactions(boolean z, boolean z2) {
        return loadEditorialListModel(z, z2).mo18567c().mo18691h(C2643l1.f5475f).mo18692i(new C2652n2(this));
    }

    private Single<EditorialListModel> loadEditorialListModel(boolean z, boolean z2) {
        return this.editorialListManager.loadEditorialListModel(z, z2).mo18556a(this.viewScheduler).mo18564b(new C2612d2(this, z2)).mo18569d(C2618f0.f5448f);
    }

    private Single<CurationCard> loadReactionModel(String str, String str2) {
        Single<CurationCard> a = this.editorialListManager.loadReactionModel(str, str2).mo18556a(this.viewScheduler);
        EditorialListView editorialListView = this.view;
        editorialListView.getClass();
        return a.mo18564b((C5378b<? super CurationCard>) new C2664q2(editorialListView));
    }

    /* access modifiers changed from: private */
    /* renamed from: showReactions */
    public void mo11447b(EditorialHomeEvent editorialHomeEvent) {
        this.editorialListAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId(), editorialHomeEvent.getBundlePosition());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11445b(View.LifecycleEvent lifecycleEvent) {
        return this.view.editorialCardClicked().mo18644a(this.viewScheduler).mo18664b(new C2666r0(this)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11454c(Void voidR) {
        return loadEditorialAndReactions(false, true);
    }

    /* renamed from: d */
    public /* synthetic */ void mo11458d(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: e */
    public /* synthetic */ void mo11461e(Void voidR) {
        this.editorialListNavigator.navigateToMyAccount();
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo11462f(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshes().mo18687f(new C2676u0(this)).mo18686f();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo11463g(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonClicked();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo11464h(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().mo18644a(this.viewScheduler).mo18664b(new C2667r1(this)).mo18687f(new C2626h0(this));
    }

    public void handleBottomReached() {
        this.view.getLifecycleEvent().mo18681d(C2662q0.f5495f).mo18687f(new C2622g0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2620f2.f5450f, (C5378b<Throwable>) new C2691z0(this));
    }

    public void handleEditorialCardClick() {
        this.view.getLifecycleEvent().mo18681d(C2636j2.f5467f).mo18687f(new C2598a0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2658p0.f5490f, (C5378b<Throwable>) new C2692z1(this));
    }

    public void handleImpressions() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2683w1.f5519f).mo18687f(new C2642l0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2638k0 k0Var = C2638k0.f5469f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) k0Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    /* access modifiers changed from: package-private */
    public void handleLongPressReactionButton() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2687y.f5523f).mo18687f(new C2627h1(this)).mo18664b(new C2607c1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2644l2 l2Var = C2644l2.f5476f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) l2Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    /* access modifiers changed from: package-private */
    public void handleOnDismissPopup() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2628h2.f5458f).mo18687f(new C2602b0(this)).mo18664b(new C2689y1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2608c2 c2Var = C2608c2.f5437f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) c2Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    public void handlePullToRefresh() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2647m1.f5479f).mo18687f(new C2599a1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2635j1 j1Var = C2635j1.f5466f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) j1Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    public void handleReactionButtonClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2655o1.f5487f).mo18687f(new C2679v0(this)).mo18644a(this.viewScheduler).mo18687f(new C2680v1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2604b2 b2Var = C2604b2.f5432f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) b2Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    public void handleRetryClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2673t0.f5506f).mo18687f(new C2603b1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2614e0 e0Var = C2614e0.f5444f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) e0Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    public void handleSnackLogInClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2611d1.f5440f).mo18687f(new C2650n0(this)).mo18664b(new C2610d0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2600a2 a2Var = C2600a2.f5428f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) a2Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    public void handleUserImageClick() {
        this.view.getLifecycleEvent().mo18681d(C2688y0.f5524f).mo18687f(new C2624g2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2674t1.f5507f, (C5378b<Throwable>) new C2623g1(this));
    }

    public void handleUserReaction() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2648m2.f5480f).mo18687f(new C2663q1(this)).mo18664b(new C2632i2(this)).mo18687f(new C2660p2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2682w0 w0Var = C2682w0.f5518f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) w0Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo11476i(View.LifecycleEvent lifecycleEvent) {
        return this.view.snackLogInClick();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo11477j(View.LifecycleEvent lifecycleEvent) {
        return this.view.imageClick().mo18644a(this.viewScheduler).mo18664b(new C2685x0(this)).mo18686f();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo11478k(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionClicked();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo11479l(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    public void loadUserImage() {
        this.view.getLifecycleEvent().mo18681d(C2615e1.f5445f).mo18687f(new C2671s1(this)).mo18687f(new C2631i1(this)).mo18644a(this.viewScheduler).mo18664b(new C2606c0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2616e2.f5446f, (C5378b<Throwable>) new C2646m0(this));
    }

    /* renamed from: m */
    public /* synthetic */ void mo11481m(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo11482n(View.LifecycleEvent lifecycleEvent) {
        return loadEditorialAndReactions(false, false);
    }

    public void onCreateLoadViewModel() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2686x1.f5522f).mo18664b(new C2690z(this)).mo18687f(new C2630i0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2654o0 o0Var = C2654o0.f5486f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) o0Var, (C5378b<Throwable>) new C2601b(crashReport));
    }

    public void present() {
        onCreateLoadViewModel();
        handleImpressions();
        handleEditorialCardClick();
        handlePullToRefresh();
        handleRetryClick();
        handleBottomReached();
        handleUserImageClick();
        loadUserImage();
        handleReactionButtonClick();
        handleLongPressReactionButton();
        handleUserReaction();
        handleSnackLogInClick();
        handleOnDismissPopup();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11452c(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleCards().mo18644a(this.viewScheduler).mo18664b(new C2640k2(this));
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11457d(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionButtonLongPress();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo11460e(View.LifecycleEvent lifecycleEvent) {
        return this.view.onPopupDismiss();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11431a(CurationCard curationCard) {
        return loadReactionModel(curationCard.getId(), curationCard.getType());
    }

    /* renamed from: d */
    public /* synthetic */ void mo11459d(Void voidR) {
        this.editorialListNavigator.navigateToLogIn();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11442a(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    /* renamed from: b */
    public /* synthetic */ void mo11450b(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11453c(Object obj) {
        return loadEditorialAndReactions(true, false);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11451b(Void voidR) {
        this.view.showLoading();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11456c(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11449b(Object obj) {
        this.view.showLoadMore();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11455c(EditorialHomeEvent editorialHomeEvent) {
        this.view.setScrollEnabled(true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11439a(EditorialHomeEvent editorialHomeEvent) {
        this.editorialListAnalytics.sendEditorialInteractEvent(editorialHomeEvent.getCardId(), editorialHomeEvent.getBundlePosition());
        this.editorialListNavigator.navigateToEditorial(editorialHomeEvent.getCardId());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11446b(ReactionsHomeEvent reactionsHomeEvent) {
        return this.editorialListManager.setReaction(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId(), reactionsHomeEvent.getReaction()).mo18567c().mo18681d(C2668r2.f5501f).mo18644a(this.viewScheduler).mo18664b(new C2656o2(this)).mo18681d(C2597a.f5425f).mo18692i(new C2634j0(this, reactionsHomeEvent));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11437a(Void voidR) {
        return loadEditorialAndReactions(false, true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11438a(EditorialListEvent editorialListEvent) {
        this.editorialListAnalytics.sendEditorialImpressionEvent(editorialListEvent.getCardId(), editorialListEvent.getPosition());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11436a(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().mo18681d(new C2619f1(this)).mo18644a(this.viewScheduler).mo18664b(new C2670s0(this)).mo18687f(new C2651n1(this)).mo18686f();
    }

    /* renamed from: b */
    public /* synthetic */ void mo11448b(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, false);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11430a(Object obj) {
        return Boolean.valueOf(this.editorialListManager.hasMore());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11443a(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11444a(boolean z, EditorialListModel editorialListModel) {
        if (!editorialListModel.getEditorialCardListModel().isLoading()) {
            this.view.hideLoading();
        }
        if (editorialListModel.getEditorialCardListModel().hasError()) {
            if (editorialListModel.getEditorialCardListModel().getError() == EditorialCardListModel.Error.NETWORK) {
                this.view.showNetworkError();
            } else {
                this.view.showGenericError();
            }
        } else if (z) {
            this.view.hideRefresh();
            this.view.update(editorialListModel.getEditorialCardListModel().getCurationCards());
        } else {
            this.view.populateView(editorialListModel.getEditorialCardListModel().getCurationCards(), editorialListModel.getBonusAppcModel());
        }
        this.view.hideLoadMore();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11440a(ReactionsHomeEvent reactionsHomeEvent) {
        this.userFeedbackAnalytics.sendReactionEvent();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11433a(ReactionsHomeEvent reactionsHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11435a(EditorialHomeEvent editorialHomeEvent, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.editorialListManager.deleteReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).mo18567c().mo18664b(new C2677u1(this)).mo18681d(C2597a.f5425f).mo18692i(new C2639k1(this, editorialHomeEvent));
        }
        mo11447b(editorialHomeEvent);
        return C5368e.m10257c(new CurationCard());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11441a(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, true);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11432a(EditorialHomeEvent editorialHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId());
    }
}
