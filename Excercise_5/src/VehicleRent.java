package com.manage;
import java.util.Scanner;
import java.lang.reflect.Type;
import com.vehicles.Vehicle;

public class VehicleRent {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        com.manage.VehicleDetails vehicleDet= new com.manage.VehicleDetails();
        System.out.println("Car Rental Page");
        System.out.print("select model for rent:1, Ola 2,Uber");
        int vehicleType = input.nextInt();

        //conditions
        String brand ="";
        int seat=0;
        String type= "";


        switch (vehicleType){
            case 1:
                System.out.print("Select the brand of car:1,BMW 2,Swift");
                int choose = input.nextInt();
                if (choose==1){

                    brand="BMW";
                    System.out.print("Select the type of car:1, Nano 2,innova");
                    type=(input.nextInt()==1)?"A6":"audi";
                }else {
                    brand="honda";
                    System.out.print("Select the type of car:1,Q7 2,A7 ");
                    type=(input.nextInt()==1)?"Q2":"602";

                }
                break;
            case 2:
                System.out.print("Select the brand of car:1,Hyundai 2,Mini");
                brand = (input.nextInt()==1)?"Amaze":"F7";
                System.out.print("Select the no. of car seats:1,5 2,4");
                seatcount = (input.nextInt() ==1)?"5":"4";
                break;
        }

    }
}
