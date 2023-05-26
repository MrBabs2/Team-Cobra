package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.LoginSignUpCredentialsFragment;
import p015cm.aptoide.p016pt.account.view.magiclink.CheckYourEmailFragment;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment;
import p015cm.aptoide.p016pt.account.view.user.ProfileStepOneFragment;
import p015cm.aptoide.p016pt.account.view.user.ProfileStepTwoFragment;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoFragment;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.app.view.MoreBundleFragment;
import p015cm.aptoide.p016pt.app.view.OtherVersionsFragment;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateDialogFragment;
import p015cm.aptoide.p016pt.comments.view.CommentDialogFragment;
import p015cm.aptoide.p016pt.comments.view.CommentListFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.editorialList.EditorialListFragment;
import p015cm.aptoide.p016pt.home.HomeContainerFragment;
import p015cm.aptoide.p016pt.home.HomeFragment;
import p015cm.aptoide.p016pt.home.apps.AppsFragment;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListFragment;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreFragment;
import p015cm.aptoide.p016pt.notification.view.InboxFragment;
import p015cm.aptoide.p016pt.promotions.ClaimPromotionDialogFragment;
import p015cm.aptoide.p016pt.promotions.PromotionsFragment;
import p015cm.aptoide.p016pt.reviews.LatestReviewsFragment;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.search.view.SearchResultFragment;
import p015cm.aptoide.p016pt.store.view.AddStoreDialog;
import p015cm.aptoide.p016pt.store.view.ListStoresFragment;
import p015cm.aptoide.p016pt.store.view.PrivateStoreDialog;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.store.view.StoreTabWidgetsGridRecyclerFragment;
import p015cm.aptoide.p016pt.store.view.TopStoresFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresFragment;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresSubscribedFragment;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoresFragment;
import p015cm.aptoide.p016pt.themes.NewFeatureDialogFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowersFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowingFragment;
import p015cm.aptoide.p016pt.updates.view.excluded.ExcludedUpdatesFragment;
import p015cm.aptoide.p016pt.view.app.ListStoreAppsFragment;
import p015cm.aptoide.p016pt.view.feedback.SendFeedbackFragment;
import p015cm.aptoide.p016pt.view.fragment.DescriptionFragment;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment;
import p015cm.aptoide.p016pt.view.settings.SettingsFragment;
import p015cm.aptoide.p016pt.view.wizard.WizardFragment;
import p015cm.aptoide.p016pt.view.wizard.WizardFragmentProvider;
import p015cm.aptoide.p016pt.view.wizard.WizardPageTwoFragment;

@FragmentScope
/* renamed from: cm.aptoide.pt.view.FragmentComponent */
public interface FragmentComponent {
    void inject(LoginSignUpCredentialsFragment loginSignUpCredentialsFragment);

    void inject(CheckYourEmailFragment checkYourEmailFragment);

    void inject(ManageStoreFragment manageStoreFragment);

    void inject(ManageUserFragment manageUserFragment);

    void inject(ProfileStepOneFragment profileStepOneFragment);

    void inject(ProfileStepTwoFragment profileStepTwoFragment);

    void inject(AppCoinsInfoFragment appCoinsInfoFragment);

    void inject(AppViewFragment appViewFragment);

    void inject(MoreBundleFragment moreBundleFragment);

    void inject(OtherVersionsFragment otherVersionsFragment);

    void inject(AutoUpdateDialogFragment autoUpdateDialogFragment);

    void inject(CommentDialogFragment commentDialogFragment);

    void inject(CommentListFragment commentListFragment);

    void inject(OutOfSpaceDialogFragment outOfSpaceDialogFragment);

    void inject(EditorialFragment editorialFragment);

    void inject(EditorialListFragment editorialListFragment);

    void inject(HomeContainerFragment homeContainerFragment);

    void inject(HomeFragment homeFragment);

    void inject(AppsFragment appsFragment);

    void inject(EarnAppcListFragment earnAppcListFragment);

    void inject(ListAppsMoreFragment listAppsMoreFragment);

    void inject(InboxFragment inboxFragment);

    void inject(ClaimPromotionDialogFragment claimPromotionDialogFragment);

    void inject(PromotionsFragment promotionsFragment);

    void inject(LatestReviewsFragment latestReviewsFragment);

    void inject(RateAndReviewsFragment rateAndReviewsFragment);

    void inject(SearchResultFragment searchResultFragment);

    void inject(AddStoreDialog addStoreDialog);

    void inject(ListStoresFragment listStoresFragment);

    void inject(PrivateStoreDialog privateStoreDialog);

    void inject(StoreFragment storeFragment);

    void inject(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment);

    void inject(TopStoresFragment topStoresFragment);

    void inject(MyStoresFragment myStoresFragment);

    void inject(MyStoresSubscribedFragment myStoresSubscribedFragment);

    void inject(RecommendedStoresFragment recommendedStoresFragment);

    void inject(NewFeatureDialogFragment newFeatureDialogFragment);

    void inject(TimeLineFollowersFragment timeLineFollowersFragment);

    void inject(TimeLineFollowingFragment timeLineFollowingFragment);

    void inject(ExcludedUpdatesFragment excludedUpdatesFragment);

    void inject(ListStoreAppsFragment listStoreAppsFragment);

    void inject(SendFeedbackFragment sendFeedbackFragment);

    void inject(DescriptionFragment descriptionFragment);

    void inject(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment);

    void inject(MyAccountFragment myAccountFragment);

    void inject(SettingsFragment settingsFragment);

    void inject(WizardFragment wizardFragment);

    void inject(WizardFragmentProvider wizardFragmentProvider);

    void inject(WizardPageTwoFragment wizardPageTwoFragment);
}
