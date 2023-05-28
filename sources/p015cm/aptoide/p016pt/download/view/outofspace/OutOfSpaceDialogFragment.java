package p015cm.aptoide.p016pt.download.view.outofspace;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogView;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010!\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\u0017\u0010'\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0014H\u0016J\u0016\u0010*\u001a\u00020\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020&0\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogFragment;", "Lcm/aptoide/pt/view/fragment/BaseDialogView;", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;", "()V", "controller", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceController;", "presenter", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;", "getPresenter", "()Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;", "setPresenter", "(Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;)V", "requiredSpace", "", "dismissDialogClick", "Lrx/Observable;", "Ljava/lang/Void;", "getDialogStyle", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "onViewStateRestored", "requiredSpaceToInstall", "requiredAppSpace", "setOutOfSpaceMessage", "requiredSpaceString", "", "setupViews", "(Ljava/lang/Long;)V", "showGeneralOutOfSpaceError", "showInstalledApps", "installedApps", "", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "uninstallClick", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogFragment */
/* compiled from: OutOfSpaceDialogFragment.kt */
public final class OutOfSpaceDialogFragment extends BaseDialogView implements OutOfSpaceDialogView {
    public static final String APP_PACKAGE_NAME = "package_name";
    public static final String APP_SIZE = "app_size";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int OUT_OF_SPACE_REQUEST_CODE = 1994;
    private HashMap _$_findViewCache;
    private OutOfSpaceController controller;
    @Inject
    public OutOfSpaceDialogPresenter presenter;
    private long requiredSpace;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogFragment$Companion;", "", "()V", "APP_PACKAGE_NAME", "", "APP_SIZE", "OUT_OF_SPACE_REQUEST_CODE", "", "newInstance", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogFragment;", "requiredSpace", "", "packageName", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogFragment$Companion */
    /* compiled from: OutOfSpaceDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public final OutOfSpaceDialogFragment newInstance(long j, String str) {
            C10202j.m34178b(str, "packageName");
            OutOfSpaceDialogFragment outOfSpaceDialogFragment = new OutOfSpaceDialogFragment();
            Bundle bundle = new Bundle(2);
            bundle.putLong(OutOfSpaceDialogFragment.APP_SIZE, j);
            bundle.putString("package_name", str);
            outOfSpaceDialogFragment.setArguments(bundle);
            return outOfSpaceDialogFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void setOutOfSpaceMessage(String str) {
        String string = getString(C1086R.string.out_of_space_body, str);
        C10202j.m34174a((Object) string, "getString(R.string.out_o…     requiredSpaceString)");
        SpannableString spannableString = new SpannableString(string);
        String str2 = string;
        String str3 = str;
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1086R.color.default_orange_gradient_end)), C12131w.m40064a((CharSequence) str2, str3, 0, false, 6, (Object) null), C12131w.m40064a((CharSequence) str2, str3, 0, false, 6, (Object) null) + str.length(), 33);
        TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.out_of_space_description);
        C10202j.m34174a((Object) textView, "out_of_space_description");
        textView.setText(spannableString);
    }

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

    public C5368e<Void> dismissDialogClick() {
        C5368e<Void> b = C5368e.m10254b(C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.cancel_button)), C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.ok_button)));
        C10202j.m34174a((Object) b, "Observable.merge(RxView.…RxView.clicks(ok_button))");
        return b;
    }

    public int getDialogStyle() {
        return C1086R.attr.roundedDialogsTheme;
    }

    public final OutOfSpaceDialogPresenter getPresenter() {
        OutOfSpaceDialogPresenter outOfSpaceDialogPresenter = this.presenter;
        if (outOfSpaceDialogPresenter != null) {
            return outOfSpaceDialogPresenter;
        }
        C10202j.m34181d("presenter");
        throw null;
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
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1086R.layout.out_of_space_dialog_fragment, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C10202j.m34178b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController != null) {
            outOfSpaceController.onSaveInstanceState(bundle);
        } else {
            C10202j.m34181d("controller");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C10202j.m34178b(view, "view");
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.requiredSpace = arguments.getLong(APP_SIZE);
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        setupViews(Long.valueOf(this.requiredSpace));
        OutOfSpaceDialogPresenter outOfSpaceDialogPresenter = this.presenter;
        if (outOfSpaceDialogPresenter != null) {
            attachPresenter(outOfSpaceDialogPresenter);
        } else {
            C10202j.m34181d("presenter");
            throw null;
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController != null) {
            outOfSpaceController.onRestoreInstanceState(bundle);
        } else {
            C10202j.m34181d("controller");
            throw null;
        }
    }

    public void requiredSpaceToInstall(long j) {
        String formatBytes = AptoideUtils.StringU.formatBytes(j, false);
        C10202j.m34174a((Object) formatBytes, "AptoideUtils.StringU.for…(requiredAppSpace, false)");
        setOutOfSpaceMessage(formatBytes);
    }

    public final void setPresenter(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter) {
        C10202j.m34178b(outOfSpaceDialogPresenter, "<set-?>");
        this.presenter = outOfSpaceDialogPresenter;
    }

    public void setupViews(Long l) {
        this.controller = new OutOfSpaceController();
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) _$_findCachedViewById(C1086R.C1088id.unninstall_apps_list);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController != null) {
            epoxyRecyclerView.setController(outOfSpaceController);
            if (l != null) {
                l.longValue();
                String formatBytes = AptoideUtils.StringU.formatBytes(l.longValue(), false);
                C10202j.m34174a((Object) formatBytes, "AptoideUtils.StringU.for…tes(requiredSpace, false)");
                setOutOfSpaceMessage(formatBytes);
                return;
            }
            return;
        }
        C10202j.m34181d("controller");
        throw null;
    }

    public void showGeneralOutOfSpaceError() {
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.general_message_out_of_space_group);
        C10202j.m34174a((Object) group, "general_message_out_of_space_group");
        group.setVisibility(0);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.out_of_space_progress_bar);
        C10202j.m34174a((Object) progressBar, "out_of_space_progress_bar");
        progressBar.setVisibility(8);
    }

    public void showInstalledApps(List<InstalledApp> list) {
        C10202j.m34178b(list, "installedApps");
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.apps_list_group);
        C10202j.m34174a((Object) group, "apps_list_group");
        group.setVisibility(0);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.out_of_space_progress_bar);
        C10202j.m34174a((Object) progressBar, "out_of_space_progress_bar");
        progressBar.setVisibility(8);
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController != null) {
            outOfSpaceController.setData(list);
        } else {
            C10202j.m34181d("controller");
            throw null;
        }
    }

    public C5368e<String> uninstallClick() {
        OutOfSpaceController outOfSpaceController = this.controller;
        if (outOfSpaceController != null) {
            return outOfSpaceController.getUninstallEvent();
        }
        C10202j.m34181d("controller");
        throw null;
    }
}
