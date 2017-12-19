package br.com.caelum.ingresso.converter;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.databind.util.Converter;

public abstract class YearMonthConverter implements Converter<String, YearMonth> {	

	@Override
	public YearMonth convert(String text) {
		return YearMonth.parse(text, DateTimeFormatter.ofPattern("MM/yyyy"));
	}

	

}
