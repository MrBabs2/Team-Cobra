package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegate extends JsonParserDelegate {
    protected boolean _allowMultipleMatches;
    protected JsonToken _currToken;
    protected TokenFilterContext _exposedContext;
    protected TokenFilterContext _headContext;
    @Deprecated
    protected boolean _includeImmediateParent;
    protected boolean _includePath;
    protected TokenFilter _itemFilter;
    protected int _matchCount;

    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, boolean z, boolean z2) {
        super(jsonParser);
        this._itemFilter = tokenFilter;
        this._headContext = TokenFilterContext.createRootContext(tokenFilter);
        this._includePath = z;
        this._allowMultipleMatches = z2;
    }

    private JsonToken _nextBuffered(TokenFilterContext tokenFilterContext) throws IOException {
        this._exposedContext = tokenFilterContext;
        JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
        if (nextTokenToRead != null) {
            return nextTokenToRead;
        }
        while (tokenFilterContext != this._headContext) {
            tokenFilterContext = this._exposedContext.findChildOf(tokenFilterContext);
            this._exposedContext = tokenFilterContext;
            if (tokenFilterContext != null) {
                JsonToken nextTokenToRead2 = tokenFilterContext.nextTokenToRead();
                if (nextTokenToRead2 != null) {
                    return nextTokenToRead2;
                }
            } else {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean _verifyAllowedMatches() throws IOException {
        if (this._matchCount != 0 && !this._allowMultipleMatches) {
            return false;
        }
        this._matchCount++;
        return true;
    }

    /* access modifiers changed from: protected */
    public JsonStreamContext _filterContext() {
        TokenFilterContext tokenFilterContext = this._exposedContext;
        if (tokenFilterContext != null) {
            return tokenFilterContext;
        }
        return this._headContext;
    }

    /* access modifiers changed from: protected */
    public final JsonToken _nextToken2() throws IOException {
        JsonToken _nextTokenWithBuffering;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                this._currToken = nextToken;
                return nextToken;
            }
            int id = nextToken.mo21540id();
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter tokenFilter = this._itemFilter;
                        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (tokenFilter == null) {
                            this.delegate.skipChildren();
                        } else {
                            this._headContext.checkValue(tokenFilter);
                            if (tokenFilter == null) {
                                this.delegate.skipChildren();
                            } else {
                                if (tokenFilter != TokenFilter.INCLUDE_ALL) {
                                    tokenFilter.filterStartArray();
                                }
                                this._itemFilter = tokenFilter;
                                if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                                    this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                TokenFilterContext createChildArrayContext = this._headContext.createChildArrayContext(tokenFilter, false);
                                this._headContext = createChildArrayContext;
                                if (this._includePath && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(createChildArrayContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering2;
                                    return _nextTokenWithBuffering2;
                                }
                            }
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter2 = this._itemFilter;
                            if (tokenFilter2 == TokenFilter.INCLUDE_ALL) {
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (tokenFilter2 != null) {
                                this._headContext.checkValue(tokenFilter2);
                                if ((tokenFilter2 == TokenFilter.INCLUDE_ALL || (tokenFilter2 != null && tokenFilter2.includeValue(this.delegate))) && _verifyAllowedMatches()) {
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            if (fieldName == TokenFilter.INCLUDE_ALL) {
                                this._itemFilter = fieldName;
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                fieldName.includeProperty(currentName);
                                if (fieldName == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = fieldName;
                                    if (fieldName == TokenFilter.INCLUDE_ALL) {
                                        if (_verifyAllowedMatches() && this._includePath) {
                                            this._currToken = nextToken;
                                            return nextToken;
                                        }
                                    } else if (this._includePath && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext)) != null) {
                                        this._currToken = _nextTokenWithBuffering3;
                                        return _nextTokenWithBuffering3;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean isStartHandled = this._headContext.isStartHandled();
                TokenFilter filter = this._headContext.getFilter();
                if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                    filter.filterFinishArray();
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (isStartHandled) {
                    this._currToken = nextToken;
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter3 = this._itemFilter;
                if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                    this._currToken = nextToken;
                    return nextToken;
                } else if (tokenFilter3 == null) {
                    this.delegate.skipChildren();
                } else {
                    this._headContext.checkValue(tokenFilter3);
                    if (tokenFilter3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (tokenFilter3 != TokenFilter.INCLUDE_ALL) {
                            tokenFilter3.filterStartObject();
                        }
                        this._itemFilter = tokenFilter3;
                        if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        TokenFilterContext createChildObjectContext = this._headContext.createChildObjectContext(tokenFilter3, false);
                        this._headContext = createChildObjectContext;
                        if (this._includePath && (_nextTokenWithBuffering = _nextTokenWithBuffering(createChildObjectContext)) != null) {
                            this._currToken = _nextTokenWithBuffering;
                            return _nextTokenWithBuffering;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenFilterContext) throws IOException {
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                return nextToken;
            }
            int id = nextToken.mo21540id();
            boolean z = false;
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilterContext tokenFilterContext2 = this._headContext;
                        TokenFilter tokenFilter = this._itemFilter;
                        tokenFilterContext2.checkValue(tokenFilter);
                        if (tokenFilter == null) {
                            this.delegate.skipChildren();
                        } else {
                            if (tokenFilter != TokenFilter.INCLUDE_ALL) {
                                tokenFilter.filterStartArray();
                            }
                            this._itemFilter = tokenFilter;
                            if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                                this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                                return _nextBuffered(tokenFilterContext);
                            }
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter, false);
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter2 = this._itemFilter;
                            if (tokenFilter2 == TokenFilter.INCLUDE_ALL) {
                                return _nextBuffered(tokenFilterContext);
                            }
                            if (tokenFilter2 != null) {
                                this._headContext.checkValue(tokenFilter2);
                                if ((tokenFilter2 == TokenFilter.INCLUDE_ALL || (tokenFilter2 != null && tokenFilter2.includeValue(this.delegate))) && _verifyAllowedMatches()) {
                                    return _nextBuffered(tokenFilterContext);
                                }
                            } else {
                                continue;
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            if (fieldName == TokenFilter.INCLUDE_ALL) {
                                this._itemFilter = fieldName;
                                return _nextBuffered(tokenFilterContext);
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                fieldName.includeProperty(currentName);
                                if (fieldName == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = fieldName;
                                    if (fieldName != TokenFilter.INCLUDE_ALL) {
                                        continue;
                                    } else if (_verifyAllowedMatches()) {
                                        return _nextBuffered(tokenFilterContext);
                                    } else {
                                        this._itemFilter = this._headContext.setFieldName(currentName);
                                    }
                                }
                            }
                        }
                    }
                }
                TokenFilter filter = this._headContext.getFilter();
                if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                    filter.filterFinishArray();
                }
                if ((this._headContext == tokenFilterContext) && this._headContext.isStartHandled()) {
                    z = true;
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (z) {
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter3 = this._itemFilter;
                if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                    return nextToken;
                } else if (tokenFilter3 == null) {
                    this.delegate.skipChildren();
                } else {
                    this._headContext.checkValue(tokenFilter3);
                    if (tokenFilter3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (tokenFilter3 != TokenFilter.INCLUDE_ALL) {
                            tokenFilter3.filterStartObject();
                        }
                        this._itemFilter = tokenFilter3;
                        if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                            return _nextBuffered(tokenFilterContext);
                        }
                        this._headContext = this._headContext.createChildObjectContext(tokenFilter3, false);
                    }
                }
            }
        }
    }

    public void clearCurrentToken() {
        if (this._currToken != null) {
            this._currToken = null;
        }
    }

    public JsonToken currentToken() {
        return this._currToken;
    }

    public BigInteger getBigIntegerValue() throws IOException {
        return this.delegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        return this.delegate.getBinaryValue(base64Variant);
    }

    public byte getByteValue() throws IOException {
        return this.delegate.getByteValue();
    }

    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    public String getCurrentName() throws IOException {
        JsonStreamContext _filterContext = _filterContext();
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return _filterContext.getCurrentName();
        }
        JsonStreamContext parent = _filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public final int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.mo21540id();
    }

    public BigDecimal getDecimalValue() throws IOException {
        return this.delegate.getDecimalValue();
    }

    public double getDoubleValue() throws IOException {
        return this.delegate.getDoubleValue();
    }

    public Object getEmbeddedObject() throws IOException {
        return this.delegate.getEmbeddedObject();
    }

    public float getFloatValue() throws IOException {
        return this.delegate.getFloatValue();
    }

    public int getIntValue() throws IOException {
        return this.delegate.getIntValue();
    }

    public long getLongValue() throws IOException {
        return this.delegate.getLongValue();
    }

    public JsonParser.NumberType getNumberType() throws IOException {
        return this.delegate.getNumberType();
    }

    public Number getNumberValue() throws IOException {
        return this.delegate.getNumberValue();
    }

    public JsonStreamContext getParsingContext() {
        return _filterContext();
    }

    public short getShortValue() throws IOException {
        return this.delegate.getShortValue();
    }

    public String getText() throws IOException {
        return this.delegate.getText();
    }

    public char[] getTextCharacters() throws IOException {
        return this.delegate.getTextCharacters();
    }

    public int getTextLength() throws IOException {
        return this.delegate.getTextLength();
    }

    public int getTextOffset() throws IOException {
        return this.delegate.getTextOffset();
    }

    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    public int getValueAsInt() throws IOException {
        return this.delegate.getValueAsInt();
    }

    public long getValueAsLong() throws IOException {
        return this.delegate.getValueAsLong();
    }

    public String getValueAsString() throws IOException {
        return this.delegate.getValueAsString();
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    public final boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return i == 0;
        }
        if (jsonToken.mo21540id() == i) {
            return true;
        }
        return false;
    }

    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    public JsonToken nextToken() throws IOException {
        JsonToken _nextTokenWithBuffering;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        JsonToken jsonToken;
        if (this._allowMultipleMatches || (jsonToken = this._currToken) == null || this._exposedContext != null || !jsonToken.isScalarValue() || this._headContext.isStartHandled() || this._includePath || this._itemFilter != TokenFilter.INCLUDE_ALL) {
            TokenFilterContext tokenFilterContext = this._exposedContext;
            if (tokenFilterContext != null) {
                do {
                    JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
                    if (nextTokenToRead != null) {
                        this._currToken = nextTokenToRead;
                        return nextTokenToRead;
                    }
                    TokenFilterContext tokenFilterContext2 = this._headContext;
                    if (tokenFilterContext == tokenFilterContext2) {
                        this._exposedContext = null;
                        if (tokenFilterContext.inArray()) {
                            JsonToken currentToken = this.delegate.getCurrentToken();
                            this._currToken = currentToken;
                            return currentToken;
                        }
                    } else {
                        tokenFilterContext = tokenFilterContext2.findChildOf(tokenFilterContext);
                        this._exposedContext = tokenFilterContext;
                    }
                } while (tokenFilterContext != null);
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                this._currToken = nextToken;
                return nextToken;
            }
            int id = nextToken.mo21540id();
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter tokenFilter = this._itemFilter;
                        if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (tokenFilter == null) {
                            this.delegate.skipChildren();
                        } else {
                            this._headContext.checkValue(tokenFilter);
                            if (tokenFilter == null) {
                                this.delegate.skipChildren();
                            } else {
                                if (tokenFilter != TokenFilter.INCLUDE_ALL) {
                                    tokenFilter.filterStartArray();
                                }
                                this._itemFilter = tokenFilter;
                                if (tokenFilter == TokenFilter.INCLUDE_ALL) {
                                    this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                TokenFilterContext createChildArrayContext = this._headContext.createChildArrayContext(tokenFilter, false);
                                this._headContext = createChildArrayContext;
                                if (this._includePath && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(createChildArrayContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering2;
                                    return _nextTokenWithBuffering2;
                                }
                            }
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter2 = this._itemFilter;
                            if (tokenFilter2 == TokenFilter.INCLUDE_ALL) {
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (tokenFilter2 != null) {
                                this._headContext.checkValue(tokenFilter2);
                                if ((tokenFilter2 == TokenFilter.INCLUDE_ALL || (tokenFilter2 != null && tokenFilter2.includeValue(this.delegate))) && _verifyAllowedMatches()) {
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            if (fieldName == TokenFilter.INCLUDE_ALL) {
                                this._itemFilter = fieldName;
                                if (!this._includePath && this._includeImmediateParent && !this._headContext.isStartHandled()) {
                                    nextToken = this._headContext.nextTokenToRead();
                                    this._exposedContext = this._headContext;
                                }
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                fieldName.includeProperty(currentName);
                                if (fieldName == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = fieldName;
                                    if (fieldName == TokenFilter.INCLUDE_ALL) {
                                        if (!_verifyAllowedMatches()) {
                                            this.delegate.nextToken();
                                            this.delegate.skipChildren();
                                        } else if (this._includePath) {
                                            this._currToken = nextToken;
                                            return nextToken;
                                        }
                                    }
                                    if (this._includePath && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext)) != null) {
                                        this._currToken = _nextTokenWithBuffering3;
                                        return _nextTokenWithBuffering3;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean isStartHandled = this._headContext.isStartHandled();
                TokenFilter filter = this._headContext.getFilter();
                if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                    filter.filterFinishArray();
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (isStartHandled) {
                    this._currToken = nextToken;
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter3 = this._itemFilter;
                if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                    this._currToken = nextToken;
                    return nextToken;
                } else if (tokenFilter3 == null) {
                    this.delegate.skipChildren();
                } else {
                    this._headContext.checkValue(tokenFilter3);
                    if (tokenFilter3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (tokenFilter3 != TokenFilter.INCLUDE_ALL) {
                            tokenFilter3.filterStartObject();
                        }
                        this._itemFilter = tokenFilter3;
                        if (tokenFilter3 == TokenFilter.INCLUDE_ALL) {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilter3, true);
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        TokenFilterContext createChildObjectContext = this._headContext.createChildObjectContext(tokenFilter3, false);
                        this._headContext = createChildObjectContext;
                        if (this._includePath && (_nextTokenWithBuffering = _nextTokenWithBuffering(createChildObjectContext)) != null) {
                            this._currToken = _nextTokenWithBuffering;
                            return _nextTokenWithBuffering;
                        }
                    }
                }
            }
            return _nextToken2();
        }
        this._currToken = null;
        return null;
    }

    public JsonToken nextValue() throws IOException {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                return this;
            }
            if (nextToken.isStructStart()) {
                i++;
            } else if (nextToken.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    public int getValueAsInt(int i) throws IOException {
        return this.delegate.getValueAsInt(i);
    }

    public long getValueAsLong(long j) throws IOException {
        return this.delegate.getValueAsLong(j);
    }

    public String getValueAsString(String str) throws IOException {
        return this.delegate.getValueAsString(str);
    }
}
