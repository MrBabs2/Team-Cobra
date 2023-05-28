package p015cm.aptoide.analytics.implementation.persistence;

import android.content.SharedPreferences;
import p015cm.aptoide.analytics.implementation.SessionPersistence;

/* renamed from: cm.aptoide.analytics.implementation.persistence.SharedPreferencesSessionPersistence */
public class SharedPreferencesSessionPersistence implements SessionPersistence {
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesSessionPersistence(SharedPreferences sharedPreferences2) {
        this.sharedPreferences = sharedPreferences2;
    }

    public long getTimestamp() {
        return this.sharedPreferences.getLong("session_timestamp", 0);
    }

    public void saveSessionTimestamp(long j) {
        this.sharedPreferences.edit().putLong("session_timestamp", j).apply();
    }
}
