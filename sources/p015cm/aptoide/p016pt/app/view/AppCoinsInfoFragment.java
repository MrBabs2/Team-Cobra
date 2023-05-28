package p015cm.aptoide.p016pt.app.view;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0394a;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.aptoideviews.video.YoutubePlayer;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.editorial.ScrollEvent;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.AppCoinsInfoPresenter;
import p015cm.aptoide.p016pt.view.BackButtonFragment;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p112n.p118g.p301a.p303b.p304a.p305a.C10668b;
import p112n.p118g.p301a.p303b.p306b.p307a.C10676b;
import p112n.p118g.p301a.p310c.C10695a;
import p112n.p118g.p301a.p310c.C10706f;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.AppCoinsInfoFragment */
public class AppCoinsInfoFragment extends BackButtonFragment implements AppCoinsInfoView, NotBottomNavigationView {
    public static final String NAVIGATE_TO_ESKILLS = "navigateToESkills";
    private AppBarLayout appBarLayout;
    private View appCardView;
    private View appCardViewLayout;
    @Inject
    AppCoinsInfoPresenter appCoinsInfoPresenter;
    private TextView appcMessageAppCoinsSection1;
    private TextView appcMessageAppcoinsSection2a;
    private TextView appcMessageAppcoinsSection3;
    private TextView appcMessageAppcoinsSection4;
    /* access modifiers changed from: private */
    public View bottomAppCardView;
    private View bottomAppCardViewLayout;
    private Button bottomInstallButton;
    private Button catappultDevButton;
    /* access modifiers changed from: private */
    public C12871b<Void> eSkillsClick;
    private View eSkillsViewBackground;
    private Button installButton;
    @Inject
    @Named
    float screenHeight;
    @Inject
    @Named
    float screenWidth;
    private NestedScrollView scrollView;
    private SocialMediaView socialMediaView;
    private Toolbar toolbar;
    private YoutubePlayer youtubePlayer;

    /* renamed from: a */
    static /* synthetic */ void m4600a(View view, AppBarLayout appBarLayout2, int i) {
        float abs = 1.0f - (((float) Math.abs(i)) / ((float) appBarLayout2.getTotalScrollRange()));
        view.findViewById(C1086R.C1088id.appc_header_text).setAlpha(abs);
        view.findViewById(C1086R.C1088id.app_graphic_guy).setAlpha(abs);
    }

    private void configureAppCardAnimation(View view, View view2, float f, int i, boolean z) {
        final View view3 = view2;
        final int i2 = i;
        final boolean z2 = z;
        final View view4 = view;
        view.animate().scaleY(f).scaleX(f).alpha(0.0f).setDuration((long) i).setListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (z2) {
                    view4.setVisibility(4);
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                view3.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration((long) i2).setListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationEnd(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        view3.setVisibility(0);
                    }
                }).start();
            }
        }).start();
    }

    private String getAppCoinsLogoString() {
        return String.format("<img width='24px' height='20px' src=\"%1$s\"/>", new Object[]{Integer.valueOf(C1086R.C1087drawable.ic_spend_appc)});
    }

    private Html.ImageGetter getImageGetter() {
        return new C1478c(this);
    }

    public static AppCoinsInfoFragment newInstance(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(NAVIGATE_TO_ESKILLS, z);
        AppCoinsInfoFragment appCoinsInfoFragment = new AppCoinsInfoFragment();
        appCoinsInfoFragment.setArguments(bundle);
        return appCoinsInfoFragment;
    }

    private void setESkillsTextView() {
        String string = getString(C1086R.string.appc_info_view_eskills_body);
        String string2 = getString(C1086R.string.appc_info_view_eskills_body_button);
        String format = String.format(string, new Object[]{string2});
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new ClickableSpan() {
            public void onClick(View view) {
                AppCoinsInfoFragment.this.eSkillsClick.onNext(null);
            }
        }, format.indexOf(string2), format.indexOf(string2) + string2.length(), 33);
        this.appcMessageAppcoinsSection4.setText(spannableString);
        this.appcMessageAppcoinsSection4.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setupBottomAppBar() {
        this.bottomAppCardView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (!AppCoinsInfoFragment.this.isAppItemShown()) {
                    AppCoinsInfoFragment.this.addBottomCardAnimation();
                }
                AppCoinsInfoFragment.this.bottomAppCardView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private void setupTextView(String str, TextView textView, Object... objArr) {
        textView.setText(Html.fromHtml(String.format(str, objArr), getImageGetter(), (Html.TagHandler) null));
    }

    private void setupToolbar() {
        this.toolbar.setTitle((int) C1086R.string.appc_title_about_appcoins);
        this.toolbar.setTitleTextColor(-1);
        this.toolbar.setSubtitleTextColor(-1);
        C0076d dVar = (C0076d) getActivity();
        dVar.setSupportActionBar(this.toolbar);
        C0069a supportActionBar = dVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo188d(true);
        }
    }

    public void addBottomCardAnimation() {
        configureAppCardAnimation(this.appCardViewLayout, this.bottomAppCardViewLayout, 0.1f, 300, false);
    }

    public C5368e<Void> appCoinsWalletLinkClick() {
        return C10695a.m36221a(this.appcMessageAppcoinsSection2a);
    }

    public C5368e<ScrollEvent> appItemVisibilityChanged() {
        return C5368e.m10258c(C10676b.m36205a(this.scrollView), (C5368e<C10706f>) C10668b.m36200a(this.appBarLayout)).mo18694j(new C1460b(this)).mo18694j(C1493ce.f4004f).mo18674c(C1623ie.f4171f);
    }

    public C5368e<Void> cardViewClick() {
        return C10695a.m36221a(this.appCardView);
    }

    public C5368e<Void> catappultButtonClick() {
        return C10695a.m36221a(this.catappultDevButton);
    }

    public C5368e<Void> eSkillsClick() {
        return this.eSkillsClick;
    }

    public void focusOnESkillsSection() {
        this.eSkillsViewBackground.startAnimation(AnimationUtils.loadAnimation(getContext().getApplicationContext(), C1086R.anim.animation_blink));
        this.scrollView.mo2389b(0, this.appcMessageAppcoinsSection4.getBottom());
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(AppCoinsInfoFragment.class.getSimpleName());
    }

    public C5368e<Void> installButtonClick() {
        return C5368e.m10254b(C10695a.m36221a(this.installButton), C10695a.m36221a(this.bottomInstallButton));
    }

    public boolean isAppItemShown() {
        Rect rect = new Rect();
        this.appCardView.getLocalVisibleRect(rect);
        return rect.intersect(new Rect(0, 0, (int) this.screenWidth, ((int) this.screenHeight) - (this.appCardView.getHeight() * 2)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_appcoins_info, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.eSkillsClick = null;
    }

    public void onDestroyView() {
        this.toolbar = null;
        this.appCardView = null;
        this.installButton = null;
        this.bottomInstallButton = null;
        this.catappultDevButton = null;
        this.appcMessageAppCoinsSection1 = null;
        this.appcMessageAppcoinsSection2a = null;
        this.appcMessageAppcoinsSection3 = null;
        this.appcMessageAppcoinsSection4 = null;
        this.eSkillsViewBackground = null;
        this.youtubePlayer = null;
        this.scrollView = null;
        this.socialMediaView = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        this.catappultDevButton = (Button) view.findViewById(C1086R.C1088id.catappult_dev_button);
        this.scrollView = (NestedScrollView) view.findViewById(C1086R.C1088id.about_appcoins_scroll);
        this.appcMessageAppcoinsSection2a = (TextView) view.findViewById(C1086R.C1088id.appc_message_appcoins_section_2a);
        this.appcMessageAppcoinsSection3 = (TextView) view.findViewById(C1086R.C1088id.appc_message_appcoins_section_3);
        this.appcMessageAppcoinsSection4 = (TextView) view.findViewById(C1086R.C1088id.appc_message_appcoins_section_4);
        this.eSkillsViewBackground = view.findViewById(C1086R.C1088id.background_animation);
        this.youtubePlayer = (YoutubePlayer) view.findViewById(C1086R.C1088id.youtube_player);
        this.appcMessageAppCoinsSection1 = (TextView) view.findViewById(C1086R.C1088id.appc_message_appcoins_section_1);
        View findViewById = view.findViewById(C1086R.C1088id.app_card_layout);
        this.appCardViewLayout = findViewById;
        this.appCardView = findViewById.findViewById(C1086R.C1088id.app_cardview);
        this.installButton = (Button) this.appCardViewLayout.findViewById(C1086R.C1088id.appview_install_button);
        ((TextView) this.appCardView.findViewById(C1086R.C1088id.app_title_textview)).setText(getString(C1086R.string.appc_title_settings_appcoins_wallet));
        ((ImageView) this.appCardView.findViewById(C1086R.C1088id.app_icon_imageview)).setImageDrawable(C0394a.m1917c(getContext(), C1086R.C1087drawable.appcoins_wallet_icon));
        View findViewById2 = view.findViewById(C1086R.C1088id.app_cardview_layout);
        this.bottomAppCardViewLayout = findViewById2;
        this.bottomAppCardView = findViewById2.findViewById(C1086R.C1088id.app_cardview);
        this.bottomInstallButton = (Button) this.bottomAppCardViewLayout.findViewById(C1086R.C1088id.appview_install_button);
        ((TextView) this.bottomAppCardView.findViewById(C1086R.C1088id.app_title_textview)).setText(getString(C1086R.string.appc_title_settings_appcoins_wallet));
        ((ImageView) this.bottomAppCardView.findViewById(C1086R.C1088id.app_icon_imageview)).setImageDrawable(C0394a.m1917c(getContext(), C1086R.C1087drawable.appcoins_wallet_icon));
        AppBarLayout appBarLayout2 = (AppBarLayout) view.findViewById(C1086R.C1088id.app_bar_layout);
        this.appBarLayout = appBarLayout2;
        appBarLayout2.mo30728a((AppBarLayout.C8416e) new C1496d(view));
        this.socialMediaView = (SocialMediaView) view.findViewById(C1086R.C1088id.social_media_view);
        this.eSkillsClick = C12871b.m41468p();
        setESkillsTextView();
        setHasOptionsMenu(true);
        setupToolbar();
        setupBottomAppBar();
        this.youtubePlayer.loadVideo("uwoq5sLzZrs", true);
        attachPresenter(this.appCoinsInfoPresenter);
    }

    public void openApp(String str) {
        AptoideUtils.SystemU.openApp(str, getContext().getPackageManager(), getContext());
    }

    public void removeBottomCardAnimation() {
        configureAppCardAnimation(this.bottomAppCardViewLayout, this.appCardViewLayout, 0.0f, 300, true);
    }

    public void setBonusAppc(int i) {
        this.appcMessageAppCoinsSection1.setText(String.format(getString(C1086R.string.appc_info_view_body_1_variable), new Object[]{Integer.valueOf(i)}));
        setupTextView(getString(C1086R.string.appc_info_view_title_5_variable), this.appcMessageAppcoinsSection3, Integer.valueOf(i), getAppCoinsLogoString());
    }

    public void setButtonText(boolean z) {
        String string = getResources().getString(C1086R.string.appview_button_install);
        if (z) {
            this.installButton.setText(getResources().getString(C1086R.string.appview_button_open));
            this.bottomInstallButton.setText(getResources().getString(C1086R.string.appview_button_open));
            return;
        }
        this.installButton.setText(string);
        this.bottomInstallButton.setText(string);
    }

    public void setNoBonusAppcView() {
        this.appcMessageAppCoinsSection1.setText(getString(C1086R.string.appc_info_view_body_1_variable_no_data));
        setupTextView(getString(C1086R.string.appc_info_view_title_5_variable_no_data), this.appcMessageAppcoinsSection3, getAppCoinsLogoString());
    }

    public C5368e<SocialMediaView.SocialMediaType> socialMediaClick() {
        return this.socialMediaView.onSocialMediaClick();
    }

    /* renamed from: a */
    public /* synthetic */ Drawable mo7147a(String str) {
        Drawable drawable = null;
        try {
            drawable = getResources().getDrawable(Integer.parseInt(str));
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            return drawable;
        } catch (Resources.NotFoundException e) {
            Log.e("log_tag", "Image not found. Check the ID.", e);
            return drawable;
        } catch (NumberFormatException e2) {
            Log.e("log_tag", "Source string not a valid resource ID.", e2);
            return drawable;
        }
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo7148a(Object obj) {
        return Boolean.valueOf(isAppItemShown());
    }
}
