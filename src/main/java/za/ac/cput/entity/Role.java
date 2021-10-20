/*  Role.java
        Entity for Role
        *  Author: Vuyisa Nkangana(218192215)
        *  Date: 11 June 2021
        */
package za.ac.cput.entity;

public class Role {
    private int userId;
    private int roleId;
    private String roleName;
    private String roleDescription;

    private Role(Builder builder) {
        this.userId = builder.userId;
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
        this.roleDescription = builder.roleDescription;
    }

    @Override
    public String toString() {

        return "Role{" +
                "userId =" + userId +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }

    public static class Builder {
        public int userId;
        private int roleId;
        private String roleName;
        private String roleDescription;

        public Builder setUserId(int userId){
            this.userId = userId;
            return this;

        }
        public Builder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }
        public Builder setRoleName(String roleName){
            this.roleName = roleName;
            return this;
        }
        public Builder setRoleDescription(String roleDescription){
            this.roleDescription = roleDescription;
            return this;
        }

        public Role build() {
            return new Role(this);
        }
        public Builder copy(Role Role) {
            this.userId = Role.userId;
            this.roleId = Role.roleId;
            this.roleName = Role.roleName;
            this.roleDescription = Role.roleDescription;

            return this;
        }

    }
}
