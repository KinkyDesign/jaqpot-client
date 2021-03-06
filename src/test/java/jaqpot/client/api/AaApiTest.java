/*
 * Jaqpot API
 * Jaqpot v4 (Quattro) is the 4th version of a YAQP, a RESTful web service which can be used to train machine learning models and use them to obtain toxicological predictions for given chemical compounds or engineered nano materials. The project is written in Java8 and JEE7.
 *
 * OpenAPI spec version: 4.0.3
 * Contact: hampos@me.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package jaqpot.client.api;

import jaqpot.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for AaApi
 */
@Ignore
public class AaApiTest {

    private final AaApi api = new AaApi();

    
    /**
     * Requests authorization from SSO
     *
     * Checks whether the client identified by the provided AA token can apply a method to a URI
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeTest() throws ApiException {
        String subjectid = null;
        String method = null;
        String uri = null;
        api.authorize(subjectid, method, uri);

        // TODO: test validations
    }
    
    /**
     * Creates Security Token
     *
     * Uses OpenAM server to get a security token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        String username = null;
        String password = null;
        api.login(username, password);

        // TODO: test validations
    }
    
    /**
     * Logs out a user
     *
     * Invalidates a security token and logs out the corresponding user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        String subjectid = null;
        api.logout(subjectid);

        // TODO: test validations
    }
    
    /**
     * Validate authorization token
     *
     * Checks whether an authorization token is valid
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateTest() throws ApiException {
        String subjectid = null;
        api.validate(subjectid);

        // TODO: test validations
    }
    
}
