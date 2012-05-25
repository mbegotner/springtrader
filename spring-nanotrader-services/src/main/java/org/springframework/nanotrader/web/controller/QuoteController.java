package org.springframework.nanotrader.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.nanotrader.service.domain.Quote;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Provides JSON based REST api to Quote repository
 * 
 * @author Brian Dussault
 */
@Controller
public class QuoteController extends BaseController {
	
	@RequestMapping(value = "/quote/{symbol}", method = RequestMethod.GET)
	@ResponseBody
	public Quote findQuote(@PathVariable("symbol") final String symbol) {
		Quote responseQuote = getTradingServiceFacade().findQuoteBySymbol(symbol);
		return responseQuote;
	}
	
	@RequestMapping(value = "/quote", method = RequestMethod.POST)
	@ResponseStatus( HttpStatus.METHOD_NOT_ALLOWED )
	public void post() {
	}
	
	@RequestMapping(value = "/quote/{symbol}", method = RequestMethod.PUT)
	@ResponseStatus( HttpStatus.METHOD_NOT_ALLOWED )
	public void put() {
		
	}
	
	@RequestMapping(value = "/quote/{symbol}", method = RequestMethod.DELETE)
	@ResponseStatus( HttpStatus.METHOD_NOT_ALLOWED )
	public void delete() {
		
	}
	
}
