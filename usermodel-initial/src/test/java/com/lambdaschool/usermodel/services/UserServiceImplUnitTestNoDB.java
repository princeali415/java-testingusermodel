package com.lambdaschool.usermodel.services;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.lambdaschool.usermodel.UserModelApplicationTesting;
import com.lambdaschool.usermodel.models.Role;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.models.UserRoles;
import com.lambdaschool.usermodel.models.Useremail;
import com.lambdaschool.usermodel.repository.RoleRepository;
import com.lambdaschool.usermodel.repository.UserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplicationTesting.class,
properties = {"command.line.runner.enabled=false"})
public class UserServiceImplUnitTestNoDB
{

    // Stubs -> fake methods
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @MockBean
    private UserRepository userRepository;

    @MockBean
    private RoleRepository roleRepository;

    private List<User> userList = new ArrayList<>();


    @Before
    public void setUp() throws Exception
    {
        userService.deleteAll();
        roleService.deleteAll();
        Role r1 = new Role("admin");
        Role r2 = new Role("user");
        Role r3 = new Role("data");

        // manually set ids
        r1.setRoleid(1);
        r1.setRoleid(2);
        r1.setRoleid(3);

        // admin, data, user
        User u1 = new User("admin",
            "password",
            "admin@lambdaschool.local");
        u1.getRoles()
            .add(new UserRoles(u1,
                r1));
        u1.getRoles()
            .add(new UserRoles(u1,
                r2));
        u1.getRoles()
            .add(new UserRoles(u1,
                r3));
        u1.getUseremails()
            .add(new Useremail(u1,
                "admin@email.local"));
        //set useremailid
        u1.getUseremails().get(0).setUseremailid(11);

        u1.getUseremails()
            .add(new Useremail(u1,
                "admin@mymail.local"));
        //set useremailid
        u1.getUseremails().get(1).setUseremailid(12);

        // manually set ids
        u1.setUserid(1);

        // add u1 to array
        userList.add(u1);

        // data, user
        User u2 = new User("cinnamon",
            "1234567",
            "cinnamon@lambdaschool.local");
        u2.getRoles()
            .add(new UserRoles(u2,
                r2));
        u2.getRoles()
            .add(new UserRoles(u2,
                r3));
        u2.getUseremails()
            .add(new Useremail(u2,
                "cinnamon@mymail.local"));
        //set useremailid
        u2.getUseremails().get(0).setUseremailid(11);

        u2.getUseremails()
            .add(new Useremail(u2,
                "hops@mymail.local"));
        //set useremailid
        u2.getUseremails().get(1).setUseremailid(12);

        u2.getUseremails()
            .add(new Useremail(u2,
                "bunny@email.local"));
        //set useremailid
        u2.getUseremails().get(2).setUseremailid(13);

        // manually set ids
        u2.setUserid(2);

        // add u2 to array
        userList.add(u2);

        // user
        User u3 = new User("barnbarn",
            "ILuvM4th!",
            "barnbarn@lambdaschool.local");
        u3.getRoles()
            .add(new UserRoles(u3,
                r2));
        u3.getUseremails()
            .add(new Useremail(u3,
                "barnbarn@email.local"));
        //set useremailid
        u3.getUseremails().get(0).setUseremailid(11);

        // manually set ids
        u3.setUserid(3);

        // add u3 to array
        userList.add(u3);

        User u4 = new User("puttat",
            "password",
            "puttat@school.lambda");
        u4.getRoles()
            .add(new UserRoles(u4,
                r2));

        // manually set ids
        u4.setUserid(4);

        // add u4 to array
        userList.add(u4);



        User u5 = new User("misskitty",
            "password",
            "misskitty@school.lambda");
        u5.getRoles()
            .add(new UserRoles(u5,
                r2));
        // manually set ids
        u5.setUserid(5);

        // add u5 to array
        userList.add(u5);


        MockitoAnnotations.initMocks(this);
    }


    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void findUserById()
    {
    }

    @Test
    public void findByNameContaining()
    {
    }

    @Test
    public void findAll()
    {
    }

    @Test
    public void delete()
    {
    }

    @Test
    public void findByName()
    {
    }

    @Test
    public void save()
    {
    }

    @Test
    public void update()
    {
    }

    @Test
    public void deleteAll()
    {
    }
}