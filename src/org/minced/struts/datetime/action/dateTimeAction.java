package org.minced.struts.datetime.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 * Created by rob on 9/25/16.
 * From Web tutorial.
 * Unused.
 */
public class dateTimeAction extends ActionSupport{
    private Date currentDate;

    public String execute() throws Exception{
        setCurrentDate(new Date());
        return "success";
    }
    private void setCurrentDate(Date date){
        this.currentDate = date;
    }
    public Date getCurrentDate(){
        return currentDate;
    }

}
