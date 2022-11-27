package com.ue.insw.proyecto.exercises.ej3polimorfismo;

//todo extends shape
public class Circle extends Shape {
    private String color ;

    private int radio;

    private double pi;






    public Circle (String color, int radio, double pi){
        this.color=color;
        this.radio=radio;
        this.pi=3.1415;


    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int getRadio(){
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {this.pi =pi ;}

    public getCalculetPerimeter() {

        return pi * 2 * radio;
    }


    public double  CalculetArea() {
        return pi * (radio * radio;
    }

    public double getcalculatePerimeter() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public double calculateArea() {
        return 0;
    }

    public String toString() {
        return null;
    }


    // @Override
    //public String toString() {
      //  return "Rectangle{" +
        //        "color=" + color
          //      "radio= "
            //    "ladoCorto=" + lado1Corto
              //  "calculetPerimeter=" + calculetPerimeter
                //"caluletArea= " + calculetArea
                //"}";
   // }



}

}
