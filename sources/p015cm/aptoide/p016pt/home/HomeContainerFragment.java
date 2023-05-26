package p015cm.aptoide.p016pt.home;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.promotions.PromotionsHomeDialog;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.HomeContainerFragment */
public class HomeContainerFragment extends NavigationTrackFragment implements HomeContainerView {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.HOME;
    private AppBarLayout appBarLayout;
    private CheckBox appsChip;
    private BottomNavigationActivity bottomNavigationActivity;
    private C12871b<ChipsEvents> chipCheckedEvent;
    private EskillsHomeDialog eskillsHomeDialog;
    private CheckBox gamesChip;
    private LoggedInTermsAndConditionsDialog gdprDialog;
    @Inject
    HomeContainerPresenter presenter;
    private PromotionsHomeDialog promotionsHomeDialog;
    private ImageView promotionsIcon;
    private TextView promotionsTicker;
    @Inject
    ThemeManager themeManager;
    private ImageView userAvatar;

    /* renamed from: cm.aptoide.pt.home.HomeContainerFragment$ChipsEvents */
    public enum ChipsEvents {
        GAMES,
        APPS,
        HOME
    }

    private void hideChipCancelButton(CheckBox checkBox) {
        if (Build.VERSION.SDK_INT >= 17) {
            checkBox.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private void setupChipsListeners() {
        this.gamesChip.setOnCheckedChangeListener(new C3114p(this));
        this.appsChip.setOnCheckedChangeListener(new C3138r(this));
    }

    private void showChipCancelButton(CheckBox checkBox) {
        Drawable drawable = getResources().getDrawable(this.themeManager.getAttributeForTheme(C1086R.attr.cancelChipDrawable).resourceId);
        if (Build.VERSION.SDK_INT >= 17) {
            checkBox.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11588a(CompoundButton compoundButton, boolean z) {
        if (z) {
            showChipCancelButton(this.gamesChip);
        } else {
            hideChipCancelButton(this.gamesChip);
        }
    }

    public C5368e<Boolean> appsChipClicked() {
        return C10695a.m36221a(this.appsChip).mo18694j(new C3090n(this)).mo18664b(new C3102o(this));
    }

    /* renamed from: b */
    public /* synthetic */ void mo11592b(CompoundButton compoundButton, boolean z) {
        if (z) {
            showChipCancelButton(this.appsChip);
        } else {
            hideChipCancelButton(this.appsChip);
        }
    }

    public void dismissEskillsDialog() {
        this.eskillsHomeDialog.dismissDialog();
    }

    public void dismissPromotionsDialog() {
        this.promotionsHomeDialog.dismissDialog();
    }

    public C5368e<String> eskillsHomeDialogClicked() {
        return this.eskillsHomeDialog.dialogClicked();
    }

    public void expandChips() {
        this.appBarLayout.mo30729a(true, true);
    }

    public C5368e<Boolean> gamesChipClicked() {
        return C10695a.m36221a(this.gamesChip).mo18694j(new C3126q(this)).mo18664b(new C3150s(this));
    }

    public C5368e<String> gdprDialogClicked() {
        return this.gdprDialog.dialogClicked();
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(HomeContainerFragment.class.getSimpleName(), "", StoreContext.home.name());
    }

    public void hidePromotionsIcon() {
        this.promotionsIcon.setVisibility(8);
        this.promotionsTicker.setVisibility(8);
    }

    public C5368e<ChipsEvents> isChipChecked() {
        return this.chipCheckedEvent;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.chipCheckedEvent = C12871b.m41468p();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_home_container, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        PromotionsHomeDialog promotionsHomeDialog2 = this.promotionsHomeDialog;
        if (promotionsHomeDialog2 != null) {
            promotionsHomeDialog2.destroyDialog();
            this.promotionsHomeDialog = null;
        }
        EskillsHomeDialog eskillsHomeDialog2 = this.eskillsHomeDialog;
        if (eskillsHomeDialog2 != null) {
            eskillsHomeDialog2.destroyDialog();
            this.eskillsHomeDialog = null;
        }
        LoggedInTermsAndConditionsDialog loggedInTermsAndConditionsDialog = this.gdprDialog;
        if (loggedInTermsAndConditionsDialog != null) {
            loggedInTermsAndConditionsDialog.destroyDialog();
            this.gdprDialog = null;
        }
        this.promotionsIcon = null;
        this.promotionsTicker = null;
        this.userAvatar = null;
        this.gamesChip = null;
        this.appsChip = null;
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public void onResume() {
        super.onResume();
        ChipsEvents chipsEvents = ChipsEvents.HOME;
        if (this.gamesChip.isChecked()) {
            chipsEvents = ChipsEvents.GAMES;
        } else if (this.appsChip.isChecked()) {
            chipsEvents = ChipsEvents.APPS;
        }
        this.chipCheckedEvent.onNext(chipsEvents);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.userAvatar = (ImageView) view.findViewById(C1086R.C1088id.user_actionbar_icon);
        this.promotionsIcon = (ImageView) view.findViewById(C1086R.C1088id.promotions_icon);
        this.promotionsTicker = (TextView) view.findViewById(C1086R.C1088id.promotions_ticker);
        this.promotionsHomeDialog = new PromotionsHomeDialog(getContext());
        this.eskillsHomeDialog = new EskillsHomeDialog(getContext());
        this.gdprDialog = new LoggedInTermsAndConditionsDialog(getContext());
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        this.gamesChip = (CheckBox) view.findViewById(C1086R.C1088id.games_chip);
        this.appsChip = (CheckBox) view.findViewById(C1086R.C1088id.apps_chip);
        this.appBarLayout = (AppBarLayout) view.findViewById(C1086R.C1088id.app_bar_layout);
        setupChipsListeners();
        attachPresenter(this.presenter);
    }

    public C5368e<String> promotionsHomeDialogClicked() {
        return this.promotionsHomeDialog.dialogClicked();
    }

    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform((int) C1086R.C1087drawable.ic_account_circle, this.userAvatar);
    }

    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1086R.C1087drawable.ic_account_circle);
    }

    public void showAvatar() {
        this.userAvatar.setVisibility(0);
    }

    public void showEskillsHomeDialog() {
        this.eskillsHomeDialog.showDialog();
    }

    public void showPromotionsHomeDialog(HomePromotionsWrapper homePromotionsWrapper) {
        this.promotionsHomeDialog.showDialog(homePromotionsWrapper);
    }

    public void showPromotionsHomeIcon(HomePromotionsWrapper homePromotionsWrapper) {
        this.promotionsIcon.setVisibility(0);
        if (homePromotionsWrapper.getPromotions() > 0) {
            if (homePromotionsWrapper.getPromotions() >= 10 || homePromotionsWrapper.getTotalUnclaimedAppcValue() <= 0.0f) {
                this.promotionsTicker.setText("9+");
            } else {
                this.promotionsTicker.setText(Integer.toString(homePromotionsWrapper.getPromotions()));
            }
            this.promotionsTicker.setVisibility(0);
        }
    }

    public void showTermsAndConditionsDialog() {
        this.gdprDialog.showDialog();
    }

    public C5368e<Void> toolbarPromotionsClick() {
        return C10695a.m36221a(this.promotionsIcon);
    }

    public C5368e<Void> toolbarUserClick() {
        return C10695a.m36221a(this.userAvatar);
    }

    public void uncheckChips() {
        this.gamesChip.setChecked(false);
        this.appsChip.setChecked(false);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11587a(Void voidR) {
        return Boolean.valueOf(this.appsChip.isChecked());
    }

    /* renamed from: b */
    public /* synthetic */ Boolean mo11591b(Void voidR) {
        return Boolean.valueOf(this.gamesChip.isChecked());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11589a(Boolean bool) {
        if (this.gamesChip.isChecked()) {
            this.gamesChip.setChecked(false);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo11593b(Boolean bool) {
        if (this.appsChip.isChecked()) {
            this.appsChip.setChecked(false);
        }
    }
}
