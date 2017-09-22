/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.fs.azuredfs.contracts.exceptions;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Thrown a service is either not configured to be injected or the service is not existing.
 * For service registration
 * @see org.apache.hadoop.fs.azuredfs.services.ServiceProviderImpl
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public final class ServiceResolutionException extends AzureDistributedFileSystemException {
  public ServiceResolutionException(String serviceName, Exception innerException) {
    super(String.format("%s cannot be resolved.", serviceName), innerException);
  }
}