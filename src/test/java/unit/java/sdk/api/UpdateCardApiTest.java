/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package unit.java.sdk.api;

import unit.java.sdk.ApiException;
import unit.java.sdk.model.UnitCardResponse;
import unit.java.sdk.model.UpdateCard;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for UpdateCardApi
 */
@Ignore
public class UpdateCardApiTest {

    private final UpdateCardApi api = new UpdateCardApi();

    
    /**
     * Update Card
     *
     * Update a Card via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String cardId = null;
        UpdateCard updateCard = null;
        UnitCardResponse response = 
        api.execute(cardId, updateCard);
        
        // TODO: test validations
    }
    
}
