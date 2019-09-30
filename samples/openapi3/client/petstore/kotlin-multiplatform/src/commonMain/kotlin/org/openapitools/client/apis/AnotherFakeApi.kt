/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.Client

import org.openapitools.client.infrastructure.*
import io.ktor.client.request.forms.formData
import kotlinx.serialization.UnstableDefault
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor

class AnotherFakeApi @UseExperimental(UnstableDefault::class) constructor(
        baseUrl: kotlin.String = "http://petstore.swagger.io:80/v2",
        httpClientEngine: HttpClientEngine? = null,
        serializer: KotlinxSerializer)
    : ApiClient(baseUrl, httpClientEngine, serializer) {

    @UseExperimental(UnstableDefault::class)
    constructor(
        baseUrl: kotlin.String = "http://petstore.swagger.io:80/v2",
        httpClientEngine: HttpClientEngine? = null,
        jsonConfiguration: JsonConfiguration = JsonConfiguration.Default)
    : this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    /**
    * To test special tags
    * To test special tags and operation ID starting with number
    * @param client client model 
    * @return Client
    */
    @Suppress("UNCHECKED_CAST")
    suspend fun call123testSpecialTags(client: Client) : HttpResponse<Client> {

        val localVariableBody = client

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/another-fake/dummy",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody
        ).wrap()
    }

    


    companion object {
        internal fun setMappers(serializer: KotlinxSerializer) {
            
        }
    }
}
