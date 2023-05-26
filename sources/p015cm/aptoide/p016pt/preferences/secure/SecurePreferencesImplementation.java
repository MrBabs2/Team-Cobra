package p015cm.aptoide.p016pt.preferences.secure;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p015cm.aptoide.p016pt.preferences.secure.SecureCoderDecoder;

/* renamed from: cm.aptoide.pt.preferences.secure.SecurePreferencesImplementation */
public class SecurePreferencesImplementation implements SharedPreferences {
    private static final String TAG = SecurePreferencesImplementation.class.getName();
    private static SharedPreferences instance;
    /* access modifiers changed from: private */
    public static SharedPreferences sFile;
    /* access modifiers changed from: private */
    public static SecureCoderDecoder secureCoderDecoder;

    /* renamed from: cm.aptoide.pt.preferences.secure.SecurePreferencesImplementation$Editor */
    public static class Editor implements SharedPreferences.Editor {
        private SharedPreferences.Editor mEditor;

        @TargetApi(9)
        public void apply() {
            if (Build.VERSION.SDK_INT >= 9) {
                this.mEditor.apply();
            } else {
                commit();
            }
        }

        public SharedPreferences.Editor clear() {
            this.mEditor.clear();
            return this;
        }

        public boolean commit() {
            return this.mEditor.commit();
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Boolean.toString(z)));
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Float.toString(f)));
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Integer.toString(i)));
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(Long.toString(j)));
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), SecurePreferencesImplementation.secureCoderDecoder.encrypt(str2));
            return this;
        }

        public SharedPreferences.Editor putStringNoEncrypted(String str, String str2) {
            this.mEditor.putString(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), str2);
            return this;
        }

        @TargetApi(11)
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet(set.size());
            for (String encrypt : set) {
                hashSet.add(SecurePreferencesImplementation.secureCoderDecoder.encrypt(encrypt));
            }
            this.mEditor.putStringSet(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str), hashSet);
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            this.mEditor.remove(SecurePreferencesImplementation.secureCoderDecoder.encrypt(str));
            return this;
        }

        @SuppressLint({"CommitPrefEdits"})
        private Editor() {
            this.mEditor = SecurePreferencesImplementation.sFile.edit();
        }
    }

    public SecurePreferencesImplementation(Context context, SharedPreferences sharedPreferences) {
        if (sFile == null) {
            sFile = sharedPreferences;
        }
        if (secureCoderDecoder == null) {
            secureCoderDecoder = new SecureCoderDecoder.Builder(context, sFile).create();
        }
    }

    public static SharedPreferences getInstance(Context context, SharedPreferences sharedPreferences) {
        if (instance == null) {
            synchronized (SecurePreferencesImplementation.class) {
                if (instance == null) {
                    instance = new SecurePreferencesImplementation(context, sharedPreferences);
                }
            }
        }
        return instance;
    }

    public boolean contains(String str) {
        return sFile.contains(secureCoderDecoder.encrypt(str));
    }

    public Map<String, String> getAll() {
        Map<String, ?> all = sFile.getAll();
        HashMap hashMap = new HashMap(all.size());
        for (Map.Entry next : all.entrySet()) {
            try {
                hashMap.put(secureCoderDecoder.decrypt((String) next.getKey()), secureCoderDecoder.decrypt(next.getValue().toString()));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), (String) null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public float getFloat(String str, float f) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), (String) null);
        if (string == null) {
            return f;
        }
        try {
            return Float.parseFloat(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public int getInt(String str, int i) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), (String) null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public long getLong(String str, long j) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), (String) null);
        if (string == null) {
            return j;
        }
        try {
            return Long.parseLong(secureCoderDecoder.decrypt(string));
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }

    public String getString(String str, String str2) {
        String string = sFile.getString(secureCoderDecoder.encrypt(str), (String) null);
        return string != null ? secureCoderDecoder.decrypt(string) : str2;
    }

    @TargetApi(11)
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = sFile.getStringSet(secureCoderDecoder.encrypt(str), (Set) null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        for (String decrypt : stringSet) {
            hashSet.add(secureCoderDecoder.decrypt(decrypt));
        }
        return hashSet;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sFile.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sFile.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public Editor edit() {
        return new Editor();
    }
}
