package p015cm.aptoide.p016pt.autoupdate;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogView;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001d"}, mo16641d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateDialogFragment;", "Lcm/aptoide/pt/view/fragment/BaseDialogView;", "Lcm/aptoide/pt/autoupdate/AutoUpdateDialogView;", "()V", "presenter", "Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;", "getPresenter", "()Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;", "setPresenter", "(Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;)V", "dismissDialog", "", "notNowClicked", "Lrx/Observable;", "Ljava/lang/Void;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "shouldUseDefaultDialogStyle", "", "updateClicked", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateDialogFragment */
/* compiled from: AutoUpdateDialogFragment.kt */
public final class AutoUpdateDialogFragment extends BaseDialogView implements AutoUpdateDialogView {
    private HashMap _$_findViewCache;
    @Inject
    public AutoUpdateDialogPresenter presenter;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void dismissDialog() {
        dismiss();
    }

    public final AutoUpdateDialogPresenter getPresenter() {
        AutoUpdateDialogPresenter autoUpdateDialogPresenter = this.presenter;
        if (autoUpdateDialogPresenter != null) {
            return autoUpdateDialogPresenter;
        }
        C10202j.m34181d("presenter");
        throw null;
    }

    public C5368e<Void> notNowClicked() {
        C5368e<Void> a = C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.not_now_button));
        C10202j.m34174a((Object) a, "RxView.clicks(not_now_button)");
        return a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        C10202j.m34178b(layoutInflater, "inflater");
        Dialog dialog = getDialog();
        if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
            window2.requestFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (!(dialog2 == null || (window = dialog2.getWindow()) == null)) {
            window.setBackgroundDrawableResource(C1086R.C1087drawable.transparent);
        }
        return layoutInflater.inflate(C1086R.layout.auto_update_dialog_fragment, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C10202j.m34178b(view, "view");
        super.onViewCreated(view, bundle);
        AutoUpdateDialogPresenter autoUpdateDialogPresenter = this.presenter;
        if (autoUpdateDialogPresenter != null) {
            attachPresenter(autoUpdateDialogPresenter);
        } else {
            C10202j.m34181d("presenter");
            throw null;
        }
    }

    public final void setPresenter(AutoUpdateDialogPresenter autoUpdateDialogPresenter) {
        C10202j.m34178b(autoUpdateDialogPresenter, "<set-?>");
        this.presenter = autoUpdateDialogPresenter;
    }

    public boolean shouldUseDefaultDialogStyle() {
        return false;
    }

    public C5368e<Void> updateClicked() {
        C5368e<Void> a = C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.update_button));
        C10202j.m34174a((Object) a, "RxView.clicks(update_button)");
        return a;
    }
}
