/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.codec;

import com.google.common.base.Function;
import org.jclouds.representations.Location;
import org.jclouds.javax.annotation.Nullable;

public enum ToLocation implements Function<org.jclouds.domain.Location, Location> {

   INSTANCE;

   @Override
   public Location apply(@Nullable org.jclouds.domain.Location input) {
      if (input == null) {
         return null;
      }
      return Location.builder().id(input.getId()).scope(input.getScope().name())
                     .parentId(input.getParent() != null ? input.getParent().getId() : null)
                     .description(input.getDescription())
                     .iso3166Codes(input.getIso3166Codes()).build();
   }
}
