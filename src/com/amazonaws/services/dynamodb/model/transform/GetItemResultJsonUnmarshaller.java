/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodb.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Get Item Result JSON Unmarshaller
 */
public class GetItemResultJsonUnmarshaller implements Unmarshaller<GetItemResult, JsonUnmarshallerContext> {

    

    public GetItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetItemResult getItemResult = new GetItemResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth; // + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return getItemResult;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Item", targetDepth)) {
                    getItemResult.setItem(new MapUnmarshaller<String,AttributeValue>(StringJsonUnmarshaller.getInstance(), AttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ConsumedCapacityUnits", targetDepth)) {
                    context.nextToken();
                    getItemResult.setConsumedCapacityUnits(DoubleJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getItemResult;
                }
            }
            token = context.nextToken();
        }
    }

    private static GetItemResultJsonUnmarshaller instance;
    public static GetItemResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetItemResultJsonUnmarshaller();
        return instance;
    }
}
    