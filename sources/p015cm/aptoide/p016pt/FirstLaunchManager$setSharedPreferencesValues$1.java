package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import org.xmlpull.v1.XmlPullParserException;
import p015cm.aptoide.p016pt.util.PreferencesXmlParser;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.FirstLaunchManager$setSharedPreferencesValues$1 */
/* compiled from: FirstLaunchManager.kt */
final class FirstLaunchManager$setSharedPreferencesValues$1 implements C5377a {
    final /* synthetic */ FirstLaunchManager this$0;

    FirstLaunchManager$setSharedPreferencesValues$1(FirstLaunchManager firstLaunchManager) {
        this.this$0 = firstLaunchManager;
    }

    public final void call() {
        PreferencesXmlParser preferencesXmlParser = new PreferencesXmlParser();
        XmlResourceParser xml = this.this$0.context.getResources().getXml(C1086R.xml.settings);
        C10202j.m34174a((Object) xml, "context.resources.getXml(R.xml.settings)");
        try {
            for (String[] next : preferencesXmlParser.parse(xml)) {
                SharedPreferences.Editor edit = this.this$0.defaultSharedPreferences.edit();
                String str = next[0];
                Boolean valueOf = Boolean.valueOf(next[1]);
                C10202j.m34174a((Object) valueOf, "Boolean.valueOf(keyValue[1])");
                edit.putBoolean(str, valueOf.booleanValue()).apply();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
