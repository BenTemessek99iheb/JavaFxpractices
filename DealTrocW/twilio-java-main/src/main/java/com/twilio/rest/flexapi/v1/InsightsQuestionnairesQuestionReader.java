/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;

import java.util.List;


public class InsightsQuestionnairesQuestionReader extends Reader<InsightsQuestionnairesQuestion> {
    private String token;
    private List<String> categoryId;
    private Integer pageSize;

    public InsightsQuestionnairesQuestionReader(){
    }

    public InsightsQuestionnairesQuestionReader setToken(final String token){
        this.token = token;
        return this;
    }
    public InsightsQuestionnairesQuestionReader setCategoryId(final List<String> categoryId){
        this.categoryId = categoryId;
        return this;
    }
    public InsightsQuestionnairesQuestionReader setCategoryId(final String categoryId){
        return setCategoryId(Promoter.listOfOne(categoryId));
    }
    public InsightsQuestionnairesQuestionReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<InsightsQuestionnairesQuestion> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<InsightsQuestionnairesQuestion> firstPage(final TwilioRestClient client) {
        String path = "/v1/Insights/QM/Questions";

        Request request = new Request(
            HttpMethod.GET,
            Domains.FLEXAPI.toString(),
            path
        );

        addQueryParams(request);
        addHeaderParams(request);
        return pageForRequest(client, request);
    }

    private Page<InsightsQuestionnairesQuestion> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("InsightsQuestionnairesQuestion read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "questions",
            response.getContent(),
            InsightsQuestionnairesQuestion.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<InsightsQuestionnairesQuestion> previousPage(final Page<InsightsQuestionnairesQuestion> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.FLEXAPI.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<InsightsQuestionnairesQuestion> nextPage(final Page<InsightsQuestionnairesQuestion> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.FLEXAPI.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<InsightsQuestionnairesQuestion> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addHeaderParams(final Request request) {
        if (token != null) {
            request.addHeaderParam("Token", token);

        }
    }
    private void addQueryParams(final Request request) {
        if (categoryId != null) {
            for (String prop : categoryId) {
                request.addQueryParam("CategoryId", prop);
            }
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
