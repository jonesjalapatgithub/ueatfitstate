package com.ueatfit.states.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ueatfit.states.dao.StatesDao;
import com.ueatfit.states.model.States;

@RestController
public class StatesController {
	
	
	@Autowired
	StatesDao statesDao;
	
	
    /**
     * Web service endpoint to check Authentication. 
     * 
     * If executed successfully, return with
     * HTTP status 201.
     * 
     * If not executed successfully, the service returns response body
     * with HTTP status 401.
     * 
     * @param  The String to be displayed.
     * @return A String containing a HTTP status code as described in the method
     *         comment.
     */
    @RequestMapping(value = "/echo/{in}", method = RequestMethod.GET)
    public String echo(@PathVariable(value = "in") final String in) {
    	return "Hello " + ", you said: " + in;
    }
	
	
    /**
     * Web service endpoint to get States. 
     * 
     * If executed successfully, return with
     * HTTP status 201.
     * 
     * If not executed successfully, the service returns response body
     * with HTTP status 401.
     * 
     * @param  The String to be passed to get state.
     * @return A String containing a HTTP status code as described in the method
     *         comment.
     */
    @RequestMapping(value = "/states/{stateName}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://127.0.0.1:3000")
    public ResponseEntity<List<States>> getStates(@PathVariable(value = "stateName") final String stateName) {
    	return new ResponseEntity<List<States>>(statesDao.findByStateCode(
    			Integer.parseInt(stateName)),HttpStatus.CREATED);
    }
	
    /**
     * Web service endpoint to get All States. 
     * 
     * If executed successfully, return with
     * HTTP status 201.
     * 
     * If not executed successfully, the service returns response body
     * with HTTP status 401.
     * 
     * @return A String containing a HTTP status code as described in the method
     *         comment.
     */
    @RequestMapping(value = "/states", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<States>> getAllStates() {
    	return new ResponseEntity<List<States>>(statesDao.findAll(),HttpStatus.CREATED);
    }
	

}
