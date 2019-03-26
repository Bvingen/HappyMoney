/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happymoney;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author bvingen
 */
public class HappyMoney {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String continueProgram = "j";
        while (continueProgram.equals("j")){
        Scanner Input = new Scanner(System.in);
        System.out.println("Hoe hoog is uw inkomen?");
        float inkomen = Input.nextFloat();
        System.out.println("Wat zijn uw maandelijkse Gas Water Licht kosten?");
        float gaswaterlict = Input.nextFloat();
        System.out.println("Hoe hoog is uw huur of hypotheek per maand?");
        float woonkosten = Input.nextFloat();
        System.out.println("Hoeveel besteedt u aan boodschappen?");
        float boodschappen = Input.nextFloat();
        System.out.println("Hoe kosten heeft u aan uw auto?");
        float autokosten = Input.nextFloat();
        System.out.println("Welke andere kosten zijn er nog, geef dit als geheel bedrag?");
        float overigekosten = Input.nextFloat();
        System.out.println("Uw inkomen van "+ NumberFormat.getCurrencyInstance().format(inkomen) + " wordt besteed aan de volgende posten:");
        System.out.println("Gas Water Licht: "+ NumberFormat.getCurrencyInstance().format(gaswaterlict));
        System.out.println("Woonlasten     : "+ NumberFormat.getCurrencyInstance().format(woonkosten));
        System.out.println("Boodschappen   :"+ NumberFormat.getCurrencyInstance().format(boodschappen));
        System.out.println("Auto Kosten    :"+ NumberFormat.getCurrencyInstance().format(autokosten));
        System.out.println("Overige Kosten :"+ NumberFormat.getCurrencyInstance().format(overigekosten));
        float HappyMoney = inkomen-gaswaterlict-woonkosten-boodschappen-autokosten-overigekosten;
        if (HappyMoney > 0){
            System.out.println("Uw Happy Money is:"+ NumberFormat.getCurrencyInstance().format(HappyMoney) );
            }
        else {
            System.out.println("Helaas u moet deze maand "+ NumberFormat.getCurrencyInstance().format(HappyMoney) + " bijleggen.");
        
            }
        System.out.println("Wilt u nog een berekening maken? j/n :");
        continueProgram = Input.next();
        }
    }
    }
    

