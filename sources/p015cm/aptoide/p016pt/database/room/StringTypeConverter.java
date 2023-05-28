package p015cm.aptoide.p016pt.database.room;

import com.google.gson.C8668e;
import com.google.gson.p194u.C8805a;
import java.util.List;

/* renamed from: cm.aptoide.pt.database.room.StringTypeConverter */
public class StringTypeConverter {
    public static List<String> restoreList(String str) {
        return (List) new C8668e().mo32305a(str, new C8805a<List<String>>() {
        }.getType());
    }

    public static String saveList(List<String> list) {
        return new C8668e().mo32307a((Object) list);
    }
}
