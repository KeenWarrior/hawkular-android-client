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

import android.support.annotation.NonNull;

import com.squareup.moshi.Json;

public enum MetricAvailability {
    @Json(name="UP")
    UP(Names.UP),
    @Json(name = "DOWN")
    DOWN(Names.DOWN),
    @Json(name = "UNKNOWN")
    UNKNOWN(Names.UNKNOWN);

    private static final class Names {
        private Names() {
        }

        public static final String UP = "up";
        public static final String DOWN = "down";
        public static final String UNKNOWN = "unknown";
    }

    private final String name;

    MetricAvailability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @NonNull
    public static MetricAvailability from(@NonNull String name) {
        switch (name.toLowerCase()) {
            case Names.UP:
                return MetricAvailability.UP;

            case Names.DOWN:
                return MetricAvailability.DOWN;

            default:
                return MetricAvailability.UNKNOWN;
        }
    }

}
