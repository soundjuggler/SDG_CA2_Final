/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @author adamk
 */
public class CKDonate {
    private String Name;
    private int Amount, Pin, CardNum;

    public CKDonate() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public void setPin(int Pin) {
        this.Pin = Pin;
    }

    public void setCardNum(int CardNum) {
        this.CardNum = CardNum;
    }

    public String getName() {
        return Name;
    }

    public int getAmount() {
        return Amount;
    }

    public int getPin() {
        return Pin;
    }

    public int getCardNum() {
        return CardNum;
    }
    
    public String printDetails(){
        return "Name: " + Name + 
               "\nAmount: " + Amount + 
               "\nPin: " + Pin + 
               "\nCard Number: " + CardNum;
    }
    
    
    
}
