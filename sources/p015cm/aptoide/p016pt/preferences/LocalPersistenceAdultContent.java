package p015cm.aptoide.p016pt.preferences;

import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.preferences.LocalPersistenceAdultContent */
public class LocalPersistenceAdultContent {
    private static final String ADULT_CONTENT_PIN_PREFERENCES_KEY = "Maturepin";
    private static final String ADULT_CONTENT_PREFERENCES_KEY = "matureChkBox";
    private final Preferences preferences;
    private final SecurePreferences securePreferences;

    public LocalPersistenceAdultContent(Preferences preferences2, SecurePreferences securePreferences2) {
        this.preferences = preferences2;
        this.securePreferences = securePreferences2;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6652a(Integer num) {
        return Boolean.valueOf(num.intValue() != -1);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13358b(int i, Integer num) {
        if (num.equals(Integer.valueOf(i))) {
            return this.securePreferences.remove(ADULT_CONTENT_PIN_PREFERENCES_KEY);
        }
        return C5328b.m10163b((Throwable) new SecurityException("Pin does not match."));
    }

    public C5328b disable() {
        return this.preferences.save(ADULT_CONTENT_PREFERENCES_KEY, false);
    }

    public C5328b enable() {
        return this.preferences.save(ADULT_CONTENT_PREFERENCES_KEY, true);
    }

    public C5368e<Boolean> enabled() {
        return this.preferences.getBoolean(ADULT_CONTENT_PREFERENCES_KEY, false);
    }

    public C5368e<Boolean> pinRequired() {
        return this.securePreferences.getInt(ADULT_CONTENT_PIN_PREFERENCES_KEY, -1).mo18694j(C3581a.f6612f);
    }

    public C5328b removePin(int i) {
        return this.securePreferences.getInt(ADULT_CONTENT_PIN_PREFERENCES_KEY, -1).mo18669c().mo18700m().mo18566b(new C3582b(this, i));
    }

    public C5328b requirePin(int i) {
        return this.securePreferences.save(ADULT_CONTENT_PIN_PREFERENCES_KEY, i);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13357a(int i, Integer num) {
        if (num.equals(Integer.valueOf(i))) {
            return enable();
        }
        return C5328b.m10163b((Throwable) new SecurityException("Pin does not match."));
    }

    public C5328b enable(int i) {
        return this.securePreferences.getInt(ADULT_CONTENT_PIN_PREFERENCES_KEY, -1).mo18669c().mo18700m().mo18566b(new C3583c(this, i));
    }
}
