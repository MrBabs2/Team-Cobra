package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import android.view.View;

/* renamed from: cm.aptoide.pt.view.fragment.UiComponent */
public interface UiComponent {
    void bindViews(View view);

    int getContentViewId();

    void loadExtras(Bundle bundle);

    void setupToolbar();

    void setupViews();
}
