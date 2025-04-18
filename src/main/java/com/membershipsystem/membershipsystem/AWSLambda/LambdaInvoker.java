package com.membershipsystem.membershipsystem.AWSLambda;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.lambda.LambdaClient;
import software.amazon.awssdk.services.lambda.model.InvokeRequest;
import software.amazon.awssdk.services.lambda.model.InvokeResponse;

import java.nio.ByteBuffer;

public class LambdaInvoker {
    private static final String ACCESS_KEY = "TYPE_YOUR_VALUE";
    private static final String SECRET_KEY = "TYPE_YOUR_VALUE";

    public static void invokeLambdaFunction(Long memberId) {
        try {
            String functionName = "TYPE_YOUR_VALUE";

            AwsBasicCredentials awsCredentials = AwsBasicCredentials.create(ACCESS_KEY, SECRET_KEY);

            LambdaClient lambdaClient = LambdaClient.builder()
                    .region(Region.US_EAST_1)
                    //.credentialsProvider(() -> awsCredentials)
                    .build();

            SdkBytes payload = SdkBytes.fromUtf8String(String.valueOf(memberId));

            InvokeRequest invokeRequest = InvokeRequest.builder()
                    .functionName(functionName)
                    .payload(payload)
                    .build();

            InvokeResponse response = lambdaClient.invoke(invokeRequest);

            System.out.println("Succeeded with invoking the lambda: " + response);
        } catch (Exception e) {
            System.err.println("Error while invoking the lambda: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
