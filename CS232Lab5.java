package cs232.lab.pkg5;

public class CS232Lab5 {

    public static void main(String[] args) {
        Die die1 = null, die2 = null, die3 = null, die4 = null, die5 = null;
        int n = 0;
        
        for(int i=0;i<5;++i){
            n = (int)(Math.random() * 6) + 0;
            
            switch(n){
                case 0:
                    n = 4;
                    break;
                case 1:
                    n = 6;
                    break;
                case 2:
                    n = 8;
                    break;
                case 3:
                    n = 10;
                    break;
                case 4:
                    n = 12;
                    break;
                case 5:
                    n = 20;
                    break;
                case 6:
                    n = 100;
                    break;
            }
            
            if(i == 0){
                die1 = new Die(n);
            }
            
            if(i == 1){
                die2 = new Die(n);
            }
            
            if(i == 2){
                die3 = new Die(n);
            }
            
            if(i == 3){
                die4 = new Die(n);
            }
            
            if(i == 4){
                die5 = new Die(n);
            }
        }
        
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
        
        System.out.println(die1);
        System.out.println(die2);
        System.out.println(die3);
        System.out.println(die4);
        System.out.println(die5);
    }
    
}
