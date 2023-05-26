package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.FlavourFragmentModule;
import p015cm.aptoide.p016pt.analytics.view.AnalyticsActivity;
import p015cm.aptoide.p016pt.app.view.donations.view.DonateDialogFragment;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.view.dialog.DialogUtils;
import p015cm.aptoide.p016pt.view.fragment.BaseBottomSheetDialogFragment;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;
import p015cm.aptoide.p016pt.view.settings.SettingsFragment;
import p015cm.aptoide.p016pt.wallet.WalletInstallActivity;

@ActivityScope
/* renamed from: cm.aptoide.pt.view.ActivityComponent */
public interface ActivityComponent {
    void inject(AnalyticsActivity analyticsActivity);

    void inject(DonateDialogFragment donateDialogFragment);

    void inject(BottomNavigationActivity bottomNavigationActivity);

    void inject(ActivityResultNavigator activityResultNavigator);

    void inject(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment);

    void inject(BaseActivity baseActivity);

    void inject(MainActivity mainActivity);

    void inject(ThemedActivityView themedActivityView);

    void inject(DialogUtils dialogUtils);

    void inject(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment);

    void inject(BaseDialogFragment baseDialogFragment);

    void inject(SettingsFragment settingsFragment);

    void inject(WalletInstallActivity walletInstallActivity);

    FragmentComponent plus(FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule);
}
