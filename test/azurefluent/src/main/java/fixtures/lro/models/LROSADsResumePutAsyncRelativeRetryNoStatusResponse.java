// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.lro.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import fixtures.lro.implementation.LROSADsPutAsyncRelativeRetryNoStatusHeadersInner;
import fixtures.lro.implementation.ProductInner;

/**
 * Contains all response data for the resumePutAsyncRelativeRetryNoStatus operation.
 */
public final class LROSADsResumePutAsyncRelativeRetryNoStatusResponse extends ResponseBase<LROSADsPutAsyncRelativeRetryNoStatusHeadersInner, ProductInner> {
    /**
     * Creates an instance of LROSADsResumePutAsyncRelativeRetryNoStatusResponse.
     *
     * @param request the request which resulted in this LROSADsResumePutAsyncRelativeRetryNoStatusResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public LROSADsResumePutAsyncRelativeRetryNoStatusResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, ProductInner value, LROSADsPutAsyncRelativeRetryNoStatusHeadersInner headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public ProductInner value() {
        return super.value();
    }
}