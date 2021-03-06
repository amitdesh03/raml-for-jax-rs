/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.examples.ramlexamples;

import org.raml.jaxrs.common.Example;
import org.raml.jaxrs.common.Examples;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/realtypes")
public class ResourceWithRealTypes {

  @Path("xml")
  @POST
  @Consumes("application/xml")
  @Produces("application/xml")
  @Deprecated
  @Examples({
      @Example(useCase = "xml", value = "<consumed>blah</consumed>")
  })
  public ProducedValue postWithQueryParameters(ConsumedValue consumed) {
    return null;
  }

  @Path("json")
  @GET
  @Produces("application/json")
  @Deprecated
  public ProducedJsonValue getWithQueryParameters(ConsumedValue consumed) {
    return null;
  }

}
