package p015cm.aptoide.p016pt.app.view;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.CatappultNavigator;
import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.app.view.donations.view.DonateDialogFragment;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenshotsViewerFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.app.view.AppViewNavigator */
public class AppViewNavigator {
    private final ActivityNavigator activityNavigator;
    private final AppNavigator appNavigator;
    private final CatappultNavigator catappultNavigator;
    private final FragmentNavigator fragmentNavigator;

    public AppViewNavigator(FragmentNavigator fragmentNavigator2, ActivityNavigator activityNavigator2, AppNavigator appNavigator2, CatappultNavigator catappultNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.activityNavigator = activityNavigator2;
        this.appNavigator = appNavigator2;
        this.catappultNavigator = catappultNavigator2;
    }

    /* renamed from: a */
    static /* synthetic */ OutOfSpaceNavigatorWrapper m4653a(Result result) {
        return new OutOfSpaceNavigatorWrapper(result.getResultCode() == -1, result.getData() != null ? result.getData().getPackage() : "");
    }

    private boolean hasWallet() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("ethereum:"));
        return !this.activityNavigator.getActivity().getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public void navigateToAd(AptoideNativeAd aptoideNativeAd, String str) {
        this.appNavigator.navigateWithAd(new SearchAdResult(aptoideNativeAd), str);
    }

    public void navigateToAppCoinsInfo() {
        this.fragmentNavigator.navigateTo(AppCoinsInfoFragment.newInstance(true), true);
    }

    public void navigateToAppView(long j, String str, String str2) {
        this.appNavigator.navigateWithAppId(j, str, AppViewFragment.OpenType.OPEN_ONLY, str2);
    }

    public void navigateToCatappultWebsite() {
        this.catappultNavigator.navigateToCatappultWebsite();
    }

    public void navigateToDescriptionReadMore(String str, String str2, boolean z) {
        this.fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newDescriptionFragment(str, str2, z), true);
    }

    public void navigateToDonationsDialog(String str, String str2) {
        this.fragmentNavigator.navigateToDialogFragment(DonateDialogFragment.newInstance(str, hasWallet()));
    }

    public void navigateToESkillsSectionOnAppCoinsInfoView() {
        this.appNavigator.navigateToESkillsSectionOfAppCoinsInfoView();
    }

    public void navigateToOtherVersions(String str, String str2, String str3) {
        this.fragmentNavigator.navigateTo(OtherVersionsFragment.newInstance(str, str2, str3), true);
    }

    public void navigateToOutOfSpaceDialog(long j, String str) {
        this.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.Companion.newInstance(j, str), 1994);
    }

    public void navigateToRateAndReview(long j, String str, String str2, String str3, String str4) {
        this.fragmentNavigator.navigateTo(RateAndReviewsFragment.newInstance(j, str, str2, str3, str4), true);
    }

    public void navigateToScreenshots(ArrayList<String> arrayList, int i) {
        this.fragmentNavigator.navigateTo(ScreenshotsViewerFragment.newInstance(arrayList, i), true);
    }

    public void navigateToStore(Store store) {
        this.fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(store.getName(), store.getAppearance().getTheme()), true);
    }

    public void navigateToUri(Uri uri) {
        this.activityNavigator.navigateTo(uri);
    }

    public C5368e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        return this.fragmentNavigator.results(1994).mo18694j(C1480c1.f3991f);
    }
}
