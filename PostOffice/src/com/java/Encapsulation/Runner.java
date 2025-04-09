package com.java.Encapsulation;

import com.java.Encapsulation.internal.PostOfficeUser;
import com.java.Encapsulation.external.PostOfficeViewer;

public class Runner {
    public static void main(String[] args) {
        PostOfficeUser user = new PostOfficeUser();
        user.displayPostOffice();

        System.out.println();

        PostOfficeViewer viewer = new PostOfficeViewer();
        viewer.viewPostOffice();
    }
}
