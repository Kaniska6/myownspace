/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.person.control.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * new-crdStatus defines the observed state of new-crd
 */
@ApiModel(description = "new-crdStatus defines the observed state of new-crd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
		date = "2024-09-18T18:21:12.109Z[Etc/UTC]")
public class V1NewCrdSpec {

	public static final String SERIALIZED_NAME_NAME = "name";

	@SerializedName(SERIALIZED_NAME_NAME)
	private String name;

	public V1NewCrdSpec name(String name) {

		this.name = name;
		return this;
	}

	/**
	 * My new-crd
	 * @return name
	 **/
	@javax.annotation.Nullable
	@ApiModelProperty(value = "My new-crd")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		V1NewCrdSpec v1NewCrdSpec = (V1NewCrdSpec) o;
		return Objects.equals(this.name, v1NewCrdSpec.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class V1NewCrdSpec {\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the
	 * first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
