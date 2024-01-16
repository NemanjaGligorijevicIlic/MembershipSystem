package com.membershipsystem.membershipsystem.AWSLambda;

import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.lambda.LambdaClient;
import software.amazon.awssdk.services.lambda.model.InvokeRequest;
import software.amazon.awssdk.services.lambda.model.InvokeResponse;

import java.nio.ByteBuffer;

public class LambdaInvoker {
    public static void invokeLambdaFunction(Long memberId) {
        String functionName = "arn:aws:lambda:us-east-1:402531399111:function:APICallsRegistration";

        ByteBuffer payloadBuffer = ByteBuffer.allocate(Long.BYTES);
        payloadBuffer.putLong(memberId);
        payloadBuffer.flip();

        LambdaClient lambdaClient = LambdaClient.builder()
                .region(Region.US_EAST_1)
                .credentialsProvider(DefaultCredentialsProvider.create())
                .build();

        InvokeRequest invokeRequest = InvokeRequest.builder()
                .functionName(functionName)
                .payload(SdkBytes.fromByteBuffer(payloadBuffer))
                .build();

        InvokeResponse response = lambdaClient.invoke(invokeRequest);
    }
}
