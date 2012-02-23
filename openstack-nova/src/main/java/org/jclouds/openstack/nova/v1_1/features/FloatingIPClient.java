/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.openstack.nova.v1_1.features;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.jclouds.concurrent.Timeout;
import org.jclouds.openstack.nova.v1_1.domain.FloatingIP;

/**
 * Provides synchronous access to Floating IPs.
 * <p/>
 * 
 * @see FloatingIPAsyncClient
 * @author Jeremy Daggett
 */
@Timeout(duration = 30, timeUnit = TimeUnit.SECONDS)
public interface FloatingIPClient {

   /**
    * List all Floating IP addresses
    * 
    * @return all Floating IPs
    */
   Set<FloatingIP> listFloatingIPs();

   /**
    * Get a specific Floating IP address
    * 
    * @return all Floating IPs
    */
   FloatingIP getFloatingIP(String id);

   /**
    * Allocate a Floating IP address
    * 
    * @return a newly allocated FloatingIP
    */
   FloatingIP allocate();

   /**
    * Deallocate a Floating IP address
    * 
    * @param id
    *           the Floating IP id
    */
   void deallocate(String id);

}
