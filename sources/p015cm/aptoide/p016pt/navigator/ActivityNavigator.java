package p015cm.aptoide.p016pt.navigator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.navigator.ActivityNavigator */
public interface ActivityNavigator {
    Activity getActivity();

    void navigateBack();

    void navigateBackWithResult(int i, Bundle bundle);

    C5368e<Result> navigateForResult(String str, Uri uri, int i);

    void navigateForResult(Intent intent, int i);

    void navigateForResult(Class<? extends Activity> cls, int i, Bundle bundle);

    void navigateForResult(String str, Uri uri, int i, String str2, String str3);

    C5368e<Result> navigateForResultWithOutput(String str, Uri uri, int i);

    void navigateTo(Uri uri);

    void navigateTo(Class<? extends Activity> cls);

    void navigateTo(Class<? extends Activity> cls, Bundle bundle);

    void navigateWithIntent(Intent intent);

    C5368e<Result> results();

    C5368e<Result> results(int i);
}
