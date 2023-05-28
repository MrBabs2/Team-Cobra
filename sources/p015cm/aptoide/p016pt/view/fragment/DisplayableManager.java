package p015cm.aptoide.p016pt.view.fragment;

import java.util.List;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.fragment.DisplayableManager */
public interface DisplayableManager {
    DisplayableManager addDisplayable(int i, Displayable displayable, boolean z);

    DisplayableManager addDisplayable(Displayable displayable, boolean z);

    @Deprecated
    DisplayableManager addDisplayables(int i, List<? extends Displayable> list, boolean z);

    DisplayableManager addDisplayables(List<? extends Displayable> list, boolean z);

    DisplayableManager clearDisplayables();

    int getDisplayablesSize();

    boolean hasDisplayables();

    void removeDisplayables(int i, int i2);
}
