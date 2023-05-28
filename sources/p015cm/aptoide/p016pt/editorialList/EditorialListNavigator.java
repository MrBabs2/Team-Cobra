package p015cm.aptoide.p016pt.editorialList;

import android.os.Bundle;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.view.settings.MyAccountFragment;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListNavigator */
public class EditorialListNavigator {
    private final AccountNavigator accountNavigator;
    private final FragmentNavigator fragmentNavigator;

    public EditorialListNavigator(FragmentNavigator fragmentNavigator2, AccountNavigator accountNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
        this.accountNavigator = accountNavigator2;
    }

    public void navigateToEditorial(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("cardId", str);
        bundle.putBoolean(EditorialFragment.FROM_HOME, false);
        EditorialFragment editorialFragment = new EditorialFragment();
        editorialFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(editorialFragment, true);
    }

    public void navigateToLogIn() {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.EDITORIAL);
    }

    public void navigateToMyAccount() {
        this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
    }
}
