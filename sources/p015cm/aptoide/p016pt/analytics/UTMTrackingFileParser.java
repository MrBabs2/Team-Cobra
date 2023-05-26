package p015cm.aptoide.p016pt.analytics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: cm.aptoide.pt.analytics.UTMTrackingFileParser */
public class UTMTrackingFileParser {
    private BufferedReader bufferedReader;
    private String utm_line;

    public UTMTrackingFileParser(InputStream inputStream) {
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
        this.bufferedReader = bufferedReader2;
        try {
            this.utm_line = bufferedReader2.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String valueExtracter(String str) {
        for (String str2 : this.utm_line.split("&")) {
            if (str2.contains(str)) {
                return str2.substring(str.length() + 1);
            }
        }
        return "unknown";
    }
}
