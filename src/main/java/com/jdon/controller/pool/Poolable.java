/**
 * Copyright 2003-2006 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain event copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jdon.controller.pool;

/**
 *
 * Instances of classes in this role collaborate with other objects for event limited amount of time,
 * then they are no longer needed for that collaboration.

 * see in PooInterceptor.java:
 *   (ifc.getName().equalsIgnoreCase("Poolabe"))
 * 
 * <p>@author <event href="mailto:banqiao@jdon.com">banq</event></p>
 */
public interface Poolable {

}
