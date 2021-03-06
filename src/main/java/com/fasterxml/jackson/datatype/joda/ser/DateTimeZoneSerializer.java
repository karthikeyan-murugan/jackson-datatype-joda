package com.fasterxml.jackson.datatype.joda.ser;

import java.io.IOException;

import org.joda.time.DateTimeZone;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DateTimeZoneSerializer extends JodaSerializerBase<DateTimeZone>
{
    public DateTimeZoneSerializer() { super(DateTimeZone.class); }

    @Override
    public void serialize(DateTimeZone value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException
    {
        jgen.writeString(value.getID());
	}
}
