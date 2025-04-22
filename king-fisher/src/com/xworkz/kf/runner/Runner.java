package com.xworkz.kf.runner;

import com.xworkz.kf.internal.rule.IskconTempleImpl;
import com.xworkz.kf.internal.rule.Temple;

public class Runner {
    public static void main(String[] args) {
        Temple temple = new IskconTempleImpl();
        IskconTempleImpl iskcon =  new IskconTempleImpl();
        iskcon.slipper();
        iskcon.donation();
        iskcon.parking();

            }
        }
