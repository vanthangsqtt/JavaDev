/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner
/**
 *
 * @author MyPC
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập một số:");
        a = nhap.nextInt();
        String KQ="";
        if(a%2==0)
            KQ="Số chẵn";
        else
            KQ="Số lẻ";
        System.out.println("Số vừa nhập là: " +KQ);
                
    }
    
}
