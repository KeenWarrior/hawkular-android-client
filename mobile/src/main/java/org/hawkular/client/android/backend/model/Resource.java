/*
 * Copyright 2015-2017 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.client.android.backend.model;

import com.squareup.moshi.Json;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

public final class Resource {
    @Json(name = "id")
    private String id;

    @Json(name = "name")
    private String name;

    @Json(name = "type")
    private ResourceType type;

    @Json(name = "path")
    private String path;

    @Json(name = "properties")
    private ResourceProperties properties;

    @VisibleForTesting
    public Resource(@NonNull String id, @NonNull ResourceType type, @NonNull ResourceProperties properties) {
        this.id = id;
        this.type = type;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public ResourceType getType() {
        return type;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getFeed() {
        String[] temp = path.split("/");
        for (String string : temp) {
            if (string.startsWith("f")) {
                return string.substring(2);
            }
        }
        return null;
    }

    public ResourceProperties getProperties() {
        return properties;
    }

}
