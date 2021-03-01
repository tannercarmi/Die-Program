package cs232.lab.pkg5;

public class Die {
    
    // creates variables for current faceValue and the number of faces
    private int facevalue;
    private int numFaces;
    
    // constructor sets facevalue to 1 and takes n as an integer parameter for # of faces
    public Die(int n){
        this.numFaces = n;
        this.facevalue = 1;
    }
    
    // sets current faceValue to a random face of the die
    public int roll(){
        this.facevalue = (int)(Math.random() * numFaces) + 1;
        return facevalue;
    }
    
    // Sets facevalue to specified integer parameter
    public int SetFaceValue(int v){
        this.facevalue = v;
        return facevalue;
    }
    
    // returns current faceValue
    public int getFaceValue(){
        return facevalue;
    }
    
    // returns the total # of faces for the die
    public int getNumFaces(){
        return numFaces;
    }
    
    // toString representation of object
    @Override
    public String toString(){
        return "d" + numFaces + " = " + facevalue;
    }
    
}
