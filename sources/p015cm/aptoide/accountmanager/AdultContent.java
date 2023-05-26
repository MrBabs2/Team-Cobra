package p015cm.aptoide.accountmanager;

import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.accountmanager.AdultContent */
public interface AdultContent {
    C5328b disable(boolean z);

    C5328b enable(int i);

    C5328b enable(boolean z);

    C5368e<Boolean> enabled();

    C5368e<Boolean> pinRequired();

    C5328b removePin(int i);

    C5328b requirePin(int i);
}
