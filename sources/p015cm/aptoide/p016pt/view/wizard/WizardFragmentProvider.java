package p015cm.aptoide.p016pt.view.wizard;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.LoginSignUpFragment;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;

/* renamed from: cm.aptoide.pt.view.wizard.WizardFragmentProvider */
public class WizardFragmentProvider {
    private static final int WIZARD_LOGIN_POSITION = 2;
    private static final int WIZARD_STEP_ONE_POSITION = 0;
    private static final int WIZARD_STEP_TWO_POSITION = 1;
    private ThemeManager themeManager;

    public WizardFragmentProvider(ThemeManager themeManager2) {
        this.themeManager = themeManager2;
    }

    private Fragment setFragmentLogFlag(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean(NavigationTrackFragment.SHOULD_REGISTER_VIEW, false);
        fragment.setArguments(arguments);
        return fragment;
    }

    public int getCount(Boolean bool) {
        return bool.booleanValue() ? 2 : 3;
    }

    public Fragment getItem(int i) {
        Fragment fragment;
        if (i == 0) {
            fragment = WizardPageOneFragment.newInstance();
        } else if (i == 1) {
            fragment = WizardPageTwoFragment.newInstance();
        } else if (i == 2) {
            fragment = LoginSignUpFragment.newInstance(true, false, true, true);
        } else {
            throw new IllegalArgumentException("Invalid wizard fragment position: " + i);
        }
        return setFragmentLogFlag(fragment);
    }

    public Integer[] getTransitionColors() {
        return new Integer[]{Integer.valueOf(this.themeManager.getAttributeForTheme(C1086R.attr.wizardFirstColor).resourceId), Integer.valueOf(this.themeManager.getAttributeForTheme(C1086R.attr.wizardSecondColor).resourceId), Integer.valueOf(this.themeManager.getAttributeForTheme(C1086R.attr.wizardThirdColor).resourceId)};
    }
}
