
package arrayinputoutput;

import java.util.Scanner;

public class ArrayInputOutput {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
            int[]hitung = new int[100]; 
            hitungArray(hitung); 
    }
    public static void hitungArray(int[] data){
        Scanner input = new Scanner(System.in);
        int x=0;            
        for(int i=0;i <data.length;i++){
            System.out.print("Masukkan data "+(i+1)+" : ");
            data[i]=input.nextInt();
            if (data[i]==-1){
                x=i;
                break;
            }
          }
        
        int maks=data[0];
        int min=data[0];
        for(int i=0;i<x;i++){
            if(data[i]>maks){
                maks=data[i];
            }
            else if(data[i]<min){
                min=data[i];
            }
            System.out.println(" ");
        }
        
        System.out.println("Nilai maks : "+ maks);
        System.out.println("Nilai min : "+ min);
        
     }
    
    
}



