/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamblingmachine.cardpackage;

/**
 *
 * @author qbrickzx
 * @author Naruebet
 */
public class Card {
    public int number;
    public int dok;
    public String suit;
    public String result = "";
    public String resultPlayer = "";
    public String resultBot = "";

    public Card(boolean isHuman) {
        int randCard = (int) (Math.random() * 13) + 1;
        int randDok = (int) (Math.random() * 4) + 1;
        if (randCard == 1) {
            this.resultPlayer = "A";
            this.number = 1;
        } else if (randCard <= 10 && randCard >= 2) {
            this.resultPlayer = Integer.toString(randCard);
            this.number = (int) randCard;
        } else if (randCard > 10 && randCard <= 13) {
            switch (randCard) {
                case 11:
                    this.resultPlayer += "J";
                    this.number = 11;
                    break;
                case 12:
                    this.resultPlayer += "Q";
                    this.number = 12;
                    break;

                case 13:
                    this.resultPlayer += "K";
                    this.number = 13;
                    break;
                default:
                    break;

            }

        }
        if (randDok <= 4 && randDok >= 1) {
            switch (randDok) {
                case 1:
                    this.dok = 1;
                    this.suit = " Of Spades";
//                            return Card.result + " Of Spades";
                    this.resultPlayer = this.resultPlayer + " Of Spades";
                    if(isHuman){
                        System.out.println("Your card : " + this.resultPlayer);
                    }else{
                        System.out.println("Bot's got : " + this.resultPlayer);
                    }
                    break;

                case 2:
                    this.dok = 2;
                    this.suit = " Of Hearts";
//                            return Card.result + " Of Hearts";
                    this.resultPlayer = this.resultPlayer + " Of Hearts";
                    if(isHuman){
                        System.out.println("Your card : " + this.resultPlayer);
                    }else{
                        System.out.println("Bot's got : " + this.resultPlayer);
                    }
                    break;

                case 3:
                    this.dok = 3;
                    this.suit = " Of Diamonds";
//                            return Card.result + " Of Diamonds";
                    this.resultPlayer = this.resultPlayer + " Of Diamonds";
                    if(isHuman){
                        System.out.println("Your card : " + this.resultPlayer);
                    }else{
                        System.out.println("Bot's got : " + this.resultPlayer);
                    }
                    break;

                case 4:
                    this.dok = 4;
                    this.suit = " Of Clubs";
//                            return Card.result + " Of Clubs";
                    this.resultPlayer = this.resultPlayer + " Of Clubs";
                    if(isHuman){
                        System.out.println("Your card : " + this.resultPlayer);
                    }else{
                        System.out.println("Bot's got : " + this.resultPlayer);
                    }
                    
                    break;

//                        default:
//                            return null;
            }
                
        }
        

    }
    
    public String compare(Card x){
        if(x.number < this.number){
            System.out.print("You win with : "); 
            return this.resultPlayer;
        }else if(x.number > this.number){
            return "Sorry, betterluck next time!!";
        }else if(x.number == this.number){
            if(x.dok > this.dok){
               return "You Win!!";
            }else if(x.dok < this.dok){
                return "You Lose!!";
            }else{
                return "Draw!!";
            }
        }
        
        return "";
    }
    
}
