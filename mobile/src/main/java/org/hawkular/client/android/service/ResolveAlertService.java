package org.hawkular.client.android.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by pallavi on 26/06/17.
 */

public interface ResolveAlertService {


    @FormUrlEncoded
    @POST("/hawkular/alerts/resolve")
    Call<List<String>> post();

}
