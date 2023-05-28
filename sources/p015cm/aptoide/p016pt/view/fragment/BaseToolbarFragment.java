package p015cm.aptoide.p016pt.view.fragment;

import android.view.View;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.view.fragment.BaseToolbarFragment */
public abstract class BaseToolbarFragment extends UIComponentFragment {
    private Toolbar toolbar;

    public void bindViews(View view) {
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Toolbar getToolbar() {
        return this.toolbar;
    }

    /* access modifiers changed from: protected */
    public boolean hasToolbar() {
        return this.toolbar != null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.toolbar = null;
    }

    public void setupToolbar() {
        if (hasToolbar()) {
            ((C0076d) getActivity()).setSupportActionBar(this.toolbar);
            boolean displayHomeUpAsEnabled = displayHomeUpAsEnabled();
            C0069a supportActionBar = ((C0076d) getActivity()).getSupportActionBar();
            supportActionBar.mo188d(displayHomeUpAsEnabled);
            supportActionBar.mo182a(this.toolbar.getTitle());
            setupToolbarDetails(this.toolbar);
        }
    }

    /* access modifiers changed from: protected */
    public void setupToolbarDetails(Toolbar toolbar2) {
    }

    public void setupViews() {
        setupToolbar();
    }
}
