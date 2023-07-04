package com.gl.Interface;
import com.gl.model.*;

public interface ICredentials {
public String generateEmailAddress(String f_Name, String l_Name, String department);
public String generatePassword();
public void showCredentials(Employee emp);
}
