package p015cm.aptoide.p016pt.util;

import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: cm.aptoide.pt.util.PreferencesXmlParser */
public class PreferencesXmlParser {
    private final String DEFAULT_VALUE = "defaultValue";
    private final String KEY = RoomNotification.KEY;
    private final String NAMESPACE = "http://schemas.android.com/apk/res/android";
    private int eventType = -1;

    public List<String[]> parse(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = this.eventType;
            if (i == 1) {
                return arrayList;
            }
            if (i == 2) {
                String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "defaultValue");
                String attributeValue2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", RoomNotification.KEY);
                if (attributeValue != null) {
                    arrayList.add(new String[]{attributeValue2, attributeValue});
                }
            }
            this.eventType = xmlResourceParser.next();
        }
    }
}
