package org.hawkular.client.android.service;

import org.hawkular.client.android.backend.model.Trigger;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by pallavi on 26/06/17.
 */

public interface AcknowledgeAlertService {

    @FormUrlEncoded
    @POST("/hawkular/alerts/ack")
    Call<List<String>> post();

}
