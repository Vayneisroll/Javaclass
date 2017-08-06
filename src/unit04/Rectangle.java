/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit04;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class Rectangle {

    public float length;
    public int width;
    
    public float getArea() {
        float area;
        area = width * length;
        return area;
    }
    
    public float getBiggerArea(int factor) {
        float area = width * length;
        float biggerArea = factor * area;
        return biggerArea;
    }
    
    public String writeArea() {
        float areaAsAWord;
        areaAsAWord = getBiggerArea(2);
        return "The area is " + areaAsAWord;
    }
}
