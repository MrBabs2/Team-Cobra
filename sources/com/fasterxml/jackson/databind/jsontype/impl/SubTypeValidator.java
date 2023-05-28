package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SubTypeValidator {
    protected static final Set<String> DEFAULT_NO_DESER_CLASS_NAMES;
    private static final SubTypeValidator instance = new SubTypeValidator();
    protected Set<String> _cfgIllegalClassNames = DEFAULT_NO_DESER_CLASS_NAMES;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("org.apache.commons.collections.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections.functors.InstantiateTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InstantiateTransformer");
        hashSet.add("org.codehaus.groovy.runtime.ConvertedClosure");
        hashSet.add("org.codehaus.groovy.runtime.MethodClosure");
        hashSet.add("org.springframework.beans.factory.ObjectFactory");
        hashSet.add("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
        hashSet.add("org.apache.xalan.xsltc.trax.TemplatesImpl");
        hashSet.add("com.sun.rowset.JdbcRowSetImpl");
        hashSet.add("java.util.logging.FileHandler");
        hashSet.add("java.rmi.server.UnicastRemoteObject");
        hashSet.add("org.springframework.beans.factory.config.PropertyPathFactoryBean");
        hashSet.add("com.mchange.v2.c3p0.JndiRefForwardingDataSource");
        hashSet.add("com.mchange.v2.c3p0.WrapperConnectionPoolDataSource");
        hashSet.add("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
        hashSet.add("com.sun.org.apache.bcel.internal.util.ClassLoader");
        hashSet.add("org.hibernate.jmx.StatisticsService");
        hashSet.add("org.apache.ibatis.datasource.jndi.JndiDataSourceFactory");
        DEFAULT_NO_DESER_CLASS_NAMES = Collections.unmodifiableSet(hashSet);
    }

    protected SubTypeValidator() {
    }

    public static SubTypeValidator instance() {
        return instance;
    }

    public void validateSubType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class rawClass = javaType.getRawClass();
        String name = rawClass.getName();
        if (!this._cfgIllegalClassNames.contains(name)) {
            if (!rawClass.isInterface() && name.startsWith("org.springframework.")) {
                while (rawClass != null && rawClass != Object.class) {
                    String simpleName = rawClass.getSimpleName();
                    if (!"AbstractPointcutAdvisor".equals(simpleName) && !"AbstractApplicationContext".equals(simpleName)) {
                        rawClass = rawClass.getSuperclass();
                    }
                }
                return;
            }
            return;
        }
        deserializationContext.reportBadTypeDefinition(beanDescription, "Illegal type (%s) to deserialize: prevented for security reasons", name);
        throw null;
    }
}
