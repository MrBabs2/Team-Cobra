package p015cm.aptoide.p016pt.appview;

import android.content.SharedPreferences;

/* renamed from: cm.aptoide.pt.appview.PreferencesPersister */
public class PreferencesPersister {
    private SharedPreferences sharedPreferences;

    public PreferencesPersister(SharedPreferences sharedPreferences2) {
        this.sharedPreferences = sharedPreferences2;
    }

    public int get(String str, int i) {
        return this.sharedPreferences.getInt(str, i);
    }

    public void save(String str, int i) {
        this.sharedPreferences.edit().putInt(str, i).apply();
    }

    public boolean get(String str, boolean z) {
        return this.sharedPreferences.getBoolean(str, z);
    }

    public String get(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }

    public void save(String str, boolean z) {
        this.sharedPreferences.edit().putBoolean(str, z).apply();
    }

    public void save(String str, String str2) {
        this.sharedPreferences.edit().putString(str, str2).apply();
    }
}
