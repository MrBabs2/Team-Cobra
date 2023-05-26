package p015cm.aptoide.p016pt.navigator;

import androidx.fragment.app.C0454b;
import androidx.fragment.app.Fragment;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.navigator.FragmentNavigator */
public interface FragmentNavigator {
    public static final String REQUEST_CODE_EXTRA = "cm.aptoide.pt.view.navigator.extra.REQUEST_CODE";

    void cleanBackStack();

    int getBackStackEntryCount();

    Fragment getFragment();

    Fragment getFragment(String str);

    String getTagByBackStackEntry(int i);

    void navigateForResult(Fragment fragment, int i, boolean z);

    String navigateTo(Fragment fragment, boolean z);

    void navigateToCleaningBackStack(Fragment fragment, boolean z);

    void navigateToDialogForResult(C0454b bVar, int i);

    void navigateToDialogFragment(C0454b bVar);

    void navigateToWithoutBackSave(Fragment fragment, boolean z);

    Fragment peekLast();

    boolean popBackStack();

    void popBackStackUntil(String str);

    void popDialogWithResult(Result result);

    void popWithResult(Result result);

    C5368e<Result> results(int i);
}
