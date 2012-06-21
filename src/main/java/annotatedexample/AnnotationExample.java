package annotatedexample;

import java.util.ArrayList;

/**
 * This test class shows how to obtain All annotations.
 */


public class AnnotationExample {

    private int annotationExampleNumber;
    private MyTestClass mtc;
    private ArrayList<String> listOfStrings = new ArrayList<String>();

    public static void myMethod(String str, int i) {
    }

    public static void myMethod1(String str, int i) {
    }


    public static void myMethod2(Double d, int j) {

    }

    public int getAnnotationExampleNumber() {
        return annotationExampleNumber;
    }

    public void setAnnotationExampleNumber(int annotationExampleNumber) {
        this.annotationExampleNumber = annotationExampleNumber;
    }

}