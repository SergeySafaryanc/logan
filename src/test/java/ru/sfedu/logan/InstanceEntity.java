package ru.sfedu.logan;

import ru.sfedu.logan.entity.Role;
import ru.sfedu.logan.entity.User;

import java.util.Date;

public class InstanceEntity {
    public static final User usr1 = new User("em", "fn1", "ln1", "un1", new Date(), "pswd", Role.ROLE_ADMIN);
}
