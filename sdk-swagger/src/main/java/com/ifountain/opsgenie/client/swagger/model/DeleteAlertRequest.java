/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;

/**
 * Deletes an alert using alert id, tiny id or alias
 */
@ApiModel(description = "Deletes an alert using alert id, tiny id or alias")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-19T13:16:01.587+03:00")
public class DeleteAlertRequest {
    @JsonProperty("identifier")
    private String identifier = null;
    @JsonProperty("identifierType")
    private IdentifierTypeEnum identifierType = IdentifierTypeEnum.ID;
    @JsonProperty("source")
    private String source = null;
    @JsonProperty("user")
    private String user = null;

    public DeleteAlertRequest identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Identifier of alert which could be alert id, tiny id or alert alias
     *
     * @return identifier
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Identifier of alert which could be alert id, tiny id or alert alias")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public DeleteAlertRequest identifierType(IdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    /**
     * Type of the identifier that is provided as an in-line parameter. Possible values are 'id', 'alias' or 'tiny'
     *
     * @return identifierType
     **/
    @ApiModelProperty(value = "Type of the identifier that is provided as an in-line parameter. Possible values are 'id', 'alias' or 'tiny'")
    public IdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(IdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
    }

    public DeleteAlertRequest source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Display name of the request source
     *
     * @return source
     **/
    @ApiModelProperty(value = "Display name of the request source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public DeleteAlertRequest user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Display name of the request owner
     *
     * @return user
     **/
    @ApiModelProperty(value = "Display name of the request owner")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAlertRequest deleteAlertRequest = (DeleteAlertRequest) o;
        return ObjectUtils.equals(this.identifier, deleteAlertRequest.identifier) &&
                ObjectUtils.equals(this.identifierType, deleteAlertRequest.identifierType) &&
                ObjectUtils.equals(this.source, deleteAlertRequest.source) &&
                ObjectUtils.equals(this.user, deleteAlertRequest.user);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(identifier, identifierType, source, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlertRequest {\n");

        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Type of the identifier that is provided as an in-line parameter. Possible values are 'id', 'alias' or 'tiny'
     */
    public enum IdentifierTypeEnum {
        ID("id"),

        ALIAS("alias"),

        TINY("tiny");

        private String value;

        IdentifierTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static IdentifierTypeEnum fromValue(String text) {
            for (IdentifierTypeEnum b : IdentifierTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}
