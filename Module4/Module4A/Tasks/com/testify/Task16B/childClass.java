package com.testify.Task16B;

public class childClass extends ParentClass {
        public static void main(String[] args) {
        childClass diet = new childClass();
        diet.carbs("Carbohydrate Diet sucks ");
        diet.Protein("Protein diet sucks ");

        }

        public void carbs(String type){
            System.out.println("No carbs today");
        }

        public void Protein(String type){
            System.out.println("Drink one protein shake today");
        }
}
