package p015cm.aptoide.p016pt.preferences;

import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.AdultContent;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.preferences.AdultContentManager */
public class AdultContentManager implements AdultContent {
    private final AccountService accountService;
    private final LocalPersistenceAdultContent localContent;

    public AdultContentManager(LocalPersistenceAdultContent localPersistenceAdultContent, AccountService accountService2) {
        this.localContent = localPersistenceAdultContent;
        this.accountService = accountService2;
    }

    public C5328b disable(boolean z) {
        if (z) {
            return this.accountService.updateAccount(false).mo18587a(this.localContent.disable());
        }
        return this.localContent.disable();
    }

    public C5328b enable(boolean z) {
        if (z) {
            return this.accountService.updateAccount(true).mo18587a(this.localContent.enable());
        }
        return this.localContent.enable();
    }

    public C5368e<Boolean> enabled() {
        return this.localContent.enabled();
    }

    public C5368e<Boolean> pinRequired() {
        return this.localContent.pinRequired();
    }

    public C5328b removePin(int i) {
        return this.localContent.removePin(i);
    }

    public C5328b requirePin(int i) {
        return this.localContent.requirePin(i);
    }

    public C5328b enable(int i) {
        return this.localContent.enable(i);
    }
}
