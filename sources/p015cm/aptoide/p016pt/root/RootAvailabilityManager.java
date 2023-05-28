package p015cm.aptoide.p016pt.root;

import p123rx.C5328b;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.root.RootAvailabilityManager */
public class RootAvailabilityManager {
    private RootValueSaver rootValueSaver;

    public RootAvailabilityManager(RootValueSaver rootValueSaver2) {
        this.rootValueSaver = rootValueSaver2;
    }

    public Single<Boolean> isRootAvailable() {
        return this.rootValueSaver.isPhoneRoot();
    }

    public C5328b updateRootAvailability() {
        return this.rootValueSaver.save(RootShell.isRootAvailable());
    }
}
