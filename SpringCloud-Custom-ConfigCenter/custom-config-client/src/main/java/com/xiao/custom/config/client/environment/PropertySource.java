/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xiao.custom.config.client.environment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Simple plain text serializable encapsulation of a named source of key-value pairs.
 * Basically a DTO for {@link PropertySource}, but also applicable outside the domain of a
 * Spring application.
 *
 * @author Dave Syer
 */
public class PropertySource {

    private String name;

    private Map<?, ?> source;

    @JsonCreator
    public PropertySource(@JsonProperty("name") String name,
                          @JsonProperty("source") Map<?, ?> source) {
        this.name = name;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public Map<?, ?> getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "PropertySource [name=" + name + "]";
    }

}
