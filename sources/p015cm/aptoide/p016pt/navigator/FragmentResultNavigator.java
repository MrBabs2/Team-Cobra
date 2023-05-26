package p015cm.aptoide.p016pt.navigator;

import android.os.Bundle;
import androidx.fragment.app.C0454b;
import androidx.fragment.app.C0462h;
import androidx.fragment.app.C0485m;
import androidx.fragment.app.Fragment;
import java.util.Map;
import p112n.p118g.p119b.C5303a;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.navigator.FragmentResultNavigator */
public class FragmentResultNavigator implements FragmentNavigator {
    private final int containerId;
    private final int enterAnimation;
    private final int exitAnimation;
    private final C0462h fragmentManager;
    private final C5303a<Map<Integer, Result>> resultRelay;
    private final Map<Integer, Result> results;

    public FragmentResultNavigator(C0462h hVar, int i, int i2, int i3, Map<Integer, Result> map, C5303a<Map<Integer, Result>> aVar) {
        this.fragmentManager = hVar;
        this.containerId = i;
        this.enterAnimation = i2;
        this.exitAnimation = i3;
        this.results = map;
        this.resultRelay = aVar;
    }

    /* renamed from: b */
    static /* synthetic */ Result m6523b(int i, Map map) {
        return (Result) map.get(Integer.valueOf(i));
    }

    private void handleNavigationResult(Result result) {
        this.results.put(Integer.valueOf(result.getRequestCode()), result);
        this.resultRelay.call(this.results);
    }

    private void setUpNavigationForResult(Fragment fragment, int i) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt(FragmentNavigator.REQUEST_CODE_EXTRA, i);
        fragment.setArguments(arguments);
    }

    public void cleanBackStack() {
        for (int i = 0; i < this.fragmentManager.mo2801c(); i++) {
            this.fragmentManager.mo2804f();
        }
        this.fragmentManager.mo2800b();
    }

    public int getBackStackEntryCount() {
        return this.fragmentManager.mo2801c();
    }

    public Fragment getFragment() {
        return this.fragmentManager.mo2790a(this.containerId);
    }

    public String getTagByBackStackEntry(int i) {
        return this.fragmentManager.mo2799b(i).getName();
    }

    public void navigateForResult(Fragment fragment, int i, boolean z) {
        setUpNavigationForResult(fragment, i);
        navigateTo(fragment, z);
    }

    public String navigateTo(Fragment fragment, boolean z) {
        String num = Integer.toString(this.fragmentManager.mo2801c());
        C0485m a = this.fragmentManager.mo2793a();
        int i = this.enterAnimation;
        int i2 = this.exitAnimation;
        a.mo2943a(i, i2, i, i2);
        a.mo2948a(num);
        if (z) {
            a.mo2951b(this.containerId, fragment, num);
        } else {
            a.mo2945a(this.containerId, fragment, num);
        }
        a.mo2675a();
        return num;
    }

    public void navigateToCleaningBackStack(Fragment fragment, boolean z) {
        cleanBackStack();
        navigateToWithoutBackSave(fragment, z);
    }

    public void navigateToDialogForResult(C0454b bVar, int i) {
        setUpNavigationForResult(bVar, i);
        navigateToDialogFragment(bVar);
    }

    public void navigateToDialogFragment(C0454b bVar) {
        bVar.show(this.fragmentManager, Integer.toString(this.fragmentManager.mo2801c()));
    }

    public void navigateToWithoutBackSave(Fragment fragment, boolean z) {
        C0485m a = this.fragmentManager.mo2793a();
        int i = this.enterAnimation;
        int i2 = this.exitAnimation;
        a.mo2943a(i, i2, i, i2);
        if (z) {
            a.mo2950b(this.containerId, fragment);
        } else {
            a.mo2944a(this.containerId, fragment);
        }
        a.mo2675a();
    }

    public Fragment peekLast() {
        if (this.fragmentManager.mo2801c() <= 0) {
            return null;
        }
        C0462h hVar = this.fragmentManager;
        return this.fragmentManager.mo2792a(hVar.mo2799b(hVar.mo2801c() - 1).getName());
    }

    public boolean popBackStack() {
        return this.fragmentManager.mo2805g();
    }

    public void popBackStackUntil(String str) {
        this.fragmentManager.mo2797a(str, 1);
    }

    public void popDialogWithResult(Result result) {
        handleNavigationResult(result);
    }

    public void popWithResult(Result result) {
        handleNavigationResult(result);
        popBackStack();
    }

    public C5368e<Result> results(int i) {
        return this.resultRelay.mo18681d(new C3429f(i)).mo18694j(new C3427d(i)).mo18664b(new C3428e(this, i));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13030a(int i, Result result) {
        this.results.remove(Integer.valueOf(i));
    }

    public Fragment getFragment(String str) {
        return this.fragmentManager.mo2792a(str);
    }
}
