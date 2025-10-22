package COS285Lab4;

import java.util.*;
import java.io.*;

/**Demonstrate the binary tree and its methods
 * @author Abby Pitcairn
 * @author Kaylee Hallett
 * @author Ella Hawkins
 * @version October 18, 2025
 */
public class Lab4 {
    
    /**Main method to run Lab 4. 
     * @param args - not applicable.
     */
    public static void main(String[] args) {
        
        // Create list of Integers from data file.
        List<Integer> data = loadNumbersFromFile(args[0]);

        // Create a new empty MyBinaryTree.
        MyBinaryTree<Integer> tree = new MyBinaryTree<>();
        
        // Add the data to the tree.
        tree.buildTree(data);

        // Test breadth-first search printing method
        System.out.println("\nHere is the tree printed in level order:");
        tree.bfsTree();
        System.out.println();

        // Test recursive search method
        System.out.println("Testing if 12 is in the tree: " + tree.recursiveSearch(12));
        System.out.println("Testing if 3 is in the tree: " + tree.recursiveSearch(3) + "\n");

    }

    /**Create a List of Integers from a given filepath with data
     * separated by new lines. 
     * @param filename - the path to the file
     * @return a List of Integers read from the file
     */
    public static List<Integer> loadNumbersFromFile(String filename) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
            numbers.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return numbers;
    }

}
