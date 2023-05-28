package p015cm.aptoide.p016pt.view.wizard;

import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.wizard.WizardView */
public interface WizardView extends View {
    C5328b createWizardAdapter(boolean z);

    int getCount();

    void handleColorTransitions(int i, float f, int i2);

    void handleSelectedPage(int i);

    void skipWizard();

    C5368e<Void> skipWizardClick();
}
