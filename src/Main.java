

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Common.Library;
import Controller.SearchProgramming;
import Model.Element;
import Common.Algorithm;
/**
 *
 * @author ADMIN
 */


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Algorithm algorithm = new Algorithm();
        Element element = new Element();

        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        element.setArray(library.createArray(element.getSize_array()));

        SearchProgramming searchProgramming = new SearchProgramming(element, library, algorithm);
        
        searchProgramming.run();
    }
}
