/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package essaytester;

/**
 *
 * @author rodec8600
 */
public class Report extends Document{
    
//variables
    int MIN_WORDS;
    int MAX_WORDS;

    /**
     * Constructor 
     * PRE: none 
     * POST: an essay object is created
     */
    public Report() {
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
        if (words >= 1000 && words <= 2000) {
            return true;
        } else {
            return false;
        }
    }
}
