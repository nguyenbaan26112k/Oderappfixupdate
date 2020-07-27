package com.example.oderappfixupdate;

public class CheckPass {
    public static boolean CheckPassword (String pass)
    {
        if (Checksize(pass)&&CheckSpecial(pass)&&CheckChar(pass)&&CheckNumber(pass))
            return true;
        else
            return false;
    }
    public static boolean Checksize (String pass)
    {
        if (pass.length()>8)
            return true;
        else
            return false;
    }
    public static boolean CheckChar(String pass)
    {
        if (pass.matches("(.*)[a-zA-Z](.*)"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean CheckNumber(String pass)
    {
        if (pass.matches("(.*)[0-9](.*)"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean CheckSpecial(String pass)
    {
        String Special = "/^[!@#$%^&*()_+-=[]{};:|,.<>/?]*$";
        int d = 0;
        for (int i = 0; i<pass.length() ;i++)
        {
            if (Special.indexOf(pass.charAt(i)) > 0)
            {
                d += 1;
            }
        }
        if (d>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
