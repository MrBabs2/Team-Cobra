package p015cm.aptoide.p016pt.blacklist;

import android.content.SharedPreferences;

/* renamed from: cm.aptoide.pt.blacklist.BlacklistPersistence */
public class BlacklistPersistence {
    private SharedPreferences sharedPreferences;

    public BlacklistPersistence(SharedPreferences sharedPreferences2) {
        this.sharedPreferences = sharedPreferences2;
    }

    public void addImpression(String str, int i) {
        int i2 = this.sharedPreferences.getInt(str, i);
        if (i2 > 0) {
            this.sharedPreferences.edit().putInt(str, i2 - 1).apply();
        }
    }

    public void blacklist(String str) {
        this.sharedPreferences.edit().putInt(str, 0).apply();
    }

    public boolean isBlacklisted(String str, int i) {
        return this.sharedPreferences.getInt(str, i) == 0;
    }
}
