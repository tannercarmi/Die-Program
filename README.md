# Die-Program
This program creates Die objects and rolls them for a random face value.

# This program is designed to create Die objects based on a Die class using the number of sides as a parameter for the object. The program includes the main driver code in the CS232Lab5.java class and the Die.java class to handle the Die objects.

# The CS232Lab5.java class starts out by creating 5 new Die objects named Die1, Die2, Die3, Die4, and Die5.

        // Creates new die objects
        Die die1 = null, die2 = null, die3 = null, die4 = null, die5 = null;
        
# A new integer variable 'n' is initialized and set to zero.

        // initializes int n for the die sides
        int n = 0;
        
# After the objects are created and 'i' is initialized, the program selects a random number of sided for each die object and then assigns them to each Die object using a "for" loop and switch

        // for loop that randomly sets the amount of sides for each die
        for(int i=0;i<5;++i){
            n = (int)(Math.random() * 6) + 0;
            
            switch(n){
                case 0:
                    n = 4; // sets 4 sided die
                    break;
                case 1:
                    n = 6; // sets 6 sided die
                    break;
                case 2:
                    n = 8; // sets 8 sided die
                    break;
                case 3:
                    n = 10; // sets 10 sided die
                    break;
                case 4:
                    n = 12; // sets 12 sided die
                    break;
                case 5:
                    n = 20; // sets 20 sided die
                    break;
                case 6:
                    n = 100; // sets 100 sided die
                    break;
            }
            
            // passes n as parameters to constructor for each die object
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
        
# Then the roll() method of each Die object is called to change the current face value.

        // uses the roll method for each die object
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
        
# Finally,the program displays the result from rolling the each Die object.

        // prints out toString of all die objects after roll()
        System.out.println(die1);
        System.out.println(die2);
        System.out.println(die3);
        System.out.println(die4);
        System.out.println(die5);
        
# The Die.java class is used for each Die object. It starts by initializing variables to represent the face value and number of faces named "faceValue" and "numFaces".

    // creates variables for current faceValue and the number of faces
    private int facevalue;
    private int numFaces;
    
# The constructor takes in an integer as parameters to use for the number of faces and sets the current face value to 1.

    // constructor sets facevalue to 1 and takes n as an integer parameter for # of faces
    public Die(int n){
        this.numFaces = n;
        this.facevalue = 1;
    }
    
# The roll method sets the face value to a random value within the range of the Die object's number of faces.

    // sets current faceValue to a random face of the die
    public int roll(){
        this.facevalue = (int)(Math.random() * numFaces) + 1;
        return facevalue;
    }
    
# The SetFaceValue method sets the current face alue to a specified integer. (Note: this is not used in the main program and is a placeholder for future use.)

    // Sets facevalue to specified integer parameter
    public int SetFaceValue(int v){
        this.facevalue = v;
        return facevalue;
    }
    
# The getFaceValue method is used to return the current face value of the Die. (Note: this is not used in the main program and is a placeholder for future use.)
    // returns current faceValue
    public int getFaceValue(){
        return facevalue;
    }
    
# The getNumFaces method retrieves the number of total faces of the Die. (Note: this is not used in the main program and is a placeholder for future use.)

    // returns the total # of faces for the die
    public int getNumFaces(){
        return numFaces;
    }
    
# The toString method is the representation of the Die object used when printing to the screen.

    // toString representation of object
    @Override
    public String toString(){
        return "d" + numFaces + " = " + facevalue;
    }
