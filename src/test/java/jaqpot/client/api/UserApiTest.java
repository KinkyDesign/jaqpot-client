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
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Finds User by Id
     *
     * Finds specified user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String id = null;
        String subjectid = null;
        api.getUser(id, subjectid);

        // TODO: test validations
    }
    
    /**
     * Retrieves user&#39;s quota
     *
     * Returns user&#39;s quota given the user&#39;s ID. Authenicated users can access only their own quota. Jaqpot administrators can access the quota of all Jaqpot users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserQuotaTest() throws ApiException {
        String id = null;
        String subjectid = null;
        api.getUserQuota(id, subjectid);

        // TODO: test validations
    }
    
    /**
     * Lists all Users (admins only)
     *
     * Lists all Users of Jaqpot Quattro. This operation can only be performed by the system administrators.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsersTest() throws ApiException {
        String subjectid = null;
        Integer start = null;
        Integer max = null;
        api.listUsers(subjectid, start, max);

        // TODO: test validations
    }
    
}
