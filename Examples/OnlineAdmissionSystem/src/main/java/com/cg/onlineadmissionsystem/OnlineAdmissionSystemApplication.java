package com.cg.onlineadmissionsystem;

import com.cg.onlineadmissionsystem.Model.Role;
import com.cg.onlineadmissionsystem.Model.User;
import com.cg.onlineadmissionsystem.Model.UserRoles;
import com.cg.onlineadmissionsystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class OnlineAdmissionSystemApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;
    public static void main(String[] args)
    {

        SpringApplication.run(OnlineAdmissionSystemApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("starting code");
//        User user = new User();
//        user.setFirstName("Admin");
//        user.setLastName("cg");
//        user.setMiddleName("Admin");
//        user.setEmail("admin@cg.com");
//        user.setMobileNumber("1234567899");
//        user.setPassword("abc");
//        user.setAadharCardNo("1234567899");
//        Role role1 = new Role();
//        role1.setRoleId(1);
//        role1.setRoleName("ADMIN");
//
//        Set<UserRoles> userRolesSet =new HashSet<>();
//        UserRoles userRoles = new UserRoles();
//        userRoles.setRole(role1);
//        userRoles.setUser(user);
//        userRolesSet.add(userRoles);
//
//       User user1= this.userService.createuser(user,userRolesSet);
//        System.out.println(user1.getEmail());
    }
}
