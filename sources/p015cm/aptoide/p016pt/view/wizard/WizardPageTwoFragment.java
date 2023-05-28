package p015cm.aptoide.p016pt.view.wizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p015cm.aptoide.p016pt.view.BackButton;
import p015cm.aptoide.p016pt.view.BackButtonFragment;

/* renamed from: cm.aptoide.pt.view.wizard.WizardPageTwoFragment */
public class WizardPageTwoFragment extends BackButtonFragment {
    private BackButton.ClickHandler clickHandler;
    @Inject
    MarketResourceFormatter marketResourceFormatter;

    /* renamed from: b */
    static /* synthetic */ boolean m10516b() {
        return false;
    }

    public static Fragment newInstance() {
        return new WizardPageTwoFragment();
    }

    private void setText(View view) {
        ((TextView) view.findViewById(C1086R.C1088id.title)).setText(C1086R.string.wizard_title_viewpager_two);
        ((TextView) view.findViewById(C1086R.C1088id.description)).setText(this.marketResourceFormatter.formatString(getContext(), C1086R.string.wizard_sub_title_viewpager_two, new String[0]));
        ((ImageView) view.findViewById(C1086R.C1088id.wizard_icon)).setImageResource(C1086R.C1087drawable.wizard_2);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(WizardPageTwoFragment.class.getSimpleName());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1086R.layout.fragment_wizard_model_page, viewGroup, false);
        setText(inflate);
        return inflate;
    }

    public void onDestroyView() {
        unregisterClickHandler(this.clickHandler);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5542e eVar = C5542e.f9809a;
        this.clickHandler = eVar;
        registerClickHandler(eVar);
    }
}
