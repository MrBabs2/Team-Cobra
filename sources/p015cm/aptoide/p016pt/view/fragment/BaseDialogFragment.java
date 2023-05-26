package p015cm.aptoide.p016pt.view.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import com.trello.rxlifecycle.p034h.p035a.C9014c;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.FlavourFragmentModule;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.BaseActivity;
import p015cm.aptoide.p016pt.view.FragmentComponent;
import p015cm.aptoide.p016pt.view.FragmentModule;
import p015cm.aptoide.p016pt.view.MainActivity;

/* renamed from: cm.aptoide.pt.view.fragment.BaseDialogFragment */
public class BaseDialogFragment extends C9014c {
    private FragmentComponent fragmentComponent;
    @Inject
    public ThemeManager themeManager;

    private FragmentModule getFragmentModule(BaseDialogFragment baseDialogFragment, Bundle bundle, Bundle bundle2, boolean z, String str) {
        return new FragmentModule(baseDialogFragment, bundle, bundle2, z, str);
    }

    public int getDialogStyle() {
        return C1086R.attr.dialogsTheme;
    }

    public FragmentComponent getFragmentComponent(Bundle bundle) {
        if (this.fragmentComponent == null) {
            this.fragmentComponent = ((BaseActivity) getActivity()).getActivityComponent().plus(getFragmentModule(this, bundle, getArguments(), ((AptoideApplication) getContext().getApplicationContext()).isCreateStoreUserPrivacyEnabled(), getActivity().getApplicationContext().getPackageName()), new FlavourFragmentModule());
        }
        return this.fragmentComponent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((MainActivity) getContext()).getActivityComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (getActivity() != null && shouldUseDefaultDialogStyle()) {
            setStyle(1, this.themeManager.getAttributeForTheme(getDialogStyle()).resourceId);
        }
        return super.onCreateDialog(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
        attributes.dimAmount = 0.6f;
        getDialog().getWindow().setAttributes(attributes);
        getDialog().getWindow().addFlags(2);
    }

    public boolean shouldUseDefaultDialogStyle() {
        return true;
    }
}
