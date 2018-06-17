package com.it;

import com.it.Helpers.CommonHelper;
import com.it.Helpers.DashboardHelper;
import com.it.Helpers.LoginHelper;
import com.it.Helpers.mailinatorHelper;

public class App {
  public   LoginHelper login;
  public   DashboardHelper dashboard;
  public   CommonHelper common;
  public mailinatorHelper mailinator;

    public App() {
        this.login = new LoginHelper();
        this.dashboard= new DashboardHelper();
        this.common= new CommonHelper();
        this.mailinator = new mailinatorHelper();
    }
}
