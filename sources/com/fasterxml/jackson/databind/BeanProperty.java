package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Named;
import java.io.Serializable;

public interface BeanProperty extends Named {
    public static final JsonFormat.Value EMPTY_FORMAT = new JsonFormat.Value();

    public static class Bogus implements BeanProperty {
        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return JsonFormat.Value.empty();
        }

        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        public PropertyName getFullName() {
            return PropertyName.NO_NAME;
        }

        public AnnotatedMember getMember() {
            return null;
        }

        public PropertyMetadata getMetadata() {
            return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }

        public String getName() {
            return "";
        }

        public JavaType getType() {
            return TypeFactory.unknownType();
        }
    }

    public static class Std implements BeanProperty, Serializable {
        protected final AnnotatedMember _member;
        protected final PropertyMetadata _metadata;
        protected final PropertyName _name;
        protected final JavaType _type;
        protected final PropertyName _wrapperName;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this._name = propertyName;
            this._type = javaType;
            this._wrapperName = propertyName2;
            this._metadata = propertyMetadata;
            this._member = annotatedMember;
        }

        public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonFormat.Value findFormat;
            JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector == null || (annotatedMember = this._member) == null || (findFormat = annotationIntrospector.findFormat(annotatedMember)) == null) {
                return defaultPropertyFormat;
            }
            return defaultPropertyFormat.withOverrides(findFormat);
        }

        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            AnnotatedMember annotatedMember;
            JsonInclude.Value findPropertyInclusion;
            JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, this._type.getRawClass());
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector == null || (annotatedMember = this._member) == null || (findPropertyInclusion = annotationIntrospector.findPropertyInclusion(annotatedMember)) == null) {
                return defaultInclusion;
            }
            return defaultInclusion.withOverrides(findPropertyInclusion);
        }

        public PropertyName getFullName() {
            return this._name;
        }

        public AnnotatedMember getMember() {
            return this._member;
        }

        public PropertyMetadata getMetadata() {
            return this._metadata;
        }

        public String getName() {
            return this._name.getSimpleName();
        }

        public JavaType getType() {
            return this._type;
        }

        public PropertyName getWrapperName() {
            return this._wrapperName;
        }
    }

    static {
        JsonInclude.Value.empty();
    }

    JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls);

    JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls);

    PropertyName getFullName();

    AnnotatedMember getMember();

    PropertyMetadata getMetadata();

    String getName();

    JavaType getType();
}
