package p015cm.aptoide.p016pt.view.wizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.BackButton;
import p015cm.aptoide.p016pt.view.BackButtonFragment;

/* renamed from: cm.aptoide.pt.view.wizard.WizardPageOneFragment */
public class WizardPageOneFragment extends BackButtonFragment {
    private BackButton.ClickHandler clickHandler;

    /* renamed from: b */
    static /* synthetic */ boolean m10515b() {
        return false;
    }

    public static Fragment newInstance() {
        return new WizardPageOneFragment();
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(WizardPageOneFragment.class.getSimpleName());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_wizard_model_page, viewGroup, false);
    }

    public void onDestroyView() {
        unregisterClickHandler(this.clickHandler);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5541d dVar = C5541d.f9808a;
        this.clickHandler = dVar;
        registerClickHandler(dVar);
    }
}
