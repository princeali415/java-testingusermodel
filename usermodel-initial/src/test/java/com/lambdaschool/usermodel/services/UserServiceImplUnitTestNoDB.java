package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplicationTesting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplicationTesting.class,
properties = {"command.line.runner.enabled=false"})
public class UserServiceImplUnitTestNoDB
{

    // Stubs -> fake methods
    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception
    {
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