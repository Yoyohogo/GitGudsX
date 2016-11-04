/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaytester;

/**
 * Essay class
 * @author rodec8600
 */
public class Essay extends Document {

    //variables
    int MIN_WORDS;
    int MAX_WORDS;

    /**
     * Constructor 
     * PRE: none 
     * POST: an essay object is created
     */
    public Essay() {
        super();
        MIN_WORDS = 1500;
        MAX_WORDS = 3000;
    }

    /**
     * Determines whether the document is really an essay 
     * PRE: a word amount
     * PRE: prints true or false
     */
    public boolean validLength() {
        if (words >= 1500 && words <= 3000) {
            return true;
        } else {
            return false;
        }
    }

}
