package com.charvai;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AgeCalculator {
        public static void main(String args[])
        {
            int nowYear;
            int birthYear;
            int yearsOld;
            GregorianCalendar now = new GregorianCalendar();
            birthYear=Integer.parseInt(JOptionPane.showInputDialog(null,"What year were you born?"));
            nowYear=now.get(Calendar.YEAR);
            yearsOld=nowYear - birthYear;
            JOptionPane.showMessageDialog(null,"Your age is "+yearsOld);
            System.exit(0);
        }
    }

