package ru.forinnyy.tm.api.service;

import ru.forinnyy.tm.enumerated.Role;
import ru.forinnyy.tm.exception.field.AbstractFieldException;
import ru.forinnyy.tm.exception.user.AbstractUserException;
import ru.forinnyy.tm.model.User;

public interface IAuthService {

    User registry(String login, String password, String email) throws AbstractUserException, AbstractFieldException;

    void login(String login, String password) throws AbstractFieldException, AbstractUserException;

    void logout();

    boolean isAuth();

    String getUserId() throws AbstractUserException;

    User getUser() throws AbstractUserException, AbstractFieldException;

    void checkRoles(Role[] roles) throws AbstractUserException, AbstractFieldException;

}
