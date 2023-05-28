package p015cm.aptoide.p016pt.editorial;

import java.text.DecimalFormat;

/* renamed from: cm.aptoide.pt.editorial.ViewsFormatter */
public class ViewsFormatter {
    private static final int NUMBER_OF_SUFFIXES = 2;

    public static String formatNumberOfViews(String str) {
        int length = str.length() / 4;
        if (length > 2) {
            length = 2;
        }
        double d = get3DigitNumber(Double.parseDouble(str), length);
        String suffix = getSuffix(length);
        DecimalFormat decimalFormat = getDecimalFormat(d);
        return decimalFormat.format(d) + suffix;
    }

    private static double get3DigitNumber(double d, int i) {
        return d / Math.pow(1000.0d, (double) i);
    }

    private static DecimalFormat getDecimalFormat(double d) {
        if (d < 10.0d) {
            return new DecimalFormat("#.##");
        }
        if (d < 100.0d) {
            return new DecimalFormat("#.#");
        }
        return new DecimalFormat("#");
    }

    private static String getSuffix(int i) {
        return i < 3 ? new String[]{"", "k", "M"}[i] : "";
    }
}
