package p015cm.aptoide.p016pt.themes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.feature.NewFeatureDialogPresenter;
import p015cm.aptoide.p016pt.view.fragment.BaseBottomSheetDialogView;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/pt/themes/NewFeatureDialogFragment;", "Lcm/aptoide/pt/view/fragment/BaseBottomSheetDialogView;", "Lcm/aptoide/pt/themes/NewFeatureDialogView;", "()V", "presenter", "Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;", "getPresenter", "()Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;", "setPresenter", "(Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;)V", "clickDismiss", "Lrx/Observable;", "Ljava/lang/Void;", "clickTurnItOn", "dismissView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.themes.NewFeatureDialogFragment */
/* compiled from: NewFeatureDialogFragment.kt */
public final class NewFeatureDialogFragment extends BaseBottomSheetDialogView implements NewFeatureDialogView {
    private HashMap _$_findViewCache;
    @Inject
    public NewFeatureDialogPresenter presenter;

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

    public C5368e<Void> clickDismiss() {
        C5368e<Void> a = C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.dismissButton));
        C10202j.m34174a((Object) a, "RxView.clicks(dismissButton)");
        return a;
    }

    public C5368e<Void> clickTurnItOn() {
        C5368e<Void> a = C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.turnItOnButton));
        C10202j.m34174a((Object) a, "RxView.clicks(turnItOnButton)");
        return a;
    }

    public void dismissView() {
        dismiss();
    }

    public final NewFeatureDialogPresenter getPresenter() {
        NewFeatureDialogPresenter newFeatureDialogPresenter = this.presenter;
        if (newFeatureDialogPresenter != null) {
            return newFeatureDialogPresenter;
        }
        C10202j.m34181d("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C10202j.m34178b(layoutInflater, "inflater");
        return layoutInflater.inflate(C1086R.layout.dialog_new_feature, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C10202j.m34178b(view, "view");
        super.onViewCreated(view, bundle);
        NewFeatureDialogPresenter newFeatureDialogPresenter = this.presenter;
        if (newFeatureDialogPresenter != null) {
            attachPresenter(newFeatureDialogPresenter);
        } else {
            C10202j.m34181d("presenter");
            throw null;
        }
    }

    public final void setPresenter(NewFeatureDialogPresenter newFeatureDialogPresenter) {
        C10202j.m34178b(newFeatureDialogPresenter, "<set-?>");
        this.presenter = newFeatureDialogPresenter;
    }
}
