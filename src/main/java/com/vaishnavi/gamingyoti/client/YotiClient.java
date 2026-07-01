package com.vaishnavi.gamingyoti.client;

import com.vaishnavi.gamingyoti.config.YotiProperties;
import com.vaishnavi.gamingyoti.dto.request.CreateSessionRequest;
import com.vaishnavi.gamingyoti.dto.response.YotiCreateSessionResponse;
import com.vaishnavi.gamingyoti.dto.response.YotiSessionResultResponse;
import com.vaishnavi.gamingyoti.dto.response.YotiSessionResponse;
import com.vaishnavi.gamingyoti.dto.yoti.AgeEstimation;
import com.vaishnavi.gamingyoti.dto.yoti.Callback;
import com.vaishnavi.gamingyoti.dto.yoti.DigitalId;
import com.vaishnavi.gamingyoti.dto.yoti.DocScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class YotiClient {

    private static final String BASE_URL = "https://age.yoti.com/api/v1";
    private static final String CALLBACK_URL = "https://gaming-yoti.onrender.com/result.html";
    private final RestClient restClient = RestClient.create();

    private final YotiProperties properties;
    private static final Logger log = LoggerFactory.getLogger(YotiClient.class);
    public YotiClient(YotiProperties properties) {
        this.properties = properties;
    }


    public YotiSessionResultResponse getSessionResult(String sessionId) {

        return restClient.get()
                .uri(BASE_URL + "/sessions/" + sessionId + "/result")
                .header("Authorization", "Bearer " + properties.getApiKey())
                .header("Yoti-SDK-Id", properties.getSdkId())
                .retrieve()
                .body(YotiSessionResultResponse.class);
    }

    public YotiSessionResponse createSession() {
        log.info("API Key Loaded: {}", properties.getApiKey() != null);
        log.info("SDK ID Loaded: {}", properties.getSdkId() != null);
        log.info("Age Threshold: {}", properties.getAgeThreshold());

        AgeEstimation age = new AgeEstimation();
        age.setAllowed(true);
        age.setThreshold(properties.getAgeThreshold());
        age.setLevel("PASSIVE");
        age.setRetryLimit(1);

        DigitalId digitalId = new DigitalId();
        digitalId.setAllowed(true);
        digitalId.setThreshold(18);
        digitalId.setAgeEstimationAllowed(true);
        digitalId.setAgeEstimationThreshold(properties.getAgeThreshold());
        digitalId.setRetryLimit(1);

        DocScan docScan = new DocScan();
        docScan.setAllowed(true);
        docScan.setThreshold(18);
        docScan.setAuthenticity("AUTO");
        docScan.setLevel("PASSIVE");
        docScan.setPresetIssuingCountry("GBR");
        docScan.setRetryLimit(1);
        Callback callback = new Callback();
        callback.setAuto(true);
        callback.setUrl(CALLBACK_URL);

        CreateSessionRequest request = new CreateSessionRequest();
        request.setType("OVER");
        request.setTtl(900);
        request.setAgeEstimation(age);
        request.setDigitalId(digitalId);
        request.setDocScan(docScan);
        request.setCallback(callback);
        request.setReferenceId("test_user_001");
        request.setRetryEnabled(true);
        request.setResumeEnabled(true);
        request.setSynchronousChecks(true);


        YotiCreateSessionResponse response = restClient.post()
                .uri(BASE_URL + "/sessions")
                .header("Authorization", "Bearer " + properties.getApiKey())
                .header("Yoti-SDK-Id", properties.getSdkId())
                .contentType(MediaType.APPLICATION_JSON)
                .body(request)
                .retrieve()
                .body(YotiCreateSessionResponse.class);

        String sessionUrl =
                "https://age.yoti.com?sessionId="
                        + response.getId()
                        + "&sdkId="
                        + properties.getSdkId();

        return new YotiSessionResponse(
                response.getId(),
                sessionUrl,
                response.getStatus(),
                response.getExpiresAt()
        );
    }
}