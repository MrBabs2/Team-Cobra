package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p015cm.aptoide.p016pt.permission.PermissionServiceFragment;

/* renamed from: cm.aptoide.pt.view.fragment.UIComponentFragment */
public abstract class UIComponentFragment extends PermissionServiceFragment implements UiComponent {
    public void loadExtras(Bundle bundle) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            loadExtras(getArguments());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(getContentViewId(), viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setupViews();
    }

    public void setupToolbar() {
    }

    public abstract void setupViews();
}
