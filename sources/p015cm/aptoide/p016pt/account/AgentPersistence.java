package p015cm.aptoide.p016pt.account;

import android.content.SharedPreferences;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/account/AgentPersistence;", "", "secureSharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getAgent", "", "getEmail", "getState", "persistAgent", "", "agent", "state", "email", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.AgentPersistence */
/* compiled from: AgentPersistence.kt */
public class AgentPersistence {
    private final SharedPreferences secureSharedPreferences;

    public AgentPersistence(SharedPreferences sharedPreferences) {
        C10202j.m34178b(sharedPreferences, "secureSharedPreferences");
        this.secureSharedPreferences = sharedPreferences;
    }

    public final String getAgent() {
        return this.secureSharedPreferences.getString("AGENT", "");
    }

    public final String getEmail() {
        return this.secureSharedPreferences.getString("EMAIL", "");
    }

    public final String getState() {
        return this.secureSharedPreferences.getString("STATE", "");
    }

    public final void persistAgent(String str, String str2, String str3) {
        C10202j.m34178b(str2, "state");
        this.secureSharedPreferences.edit().putString("AGENT", str).putString("STATE", str2).putString("EMAIL", str3).apply();
    }
}
