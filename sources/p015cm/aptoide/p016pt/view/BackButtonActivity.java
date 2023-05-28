package p015cm.aptoide.p016pt.view;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;
import p015cm.aptoide.p016pt.view.BackButton;

/* renamed from: cm.aptoide.pt.view.BackButtonActivity */
public abstract class BackButtonActivity extends ThemedActivityView implements BackButton {
    private Set<BackButton.ClickHandler> clickHandlers;

    public void onBackPressed() {
        boolean z = false;
        for (BackButton.ClickHandler handle : this.clickHandlers) {
            if (handle.handle()) {
                z = true;
            }
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.clickHandlers = new HashSet();
    }

    public void registerClickHandler(BackButton.ClickHandler clickHandler) {
        this.clickHandlers.add(clickHandler);
    }

    public void unregisterClickHandler(BackButton.ClickHandler clickHandler) {
        this.clickHandlers.remove(clickHandler);
    }
}
