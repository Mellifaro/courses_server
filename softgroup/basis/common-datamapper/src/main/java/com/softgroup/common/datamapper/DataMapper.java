package com.softgroup.common.datamapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import java.io.InputStream;
import java.util.Map;

/**
 * @author vlischyshyn
 */
public interface DataMapper {

	Map<String, Object> convertToMap(Object value);

	<T> T convert(Object map, Class<T> dataType);

	<T> T convert(Object map, TypeReference<T> dataType);

	<T> T mapData(String data, Class<T> dataType);

	<T> T mapData(String data, TypeReference<T> dataType);

	<T> T mapData(byte[] message, Class<T> dataType);

	<T extends JavaType> T readValue(InputStream src, T valueType);

	<T> String dataToString(T data);

	String objectToString(Object data);

}
