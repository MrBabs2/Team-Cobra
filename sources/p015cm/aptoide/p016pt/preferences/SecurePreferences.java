package p015cm.aptoide.p016pt.preferences;

import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.preferences.secure.SecureCoderDecoder;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.preferences.SecurePreferences */
public class SecurePreferences extends Preferences {
    private final SecureCoderDecoder decoder;

    public SecurePreferences(SharedPreferences sharedPreferences, SecureCoderDecoder secureCoderDecoder) {
        super(sharedPreferences);
        this.decoder = secureCoderDecoder;
    }

    /* renamed from: b */
    public /* synthetic */ String mo13387b(String str) {
        return this.decoder.decrypt(str);
    }

    public Single<Boolean> contains(String str) {
        return super.contains(this.decoder.encrypt(str));
    }

    public C5368e<Boolean> getBoolean(String str, boolean z) {
        return getString(str, String.valueOf(z)).mo18694j(C3593m.f6640f);
    }

    public C5368e<Integer> getInt(String str, int i) {
        return getString(str, String.valueOf(i)).mo18694j(C3594n.f6641f);
    }

    public C5368e<String> getString(String str, String str2) {
        return super.getString(this.decoder.encrypt(str), this.decoder.encrypt(str2)).mo18694j(new C3592l(this));
    }

    public C5328b remove(String str) {
        return super.remove(this.decoder.encrypt(str));
    }

    public C5328b save(String str, boolean z) {
        return save(str, String.valueOf(z));
    }

    public C5328b save(String str, String str2) {
        return super.save(this.decoder.encrypt(str), this.decoder.encrypt(str2));
    }

    public C5328b save(String str, int i) {
        return save(str, String.valueOf(i));
    }
}
