package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.p187io.NumberInput;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StdDateFormat extends DateFormat {
    protected static final String[] ALL_FORMATS = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
    protected static final Calendar CALENDAR = new GregorianCalendar(DEFAULT_TIMEZONE, DEFAULT_LOCALE);
    protected static final DateFormat DATE_FORMAT_ISO8601;
    protected static final DateFormat DATE_FORMAT_RFC1123;
    protected static final Locale DEFAULT_LOCALE = Locale.US;
    protected static final TimeZone DEFAULT_TIMEZONE = TimeZone.getTimeZone("UTC");
    protected static final Pattern PATTERN_ISO8601 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
    protected static final Pattern PATTERN_PLAIN = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final StdDateFormat instance = new StdDateFormat();
    private transient Calendar _calendar;
    private transient DateFormat _formatRFC1123;
    protected Boolean _lenient;
    protected final Locale _locale;
    protected transient TimeZone _timezone;
    private boolean _tzSerializedWithColon;

    static {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", DEFAULT_LOCALE);
            DATE_FORMAT_RFC1123 = simpleDateFormat;
            simpleDateFormat.setTimeZone(DEFAULT_TIMEZONE);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", DEFAULT_LOCALE);
            DATE_FORMAT_ISO8601 = simpleDateFormat2;
            simpleDateFormat2.setTimeZone(DEFAULT_TIMEZONE);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public StdDateFormat() {
        this._tzSerializedWithColon = false;
        this._locale = DEFAULT_LOCALE;
    }

    private static final DateFormat _cloneFormat(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat dateFormat2;
        if (!locale.equals(DEFAULT_LOCALE)) {
            dateFormat2 = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = DEFAULT_TIMEZONE;
            }
            dateFormat2.setTimeZone(timeZone);
        } else {
            dateFormat2 = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                dateFormat2.setTimeZone(timeZone);
            }
        }
        if (bool != null) {
            dateFormat2.setLenient(bool.booleanValue());
        }
        return dateFormat2;
    }

    protected static <T> boolean _equals(T t, T t2) {
        if (t == t2) {
            return true;
        }
        return t != null && t.equals(t2);
    }

    private static int _parse2D(String str, int i) {
        return ((str.charAt(i) - '0') * 10) + (str.charAt(i + 1) - '0');
    }

    private static int _parse4D(String str, int i) {
        return ((str.charAt(i) - '0') * 1000) + ((str.charAt(i + 1) - '0') * 100) + ((str.charAt(i + 2) - '0') * 10) + (str.charAt(i + 3) - '0');
    }

    private Date _parseDateFromLong(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(NumberInput.parseLong(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", new Object[]{str}), parsePosition.getErrorIndex());
        }
    }

    private static void pad2(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    private static void pad3(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 100;
        }
        pad2(stringBuffer, i);
    }

    private static void pad4(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            pad2(stringBuffer, i2);
            i -= i2 * 100;
        }
        pad2(stringBuffer, i);
    }

    /* access modifiers changed from: protected */
    public void _clearFormats() {
        this._formatRFC1123 = null;
    }

    /* access modifiers changed from: protected */
    public void _format(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar _getCalendar = _getCalendar(timeZone);
        _getCalendar.setTime(date);
        pad4(stringBuffer, _getCalendar.get(1));
        char c = '-';
        stringBuffer.append('-');
        pad2(stringBuffer, _getCalendar.get(2) + 1);
        stringBuffer.append('-');
        pad2(stringBuffer, _getCalendar.get(5));
        stringBuffer.append('T');
        pad2(stringBuffer, _getCalendar.get(11));
        stringBuffer.append(':');
        pad2(stringBuffer, _getCalendar.get(12));
        stringBuffer.append(':');
        pad2(stringBuffer, _getCalendar.get(13));
        stringBuffer.append('.');
        pad3(stringBuffer, _getCalendar.get(14));
        int offset = timeZone.getOffset(_getCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            if (offset >= 0) {
                c = '+';
            }
            stringBuffer.append(c);
            pad2(stringBuffer, abs);
            if (this._tzSerializedWithColon) {
                stringBuffer.append(':');
            }
            pad2(stringBuffer, abs2);
        } else if (this._tzSerializedWithColon) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
    }

    /* access modifiers changed from: protected */
    public Calendar _getCalendar(TimeZone timeZone) {
        Calendar calendar = this._calendar;
        if (calendar == null) {
            calendar = (Calendar) CALENDAR.clone();
            this._calendar = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    /* access modifiers changed from: protected */
    public Date _parseAsISO8601(String str, ParsePosition parsePosition) throws IllegalArgumentException, ParseException {
        char c;
        String str2;
        String str3 = str;
        int length = str.length();
        TimeZone timeZone = DEFAULT_TIMEZONE;
        if (!(this._timezone == null || 'Z' == str3.charAt(length - 1))) {
            timeZone = this._timezone;
        }
        Calendar _getCalendar = _getCalendar(timeZone);
        _getCalendar.clear();
        int i = 0;
        if (length > 10) {
            Matcher matcher = PATTERN_ISO8601.matcher(str3);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i2 = end - start;
                if (i2 > 1) {
                    int _parse2D = _parse2D(str3, start + 1) * 3600;
                    if (i2 >= 5) {
                        _parse2D += _parse2D(str3, end - 2) * 60;
                    }
                    _getCalendar.set(15, str3.charAt(start) == '-' ? _parse2D * -1000 : _parse2D * 1000);
                    _getCalendar.set(16, 0);
                }
                int _parse4D = _parse4D(str3, 0);
                int _parse2D2 = _parse2D(str3, 5) - 1;
                Matcher matcher2 = matcher;
                _getCalendar.set(_parse4D, _parse2D2, _parse2D(str3, 8), _parse2D(str3, 11), _parse2D(str3, 14), (length <= 16 || str3.charAt(16) != ':') ? 0 : _parse2D(str3, 17));
                int start2 = matcher2.start(1) + 1;
                int end2 = matcher2.end(1);
                if (start2 >= end2) {
                    _getCalendar.set(14, 0);
                } else {
                    int i3 = end2 - start2;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3 || i3 <= 9) {
                                    i = 0 + (str3.charAt(start2 + 2) - '0');
                                } else {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", new Object[]{str3, matcher2.group(1).substring(1)}), start2);
                                }
                            }
                            i += (str3.charAt(start2 + 1) - '0') * 10;
                        }
                        i += (str3.charAt(start2) - '0') * 100;
                    }
                    _getCalendar.set(14, i);
                }
                return _getCalendar.getTime();
            }
            c = 1;
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        } else if (PATTERN_PLAIN.matcher(str3).matches()) {
            _getCalendar.set(_parse4D(str3, 0), _parse2D(str3, 5) - 1, _parse2D(str3, 8), 0, 0, 0);
            _getCalendar.set(14, 0);
            return _getCalendar.getTime();
        } else {
            str2 = "yyyy-MM-dd";
            c = 1;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str3;
        objArr[c] = str2;
        objArr[2] = this._lenient;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr), 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date _parseDate(java.lang.String r5, java.text.ParsePosition r6) throws java.text.ParseException {
        /*
            r4 = this;
            boolean r0 = r4.looksLikeISO8601(r5)
            if (r0 == 0) goto L_0x000b
            java.util.Date r5 = r4.parseAsISO8601(r5, r6)
            return r5
        L_0x000b:
            int r0 = r5.length()
        L_0x000f:
            int r0 = r0 + -1
            r1 = 45
            if (r0 < 0) goto L_0x0025
            char r2 = r5.charAt(r0)
            r3 = 48
            if (r2 < r3) goto L_0x0021
            r3 = 57
            if (r2 <= r3) goto L_0x000f
        L_0x0021:
            if (r0 > 0) goto L_0x0025
            if (r2 == r1) goto L_0x000f
        L_0x0025:
            if (r0 >= 0) goto L_0x0039
            r0 = 0
            char r2 = r5.charAt(r0)
            if (r2 == r1) goto L_0x0034
            boolean r0 = com.fasterxml.jackson.core.p187io.NumberInput.inLongRange(r5, r0)
            if (r0 == 0) goto L_0x0039
        L_0x0034:
            java.util.Date r5 = r4._parseDateFromLong(r5, r6)
            return r5
        L_0x0039:
            java.util.Date r5 = r4.parseAsRFC1123(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this._timezone;
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        _format(timeZone, this._locale, date, stringBuffer);
        return stringBuffer;
    }

    public TimeZone getTimeZone() {
        return this._timezone;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean isLenient() {
        Boolean bool = this._lenient;
        return bool == null || bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public boolean looksLikeISO8601(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    public Date parse(String str) throws ParseException {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date _parseDate = _parseDate(trim, parsePosition);
        if (_parseDate != null) {
            return _parseDate;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{trim, sb.toString()}), parsePosition.getErrorIndex());
    }

    /* access modifiers changed from: protected */
    public Date parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return _parseAsISO8601(str, parsePosition);
        } catch (IllegalArgumentException e) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", new Object[]{str, e.getMessage()}), parsePosition.getErrorIndex());
        }
    }

    /* access modifiers changed from: protected */
    public Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        if (this._formatRFC1123 == null) {
            this._formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123, "EEE, dd MMM yyyy HH:mm:ss zzz", this._timezone, this._locale, this._lenient);
        }
        return this._formatRFC1123.parse(str, parsePosition);
    }

    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!_equals(valueOf, this._lenient)) {
            this._lenient = valueOf;
            _clearFormats();
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this._timezone)) {
            _clearFormats();
            this._timezone = timeZone;
        }
    }

    public String toPattern() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[one of: '");
        sb.append("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        sb.append("', '");
        sb.append("EEE, dd MMM yyyy HH:mm:ss zzz");
        sb.append("' (");
        sb.append(Boolean.FALSE.equals(this._lenient) ? "strict" : "lenient");
        sb.append(")]");
        return sb.toString();
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", new Object[]{StdDateFormat.class.getName(), this._timezone, this._locale, this._lenient});
    }

    public StdDateFormat withLenient(Boolean bool) {
        if (_equals(bool, this._lenient)) {
            return this;
        }
        return new StdDateFormat(this._timezone, this._locale, bool, this._tzSerializedWithColon);
    }

    public StdDateFormat withLocale(Locale locale) {
        if (locale.equals(this._locale)) {
            return this;
        }
        return new StdDateFormat(this._timezone, locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        TimeZone timeZone2 = this._timezone;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat clone() {
        return new StdDateFormat(this._timezone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    protected StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this._tzSerializedWithColon = false;
        this._timezone = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z;
    }

    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return _parseDate(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
