/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaytester;

/**
 * Document class
 */
public class Document {

    //variable
    int words;

    /**
     * constructor 
     * PRE: none 
     * POST: A Document object created. Words initialized to 0.
     */
    public Document() {
        words = 0;        //default words
    }

    /**
     * Changes the number of document words. 
     * PRE: none 
     * POST: Words has been changed.
     */
    public void setWords(int numWords) {
        words = numWords;
    }

    /**
     * Calculates the number of pages. 
     * PRE: none 
     * POST: The number of pages has been returned.
     */
    public int calculatePages() {
        final int WORDS_PER_PAGE = 300;
        int pages;

        pages = words / WORDS_PER_PAGE;
        if (words % WORDS_PER_PAGE > 0) {
            pages += 1;
        }
        return (pages);
    }

    /**
     * Returns the number of words in a document. 
     * PRE: none 
     * POST: The number of document words has been returned.
     */
    public int getWords() {
        return (words);
    }
}
