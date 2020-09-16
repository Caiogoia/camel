
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxGroupsManager}.
 */
@ApiParams(apiName = "groups", description = "Provides operations to manage Box groups",
           apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="Add a member to group with the specified role"), @ApiMethod(methodName = "createGroup", description="Create a new group with a specified name and optional additional parameters"), @ApiMethod(methodName = "deleteGroup", description="Delete group"), @ApiMethod(methodName = "deleteGroupMembership", description="Delete group membership"), @ApiMethod(methodName = "getAllGroups", description="Get all the groups in the enterprise"), @ApiMethod(methodName = "getGroupInfo", description="Get group information"), @ApiMethod(methodName = "getGroupMembershipInfo", description="Get group membership information"), @ApiMethod(methodName = "getGroupMemberships", description="Get information about all of the group memberships for this group"), @ApiMethod(methodName = "updateGroupInfo", description="Update group information"), @ApiMethod(methodName = "updateGroupMembershipInfo", description="Update group membership information")})
@UriParams
@Configurer
public final class BoxGroupsManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "createGroup", description="The description of the new group")})
    private String description;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "createGroup", description="The external_sync_identifier of the new group")})
    private String externalSyncIdentifier;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="The id of group"), @ApiMethod(methodName = "deleteGroup", description="The id of group to delete"), @ApiMethod(methodName = "getGroupInfo", description="The id of group"), @ApiMethod(methodName = "getGroupMemberships", description="The id of group"), @ApiMethod(methodName = "updateGroupInfo", description="The id of group to update")})
    private String groupId;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "updateGroupInfo", description="The updated information")})
    private com.box.sdk.BoxGroup.Info groupInfo;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleteGroupMembership", description="The id of group membership to delete"), @ApiMethod(methodName = "getGroupMembershipInfo", description="The id of group membership"), @ApiMethod(methodName = "updateGroupMembershipInfo", description="The id of group membership to update")})
    private String groupMembershipId;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "updateGroupMembershipInfo", description="The updated information")})
    private com.box.sdk.BoxGroupMembership.Info info;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "createGroup", description="The invitibility_level of the new group")})
    private String invitabilityLevel;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "createGroup", description="The member_viewability_level of the new group")})
    private String memberViewabilityLevel;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "createGroup", description="The name of the new group")})
    private String name;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "createGroup", description="The provenance of the new group")})
    private String provenance;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="The role of the user in this group. Can be null to assign the default role.")})
    private com.box.sdk.BoxGroupMembership.Role role;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="The id of user to be added to group")})
    private String userId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalSyncIdentifier() {
        return externalSyncIdentifier;
    }

    public void setExternalSyncIdentifier(String externalSyncIdentifier) {
        this.externalSyncIdentifier = externalSyncIdentifier;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public com.box.sdk.BoxGroup.Info getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(com.box.sdk.BoxGroup.Info groupInfo) {
        this.groupInfo = groupInfo;
    }

    public String getGroupMembershipId() {
        return groupMembershipId;
    }

    public void setGroupMembershipId(String groupMembershipId) {
        this.groupMembershipId = groupMembershipId;
    }

    public com.box.sdk.BoxGroupMembership.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxGroupMembership.Info info) {
        this.info = info;
    }

    public String getInvitabilityLevel() {
        return invitabilityLevel;
    }

    public void setInvitabilityLevel(String invitabilityLevel) {
        this.invitabilityLevel = invitabilityLevel;
    }

    public String getMemberViewabilityLevel() {
        return memberViewabilityLevel;
    }

    public void setMemberViewabilityLevel(String memberViewabilityLevel) {
        this.memberViewabilityLevel = memberViewabilityLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public com.box.sdk.BoxGroupMembership.Role getRole() {
        return role;
    }

    public void setRole(com.box.sdk.BoxGroupMembership.Role role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
