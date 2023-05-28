package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

public class TokenBuffer extends JsonGenerator {
    protected static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    protected int _appendAt;
    protected Segment _first;
    protected boolean _forceBigDecimal;
    protected int _generatorFeatures;
    protected boolean _hasNativeId;
    protected boolean _hasNativeObjectIds;
    protected boolean _hasNativeTypeIds;
    protected Segment _last;
    protected boolean _mayHaveNativeIds;
    protected ObjectCodec _objectCodec;
    protected Object _objectId;
    protected JsonStreamContext _parentContext;
    protected Object _typeId;
    protected JsonWriteContext _writeContext;

    /* renamed from: com.fasterxml.jackson.databind.util.TokenBuffer$1 */
    static /* synthetic */ class C67231 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bd */
        static {
            /*
                com.fasterxml.jackson.core.JsonParser$NumberType[] r0 = com.fasterxml.jackson.core.JsonParser.NumberType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = r0
                r1 = 1
                com.fasterxml.jackson.core.JsonParser$NumberType r2 = com.fasterxml.jackson.core.JsonParser.NumberType.INT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.JsonParser$NumberType r3 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.JsonParser$NumberType r4 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.JsonParser$NumberType r5 = com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.JsonParser$NumberType r6 = com.fasterxml.jackson.core.JsonParser.NumberType.LONG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.fasterxml.jackson.core.JsonToken[] r5 = com.fasterxml.jackson.core.JsonToken.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = r5
                com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x006d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x008d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x00b1 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x00c9 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x00c9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c9 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c9 }
            L_0x00c9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.TokenBuffer.C67231.<clinit>():void");
        }
    }

    protected static final class Parser extends ParserMinimalBase {
        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeTypeIds;
        protected JsonLocation _location = null;
        protected TokenBufferReadContext _parsingContext;
        protected Segment _segment;
        protected int _segmentPtr;

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            super(0);
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._parsingContext = TokenBufferReadContext.createRootContext(jsonStreamContext);
            this._hasNativeTypeIds = z;
            this._hasNativeObjectIds = z2;
        }

        private final boolean _smallerThanInt(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean _smallerThanLong(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        /* access modifiers changed from: protected */
        public final void _checkIsNumber() throws JsonParseException {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw _constructError("Current token (" + this._currToken + ") not numeric, cannot use numeric value accessors");
            }
        }

        /* access modifiers changed from: protected */
        public int _convertNumberToInt(Number number) throws IOException {
            if (number instanceof Long) {
                long longValue = number.longValue();
                int i = (int) longValue;
                if (((long) i) == longValue) {
                    return i;
                }
                reportOverflowInt();
                throw null;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_INT.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                    throw null;
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                    return (int) doubleValue;
                }
                reportOverflowInt();
                throw null;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (ParserMinimalBase.BD_MIN_INT.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(bigDecimal) < 0) {
                    reportOverflowInt();
                    throw null;
                }
            } else {
                _throwInternal();
                throw null;
            }
            return number.intValue();
        }

        /* access modifiers changed from: protected */
        public long _convertNumberToLong(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_LONG.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                    throw null;
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
                    return (long) ((int) doubleValue);
                }
                reportOverflowLong();
                throw null;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (ParserMinimalBase.BD_MIN_LONG.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                    reportOverflowLong();
                    throw null;
                }
            } else {
                _throwInternal();
                throw null;
            }
            return number.longValue();
        }

        /* access modifiers changed from: protected */
        public final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        /* access modifiers changed from: protected */
        public void _handleEOF() throws JsonParseException {
            _throwInternal();
            throw null;
        }

        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        public void close() throws IOException {
            if (!this._closed) {
                this._closed = true;
            }
        }

        public BigInteger getBigIntegerValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            if (getNumberType() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) numberValue).toBigInteger();
            }
            return BigInteger.valueOf(numberValue.longValue());
        }

        public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException, JsonParseException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken == JsonToken.VALUE_STRING) {
                String text = getText();
                if (text == null) {
                    return null;
                }
                ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
                if (byteArrayBuilder == null) {
                    byteArrayBuilder = new ByteArrayBuilder(100);
                    this._byteBuilder = byteArrayBuilder;
                } else {
                    byteArrayBuilder.reset();
                }
                _decodeBase64(text, byteArrayBuilder, base64Variant);
                return byteArrayBuilder.toByteArray();
            }
            throw _constructError("Current token (" + this._currToken + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
        }

        public ObjectCodec getCodec() {
            return this._codec;
        }

        public JsonLocation getCurrentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.f12500NA : jsonLocation;
        }

        public String getCurrentName() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
                return this._parsingContext.getParent().getCurrentName();
            }
            return this._parsingContext.getCurrentName();
        }

        public BigDecimal getDecimalValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i = C67231.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[getNumberType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new BigDecimal((BigInteger) numberValue);
                }
                if (i != 5) {
                    return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        public int getIntValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            if ((numberValue instanceof Integer) || _smallerThanInt(numberValue)) {
                return numberValue.intValue();
            }
            return _convertNumberToInt(numberValue);
        }

        public long getLongValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            if ((numberValue instanceof Long) || _smallerThanLong(numberValue)) {
                return numberValue.longValue();
            }
            return _convertNumberToLong(numberValue);
        }

        public JsonParser.NumberType getNumberType() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValue instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValue instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValue instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValue instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValue instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValue instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        public final Number getNumberValue() throws IOException {
            _checkIsNumber();
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Number) {
                return (Number) _currentObject;
            }
            if (_currentObject instanceof String) {
                String str = (String) _currentObject;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } else if (_currentObject == null) {
                return null;
            } else {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + _currentObject.getClass().getName());
            }
        }

        public Object getObjectId() {
            return this._segment.findObjectId(this._segmentPtr);
        }

        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        public String getText() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof String) {
                    return (String) _currentObject;
                }
                return ClassUtil.nullOrToString(_currentObject);
            } else if (jsonToken == null) {
                return null;
            } else {
                int i = C67231.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()];
                if (i == 7 || i == 8) {
                    return ClassUtil.nullOrToString(_currentObject());
                }
                return this._currToken.asString();
            }
        }

        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        public int getTextOffset() {
            return 0;
        }

        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        public Object getTypeId() {
            return this._segment.findTypeId(this._segmentPtr);
        }

        public boolean hasTextCharacters() {
            return false;
        }

        public boolean isNaN() {
            if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Double) {
                Double d = (Double) _currentObject;
                if (d.isNaN() || d.isInfinite()) {
                    return true;
                }
                return false;
            } else if (!(_currentObject instanceof Float)) {
                return false;
            } else {
                Float f = (Float) _currentObject;
                if (f.isNaN() || f.isInfinite()) {
                    return true;
                }
                return false;
            }
        }

        public String nextFieldName() throws IOException {
            Segment segment;
            JsonToken jsonToken;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            if (i < 16 && segment.type(i) == (jsonToken = JsonToken.FIELD_NAME)) {
                this._segmentPtr = i;
                this._currToken = jsonToken;
                Object obj = this._segment.get(i);
                String obj2 = obj instanceof String ? (String) obj : obj.toString();
                this._parsingContext.setCurrentName(obj2);
                return obj2;
            } else if (nextToken() == JsonToken.FIELD_NAME) {
                return getCurrentName();
            } else {
                return null;
            }
        }

        public JsonToken nextToken() throws IOException {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            this._segmentPtr = i;
            if (i >= 16) {
                this._segmentPtr = 0;
                Segment next = segment.next();
                this._segment = next;
                if (next == null) {
                    return null;
                }
            }
            JsonToken type = this._segment.type(this._segmentPtr);
            this._currToken = type;
            if (type == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                this._parsingContext.setCurrentName(_currentObject instanceof String ? (String) _currentObject : _currentObject.toString());
            } else if (type == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext();
            } else if (type == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext();
            } else if (type == JsonToken.END_OBJECT || type == JsonToken.END_ARRAY) {
                this._parsingContext = this._parsingContext.parentOrCopy();
            }
            return this._currToken;
        }

        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }
    }

    public TokenBuffer(ObjectCodec objectCodec, boolean z) {
        this._hasNativeId = false;
        this._objectCodec = objectCodec;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext((DupDetector) null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = z;
        this._hasNativeObjectIds = z;
        this._mayHaveNativeIds = z | z;
    }

    private final void _appendNativeIds(StringBuilder sb) {
        Object access$000 = this._last.findObjectId(this._appendAt - 1);
        if (access$000 != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(access$000));
            sb.append(']');
        }
        Object access$100 = this._last.findTypeId(this._appendAt - 1);
        if (access$100 != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(access$100));
            sb.append(']');
        }
    }

    private final void _checkNativeIds(JsonParser jsonParser) throws IOException {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    public static TokenBuffer asCopyOfValue(JsonParser jsonParser) throws IOException {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser);
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }

    /* access modifiers changed from: protected */
    public final void _append(JsonToken jsonToken) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
            return;
        }
        this._last = append;
        this._appendAt = 1;
    }

    /* access modifiers changed from: protected */
    public final void _appendValue(JsonToken jsonToken) {
        this._writeContext.writeValue();
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
            return;
        }
        this._last = append;
        this._appendAt = 1;
    }

    /* access modifiers changed from: protected */
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) throws IOException {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer.canWriteTypeId();
        }
        if (!this._hasNativeObjectIds) {
            this._hasNativeObjectIds = tokenBuffer.canWriteObjectId();
        }
        this._mayHaveNativeIds = this._hasNativeTypeIds | this._hasNativeObjectIds;
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != null) {
            copyCurrentStructure(asParser);
        }
        return this;
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParserOnFirstToken() throws IOException {
        JsonParser asParser = asParser(this._objectCodec);
        asParser.nextToken();
        return asParser;
    }

    public boolean canWriteBinaryNatively() {
        return true;
    }

    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    public void close() throws IOException {
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (C67231.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i = C67231.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                if (i == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                }
            case 8:
                if (this._forceBigDecimal) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                }
                int i2 = C67231.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                if (i2 == 3) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (i2 != 4) {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                } else {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        }
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        int i = C67231.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()];
        if (i == 1) {
            writeStartObject();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                copyCurrentStructure(jsonParser);
            }
            writeEndObject();
        } else if (i != 3) {
            copyCurrentEvent(jsonParser);
        } else {
            writeStartArray();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                copyCurrentStructure(jsonParser);
            }
            writeEndArray();
        }
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken nextToken;
        if (jsonParser.getCurrentTokenId() != JsonToken.FIELD_NAME.mo21540id()) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            nextToken = jsonParser.nextToken();
        } while (nextToken == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (nextToken == jsonToken) {
            writeEndObject();
            return this;
        }
        deserializationContext.reportWrongTokenException((Class<?>) TokenBuffer.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + nextToken, new Object[0]);
        throw null;
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    public void flush() throws IOException {
    }

    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    public JsonGenerator overrideStdFeatures(int i, int i2) {
        this._generatorFeatures = (i & i2) | (getFeatureMask() & (i2 ^ -1));
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator) throws IOException {
        Segment segment = this._first;
        boolean z = this._mayHaveNativeIds;
        boolean z2 = z && segment.hasIds();
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                segment = segment.next();
                if (segment != null) {
                    z2 = z && segment.hasIds();
                    i = 0;
                } else {
                    return;
                }
            }
            JsonToken type = segment.type(i);
            if (type != null) {
                if (z2) {
                    Object access$000 = segment.findObjectId(i);
                    if (access$000 != null) {
                        jsonGenerator.writeObjectId(access$000);
                    }
                    Object access$100 = segment.findTypeId(i);
                    if (access$100 != null) {
                        jsonGenerator.writeTypeId(access$100);
                    }
                }
                switch (C67231.$SwitchMap$com$fasterxml$jackson$core$JsonToken[type.ordinal()]) {
                    case 1:
                        jsonGenerator.writeStartObject();
                        break;
                    case 2:
                        jsonGenerator.writeEndObject();
                        break;
                    case 3:
                        jsonGenerator.writeStartArray();
                        break;
                    case 4:
                        jsonGenerator.writeEndArray();
                        break;
                    case 5:
                        Object obj = segment.get(i);
                        if (!(obj instanceof SerializableString)) {
                            jsonGenerator.writeFieldName((String) obj);
                            break;
                        } else {
                            jsonGenerator.writeFieldName((SerializableString) obj);
                            break;
                        }
                    case 6:
                        Object obj2 = segment.get(i);
                        if (!(obj2 instanceof SerializableString)) {
                            jsonGenerator.writeString((String) obj2);
                            break;
                        } else {
                            jsonGenerator.writeString((SerializableString) obj2);
                            break;
                        }
                    case 7:
                        Object obj3 = segment.get(i);
                        if (!(obj3 instanceof Integer)) {
                            if (!(obj3 instanceof BigInteger)) {
                                if (!(obj3 instanceof Long)) {
                                    if (!(obj3 instanceof Short)) {
                                        jsonGenerator.writeNumber(((Number) obj3).intValue());
                                        break;
                                    } else {
                                        jsonGenerator.writeNumber(((Short) obj3).shortValue());
                                        break;
                                    }
                                } else {
                                    jsonGenerator.writeNumber(((Long) obj3).longValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.writeNumber((BigInteger) obj3);
                                break;
                            }
                        } else {
                            jsonGenerator.writeNumber(((Integer) obj3).intValue());
                            break;
                        }
                    case 8:
                        Object obj4 = segment.get(i);
                        if (obj4 instanceof Double) {
                            jsonGenerator.writeNumber(((Double) obj4).doubleValue());
                            break;
                        } else if (obj4 instanceof BigDecimal) {
                            jsonGenerator.writeNumber((BigDecimal) obj4);
                            break;
                        } else if (obj4 instanceof Float) {
                            jsonGenerator.writeNumber(((Float) obj4).floatValue());
                            break;
                        } else if (obj4 == null) {
                            jsonGenerator.writeNull();
                            break;
                        } else if (obj4 instanceof String) {
                            jsonGenerator.writeNumber((String) obj4);
                            break;
                        } else {
                            throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", new Object[]{obj4.getClass().getName()}), jsonGenerator);
                        }
                    case 9:
                        jsonGenerator.writeBoolean(true);
                        break;
                    case 10:
                        jsonGenerator.writeBoolean(false);
                        break;
                    case 11:
                        jsonGenerator.writeNull();
                        break;
                    case 12:
                        Object obj5 = segment.get(i);
                        if (!(obj5 instanceof RawValue)) {
                            if (!(obj5 instanceof JsonSerializable)) {
                                jsonGenerator.writeEmbeddedObject(obj5);
                                break;
                            } else {
                                jsonGenerator.writeObject(obj5);
                                break;
                            }
                        } else {
                            ((RawValue) obj5).serialize(jsonGenerator);
                            break;
                        }
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
            } else {
                return;
            }
        }
    }

    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        this._generatorFeatures = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser asParser = asParser();
        int i = 0;
        boolean z = this._hasNativeTypeIds || this._hasNativeObjectIds;
        while (true) {
            try {
                JsonToken nextToken = asParser.nextToken();
                if (nextToken == null) {
                    break;
                }
                if (z) {
                    _appendNativeIds(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(nextToken.toString());
                    if (nextToken == JsonToken.FIELD_NAME) {
                        sb.append('(');
                        sb.append(asParser.getCurrentName());
                        sb.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        writeObject(bArr2);
    }

    public void writeBoolean(boolean z) throws IOException {
        _appendValue(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    public void writeEmbeddedObject(Object obj) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    public final void writeEndArray() throws IOException {
        _append(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public final void writeEndObject() throws IOException {
        _append(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public final void writeFieldName(String str) throws IOException {
        this._writeContext.writeFieldName(str);
        _append(JsonToken.FIELD_NAME, str);
    }

    public void writeNull() throws IOException {
        _appendValue(JsonToken.VALUE_NULL);
    }

    public void writeNumber(short s) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            ObjectCodec objectCodec = this._objectCodec;
            if (objectCodec == null) {
                _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                objectCodec.writeValue(this, obj);
            }
        }
    }

    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    public void writeRaw(String str) throws IOException {
        _reportUnsupportedOperation();
        throw null;
    }

    public void writeRawValue(String str) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    public final void writeStartArray() throws IOException {
        this._writeContext.writeValue();
        _append(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    public final void writeStartObject() throws IOException {
        this._writeContext.writeValue();
        _append(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    protected static final class Segment {
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX = new JsonToken[16];
        protected TreeMap<Integer, Object> _nativeIds;
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object[] _tokens = new Object[16];

        static {
            JsonToken[] values = JsonToken.values();
            System.arraycopy(values, 1, TOKEN_TYPES_BY_INDEX, 1, Math.min(15, values.length - 1));
        }

        private final int _objectIdIndex(int i) {
            return i + i + 1;
        }

        private final int _typeIdIndex(int i) {
            return i + i;
        }

        private final void assignNativeIds(int i, Object obj, Object obj2) {
            if (this._nativeIds == null) {
                this._nativeIds = new TreeMap<>();
            }
            if (obj != null) {
                this._nativeIds.put(Integer.valueOf(_objectIdIndex(i)), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(_typeIdIndex(i)), obj2);
            }
        }

        /* access modifiers changed from: private */
        public Object findObjectId(int i) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_objectIdIndex(i)));
        }

        /* access modifiers changed from: private */
        public Object findTypeId(int i) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_typeIdIndex(i)));
        }

        private void set(int i, JsonToken jsonToken) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
        }

        public Segment append(int i, JsonToken jsonToken) {
            if (i < 16) {
                set(i, jsonToken);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken);
            return this._next;
        }

        public Object get(int i) {
            return this._tokens[i];
        }

        public boolean hasIds() {
            return this._nativeIds != null;
        }

        public Segment next() {
            return this._next;
        }

        public JsonToken type(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j) & 15];
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i, obj, obj2);
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2);
            return this._next;
        }

        private void set(int i, JsonToken jsonToken, Object obj) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i, obj2, obj3);
        }

        public Segment append(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                set(i, jsonToken, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2, obj3);
            return this._next;
        }
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
    }

    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    public void writeNumber(int i) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public void writeRaw(SerializableString serializableString) throws IOException {
        _reportUnsupportedOperation();
        throw null;
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
        parser.setLocation(jsonParser.getTokenLocation());
        return parser;
    }

    public void writeFieldName(SerializableString serializableString) throws IOException {
        this._writeContext.writeFieldName(serializableString.getValue());
        _append(JsonToken.FIELD_NAME, serializableString);
    }

    public void writeNumber(long j) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        _reportUnsupportedOperation();
        throw null;
    }

    public void writeString(char[] cArr, int i, int i2) throws IOException {
        writeString(new String(cArr, i, i2));
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    public void writeNumber(double d) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void writeRaw(char c) throws IOException {
        _reportUnsupportedOperation();
        throw null;
    }

    public void writeStartObject(Object obj) throws IOException {
        this._writeContext.writeValue();
        _append(JsonToken.START_OBJECT);
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext.setCurrentValue(obj);
        }
    }

    public void writeString(SerializableString serializableString) throws IOException {
        if (serializableString == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    /* access modifiers changed from: protected */
    public final void _append(JsonToken jsonToken, Object obj) {
        Segment segment;
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    public void writeNumber(float f) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    /* access modifiers changed from: protected */
    public final void _appendValue(JsonToken jsonToken, Object obj) {
        Segment segment;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public void writeNumber(String str) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public TokenBuffer(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean z = false;
        this._hasNativeId = false;
        this._objectCodec = jsonParser.getCodec();
        this._parentContext = jsonParser.getParsingContext();
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext((DupDetector) null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        boolean canReadObjectId = jsonParser.canReadObjectId();
        this._hasNativeObjectIds = canReadObjectId;
        this._mayHaveNativeIds = canReadObjectId | this._hasNativeTypeIds;
        this._forceBigDecimal = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : z;
    }
}
