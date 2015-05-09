/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Person.Staff;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Doctor extends Staff {

    private String researchArea;
    private Date officeHour;
    private String title;

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public Date getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(Date officeHour) {
        this.officeHour = officeHour;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getFullName();
    }
}
