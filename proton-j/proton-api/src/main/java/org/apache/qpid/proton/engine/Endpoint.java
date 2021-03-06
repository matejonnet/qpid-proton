/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
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
 *
 */
package org.apache.qpid.proton.engine;


/**
 * Endpoint
 *
 */

public interface Endpoint
{
    /**
     * @return the local endpoint state
     */
    public EndpointState getLocalState();

    /**
     * @return the remote endpoint state (as last communicated)
     */
    public EndpointState getRemoteState();

    /**
     * @return the local endpoint error, or null if there is none
     */
    public EndpointError getLocalError();

    /**
     * @return the remote endpoint error, or null if there is none
     */
    public EndpointError getRemoteError();

    /**
     * free the endpoint and any associated resources
     */
    public void free();

    /**
     * transition local state to ACTIVE
     */
    void open();

    /**
     * transition local state to CLOSED
     */
    void close();

    public void setContext(Object o);

    public Object getContext();
}
