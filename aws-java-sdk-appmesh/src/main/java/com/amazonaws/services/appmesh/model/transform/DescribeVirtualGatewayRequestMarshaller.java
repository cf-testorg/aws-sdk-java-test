/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appmesh.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeVirtualGatewayRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeVirtualGatewayRequestMarshaller {

    private static final MarshallingInfo<String> MESHNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("meshName").build();
    private static final MarshallingInfo<String> MESHOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("meshOwner").build();
    private static final MarshallingInfo<String> VIRTUALGATEWAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("virtualGatewayName").build();

    private static final DescribeVirtualGatewayRequestMarshaller instance = new DescribeVirtualGatewayRequestMarshaller();

    public static DescribeVirtualGatewayRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeVirtualGatewayRequest describeVirtualGatewayRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeVirtualGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeVirtualGatewayRequest.getMeshName(), MESHNAME_BINDING);
            protocolMarshaller.marshall(describeVirtualGatewayRequest.getMeshOwner(), MESHOWNER_BINDING);
            protocolMarshaller.marshall(describeVirtualGatewayRequest.getVirtualGatewayName(), VIRTUALGATEWAYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
