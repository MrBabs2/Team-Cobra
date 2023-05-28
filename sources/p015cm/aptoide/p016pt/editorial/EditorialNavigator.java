package p015cm.aptoide.p016pt.editorial;

import android.net.Uri;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogFragment;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.editorial.EditorialNavigator */
public class EditorialNavigator {
    private final AccountNavigator accountNavigator;
    private final ActivityNavigator activityNavigator;
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;
    private final SocialMediaNavigator socialMediaNavigator;

    public EditorialNavigator(ActivityNavigator activityNavigator2, FragmentNavigator fragmentNavigator2, AppNavigator appNavigator2, AccountNavigator accountNavigator2, SocialMediaNavigator socialMediaNavigator2) {
        this.activityNavigator = activityNavigator2;
        this.fragmentNavigator = fragmentNavigator2;
        this.appNavigator = appNavigator2;
        this.accountNavigator = accountNavigator2;
        this.socialMediaNavigator = socialMediaNavigator2;
    }

    /* renamed from: a */
    static /* synthetic */ OutOfSpaceNavigatorWrapper m5525a(Result result) {
        return new OutOfSpaceNavigatorWrapper(result.getResultCode() == -1, result.getData() != null ? result.getData().getPackage() : "");
    }

    public void navigateToAppView(long j, String str) {
        this.appNavigator.navigateWithAppId(j, str, AppViewFragment.OpenType.OPEN_ONLY, "");
    }

    public void navigateToLogIn() {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.EDITORIAL);
    }

    public void navigateToOutOfSpaceDialog(long j, String str) {
        this.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.Companion.newInstance(j, str), 1994);
    }

    public void navigateToSocialMedia(SocialMediaView.SocialMediaType socialMediaType) {
        this.socialMediaNavigator.navigateToSocialMediaWebsite(socialMediaType);
    }

    public void navigateToUri(String str) {
        this.activityNavigator.navigateTo(Uri.parse(str));
    }

    public C5368e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        return this.fragmentNavigator.results(1994).mo18694j(C2536s0.f5352f);
    }
}
