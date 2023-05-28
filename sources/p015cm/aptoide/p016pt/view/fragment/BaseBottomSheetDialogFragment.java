package p015cm.aptoide.p016pt.view.fragment;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.bottomsheet.C8462a;
import com.trello.rxlifecycle.p034h.p035a.C9013b;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.FlavourFragmentModule;
import p015cm.aptoide.p016pt.view.BaseActivity;
import p015cm.aptoide.p016pt.view.FragmentComponent;
import p015cm.aptoide.p016pt.view.FragmentModule;
import p015cm.aptoide.p016pt.view.MainActivity;

/* renamed from: cm.aptoide.pt.view.fragment.BaseBottomSheetDialogFragment */
public class BaseBottomSheetDialogFragment extends C9013b {
    private FragmentComponent fragmentComponent;

    private FragmentModule getFragmentModule(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Bundle bundle, Bundle bundle2, boolean z, String str) {
        return new FragmentModule(baseBottomSheetDialogFragment, bundle, bundle2, z, str);
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
        return new C8462a(requireContext(), getTheme());
    }
}
