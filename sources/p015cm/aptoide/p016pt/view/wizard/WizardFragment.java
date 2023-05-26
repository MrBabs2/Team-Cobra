package p015cm.aptoide.p016pt.view.wizard;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewpager.widget.C0809a;
import androidx.viewpager.widget.ViewPager;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.LoginBottomSheet;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.custom.AptoideViewPager;
import p015cm.aptoide.p016pt.view.fragment.UIComponentFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;

/* renamed from: cm.aptoide.pt.view.wizard.WizardFragment */
public class WizardFragment extends UIComponentFragment implements WizardView, NotBottomNavigationView {
    public static final int LAYOUT = 2131493054;
    private static final String PAGE_INDEX = "page_index";
    private View animatedColorView;
    private int currentPosition;
    private boolean isInPortraitMode;
    private boolean isUserLoggedIn;
    private LoginBottomSheet loginBottomSheet;
    private ViewPager.C0807m pageChangeListener;
    private RadioGroup radioGroup;
    private Runnable registerViewpagerCurrentItem;
    private View skipButton;
    private View skipOrNextLayout;
    private Integer[] transitionColors;
    private AptoideViewPager viewPager;
    private WizardPagerAdapter viewPagerAdapter;
    private List<RadioButton> wizardButtons;
    @Inject
    WizardFragmentProvider wizardFragmentProvider;
    @Inject
    WizardPresenter wizardPresenter;

    private void createRadioButtons() {
        int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(10, getResources());
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(pixelsForDip, pixelsForDip);
        int pixelsForDip2 = AptoideUtils.ScreenU.getPixelsForDip(2, getResources());
        layoutParams.setMargins(pixelsForDip2, pixelsForDip2, pixelsForDip2, pixelsForDip2);
        int count = this.viewPagerAdapter.getCount();
        this.wizardButtons = new ArrayList(count);
        Context context = getContext();
        for (int i = 0; i < count; i++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setLayoutParams(layoutParams);
            radioButton.setButtonDrawable(17170445);
            radioButton.setBackgroundResource(C1086R.C1087drawable.wizard_custom_indicator);
            radioButton.setClickable(false);
            this.radioGroup.addView(radioButton);
            this.wizardButtons.add(radioButton);
        }
    }

    public static WizardFragment newInstance() {
        return new WizardFragment();
    }

    /* renamed from: a */
    public /* synthetic */ void mo18902a(LoginBottomSheet.State state) {
        if (this.isInPortraitMode && LoginBottomSheet.State.EXPANDED.equals(state)) {
            this.skipOrNextLayout.setVisibility(8);
        } else if (LoginBottomSheet.State.COLLAPSED.equals(state)) {
            this.skipOrNextLayout.setVisibility(0);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo18904b() {
        AptoideViewPager aptoideViewPager = this.viewPager;
        if (aptoideViewPager != null) {
            this.pageChangeListener.onPageSelected(aptoideViewPager.getCurrentItem());
        }
    }

    public void bindViews(View view) {
        this.viewPager = (AptoideViewPager) view.findViewById(C1086R.C1088id.view_pager);
        this.skipOrNextLayout = view.findViewById(C1086R.C1088id.skip_next_layout);
        this.radioGroup = (RadioGroup) view.findViewById(C1086R.C1088id.view_pager_radio_group);
        this.skipButton = view.findViewById(C1086R.C1088id.skip_button);
        boolean z = true;
        if (getActivity().getResources().getConfiguration().orientation != 1) {
            z = false;
        }
        this.isInPortraitMode = z;
        this.animatedColorView = view.findViewById(C1086R.C1088id.animated_color_view);
    }

    public C5328b createWizardAdapter(boolean z) {
        this.isUserLoggedIn = z;
        return C5328b.m10169d(new C5540c(this, z));
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_wizard;
    }

    public int getCount() {
        return this.wizardFragmentProvider.getCount(Boolean.valueOf(this.isUserLoggedIn));
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(WizardFragment.class.getSimpleName());
    }

    public void handleColorTransitions(int i, float f, int i2) {
        if (this.animatedColorView == null) {
            return;
        }
        if (i < this.viewPagerAdapter.getCount() - 1 && i < this.transitionColors.length - 1) {
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Integer[] numArr = this.transitionColors;
            this.animatedColorView.setBackgroundColor(((Integer) argbEvaluator.evaluate(f, numArr[i], numArr[i + 1])).intValue());
        } else if (this.viewPagerAdapter.isLoggedIn()) {
            View view = this.animatedColorView;
            Integer[] numArr2 = this.transitionColors;
            view.setBackgroundColor(numArr2[numArr2.length - 2].intValue());
        } else {
            View view2 = this.animatedColorView;
            Integer[] numArr3 = this.transitionColors;
            view2.setBackgroundColor(numArr3[numArr3.length - 1].intValue());
        }
    }

    public void handleSelectedPage(int i) {
        RadioButton radioButton;
        List<RadioButton> list = this.wizardButtons;
        if (list != null && i < list.size() && (radioButton = this.wizardButtons.get(i)) != null) {
            radioButton.setChecked(true);
        }
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.currentPosition = 0;
        if (bundle != null) {
            this.currentPosition = bundle.getInt(PAGE_INDEX, 0);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof LoginBottomSheet) {
            this.loginBottomSheet = (LoginBottomSheet) context;
            return;
        }
        throw new IllegalStateException("Context should implement " + LoginBottomSheet.class.getSimpleName());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        Integer[] transitionColors2 = this.wizardFragmentProvider.getTransitionColors();
        this.transitionColors = new Integer[transitionColors2.length];
        for (int i = 0; i < transitionColors2.length; i++) {
            this.transitionColors[i] = Integer.valueOf(getContext().getResources().getColor(transitionColors2[i].intValue()));
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        this.viewPager.removeOnPageChangeListener(this.pageChangeListener);
        this.viewPager.setAdapter((C0809a) null);
        this.viewPager.removeCallbacks(this.registerViewpagerCurrentItem);
        this.viewPager.removeOnPageChangeListener((ViewPager.C0804j) null);
        this.registerViewpagerCurrentItem = null;
        this.viewPager = null;
        this.skipOrNextLayout = null;
        this.wizardButtons = null;
        this.radioGroup = null;
        this.skipButton = null;
        this.animatedColorView = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(PAGE_INDEX, this.viewPager.getCurrentItem());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        attachPresenter(this.wizardPresenter);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        loadExtras(bundle);
    }

    public void setupViews() {
        this.loginBottomSheet.state().mo18644a(C5376a.m10346b()).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18675c(new C5539b(this));
        this.pageChangeListener = new ViewPager.C0807m() {
            public void onPageSelected(int i) {
                if (i == 0) {
                    WizardFragment.this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build(WizardPageOneFragment.class.getSimpleName(), "0"));
                }
            }
        };
        this.viewPager.addOnPageChangeListener(this.wizardPresenter);
        this.viewPager.addOnPageChangeListener(this.pageChangeListener);
        C5538a aVar = new C5538a(this);
        this.registerViewpagerCurrentItem = aVar;
        this.viewPager.post(aVar);
    }

    public void skipWizard() {
        getActivity().onBackPressed();
    }

    public C5368e<Void> skipWizardClick() {
        return C10695a.m36221a(this.skipButton);
    }

    /* renamed from: a */
    public /* synthetic */ void mo18903a(boolean z) {
        this.viewPagerAdapter = new WizardPagerAdapter(getChildFragmentManager(), Boolean.valueOf(z), this.wizardFragmentProvider);
        createRadioButtons();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.setCurrentItem(this.currentPosition);
        handleSelectedPage(this.currentPosition);
    }
}
