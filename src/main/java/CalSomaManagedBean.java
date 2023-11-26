/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author default
 */
@Named(value = "calSomaManagedBean")
@RequestScoped
public class CalSomaManagedBean {

   private int n1;
   private int n2;
   private int result;
   
   
    public CalSomaManagedBean() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
   
    public void resultSoma() {
        this.result = getN1() + getN2();
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
