package p015cm.aptoide.p016pt.view;

import android.content.Context;
import p015cm.aptoide.p016pt.view.BackButton;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;

/* renamed from: cm.aptoide.pt.view.BackButtonFragment */
public abstract class BackButtonFragment extends NavigationTrackFragment implements BackButton {
    private BackButton backButton;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BackButton) {
            this.backButton = (BackButton) context;
            return;
        }
        throw new IllegalStateException("Context must implement " + BackButton.class.getSimpleName());
    }

    public void registerClickHandler(BackButton.ClickHandler clickHandler) {
        this.backButton.registerClickHandler(clickHandler);
    }

    public void unregisterClickHandler(BackButton.ClickHandler clickHandler) {
        this.backButton.unregisterClickHandler(clickHandler);
    }
}
